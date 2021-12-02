// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.UMMessageOfDay;
import java.util.List;

public class GetMessagesOfDayResponse
{
    public List<UMMessageOfDay> messages;
    
    public GetMessagesOfDayResponse() {
        this.messages = new ArrayList<UMMessageOfDay>();
    }
}
