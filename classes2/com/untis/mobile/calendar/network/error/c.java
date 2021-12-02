// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.error;

import kotlin.jvm.internal.k0;
import androidx.fragment.app.FragmentManager;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005" }, d2 = { "Lcom/untis/mobile/calendar/network/error/b;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lkotlin/j2;", "a", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class c
{
    public static final void a(@e final b b, @e final FragmentManager fragmentManager) {
        k0.p(b, "<this>");
        k0.p(fragmentManager, "fragmentManager");
        CalendarApiErrorDialog.h0.a(fragmentManager, b.a());
    }
}
