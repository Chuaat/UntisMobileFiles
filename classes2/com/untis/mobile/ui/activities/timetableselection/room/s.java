// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetableselection.room;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import androidx.viewpager2.adapter.FragmentStateAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\r" }, d2 = { "Lcom/untis/mobile/ui/activities/timetableselection/room/s;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "position", "Landroidx/fragment/app/Fragment;", "j", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/s;", "lifecycle", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/s;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class s extends FragmentStateAdapter
{
    public s(@e final FragmentManager fragmentManager, @e final androidx.lifecycle.s s) {
        k0.p(fragmentManager, "fragmentManager");
        k0.p(s, "lifecycle");
        super(fragmentManager, s);
    }
    
    public int getItemCount() {
        return 2;
    }
    
    @e
    public Fragment j(final int n) {
        if (n == 0) {
            return RoomSelectionPageFragment.H.a();
        }
        return FreeRoomSelectionPageFragment.H.a();
    }
}
