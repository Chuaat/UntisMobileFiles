// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.masterdata;

import java.util.ArrayList;
import java.util.List;
import com.untis.mobile.api.enumeration.WeekDay;
import java.io.Serializable;

public class UMTimeGridDay implements Serializable
{
    public WeekDay day;
    public List<UMTimeGridDayUnit> units;
    
    public UMTimeGridDay() {
        this.units = new ArrayList<UMTimeGridDayUnit>();
    }
}
