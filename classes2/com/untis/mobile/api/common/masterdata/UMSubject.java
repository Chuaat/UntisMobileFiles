// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.masterdata;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class UMSubject implements Serializable
{
    public boolean active;
    public String backColor;
    public List<Long> departmentIds;
    public boolean displayAllowed;
    public String foreColor;
    public long id;
    public String longName;
    public String name;
    
    public UMSubject() {
        this.departmentIds = new ArrayList<Long>();
    }
}
