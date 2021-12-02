// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.booking;

import android.app.Activity;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import com.untis.mobile.c;
import android.widget.ListView;
import n6.l;
import java.util.List;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import androidx.fragment.app.d;
import android.content.Intent;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import kotlin.jvm.internal.k0;
import android.view.View;
import android.widget.AdapterView;
import android.content.Context;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Room;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/ui/fragments/booking/AvailableRoomFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/os/Bundle;", "save", "Lkotlin/j2;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onCreateView", "outState", "onSaveInstanceState", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Ljava/util/ArrayList;", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "availableRooms", "<init>", "()V", "I", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AvailableRoomFragment extends UmFragment
{
    @e
    public static final a I;
    @e
    private static final String J = "blue";
    @e
    private static final String K = "red";
    private Profile G;
    private ArrayList<Room> H;
    
    static {
        I = new a(null);
    }
    
    private static final void s(final Context context, final AvailableRoomFragment availableRoomFragment, final h h, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(context, "$it");
        k0.p(availableRoomFragment, "this$0");
        k0.p(h, "$adapter");
        final TimeTableActivity.a l = TimeTableActivity.L;
        final Profile g = availableRoomFragment.G;
        if (g != null) {
            final Intent e = l.e(context, g, new TimeTableEntity(EntityType.ROOM, h.b(n).getId(), false, 0, 0L, null, 60, null));
            e.setFlags(805339136);
            final d activity = availableRoomFragment.getActivity();
            if (activity != null) {
                ((Activity)activity).startActivity(e);
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f Bundle arguments) {
        super.onCreate(arguments);
        final j0 g = j0.G;
        Bundle arguments2;
        if (arguments == null) {
            arguments2 = this.getArguments();
        }
        else {
            arguments2 = arguments;
        }
        k0.m(arguments2);
        final String string = arguments2.getString("blue", "");
        k0.o(string, "save\n                ?: arguments)!!.getString(BUNDLE_PROFILE_ID, \"\")");
        Profile l;
        if ((l = g.l(string)) == null) {
            l = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        this.G = l;
        if (arguments == null) {
            arguments = this.getArguments();
        }
        k0.m(arguments);
        ArrayList<Room> parcelableArrayList;
        if ((parcelableArrayList = (ArrayList<Room>)arguments.getParcelableArrayList("red")) == null) {
            parcelableArrayList = new ArrayList<Room>();
        }
        this.H = parcelableArrayList;
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493072, viewGroup, false);
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return null;
        }
        final ArrayList<Room> h = this.H;
        if (h != null) {
            final h adapter = new h((Context)o, h, false, null, 12, null);
            final ListView listView = (ListView)inflate.findViewById(c.i.fn);
            listView.setAdapter((ListAdapter)adapter);
            listView.setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.fragments.booking.f((Context)o, this, adapter));
            return inflate;
        }
        k0.S("availableRooms");
        throw null;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("blue", g.getUniqueId());
        final ArrayList<Room> h = this.H;
        if (h != null) {
            bundle.putParcelableArrayList("red", (ArrayList)h);
            return;
        }
        k0.S("availableRooms");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f" }, d2 = { "com/untis/mobile/ui/fragments/booking/AvailableRoomFragment$a", "", "", "profileId", "Ljava/util/ArrayList;", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "Lkotlin/collections/ArrayList;", "availableRooms", "Lcom/untis/mobile/ui/fragments/booking/AvailableRoomFragment;", "a", "BUNDLE_AVAILEABLE_ROOMS", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final AvailableRoomFragment a(@e final String s, @e final ArrayList<Room> list) {
            k0.p(s, "profileId");
            k0.p(list, "availableRooms");
            final AvailableRoomFragment availableRoomFragment = new AvailableRoomFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("blue", s);
            arguments.putParcelableArrayList("red", (ArrayList)list);
            availableRoomFragment.setArguments(arguments);
            return availableRoomFragment;
        }
    }
}
