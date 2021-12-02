// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.masterdata;

import com.untis.mobile.api.enumeration.UMDutyType;
import java.io.Serializable;

public class UMDuty implements Serializable
{
    public long id;
    public String longName;
    public String name;
    public UMDutyType type;
}
