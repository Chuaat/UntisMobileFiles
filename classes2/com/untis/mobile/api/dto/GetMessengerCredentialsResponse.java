// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.messenger.UMMessengerSettings;
import com.untis.mobile.api.common.error.UMError;
import java.util.List;

public class GetMessengerCredentialsResponse
{
    public String authToken;
    public List<UMError> errors;
    public UMMessengerSettings settings;
    
    public GetMessengerCredentialsResponse() {
        this.errors = new ArrayList<UMError>();
    }
}
