// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.api.legacy;

import androidx.annotation.k0;
import androidx.annotation.j0;
import com.untis.mobile.api.dto.legacy.JsonHomeWork;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.utils.mapper.common.b;

public class a extends b<HomeWork, JsonHomeWork>
{
    private static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    public static a i() {
        return com.untis.mobile.utils.mapper.api.legacy.a.a;
    }
    
    @k0
    public JsonHomeWork j(@j0 final HomeWork homeWork) {
        final JsonHomeWork jsonHomeWork = new JsonHomeWork();
        jsonHomeWork.id = homeWork.getId();
        jsonHomeWork.lessonId = homeWork.getLessonId();
        jsonHomeWork.startDate = ((org.joda.time.base.a)homeWork.getStart()).g4("yyyy-MM-dd");
        jsonHomeWork.endDate = ((org.joda.time.base.a)homeWork.getEnd()).g4("yyyy-MM-dd");
        jsonHomeWork.text = homeWork.getText().trim();
        jsonHomeWork.remark = homeWork.getRemark().trim();
        jsonHomeWork.completed = homeWork.getCompleted();
        return jsonHomeWork;
    }
}
