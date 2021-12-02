// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.booking;

import com.untis.mobile.ui.fragments.common.UmFragment;
import com.untis.mobile.ui.fragments.booking.AvailableRoomFragment;
import com.untis.mobile.ui.fragments.booking.ChangeRoomFragment;
import com.untis.mobile.ui.fragments.booking.AddRoomFragment;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k0;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Room;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.booking.RoomChangeData;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.r;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\fB?\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR&\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001e" }, d2 = { "Lcom/untis/mobile/ui/activities/booking/h;", "Landroidx/fragment/app/r;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "c", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "roomChangeData", "", "a", "Ljava/lang/String;", "profileId", "Ljava/util/ArrayList;", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "availableRooms", "", "b", "J", "periodId", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;JLcom/untis/mobile/persistence/models/booking/RoomChangeData;Ljava/util/ArrayList;)V", "e", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends r
{
    @e
    public static final a e;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    @e
    private final String a;
    private final long b;
    @e
    private final RoomChangeData c;
    @e
    private final ArrayList<Room> d;
    
    static {
        e = new a(null);
    }
    
    public h(@e final FragmentManager fragmentManager, @e final String a, final long b, @e final RoomChangeData c, @e final ArrayList<Room> d) {
        k0.p(fragmentManager, "supportFragmentManager");
        k0.p(a, "profileId");
        k0.p(c, "roomChangeData");
        k0.p(d, "availableRooms");
        super(fragmentManager);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int getCount() {
        return 3;
    }
    
    @e
    public Fragment getItem(final int n) {
        UmFragment umFragment;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new IllegalStateException("page count does not comply with implemented fragments");
                }
                umFragment = AddRoomFragment.M.a(this.a, this.b, this.c);
            }
            else {
                umFragment = ChangeRoomFragment.L.a(this.a, this.b, this.c);
            }
        }
        else {
            umFragment = AvailableRoomFragment.I.a(this.a, this.d);
        }
        return umFragment;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n" }, d2 = { "com/untis/mobile/ui/activities/booking/h$a", "", "", "PAGES", "I", "PAGE_ADD_ROOM", "PAGE_AVAILABLE_ROOMS", "PAGE_CHANGE_ROOM", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
