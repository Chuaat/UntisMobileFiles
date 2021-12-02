// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.classbook.lessontopic.LessonTopic;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/m;", "", "", "profileId", "", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;", "b", "", "id", "a", "Lkotlin/j2;", "d", "lessonTopic", "c", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface m
{
    @f
    LessonTopic a(@e final String p0, final long p1);
    
    @e
    List<LessonTopic> b(@e final String p0);
    
    void c(@e final String p0, @e final LessonTopic p1);
    
    void d(@e final String p0, final long p1);
}
