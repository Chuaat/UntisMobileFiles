// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import java.util.List;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B@\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006#" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "k", "getItemCount", "holder", "position", "Lkotlin/j2;", "i", "", "Lcom/untis/mobile/dashboard/ui/option/a;", "options", "l", "b", "Ljava/util/List;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "d", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "dashboardOption", "onDashboardOption", "<init>", "(Landroid/content/Context;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends RecyclerView$h<o0>
{
    @e
    private final Context a;
    @e
    private List<? extends a> b;
    @e
    private final l<a, j2> c;
    private final LayoutInflater d;
    
    public c(@e final Context a, @e final List<? extends a> b, @e final l<? super a, j2> c) {
        k0.p(a, "context");
        k0.p(b, "options");
        k0.p(c, "onDashboardOption");
        this.a = a;
        this.b = b;
        this.c = (l<a, j2>)c;
        this.d = LayoutInflater.from(a.getApplicationContext());
    }
    
    private static final void j(final c c, final a a, final View view) {
        k0.p(c, "this$0");
        k0.p(a, "$option");
        c.c.invoke(a);
    }
    
    public int getItemCount() {
        return this.b.size();
    }
    
    public void i(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final a a = (a)this.b.get(n);
        ((AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Kw)).setImageDrawable(com.untis.mobile.dashboard.ui.option.d.a(a, this.a));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Lw)).setText((CharSequence)com.untis.mobile.dashboard.ui.option.d.b(a, this.a));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Jw)).setOnClickListener((View$OnClickListener)new b(this, a));
    }
    
    @e
    public o0 k(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.d.inflate(2131493186, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_option, parent, false)");
        return new o0(inflate);
    }
    
    public final void l(@e final List<? extends a> b) {
        k0.p(b, "options");
        this.b = b;
        this.notifyDataSetChanged();
    }
}
