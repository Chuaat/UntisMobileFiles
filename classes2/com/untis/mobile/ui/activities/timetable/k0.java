// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/k0;", "Landroidx/fragment/app/x;", "", "position", "Lcom/untis/mobile/ui/activities/timetable/WeeklyTimeTableHeaderFragment;", "a", "getCount", "", "fragment", "getItemPosition", "", "l", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/ui/activities/timetable/v;", "m", "Lcom/untis/mobile/ui/activities/timetable/v;", "timeTableActivityService", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lcom/untis/mobile/ui/activities/timetable/v;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k0 extends x
{
    @e
    private final String l;
    @e
    private final v m;
    
    public k0(@e final FragmentManager fragmentManager, @e final String l, @e final v m) {
        kotlin.jvm.internal.k0.p(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.k0.p(l, "profileId");
        kotlin.jvm.internal.k0.p(m, "timeTableActivityService");
        super(fragmentManager, 1);
        this.l = l;
        this.m = m;
    }
    
    @e
    public WeeklyTimeTableHeaderFragment a(final int n) {
        return WeeklyTimeTableHeaderFragment.M.a(this.l, this.m.Y0(n), n);
    }
    
    public int getCount() {
        return 500;
    }
    
    public int getItemPosition(@e final Object o) {
        kotlin.jvm.internal.k0.p(o, "fragment");
        if (o instanceof WeeklyTimeTableHeaderFragment && ((WeeklyTimeTableHeaderFragment)o).v() == -2) {
            return -2;
        }
        return super.getItemPosition(o);
    }
}
