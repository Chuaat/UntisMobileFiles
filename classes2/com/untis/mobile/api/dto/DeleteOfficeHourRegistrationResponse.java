// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.error.UMError;
import java.util.List;

public class DeleteOfficeHourRegistrationResponse
{
    public List<UMError> errors;
    
    public DeleteOfficeHourRegistrationResponse() {
        this.errors = new ArrayList<UMError>();
    }
}
