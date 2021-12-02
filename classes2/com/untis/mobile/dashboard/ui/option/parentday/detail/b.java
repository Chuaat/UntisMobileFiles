// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.parentday.detail;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View;
import android.view.ViewGroup;
import org.joda.time.r;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.d0;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayKt;
import kotlin.jvm.internal.k0;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayAppointmentBlock;
import java.util.List;
import android.view.LayoutInflater;
import org.joda.time.t;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010'\u001a\n $*\u0004\u0018\u00010#0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "j", "getItemCount", "holder", "position", "Lkotlin/j2;", "i", "Lorg/joda/time/t;", "date", "h", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;", "b", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;", "parentDay", "c", "Lorg/joda/time/t;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointmentBlock;", "f", "Ljava/util/List;", "appointments", "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;", "d", "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;", "dashboardParentDayContext", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "e", "Landroid/view/LayoutInflater;", "inflater", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;Lorg/joda/time/t;Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private final Context a;
    @e
    private final DashboardParentDay b;
    @e
    private t c;
    @e
    private final c d;
    private final LayoutInflater e;
    @e
    private List<DashboardParentDayAppointmentBlock> f;
    
    public b(@e final Context a, @e final DashboardParentDay b, @e final t c, @e final c d) {
        k0.p(a, "context");
        k0.p(b, "parentDay");
        k0.p(c, "date");
        k0.p(d, "dashboardParentDayContext");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = LayoutInflater.from(a.getApplicationContext());
        this.f = DashboardParentDayKt.getAppointmentBlocksBy(b, this.c);
    }
    
    public int getItemCount() {
        return this.f.size();
    }
    
    public final void h(@e final t c) {
        k0.p(c, "date");
        this.c = c;
        this.f = DashboardParentDayKt.getAppointmentBlocksBy(this.b, c);
        this.notifyDataSetChanged();
    }
    
    public void i(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final DashboardParentDayAppointmentBlock dashboardParentDayAppointmentBlock = this.f.get(n);
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.Vw);
        final r beforeFree = dashboardParentDayAppointmentBlock.getBeforeFree();
        CharSequence s;
        if (beforeFree == null) {
            s = null;
        }
        else {
            s = d0.s(beforeFree);
        }
        ((TextView)appCompatTextView).setText(s);
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Tw)).setVisibility(h.U(dashboardParentDayAppointmentBlock.getBeforeFree() != null, 0, 1, null));
        ((RecyclerView)o0.itemView.findViewById(com.untis.mobile.c.i.Uw)).setAdapter((RecyclerView$h)new a(this.a, dashboardParentDayAppointmentBlock.getAppointments(), this.d));
    }
    
    @e
    public o0 j(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.e.inflate(2131493190, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_parentday_block, parent, false)");
        return new o0(inflate);
    }
}
