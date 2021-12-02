// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.datepicker;

import com.untis.mobile.substitutionplanning.model.DayStateDto;
import java.util.List;
import rx.g;
import org.jetbrains.annotations.e;
import org.joda.time.t;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0010" }, d2 = { "Lcom/untis/mobile/substitutionplanning/datepicker/b;", "", "", "position", "Lrx/g;", "", "Lcom/untis/mobile/substitutionplanning/model/DayStateDto;", "e", "Lorg/joda/time/t;", "date", "", "d", "Lkotlin/j2;", "b", "a", "c", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface b
{
    @e
    t a(final int p0);
    
    void b(@e final t p0);
    
    @e
    t c(final int p0);
    
    boolean d(@e final t p0);
    
    @e
    g<List<DayStateDto>> e(final int p0);
}
