// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.contacthour.detail;

import android.widget.TextView;
import android.widget.ImageView;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHourSlotState;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.d0;
import org.joda.time.l0;
import org.joda.time.r;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.c;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHourSlotStateKt;
import kotlin.collections.v;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHourSlot;
import java.util.List;
import android.view.View;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import n6.l;
import kotlin.j2;
import n6.p;
import org.jetbrains.annotations.f;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bv\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00126\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u001b\u0012!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\u001f¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006#" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/contacthour/detail/h;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "m", "getItemCount", "holder", "position", "Lkotlin/j2;", "j", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "contactHour", "n", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "e", "Landroid/view/LayoutInflater;", "inflater", "b", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "onRegister", "Lkotlin/Function1;", "onUnregister", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;Ln6/p;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends RecyclerView$h<o0>
{
    @e
    private final Context a;
    @f
    private DashboardContactHour b;
    @e
    private final p<DashboardContactHour, Integer, j2> c;
    @e
    private final l<DashboardContactHour, j2> d;
    private final LayoutInflater e;
    
    public h(@e final Context a, @f final DashboardContactHour b, @e final p<? super DashboardContactHour, ? super Integer, j2> c, @e final l<? super DashboardContactHour, j2> d) {
        k0.p(a, "context");
        k0.p(c, "onRegister");
        k0.p(d, "onUnregister");
        this.a = a;
        this.b = b;
        this.c = (p<DashboardContactHour, Integer, j2>)c;
        this.d = (l<DashboardContactHour, j2>)d;
        this.e = LayoutInflater.from(a.getApplicationContext());
    }
    
    private static final void k(final h h, final int i, final View view) {
        k0.p(h, "this$0");
        final p<DashboardContactHour, Integer, j2> c = h.c;
        final DashboardContactHour b = h.b;
        if (b == null) {
            return;
        }
        c.invoke(b, i);
    }
    
    private static final void l(final h h, final View view) {
        k0.p(h, "this$0");
        final l<DashboardContactHour, j2> d = h.d;
        final DashboardContactHour b = h.b;
        if (b == null) {
            return;
        }
        d.invoke(b);
    }
    
    public int getItemCount() {
        final DashboardContactHour b = this.b;
        int size = 0;
        if (b != null) {
            final List<DashboardContactHourSlot> slots = b.getSlots();
            if (slots != null) {
                size = slots.size();
            }
        }
        return size;
    }
    
    public void j(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final DashboardContactHour b = this.b;
        List<DashboardContactHourSlot> slots;
        if (b == null) {
            slots = null;
        }
        else {
            slots = b.getSlots();
        }
        List<DashboardContactHourSlot> e = slots;
        if (slots == null) {
            e = v.E();
        }
        final DashboardContactHourSlot dashboardContactHourSlot = e.get(n);
        final int color = DashboardContactHourSlotStateKt.getColor(dashboardContactHourSlot.getState(), this.a);
        final View itemView = o0.itemView;
        final int pw = com.untis.mobile.c.i.pw;
        ((AppCompatImageView)itemView.findViewById(pw)).setImageDrawable(DashboardContactHourSlotStateKt.getIcon(dashboardContactHourSlot.getState(), this.a));
        ((ImageView)o0.itemView.findViewById(pw)).setColorFilter(color);
        final View itemView2 = o0.itemView;
        final int rw = com.untis.mobile.c.i.rw;
        ((TextView)itemView2.findViewById(rw)).setText((CharSequence)DashboardContactHourSlotStateKt.getTitle(dashboardContactHourSlot.getState(), this.a));
        ((TextView)o0.itemView.findViewById(rw)).setTextColor(color);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.tw)).setText((CharSequence)d0.s(new r((l0)dashboardContactHourSlot.getStart().u0(), (l0)dashboardContactHourSlot.getEnd().u0())));
        final int n2 = h.a.a[dashboardContactHourSlot.getState().ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.ow)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.detail.f(this));
                }
            }
            else {
                ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.ow)).setOnClickListener((View$OnClickListener)null);
            }
        }
        else {
            ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.ow)).setOnClickListener((View$OnClickListener)new g(this, n));
        }
    }
    
    @e
    public o0 m(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.e.inflate(2131493182, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_contacthourslot, parent, false)");
        return new o0(inflate);
    }
    
    public final void n(@e final DashboardContactHour b) {
        k0.p(b, "contactHour");
        this.b = b;
        this.notifyDataSetChanged();
    }
}
