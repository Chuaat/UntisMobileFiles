// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.homework;

import org.joda.time.base.c;
import com.untis.mobile.utils.d0;
import org.joda.time.r;
import org.joda.time.l0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "", "getDisplayableDate", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class HomeWorkKt
{
    @e
    public static final String getDisplayableDate(@e final HomeWork homeWork) {
        k0.p(homeWork, "<this>");
        if (((c)homeWork.getStart()).C((l0)homeWork.getEnd())) {
            return d0.n(new r((l0)homeWork.getStart(), (l0)homeWork.getEnd()));
        }
        return d0.l(homeWork.getEnd());
    }
}
