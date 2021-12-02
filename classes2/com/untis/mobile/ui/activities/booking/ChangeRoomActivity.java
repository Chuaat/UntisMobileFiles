// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.booking;

import androidx.activity.ComponentActivity;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.view.MenuItem;
import android.content.Context;
import com.untis.mobile.utils.g0;
import android.os.Build$VERSION;
import java.util.Set;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import android.os.Bundle;
import rx.functions.p;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.tabs.TabLayout$i;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a0;
import com.untis.mobile.persistence.models.booking.ValidationError;
import androidx.viewpager.widget.ViewPager;
import androidx.fragment.app.Fragment;
import com.untis.mobile.ui.fragments.booking.AvailableRoomFragment;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import com.untis.mobile.ui.activities.views.NonSwipeableViewPager;
import com.google.android.material.tabs.TabLayout;
import com.untis.mobile.c;
import com.untis.mobile.ui.dialogs.ValidationErrorDialog;
import android.util.Log;
import java.util.Comparator;
import kotlin.collections.v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.k0;
import rx.g;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.untis.mobile.persistence.models.masterdata.Room;
import java.util.ArrayList;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.booking.RoomChangeData;
import com.untis.mobile.services.booking.a;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u0010)¨\u0006/" }, d2 = { "Lcom/untis/mobile/ui/activities/booking/ChangeRoomActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "z", "H", "J", "y", "", "message", "I", "Landroid/os/Bundle;", "save", "onCreate", "outState", "onSaveInstanceState", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "G", "Ljava/lang/String;", "profileId", "Ljava/util/ArrayList;", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "Lkotlin/collections/ArrayList;", "K", "Ljava/util/ArrayList;", "availableRooms", "Lcom/untis/mobile/analytics/base/b;", "L", "Lkotlin/b0;", "x", "()Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Lcom/untis/mobile/services/booking/a;", "Lcom/untis/mobile/services/booking/a;", "bookingService", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "roomChangeData", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "<init>", "()V", "M", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ChangeRoomActivity extends b
{
    @e
    public static final a M;
    @e
    private static final String N = "birdsOfParadies";
    @e
    private static final String O = "blackLotus";
    @e
    private static final String P = "cityOfBrass";
    @e
    private static final String Q = "wastelands";
    private String G;
    private Period H;
    private com.untis.mobile.services.booking.a I;
    @f
    private RoomChangeData J;
    @f
    private ArrayList<Room> K;
    @e
    private final b0 L;
    
    static {
        M = new a(null);
    }
    
    public ChangeRoomActivity() {
        this.L = d0.c((n6.a<?>)new n6.a<com.untis.mobile.analytics.base.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.analytics.base.b invoke() {
                return (com.untis.mobile.analytics.base.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.analytics.base.b.class), null, null);
            }
        });
    }
    
    private static final g A(final Throwable t) {
        return g.U2((Object)new RoomChangeData());
    }
    
    private static final RoomChangeData B(final ChangeRoomActivity changeRoomActivity, final RoomChangeData j) {
        k0.p(changeRoomActivity, "this$0");
        return changeRoomActivity.J = j;
    }
    
    private static final List C(final ChangeRoomActivity changeRoomActivity, final List c) {
        k0.p(changeRoomActivity, "this$0");
        final ArrayList<Object> k = new ArrayList<Object>(c);
        v.p0(k, com.untis.mobile.ui.activities.booking.a.G);
        changeRoomActivity.K = (ArrayList<Room>)k;
        return c;
    }
    
    private static final int D(final Room room, final Room room2) {
        return com.untis.mobile.utils.comparator.b.G.b(room.getDisplayableTitle(), room2.getDisplayableTitle());
    }
    
    private static final void E(final Object o) {
    }
    
    private static final void F(final ChangeRoomActivity changeRoomActivity, final Throwable t) {
        k0.p(changeRoomActivity, "this$0");
        Log.e("untis_log", "error while loading stuff", t);
        changeRoomActivity.y();
    }
    
    private static final void G(final ChangeRoomActivity changeRoomActivity) {
        k0.p(changeRoomActivity, "this$0");
        changeRoomActivity.H();
        changeRoomActivity.y();
    }
    
    private final void H() {
        final RoomChangeData j = this.J;
        if (j == null || this.K == null) {
            return;
        }
        k0.m(j);
        final List<ValidationError> validationErrors = j.getValidationErrors();
        k0.o(validationErrors, "roomChangeData!!.validationErrors");
        if (validationErrors.isEmpty() ^ true) {
            final String string = ((Activity)this).getString(2131886171);
            k0.o(string, "getString(R.string.bookRoom_error_noRight_text)");
            this.I(string);
            final RoomChangeData i = this.J;
            k0.m(i);
            ValidationErrorDialog.P(i.getValidationErrors()).L(((androidx.fragment.app.d)this).getSupportFragmentManager(), "changeroomvalidationerrors");
            return;
        }
        final ArrayList<Room> k = this.K;
        k0.m(k);
        if (k.isEmpty()) {
            final String string2 = ((Activity)this).getString(2131886172);
            k0.o(string2, "getString(R.string.bookRoom_noFreeRoomsState_text)");
            this.I(string2);
            return;
        }
        final int g3 = c.i.G3;
        ((HorizontalScrollView)this.findViewById(g3)).setVisibility(0);
        final int h3 = c.i.H3;
        ((ViewGroup)this.findViewById(h3)).setVisibility(0);
        final Period h4 = this.H;
        if (h4 != null) {
            if (!h4.getRights().contains(PeriodRight.ACTION_CHANGE_ROOM)) {
                ((ViewGroup)this.findViewById(h3)).setVisibility(8);
                final a0 r = ((androidx.fragment.app.d)this).getSupportFragmentManager().r();
                k0.o(r, "supportFragmentManager.beginTransaction()");
                final AvailableRoomFragment.a l = AvailableRoomFragment.I;
                final String g4 = this.G;
                if (g4 == null) {
                    k0.S("profileId");
                    throw null;
                }
                final ArrayList<Room> m = this.K;
                k0.m(m);
                r.h(2131296495, (Fragment)l.a(g4, m), "");
                r.r();
            }
            else {
                final NonSwipeableViewPager nonSwipeableViewPager = (NonSwipeableViewPager)this.findViewById(h3);
                final FragmentManager supportFragmentManager = ((androidx.fragment.app.d)this).getSupportFragmentManager();
                k0.o(supportFragmentManager, "supportFragmentManager");
                final String g5 = this.G;
                if (g5 == null) {
                    k0.S("profileId");
                    throw null;
                }
                final Period h5 = this.H;
                if (h5 == null) {
                    k0.S("period");
                    throw null;
                }
                final long id = h5.getId();
                final RoomChangeData j2 = this.J;
                k0.m(j2);
                final ArrayList<Room> k2 = this.K;
                k0.m(k2);
                nonSwipeableViewPager.setAdapter((androidx.viewpager.widget.a)new h(supportFragmentManager, g5, id, j2, k2));
                ((TabLayout)this.findViewById(g3)).setupWithViewPager((ViewPager)this.findViewById(h3));
                final TabLayout$i z = ((TabLayout)this.findViewById(g3)).z(0);
                if (z != null) {
                    z.D((CharSequence)((Activity)this).getString(2131886722));
                }
                final TabLayout$i z2 = ((TabLayout)this.findViewById(g3)).z(1);
                if (z2 != null) {
                    z2.D((CharSequence)((Activity)this).getString(2131886169));
                }
                final TabLayout$i z3 = ((TabLayout)this.findViewById(g3)).z(2);
                if (z3 != null) {
                    z3.D((CharSequence)((Activity)this).getString(2131886647));
                }
            }
            return;
        }
        k0.S("period");
        throw null;
    }
    
    private final void I(final String text) {
        this.y();
        ((FrameLayout)this.findViewById(c.i.D3)).setVisibility(0);
        ((TextView)this.findViewById(c.i.E3)).setText((CharSequence)text);
    }
    
    private final void J() {
        ((RelativeLayout)this.findViewById(c.i.nE)).setVisibility(0);
    }
    
    private final com.untis.mobile.analytics.base.b x() {
        return this.L.getValue();
    }
    
    private final void y() {
        ((RelativeLayout)this.findViewById(c.i.nE)).setVisibility(8);
    }
    
    private final void z() {
        if (this.J != null && this.K != null) {
            this.H();
            return;
        }
        this.J();
        final com.untis.mobile.services.booking.a i = this.I;
        if (i == null) {
            k0.S("bookingService");
            throw null;
        }
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        final g k3 = i.b(h.getId()).d4((p)com.untis.mobile.ui.activities.booking.g.G).k3((p)new com.untis.mobile.ui.activities.booking.e(this));
        final com.untis.mobile.services.booking.a j = this.I;
        if (j == null) {
            k0.S("bookingService");
            throw null;
        }
        final Period h2 = this.H;
        if (h2 == null) {
            k0.S("period");
            throw null;
        }
        final org.joda.time.c start = h2.getStart();
        final Period h3 = this.H;
        if (h3 != null) {
            g.D0(k3, j.c(start, h3.getEnd()).k3((p)new com.untis.mobile.ui.activities.booking.f(this))).D5((rx.functions.b)d.G, (rx.functions.b)new com.untis.mobile.ui.activities.booking.c(this), (rx.functions.a)new com.untis.mobile.ui.activities.booking.b(this));
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f Bundle extras) {
        super.onCreate(extras);
        Bundle extras2;
        if (extras == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras2 = extras;
        }
        final String s = "";
        String string;
        if (extras2 == null) {
            string = s;
        }
        else {
            string = extras2.getString("birdsOfParadies", "");
            if (string == null) {
                string = s;
            }
        }
        this.G = string;
        final String g = this.G;
        if (g == null) {
            k0.S("profileId");
            throw null;
        }
        this.I = new com.untis.mobile.services.booking.e(g);
        Bundle extras3;
        if (extras == null) {
            extras3 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras3 = extras;
        }
        long long1;
        if (extras3 == null) {
            long1 = 0L;
        }
        else {
            long1 = extras3.getLong("blackLotus");
        }
        final com.untis.mobile.services.timetable.placeholder.p.a y = com.untis.mobile.services.timetable.placeholder.p.Y;
        final String g2 = this.G;
        if (g2 == null) {
            k0.S("profileId");
            throw null;
        }
        Period l;
        if ((l = y.a(g2).l(long1)) == null) {
            l = new Period(long1, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.H = l;
        Bundle extras4;
        if (extras == null) {
            extras4 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras4 = extras;
        }
        RoomChangeData j;
        if (extras4 == null) {
            j = null;
        }
        else {
            j = (RoomChangeData)extras4.getParcelable("cityOfBrass");
        }
        this.J = j;
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        ArrayList<Room> parcelableArrayList;
        if (extras == null) {
            parcelableArrayList = null;
        }
        else {
            parcelableArrayList = (ArrayList<Room>)extras.getParcelableArrayList("wastelands");
        }
        this.K = parcelableArrayList;
        this.setContentView(2131492902);
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.Y(true);
        }
        final Period h = this.H;
        if (h != null) {
            if (!h.getRights().contains(PeriodRight.ACTION_CHANGE_ROOM)) {
                final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
                if (supportActionBar2 != null) {
                    supportActionBar2.A0((CharSequence)((Activity)this).getString(2131886170));
                }
                this.x().c(com.untis.mobile.analytics.base.c.c.N);
            }
            else {
                final androidx.appcompat.app.a supportActionBar3 = this.getSupportActionBar();
                if (supportActionBar3 != null) {
                    supportActionBar3.A0((CharSequence)((Activity)this).getString(2131886164));
                }
            }
            final androidx.appcompat.app.a supportActionBar4 = this.getSupportActionBar();
            if (supportActionBar4 != null) {
                final Period h2 = this.H;
                if (h2 == null) {
                    k0.S("period");
                    throw null;
                }
                final org.joda.time.c start = h2.getStart();
                final Period h3 = this.H;
                if (h3 == null) {
                    k0.S("period");
                    throw null;
                }
                supportActionBar4.y0((CharSequence)com.untis.mobile.utils.time.b.c(start, h3.getEnd()));
            }
            if (Build$VERSION.SDK_INT >= 21 && this.getSupportActionBar() != null) {
                final TabLayout tabLayout = (TabLayout)this.findViewById(c.i.G3);
                final androidx.appcompat.app.a supportActionBar5 = this.getSupportActionBar();
                k0.m(supportActionBar5);
                tabLayout.setElevation(supportActionBar5.q());
                final androidx.appcompat.app.a supportActionBar6 = this.getSupportActionBar();
                k0.m(supportActionBar6);
                supportActionBar6.f0(0.0f);
            }
            if (!g0.a((Context)this)) {
                final String string2 = ((Activity)this).getString(2131886756);
                k0.o(string2, "getString(R.string.shared_onlyOnlineAvailable_text)");
                this.I(string2);
            }
            else {
                this.z();
            }
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        boolean onOptionsItemSelected;
        if (menuItem.getItemId() == 16908332) {
            ((ComponentActivity)this).onBackPressed();
            onOptionsItemSelected = true;
        }
        else {
            onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        }
        return onOptionsItemSelected;
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final String g = this.G;
        if (g == null) {
            k0.S("profileId");
            throw null;
        }
        bundle.putString("birdsOfParadies", g);
        final Period h = this.H;
        if (h != null) {
            bundle.putLong("blackLotus", h.getId());
            final RoomChangeData j = this.J;
            if (j != null) {
                bundle.putParcelable("cityOfBrass", (Parcelable)j);
            }
            final ArrayList<Room> k = this.K;
            if (k != null) {
                bundle.putParcelableArrayList("wastelands", (ArrayList)k);
            }
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011" }, d2 = { "com/untis/mobile/ui/activities/booking/ChangeRoomActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "", "periodId", "Landroid/content/Intent;", "a", "BUNDLE_LOADED_AVAILABLE_ROOMS", "Ljava/lang/String;", "BUNDLE_LOADED_ROOM_CHANGE_DATA", "BUNDLE_PERIOD_ID", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, final long n) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final Intent intent = new Intent(context, (Class)ChangeRoomActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("birdsOfParadies", s);
            bundle.putLong("blackLotus", n);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
