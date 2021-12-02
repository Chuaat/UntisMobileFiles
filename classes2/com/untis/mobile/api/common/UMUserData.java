// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import java.util.ArrayList;
import com.untis.mobile.api.enumeration.UMRight;
import com.untis.mobile.api.enumeration.ElementType;
import java.util.List;
import java.io.Serializable;

public class UMUserData implements Serializable
{
    public List<UMPerson> children;
    public long departmentId;
    public String displayName;
    public long elemId;
    public ElementType elemType;
    public List<Long> klassenIds;
    public List<UMRight> rights;
    public String schoolName;
    
    public UMUserData() {
        this.children = new ArrayList<UMPerson>();
        this.klassenIds = new ArrayList<Long>();
        this.rights = new ArrayList<UMRight>();
    }
}
