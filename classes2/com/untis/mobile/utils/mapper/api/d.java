// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.api;

import com.untis.mobile.utils.h0;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.classbook.lessontopic.LessonTopic;
import com.untis.mobile.api.common.timetable.UMLessonTopic;
import com.untis.mobile.utils.mapper.common.b;

public class d extends b<UMLessonTopic, LessonTopic>
{
    @j0
    private static final d a;
    
    static {
        a = new d();
    }
    
    private d() {
    }
    
    @j0
    public static d j() {
        return d.a;
    }
    
    @j0
    public LessonTopic i(@j0 final UMLessonTopic umLessonTopic) {
        return new LessonTopic(umLessonTopic.periodId, h0.f(umLessonTopic.text), b.c(umLessonTopic.startDateTime), b.c(umLessonTopic.endDateTime), com.untis.mobile.utils.mapper.api.b.j().g(h0.g(umLessonTopic.attachments)), true);
    }
}
