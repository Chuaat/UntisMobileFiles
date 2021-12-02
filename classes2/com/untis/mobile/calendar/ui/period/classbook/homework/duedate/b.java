// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.homework.duedate;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.d0;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Collection;
import kotlin.collections.v;
import android.view.View;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import org.joda.time.c;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B@\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0015\u0012!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rR\u001e\u0010\u0014\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006!" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/homework/duedate/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "l", "holder", "position", "Lkotlin/j2;", "j", "getItemCount", "Lorg/joda/time/c;", "dueDate", "i", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "inflater", "", "a", "Ljava/util/List;", "dates", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onDueDate", "<init>", "(Landroid/content/Context;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private List<c> a;
    @e
    private final l<c, j2> b;
    private final LayoutInflater c;
    
    public b(@e final Context context, @e final List<c> a, @e final l<? super c, j2> b) {
        k0.p(context, "context");
        k0.p(a, "dates");
        k0.p(b, "onDueDate");
        this.a = a;
        this.b = (l<c, j2>)b;
        this.c = LayoutInflater.from(context);
    }
    
    private static final void k(final b b, final c c, final View view) {
        k0.p(b, "this$0");
        k0.p(c, "$dueDate");
        b.b.invoke(c);
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    public final void i(@e final c c) {
        k0.p(c, "dueDate");
        if (this.a.contains(c)) {
            return;
        }
        this.a = v.d5((Iterable<? extends c>)v.r4(this.a, c));
        this.notifyDataSetChanged();
    }
    
    public void j(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final c c = this.a.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.ei)).setText((CharSequence)d0.l(c));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.ci)).setOnClickListener((View$OnClickListener)new a(this, c));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.di)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 l(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.c.inflate(2131492993, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.calendar_item_duedate, parent, false)");
        return new o0(inflate);
    }
}
