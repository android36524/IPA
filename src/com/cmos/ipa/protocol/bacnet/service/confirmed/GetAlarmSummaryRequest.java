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
package com.cmos.ipa.protocol.bacnet.service.confirmed;

import com.cmos.ipa.protocol.bacnet.LocalDevice;
import com.cmos.ipa.protocol.bacnet.Network;
import com.cmos.ipa.protocol.bacnet.exception.BACnetException;
import com.cmos.ipa.protocol.bacnet.exception.NotImplementedException;
import com.cmos.ipa.protocol.bacnet.service.acknowledgement.AcknowledgementService;
import com.cmos.ipa.protocol.bacnet.type.constructed.Address;
import com.serotonin.util.queue.ByteQueue;

public class GetAlarmSummaryRequest extends ConfirmedRequestService {
    private static final long serialVersionUID = 7026623260581737268L;
    public static final byte TYPE_ID = 3;

    @Override
    public byte getChoiceId() {
        return TYPE_ID;
    }

    public GetAlarmSummaryRequest() {
        // no op
    }

    @Override
    public AcknowledgementService handle(LocalDevice localDevice, Address from, Network network) throws BACnetException {
        throw new NotImplementedException();
    }

    @Override
    public void write(ByteQueue queue) {
        // no op
    }

    GetAlarmSummaryRequest(@SuppressWarnings("unused") ByteQueue queue) {
        // no op
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }
}