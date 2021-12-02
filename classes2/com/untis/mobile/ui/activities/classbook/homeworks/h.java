// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.homeworks;

import com.untis.mobile.c;
import android.widget.TextView;
import android.view.ViewGroup;
import org.jetbrains.annotations.f;
import android.view.View;
import java.util.Collection;
import java.util.Comparator;
import kotlin.collections.v;
import org.joda.time.n0;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import org.jetbrains.annotations.e;
import org.joda.time.t;
import java.util.List;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u001e\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/homeworks/h;", "Landroid/widget/BaseAdapter;", "", "position", "Landroid/view/View;", "converterView", "Landroid/view/ViewGroup;", "parent", "getView", "Lorg/joda/time/t;", "date", "Lkotlin/j2;", "b", "d", "", "getItemId", "getCount", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "H", "Landroid/view/LayoutInflater;", "inflater", "", "G", "Ljava/util/List;", "dates", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends BaseAdapter
{
    @e
    private List<t> G;
    private final LayoutInflater H;
    
    public h(@e final Context context, @e final List<t> g) {
        k0.p(context, "context");
        k0.p(g, "dates");
        this.G = g;
        this.H = LayoutInflater.from(context);
    }
    
    private static final int c(final t t, final t t2) {
        return t.b((n0)t2);
    }
    
    public final void b(@e final t t) {
        k0.p(t, "date");
        this.G.add(t);
        this.G = v.L5((Collection<? extends t>)v.h5((Iterable<?>)this.G, (Comparator<? super Object>)g.G));
        this.notifyDataSetChanged();
    }
    
    @e
    public t d(final int n) {
        return this.G.get(n);
    }
    
    public int getCount() {
        return this.G.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public View getView(final int n, @f final View view, @f final ViewGroup viewGroup) {
        final t d = this.d(n);
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493213, viewGroup, false);
        }
        ((TextView)inflate.findViewById(c.i.Ny)).setText((CharSequence)d.g4("E, dd.MM.yyyy"));
        k0.o(inflate, "view");
        return inflate;
    }
}
