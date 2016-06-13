/*
 * ============================================================================
 * GNU General Public License
 * ============================================================================
 *
 * Copyright (C) 2006-2011 Serotonin Software Technologies Inc. http://serotoninsoftware.com
 * @author Matthew Lohbihler
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * When signing a commercial license with Serotonin Software Technologies Inc.,
 * the following extension to GPL is made. A special exception to the GPL is 
 * included to allow you to distribute a combined work that includes BAcnet4J 
 * without being obliged to provide the source code for any proprietary components.
 */
package com.cmos.ipa.protocol.bacnet.exception;

import com.cmos.ipa.protocol.bacnet.apdu.Error;
import com.cmos.ipa.protocol.bacnet.type.constructed.BACnetError;

public class ErrorAPDUException extends BACnetException {
    private static final long serialVersionUID = -1;

    private final Error apdu;

    public ErrorAPDUException(Error apdu) {
        super(apdu.toString());
        this.apdu = apdu;
    }

    public Error getApdu() {
        return apdu;
    }

    public BACnetError getBACnetError() {
        return apdu.getError().getError();
    }
}