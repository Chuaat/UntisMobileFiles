// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.error.UMError;
import java.util.List;
import java.io.Serializable;

public class GetRoomChangeDataResponse implements Serializable
{
    public List<Long> availableRoomIds;
    public List<UMError> errors;
    
    public GetRoomChangeDataResponse() {
        this.errors = new ArrayList<UMError>();
        this.availableRoomIds = new ArrayList<Long>();
    }
}
