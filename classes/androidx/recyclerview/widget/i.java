// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import java.util.Collections;
import android.util.Log;
import androidx.core.util.n;
import android.view.ViewGroup;
import androidx.annotation.k0;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.annotation.j0;
import java.util.IdentityHashMap;
import java.lang.ref.WeakReference;
import java.util.List;

class i implements b
{
    private final h a;
    private final m0 b;
    private List<WeakReference<RecyclerView>> c;
    private final IdentityHashMap<RecyclerView.g0, x> d;
    private List<x> e;
    private a f;
    @j0
    private final h.a.b g;
    private final h0 h;
    
    i(final h a, final h.a a2) {
        this.c = new ArrayList<WeakReference<RecyclerView>>();
        this.d = new IdentityHashMap<RecyclerView.g0, x>();
        this.e = new ArrayList<x>();
        this.f = new a();
        this.a = a;
        m0 b;
        if (a2.a) {
            b = new m0.a();
        }
        else {
            b = new m0.b();
        }
        this.b = b;
        final h.a.b b2 = a2.b;
        this.g = b2;
        h0 h;
        if (b2 == androidx.recyclerview.widget.h.a.b.G) {
            h = new h0.b();
        }
        else if (b2 == androidx.recyclerview.widget.h.a.b.H) {
            h = new h0.a();
        }
        else {
            if (b2 != androidx.recyclerview.widget.h.a.b.I) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            h = new h0.c();
        }
        this.h = h;
    }
    
    private void H(final a f) {
        f.c = false;
        f.a = null;
        f.b = -1;
        this.f = f;
    }
    
    private void j() {
        final RecyclerView.h.a l = this.l();
        if (l != ((RecyclerView.h)this.a).getStateRestorationPolicy()) {
            this.a.k(l);
        }
    }
    
    private RecyclerView.h.a l() {
        for (final x x : this.e) {
            final RecyclerView.h.a stateRestorationPolicy = x.c.getStateRestorationPolicy();
            final RecyclerView.h.a i = RecyclerView.h.a.I;
            if (stateRestorationPolicy == i) {
                return i;
            }
            if (stateRestorationPolicy == RecyclerView.h.a.H && x.b() == 0) {
                return i;
            }
        }
        return RecyclerView.h.a.G;
    }
    
