// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.classreg;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class UMSeatingPlan implements Serializable
{
    public long id;
    public String name;
    public int numberOfColumns;
    public int numberOfRows;
    public List<UMSeatingPlanStudent> students;
    
    public UMSeatingPlan() {
        this.students = new ArrayList<UMSeatingPlanStudent>();
    }
}
