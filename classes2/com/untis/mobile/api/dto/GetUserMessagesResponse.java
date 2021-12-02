// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.message.UMMessage;
import com.untis.mobile.api.enumeration.UMCrudRight;
import java.util.List;
import java.io.Serializable;

public class GetUserMessagesResponse implements Serializable
{
    public List<UMCrudRight> can;
    public List<UMMessage> messages;
    
    public GetUserMessagesResponse() {
        this.can = new ArrayList<UMCrudRight>();
    }
}
