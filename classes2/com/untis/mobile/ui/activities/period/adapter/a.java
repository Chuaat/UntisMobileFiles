// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.period.adapter;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import androidx.fragment.app.FragmentManager;
import com.untis.mobile.ui.activities.period.t;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.List;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;
import androidx.fragment.app.r;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0019\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006 " }, d2 = { "Lcom/untis/mobile/ui/activities/period/adapter/a;", "Landroidx/fragment/app/r;", "", "position", "Lcom/untis/mobile/ui/activities/period/adapter/PeriodDetailFragment;", "a", "getCount", "", "periodId", "c", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "b", "d", "J", "selectedPeriodId", "Lcom/untis/mobile/persistence/models/profile/Profile;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/ui/activities/period/t;", "e", "Lcom/untis/mobile/ui/activities/period/t;", "periodDetailMethod", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "", "Ljava/util/List;", "periods", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;Lcom/untis/mobile/persistence/models/profile/Profile;Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;Ljava/util/List;JLcom/untis/mobile/ui/activities/period/t;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends r
{
    @e
    private final Profile a;
    @e
    private final TimeTableEntity b;
    @e
    private final List<Period> c;
    private final long d;
    @e
    private final t e;
    
    public a(@e final FragmentManager fragmentManager, @e final Profile a, @e final TimeTableEntity b, @e final List<Period> c, final long d, @e final t e) {
        k0.p(fragmentManager, "fragmentManager");
        k0.p(a, "profile");
        k0.p(b, "timeTableEntity");
        k0.p(c, "periods");
        k0.p(e, "periodDetailMethod");
        super(fragmentManager);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @e
    public PeriodDetailFragment a(final int n) {
        final long id = this.c.get(n).getId();
        return PeriodDetailFragment.l0.a(this.b, this.a, id, id == this.d, this.e);
    }
    
    @e
    public final Period b(final int n) {
        return this.c.get(n);
    }
    
    public final int c(final long n) {
        final Iterator<Period> iterator = this.c.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            if (n == iterator.next().getId()) {
                return n2;
            }
            ++n2;
        }
        n2 = -1;
        return n2;
    }
    
    public int getCount() {
        return this.c.size();
    }
}
