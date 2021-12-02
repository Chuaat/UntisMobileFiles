// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.classlead.absences;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardExcuse;
import com.untis.mobile.utils.extension.a;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.p;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import java.util.List;
import org.jetbrains.annotations.e;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B]\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00126\u0010!\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006$" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/classlead/absences/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "k", "getItemCount", "holder", "position", "Lkotlin/j2;", "i", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "a", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "absence", "", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "b", "Ljava/util/List;", "states", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "d", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "status", "onExcuse", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;Ljava/util/List;Ln6/p;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d extends RecyclerView$h<o0>
{
    @e
    private final DashboardStudentAbsence a;
    @e
    private final List<ExcuseStatus> b;
    @e
    private final p<DashboardStudentAbsence, ExcuseStatus, j2> c;
    private final LayoutInflater d;
    
    public d(@e final Context context, @e final DashboardStudentAbsence a, @e final List<ExcuseStatus> b, @e final p<? super DashboardStudentAbsence, ? super ExcuseStatus, j2> c) {
        k0.p(context, "context");
        k0.p(a, "absence");
        k0.p(b, "states");
        k0.p(c, "onExcuse");
        this.a = a;
        this.b = b;
        this.c = (p<DashboardStudentAbsence, ExcuseStatus, j2>)c;
        this.d = LayoutInflater.from(context.getApplicationContext());
    }
    
    private static final void j(final d d, final ExcuseStatus excuseStatus, final View view) {
        k0.p(d, "this$0");
        k0.p(excuseStatus, "$status");
        d.c.invoke(d.a, excuseStatus);
    }
    
    public int getItemCount() {
        return this.b.size();
    }
    
    public void i(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final ExcuseStatus excuseStatus = this.b.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Yv)).setText((CharSequence)excuseStatus.getName());
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Xv)).setText((CharSequence)excuseStatus.getLongName());
        final AppCompatImageView appCompatImageView = (AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Wv);
        final long id = excuseStatus.getId();
        final DashboardExcuse excuse = this.a.getExcuse();
        ((ImageView)appCompatImageView).setVisibility(h.U(excuse != null && id == excuse.getStatusId(), 0, 1, null));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Uv)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.classlead.absences.c(this, excuseStatus));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Vv)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 k(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.d.inflate(2131493179, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_classlead_excuse, parent, false)");
        return new o0(inflate);
    }
}
