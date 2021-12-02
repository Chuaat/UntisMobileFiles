// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.HashSet;
import java.util.Set;

public class SubmitRoomChangeRequest extends AuthenticatedRequest
{
    public long orgRoomId;
    public Set<Long> periodIds;
    public long roomId;
    
    public SubmitRoomChangeRequest() {
        this.periodIds = new HashSet<Long>();
    }
}
