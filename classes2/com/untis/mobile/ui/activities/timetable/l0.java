// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k0;
import androidx.fragment.app.FragmentManager;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/l0;", "Landroidx/fragment/app/x;", "", "position", "Lcom/untis/mobile/ui/activities/timetable/WeeklyTimeTableFragment;", "b", "getCount", "", "fragment", "getItemPosition", "", "l", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "m", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "c", "()Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "e", "(Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;)V", "timeTableEntity", "", "o", "Z", "a", "()Z", "d", "(Z)V", "dontLoad", "Lcom/untis/mobile/ui/activities/timetable/v;", "n", "Lcom/untis/mobile/ui/activities/timetable/v;", "timeTableActivityService", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;Lcom/untis/mobile/ui/activities/timetable/v;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class l0 extends x
{
    @e
    private final String l;
    @e
    private TimeTableEntity m;
    @e
    private final v n;
    private boolean o;
    
    public l0(@e final FragmentManager fragmentManager, @e final String l, @e final TimeTableEntity m, @e final v n) {
        k0.p(fragmentManager, "fragmentManager");
        k0.p(l, "profileId");
        k0.p(m, "timeTableEntity");
        k0.p(n, "timeTableActivityService");
        super(fragmentManager);
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = true;
    }
    
    public final boolean a() {
        return this.o;
    }
    
    @e
    public WeeklyTimeTableFragment b(final int n) {
        if (n > 100) {
            this.o = false;
        }
        return WeeklyTimeTableFragment.X.a(this.l, this.m, this.n.Y0(n), n, this.o);
    }
    
    @e
    public final TimeTableEntity c() {
        return this.m;
    }
    
    public final void d(final boolean o) {
        this.o = o;
    }
    
    public final void e(@e final TimeTableEntity m) {
        k0.p(m, "<set-?>");
        this.m = m;
    }
    
    public int getCount() {
        return 500;
    }
    
    public int getItemPosition(@e final Object o) {
        k0.p(o, "fragment");
        if (o instanceof TimeTableFragment && ((TimeTableFragment)o).J() == -2) {
            return -2;
        }
        return super.getItemPosition(o);
    }
}
