// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.classreg;

import com.untis.mobile.api.enumeration.ElementType;
import java.io.Serializable;

public class UMClassRegEvent implements Serializable
{
    public String dateTime;
    public boolean delete;
    public long elementId;
    public ElementType elementType;
    public long eventReasonId;
    public long id;
    public String text;
    public boolean write;
}
