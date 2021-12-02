// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period;

import android.widget.LinearLayout$LayoutParams;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.ImageView;
import android.widget.TextView;
import com.untis.mobile.utils.g0;
import kotlinx.coroutines.u0;
import kotlin.c1;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.b2;
import androidx.lifecycle.l0;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodAttachment;
import com.untis.mobile.calendar.persistence.model.common.CalendarBooking;
import kotlin.s0;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.LinearLayoutCompat$b;
import com.untis.mobile.utils.extension.q;
import java.util.Collection;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodStatus;
import android.widget.HorizontalScrollView;
import com.google.android.material.tabs.TabLayout$f;
import kotlin.j2;
import com.google.android.material.tabs.TabLayout$i;
import com.untis.mobile.calendar.network.model.period.CalendarPeriodContext;
import java.util.Map;
import java.util.Comparator;
import kotlin.n1;
import kotlin.collections.q0;
import java.util.LinkedHashMap;
import kotlin.ranges.o;
import kotlin.collections.y0;
import com.google.android.material.tabs.TabLayout;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.google.android.material.switchmaterial.SwitchMaterial;
import kotlin.collections.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.ProgressBar;
import android.content.Intent;
import android.net.Uri;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodVideoCall;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.ui.activities.classbook.ClassbookActivity;
import android.content.DialogInterface$OnClickListener;
import com.untis.mobile.utils.extension.h;
import kotlin.text.s;
import androidx.appcompat.app.d$a;
import android.view.MenuItem;
import androidx.appcompat.widget.i0$e;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodRoomStatus;
import androidx.appcompat.widget.i0;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodLesson;
import com.untis.mobile.calendar.persistence.model.common.CalendarMessengerChannel;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.period.messenger.CreateMessengerChannelActivity;
import androidx.navigation.NavController;
import java.util.Objects;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import android.content.Context;
import com.untis.mobile.ui.activities.classbook.events.EventsActivity;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import java.util.List;
import androidx.navigation.fragment.c;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import android.content.DialogInterface;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodRoom;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodExam;
import android.view.View;
import android.content.ComponentCallbacks;
import com.untis.mobile.analytics.base.b;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.fragment.app.d;
import kotlin.p1;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import androidx.lifecycle.d1;
import n6.a;
import android.graphics.drawable.Drawable;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\\\u0010]J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J(\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001e\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\nH\u0002J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002J\u0018\u0010+\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0002J\b\u0010,\u001a\u00020\bH\u0002J\u0012\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J&\u00104\u001a\u0004\u0018\u00010\u00022\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001022\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J\"\u0010:\u001a\u00020\b2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\b\u00109\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010=\u001a\u00020\u00122\u0006\u0010<\u001a\u00020;H\u0014R\u001d\u0010C\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010K\u001a\u00020G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010@\u001a\u0004\bI\u0010JR\u001d\u0010P\u001a\u00020L8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010@\u001a\u0004\bN\u0010OR\u0016\u0010R\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010HR\u0016\u0010T\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010ER\u0016\u0010V\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010HR\u0016\u0010X\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010HR\u0016\u0010Y\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010[\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010H¨\u0006^" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/CalendarPeriodFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "period", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "Lkotlin/j2;", "o0", "", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homework", "r0", "calendarPeriod", "w0", "m0", "t0", "", "notEmpty", "Landroid/graphics/drawable/Drawable;", "R", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "exam", "Z", "d0", "e0", "a0", "f0", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "events", "U", "", "periodId", "k0", "c0", "l0", "", "information", "b0", "textView", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "room", "g0", "T", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "", "throwable", "beforeErrorHandler", "Lcom/untis/mobile/calendar/ui/period/k0;", "H", "Lkotlin/b0;", "Q", "()Lcom/untis/mobile/calendar/ui/period/k0;", "model", "O", "Landroid/graphics/drawable/Drawable;", "tagAbsentBackground", "Lcom/untis/mobile/analytics/base/b;", "I", "P", "()Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Lcom/untis/mobile/calendar/ui/a;", "G", "S", "()Lcom/untis/mobile/calendar/ui/a;", "sharedModel", "L", "entityTagMargin", "M", "tagDefaultBackground", "K", "subtitleSeparatorColor", "N", "tagDefaultText", "tagAbsentText", "J", "titleSeparatorColor", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodFragment extends UmFragment
{
    @e
    private final b0 G;
    @e
    private final b0 H;
    @e
    private final b0 I;
    private int J;
    private int K;
    private int L;
    private Drawable M;
    private int N;
    private Drawable O;
    private int P;
    
    public CalendarPeriodFragment() {
        this.G = d0.c((a<?>)new a<com.untis.mobile.calendar.ui.a>() {
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
            public final com.untis.mobile.calendar.ui.a invoke() {
                return (com.untis.mobile.calendar.ui.a)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(com.untis.mobile.calendar.ui.a.class), null, this.I, null);
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
        this.I = d0.c((a<?>)new a<b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final b invoke() {
                return (b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(b.class), null, null);
            }
        });
    }
    
    private static final void A0(final CalendarPeriodFragment calendarPeriodFragment, final CalendarPeriodExam calendarPeriodExam, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        calendarPeriodFragment.Z(calendarPeriodExam);
    }
    
    private static final void B0(final CalendarPeriodFragment calendarPeriodFragment, final String s, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        calendarPeriodFragment.b0(s);
    }
    
    private static final void C0(final CalendarPeriodFragment calendarPeriodFragment, final CalendarPeriod calendarPeriod, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        calendarPeriodFragment.l0(calendarPeriod);
    }
    
    private static final void D0(final CalendarPeriodFragment calendarPeriodFragment, final CalendarPeriod calendarPeriod, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        calendarPeriodFragment.e0(calendarPeriod);
    }
    
    private static final void E0(final CalendarPeriodFragment calendarPeriodFragment, final CalendarPeriod calendarPeriod, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        calendarPeriodFragment.d0(calendarPeriod);
    }
    
    private static final void F0(final CalendarPeriodFragment calendarPeriodFragment, final CalendarPeriod calendarPeriod, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        calendarPeriodFragment.c0(calendarPeriod);
    }
    
    private final b P() {
        return this.I.getValue();
    }
    
    private final k0 Q() {
        return this.H.getValue();
    }
    
    private final Drawable R(final boolean b) {
        Drawable drawable;
        if (b) {
            drawable = androidx.core.content.d.i(this.requireContext(), 2131231131);
            if (drawable == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        else {
            drawable = androidx.core.content.d.i(this.requireContext(), 2131231130);
            if (drawable == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return drawable;
    }
    
    private final com.untis.mobile.calendar.ui.a S() {
        return this.G.getValue();
    }
    
    private final void T() {
        c.a((Fragment)this).D(w.j.k(w.a, null, 1, null));
    }
    
    private final void U(final CalendarPeriod calendarPeriod, final List<Event> list) {
        final EventsActivity.a r = EventsActivity.R;
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        this.startActivityForResult(r.a(requireContext, this.Q().d0().getUniqueId(), calendarPeriod.getId()), 110);
    }
    
    private static final void V(final CalendarPeriodFragment calendarPeriodFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        calendarPeriodFragment.onBackPressed();
    }
    
    private static final void W(final CalendarPeriodFragment calendarPeriodFragment, final View view, final CalendarPeriod calendarPeriod) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        calendarPeriodFragment.w0(view, calendarPeriod);
    }
    
    private static final void X(final CalendarPeriodFragment calendarPeriodFragment, final View view, final List list) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        final CalendarPeriod calendarPeriod = (CalendarPeriod)calendarPeriodFragment.Q().Z().f();
        if (calendarPeriod == null) {
            return;
        }
        calendarPeriodFragment.r0(view, calendarPeriod, list);
    }
    
    private static final void Y(final CalendarPeriodFragment calendarPeriodFragment, final View view, final Classbook classbook) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        final CalendarPeriod calendarPeriod = (CalendarPeriod)calendarPeriodFragment.Q().Z().f();
        if (calendarPeriod == null) {
            return;
        }
        calendarPeriodFragment.o0(view, calendarPeriod, classbook);
    }
    
    private final void Z(final CalendarPeriodExam calendarPeriodExam) {
        c.a((Fragment)this).D(w.a.c(calendarPeriodExam));
    }
    
    private final void a0(final CalendarPeriod calendarPeriod, final List<HomeWork> list) {
        final NavController a = c.a((Fragment)this);
        final w.j a2 = w.a;
        final Object[] array = list.toArray((Object[])new HomeWork[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        a.D(a2.d((HomeWork[])array, calendarPeriod));
    }
    
    private final void b0(final String s) {
        c.a((Fragment)this).D(w.a.e(s));
    }
    
    private final void c0(final CalendarPeriod calendarPeriod) {
        final com.untis.mobile.messenger.a a = com.untis.mobile.messenger.a.a;
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        if (!a.h(requireContext)) {
            final Context requireContext2 = this.requireContext();
            kotlin.jvm.internal.k0.o(requireContext2, "requireContext()");
            a.i(requireContext2);
            return;
        }
        if (x.m(calendarPeriod) && x.I(calendarPeriod)) {
            final Context requireContext3 = this.requireContext();
            kotlin.jvm.internal.k0.o(requireContext3, "requireContext()");
            final Profile d0 = this.Q().d0();
            final CalendarMessengerChannel messengerChannel = calendarPeriod.getMessengerChannel();
            String s = "";
            if (messengerChannel != null) {
                final String id = messengerChannel.getId();
                if (id != null) {
                    s = id;
                }
            }
            a.m(requireContext3, d0, s);
        }
        if (x.a(calendarPeriod) && !x.I(calendarPeriod)) {
            final CreateMessengerChannelActivity.a i = CreateMessengerChannelActivity.I;
            final Context requireContext4 = this.requireContext();
            kotlin.jvm.internal.k0.o(requireContext4, "requireContext()");
            final String uniqueId = this.Q().d0().getUniqueId();
            final CalendarPeriodLesson lesson = calendarPeriod.getLesson();
            long lessonId;
            if (lesson == null) {
                lessonId = 0L;
            }
            else {
                lessonId = lesson.getLessonId();
            }
            this.startActivity(i.a(requireContext4, uniqueId, lessonId));
        }
    }
    
    private final void d0(final CalendarPeriod calendarPeriod) {
        c.a((Fragment)this).D(w.a.f(calendarPeriod));
    }
    
    private final void e0(final CalendarPeriod calendarPeriod) {
        c.a((Fragment)this).D(w.a.g(calendarPeriod));
    }
    
    private final void f0(final CalendarPeriod calendarPeriod) {
        c.a((Fragment)this).D(w.a.h(calendarPeriod));
    }
    
    private final void g0(final View view, final CalendarPeriodRoom calendarPeriodRoom) {
        final i0 i0 = new i0(this.requireContext(), view);
        i0.e().inflate(2131558414, i0.d());
        i0.d().findItem(2131298687).setVisible(calendarPeriodRoom.getStatus() != CalendarPeriodRoomStatus.Removed);
        i0.j((i0$e)new j(this, calendarPeriodRoom));
        i0.k();
    }
    
    private static final boolean h0(final CalendarPeriodFragment calendarPeriodFragment, final CalendarPeriodRoom calendarPeriodRoom, final MenuItem menuItem) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        kotlin.jvm.internal.k0.p(calendarPeriodRoom, "$room");
        final int itemId = menuItem.getItemId();
        boolean b = true;
        switch (itemId) {
            default: {
                b = false;
                break;
            }
            case 2131298688: {
                c.a((Fragment)calendarPeriodFragment).D(w.a.j(calendarPeriodRoom));
                break;
            }
            case 2131298687: {
                final d$a d$a = new d$a(calendarPeriodFragment.requireContext());
                final String string = calendarPeriodFragment.getString(2131886186);
                kotlin.jvm.internal.k0.o(string, "getString(R.string.calendarPeriodRoom_deleteRoom_text)");
                d$a.n((CharSequence)h.P(s.k2(string, "{0}", calendarPeriodRoom.getDisplayName(), false, 4, (Object)null), androidx.core.content.d.f(calendarPeriodFragment.requireContext(), 2131100003), calendarPeriodRoom.getDisplayName())).B(2131886766, (DialogInterface$OnClickListener)new com.untis.mobile.calendar.ui.period.a(calendarPeriodFragment, calendarPeriodRoom)).r(2131886649, (DialogInterface$OnClickListener)l.G).O();
                break;
            }
        }
        return b;
    }
    
    private static final void i0(final CalendarPeriodFragment calendarPeriodFragment, final CalendarPeriodRoom calendarPeriodRoom, final DialogInterface dialogInterface, final int n) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        kotlin.jvm.internal.k0.p(calendarPeriodRoom, "$room");
        calendarPeriodFragment.Q().g0(calendarPeriodFragment.getErrorHandler(), calendarPeriodRoom.getId());
    }
    
    private static final void j0(final DialogInterface dialogInterface, final int n) {
        dialogInterface.cancel();
    }
    
    private final void k0(final long n) {
        final ClassbookActivity.a u = ClassbookActivity.U;
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        this.startActivityForResult(u.a(requireContext, this.Q().d0().getUniqueId(), n), 110);
    }
    
    private final void l0(final CalendarPeriod calendarPeriod) {
        c.a((Fragment)this).D(w.a.l(calendarPeriod));
    }
    
    private final void m0(final View view, final CalendarPeriod calendarPeriod) {
        final CalendarPeriodVideoCall videoCall = calendarPeriod.getVideoCall();
        if (videoCall != null) {
            final int ye = com.untis.mobile.c.i.ye;
            ((ViewGroup)view.findViewById(ye)).setVisibility(h.U(!x.i(calendarPeriod) && videoCall.isActive(), 0, 1, null));
            final int ze = com.untis.mobile.c.i.ze;
            final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(ze);
            final String videoCallUrl = videoCall.getVideoCallUrl();
            ((TextView)appCompatTextView).setVisibility(h.U((videoCallUrl == null || s.U1((CharSequence)videoCallUrl)) ^ true, 0, 1, null));
            final AppCompatImageView appCompatImageView = (AppCompatImageView)view.findViewById(com.untis.mobile.c.i.xe);
            final CalendarPeriodVideoCall videoCall2 = calendarPeriod.getVideoCall();
            boolean b = false;
            Label_0178: {
                if (videoCall2 != null) {
                    final String videoCallUrl2 = videoCall2.getVideoCallUrl();
                    if (videoCallUrl2 != null) {
                        if (s.U1((CharSequence)videoCallUrl2) ^ true) {
                            b = true;
                            break Label_0178;
                        }
                    }
                }
                b = false;
            }
            ((ImageView)appCompatImageView).setVisibility(h.U(b, 0, 1, null));
            final String videoCallUrl3 = videoCall.getVideoCallUrl();
            if (videoCallUrl3 != null) {
                ((TextView)view.findViewById(ze)).setText((CharSequence)videoCallUrl3);
                ((ViewGroup)view.findViewById(ye)).setOnClickListener((View$OnClickListener)new g(this, videoCallUrl3));
            }
        }
    }
    
    private static final void n0(final CalendarPeriodFragment calendarPeriodFragment, final String s, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        kotlin.jvm.internal.k0.p(s, "$url");
        calendarPeriodFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(h.I(s))));
    }
    
    private final void o0(final View view, final CalendarPeriod calendarPeriod, final Classbook classbook) {
        final int sh = com.untis.mobile.c.i.sh;
        ((ViewGroup)view.findViewById(sh)).setVisibility(h.U(x.o(calendarPeriod), 0, 1, null));
        final int de = com.untis.mobile.c.i.De;
        ((ViewGroup)view.findViewById(de)).setVisibility(h.U(x.j(calendarPeriod), 0, 1, null));
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Sf)).setVisibility(h.U(x.k(calendarPeriod), 0, 1, null));
        if (classbook == null) {
            ((ProgressBar)view.findViewById(com.untis.mobile.c.i.Fe)).setVisibility(0);
            ((ViewGroup)view.findViewById(de)).setOnClickListener((View$OnClickListener)null);
            ((TextView)view.findViewById(com.untis.mobile.c.i.Ge)).setVisibility(8);
            ((ProgressBar)view.findViewById(com.untis.mobile.c.i.vh)).setVisibility(0);
            ((ViewGroup)view.findViewById(sh)).setOnClickListener((View$OnClickListener)null);
            ((TextView)view.findViewById(com.untis.mobile.c.i.wh)).setVisibility(4);
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.uh)).setVisibility(4);
        }
        else {
            ((ProgressBar)view.findViewById(com.untis.mobile.c.i.Fe)).setVisibility(4);
            ((ViewGroup)view.findViewById(de)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.d(this, calendarPeriod, classbook));
            final int ge = com.untis.mobile.c.i.Ge;
            ((TextView)view.findViewById(ge)).setText((CharSequence)x.r(classbook, 0, 1, null));
            ((TextView)view.findViewById(ge)).setVisibility(0);
            final int r = k0.R(this.Q(), classbook, calendarPeriod, 0, 4, null);
            ((ProgressBar)view.findViewById(com.untis.mobile.c.i.vh)).setVisibility(4);
            ((ViewGroup)view.findViewById(sh)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.s(this, calendarPeriod));
            final int wh = com.untis.mobile.c.i.wh;
            final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(wh);
            String value;
            if (r > 99) {
                value = "99+";
            }
            else {
                value = String.valueOf(r);
            }
            ((TextView)appCompatTextView).setText((CharSequence)value);
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.uh)).setVisibility(h.T(classbook.getAbsencesChecked(), 4));
            final AppCompatImageView appCompatImageView = (AppCompatImageView)view.findViewById(com.untis.mobile.c.i.th);
            Drawable imageDrawable;
            if (r > 0) {
                imageDrawable = this.O;
                if (imageDrawable == null) {
                    kotlin.jvm.internal.k0.S("tagAbsentBackground");
                    throw null;
                }
            }
            else {
                imageDrawable = this.M;
                if (imageDrawable == null) {
                    kotlin.jvm.internal.k0.S("tagDefaultBackground");
                    throw null;
                }
            }
            appCompatImageView.setImageDrawable(imageDrawable);
            final AppCompatTextView appCompatTextView2 = (AppCompatTextView)view.findViewById(wh);
            int textColor;
            if (r > 0) {
                textColor = this.P;
            }
            else {
                textColor = this.N;
            }
            ((TextView)appCompatTextView2).setTextColor(textColor);
        }
    }
    
    private static final void p0(final CalendarPeriodFragment calendarPeriodFragment, final CalendarPeriod calendarPeriod, final Classbook classbook, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        kotlin.jvm.internal.k0.p(calendarPeriod, "$period");
        calendarPeriodFragment.U(calendarPeriod, v.I5((Iterable<? extends Event>)classbook.getEvents()));
    }
    
    private static final void q0(final CalendarPeriodFragment calendarPeriodFragment, final CalendarPeriod calendarPeriod, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        kotlin.jvm.internal.k0.p(calendarPeriod, "$period");
        calendarPeriodFragment.k0(calendarPeriod.getId());
    }
    
    private final void r0(final View view, final CalendarPeriod calendarPeriod, final List<HomeWork> list) {
        if (list == null) {
            ((ProgressBar)view.findViewById(com.untis.mobile.c.i.Vf)).setVisibility(0);
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Sf)).setOnClickListener((View$OnClickListener)null);
            ((TextView)view.findViewById(com.untis.mobile.c.i.Wf)).setVisibility(8);
        }
        else {
            ((ProgressBar)view.findViewById(com.untis.mobile.c.i.Vf)).setVisibility(4);
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Sf)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.e(this, calendarPeriod, list));
            final int wf = com.untis.mobile.c.i.Wf;
            ((TextView)view.findViewById(wf)).setText((CharSequence)x.y(list, 0, calendarPeriod.getEnd().h1(), 1, null));
            ((TextView)view.findViewById(wf)).setVisibility(0);
        }
    }
    
    private static final void s0(final CalendarPeriodFragment calendarPeriodFragment, final CalendarPeriod calendarPeriod, final List list, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        kotlin.jvm.internal.k0.p(calendarPeriod, "$period");
        calendarPeriodFragment.a0(calendarPeriod, list);
    }
    
    private final void t0(final View view, final CalendarPeriod calendarPeriod) {
        final int ig = com.untis.mobile.c.i.Ig;
        ((CompoundButton)view.findViewById(ig)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)view.findViewById(com.untis.mobile.c.i.Hg);
        final boolean i = x.i(calendarPeriod);
        boolean b = false;
        ((ViewGroup)linearLayoutCompat).setVisibility(h.U(i, 0, 1, null));
        final int ye = com.untis.mobile.c.i.ye;
        ((ViewGroup)view.findViewById(ye)).setVisibility(8);
        final int xe = com.untis.mobile.c.i.xe;
        ((ImageView)view.findViewById(xe)).setVisibility(8);
        final CalendarPeriodVideoCall videoCall = calendarPeriod.getVideoCall();
        if (videoCall != null) {
            ((SwitchCompat)view.findViewById(ig)).setChecked(videoCall.isActive());
            final int gg = com.untis.mobile.c.i.Gg;
            ((TextView)view.findViewById(gg)).setVisibility(h.U(videoCall.isActive(), 0, 1, null));
            ((ViewGroup)view.findViewById(ye)).setVisibility(h.U(!x.i(calendarPeriod) && videoCall.isActive(), 0, 1, null));
            final AppCompatImageView appCompatImageView = (AppCompatImageView)view.findViewById(xe);
            final String videoCallUrl = videoCall.getVideoCallUrl();
            ((ImageView)appCompatImageView).setVisibility(h.U(videoCallUrl != null && (s.U1((CharSequence)videoCallUrl) ^ true), 0, 1, null));
            final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(gg);
            final String videoCallUrl2 = videoCall.getVideoCallUrl();
            if (videoCallUrl2 == null || s.U1((CharSequence)videoCallUrl2)) {
                b = true;
            }
            String text;
            if (!b) {
                text = videoCall.getVideoCallUrl();
            }
            else {
                text = this.getString(2131886191);
            }
            ((TextView)appCompatTextView).setText((CharSequence)text);
        }
        ((TextView)view.findViewById(com.untis.mobile.c.i.Gg)).setOnClickListener((View$OnClickListener)new t(this, calendarPeriod));
        ((CompoundButton)view.findViewById(ig)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new i(view, calendarPeriod, this));
    }
    
    private static final void u0(final CalendarPeriodFragment calendarPeriodFragment, final CalendarPeriod calendarPeriod, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        kotlin.jvm.internal.k0.p(calendarPeriod, "$calendarPeriod");
        calendarPeriodFragment.f0(calendarPeriod);
    }
    
    private static final void v0(final View view, final CalendarPeriod calendarPeriod, final CalendarPeriodFragment calendarPeriodFragment, final CompoundButton compoundButton, final boolean b) {
        kotlin.jvm.internal.k0.p(view, "$view");
        kotlin.jvm.internal.k0.p(calendarPeriod, "$calendarPeriod");
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        final int gg = com.untis.mobile.c.i.Gg;
        ((TextView)view.findViewById(gg)).setVisibility(h.U(!x.i(calendarPeriod) && b, 0, 1, null));
        if (!b) {
            ((TextView)view.findViewById(gg)).setText((CharSequence)calendarPeriodFragment.getString(2131886191));
        }
        calendarPeriodFragment.Q().y0(calendarPeriodFragment.getErrorHandler(), new CalendarPeriodVideoCall(b, null, 2, null));
    }
    
    private final void w0(final View view, final CalendarPeriod calendarPeriod) {
        if (calendarPeriod == null) {
            return;
        }
        ((TextView)view.findViewById(com.untis.mobile.c.i.qf)).setText((CharSequence)h.P(x.w(calendarPeriod), this.J, "|"));
        ((TextView)view.findViewById(com.untis.mobile.c.i.pf)).setText((CharSequence)x.v(calendarPeriod));
        final List<CalendarPeriodContext> s = this.Q().S();
        final Integer color = calendarPeriod.getColor();
        if (color != null) {
            ((TabLayout)view.findViewById(com.untis.mobile.c.i.Mh)).setSelectedTabIndicatorColor((int)color);
        }
        final int rh = com.untis.mobile.c.i.rh;
        final AppCompatImageView appCompatImageView = (AppCompatImageView)view.findViewById(rh);
        final Integer color2 = calendarPeriod.getColor();
        int intValue;
        if (color2 == null) {
            intValue = 0;
        }
        else {
            intValue = color2;
        }
        ((ImageView)appCompatImageView).setBackgroundColor(intValue);
        ((ImageView)view.findViewById(rh)).setVisibility(h.U(calendarPeriod.getColor() != null && s.size() == 1, 0, 1, null));
        final int mh = com.untis.mobile.c.i.Mh;
        ((TabLayout)view.findViewById(mh)).R(androidx.core.content.d.f(this.requireContext(), 2131100049), androidx.core.content.d.f(this.requireContext(), 2131100063));
        if (((HorizontalScrollView)view.findViewById(mh)).getVisibility() == 0) {
            ((TabLayout)view.findViewById(mh)).p();
            ((TabLayout)view.findViewById(mh)).G();
            final Iterable<q0<Object>> u5 = v.U5((Iterable<?>)this.S().c());
            final LinkedHashMap linkedHashMap = new LinkedHashMap<Object, Object>(o.n(y0.j(v.Y((Iterable<?>)u5, 10)), 16));
            for (final q0<Object> q0 : u5) {
                final s0<Object, Integer> a = n1.a((Object)q0.f(), q0.e());
                linkedHashMap.put(a.e(), (V)a.f());
            }
            for (final CalendarPeriodContext calendarPeriodContext : v.h5((Iterable<?>)v.h5((Iterable<?>)s, (Comparator<? super Object>)new Comparator<Object>() {
                @Override
                public final int compare(final T t, final T t2) {
                    return kotlin.comparisons.a.g(linkedHashMap.get(((CalendarPeriodContext)t).getPeriod().getId()), linkedHashMap.get(((CalendarPeriodContext)t2).getPeriod().getId()));
                }
            }), (Comparator<? super Object>)new Comparator<Object>() {
                @Override
                public final int compare(final T t, final T t2) {
                    final long id = ((CalendarPeriodContext)t2).getPeriod().getId();
                    final long b = CalendarPeriodFragment.this.S().b();
                    boolean b2 = true;
                    final boolean b3 = id == b;
                    if (((CalendarPeriodContext)t).getPeriod().getId() != CalendarPeriodFragment.this.S().b()) {
                        b2 = false;
                    }
                    return kotlin.comparisons.a.g(b3, b2);
                }
            })) {
                final boolean b = calendarPeriodContext.getPeriod().getId() == calendarPeriod.getId();
                final int mh2 = com.untis.mobile.c.i.Mh;
                final TabLayout tabLayout = (TabLayout)view.findViewById(mh2);
                final TabLayout$i d = ((TabLayout)view.findViewById(mh2)).D();
                final CalendarPeriod period = calendarPeriodContext.getPeriod();
                final Context requireContext = this.requireContext();
                kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
                String f;
                if ((f = x.F(period, requireContext)) == null) {
                    f = "n/a";
                }
                tabLayout.h(d.D((CharSequence)f).B((Object)calendarPeriodContext.getPeriod().getId()), b);
                final Integer color3 = calendarPeriod.getColor();
                if (b && color3 != null) {
                    ((TabLayout)view.findViewById(mh2)).setSelectedTabIndicatorColor((int)color3);
                }
            }
            ((TabLayout)view.findViewById(com.untis.mobile.c.i.Mh)).d((TabLayout$f)new com.untis.mobile.utils.m0(new n6.l<TabLayout$i, j2>() {
                public final void a(@e final TabLayout$i tabLayout$i) {
                    kotlin.jvm.internal.k0.p(tabLayout$i, "tab");
                    final k0 n = CalendarPeriodFragment.this.Q();
                    final Object m = tabLayout$i.m();
                    Objects.requireNonNull(m, "null cannot be cast to non-null type kotlin.Long");
                    n.o0((long)m);
                }
            }));
        }
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Ah)).setVisibility(0);
        final int bh = com.untis.mobile.c.i.Bh;
        ((TextView)view.findViewById(bh)).setText((CharSequence)h.P(x.s(calendarPeriod), this.J, "|"));
        final HorizontalScrollView horizontalScrollView = (HorizontalScrollView)view.findViewById(com.untis.mobile.c.i.Ch);
        final CharSequence text = ((AppCompatTextView)view.findViewById(bh)).getText();
        kotlin.jvm.internal.k0.o(text, "view.calendar_fragment_period_summary_classes.text");
        horizontalScrollView.setVisibility(h.U(kotlin.text.s.U1(text) ^ true, 0, 1, null));
        final int ih = com.untis.mobile.c.i.Ih;
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(ih);
        final Context requireContext2 = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext2, "requireContext()");
        ((TextView)appCompatTextView).setText((CharSequence)x.F(calendarPeriod, requireContext2));
        final int hh = com.untis.mobile.c.i.Hh;
        ((ViewGroup)view.findViewById(hh)).removeAllViews();
        final Context requireContext3 = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext3, "requireContext()");
        final String c = x.C(calendarPeriod, requireContext3);
        if (c != null) {
            final AppCompatTextView appCompatTextView2 = new AppCompatTextView((Context)new androidx.appcompat.view.d(this.requireContext(), 2131952237));
            ((TextView)appCompatTextView2).setText((CharSequence)c);
            ((ViewGroup)view.findViewById(hh)).addView((View)appCompatTextView2);
            final j2 a2 = j2.a;
        }
        final ConstraintLayout constraintLayout = (ConstraintLayout)view.findViewById(com.untis.mobile.c.i.Gh);
        final CharSequence text2 = ((AppCompatTextView)view.findViewById(ih)).getText();
        kotlin.jvm.internal.k0.o(text2, "view.calendar_fragment_period_summary_subject_title.text");
        ((ViewGroup)constraintLayout).setVisibility(h.U((kotlin.text.s.U1(text2) ^ true) || ((ViewGroup)view.findViewById(hh)).getChildCount() > 0, 0, 1, null));
        final int eh = com.untis.mobile.c.i.Eh;
        ((TextView)view.findViewById(eh)).setText((CharSequence)h.O(h.S(x.E(calendarPeriod, false, 1, null), x.t(calendarPeriod)), this.K, "|"));
        final HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView)view.findViewById(com.untis.mobile.c.i.Fh);
        final CharSequence text3 = ((AppCompatTextView)view.findViewById(eh)).getText();
        kotlin.jvm.internal.k0.o(text3, "view.calendar_fragment_period_summary_rooms.text");
        horizontalScrollView2.setVisibility(h.U(kotlin.text.s.U1(text3) ^ true, 0, 1, null));
        final int kh = com.untis.mobile.c.i.Kh;
        ((TextView)view.findViewById(kh)).setText((CharSequence)h.O(h.S(x.H(calendarPeriod, false, 1, null), x.u(calendarPeriod)), this.K, "|"));
        final HorizontalScrollView horizontalScrollView3 = (HorizontalScrollView)view.findViewById(com.untis.mobile.c.i.Lh);
        final CharSequence text4 = ((AppCompatTextView)view.findViewById(kh)).getText();
        kotlin.jvm.internal.k0.o(text4, "view.calendar_fragment_period_summary_teachers.text");
        horizontalScrollView3.setVisibility(h.U(kotlin.text.s.U1(text4) ^ true, 0, 1, null));
        if (calendarPeriod.getStatus() == CalendarPeriodStatus.Cancelled) {
            ((TextView)view.findViewById(com.untis.mobile.c.i.Ce)).setVisibility(0);
        }
        else {
            ((TextView)view.findViewById(com.untis.mobile.c.i.Ce)).setVisibility(8);
        }
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.qh)).setVisibility(h.U(x.f(calendarPeriod), 0, 1, null));
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.ph)).removeAllViews();
        final List<CalendarPeriodRoom> rooms = calendarPeriod.getRooms();
        boolean b2 = false;
        Label_1241: {
            if (!(rooms instanceof Collection) || !rooms.isEmpty()) {
                final Iterator<Object> iterator3 = rooms.iterator();
                while (iterator3.hasNext()) {
                    if (iterator3.next().getStatus() != CalendarPeriodRoomStatus.Removed) {
                        b2 = true;
                        break Label_1241;
                    }
                }
            }
            b2 = false;
        }
        if (b2) {
            ((TextView)view.findViewById(com.untis.mobile.c.i.oh)).setVisibility(8);
            final int qh = com.untis.mobile.c.i.qh;
            ((ViewGroup)view.findViewById(qh)).setClickable(false);
            ((ViewGroup)view.findViewById(qh)).setOnClickListener((View$OnClickListener)null);
            for (final CalendarPeriodRoom calendarPeriodRoom : calendarPeriod.getRooms()) {
                final AppCompatTextView appCompatTextView3 = new AppCompatTextView((Context)new androidx.appcompat.view.d(this.requireContext(), 2131952212));
                ((TextView)appCompatTextView3).setText((CharSequence)calendarPeriodRoom.getDisplayName());
                if (calendarPeriodRoom.getStatus() == CalendarPeriodRoomStatus.Removed) {
                    q.c(appCompatTextView3);
                }
                final LinearLayoutCompat$b linearLayoutCompat$b = new LinearLayoutCompat$b(-2, -2);
                ((LinearLayout$LayoutParams)linearLayoutCompat$b).setMarginStart(this.L);
                ((LinearLayout$LayoutParams)linearLayoutCompat$b).setMarginEnd(this.L);
                ((TextView)appCompatTextView3).setOnClickListener((View$OnClickListener)new r(this, appCompatTextView3, calendarPeriodRoom));
                ((ViewGroup)view.findViewById(com.untis.mobile.c.i.ph)).addView((View)appCompatTextView3, (ViewGroup$LayoutParams)linearLayoutCompat$b);
            }
        }
        else {
            ((TextView)view.findViewById(com.untis.mobile.c.i.oh)).setVisibility(0);
            final int qh2 = com.untis.mobile.c.i.qh;
            ((ViewGroup)view.findViewById(qh2)).setClickable(true);
            ((ViewGroup)view.findViewById(qh2)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.q(this));
        }
        ((ImageView)view.findViewById(com.untis.mobile.c.i.nh)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.o(this));
        final String substitutionText = calendarPeriod.getSubstitutionText();
        if (substitutionText != null) {
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.xh)).setVisibility(0);
            ((TextView)view.findViewById(com.untis.mobile.c.i.yh)).setText((CharSequence)substitutionText);
        }
        final CalendarBooking booking = calendarPeriod.getBooking();
        CharSequence text5;
        if (booking == null) {
            text5 = null;
        }
        else {
            text5 = booking.getText();
        }
        if (text5 != null && !kotlin.text.s.U1(text5)) {
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Ae)).setVisibility(0);
            ((TextView)view.findViewById(com.untis.mobile.c.i.Be)).setText(text5);
        }
        else {
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Ae)).setVisibility(8);
            ((TextView)view.findViewById(com.untis.mobile.c.i.Be)).setText((CharSequence)"");
        }
        final CalendarPeriodExam exam = calendarPeriod.getExam();
        if (exam != null) {
            final int df = com.untis.mobile.c.i.df;
            ((ViewGroup)view.findViewById(df)).setVisibility(0);
            final AppCompatTextView appCompatTextView4 = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.ef);
            final String name = exam.getName();
            String text6;
            if (name == null || kotlin.text.s.U1((CharSequence)name)) {
                text6 = exam.getDescription();
            }
            else {
                text6 = exam.getName();
            }
            ((TextView)appCompatTextView4).setText((CharSequence)text6);
            ((ViewGroup)view.findViewById(df)).setOnClickListener((View$OnClickListener)new f(this, exam));
        }
        else {
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.df)).setVisibility(8);
        }
        final String lessonInfo = calendarPeriod.getLessonInfo();
        if (lessonInfo != null && !kotlin.text.s.U1((CharSequence)lessonInfo)) {
            final int xf = com.untis.mobile.c.i.Xf;
            ((ViewGroup)view.findViewById(xf)).setVisibility(0);
            ((TextView)view.findViewById(com.untis.mobile.c.i.Yf)).setText((CharSequence)lessonInfo);
            ((ViewGroup)view.findViewById(xf)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.h(this, lessonInfo));
        }
        else {
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Xf)).setVisibility(8);
        }
        final int oh = com.untis.mobile.c.i.Oh;
        ((ViewGroup)view.findViewById(oh)).setVisibility(h.U(x.l(calendarPeriod), 0, 1, null));
        ((ViewGroup)view.findViewById(oh)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.b(this, calendarPeriod));
        final AppCompatImageView appCompatImageView2 = (AppCompatImageView)view.findViewById(com.untis.mobile.c.i.Nh);
        final List<CalendarPeriodAttachment> teachingContentFiles = calendarPeriod.getTeachingContentFiles();
        appCompatImageView2.setImageDrawable(this.R(teachingContentFiles != null && (teachingContentFiles.isEmpty() ^ true)));
        final int qh3 = com.untis.mobile.c.i.Qh;
        ((TextView)view.findViewById(qh3)).setText((CharSequence)calendarPeriod.getTeachingContent());
        final AppCompatTextView appCompatTextView5 = (AppCompatTextView)view.findViewById(qh3);
        kotlin.jvm.internal.k0.o(appCompatTextView5, "view.calendar_fragment_period_teaching_content_subtitle");
        q.e(appCompatTextView5, null, 0, 3, null);
        ((ImageView)view.findViewById(com.untis.mobile.c.i.Ph)).setVisibility(h.U(x.J(calendarPeriod) && x.d(calendarPeriod), 0, 1, null));
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.sh)).setVisibility(h.U(x.o(calendarPeriod), 0, 1, null));
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.De)).setVisibility(h.U(x.j(calendarPeriod), 0, 1, null));
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Sf)).setVisibility(h.U(x.k(calendarPeriod), 0, 1, null));
        final int mg = com.untis.mobile.c.i.mg;
        ((ViewGroup)view.findViewById(mg)).setVisibility(h.U(x.p(calendarPeriod), 0, 1, null));
        ((AppCompatImageView)view.findViewById(com.untis.mobile.c.i.lg)).setImageDrawable(this.R(calendarPeriod.getNotesStaffFiles().isEmpty() ^ true));
        final int ng = com.untis.mobile.c.i.ng;
        final AppCompatTextView appCompatTextView6 = (AppCompatTextView)view.findViewById(ng);
        final Context requireContext4 = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext4, "requireContext()");
        ((TextView)appCompatTextView6).setText((CharSequence)x.B(calendarPeriod, requireContext4));
        final AppCompatTextView appCompatTextView7 = (AppCompatTextView)view.findViewById(ng);
        kotlin.jvm.internal.k0.o(appCompatTextView7, "view.calendar_fragment_period_notes_teacher_subtitle");
        q.e(appCompatTextView7, null, 0, 3, null);
        ((ViewGroup)view.findViewById(mg)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.c(this, calendarPeriod));
        final int ig = com.untis.mobile.c.i.ig;
        ((ViewGroup)view.findViewById(ig)).setVisibility(h.U(x.n(calendarPeriod), 0, 1, null));
        ((AppCompatImageView)view.findViewById(com.untis.mobile.c.i.gg)).setImageDrawable(this.R(calendarPeriod.getNotesAllFiles().isEmpty() ^ true));
        final int jg = com.untis.mobile.c.i.jg;
        final AppCompatTextView appCompatTextView8 = (AppCompatTextView)view.findViewById(jg);
        final Context requireContext5 = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext5, "requireContext()");
        ((TextView)appCompatTextView8).setText((CharSequence)x.A(calendarPeriod, requireContext5));
        final AppCompatTextView appCompatTextView9 = (AppCompatTextView)view.findViewById(jg);
        kotlin.jvm.internal.k0.o(appCompatTextView9, "view.calendar_fragment_period_notes_all_subtitle");
        q.e(appCompatTextView9, null, 0, 3, null);
        ((ViewGroup)view.findViewById(ig)).setOnClickListener((View$OnClickListener)new u(this, calendarPeriod));
        final int eg = com.untis.mobile.c.i.eg;
        ((ViewGroup)view.findViewById(eg)).setVisibility(h.U(x.m(calendarPeriod), 0, 1, null));
        final AppCompatTextView appCompatTextView10 = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.fg);
        final Context requireContext6 = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext6, "requireContext()");
        ((TextView)appCompatTextView10).setText((CharSequence)x.z(calendarPeriod, requireContext6));
        ((ViewGroup)view.findViewById(eg)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.v(this, calendarPeriod));
        this.t0(view, calendarPeriod);
        this.m0(view, calendarPeriod);
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.XD)).setVisibility(8);
    }
    
    private static final void x0(final CalendarPeriodFragment calendarPeriodFragment, final AppCompatTextView appCompatTextView, final CalendarPeriodRoom calendarPeriodRoom, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        kotlin.jvm.internal.k0.p(appCompatTextView, "$textView");
        kotlin.jvm.internal.k0.p(calendarPeriodRoom, "$room");
        calendarPeriodFragment.g0((View)appCompatTextView, calendarPeriodRoom);
    }
    
    private static final void y0(final CalendarPeriodFragment calendarPeriodFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        calendarPeriodFragment.T();
    }
    
    private static final void z0(final CalendarPeriodFragment calendarPeriodFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodFragment, "this$0");
        calendarPeriodFragment.T();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected boolean beforeErrorHandler(@e final Throwable t) {
        kotlin.jvm.internal.k0.p(t, "throwable");
        final View view = this.getView();
        if (view == null) {
            return false;
        }
        ((FloatingActionButton)view.findViewById(com.untis.mobile.c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231113));
        ((TextView)view.findViewById(com.untis.mobile.c.i.VD)).setText(2131886692);
        ((TextView)view.findViewById(com.untis.mobile.c.i.UD)).setText(2131886762);
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.TD)).setVisibility(0);
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.XD)).setVisibility(8);
        return false;
    }
    
    public void onActivityResult(final int n, final int n2, @org.jetbrains.annotations.f final Intent intent) {
        super.onActivityResult(n, n2, intent);
        this.Q().B0();
    }
    
    public void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        this.J = androidx.core.content.d.f(this.requireContext(), 2131100008);
        this.K = androidx.core.content.d.f(this.requireContext(), 2131100016);
        this.L = (int)this.getResources().getDimension(2131165280);
        final Drawable i = androidx.core.content.d.i(this.requireContext(), 2131230824);
        if (i == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.O = i;
        this.N = androidx.core.content.d.f(this.requireContext(), 2131100014);
        final Drawable j = androidx.core.content.d.i(this.requireContext(), 2131230822);
        if (j != null) {
            this.M = j;
            this.P = androidx.core.content.d.f(this.requireContext(), 2131100009);
            this.Q().t0(this.S().d());
            this.Q().i0(this.getErrorHandler(), this.S().h(), this.S().g(), this.S().c(), this.S().b(), this.S().f(), this.S().a());
            final View view = this.getView();
            Object o;
            if (view == null) {
                o = null;
            }
            else {
                o = view.findViewById(com.untis.mobile.c.i.XD);
            }
            if (o != null) {
                ((ViewGroup)o).setVisibility(0);
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(this.Q().T(), viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ViewGroup)inflate.findViewById(com.untis.mobile.c.i.XD)).setVisibility(0);
        this.P().c(com.untis.mobile.analytics.base.c.c.I);
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.of)).setOnClickListener((View$OnClickListener)new p(this));
        final int mh = com.untis.mobile.c.i.Mh;
        ((TabLayout)inflate.findViewById(mh)).G();
        ((HorizontalScrollView)inflate.findViewById(mh)).setVisibility(h.U(this.S().c().size() > 1, 0, 1, null));
        this.Q().Z().j(this.getViewLifecycleOwner(), (l0)new k(this, inflate));
        this.Q().Y().j(this.getViewLifecycleOwner(), (l0)new n(this, inflate));
        this.Q().V().j(this.getViewLifecycleOwner(), (l0)new m(this, inflate));
        this.setOnNetworkChangeListener(new n6.l<Boolean, j2>() {
            public final void invoke(final boolean b) {
                if (b) {
                    CalendarPeriodFragment.this.Q().z0();
                }
                kotlinx.coroutines.h.f((r0)b2.G, (kotlin.coroutines.g)i1.e(), (u0)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ View H;
                    final /* synthetic */ boolean I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ View H = this.H;
                            final /* synthetic */ boolean I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((CalendarPeriodFragment$a$a)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        kotlin.coroutines.intrinsics.b.h();
                        if (this.G == 0) {
                            c1.n(o);
                            this.H.findViewById(2131297170).setVisibility(h.U(this.I ^ true, 0, 1, null));
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }, 2, (Object)null);
            }
        });
        inflate.findViewById(2131297170).setVisibility(h.U(g0.a(this.requireContext()) ^ true, 0, 1, null));
        return inflate;
    }
}
