// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k0;
import androidx.fragment.app.FragmentManager;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.r;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/h;", "Landroidx/fragment/app/r;", "", "position", "Lcom/untis/mobile/ui/activities/classbook/ClassbookPageFragment;", "a", "getCount", "", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "b", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lcom/untis/mobile/persistence/models/timetable/period/Period;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends r
{
    @e
    private final String a;
    @e
    private final Period b;
    
    public h(@e final FragmentManager fragmentManager, @e final String a, @e final Period b) {
        k0.p(fragmentManager, "fragmentManager");
        k0.p(a, "profileId");
        k0.p(b, "period");
        super(fragmentManager, 1);
        this.a = a;
        this.b = b;
    }
    
    @e
    public ClassbookPageFragment a(final int n) {
        return ClassbookPageFragment.O.a(this.a, this.b, i.H.a(n));
    }
    
    public int getCount() {
        return i.values().length;
    }
}
