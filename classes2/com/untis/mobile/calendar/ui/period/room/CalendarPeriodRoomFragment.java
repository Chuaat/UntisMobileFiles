// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.room;

import android.widget.ImageView;
import android.widget.EditText;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView;
import kotlin.jvm.internal.w;
import kotlin.collections.v;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.LayoutInflater;
import kotlinx.coroutines.CoroutineExceptionHandler;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import java.util.Iterator;
import androidx.lifecycle.l0;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomType;
import java.util.Collection;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomResponseKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import com.untis.mobile.utils.extension.h;
import kotlin.text.s;
import androidx.appcompat.app.d$a;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodRoom;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.navigation.NavController;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$h;
import com.untis.mobile.c;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.LinearLayoutCompat$b;
import android.view.View$OnClickListener;
import android.content.Context;
import kotlin.j2;
import n6.l;
import android.view.ViewGroup;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomDetail;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomDepartment;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomBuilding;
import java.util.List;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomResponse;
import android.view.View;
import kotlin.d0;
import com.untis.mobile.calendar.ui.period.k0;
import androidx.fragment.app.d;
import kotlin.p1;
import androidx.lifecycle.d1;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import android.os.Bundle;
import n6.a;
import kotlin.jvm.internal.k1;
import kotlin.b0;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002JC\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u001bH\u0002J&\u0010%\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J&\u0010(\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\"H\u0002J\"\u0010*\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010#H\u0002J\"\u0010,\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010&H\u0002J\u0012\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J&\u00103\u001a\u0004\u0018\u00010\n2\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010\u00182\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J\u0010\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0014R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001fR\u001d\u0010>\u001a\u0002098B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010D\u001a\u00020?8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006G" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/room/CalendarPeriodRoomFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDetail;", "room", "Lkotlin/j2;", "S", "T", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "originalRoom", "W", "Landroid/view/View;", "view", "", "filter", "K", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomResponse;", "data", "d0", "b0", "Landroidx/appcompat/widget/AppCompatTextView;", "filterTag", "", "isActive", "c0", "Landroid/view/ViewGroup;", "parent", "title", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onFilter", "I", "Lcom/untis/mobile/calendar/ui/period/room/b;", "adapter", "", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "departments", "R", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "buildings", "N", "department", "a0", "building", "Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "container", "onCreateView", "", "throwable", "beforeErrorHandler", "", "entityTagMargin", "Lcom/untis/mobile/calendar/ui/period/room/m;", "G", "Landroidx/navigation/m;", "L", "()Lcom/untis/mobile/calendar/ui/period/room/m;", "args", "Lcom/untis/mobile/calendar/ui/period/k0;", "H", "Lkotlin/b0;", "M", "()Lcom/untis/mobile/calendar/ui/period/k0;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodRoomFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    private int I;
    
    public CalendarPeriodRoomFragment() {
        this.G = new m(k1.d(com.untis.mobile.calendar.ui.period.room.m.class), (a)new a<Bundle>() {
            final /* synthetic */ Fragment G;
            
            @e
            @Override
            public final Bundle invoke() {
                final Bundle arguments = this.G.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this.G);
                sb.append(" has null arguments");
                throw new IllegalStateException(sb.toString());
            }
        });
        this.H = d0.c((a<?>)new a<k0>() {
            final /* synthetic */ Fragment G;
            final /* synthetic */ a I = new a<d1>(this) {
                final /* synthetic */ Fragment G;
                
                @e
                @Override
                public final d1 invoke() {
                    final d activity = this.G.getActivity();
                    if (activity != null) {
                        return (d1)activity;
                    }
                    throw new p1("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                }
            };
            
            @e
            @Override
            public final k0 invoke() {
                return (k0)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(k0.class), null, this.I, null);
            }
        });
    }
    
    private final AppCompatTextView I(final ViewGroup viewGroup, final String text, final boolean b, final l<? super AppCompatTextView, j2> l) {
        int n;
        if (b) {
            n = 2131952214;
        }
        else {
            n = 2131952213;
        }
        final AppCompatTextView appCompatTextView = new AppCompatTextView((Context)new androidx.appcompat.view.d(this.requireContext(), n));
        ((TextView)appCompatTextView).setText((CharSequence)text);
        ((TextView)appCompatTextView).setOnClickListener((View$OnClickListener)new i(l, appCompatTextView));
        final LinearLayoutCompat$b linearLayoutCompat$b = new LinearLayoutCompat$b(-2, -2);
        ((LinearLayout$LayoutParams)linearLayoutCompat$b).setMarginEnd(this.I);
        viewGroup.addView((View)appCompatTextView, (ViewGroup$LayoutParams)linearLayoutCompat$b);
        return appCompatTextView;
    }
    
    private static final void J(final l l, final AppCompatTextView appCompatTextView, final View view) {
        kotlin.jvm.internal.k0.p(l, "$onFilter");
        kotlin.jvm.internal.k0.p(appCompatTextView, "$textView");
        l.invoke(appCompatTextView);
    }
    
    private final void K(final View view, final String s) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.gh)).getAdapter();
        b b;
        if (adapter instanceof b) {
            b = (b)adapter;
        }
        else {
            b = null;
        }
        if (b == null) {
            return;
        }
        b.k(s);
        this.b0(view);
    }
    
    private final com.untis.mobile.calendar.ui.period.room.m L() {
        return ((b0<com.untis.mobile.calendar.ui.period.room.m>)this.G).getValue();
    }
    
    private final k0 M() {
        return this.H.getValue();
    }
    
    private final void N(final AppCompatTextView appCompatTextView, final b b, final List<CalendarPeriodRoomBuilding> list) {
        if (b.n() == null) {
            final NavController a = androidx.navigation.fragment.c.a((Fragment)this);
            final n.c a2 = n.a;
            final Object[] array = list.toArray((Object[])new CalendarPeriodRoomBuilding[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            a.D(a2.a((CalendarPeriodRoomBuilding[])array));
        }
        else {
            this.M().p0(null);
            this.Z(b, appCompatTextView, null);
        }
    }
    
    private static final void O(final CalendarPeriodRoomFragment calendarPeriodRoomFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodRoomFragment, "this$0");
        calendarPeriodRoomFragment.onBackPressed();
    }
    
    private static final void P(final View view, final View view2) {
        kotlin.jvm.internal.k0.p(view, "$view");
        ((EditText)view.findViewById(c.i.jh)).setText((CharSequence)"");
    }
    
    private static final void Q(final CalendarPeriodRoomFragment calendarPeriodRoomFragment, final View view, final CalendarPeriodRoomResponse calendarPeriodRoomResponse) {
        kotlin.jvm.internal.k0.p(calendarPeriodRoomFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        calendarPeriodRoomFragment.d0(view, calendarPeriodRoomResponse);
    }
    
    private final void R(final AppCompatTextView appCompatTextView, final b b, final List<CalendarPeriodRoomDepartment> list) {
        if (b.o() == null) {
            final NavController a = androidx.navigation.fragment.c.a((Fragment)this);
            final n.c a2 = n.a;
            final Object[] array = list.toArray((Object[])new CalendarPeriodRoomDepartment[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            a.D(a2.b((CalendarPeriodRoomDepartment[])array));
        }
        else {
            this.M().q0(null);
            this.a0(b, appCompatTextView, null);
        }
    }
    
    private final void S(final CalendarPeriodRoomDetail calendarPeriodRoomDetail) {
        final CalendarPeriodRoom d = this.L().d();
        if (d != null) {
            this.W(d, calendarPeriodRoomDetail);
        }
        else {
            this.T(calendarPeriodRoomDetail);
        }
    }
    
    private final void T(final CalendarPeriodRoomDetail calendarPeriodRoomDetail) {
        final int f = androidx.core.content.d.f(this.requireContext(), 2131100003);
        final d$a d$a = new d$a(this.requireContext());
        final String string = this.getString(2131886185);
        kotlin.jvm.internal.k0.o(string, "getString(R.string.calendarPeriodRoom_addRoom_text)");
        d$a.n((CharSequence)h.P(s.k2(string, "{0}", calendarPeriodRoomDetail.getDisplayName(), false, 4, (Object)null), f, calendarPeriodRoomDetail.getDisplayName())).B(2131886647, (DialogInterface$OnClickListener)new com.untis.mobile.calendar.ui.period.room.c(this, calendarPeriodRoomDetail)).r(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.calendar.ui.period.room.e.G).O();
    }
    
    private static final void U(final CalendarPeriodRoomFragment calendarPeriodRoomFragment, final CalendarPeriodRoomDetail calendarPeriodRoomDetail, final DialogInterface dialogInterface, final int n) {
        kotlin.jvm.internal.k0.p(calendarPeriodRoomFragment, "this$0");
        kotlin.jvm.internal.k0.p(calendarPeriodRoomDetail, "$room");
        calendarPeriodRoomFragment.M().f0(calendarPeriodRoomFragment.getErrorHandler(), calendarPeriodRoomDetail.getId(), new a<j2>() {
            public final void invoke() {
                UmFragment.this.onBackPressed();
            }
        });
    }
    
    private static final void V(final DialogInterface dialogInterface, final int n) {
        dialogInterface.cancel();
    }
    
    private final void W(final CalendarPeriodRoom calendarPeriodRoom, final CalendarPeriodRoomDetail calendarPeriodRoomDetail) {
        final int f = androidx.core.content.d.f(this.requireContext(), 2131100003);
        final d$a d$a = new d$a(this.requireContext());
        final String string = this.getString(2131886167);
        kotlin.jvm.internal.k0.o(string, "getString(R.string.bookRoom_alert_replaceRoomDetail_text)");
        d$a.n((CharSequence)h.O(h.P(s.k2(s.k2(string, "{0}", calendarPeriodRoom.getDisplayName(), false, 4, (Object)null), "{1}", calendarPeriodRoomDetail.getDisplayName(), false, 4, (Object)null), f, calendarPeriodRoomDetail.getDisplayName()), f, calendarPeriodRoom.getDisplayName())).B(2131886168, (DialogInterface$OnClickListener)new com.untis.mobile.calendar.ui.period.room.d(this, calendarPeriodRoom, calendarPeriodRoomDetail)).r(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.calendar.ui.period.room.f.G).O();
    }
    
    private static final void X(final CalendarPeriodRoomFragment calendarPeriodRoomFragment, final CalendarPeriodRoom calendarPeriodRoom, final CalendarPeriodRoomDetail calendarPeriodRoomDetail, final DialogInterface dialogInterface, final int n) {
        kotlin.jvm.internal.k0.p(calendarPeriodRoomFragment, "this$0");
        kotlin.jvm.internal.k0.p(calendarPeriodRoom, "$originalRoom");
        kotlin.jvm.internal.k0.p(calendarPeriodRoomDetail, "$room");
        calendarPeriodRoomFragment.M().h0(calendarPeriodRoomFragment.getErrorHandler(), calendarPeriodRoom.getId(), calendarPeriodRoomDetail.getId(), new a<j2>() {
            public final void invoke() {
                UmFragment.this.onBackPressed();
            }
        });
    }
    
    private static final void Y(final DialogInterface dialogInterface, final int n) {
        dialogInterface.cancel();
    }
    
    private final void Z(final b b, final AppCompatTextView appCompatTextView, final CalendarPeriodRoomBuilding calendarPeriodRoomBuilding) {
        b.l(calendarPeriodRoomBuilding);
        this.c0(appCompatTextView, calendarPeriodRoomBuilding != null);
        String displayName;
        if (calendarPeriodRoomBuilding == null) {
            displayName = null;
        }
        else {
            displayName = calendarPeriodRoomBuilding.getDisplayName();
        }
        String string = displayName;
        if (displayName == null) {
            string = this.getString(2131886674);
        }
        ((TextView)appCompatTextView).setText((CharSequence)string);
        final View view = this.getView();
        if (view == null) {
            return;
        }
        this.b0(view);
    }
    
    private final void a0(final b b, final AppCompatTextView appCompatTextView, final CalendarPeriodRoomDepartment calendarPeriodRoomDepartment) {
        b.m(calendarPeriodRoomDepartment);
        this.c0(appCompatTextView, calendarPeriodRoomDepartment != null);
        String displayName;
        if (calendarPeriodRoomDepartment == null) {
            displayName = null;
        }
        else {
            displayName = calendarPeriodRoomDepartment.getDisplayName();
        }
        String string = displayName;
        if (displayName == null) {
            string = this.getString(2131886686);
        }
        ((TextView)appCompatTextView).setText((CharSequence)string);
        final View view = this.getView();
        if (view == null) {
            return;
        }
        this.b0(view);
    }
    
    private final void b0(final View view) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.gh)).getAdapter();
        b b;
        if (adapter instanceof b) {
            b = (b)adapter;
        }
        else {
            b = null;
        }
        if (b == null) {
            return;
        }
        AppCompatTextView appCompatTextView;
        int text;
        if (b.r()) {
            ((FloatingActionButton)view.findViewById(c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231146));
            ((TextView)view.findViewById(c.i.VD)).setText(2131886741);
            appCompatTextView = (AppCompatTextView)view.findViewById(c.i.UD);
            text = 2131886187;
        }
        else {
            ((FloatingActionButton)view.findViewById(c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231148));
            ((TextView)view.findViewById(c.i.VD)).setText(2131886743);
            appCompatTextView = (AppCompatTextView)view.findViewById(c.i.UD);
            text = 2131886742;
        }
        ((TextView)appCompatTextView).setText(text);
        ((ViewGroup)view.findViewById(c.i.TD)).setVisibility(h.U(b.q(), 0, 1, null));
    }
    
    private final void c0(final AppCompatTextView appCompatTextView, final boolean b) {
        Context context;
        int n;
        if (b) {
            ((TextView)appCompatTextView).setBackground(androidx.core.content.d.i(this.requireContext(), 2131231175));
            context = this.requireContext();
            n = 2131100014;
        }
        else {
            ((TextView)appCompatTextView).setBackground(androidx.core.content.d.i(this.requireContext(), 2131231173));
            context = this.requireContext();
            n = 2131100011;
        }
        ((TextView)appCompatTextView).setTextColor(androidx.core.content.d.f(context, n));
    }
    
    private final void d0(final View view, final CalendarPeriodRoomResponse calendarPeriodRoomResponse) {
        final List<CalendarPeriodRoomDetail> availableRooms = CalendarPeriodRoomResponseKt.getAvailableRooms(calendarPeriodRoomResponse);
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.gh)).getAdapter();
        final boolean b = adapter instanceof b;
        final Iterable<CalendarPeriodRoomType> iterable = null;
        b b2;
        if (b) {
            b2 = (b)adapter;
        }
        else {
            b2 = null;
        }
        if (b2 == null) {
            return;
        }
        b2.w(availableRooms);
        final boolean b3 = true;
        CalendarPeriodRoomType roomType = null;
        Label_0180: {
            Label_0067: {
                if (calendarPeriodRoomResponse != null) {
                    final List<CalendarPeriodRoomDetail> rooms = calendarPeriodRoomResponse.getRooms();
                    if (rooms != null) {
                        while (true) {
                            for (final CalendarPeriodRoomDetail next : rooms) {
                                final long id = next.getId();
                                final CalendarPeriodRoom d = this.L().d();
                                if (d != null && id == d.getId()) {
                                    final CalendarPeriodRoomDetail calendarPeriodRoomDetail = next;
                                    if (calendarPeriodRoomDetail == null) {
                                        break Label_0067;
                                    }
                                    roomType = calendarPeriodRoomDetail.getRoomType();
                                    break Label_0180;
                                }
                            }
                            CalendarPeriodRoomDetail next = null;
                            continue;
                        }
                    }
                }
            }
            roomType = null;
        }
        if (roomType != null) {
            final List<CalendarPeriodRoomType> p2 = b2.p();
            boolean b4 = false;
            Label_0272: {
                if (!(p2 instanceof Collection) || !p2.isEmpty()) {
                    final Iterator<Object> iterator2 = p2.iterator();
                    while (iterator2.hasNext()) {
                        if (iterator2.next().getId() == roomType.getId()) {
                            b4 = true;
                            break Label_0272;
                        }
                    }
                }
                b4 = false;
            }
            if (b4) {
                b2.v(roomType);
            }
        }
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)view.findViewById(c.i.mh);
        kotlin.jvm.internal.k0.o(linearLayoutCompat, "view.calendar_fragment_period_room_tags_content");
        ((ViewGroup)linearLayoutCompat).removeAllViews();
        Collection<CalendarPeriodRoomBuilding> buildings;
        if (calendarPeriodRoomResponse == null) {
            buildings = null;
        }
        else {
            buildings = calendarPeriodRoomResponse.getBuildings();
        }
        if (buildings != null && !buildings.isEmpty()) {
            final CalendarPeriodRoomBuilding n = b2.n();
            String displayName;
            if (n == null) {
                displayName = null;
            }
            else {
                displayName = n.getDisplayName();
            }
            String string;
            if (displayName == null) {
                string = this.getString(2131886674);
                kotlin.jvm.internal.k0.o(string, "getString(R.string.shared_building_text)");
            }
            else {
                string = displayName;
            }
            boolean b5;
            if (displayName != null) {
                b5 = true;
            }
            else {
                b5 = false;
            }
            final AppCompatTextView i = this.I((ViewGroup)linearLayoutCompat, string, b5, new l<AppCompatTextView, j2>() {
                public final void a(@e final AppCompatTextView appCompatTextView) {
                    kotlin.jvm.internal.k0.p(appCompatTextView, "it");
                    CalendarPeriodRoomFragment.this.N(appCompatTextView, b2, calendarPeriodRoomResponse.getBuildings());
                }
            });
            final LiveData<CalendarPeriodRoomBuilding> a0 = this.M().a0();
            if (!a0.i()) {
                a0.j(this.getViewLifecycleOwner(), (l0)new k(this, b2, i));
            }
        }
        Collection<CalendarPeriodRoomDepartment> departments;
        if (calendarPeriodRoomResponse == null) {
            departments = null;
        }
        else {
            departments = calendarPeriodRoomResponse.getDepartments();
        }
        if (departments != null && !departments.isEmpty()) {
            final CalendarPeriodRoomDepartment o = b2.o();
            String displayName2;
            if (o == null) {
                displayName2 = null;
            }
            else {
                displayName2 = o.getDisplayName();
            }
            String string2;
            if (displayName2 == null) {
                string2 = this.getString(2131886686);
                kotlin.jvm.internal.k0.o(string2, "getString(R.string.shared_department_text)");
            }
            else {
                string2 = displayName2;
            }
            boolean b6;
            if (displayName2 != null) {
                b6 = true;
            }
            else {
                b6 = false;
            }
            final AppCompatTextView j = this.I((ViewGroup)linearLayoutCompat, string2, b6, new l<AppCompatTextView, j2>() {
                public final void a(@e final AppCompatTextView appCompatTextView) {
                    kotlin.jvm.internal.k0.p(appCompatTextView, "it");
                    CalendarPeriodRoomFragment.this.R(appCompatTextView, b2, calendarPeriodRoomResponse.getDepartments());
                }
            });
            final LiveData<CalendarPeriodRoomDepartment> b7 = this.M().b0();
            if (!b7.i()) {
                b7.j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.calendar.ui.period.room.l(this, b2, j));
            }
        }
        Collection<CalendarPeriodRoomType> roomTypes;
        if (calendarPeriodRoomResponse == null) {
            roomTypes = (Collection<CalendarPeriodRoomType>)iterable;
        }
        else {
            roomTypes = calendarPeriodRoomResponse.getRoomTypes();
        }
        int n2 = b3 ? 1 : 0;
        if (roomTypes != null) {
            if (roomTypes.isEmpty()) {
                n2 = (b3 ? 1 : 0);
            }
            else {
                n2 = 0;
            }
        }
        if (n2 == 0) {
            for (final CalendarPeriodRoomType calendarPeriodRoomType : roomTypes) {
                this.I((ViewGroup)linearLayoutCompat, calendarPeriodRoomType.getDisplayName(), b2.p().contains(calendarPeriodRoomType), new l<AppCompatTextView, j2>() {
                    public final void a(@e final AppCompatTextView appCompatTextView) {
                        kotlin.jvm.internal.k0.p(appCompatTextView, "it");
                        CalendarPeriodRoomFragment.this.c0(appCompatTextView, b2.v(calendarPeriodRoomType));
                        CalendarPeriodRoomFragment.this.b0(view);
                    }
                });
            }
        }
        this.b0(view);
    }
    
    private static final void e0(final CalendarPeriodRoomFragment calendarPeriodRoomFragment, final b b, final AppCompatTextView appCompatTextView, final CalendarPeriodRoomDepartment calendarPeriodRoomDepartment) {
        kotlin.jvm.internal.k0.p(calendarPeriodRoomFragment, "this$0");
        kotlin.jvm.internal.k0.p(b, "$adapter");
        kotlin.jvm.internal.k0.p(appCompatTextView, "$filterTag");
        calendarPeriodRoomFragment.a0(b, appCompatTextView, calendarPeriodRoomDepartment);
    }
    
    private static final void f0(final CalendarPeriodRoomFragment calendarPeriodRoomFragment, final b b, final AppCompatTextView appCompatTextView, final CalendarPeriodRoomBuilding calendarPeriodRoomBuilding) {
        kotlin.jvm.internal.k0.p(calendarPeriodRoomFragment, "this$0");
        kotlin.jvm.internal.k0.p(b, "$adapter");
        kotlin.jvm.internal.k0.p(appCompatTextView, "$filterTag");
        calendarPeriodRoomFragment.Z(b, appCompatTextView, calendarPeriodRoomBuilding);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected boolean beforeErrorHandler(@e final Throwable t) {
        kotlin.jvm.internal.k0.p(t, "throwable");
        if (t instanceof com.untis.mobile.calendar.network.error.b) {
            final com.untis.mobile.calendar.network.error.b b = (com.untis.mobile.calendar.network.error.b)t;
            final FragmentManager childFragmentManager = this.getChildFragmentManager();
            kotlin.jvm.internal.k0.o(childFragmentManager, "childFragmentManager");
            com.untis.mobile.calendar.network.error.c.a(b, childFragmentManager);
            return true;
        }
        return false;
    }
    
    public void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        final k0 m = this.M();
        final CoroutineExceptionHandler errorHandler = this.getErrorHandler();
        final CalendarPeriodRoom d = this.L().d();
        Long value;
        if (d == null) {
            value = null;
        }
        else {
            value = d.getId();
        }
        m.j0(errorHandler, value);
        this.I = (int)this.getResources().getDimension(2131165280);
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492988, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.eh)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.room.h(this));
        final CalendarPeriodRoom d = this.L().d();
        if (d != null) {
            final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(c.i.fh);
            final String string = this.getString(2131886197);
            kotlin.jvm.internal.k0.o(string, "getString(R.string.calendarPeriod_replaceRoom_title)");
            ((TextView)appCompatTextView).setText((CharSequence)s.k2(string, "{0}", d.getDisplayName(), false, 4, (Object)null));
        }
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        ((RecyclerView)inflate.findViewById(c.i.gh)).setAdapter((RecyclerView$h)new b(requireContext, v.E(), null, new l<CalendarPeriodRoomDetail, j2>() {
            public final void a(@e final CalendarPeriodRoomDetail calendarPeriodRoomDetail) {
                kotlin.jvm.internal.k0.p(calendarPeriodRoomDetail, "it");
                CalendarPeriodRoomFragment.this.S(calendarPeriodRoomDetail);
            }
        }, 4, null));
        this.b0(inflate);
        final AppCompatEditText appCompatEditText = (AppCompatEditText)inflate.findViewById(c.i.jh);
        kotlin.jvm.internal.k0.o(appCompatEditText, "view.calendar_fragment_period_room_search_edit");
        h.A(appCompatEditText, new l<String, j2>() {
            public final void invoke(@e final String s) {
                kotlin.jvm.internal.k0.p(s, "it");
                CalendarPeriodRoomFragment.this.K(inflate, s);
                CalendarPeriodRoomFragment.this.b0(inflate);
            }
        });
        ((ImageView)inflate.findViewById(c.i.ih)).setOnClickListener((View$OnClickListener)new g(inflate));
        this.M().c0().j(this.getViewLifecycleOwner(), (l0)new j(this, inflate));
        return inflate;
    }
}
