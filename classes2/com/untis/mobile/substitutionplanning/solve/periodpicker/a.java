// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.solve.periodpicker;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import kotlin.collections.t0;
import kotlin.collections.v;
import kotlin.ranges.k;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import android.content.Context;
import com.untis.mobile.substitutionplanning.model.PeriodConflictDto;
import java.util.List;
import org.jetbrains.annotations.e;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import androidx.fragment.app.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006 " }, d2 = { "Lcom/untis/mobile/substitutionplanning/solve/periodpicker/a;", "Landroidx/fragment/app/x;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "", "getPageWidth", "", "object", "getItemPosition", "Lkotlin/j2;", "a", "m", "F", "minWidth", "", "Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "n", "Ljava/util/List;", "periodConflicts", "Landroidx/fragment/app/FragmentManager;", "l", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroid/content/Context;", "context", "parentWidth", "periodConflictDtos", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;FLjava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends x
{
    @e
    private final FragmentManager l;
    private final float m;
    @e
    private final List<PeriodConflictDto> n;
    
    public a(@e final Context context, @e final FragmentManager l, final float n, @e final List<PeriodConflictDto> list) {
        k0.p(context, "context");
        k0.p(l, "fragmentManager");
        k0.p(list, "periodConflictDtos");
        super(l, 1);
        this.l = l;
        this.m = context.getResources().getDimension(2131165639) / n;
        int intValue;
        if (list.isEmpty()) {
            intValue = 0;
        }
        else {
            final ArrayList<Integer> list2 = new ArrayList<Integer>();
            final Iterator<PeriodConflictDto> iterator = (Iterator<PeriodConflictDto>)list.iterator();
            while (iterator.hasNext()) {
                final Integer unitOfDay = iterator.next().getUnitOfDay();
                if (unitOfDay != null) {
                    list2.add(unitOfDay);
                }
            }
            final Iterator<Number> iterator2 = list2.iterator();
            if (!iterator2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Number n2 = iterator2.next();
            while (iterator2.hasNext()) {
                final int intValue2 = iterator2.next().intValue();
                int intValue3 = n2.intValue();
                if (intValue2 > intValue3) {
                    intValue3 = intValue2;
                }
                n2 = intValue3;
            }
            intValue = n2.intValue();
        }
        int n3 = intValue;
        if (intValue < 8) {
            n3 = 8;
        }
        final k k = new k(1, n3);
        final ArrayList n4 = new ArrayList<PeriodConflictDto>(v.Y((Iterable<?>)k, 10));
        final Iterator<? extends T> iterator3 = ((Iterable<? extends T>)k).iterator();
    Label_0252:
        while (iterator3.hasNext()) {
            final int b = ((t0)iterator3).b();
            while (true) {
                for (final PeriodConflictDto next : list) {
                    final Integer unitOfDay2 = next.getUnitOfDay();
                    boolean b2 = false;
                    Label_0335: {
                        if (unitOfDay2 != null) {
                            if (b == unitOfDay2) {
                                b2 = true;
                                break Label_0335;
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        n4.add((PeriodConflictDto)next);
                        continue Label_0252;
                    }
                }
                PeriodConflictDto next = null;
                continue;
            }
        }
        this.n = (List<PeriodConflictDto>)n4;
    }
    
    public final void a() {
        final List g0 = this.l.G0();
        k0.o(g0, "fragmentManager\n                .fragments");
        final Iterator<Object> iterator = v.c1(g0, ConflictSolutionPeriodFragment.class).iterator();
        while (iterator.hasNext()) {
            iterator.next().D();
        }
    }
    
    public int getCount() {
        return this.n.size();
    }
    
    @e
    public Fragment getItem(final int n) {
        return ConflictSolutionPeriodFragment.J.a(n + 1, this.n.get(n));
    }
    
    public int getItemPosition(@e final Object o) {
        k0.p(o, "object");
        return -2;
    }
    
    public float getPageWidth(int n) {
        final float pageWidth = super.getPageWidth(n);
        if (this.getCount() < 2) {
            return pageWidth;
        }
        final int count = this.getCount();
        float n2 = pageWidth;
        if (3 <= count) {
            n2 = pageWidth;
            n = 3;
            while (true) {
                final float n3 = pageWidth / n;
                if (n3 < this.m && n != 3) {
                    break;
                }
                if (n == count) {
                    n2 = n3;
                    break;
                }
                ++n;
                n2 = n3;
            }
        }
        return n2;
    }
}
