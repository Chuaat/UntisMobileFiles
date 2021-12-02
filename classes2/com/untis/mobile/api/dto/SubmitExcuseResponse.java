// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.error.UMError;
import java.util.List;
import com.untis.mobile.api.common.absence.UMStudentAbsence;
import java.io.Serializable;

public class SubmitExcuseResponse implements Serializable
{
    public UMStudentAbsence absence;
    public List<UMError> errors;
    
    public SubmitExcuseResponse() {
        this.errors = new ArrayList<UMError>();
    }
}
