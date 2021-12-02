// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.sectionlist;

import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.Iterator;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import android.view.LayoutInflater;
import android.content.Context;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000b\b&\u0018\u0000 \t*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u00012B)\u0012\u0006\u0010;\u001a\u000206\u0012\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\u0019¢\u0006\u0004\bH\u0010IJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u001b\u001a\u00020\u00072\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\u0019J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cJ$\u0010 \u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH&J\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u0012H&J\u001f\u0010&\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010%\u001a\u00028\u0001H&¢\u0006\u0004\b&\u0010'R\"\u0010\u001d\u001a\u00020\u001c8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u00101\u001a\u00020\u000b8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R(\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u001c\u0010;\u001a\u0002068\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010>\u001a\u00020\u000b8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b=\u00100R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u001c\u0010D\u001a\u00020\u000b8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\bB\u0010.\u001a\u0004\bC\u00100R\u001e\u0010\"\u001a\n E*\u0004\u0018\u00010!0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006J" }, d2 = { "Lcom/untis/mobile/ui/activities/sectionlist/c;", "Header", "Row", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/ui/activities/sectionlist/d;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintLayout", "Lkotlin/j2;", "i", "j", "h", "", "position", "Lcom/untis/mobile/ui/activities/sectionlist/b;", "t", "s", "(I)Ljava/lang/Object;", "getItemViewType", "Landroid/view/ViewGroup;", "viewGroup", "viewType", "v", "getItemCount", "viewHolder", "u", "", "sections", "y", "", "queryText", "x", "section", "k", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/View;", "m", "row", "l", "(Lcom/untis/mobile/ui/activities/sectionlist/d;Ljava/lang/Object;)V", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "w", "(Ljava/lang/String;)V", "f", "I", "o", "()I", "colorHighlight", "a", "Ljava/util/List;", "g", "margin", "Landroid/content/Context;", "b", "Landroid/content/Context;", "q", "()Landroid/content/Context;", "context", "e", "p", "colorInactive", "", "F", "radius", "d", "n", "colorActive", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public abstract class c<Header, Row> extends RecyclerView$h<d>
{
    @e
    public static final a j;
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 3;
    private static final int n = 4;
    @e
    private List<b<Header, Row>> a;
    @e
    private final Context b;
    private final LayoutInflater c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final float h;
    @e
    private String i;
    
    static {
        j = new a(null);
    }
    
    public c(@e Context applicationContext, @e final List<b<Header, Row>> a) {
        k0.p(applicationContext, "context");
        k0.p(a, "sections");
        this.a = a;
        applicationContext = applicationContext.getApplicationContext();
        k0.o(applicationContext, "context.applicationContext");
        this.b = applicationContext;
        this.c = LayoutInflater.from(applicationContext);
        this.d = androidx.core.content.d.f(applicationContext, 2131099677);
        this.e = androidx.core.content.d.f(applicationContext, 2131099686);
        this.f = androidx.core.content.d.f(applicationContext, 2131099692);
        this.g = kotlin.math.b.H0(applicationContext.getResources().getDimension(2131165279));
        this.h = applicationContext.getResources().getDimension(2131165278);
        this.i = "";
    }
    
    private final void h(final ConstraintLayout constraintLayout) {
    }
    
    private final void i(final ConstraintLayout constraintLayout) {
    }
    
    private final void j(final ConstraintLayout constraintLayout) {
    }
    
    private final Row s(int n) {
        final int size = this.a.size();
        int n2 = 1;
        List<Row> list;
        if (size == 1) {
            list = this.a.get(0).b();
        }
        else {
            if (n == 0) {
                return null;
            }
            for (final b<Header, Row> b : this.a) {
                final int n3 = b.a() + n2;
                if (n < n3) {
                    list = b.b();
                    n -= n2;
                    return list.get(n);
                }
                n2 = n3;
            }
            return null;
        }
        return list.get(n);
    }
    
    private final b<Header, Row> t(final int n) {
        final Iterator<b<Header, Row>> iterator = this.a.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final b<Header, Row> next = iterator.next();
            final int n3 = next.a() + n2;
            boolean b;
            if (n < n3) {
                b = true;
            }
            else {
                n2 = n3;
                b = false;
            }
            if (b) {
                return next;
            }
        }
        return null;
    }
    
    public int getItemCount() {
        if (this.a.isEmpty()) {
            return 0;
        }
        if (this.a.size() == 1) {
            return this.a.get(0).a() - 1;
        }
        final List<b<Header, Row>> a = this.a;
        final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)a, 10));
        final Iterator<b> iterator = a.iterator();
        while (iterator.hasNext()) {
            list.add(Integer.valueOf(iterator.next().a()));
        }
        final Iterator<Number> iterator2 = (Iterator<Number>)list.iterator();
        if (iterator2.hasNext()) {
            Number n = iterator2.next();
            while (iterator2.hasNext()) {
                n = n.intValue() + iterator2.next().intValue();
            }
            return n.intValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    public int getItemViewType(final int n) {
        final int size = this.a.size();
        int n2 = 0;
        if (size == 1) {
            if (n == 0) {
                return 2;
            }
            if (n == this.a.get(0).a() - 1) {
                return 4;
            }
            return 3;
        }
        else {
            if (n == 0) {
                return 1;
            }
            final Iterator<b> iterator = (Iterator<b>)this.a.iterator();
            while (iterator.hasNext()) {
                final int n3 = n2 + iterator.next().a();
                if (n == n3) {
                    return 1;
                }
                n2 = n3;
                if (n == n3 - 1) {
                    return 4;
                }
            }
            return 3;
        }
    }
    
    public abstract void k(@e final d p0, @e final b<Header, Row> p1);
    
    public abstract void l(@e final d p0, final Row p1);
    
    @e
    public abstract View m(@e final LayoutInflater p0, @e final ViewGroup p1);
    
    protected final int n() {
        return this.d;
    }
    
    protected final int o() {
        return this.f;
    }
    
    protected final int p() {
        return this.e;
    }
    
    @e
    protected final Context q() {
        return this.b;
    }
    
    @e
    protected final String r() {
        return this.i;
    }
    
    public void u(@e final d d, final int n) {
        k0.p(d, "viewHolder");
        final int itemViewType = this.getItemViewType(n);
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    if (itemViewType != 4) {
                        return;
                    }
                    this.h((ConstraintLayout)d.itemView);
                    final Row s = this.s(n);
                    if (s == null) {
                        return;
                    }
                    this.l(d, s);
                }
                else {
                    this.j((ConstraintLayout)d.itemView);
                    final Row s2 = this.s(n);
                    if (s2 == null) {
                        return;
                    }
                    this.l(d, s2);
                }
            }
            else {
                this.i((ConstraintLayout)d.itemView);
                final Row s3 = this.s(n);
                if (s3 == null) {
                    return;
                }
                this.l(d, s3);
            }
        }
        else {
            this.i((ConstraintLayout)d.itemView);
            final b<Header, Row> t = this.t(n);
            if (t == null) {
                return;
            }
            this.k(d, t);
        }
    }
    
    @e
    public d v(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "viewGroup");
        if (n == 1) {
            final View inflate = this.c.inflate(2131493250, viewGroup, false);
            k0.o(inflate, "inflater.inflate(R.layout.item_section_header, viewGroup, false)");
            return new d(inflate);
        }
        final LayoutInflater c = this.c;
        k0.o(c, "inflater");
        return new d(this.m(c, viewGroup));
    }
    
    protected final void w(@e final String i) {
        k0.p(i, "<set-?>");
        this.i = i;
    }
    
    public final void x(@e final String i) {
        k0.p(i, "queryText");
        this.i = i;
        final Iterator<b> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().h(i);
        }
        this.notifyDataSetChanged();
    }
    
    public final void y(@e final List<b<Header, Row>> a) {
        k0.p(a, "sections");
        this.a = a;
        this.notifyDataSetChanged();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n" }, d2 = { "com/untis/mobile/ui/activities/sectionlist/c$a", "", "", "TYPE_ROW", "I", "TYPE_ROW_BOTTOM", "TYPE_ROW_TOP", "TYPE_SECTION_HEADER", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
