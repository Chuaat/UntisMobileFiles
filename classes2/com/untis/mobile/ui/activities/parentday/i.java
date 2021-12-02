// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.parentday;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k0;
import androidx.fragment.app.FragmentManager;
import org.joda.time.r;
import java.util.List;
import com.untis.mobile.persistence.models.parentday.ParentDay;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/ui/activities/parentday/i;", "Landroidx/fragment/app/x;", "", "position", "Lcom/untis/mobile/ui/activities/parentday/ParentDayAppointmentFragment;", "a", "getCount", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "m", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "parentDay", "", "Lorg/joda/time/r;", "n", "Ljava/util/List;", "days", "", "l", "Ljava/lang/String;", "profileId", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lcom/untis/mobile/persistence/models/parentday/ParentDay;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i extends x
{
    @e
    private final String l;
    @e
    private final ParentDay m;
    @e
    private final List<r> n;
    
    public i(@e final FragmentManager fragmentManager, @e final String l, @e final ParentDay m, @e final List<r> n) {
        k0.p(fragmentManager, "fragmentManager");
        k0.p(l, "profileId");
        k0.p(m, "parentDay");
        k0.p(n, "days");
        super(fragmentManager);
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    @e
    public ParentDayAppointmentFragment a(final int n) {
        return ParentDayAppointmentFragment.J.a(this.l, this.m, this.n.get(n));
    }
    
    public int getCount() {
        return this.n.size();
    }
}
