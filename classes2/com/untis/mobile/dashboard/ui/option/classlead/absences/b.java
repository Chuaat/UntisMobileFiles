// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.classlead.absences;

import android.widget.TextView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.d0;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardExcuse;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import android.util.LongSparseArray;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import java.util.NoSuchElementException;
import java.util.Collection;
import java.util.Iterator;
import kotlin.text.s;
import java.util.ArrayList;
import android.view.View;
import androidx.core.content.d;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import org.jetbrains.annotations.e;
import kotlin.j2;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import n6.p;
import org.jetbrains.annotations.f;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassLead;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\u0012\u0006\u0010;\u001a\u00020:\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(\u0012\u0006\u0010#\u001a\u00020\u0014\u00126\u0010@\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00120<¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010 \u001a\u00020\u0014R\u0016\u0010#\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u00100\u001a\n -*\u0004\u0018\u00010,0,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0016\u00103\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010&R\u0018\u00105\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010$R\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010*¨\u0006C" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/classlead/absences/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "absence", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassLead;", "j", "", "l", "o", "r", "", "q", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "n", "p", "Landroid/graphics/drawable/Drawable;", "m", "Lkotlin/j2;", "i", "", "t", "Landroid/view/ViewGroup;", "parent", "viewType", "w", "getItemCount", "holder", "position", "u", "filter", "k", "s", "b", "Z", "displayExcuseStatus", "Landroid/graphics/drawable/Drawable;", "unexcusedIcon", "I", "unexcusedColor", "", "a", "Ljava/util/List;", "leads", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "d", "Landroid/view/LayoutInflater;", "inflater", "excuseColor", "g", "highlightColor", "h", "excusedIcon", "e", "Ljava/lang/String;", "f", "filtered", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "lead", "onAbsence", "<init>", "(Landroid/content/Context;Ljava/util/List;ZLn6/p;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @f
    private final List<DashboardClassLead> a;
    private final boolean b;
    @e
    private final p<DashboardClassLead, DashboardStudentAbsence, j2> c;
    private final LayoutInflater d;
    @e
    private String e;
    @e
    private List<DashboardStudentAbsence> f;
    private final int g;
    @f
    private final Drawable h;
    private final int i;
    @f
    private final Drawable j;
    private final int k;
    
    public b(@e final Context context, @f final List<DashboardClassLead> a, final boolean b, @e final p<? super DashboardClassLead, ? super DashboardStudentAbsence, j2> c) {
        k0.p(context, "context");
        k0.p(c, "onAbsence");
        this.a = a;
        this.b = b;
        this.c = (p<DashboardClassLead, DashboardStudentAbsence, j2>)c;
        this.d = LayoutInflater.from(context.getApplicationContext());
        this.e = "";
        this.f = v.E();
        this.i();
        this.g = androidx.core.content.d.f(context, 2131100003);
        this.h = androidx.core.content.d.i(context, 2131231088);
        this.i = androidx.core.content.d.f(context, 2131099989);
        this.j = androidx.core.content.d.i(context, 2131231166);
        this.k = androidx.core.content.d.f(context, 2131100004);
    }
    
    private final void i() {
        final List<DashboardClassLead> a = this.a;
        Object d5 = null;
        if (a != null) {
            final ArrayList list = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)a, 10));
            final Iterator<Object> iterator = a.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getAbsences());
            }
            final List<Object> c0 = v.c0((Iterable<? extends Iterable<?>>)list);
            if (c0 != null) {
                final ArrayList<DashboardStudentAbsence> list2 = new ArrayList<DashboardStudentAbsence>();
                for (final DashboardStudentAbsence next : c0) {
                    final DashboardStudentAbsence dashboardStudentAbsence = next;
                    final String r = this.r(dashboardStudentAbsence);
                    final boolean b = false;
                    final boolean b2 = r != null && s.S2((CharSequence)r, (CharSequence)this.e, true);
                    int n = b ? 1 : 0;
                    if (b2) {
                        n = (b ? 1 : 0);
                        if (this.t(dashboardStudentAbsence)) {
                            n = 1;
                        }
                    }
                    if (n != 0) {
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
        this.f = (List<DashboardStudentAbsence>)e;
    }
    
    private final DashboardClassLead j(final DashboardStudentAbsence dashboardStudentAbsence) {
        Object o;
        if ((o = this.a) == null) {
            o = v.E();
        }
        for (final DashboardClassLead dashboardClassLead : o) {
            final List<DashboardStudentAbsence> absences = dashboardClassLead.getAbsences();
            final boolean b = absences instanceof Collection;
            final int n = 1;
            int n2 = 0;
            Label_0136: {
                if (!b || !absences.isEmpty()) {
                    final Iterator<Object> iterator2 = absences.iterator();
                    while (iterator2.hasNext()) {
                        if (iterator2.next().getId() == dashboardStudentAbsence.getId()) {
                            n2 = n;
                            break Label_0136;
                        }
                    }
                }
                n2 = 0;
            }
            if (n2 != 0) {
                return dashboardClassLead;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
    
    private final String l(final DashboardStudentAbsence dashboardStudentAbsence) {
        final List<DashboardClassLead> a = this.a;
        final String s = null;
        String displayName;
        if (a == null) {
            displayName = s;
        }
        else {
            final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)a, 10));
            final Iterator<Object> iterator = a.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getReferencedAbsenceReasons());
            }
            final ArrayList<AbsenceReason> list2 = new ArrayList<AbsenceReason>();
            final Iterator<LongSparseArray> iterator2 = (Iterator<LongSparseArray>)list.iterator();
            while (iterator2.hasNext()) {
                final AbsenceReason absenceReason = (AbsenceReason)iterator2.next().get(dashboardStudentAbsence.getReasonId());
                if (absenceReason != null) {
                    list2.add(absenceReason);
                }
            }
            final AbsenceReason absenceReason2 = v.t2((List<? extends AbsenceReason>)list2);
            if (absenceReason2 == null) {
                displayName = s;
            }
            else {
                displayName = absenceReason2.getDisplayName();
            }
        }
        return displayName;
    }
    
    private final Drawable m(final DashboardStudentAbsence dashboardStudentAbsence) {
        final ExcuseStatus n = this.n(dashboardStudentAbsence);
        boolean b = dashboardStudentAbsence.getExcused();
        if (n != null) {
            b = n.getExcused();
        }
        Drawable drawable;
        if (b) {
            drawable = this.h;
        }
        else {
            drawable = this.j;
        }
        return drawable;
    }
    
    private final ExcuseStatus n(final DashboardStudentAbsence dashboardStudentAbsence) {
        final List<DashboardClassLead> a = this.a;
        ExcuseStatus excuseStatus;
        if (a == null) {
            excuseStatus = null;
        }
        else {
            final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)a, 10));
            final Iterator<Object> iterator = a.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getReferencedExcuseStates());
            }
            final ArrayList<ExcuseStatus> list2 = new ArrayList<ExcuseStatus>();
            for (final LongSparseArray longSparseArray : list) {
                final DashboardExcuse excuse = dashboardStudentAbsence.getExcuse();
                long statusId;
                if (excuse == null) {
                    statusId = 0L;
                }
                else {
                    statusId = excuse.getStatusId();
                }
                final ExcuseStatus excuseStatus2 = (ExcuseStatus)longSparseArray.get(statusId);
                if (excuseStatus2 != null) {
                    list2.add(excuseStatus2);
                }
            }
            excuseStatus = (ExcuseStatus)v.t2((List<?>)list2);
        }
        return excuseStatus;
    }
    
    private final String o(final DashboardStudentAbsence dashboardStudentAbsence) {
        final List<DashboardClassLead> a = this.a;
        final String s = null;
        String displayableTitle;
        if (a == null) {
            displayableTitle = s;
        }
        else {
            final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)a, 10));
            final Iterator<Object> iterator = a.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getReferencedKlassen());
            }
            final ArrayList<Klasse> list2 = new ArrayList<Klasse>();
            final Iterator<LongSparseArray> iterator2 = (Iterator<LongSparseArray>)list.iterator();
            while (iterator2.hasNext()) {
                final Klasse klasse = (Klasse)iterator2.next().get(dashboardStudentAbsence.getKlassenId());
                if (klasse != null) {
                    list2.add(klasse);
                }
            }
            final Klasse klasse2 = v.t2((List<? extends Klasse>)list2);
            if (klasse2 == null) {
                displayableTitle = s;
            }
            else {
                displayableTitle = klasse2.getDisplayableTitle();
            }
        }
        return displayableTitle;
    }
    
    private final String p(final DashboardStudentAbsence dashboardStudentAbsence) {
        final ExcuseStatus n = this.n(dashboardStudentAbsence);
        if (n != null) {
            return n.getDisplayName();
        }
        return "";
    }
    
    private final int q(final DashboardStudentAbsence dashboardStudentAbsence) {
        final ExcuseStatus n = this.n(dashboardStudentAbsence);
        if (!dashboardStudentAbsence.getExcused()) {
            boolean b = false;
            if (n != null) {
                if (n.getExcused()) {
                    b = true;
                }
            }
            if (!b) {
                return this.k;
            }
        }
        return this.i;
    }
    
    private final String r(final DashboardStudentAbsence dashboardStudentAbsence) {
        final List<DashboardClassLead> a = this.a;
        final String s = null;
        String displayableTitle;
        if (a == null) {
            displayableTitle = s;
        }
        else {
            final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)a, 10));
            final Iterator<Object> iterator = a.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getReferencedStudents());
            }
            final ArrayList<Student> list2 = new ArrayList<Student>();
            final Iterator<LongSparseArray> iterator2 = (Iterator<LongSparseArray>)list.iterator();
            while (iterator2.hasNext()) {
                final Student student = (Student)iterator2.next().get(dashboardStudentAbsence.getStudentId());
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
    
    private final boolean t(final DashboardStudentAbsence dashboardStudentAbsence) {
        final boolean b = this.b;
        final ExcuseStatus n = this.n(dashboardStudentAbsence);
        Boolean value;
        if (n == null) {
            value = null;
        }
        else {
            value = n.getExcused();
        }
        boolean b2;
        if (value == null) {
            b2 = dashboardStudentAbsence.getExcused();
        }
        else {
            b2 = value;
        }
        return b == b2;
    }
    
    private static final void v(final b b, final DashboardStudentAbsence dashboardStudentAbsence, final View view) {
        k0.p(b, "this$0");
        k0.p(dashboardStudentAbsence, "$absence");
        b.c.invoke(b.j(dashboardStudentAbsence), dashboardStudentAbsence);
    }
    
    public int getItemCount() {
        return this.f.size();
    }
    
    public final void k(@e final String e) {
        k0.p(e, "filter");
        this.e = e;
        this.i();
        this.notifyDataSetChanged();
    }
    
    public final boolean s() {
        final List<DashboardClassLead> a = this.a;
        Collection<Object> c0;
        if (a == null) {
            c0 = null;
        }
        else {
            final ArrayList list = new ArrayList<List<DashboardStudentAbsence>>(v.Y((Iterable<?>)a, 10));
            final Iterator<Object> iterator = a.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getAbsences());
            }
            c0 = v.c0((Iterable<? extends Iterable<?>>)list);
        }
        final boolean b = false;
        final boolean b2 = c0 == null || c0.isEmpty();
        boolean b3 = b;
        if (!b2) {
            b3 = b;
            if (this.f.isEmpty()) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public void u(@e final o0 o0, int fv) {
        k0.p(o0, "holder");
        final DashboardStudentAbsence dashboardStudentAbsence = this.f.get(fv);
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.Jv);
        final String r = this.r(dashboardStudentAbsence);
        Object p2;
        if (r == null) {
            p2 = null;
        }
        else {
            p2 = com.untis.mobile.utils.extension.h.P(r, this.g, this.e);
        }
        ((TextView)appCompatTextView).setText((CharSequence)p2);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Iv)).setText((CharSequence)d0.o(dashboardStudentAbsence.getStart()));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Cv)).setText((CharSequence)d0.o(dashboardStudentAbsence.getEnd()));
        final String o2 = this.o(dashboardStudentAbsence);
        final String s = "";
        String text = o2;
        if (o2 == null) {
            text = "";
        }
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.zv)).setVisibility(com.untis.mobile.utils.extension.h.U(kotlin.text.s.U1((CharSequence)text) ^ true, 0, 1, null));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Av)).setText((CharSequence)text);
        String l = this.l(dashboardStudentAbsence);
        if (l == null) {
            l = s;
        }
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Gv)).setVisibility(com.untis.mobile.utils.extension.h.U(kotlin.text.s.U1((CharSequence)l) ^ true, 0, 1, null));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Hv)).setText((CharSequence)l);
        ((AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Ev)).setImageDrawable(this.m(dashboardStudentAbsence));
        final String p3 = this.p(dashboardStudentAbsence);
        final View itemView = o0.itemView;
        fv = com.untis.mobile.c.i.Fv;
        ((TextView)itemView.findViewById(fv)).setText((CharSequence)p3);
        ((TextView)o0.itemView.findViewById(fv)).setTextColor(this.q(dashboardStudentAbsence));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Dv)).setVisibility(com.untis.mobile.utils.extension.h.U(kotlin.text.s.U1((CharSequence)p3) ^ true, 0, 1, null));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Bv)).setOnClickListener((View$OnClickListener)new a(this, dashboardStudentAbsence));
    }
    
    @e
    public o0 w(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.d.inflate(2131493177, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_classlead_absence, parent, false)");
        return new o0(inflate);
    }
}
