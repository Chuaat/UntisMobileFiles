// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.masterdata;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class UMTeacher implements Serializable
{
    public boolean active;
    public String backColor;
    public List<Long> departmentIds;
    public boolean displayAllowed;
    public String entryDate;
    public String exitDate;
    public String firstName;
    public String foreColor;
    public long id;
    public String lastName;
    public String name;
    
    public UMTeacher() {
        this.departmentIds = new ArrayList<Long>();
    }
}
