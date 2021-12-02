// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.parentday;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayAppointment;
import org.joda.time.r;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.d0;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayKt;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.text.s;
import android.view.View;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import java.util.List;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BJ\u0012\u0006\u0010#\u001a\u00020 \u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u000f0)¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0014\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011R(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010(\u001a\n %*\u0004\u0018\u00010$0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006/" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/parentday/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;", "parentDay", "", "i", "Landroid/view/ViewGroup;", "parent", "", "viewType", "n", "getItemCount", "holder", "position", "Lkotlin/j2;", "l", "", "days", "p", "b", "Ljava/util/List;", "j", "()Ljava/util/List;", "o", "(Ljava/util/List;)V", "", "c", "Z", "k", "()Z", "isTeacher", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "e", "Landroid/view/LayoutInflater;", "inflater", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onParentDay", "<init>", "(Landroid/content/Context;Ljava/util/List;ZLn6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private final Context a;
    @e
    private List<DashboardParentDay> b;
    private final boolean c;
    @e
    private final l<DashboardParentDay, j2> d;
    private final LayoutInflater e;
    
    public b(@e final Context a, @e final List<DashboardParentDay> b, final boolean c, @e final l<? super DashboardParentDay, j2> d) {
        k0.p(a, "context");
        k0.p(b, "days");
        k0.p(d, "onParentDay");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (l<DashboardParentDay, j2>)d;
        this.e = LayoutInflater.from(a.getApplicationContext());
    }
    
    private final String i(final DashboardParentDay dashboardParentDay) {
        Object o;
        if ((o = dashboardParentDay.getAppointments()) == null) {
            o = v.E();
        }
        String s;
        String s2;
        if (((List)o).isEmpty()) {
            Context context;
            int n;
            if (this.c) {
                context = this.a;
                n = 2131886326;
            }
            else {
                context = this.a;
                n = 2131886325;
            }
            s = context.getString(n);
            s2 = "{\n                if (isTeacher) {\n                    context.getString(R.string.infocenter_noTeacherParentDayAppointments_text)\n                } else {\n                    context.getString(R.string.infocenter_noParentParentDayAppointments_text)\n                }\n            }";
        }
        else {
            if (((List)o).size() != 1) {
                final String string = this.a.getString(2131886489);
                k0.o(string, "context.getString(R.string.parentDays_xAppointment_text)");
                s = kotlin.text.s.k2(string, "{0}", String.valueOf(((List)o).size()), false, 4, (Object)null);
                return s;
            }
            s = this.a.getString(2131886488);
            s2 = "{\n                context.getString(R.string.parentDays_oneAppointment_text)\n            }";
        }
        k0.o(s, s2);
        return s;
    }
    
    private static final void m(final b b, final DashboardParentDay dashboardParentDay, final View view) {
        k0.p(b, "this$0");
        k0.p(dashboardParentDay, "$day");
        b.d.invoke(dashboardParentDay);
    }
    
    public int getItemCount() {
        return this.b.size();
    }
    
    @e
    public final List<DashboardParentDay> j() {
        return this.b;
    }
    
    public final boolean k() {
        return this.c;
    }
    
    public void l(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final DashboardParentDay dashboardParentDay = this.b.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.cx)).setText((CharSequence)dashboardParentDay.getName());
        final r interval = DashboardParentDayKt.interval(dashboardParentDay);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Xw)).setText((CharSequence)d0.n(interval));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.bx)).setText((CharSequence)d0.s(interval));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.ax)).setText((CharSequence)this.i(dashboardParentDay));
        final List<DashboardParentDayAppointment> appointments = dashboardParentDay.getAppointments();
        if (appointments == null || appointments.isEmpty()) {
            ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Ww)).setOnClickListener((View$OnClickListener)null);
        }
        else {
            ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Ww)).setOnClickListener((View$OnClickListener)new a(this, dashboardParentDay));
        }
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Yw)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 n(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.e.inflate(2131493187, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_parentday, parent, false)");
        return new o0(inflate);
    }
    
    public final void o(@e final List<DashboardParentDay> b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void p(@e final List<DashboardParentDay> b) {
        k0.p(b, "days");
        this.b = b;
        this.notifyDataSetChanged();
    }
}
