// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.events;

import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.content.Context;
import androidx.lifecycle.l0;
import androidx.lifecycle.y;
import android.view.View$OnClickListener;
import kotlin.text.s;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderTypeKt;
import androidx.appcompat.widget.AppCompatTextView;
import org.koin.core.c$a;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatImageView;
import org.joda.time.t;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderSubtypeKt;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderSubtype;
import com.untis.mobile.dashboard.persistence.model.reminder.Reminder;
import java.util.Iterator;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import java.util.ArrayList;
import kotlin.collections.v;
import android.view.View;
import kotlin.jvm.internal.w;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import kotlin.b0;
import kotlin.j2;
import n6.l;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Child;
import com.untis.mobile.dashboard.persistence.model.event.DashboardEvent;
import java.util.List;
import org.jetbrains.annotations.e;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.koin.core.c;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u007f\u0012\u0006\u00100\u001a\u00020-\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u00105\u001a\u00020\u0006\u0012!\u0010C\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0@\u0012!\u0010D\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0@¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010&R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u0010:\u001a\n 7*\u0004\u0018\u000106068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<¨\u0006G" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/events/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lorg/koin/core/c;", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "event", "", "t", "Lkotlin/j2;", "k", "", "Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;", "reminders", "Landroid/graphics/drawable/Drawable;", "m", "Landroid/view/ViewGroup;", "parent", "", "viewType", "s", "getItemCount", "holder", "position", "o", "Lcom/untis/mobile/persistence/models/profile/Child;", "child", "l", "Lcom/untis/mobile/persistence/models/EntityType;", "J", "Lcom/untis/mobile/persistence/models/EntityType;", "role", "Lcom/untis/mobile/core/service/a;", "N", "Lkotlin/b0;", "n", "()Lcom/untis/mobile/core/service/a;", "reminderService", "R", "Landroid/graphics/drawable/Drawable;", "iconBackgroundColor", "I", "Lcom/untis/mobile/persistence/models/profile/Child;", "filterChild", "Q", "colorSeparator", "Landroidx/fragment/app/Fragment;", "G", "Landroidx/fragment/app/Fragment;", "fragment", "S", "iconSelectedBackgroundColor", "K", "Z", "isEndOfPremium", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "O", "Landroid/view/LayoutInflater;", "inflater", "H", "Ljava/util/List;", "upcomingEvent", "P", "filtered", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onEventNotifications", "onAttachment", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/util/List;Lcom/untis/mobile/persistence/models/profile/Child;Lcom/untis/mobile/persistence/models/EntityType;ZLn6/l;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d extends RecyclerView$h<o0> implements c
{
    @e
    private final Fragment G;
    @e
    private List<DashboardEvent> H;
    @f
    private Child I;
    @e
    private final EntityType J;
    private final boolean K;
    @e
    private final l<DashboardEvent, j2> L;
    @e
    private final l<DashboardEvent, j2> M;
    @e
    private final b0 N;
    private final LayoutInflater O;
    @e
    private List<DashboardEvent> P;
    private final int Q;
    @f
    private final Drawable R;
    @f
    private final Drawable S;
    
    public d(@e final Fragment g, @e final List<DashboardEvent> h, @f final Child i, @e final EntityType j, final boolean k, @e final l<? super DashboardEvent, j2> l, @e final l<? super DashboardEvent, j2> m) {
        k0.p(g, "fragment");
        k0.p(h, "upcomingEvent");
        k0.p(j, "role");
        k0.p(l, "onEventNotifications");
        k0.p(m, "onAttachment");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = (l<DashboardEvent, j2>)l;
        this.M = (l<DashboardEvent, j2>)m;
        this.N = d0.c((a<?>)new a<com.untis.mobile.core.service.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.core.service.a invoke() {
                return (com.untis.mobile.core.service.a)this.G.t(k1.d(com.untis.mobile.core.service.a.class), null, null);
            }
        });
        this.O = LayoutInflater.from(g.requireContext().getApplicationContext());
        this.P = this.H;
        this.Q = androidx.core.content.d.f(g.requireContext(), 2131099979);
        this.R = androidx.core.content.d.i(g.requireContext(), 2131231077);
        this.S = androidx.core.content.d.i(g.requireContext(), 2131231076);
        this.k();
    }
    
    private final void k() {
        final Child i = this.I;
        if (i == null) {
            this.P = v.I5((Iterable<? extends DashboardEvent>)this.H);
            return;
        }
        final List<DashboardEvent> h = this.H;
        final ArrayList<DashboardEvent> p = new ArrayList<DashboardEvent>();
        for (final DashboardEvent next : h) {
            final DashboardEvent dashboardEvent = next;
            if (dashboardEvent.getEntityIds().contains(i.getId()) || dashboardEvent.getEventType() == ReminderType.DashboardUpcomingLocalHomework) {
                p.add(next);
            }
        }
        this.P = p;
    }
    
    private final Drawable m(final List<Reminder> list) {
        if (list.isEmpty() ^ true) {
            return this.S;
        }
        return this.R;
    }
    
    private final com.untis.mobile.core.service.a n() {
        return this.N.getValue();
    }
    
    private static final void p(final d d, final DashboardEvent dashboardEvent, final View view) {
        k0.p(d, "this$0");
        k0.p(dashboardEvent, "$event");
        d.M.invoke(dashboardEvent);
    }
    
    private static final void q(final DashboardEvent dashboardEvent, final o0 o0, final d d, final List list) {
        k0.p(dashboardEvent, "$event");
        k0.p(o0, "$holder");
        k0.p(d, "this$0");
        final t sectionLocalDate = dashboardEvent.sectionLocalDate();
        final List<ReminderSubtype> l = v.L(ReminderSubtype.OneDay, ReminderSubtype.ThreeDays, ReminderSubtype.OneWeek, ReminderSubtype.TwoWeeks);
        final ArrayList<ReminderSubtype> list2 = new ArrayList<ReminderSubtype>();
        for (final ReminderSubtype next : l) {
            if (ReminderSubtypeKt.isAvailable$default(next, sectionLocalDate, null, 2, null)) {
                list2.add(next);
            }
        }
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.sx)).setVisibility(h.U(list2.isEmpty() ^ true, 0, 1, null));
        k0.o(list, "reminders");
        final ArrayList<Reminder> list3 = new ArrayList<Reminder>();
        for (final Reminder next2 : list) {
            if (ReminderSubtypeKt.isAvailable$default(next2.getSourceSubType(), sectionLocalDate, null, 2, null)) {
                list3.add(next2);
            }
        }
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.sx)).setBackground(d.m(list3));
    }
    
    private static final void r(final d d, final DashboardEvent dashboardEvent, final View view) {
        k0.p(d, "this$0");
        k0.p(dashboardEvent, "$event");
        d.L.invoke(dashboardEvent);
    }
    
    private final boolean t(final DashboardEvent dashboardEvent) {
        final EntityType j = this.J;
        return j != EntityType.STUDENT && j != EntityType.CLASS;
    }
    
    public int getItemCount() {
        return this.P.size();
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    public final void l(@f final Child i) {
        this.I = i;
        this.k();
        this.notifyDataSetChanged();
    }
    
    public void o(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final DashboardEvent dashboardEvent = this.P.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Hx)).setText((CharSequence)dashboardEvent.getTitle());
        final AppCompatImageView appCompatImageView = (AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Ax);
        final ReminderType eventType = dashboardEvent.getEventType();
        final Context requireContext = this.G.requireContext();
        k0.o(requireContext, "fragment.requireContext()");
        appCompatImageView.setImageDrawable(ReminderTypeKt.getDrawable(eventType, requireContext));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.tx)).setVisibility(h.U(this.t(dashboardEvent) && this.I == null && (s.U1((CharSequence)dashboardEvent.getEntityTitle()) ^ true), 0, 1, null));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.ux)).setText((CharSequence)h.N(dashboardEvent.getEntityTitle(), "|", this.Q));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.vx)).setVisibility(h.U(this.J == EntityType.TEACHER, 0, 1, null));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.wx)).setText((CharSequence)dashboardEvent.getClassesTitle());
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.yx)).setText((CharSequence)com.untis.mobile.utils.d0.n(dashboardEvent.getInterval()));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Gx)).setText((CharSequence)com.untis.mobile.utils.d0.s(dashboardEvent.getInterval()));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Fx)).setVisibility(h.U(dashboardEvent.getEventType() == ReminderType.DashboardUpcomingExam, 0, 1, null));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Cx)).setText((CharSequence)dashboardEvent.getSubject());
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Bx)).setVisibility(h.U(s.U1((CharSequence)dashboardEvent.getSubject()) ^ true, 0, 1, null));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Ex)).setText((CharSequence)dashboardEvent.getText());
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Dx)).setVisibility(h.U(s.U1((CharSequence)dashboardEvent.getText()) ^ true, 0, 1, null));
        final View itemView = o0.itemView;
        final int rx = com.untis.mobile.c.i.rx;
        ((ImageView)itemView.findViewById(rx)).setVisibility(h.U(dashboardEvent.getAttachments().isEmpty() ^ true, 0, 1, null));
        ((ImageView)o0.itemView.findViewById(rx)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.events.a(this, dashboardEvent));
        if (this.K) {
            ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.sx)).setVisibility(8);
        }
        else {
            this.n().observeFor(dashboardEvent.getProfileId(), dashboardEvent.getEventType(), dashboardEvent.getEventId()).j((y)this.G, (l0)new com.untis.mobile.dashboard.ui.option.events.c(dashboardEvent, o0, this));
        }
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.qx)).setVisibility(h.U(dashboardEvent.getDone(), 0, 1, null));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.sx)).setOnClickListener((View$OnClickListener)new b(this, dashboardEvent));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.zx)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 s(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.O.inflate(2131493192, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_upcoming_event, parent, false)");
        return new o0(inflate);
    }
}
