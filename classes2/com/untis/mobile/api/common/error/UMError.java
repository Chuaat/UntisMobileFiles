// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.error;

import java.io.Serializable;

public class UMError implements Serializable
{
    public String code;
    public String details;
    public UMErrorMetaData meta;
    public Serializable source;
    public String title;
}
