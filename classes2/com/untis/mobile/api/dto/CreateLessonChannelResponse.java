// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.error.UMError;
import java.util.List;
import com.untis.mobile.api.common.messenger.UMMessengerChannel;

public class CreateLessonChannelResponse
{
    public UMMessengerChannel channel;
    public List<UMError> errors;
    
    public CreateLessonChannelResponse() {
        this.errors = new ArrayList<UMError>();
    }
}
