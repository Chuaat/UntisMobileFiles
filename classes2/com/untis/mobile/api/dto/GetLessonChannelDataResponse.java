// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.messenger.UMLinkableMessengerChannel;
import com.untis.mobile.api.common.error.UMError;
import java.util.List;

public class GetLessonChannelDataResponse
{
    public List<UMError> errors;
    public List<UMLinkableMessengerChannel> linkableChannels;
    public String suggestedName;
    
    public GetLessonChannelDataResponse() {
        this.linkableChannels = new ArrayList<UMLinkableMessengerChannel>();
        this.errors = new ArrayList<UMError>();
    }
}