    private int m(final x x) {
        final Iterator<x> iterator = this.e.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final x x2 = iterator.next();
            if (x2 == x) {
                break;
            }
            n += x2.b();
        }
        return n;
    }
    
    @j0
    private a n(final int i) {
        a f = this.f;
        if (f.c) {
            f = new a();
        }
        else {
            f.c = true;
        }
        final Iterator<x> iterator = this.e.iterator();
        int b = i;
        while (iterator.hasNext()) {
            final x a = iterator.next();
            if (a.b() > b) {
                f.a = a;
                f.b = b;
                break;
            }
            b -= a.b();
        }
        if (f.a != null) {
            return f;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot find wrapper for ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @k0
    private x o(final RecyclerView.h<RecyclerView.g0> h) {
        final int x = this.x(h);
        if (x == -1) {
            return null;
        }
        return this.e.get(x);
    }
    
    @j0
    private x v(final RecyclerView.g0 g0) {
        final x x = this.d.get(g0);
        if (x != null) {
            return x;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot find wrapper for ");
        sb.append(g0);
        sb.append(", seems like it is not bound by this adapter: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
    
    private int x(final RecyclerView.h<RecyclerView.g0> h) {
        for (int size = this.e.size(), i = 0; i < size; ++i) {
            if (this.e.get(i).c == h) {
                return i;
            }
        }
        return -1;
    }
    
    private boolean y(final RecyclerView recyclerView) {
        final Iterator<WeakReference<RecyclerView>> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }
    
    public void A(final RecyclerView.g0 key, final int n) {
        final a n2 = this.n(n);
        this.d.put(key, n2.a);
        n2.a.e(key, n2.b);
        this.H(n2);
    }
    
    public RecyclerView.g0 B(final ViewGroup viewGroup, final int n) {
        return this.b.a(n).f(viewGroup, n);
    }
    
    public void C(final RecyclerView recyclerView) {
        for (int i = this.c.size() - 1; i >= 0; --i) {
            final WeakReference<RecyclerView> weakReference = this.c.get(i);
            if (weakReference.get() == null) {
                this.c.remove(i);
            }
            else if (weakReference.get() == recyclerView) {
                this.c.remove(i);
                break;
            }
        }
        final Iterator<x> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            iterator.next().c.onDetachedFromRecyclerView(recyclerView);
        }
    }
    
    public boolean D(final RecyclerView.g0 obj) {
        final x x = this.d.get(obj);
        if (x != null) {
            final boolean onFailedToRecycleView = x.c.onFailedToRecycleView(obj);
            this.d.remove(obj);
            return onFailedToRecycleView;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot find wrapper for ");
        sb.append(obj);
        sb.append(", seems like it is not bound by this adapter: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
    
    public void E(final RecyclerView.g0 g0) {
        this.v(g0).c.onViewAttachedToWindow(g0);
    }
    
    public void F(final RecyclerView.g0 g0) {
        this.v(g0).c.onViewDetachedFromWindow(g0);
    }
    
    public void G(final RecyclerView.g0 obj) {
        final x x = this.d.get(obj);
        if (x != null) {
            x.c.onViewRecycled(obj);
            this.d.remove(obj);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot find wrapper for ");
        sb.append(obj);
        sb.append(", seems like it is not bound by this adapter: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
    
    boolean I(final RecyclerView.h<RecyclerView.g0> h) {
        final int x = this.x(h);
        if (x == -1) {
            return false;
        }
        final x x2 = this.e.get(x);
        final int m = this.m(x2);
        this.e.remove(x);
        ((RecyclerView.h)this.a).notifyItemRangeRemoved(m, x2.b());
        final Iterator<WeakReference<RecyclerView>> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            final RecyclerView recyclerView = iterator.next().get();
            if (recyclerView != null) {
                h.onDetachedFromRecyclerView(recyclerView);
            }
        }
        x2.a();
        this.j();
        return true;
    }
    
    @Override
    public void a(final x x) {
        this.j();
    }
    
    @Override
    public void b(@j0 final x x, final int n, final int n2, @k0 final Object o) {
        ((RecyclerView.h)this.a).notifyItemRangeChanged(n + this.m(x), n2, o);
    }
    
    @Override
    public void c(@j0 final x x, final int n, final int n2) {
        ((RecyclerView.h)this.a).notifyItemRangeChanged(n + this.m(x), n2);
    }
    
    @Override
    public void d(@j0 final x x, final int n, final int n2) {
        ((RecyclerView.h)this.a).notifyItemRangeInserted(n + this.m(x), n2);
    }
    
    @Override
    public void e(@j0 final x x, final int n, final int n2) {
        final int m = this.m(x);
        ((RecyclerView.h)this.a).notifyItemMoved(n + m, n2 + m);
    }
    
    @Override
    public void f(@j0 final x x) {
        ((RecyclerView.h)this.a).notifyDataSetChanged();
        this.j();
    }
    
    @Override
    public void g(@j0 final x x, final int n, final int n2) {
        ((RecyclerView.h)this.a).notifyItemRangeRemoved(n + this.m(x), n2);
    }
    
    boolean h(final int i, final RecyclerView.h<RecyclerView.g0> h) {
        if (i < 0 || i > this.e.size()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Index must be between 0 and ");
            sb.append(this.e.size());
            sb.append(". Given:");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (this.w()) {
            n.b(h.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        }
        else if (h.hasStableIds()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        if (this.o(h) != null) {
            return false;
        }
        final x x = new x(h, (x.b)this, this.b, this.h.a());
        this.e.add(i, x);
        final Iterator<WeakReference<RecyclerView>> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            final RecyclerView recyclerView = iterator.next().get();
            if (recyclerView != null) {
                h.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (x.b() > 0) {
            ((RecyclerView.h)this.a).notifyItemRangeInserted(this.m(x), x.b());
        }
        this.j();
        return true;
    }
    
    boolean i(final RecyclerView.h<RecyclerView.g0> h) {
        return this.h(this.e.size(), h);
    }
    
    public boolean k() {
        final Iterator<x> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().c.canRestoreState()) {
                return false;
            }
        }
        return true;
    }
    
    @k0
    public RecyclerView.h<? extends RecyclerView.g0> p(final RecyclerView.g0 key) {
        final x x = this.d.get(key);
        if (x == null) {
            return null;
        }
        return x.c;
    }
    
    public List<RecyclerView.h<? extends RecyclerView.g0>> q() {
        if (this.e.isEmpty()) {
            return Collections.emptyList();
        }
        final ArrayList<RecyclerView.h<RecyclerView.g0>> list = (ArrayList<RecyclerView.h<RecyclerView.g0>>)new ArrayList<RecyclerView.h<? extends RecyclerView.g0>>(this.e.size());
        final Iterator<x> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().c);
        }
        return (List<RecyclerView.h<? extends RecyclerView.g0>>)list;
    }
    
    public long r(final int n) {
        final a n2 = this.n(n);
        final long c = n2.a.c(n2.b);
        this.H(n2);
        return c;
    }
    
    public int s(int d) {
        final a n = this.n(d);
        d = n.a.d(n.b);
        this.H(n);
        return d;
    }
    
    public int t(final RecyclerView.h<? extends RecyclerView.g0> obj, final RecyclerView.g0 g0, int itemCount) {
        final x x = this.d.get(g0);
        if (x == null) {
            return -1;
        }
        final int i = itemCount - this.m(x);
        itemCount = x.c.getItemCount();
        if (i >= 0 && i < itemCount) {
            return x.c.findRelativeAdapterPositionIn(obj, g0, i);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Detected inconsistent adapter updates. The local position of the view holder maps to ");
        sb.append(i);
        sb.append(" which is out of bounds for the adapter with size ");
        sb.append(itemCount);
        sb.append(".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sb.append(g0);
        sb.append("adapter:");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }
    
    public int u() {
        final Iterator<x> iterator = this.e.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += iterator.next().b();
        }
        return n;
    }
    
    public boolean w() {
        return this.g != androidx.recyclerview.widget.h.a.b.G;
    }
    
    public void z(final RecyclerView referent) {
        if (this.y(referent)) {
            return;
        }
        this.c.add(new WeakReference<RecyclerView>(referent));
        final Iterator<x> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            iterator.next().c.onAttachedToRecyclerView(referent);
        }
    }
    
    static class a
    {
        x a;
        int b;
        boolean c;
    }
}
