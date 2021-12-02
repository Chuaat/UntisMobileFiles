// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H&J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/o;", "", "", "profileId", "", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "b", "", "id", "a", "periodInfo", "Lkotlin/j2;", "c", "d", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface o
{
    @f
    PeriodInfo a(@e final String p0, final long p1);
    
    @e
    List<PeriodInfo> b(@e final String p0);
    
    void c(@e final String p0, @e final PeriodInfo p1);
    
    void d(@e final String p0, final long p1);
}
