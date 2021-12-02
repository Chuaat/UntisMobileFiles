// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.HashSet;
import java.util.Set;

public class GetRoomChangeDataRequest extends AuthenticatedRequest
{
    public Set<Long> periodIds;
    
    public GetRoomChangeDataRequest() {
        this.periodIds = new HashSet<Long>();
    }
}
