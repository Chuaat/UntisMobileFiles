// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.timetable.UMPeriod;
import com.untis.mobile.api.common.error.UMError;
import java.util.List;
import java.io.Serializable;

public class SubmitRoomChangeResponse implements Serializable
{
    public List<UMError> errors;
    public List<UMPeriod> periods;
    
    public SubmitRoomChangeResponse() {
        this.errors = new ArrayList<UMError>();
        this.periods = new ArrayList<UMPeriod>();
    }
}
