// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.HashMap;
import java.util.ArrayList;
import com.untis.mobile.api.common.timetable.UMLesson;
import java.util.Map;
import com.untis.mobile.api.common.classreg.UMHomeWork;
import java.util.List;
import java.io.Serializable;

public class GetHomeWorkResponse implements Serializable
{
    public List<UMHomeWork> homeWorks;
    public Map<Long, UMLesson> lessonsById;
    
    public GetHomeWorkResponse() {
        this.homeWorks = new ArrayList<UMHomeWork>();
        this.lessonsById = new HashMap<Long, UMLesson>();
    }
}
