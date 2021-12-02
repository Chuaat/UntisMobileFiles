// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.events;

import android.widget.TextView;
import android.widget.ImageView;
import android.app.Dialog;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import android.view.View$OnClickListener;
import com.untis.mobile.utils.extension.h;
import kotlin.text.s;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.d0;
import com.untis.mobile.utils.extension.q;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.c;
import android.view.ViewGroup;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d$a;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import android.content.DialogInterface;
import android.view.View;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import kotlin.jvm.internal.w;
import androidx.core.content.d;
import android.content.Context;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.f;
import android.graphics.drawable.Drawable;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.services.masterdata.a;
import android.view.LayoutInflater;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010'\u001a\u00020$¢\u0006\u0004\bJ\u0010KJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002J$\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\u0006\u0010\u001c\u001a\u00020\u0004R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u00100\u001a\n -*\u0004\u0018\u00010,0,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\"R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\"R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006L" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/events/e;", "Landroid/widget/BaseAdapter;", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "Lkotlin/j2;", "o", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "", "h", "l", "e", "Landroid/graphics/drawable/Drawable;", "k", "", "f", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "g", "getItemId", "getCount", "p", "Lcom/untis/mobile/services/classbook/a;", "O", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "R", "Landroid/graphics/drawable/Drawable;", "iconClass", "", "L", "Z", "writeRight", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "I", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "M", "Landroid/view/LayoutInflater;", "inflater", "Lcom/untis/mobile/services/timetable/placeholder/k;", "P", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "S", "iconDefault", "J", "Lcom/untis/mobile/persistence/models/EntityType;", "K", "Lcom/untis/mobile/services/masterdata/a;", "N", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Q", "iconStudent", "Lcom/untis/mobile/ui/activities/classbook/events/EventsActivity;", "G", "Lcom/untis/mobile/ui/activities/classbook/events/EventsActivity;", "context", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "H", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "(Lcom/untis/mobile/ui/activities/classbook/events/EventsActivity;Lcom/untis/mobile/persistence/models/profile/Profile;Lcom/untis/mobile/persistence/models/timetable/period/Period;Lcom/untis/mobile/persistence/models/timetable/period/Classbook;Lcom/untis/mobile/persistence/models/EntityType;JZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e extends BaseAdapter
{
    @org.jetbrains.annotations.e
    private final EventsActivity G;
    @org.jetbrains.annotations.e
    private Period H;
    @org.jetbrains.annotations.e
    private Classbook I;
    @org.jetbrains.annotations.e
    private final EntityType J;
    private final long K;
    private final boolean L;
    private final LayoutInflater M;
    @org.jetbrains.annotations.e
    private final com.untis.mobile.services.masterdata.a N;
    @org.jetbrains.annotations.e
    private final com.untis.mobile.services.classbook.a O;
    @org.jetbrains.annotations.e
    private final k P;
    @f
    private final Drawable Q;
    @f
    private final Drawable R;
    @f
    private final Drawable S;
    
    public e(@org.jetbrains.annotations.e final EventsActivity g, @org.jetbrains.annotations.e final Profile profile, @org.jetbrains.annotations.e final Period h, @org.jetbrains.annotations.e final Classbook i, @org.jetbrains.annotations.e final EntityType j, final long k, final boolean l) {
        k0.p(g, "context");
        k0.p(profile, "profile");
        k0.p(h, "period");
        k0.p(i, "classbook");
        k0.p(j, "entityType");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = LayoutInflater.from((Context)g);
        this.N = profile.getMasterDataService();
        this.O = profile.getClassBookService();
        this.P = profile.getTimeTableService();
        this.Q = d.i((Context)g, 2131231089);
        this.R = d.i((Context)g, 2131231091);
        this.S = d.i((Context)g, 2131231094);
    }
    
    private final void e(final Event event) {
        this.G.J(event);
    }
    
    private final List<Event> f() {
        final Set<Event> events = this.I.getEvents();
        final ArrayList<Event> list = new ArrayList<Event>();
        for (final Event next : events) {
            final Event event = next;
            if (this.J == EntityType.NONE || this.K <= 0L || (event.getEntityType() == this.J && event.getEntityId() == this.K)) {
                list.add(next);
            }
        }
        return list;
    }
    
    private final String h(final EntityType entityType, final long n) {
        final int n2 = a.a[entityType.ordinal()];
        final String s = "";
        String s2;
        if (n2 != 1) {
            if (n2 != 2) {
                s2 = s;
            }
            else {
                final Student v = this.N.V(n);
                if (v == null) {
                    s2 = s;
                }
                else if ((s2 = v.getDisplayName()) == null) {
                    s2 = s;
                }
            }
        }
        else {
            final Klasse n3 = this.N.N(n);
            if (n3 == null) {
                s2 = s;
            }
            else if ((s2 = n3.getDisplayName()) == null) {
                s2 = s;
            }
        }
        return s2;
    }
    
    private static final void i(final e e, final Event event, final View view) {
        k0.p(e, "this$0");
        k0.p(event, "$event");
        e.o(event);
    }
    
    private static final void j(final e e, final Event event, final View view) {
        k0.p(e, "this$0");
        k0.p(event, "$event");
        e.l(event);
    }
    
    private final Drawable k(final Event event) {
        final int n = a.a[event.getEntityType().ordinal()];
        Drawable drawable;
        if (n != 1) {
            if (n != 2) {
                drawable = this.S;
            }
            else {
                drawable = this.Q;
            }
        }
        else {
            drawable = this.R;
        }
        return drawable;
    }
    
    private final void l(final Event event) {
        final androidx.appcompat.app.d a = new d$a((Context)this.G, 2131951624).L(2131493035).r(2131886649, (DialogInterface$OnClickListener)b.G).B(2131886653, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.classbook.events.a(this, event)).a();
        k0.o(a, "Builder(context, R.style.AppDialogTheme)\n                .setView(R.layout.dialog_delete_event)\n                .setNegativeButton(R.string.shared_alert_cancel_button) { dialog, _ -> dialog.dismiss() }\n                .setPositiveButton(R.string.shared_alert_delete_button) { dialog, _ ->\n                    delete(event)\n                    dialog.dismiss()\n                }\n                .create()");
        ((Dialog)a).show();
    }
    
    private static final void m(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void n(final e e, final Event event, final DialogInterface dialogInterface, final int n) {
        k0.p(e, "this$0");
        k0.p(event, "$event");
        e.e(event);
        dialogInterface.dismiss();
    }
    
    private final void o(final Event event) {
        this.G.I(event, this.L);
    }
    
    @org.jetbrains.annotations.e
    public Event g(final int n) {
        return this.f().get(n);
    }
    
    public int getCount() {
        return this.f().size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @org.jetbrains.annotations.e
    public View getView(int n, @f final View view, @f final ViewGroup viewGroup) {
        final Event g = this.g(n);
        View inflate = view;
        if (view == null) {
            inflate = this.M.inflate(2131493206, viewGroup, false);
        }
        if (this.J == EntityType.NONE) {
            n = c.i.ny;
            ((AppCompatImageView)inflate.findViewById(n)).setImageDrawable(this.k(g));
            ((ImageView)inflate.findViewById(n)).setVisibility(0);
            ((TextView)inflate.findViewById(c.i.xy)).setText((CharSequence)this.h(g.getEntityType(), g.getEntityId()));
        }
        final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(c.i.xy);
        k0.o(appCompatTextView, "view.item_event_title");
        q.e(appCompatTextView, null, 0, 3, null);
        ((TextView)inflate.findViewById(c.i.ly)).setText((CharSequence)d0.o(g.getDateTime()));
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)inflate.findViewById(c.i.uy);
        final EventReason eventReason = g.getEventReason();
        CharSequence displayableTitle;
        if (eventReason == null) {
            displayableTitle = null;
        }
        else {
            displayableTitle = eventReason.getDisplayableTitle();
        }
        ((TextView)appCompatTextView2).setText(displayableTitle);
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)inflate.findViewById(c.i.oy);
        final EventReason eventReason2 = g.getEventReason();
        CharSequence displayableTitle2;
        if (eventReason2 == null) {
            displayableTitle2 = null;
        }
        else {
            displayableTitle2 = eventReason2.getDisplayableTitle();
        }
        if (displayableTitle2 != null && !s.U1(displayableTitle2)) {
            n = 0;
        }
        else {
            n = 1;
        }
        ((ViewGroup)linearLayoutCompat).setVisibility(h.U((boolean)((n ^ 0x1) != 0x0), 0, 1, null));
        ((TextView)inflate.findViewById(c.i.wy)).setText((CharSequence)g.getText());
        ((ViewGroup)inflate.findViewById(c.i.vy)).setVisibility(h.U(s.U1((CharSequence)g.getText()) ^ true, 0, 1, null));
        ((ImageView)inflate.findViewById(c.i.jy)).setVisibility(h.U(this.L, 0, 1, null));
        inflate.setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.events.c(this, g));
        n = c.i.iy;
        ((ImageView)inflate.findViewById(n)).setVisibility(h.U(this.L, 0, 1, null));
        ((ImageView)inflate.findViewById(n)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.events.d(this, g));
        k0.o(inflate, "view");
        return inflate;
    }
    
    public final void p() {
        Period h;
        if ((h = this.P.l(this.H.getId())) == null) {
            h = this.H;
        }
        this.H = h;
        Classbook i;
        if ((i = this.O.S(h.getId())) == null) {
            i = this.I;
        }
        this.I = i;
        this.notifyDataSetChanged();
    }
}
