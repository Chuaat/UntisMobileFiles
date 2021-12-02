// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.absence.student.filter;

import android.widget.TextView;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View;
import kotlin.collections.m;
import kotlin.jvm.internal.k0;
import java.util.List;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import com.untis.mobile.ui.adapters.infocenter.a;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B:\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0017\u0012!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000b0\u001e¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001e\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006$" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/absence/student/filter/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "k", "getItemCount", "holder", "position", "Lkotlin/j2;", "i", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "d", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "", "Lcom/untis/mobile/ui/adapters/infocenter/a;", "e", "Ljava/util/List;", "dateRanges", "b", "Lcom/untis/mobile/ui/adapters/infocenter/a;", "dateRange", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onDateRange", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/ui/adapters/infocenter/a;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private final Context a;
    @e
    private a b;
    @e
    private final l<a, j2> c;
    private final LayoutInflater d;
    @e
    private final List<a> e;
    
    public b(@e final Context a, @e final a b, @e final l<? super a, j2> c) {
        k0.p(a, "context");
        k0.p(b, "dateRange");
        k0.p(c, "onDateRange");
        this.a = a;
        this.b = b;
        this.c = (l<a, j2>)c;
        this.d = LayoutInflater.from(a.getApplicationContext());
        this.e = m.ey(com.untis.mobile.ui.adapters.infocenter.a.values());
    }
    
    private static final void j(final b b, final a b2, final o0 o0, final View view) {
        k0.p(b, "this$0");
        k0.p(b2, "$dateRange");
        k0.p(o0, "$holder");
        final a b3 = b.b;
        b.b = b2;
        b.notifyItemChanged(b.e.indexOf(b3));
        ((ImageView)o0.itemView.findViewById(c.i.Dw)).setVisibility(h.T(b.b == b2, 4));
        b.c.invoke(b2);
    }
    
    public int getItemCount() {
        return this.e.size();
    }
    
    public void i(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final a a = this.e.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Hw)).setText((CharSequence)a.l(this.a));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Gw)).setText((CharSequence)a.j(this.a));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Dw)).setVisibility(h.T(this.b == a, 4));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Ew)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.absence.student.filter.a(this, a, o0));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Fw)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 k(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.d.inflate(2131493185, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_filter_daterange, parent, false)");
        return new o0(inflate);
    }
}
