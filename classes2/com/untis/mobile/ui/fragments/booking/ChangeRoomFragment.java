// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.booking;

import android.app.Activity;
import android.app.Dialog;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.os.Parcelable;
import android.view.LayoutInflater;
import java.util.Set;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import kotlin.collections.v;
import java.util.Collection;
import kotlin.jvm.internal.m0;
import java.util.Iterator;
import android.view.View$OnClickListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import java.util.ArrayList;
import com.untis.mobile.utils.u0;
import android.util.Log;
import com.untis.mobile.ui.dialogs.ValidationErrorDialog;
import kotlin.coroutines.g;
import java.util.List;
import com.untis.mobile.services.timetable.placeholder.k;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import com.untis.mobile.persistence.models.booking.RoomChangeSuccessData;
import com.untis.mobile.services.booking.a;
import rx.functions.b;
import android.annotation.SuppressLint;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.appcompat.app.d$a;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.TextView;
import com.untis.mobile.c;
import androidx.cardview.widget.CardView;
import android.content.DialogInterface;
import androidx.fragment.app.d;
import com.untis.mobile.persistence.models.masterdata.Room;
import android.view.View;
import android.widget.AdapterView;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.booking.RoomChangeData;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010)¨\u0006." }, d2 = { "Lcom/untis/mobile/ui/fragments/booking/ChangeRoomFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "W", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "room", "L", "F", "Q", "G", "T", "", "id", "V", "E", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "outState", "onSaveInstanceState", "Lcom/untis/mobile/persistence/models/profile/Profile;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "H", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "", "K", "I", "colorAccent", "J", "selectedRoomToChange", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "roomChangeData", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ChangeRoomFragment extends UmFragment
{
    @e
    public static final a L;
    @e
    private static final String M = "ohMyGod";
    @e
    private static final String N = "holyMary";
    @e
    private static final String O = "jesusChrist";
    private Profile G;
    private Period H;
    private RoomChangeData I;
    private long J;
    private int K;
    
    static {
        L = new a(null);
    }
    
    public ChangeRoomFragment() {
        this.J = -1L;
    }
    
    public static final /* synthetic */ Profile C(final ChangeRoomFragment changeRoomFragment) {
        return changeRoomFragment.G;
    }
    
    private final void E(final View view) {
        ((FrameLayout)view.findViewById(c.i.in)).setVisibility(8);
    }
    
    private final void F(final View view) {
        ((TextView)view.findViewById(c.i.jn)).setText((CharSequence)this.getString(2131886172));
        ((FrameLayout)view.findViewById(c.i.in)).setVisibility(0);
        ((ImageView)view.findViewById(c.i.gn)).setVisibility(8);
    }
    
    @SuppressLint({ "InflateParams" })
    private final void G(final Room room) {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final View inflate = this.getLayoutInflater().inflate(2131493037, (ViewGroup)null, false);
        final String string = this.getString(2131886166);
        k0.o(string, "getString(R.string.bookRoom_alert_removeRoomDetail_text)");
        final int r3 = s.r3((CharSequence)string, "{0}", 0, false, 6, (Object)null);
        final String displayableTitle = room.getDisplayableTitle();
        final SpannableString text = new SpannableString((CharSequence)s.k2(string, "{0}", displayableTitle, false, 4, (Object)null));
        text.setSpan((Object)new ForegroundColorSpan(this.K), r3, displayableTitle.length() + r3, 256);
        ((TextView)inflate.findViewById(c.i.pl)).setText((CharSequence)text);
        ((Dialog)new d$a((Context)activity, 2131951624).M(inflate).r(2131886649, (DialogInterface$OnClickListener)l.G).B(2131886653, (DialogInterface$OnClickListener)new i(this, room, activity)).a()).show();
    }
    
    private static final void H(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void I(final ChangeRoomFragment changeRoomFragment, final Room room, final d d, final DialogInterface dialogInterface, final int n) {
        k0.p(changeRoomFragment, "this$0");
        k0.p(room, "$room");
        k0.p(d, "$activity");
        final Profile g = changeRoomFragment.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.booking.a bookingService = g.getBookingService();
        final Period h = changeRoomFragment.H;
        if (h != null) {
            bookingService.a(h.getId(), null, room).C5((b)new r(d, dialogInterface, changeRoomFragment), (b)new com.untis.mobile.ui.fragments.booking.s(changeRoomFragment, dialogInterface));
            return;
        }
        k0.S("period");
        throw null;
    }
    
    private static final void J(final d d, final DialogInterface dialogInterface, final ChangeRoomFragment changeRoomFragment, final RoomChangeSuccessData roomChangeSuccessData) {
        k0.p(d, "$activity");
        k0.p(changeRoomFragment, "this$0");
        if (roomChangeSuccessData.getValidationErrors().isEmpty()) {
            ((Activity)d).setResult(-1);
            ((Activity)d).finish();
            kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ ChangeRoomFragment H;
                final /* synthetic */ RoomChangeSuccessData I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ ChangeRoomFragment H = this.H;
                        final /* synthetic */ RoomChangeSuccessData I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((ChangeRoomFragment$b)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final Profile c = ChangeRoomFragment.C(this.H);
                        if (c == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final k timeTableService = c.getTimeTableService();
                        final List<Period> periods = this.I.getPeriods();
                        k0.o(periods, "response.periods");
                        this.G = 1;
                        if (timeTableService.b(periods, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
        }
        else {
            ValidationErrorDialog.P(roomChangeSuccessData.getValidationErrors()).L(d.getSupportFragmentManager(), "validationerrors");
        }
        dialogInterface.dismiss();
    }
    
    private static final void K(final ChangeRoomFragment changeRoomFragment, final DialogInterface dialogInterface, final Throwable t) {
        k0.p(changeRoomFragment, "this$0");
        Log.e("untis_log", "error on delete room submit", t);
        u0.d(changeRoomFragment.getView(), t);
        dialogInterface.dismiss();
    }
    
    @SuppressLint({ "InflateParams" })
    private final void L(final Room room) {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final View inflate = this.getLayoutInflater().inflate(2131493031, (ViewGroup)null, false);
        final String string = this.getString(2131886167);
        k0.o(string, "getString(R.string.bookRoom_alert_replaceRoomDetail_text)");
        final Profile g = this.G;
        if (g != null) {
            final Room p = g.getMasterDataService().P(this.J);
            final int r3 = s.r3((CharSequence)string, "{0}", 0, false, 6, (Object)null);
            String displayableTitle = null;
            Label_0109: {
                if (p != null) {
                    displayableTitle = p.getDisplayableTitle();
                    if (displayableTitle != null) {
                        break Label_0109;
                    }
                }
                displayableTitle = "n/a";
            }
            final String k2 = s.k2(string, "{0}", displayableTitle, false, 4, (Object)null);
            final int r4 = s.r3((CharSequence)k2, "{1}", 0, false, 6, (Object)null);
            final String displayableTitle2 = room.getDisplayableTitle();
            final SpannableString text = new SpannableString((CharSequence)s.k2(k2, "{1}", displayableTitle2, false, 4, (Object)null));
            text.setSpan((Object)new ForegroundColorSpan(this.K), r4, displayableTitle2.length() + r4, 256);
            text.setSpan((Object)new ForegroundColorSpan(this.K), r3, displayableTitle.length() + r3, 256);
            ((TextView)inflate.findViewById(c.i.il)).setText((CharSequence)text);
            ((Dialog)new d$a((Context)activity, 2131951624).M(inflate).r(2131886649, (DialogInterface$OnClickListener)m.G).B(2131886168, (DialogInterface$OnClickListener)new com.untis.mobile.ui.fragments.booking.k(this, room, p, activity)).a()).show();
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private static final void M(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void N(final ChangeRoomFragment changeRoomFragment, final Room room, final Room room2, final d d, final DialogInterface dialogInterface, final int n) {
        k0.p(changeRoomFragment, "this$0");
        k0.p(room, "$room");
        k0.p(d, "$activity");
        final Profile g = changeRoomFragment.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.booking.a bookingService = g.getBookingService();
        final Period h = changeRoomFragment.H;
        if (h != null) {
            bookingService.a(h.getId(), room, room2).C5((b)new q(d, dialogInterface, changeRoomFragment), (b)new j(changeRoomFragment, dialogInterface));
            return;
        }
        k0.S("period");
        throw null;
    }
    
    private static final void O(final d d, final DialogInterface dialogInterface, final ChangeRoomFragment changeRoomFragment, final RoomChangeSuccessData roomChangeSuccessData) {
        k0.p(d, "$activity");
        k0.p(changeRoomFragment, "this$0");
        if (roomChangeSuccessData.getValidationErrors().isEmpty()) {
            ((Activity)d).setResult(-1);
            ((Activity)d).finish();
            kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ ChangeRoomFragment H;
                final /* synthetic */ RoomChangeSuccessData I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ ChangeRoomFragment H = this.H;
                        final /* synthetic */ RoomChangeSuccessData I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((ChangeRoomFragment$c)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final Profile c = ChangeRoomFragment.C(this.H);
                        if (c == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final k timeTableService = c.getTimeTableService();
                        final List<Period> periods = this.I.getPeriods();
                        k0.o(periods, "response.periods");
                        this.G = 1;
                        if (timeTableService.b(periods, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
        }
        else {
            ValidationErrorDialog.P(roomChangeSuccessData.getValidationErrors()).L(d.getSupportFragmentManager(), "validationerrors");
        }
        dialogInterface.dismiss();
    }
    
    private static final void P(final ChangeRoomFragment changeRoomFragment, final DialogInterface dialogInterface, final Throwable t) {
        k0.p(changeRoomFragment, "this$0");
        Log.e("untis_log", "error on roomchange submit", t);
        u0.d(changeRoomFragment.getView(), t);
        dialogInterface.dismiss();
    }
    
    private final void Q(final View view) {
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        final Period h = this.H;
        if (h != null) {
            final List<PeriodElement> rooms = h.getRooms();
            final ArrayList<Room> list = new ArrayList<Room>();
            for (final PeriodElement periodElement : rooms) {
                final Profile g = this.G;
                if (g == null) {
                    k0.S("profile");
                    throw null;
                }
                final Room p = g.getMasterDataService().P(periodElement.getCurrentId());
                if (p == null) {
                    continue;
                }
                list.add(p);
            }
            while (true) {
                for (final Room next : list) {
                    if (next.getId() == this.J) {
                        final Room room = next;
                        if (room == null) {
                            this.E(view);
                            return;
                        }
                        final String string = this.getString(2131886173);
                        k0.o(string, "getString(R.string.bookRoom_replaceRoomXWithCandidates_text)");
                        final int r3 = s.r3((CharSequence)string, "{0}", 0, false, 6, (Object)null);
                        final String displayableTitle = room.getDisplayableTitle();
                        final SpannableString text = new SpannableString((CharSequence)s.k2(string, "{0}", displayableTitle, false, 4, (Object)null));
                        text.setSpan((Object)new ForegroundColorSpan(this.K), r3, displayableTitle.length() + r3, 256);
                        ((TextView)view.findViewById(c.i.jn)).setText((CharSequence)text);
                        final int in = c.i.in;
                        ((FrameLayout)view.findViewById(in)).setVisibility(0);
                        final RoomChangeData i = this.I;
                        if (i != null) {
                            final List<Room> availableRooms = i.getAvailableRooms();
                            k0.o(availableRooms, "roomChangeData.availableRooms");
                            final h adapter = new h((Context)o, availableRooms, false, null, 12, null);
                            final int hn = c.i.hn;
                            ((ListView)view.findViewById(hn)).setAdapter((ListAdapter)adapter);
                            ((ListView)view.findViewById(hn)).setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.fragments.booking.p(this, adapter));
                            ((ImageView)view.findViewById(c.i.gn)).setVisibility(0);
                            ((FrameLayout)view.findViewById(in)).setOnClickListener((View$OnClickListener)new n(this, view));
                            return;
                        }
                        k0.S("roomChangeData");
                        throw null;
                    }
                }
                Room next = null;
                continue;
            }
        }
        k0.S("period");
        throw null;
    }
    
    private static final void R(final ChangeRoomFragment changeRoomFragment, final h h, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(changeRoomFragment, "this$0");
        k0.p(h, "$changeRoomAdapter");
        changeRoomFragment.L(h.b(n));
    }
    
    private static final void S(final ChangeRoomFragment changeRoomFragment, final View view, final View view2) {
        k0.p(changeRoomFragment, "this$0");
        k0.p(view, "$view");
        changeRoomFragment.J = -1L;
        changeRoomFragment.W(view);
    }
    
    private final void T(final View view) {
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        ((TextView)view.findViewById(c.i.jn)).setText((CharSequence)this.getString(2131886174));
        ((FrameLayout)view.findViewById(c.i.in)).setVisibility(0);
        final Period h = this.H;
        if (h != null) {
            final List<PeriodElement> rooms = h.getRooms();
            final ArrayList<Room> list = new ArrayList<Room>();
            for (final PeriodElement periodElement : rooms) {
                final Profile g = this.G;
                if (g == null) {
                    k0.S("profile");
                    throw null;
                }
                final Room p = g.getMasterDataService().P(periodElement.getCurrentId());
                if (p == null) {
                    continue;
                }
                list.add(p);
            }
            final h adapter = new h((Context)o, list, false, new n6.l<Room, j2>() {
                public final void a(@e final Room room) {
                    k0.p(room, "it");
                    ChangeRoomFragment.this.G(room);
                }
            }, 4, null);
            final int hn = c.i.hn;
            ((ListView)view.findViewById(hn)).setAdapter((ListAdapter)adapter);
            ((ListView)view.findViewById(hn)).setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.fragments.booking.o(this, view, adapter));
            ((ImageView)view.findViewById(c.i.gn)).setVisibility(8);
            return;
        }
        k0.S("period");
        throw null;
    }
    
    private static final void U(final ChangeRoomFragment changeRoomFragment, final View view, final h h, final AdapterView adapterView, final View view2, final int n, final long n2) {
        k0.p(changeRoomFragment, "this$0");
        k0.p(view, "$view");
        k0.p(h, "$changeRoomAdapter");
        changeRoomFragment.V(view, h.b(n).getId());
    }
    
    private final void V(final View view, final long j) {
        this.J = j;
        this.W(view);
    }
    
    private final void W(final View view) {
        final Period h = this.H;
        if (h != null) {
            final List<PeriodElement> rooms = h.getRooms();
            final boolean b = rooms instanceof Collection;
            int n = 0;
            if (!b || !rooms.isEmpty()) {
                final Iterator<Object> iterator = rooms.iterator();
                n = 0;
                while (iterator.hasNext()) {
                    if (iterator.next().getCurrentId() > 0L) {
                        final int n2 = n + 1;
                        if ((n = n2) >= 0) {
                            continue;
                        }
                        v.V();
                        n = n2;
                    }
                }
            }
            if (n == 0) {
                this.F(view);
            }
            else {
                final long j = this.J;
                if (j < 1L) {
                    this.T(view);
                }
                else if (j > 0L) {
                    this.Q(view);
                }
                else {
                    this.E(view);
                }
            }
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@org.jetbrains.annotations.f Bundle arguments) {
        super.onCreate(arguments);
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        this.K = androidx.core.content.d.f((Context)o, 2131099677);
        Bundle arguments2;
        if (arguments == null) {
            arguments2 = this.getArguments();
        }
        else {
            arguments2 = arguments;
        }
        final String s = "";
        String string;
        if (arguments2 == null) {
            string = s;
        }
        else {
            string = arguments2.getString("ohMyGod");
            if (string == null) {
                string = s;
            }
        }
        final j0 g = j0.G;
        Profile g2;
        if ((g2 = g.l(string)) == null) {
            g2 = g.n();
            if (g2 == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.G = g2;
        Bundle arguments3;
        if (arguments == null) {
            arguments3 = this.getArguments();
        }
        else {
            arguments3 = arguments;
        }
        k0.m(arguments3);
        final long long1 = arguments3.getLong("holyMary");
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        Period l;
        if ((l = g3.getTimeTableService().l(long1)) == null) {
            l = new Period(long1, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.H = l;
        if (arguments == null) {
            arguments = this.getArguments();
        }
        k0.m(arguments);
        RoomChangeData i;
        if ((i = (RoomChangeData)arguments.getParcelable("jesusChrist")) == null) {
            i = new RoomChangeData();
        }
        this.I = i;
        final Period h = this.H;
        if (h != null) {
            final List<PeriodElement> rooms = h.getRooms();
            final ArrayList<PeriodElement> list = new ArrayList<PeriodElement>();
            final Iterator<Object> iterator = rooms.iterator();
            while (true) {
                final boolean hasNext = iterator.hasNext();
                boolean b = false;
                if (!hasNext) {
                    break;
                }
                final PeriodElement next = iterator.next();
                if (next.getCurrentId() > 0L) {
                    b = true;
                }
                if (!b) {
                    continue;
                }
                list.add(next);
            }
            if (list.size() == 1) {
                this.J = ((PeriodElement)list.get(0)).getCurrentId();
            }
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493073, viewGroup, false);
        k0.o(inflate, "view");
        this.W(inflate);
        return inflate;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("ohMyGod", g.getUniqueId());
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        bundle.putLong("holyMary", h.getId());
        final RoomChangeData i = this.I;
        if (i != null) {
            bundle.putParcelable("jesusChrist", (Parcelable)i);
            return;
        }
        k0.S("roomChangeData");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010" }, d2 = { "com/untis/mobile/ui/fragments/booking/ChangeRoomFragment$a", "", "", "profileId", "", "periodId", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "roomChangeData", "Lcom/untis/mobile/ui/fragments/booking/ChangeRoomFragment;", "a", "BUNDLE_PERIOD_ID", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "BUNDLE_ROOM_CHANGE_DATA", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final ChangeRoomFragment a(@e final String s, final long n, @e final RoomChangeData roomChangeData) {
            k0.p(s, "profileId");
            k0.p(roomChangeData, "roomChangeData");
            final ChangeRoomFragment changeRoomFragment = new ChangeRoomFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("ohMyGod", s);
            arguments.putLong("holyMary", n);
            arguments.putParcelable("jesusChrist", (Parcelable)roomChangeData);
            changeRoomFragment.setArguments(arguments);
            return changeRoomFragment;
        }
    }
}
