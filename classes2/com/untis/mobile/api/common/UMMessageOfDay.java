// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import java.util.List;
import java.io.Serializable;

public class UMMessageOfDay implements Serializable
{
    public List<UMDriveFileDescriptor> attachments;
    public String body;
    public long id;
    public String subject;
}
