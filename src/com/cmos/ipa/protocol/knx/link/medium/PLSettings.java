/*
    Calimero 2 - A library for KNX network access
    Copyright (c) 2006, 2016 B. Malinowsky

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

    Linking this library statically or dynamically with other modules is
    making a combined work based on this library. Thus, the terms and
    conditions of the GNU General Public License cover the whole
    combination.

    As a special exception, the copyright holders of this library give you
    permission to link this library with independent modules to produce an
    executable, regardless of the license terms of these independent
    modules, and to copy and distribute the resulting executable under terms
    of your choice, provided that you also meet, for each linked independent
    module, the terms and conditions of the license of that module. An
    independent module is a module which is not derived from or based on
    this library. If you modify this library, you may extend this exception
    to your version of the library, but you are not obligated to do so. If
    you do not wish to do so, delete this exception statement from your
    version.
*/

package com.cmos.ipa.protocol.knx.link.medium;

import com.cmos.ipa.protocol.knx.IndividualAddress;
import com.cmos.ipa.protocol.knx.exception.KNXIllegalArgumentException;

/**
 * Provides settings necessary for communication on power-line 110 (PL110) transmission medium.
 *
 * @author B. Malinowsky
 */
public class PLSettings extends KNXMediumSettings
{
	private static final byte[] broadcastDomain = new byte[2];

	private byte[] doa;
	private final boolean pl132;

	/**
	 * Creates a new default container with settings for PL110 medium, with the device address
	 * initialized to 0.0.0 and domain address set to broadcast domain.
	 */
	public PLSettings()
	{
		super(null);
		pl132 = false;
		doa = broadcastDomain;
	}

	/**
	 * Creates a new settings container with medium information for PL110.
	 *
	 * @param device individual device address to use as source address in KNX messages, specifying
	 *        <code>null</code> uses the individual address 0.0.0
	 * @param domain byte array containing the domain address to use in KNX messages, address is
	 *        given in network byte order, <code>domain.length</code> = 2, supplying
	 *        <code>null</code> defaults to the broadcast domain
	 */
	public PLSettings(final IndividualAddress device, final byte[] domain)
	{
		super(device);
		pl132 = false;
		setDomainAddress(domain);
	}

	/**
	 * @deprecated
	 * @param device individual device address to use as source address in KNX messages, specifying
	 *        <code>null</code> uses the individual address 0.0.0
	 * @param domain byte array containing the domain address to use in KNX messages, address is
	 *        given in network byte order, <code>domain.length</code> = 2, supplying
	 *        <code>null</code> defaults to the broadcast domain
	 * @param mediumPL132 <code>true</code> if communicating on PL132, <code>false</code> if
	 *        communicating on PL110
	 */
	public PLSettings(final IndividualAddress device, final byte[] domain,
		final boolean mediumPL132)
	{
		super(device);
		pl132 = mediumPL132;
		setDomainAddress(domain);
	}

	/**
	 * @deprecated
	 * @param mediumPL132 <code>true</code> if communicating on PL132, <code>false</code> if
	 *        communicating on PL110
	 */
	public PLSettings(final boolean mediumPL132)
	{
		super(null);
		pl132 = mediumPL132;
		doa = broadcastDomain;
	}

	/**
	 * Sets a new domain address.
	 * <p>
	 *
	 * @param domain byte array containing the domain address to use in KNX messages, address is
	 *        given in network byte order, <code>domain.length</code> = 2, supplying
	 *        <code>null</code> defaults to the broadcast domain
	 */
	public final synchronized void setDomainAddress(final byte[] domain)
	{
		if (domain == null)
			doa = broadcastDomain;
		else if (domain.length != 2)
			throw new KNXIllegalArgumentException("invalid length of domain address");
		else
			doa = (byte[]) domain.clone();
	}

	/**
	 * Returns the domain address.
	 * <p>
	 * The address is returned in network byte order.
	 *
	 * @return domain address as byte array of length = 2
	 */
	public final synchronized byte[] getDomainAddress()
	{
		return (byte[]) doa.clone();
	}

	/* (non-Javadoc)
	 * @see tuwien.auto.calimero.link.medium.KNXMediumSettings#getMedium()
	 */
	public int getMedium()
	{
		return MEDIUM_PL110;
	}

	/**
	 * Returns whether settings are for communication on PL132 medium or PL110 medium.
	 * <p>
	 *
	 * @return <code>true</code> for PL132, <code>false</code> for PL110
	 */
	public final boolean isPL132()
	{
		return pl132;
	}

	public String toString()
	{
		return super.toString() + " in domain 0x"
				+ Integer.toHexString((doa[0] & 0xff) << 8 | doa[1] & 0xff);
	}
}
