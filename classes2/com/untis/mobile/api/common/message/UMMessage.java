// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.message;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class UMMessage implements Serializable
{
    public String body;
    public String dateTime;
    public String expirationDate;
    public long id;
    public boolean read;
    public List<String> receivers;
    public String sender;
    public String subject;
    
    public UMMessage() {
        this.receivers = new ArrayList<String>();
    }
}
