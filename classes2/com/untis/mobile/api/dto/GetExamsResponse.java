// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.enumeration.ElementType;
import com.untis.mobile.api.common.classreg.UMExam;
import java.util.List;
import java.io.Serializable;

public class GetExamsResponse implements Serializable
{
    public List<UMExam> exams;
    public long id;
    public ElementType type;
    
    public GetExamsResponse() {
        this.exams = new ArrayList<UMExam>();
    }
}
