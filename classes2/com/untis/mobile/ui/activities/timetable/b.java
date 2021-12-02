// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k0;
import androidx.fragment.app.FragmentManager;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/b;", "Landroidx/fragment/app/x;", "", "position", "Lcom/untis/mobile/ui/activities/timetable/TimeTableHeaderFragment;", "a", "getCount", "", "getPageWidth", "", "fragment", "getItemPosition", "", "l", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/ui/activities/timetable/v;", "m", "Lcom/untis/mobile/ui/activities/timetable/v;", "timeTableActivityService", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lcom/untis/mobile/ui/activities/timetable/v;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends x
{
    @e
    private final String l;
    @e
    private final v m;
    
    public b(@e final FragmentManager fragmentManager, @e final String l, @e final v m) {
        k0.p(fragmentManager, "fragmentManager");
        k0.p(l, "profileId");
        k0.p(m, "timeTableActivityService");
        super(fragmentManager);
        this.l = l;
        this.m = m;
    }
    
    @e
    public TimeTableHeaderFragment a(final int n) {
        return TimeTableHeaderFragment.L.a(this.l, this.m.Y0(n), n);
    }
    
    public int getCount() {
        return 500;
    }
    
    public int getItemPosition(@e final Object o) {
        k0.p(o, "fragment");
        if (o instanceof TimeTableHeaderFragment && ((TimeTableHeaderFragment)o).w() == -2) {
            return -2;
        }
        return super.getItemPosition(o);
    }
    
    public float getPageWidth(final int n) {
        if (!this.m.U0(n)) {
            return 0.0f;
        }
        return super.getPageWidth(n) / this.m.f1(n);
    }
}
