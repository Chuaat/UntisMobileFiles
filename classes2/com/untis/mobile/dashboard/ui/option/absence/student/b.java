// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.absence.student;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardExcuse;
import org.joda.time.r;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.text.s;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.d0;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsenceKt;
import com.untis.mobile.persistence.models.masterdata.Student;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import java.util.Iterator;
import java.util.ArrayList;
import android.view.View;
import kotlin.jvm.internal.w;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Child;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import java.util.List;
import com.untis.mobile.services.masterdata.a;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BR\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00109\u001a\u000206\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e\u0012\u0006\u00105\u001a\u000202\u0012!\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u000e0:¢\u0006\u0004\b>\u0010?J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u001c\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u0016\u0010 \u001a\u00020\u000e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001eR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\"R\u001e\u0010-\u001a\n **\u0004\u0018\u00010)0)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006@" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/absence/student/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "absence", "", "m", "", "excused", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "excuseStatus", "l", "Landroid/graphics/drawable/Drawable;", "k", "Lkotlin/j2;", "i", "Landroid/view/ViewGroup;", "parent", "", "viewType", "p", "getItemCount", "holder", "position", "n", "", "j", "Lcom/untis/mobile/persistence/models/profile/Child;", "child", "q", "", "newStudentAbsences", "r", "c", "Ljava/util/List;", "studentAbsences", "g", "Lcom/untis/mobile/persistence/models/profile/Child;", "filterChild", "h", "filtered", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/models/EntityType;", "d", "Lcom/untis/mobile/persistence/models/EntityType;", "role", "Lcom/untis/mobile/services/masterdata/a;", "b", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onEdit", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/services/masterdata/a;Ljava/util/List;Lcom/untis/mobile/persistence/models/EntityType;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private final Context a;
    @e
    private final a b;
    @e
    private List<DashboardStudentAbsence> c;
    @e
    private final EntityType d;
    @e
    private final l<DashboardStudentAbsence, j2> e;
    private final LayoutInflater f;
    @f
    private Child g;
    @e
    private List<DashboardStudentAbsence> h;
    
    public b(@e final Context a, @e final a b, @e final List<DashboardStudentAbsence> c, @e final EntityType d, @e final l<? super DashboardStudentAbsence, j2> e) {
        k0.p(a, "context");
        k0.p(b, "masterDataService");
        k0.p(c, "studentAbsences");
        k0.p(d, "role");
        k0.p(e, "onEdit");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (l<DashboardStudentAbsence, j2>)e;
        this.f = LayoutInflater.from(a.getApplicationContext());
        this.h = v.E();
        this.i();
    }
    
    private final void i() {
        List<DashboardStudentAbsence> h;
        if (this.g == null) {
            h = v.d5((Iterable<? extends DashboardStudentAbsence>)this.c);
        }
        else {
            final List<DashboardStudentAbsence> c = this.c;
            final ArrayList<DashboardStudentAbsence> list = new ArrayList<DashboardStudentAbsence>();
            for (final Comparable<? super T> next : c) {
                final long studentId = ((DashboardStudentAbsence)next).getStudentId();
                final Child g = this.g;
                boolean b = false;
                if (g != null) {
                    if (studentId == g.getId()) {
                        b = true;
                    }
                }
                if (b) {
                    list.add((T)next);
                }
            }
            h = (List<DashboardStudentAbsence>)v.d5((Iterable<? extends Comparable>)list);
        }
        this.h = h;
        this.notifyDataSetChanged();
    }
    
    private final Drawable k(boolean excused, final ExcuseStatus excuseStatus) {
        if (excuseStatus != null) {
            excused = excuseStatus.getExcused();
        }
        Context context;
        int n;
        if (excused) {
            context = this.a;
            n = 2131231088;
        }
        else {
            context = this.a;
            n = 2131231166;
        }
        return androidx.core.content.d.i(context, n);
    }
    
    private final String l(final boolean b, final ExcuseStatus excuseStatus) {
        if (excuseStatus != null) {
            return excuseStatus.getDisplayName();
        }
        String s;
        String s2;
        if (b) {
            s = this.a.getString(2131886318);
            s2 = "{\n            context.getString(R.string.infocenter_excused_text)\n        }";
        }
        else {
            s = this.a.getString(2131886335);
            s2 = "{\n            context.getString(R.string.infocenter_unexcused_text)\n        }";
        }
        k0.o(s, s2);
        return s;
    }
    
    private final String m(final DashboardStudentAbsence dashboardStudentAbsence) {
        final Student v = this.b.V(dashboardStudentAbsence.getStudentId());
        String displayableTitle;
        if (v == null) {
            displayableTitle = null;
        }
        else {
            displayableTitle = v.getDisplayableTitle();
        }
        return displayableTitle;
    }
    
    private static final void o(final b b, final DashboardStudentAbsence dashboardStudentAbsence, final View view) {
        k0.p(b, "this$0");
        k0.p(dashboardStudentAbsence, "$absence");
        b.e.invoke(dashboardStudentAbsence);
    }
    
    public int getItemCount() {
        return this.h.size();
    }
    
    public final long j() {
        final Child g = this.g;
        long id;
        if (g == null) {
            id = 0L;
        }
        else {
            id = g.getId();
        }
        return id;
    }
    
    public void n(@e final o0 o0, int n) {
        k0.p(o0, "holder");
        final DashboardStudentAbsence dashboardStudentAbsence = this.h.get(n);
        final r interval = DashboardStudentAbsenceKt.interval(dashboardStudentAbsence);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.px)).setText((CharSequence)d0.n(interval));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.ox)).setText((CharSequence)d0.s(interval));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.kx)).setVisibility(com.untis.mobile.utils.extension.h.U(this.g == null && this.d != EntityType.STUDENT, 0, 1, null));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.lx)).setText((CharSequence)this.m(dashboardStudentAbsence));
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)o0.itemView.findViewById(com.untis.mobile.c.i.ix);
        final String reasonTitle = dashboardStudentAbsence.getReasonTitle();
        if (reasonTitle != null && !s.U1((CharSequence)reasonTitle)) {
            n = 0;
        }
        else {
            n = 1;
        }
        ((ViewGroup)linearLayoutCompat).setVisibility(com.untis.mobile.utils.extension.h.U((boolean)((n ^ 0x1) != 0x0), 0, 1, null));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.jx)).setText((CharSequence)dashboardStudentAbsence.getReasonTitle());
        final a b = this.b;
        final DashboardExcuse excuse = dashboardStudentAbsence.getExcuse();
        long statusId;
        if (excuse == null) {
            statusId = 0L;
        }
        else {
            statusId = excuse.getStatusId();
        }
        final ExcuseStatus c = b.c(statusId);
        ((AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.gx)).setImageDrawable(this.k(dashboardStudentAbsence.getExcused(), c));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.hx)).setText((CharSequence)this.l(dashboardStudentAbsence.getExcused(), c));
        final LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat)o0.itemView.findViewById(com.untis.mobile.c.i.mx);
        final String text = dashboardStudentAbsence.getText();
        if (text != null && !s.U1((CharSequence)text)) {
            n = 0;
        }
        else {
            n = 1;
        }
        ((ViewGroup)linearLayoutCompat2).setVisibility(com.untis.mobile.utils.extension.h.U((boolean)((n ^ 0x1) != 0x0), 0, 1, null));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.nx)).setText((CharSequence)dashboardStudentAbsence.getText());
        if (dashboardStudentAbsence.getOwner()) {
            ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.dx)).setVisibility(0);
            final View itemView = o0.itemView;
            n = com.untis.mobile.c.i.ex;
            ((ViewGroup)itemView.findViewById(n)).setFocusable(true);
            ((ViewGroup)o0.itemView.findViewById(n)).setClickable(true);
            ((ViewGroup)o0.itemView.findViewById(n)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.absence.student.a(this, dashboardStudentAbsence));
        }
        else {
            ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.dx)).setVisibility(8);
            final View itemView2 = o0.itemView;
            n = com.untis.mobile.c.i.ex;
            ((ViewGroup)itemView2.findViewById(n)).setFocusable(false);
            ((ViewGroup)o0.itemView.findViewById(n)).setClickable(false);
            ((ViewGroup)o0.itemView.findViewById(n)).setOnClickListener((View$OnClickListener)null);
        }
    }
    
    @e
    public o0 p(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.f.inflate(2131493191, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_studentabsence, parent, false)");
        return new o0(inflate);
    }
    
    public final void q(@f final Child g) {
        this.g = g;
        this.i();
    }
    
    public final void r(@f final List<DashboardStudentAbsence> list) {
        List<DashboardStudentAbsence> e = list;
        if (list == null) {
            e = v.E();
        }
        this.c = e;
        this.i();
    }
}
