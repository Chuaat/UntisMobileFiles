// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.add;

import org.jetbrains.annotations.e;
import com.untis.wu.rest.model.TeacherRefDto;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0006H&¨\u0006\t" }, d2 = { "Lcom/untis/mobile/substitutionplanning/add/c1;", "", "", "Lcom/untis/wu/rest/model/TeacherRefDto;", "d", "teacher", "Lkotlin/j2;", "f", "c", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface c1
{
    void c();
    
    @e
    List<TeacherRefDto> d();
    
    void f(@e final TeacherRefDto p0);
}
