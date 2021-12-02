// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.event;

import android.widget.TextView;
import android.widget.ImageView;
import android.content.Context;
import androidx.lifecycle.l0;
import kotlin.j2;
import n6.l;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.untis.mobile.calendar.ui.period.x;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.navigation.NavController;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodKlasse;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.Collection;
import kotlin.collections.v;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import java.util.Iterator;
import java.util.Set;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u001e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/event/CalendarPeriodEventsFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "events", "Lkotlin/j2;", "C", "D", "event", "B", "x", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/calendar/ui/period/k0;", "H", "Lkotlin/b0;", "w", "()Lcom/untis/mobile/calendar/ui/period/k0;", "model", "Lcom/untis/mobile/calendar/ui/period/classbook/event/p;", "G", "Landroidx/navigation/m;", "v", "()Lcom/untis/mobile/calendar/ui/period/classbook/event/p;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodEventsFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public CalendarPeriodEventsFragment() {
        this.G = new m(k1.d(p.class), (a)new a<Bundle>() {
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
    
    private static final void A(final CalendarPeriodEventsFragment calendarPeriodEventsFragment, final View view, final Classbook classbook) {
        kotlin.jvm.internal.k0.p(calendarPeriodEventsFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        if (classbook == null) {
            return;
        }
        final Set<Event> events = classbook.getEvents();
        final ArrayList<Event> list = new ArrayList<Event>();
        final Iterator<Object> iterator = events.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = true;
            if (!hasNext) {
                break;
            }
            final Event next = iterator.next();
            if (next.getEntityType() != EntityType.CLASS) {
                b = false;
            }
            if (!b) {
                continue;
            }
            list.add(next);
        }
        calendarPeriodEventsFragment.C(view, list);
        final Set<Event> events2 = classbook.getEvents();
        final ArrayList<Event> list2 = new ArrayList<Event>();
        for (final Event next2 : events2) {
            if (next2.getEntityType() == EntityType.STUDENT) {
                list2.add(next2);
            }
        }
        calendarPeriodEventsFragment.D(view, list2);
        ((ViewGroup)view.findViewById(c.i.TD)).setVisibility(h.U(calendarPeriodEventsFragment.v().e().length == 0, 0, 1, null));
    }
    
    private final void B(final Event event) {
        final CalendarPeriod calendarPeriod = (CalendarPeriod)this.w().Z().f();
        if (calendarPeriod == null) {
            return;
        }
        androidx.navigation.fragment.c.a((Fragment)this).D(q.a.a(event, event.getEntityType().getWebUntisKey(), v.J5(v.k(event.getEntityId())), calendarPeriod));
    }
    
    private final void C(final View view, final List<Event> list) {
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)view.findViewById(c.i.We);
        final boolean empty = list.isEmpty();
        final b b = null;
        ((ViewGroup)linearLayoutCompat).setVisibility(h.U(empty ^ true, 0, 1, null));
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.Ve)).getAdapter();
        b b2 = b;
        if (adapter instanceof b) {
            b2 = (b)adapter;
        }
        if (b2 == null) {
            return;
        }
        b2.l(list);
    }
    
    private final void D(final View view, final List<Event> list) {
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)view.findViewById(c.i.cf);
        final boolean empty = list.isEmpty();
        final b b = null;
        ((ViewGroup)linearLayoutCompat).setVisibility(h.U(empty ^ true, 0, 1, null));
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.bf)).getAdapter();
        b b2 = b;
        if (adapter instanceof b) {
            b2 = (b)adapter;
        }
        if (b2 == null) {
            return;
        }
        b2.l(list);
    }
    
    private final p v() {
        return ((b0<p>)this.G).getValue();
    }
    
    private final k0 w() {
        return this.H.getValue();
    }
    
    private final void x() {
        final CalendarPeriod calendarPeriod = (CalendarPeriod)this.w().Z().f();
        if (calendarPeriod == null) {
            return;
        }
        final Event event = new Event(0L, 0L, null, 0L, null, null, null, false, 255, null);
        event.setDateTime(this.v().f().getStart());
        event.setPeriodId(this.v().f().getId());
        event.setSynced(false);
        final NavController a = androidx.navigation.fragment.c.a((Fragment)this);
        final q.b a2 = q.a;
        final String webUntisKey = EntityType.CLASS.getWebUntisKey();
        final List<CalendarPeriodKlasse> klassen = this.v().f().getKlassen();
        final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)klassen, 10));
        final Iterator<Object> iterator = klassen.iterator();
        while (iterator.hasNext()) {
            list.add(Long.valueOf(iterator.next().getId()));
        }
        a.D(a2.a(event, webUntisKey, v.J5((Collection<Long>)list), calendarPeriod));
    }
    
    private static final void y(final CalendarPeriodEventsFragment calendarPeriodEventsFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodEventsFragment, "this$0");
        calendarPeriodEventsFragment.onBackPressed();
    }
    
    private static final void z(final CalendarPeriodEventsFragment calendarPeriodEventsFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodEventsFragment, "this$0");
        calendarPeriodEventsFragment.x();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492979, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.Ze)).setOnClickListener((View$OnClickListener)new n(this));
        final int ye = c.i.Ye;
        ((ImageView)inflate.findViewById(ye)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.event.m(this));
        ((ImageView)inflate.findViewById(ye)).setVisibility(h.U(x.b(this.v().f()), 0, 1, null));
        ((FloatingActionButton)inflate.findViewById(c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231094));
        ((TextView)inflate.findViewById(c.i.VD)).setText(2131886312);
        ((TextView)inflate.findViewById(c.i.UD)).setText(2131886311);
        ((ViewGroup)inflate.findViewById(c.i.TD)).setVisibility(h.U(this.v().e().length == 0, 0, 1, null));
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(c.i.bf);
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        recyclerView.setAdapter((RecyclerView$h)new b(requireContext, this.w().U(), v.E(), new l<Event, j2>() {
            public final void a(@e final Event event) {
                kotlin.jvm.internal.k0.p(event, "it");
                CalendarPeriodEventsFragment.this.B(event);
            }
        }));
        final RecyclerView recyclerView2 = (RecyclerView)inflate.findViewById(c.i.Ve);
        final Context requireContext2 = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext2, "requireContext()");
        recyclerView2.setAdapter((RecyclerView$h)new b(requireContext2, this.w().U(), v.E(), new l<Event, j2>() {
            public final void a(@e final Event event) {
                kotlin.jvm.internal.k0.p(event, "it");
                CalendarPeriodEventsFragment.this.B(event);
            }
        }));
        this.w().V().j(this.getViewLifecycleOwner(), (l0)new o(this, inflate));
        final Event[] e = this.v().e();
        final ArrayList<Event> list = new ArrayList<Event>();
        for (final Event event : e) {
            if (event.getEntityType() == EntityType.CLASS) {
                list.add(event);
            }
        }
        this.C(inflate, list);
        final Event[] e2 = this.v().e();
        final ArrayList<Event> list2 = new ArrayList<Event>();
        for (final Event event2 : e2) {
            if (event2.getEntityType() == EntityType.STUDENT) {
                list2.add(event2);
            }
        }
        this.D(inflate, list2);
        return inflate;
    }
}
