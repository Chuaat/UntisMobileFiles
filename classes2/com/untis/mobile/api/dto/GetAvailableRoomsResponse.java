// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class GetAvailableRoomsResponse implements Serializable
{
    public List<Long> roomIds;
    
    public GetAvailableRoomsResponse() {
        this.roomIds = new ArrayList<Long>();
    }
}
