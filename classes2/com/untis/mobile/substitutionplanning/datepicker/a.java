// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.datepicker;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import androidx.fragment.app.FragmentManager;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.r;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/substitutionplanning/datepicker/a;", "Landroidx/fragment/app/r;", "", "getCount", "position", "Landroidx/fragment/app/Fragment;", "getItem", "Lkotlin/j2;", "a", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends r
{
    @e
    public static final a b;
    public static final int c = 100;
    public static final int d = 50;
    @e
    private final FragmentManager a;
    
    static {
        b = new a(null);
    }
    
    public a(@e final FragmentManager a) {
        k0.p(a, "fragmentManager");
        super(a, 1);
        this.a = a;
    }
    
    public final void a() {
        final List g0 = this.a.G0();
        k0.o(g0, "fragmentManager\n                .fragments");
        final Iterator<Object> iterator = v.c1(g0, DatePickerFragment.class).iterator();
        while (iterator.hasNext()) {
            iterator.next().G();
        }
    }
    
    public int getCount() {
        return 100;
    }
    
    @e
    public Fragment getItem(final int n) {
        return DatePickerFragment.L.a(n);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b" }, d2 = { "com/untis/mobile/substitutionplanning/datepicker/a$a", "", "", "MAX_COUNT", "I", "START_POSITION", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
