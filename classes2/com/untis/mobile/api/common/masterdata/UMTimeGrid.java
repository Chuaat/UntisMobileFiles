// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.masterdata;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class UMTimeGrid implements Serializable
{
    public List<UMTimeGridDay> days;
    
    public UMTimeGrid() {
        this.days = new ArrayList<UMTimeGridDay>();
    }
}
