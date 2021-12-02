// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.classlead.events;

import android.widget.TextView;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.d0;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import java.util.Collection;
import kotlin.text.s;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import android.util.LongSparseArray;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.core.content.d;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassbookEvent;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassLead;
import java.util.List;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00105\u001a\u000202\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\"¢\u0006\u0004\b8\u00109J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\tJ\u0006\u0010\u001c\u001a\u00020\u000fR\u001e\u0010!\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\u0018\u0010*\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0016\u0010-\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006:" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/classlead/events/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassbookEvent;", "event", "Landroid/graphics/drawable/Drawable;", "l", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "j", "", "k", "n", "m", "Lkotlin/j2;", "h", "", "r", "Landroid/view/ViewGroup;", "parent", "", "viewType", "q", "getItemCount", "holder", "position", "p", "filter", "i", "o", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "inflater", "", "e", "Ljava/util/List;", "filtered", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassLead;", "b", "leads", "Landroid/graphics/drawable/Drawable;", "studentIcon", "f", "I", "highlightColor", "g", "classIcon", "d", "Ljava/lang/String;", "Lcom/untis/mobile/persistence/models/EntityType;", "a", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/persistence/models/EntityType;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends RecyclerView$h<o0>
{
    @e
    private final EntityType a;
    @f
    private final List<DashboardClassLead> b;
    private final LayoutInflater c;
    @e
    private String d;
    @e
    private List<DashboardClassbookEvent> e;
    private final int f;
    @f
    private final Drawable g;
    @f
    private final Drawable h;
    
    public a(@e final Context context, @e final EntityType a, @f final List<DashboardClassLead> b) {
        k0.p(context, "context");
        k0.p(a, "entityType");
        this.a = a;
        this.b = b;
        this.c = LayoutInflater.from(context.getApplicationContext());
        this.d = "";
        this.e = v.E();
        this.f = androidx.core.content.d.f(context, 2131100003);
        this.g = androidx.core.content.d.i(context, 2131231091);
        this.h = androidx.core.content.d.i(context, 2131231089);
        this.h();
    }
    
    private final void h() {
        final List<DashboardClassLead> b = this.b;
        Object d5 = null;
        if (b != null) {
            final ArrayList list = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)b, 10));
            final Iterator<Object> iterator = b.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getEvents());
            }
            final List<Object> c0 = v.c0((Iterable<? extends Iterable<?>>)list);
            if (c0 != null) {
                final ArrayList<DashboardClassbookEvent> list2 = new ArrayList<DashboardClassbookEvent>();
                for (final DashboardClassbookEvent next : c0) {
                    if (this.r(next)) {
                        list2.add(next);
                    }
                }
                d5 = v.d5((Iterable<? extends Comparable>)list2);
            }
        }
        Object e = d5;
        if (d5 == null) {
            e = v.E();
        }
        this.e = (List<DashboardClassbookEvent>)e;
    }
    
    private final EventReason j(final DashboardClassbookEvent dashboardClassbookEvent) {
        final List<DashboardClassLead> b = this.b;
        EventReason eventReason;
        if (b == null) {
            eventReason = null;
        }
        else {
            final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)b, 10));
            final Iterator<Object> iterator = b.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getReferencedEventReasons());
            }
            final ArrayList<EventReason> list2 = new ArrayList<EventReason>();
            final Iterator<LongSparseArray> iterator2 = (Iterator<LongSparseArray>)list.iterator();
            while (iterator2.hasNext()) {
                final EventReason eventReason2 = (EventReason)iterator2.next().get(dashboardClassbookEvent.getReasonId());
                if (eventReason2 != null) {
                    list2.add(eventReason2);
                }
            }
            eventReason = (EventReason)v.t2((List<?>)list2);
        }
        return eventReason;
    }
    
    private final String k(final DashboardClassbookEvent dashboardClassbookEvent) {
        final int n = com.untis.mobile.dashboard.ui.option.classlead.events.a.a.a[dashboardClassbookEvent.getEntityType().ordinal()];
        String s;
        if (n != 1) {
            if (n != 2) {
                s = "n/a";
            }
            else {
                s = this.m(dashboardClassbookEvent);
            }
        }
        else {
            s = this.n(dashboardClassbookEvent);
        }
        return s;
    }
    
    private final Drawable l(final DashboardClassbookEvent dashboardClassbookEvent) {
        final int n = com.untis.mobile.dashboard.ui.option.classlead.events.a.a.a[dashboardClassbookEvent.getEntityType().ordinal()];
        Drawable drawable;
        if (n != 1) {
            if (n != 2) {
                drawable = null;
            }
            else {
                drawable = this.g;
            }
        }
        else {
            drawable = this.h;
        }
        return drawable;
    }
    
    private final String m(final DashboardClassbookEvent dashboardClassbookEvent) {
        final List<DashboardClassLead> b = this.b;
        final String s = null;
        String displayableDescription;
        if (b == null) {
            displayableDescription = s;
        }
        else {
            final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)b, 10));
            final Iterator<Object> iterator = b.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getReferencedKlassen());
            }
            final ArrayList<Klasse> list2 = new ArrayList<Klasse>();
            for (final LongSparseArray longSparseArray : list) {
                final Long klassenId = dashboardClassbookEvent.getKlassenId();
                long longValue;
                if (klassenId == null) {
                    longValue = 0L;
                }
                else {
                    longValue = klassenId;
                }
                final Klasse klasse = (Klasse)longSparseArray.get(longValue);
                if (klasse != null) {
                    list2.add(klasse);
                }
            }
            final Klasse klasse2 = v.t2((List<? extends Klasse>)list2);
            if (klasse2 == null) {
                displayableDescription = s;
            }
            else {
                displayableDescription = klasse2.getDisplayableDescription();
            }
        }
        return displayableDescription;
    }
    
    private final String n(final DashboardClassbookEvent dashboardClassbookEvent) {
        final List<DashboardClassLead> b = this.b;
        final String s = null;
        String displayableTitle;
        if (b == null) {
            displayableTitle = s;
        }
        else {
            final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)b, 10));
            final Iterator<Object> iterator = b.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getReferencedStudents());
            }
            final ArrayList<Student> list2 = new ArrayList<Student>();
            final Iterator<LongSparseArray> iterator2 = (Iterator<LongSparseArray>)list.iterator();
            while (iterator2.hasNext()) {
                final Student student = (Student)iterator2.next().get(dashboardClassbookEvent.getEntityId());
                if (student != null) {
                    list2.add(student);
                }
            }
            final Student student2 = v.t2((List<? extends Student>)list2);
            if (student2 == null) {
                displayableTitle = s;
            }
            else {
                displayableTitle = student2.getDisplayableTitle();
            }
        }
        return displayableTitle;
    }
    
    private final boolean r(final DashboardClassbookEvent dashboardClassbookEvent) {
        final EntityType entityType = dashboardClassbookEvent.getEntityType();
        final EntityType a = this.a;
        boolean b = false;
        if (entityType != a) {
            return false;
        }
        if (s.S2((CharSequence)dashboardClassbookEvent.getText(), (CharSequence)this.d, true)) {
            return true;
        }
        final EventReason j = this.j(dashboardClassbookEvent);
        if (j != null && s.S2((CharSequence)j.getDisplayableDescription(), (CharSequence)this.d, true)) {
            return true;
        }
        final int n = com.untis.mobile.dashboard.ui.option.classlead.events.a.a.a[dashboardClassbookEvent.getEntityType().ordinal()];
        if (n != 1) {
            if (n != 2) {
                return b;
            }
            final String m = this.m(dashboardClassbookEvent);
            if (m == null) {
                return b;
            }
            if (!s.S2((CharSequence)m, (CharSequence)this.d, true)) {
                return b;
            }
        }
        else {
            final String n2 = this.n(dashboardClassbookEvent);
            if (n2 == null) {
                return b;
            }
            if (!s.S2((CharSequence)n2, (CharSequence)this.d, true)) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public int getItemCount() {
        return this.e.size();
    }
    
    public final void i(@e final String d) {
        k0.p(d, "filter");
        this.d = d;
        this.h();
        this.notifyDataSetChanged();
    }
    
    public final boolean o() {
        final List<DashboardClassLead> b = this.b;
        Collection<Object> c0;
        if (b == null) {
            c0 = null;
        }
        else {
            final ArrayList list = new ArrayList<List<DashboardClassbookEvent>>(v.Y((Iterable<?>)b, 10));
            final Iterator<Object> iterator = b.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getEvents());
            }
            c0 = v.c0((Iterable<? extends Iterable<?>>)list);
        }
        final boolean b2 = false;
        final boolean b3 = c0 == null || c0.isEmpty();
        boolean b4 = b2;
        if (!b3) {
            b4 = b2;
            if (this.e.isEmpty()) {
                b4 = true;
            }
        }
        return b4;
    }
    
    public void p(@e final o0 o0, int n) {
        k0.p(o0, "holder");
        final DashboardClassbookEvent dashboardClassbookEvent = this.e.get(n);
        ((AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Mv)).setImageDrawable(this.l(dashboardClassbookEvent));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.Tv);
        final String k = this.k(dashboardClassbookEvent);
        Object p2;
        if (k == null) {
            p2 = null;
        }
        else {
            p2 = com.untis.mobile.utils.extension.h.P(k, this.f, this.d);
        }
        ((TextView)appCompatTextView).setText((CharSequence)p2);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Lv)).setText((CharSequence)d0.o(dashboardClassbookEvent.getDateTime()));
        final List<DashboardClassLead> b = this.b;
        if (b == null) {
            n = 0;
        }
        else {
            n = b.size();
        }
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Nv)).setVisibility(com.untis.mobile.utils.extension.h.U(dashboardClassbookEvent.getEntityType() == EntityType.STUDENT && n > 1, 0, 1, null));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Ov)).setText((CharSequence)this.m(dashboardClassbookEvent));
        final View itemView = o0.itemView;
        n = com.untis.mobile.c.i.Qv;
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)itemView.findViewById(n);
        final EventReason j = this.j(dashboardClassbookEvent);
        Object p3 = null;
        Label_0286: {
            if (j != null) {
                final String displayableDescription = j.getDisplayableDescription();
                if (displayableDescription != null) {
                    p3 = com.untis.mobile.utils.extension.h.P(displayableDescription, this.f, this.d);
                    break Label_0286;
                }
            }
            p3 = null;
        }
        ((TextView)appCompatTextView2).setText((CharSequence)p3);
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)o0.itemView.findViewById(com.untis.mobile.c.i.Pv);
        final CharSequence text = ((AppCompatTextView)o0.itemView.findViewById(n)).getText();
        if (text != null && !s.U1(text)) {
            n = 0;
        }
        else {
            n = 1;
        }
        ((ViewGroup)linearLayoutCompat).setVisibility(com.untis.mobile.utils.extension.h.U((boolean)((n ^ 0x1) != 0x0), 0, 1, null));
        final View itemView2 = o0.itemView;
        n = com.untis.mobile.c.i.Sv;
        ((TextView)itemView2.findViewById(n)).setText((CharSequence)com.untis.mobile.utils.extension.h.P(dashboardClassbookEvent.getText(), this.f, this.d));
        final LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat)o0.itemView.findViewById(com.untis.mobile.c.i.Rv);
        final CharSequence text2 = ((AppCompatTextView)o0.itemView.findViewById(n)).getText();
        if (text2 != null && !s.U1(text2)) {
            n = 0;
        }
        else {
            n = 1;
        }
        ((ViewGroup)linearLayoutCompat2).setVisibility(com.untis.mobile.utils.extension.h.U((boolean)((n ^ 0x1) != 0x0), 0, 1, null));
    }
    
    @e
    public o0 q(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.c.inflate(2131493178, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_classlead_event, parent, false)");
        return new o0(inflate);
    }
}
