// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import java.util.Iterator;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;
import java.util.Collection;
import android.view.View;
import androidx.annotation.k0;
import java.util.ArrayList;
import android.view.ViewGroup;
import androidx.collection.a;
import java.lang.ref.WeakReference;

public class j0
{
    private static final String c = "TransitionManager";
    private static g0 d;
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<g0>>>> e;
    static ArrayList<ViewGroup> f;
    private androidx.collection.a<c0, g0> a;
    private androidx.collection.a<c0, androidx.collection.a<c0, g0>> b;
    
    static {
        j0.d = new c();
        j0.e = new ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<g0>>>>();
        j0.f = new ArrayList<ViewGroup>();
    }
    
    public j0() {
        this.a = new androidx.collection.a<c0, g0>();
        this.b = new androidx.collection.a<c0, androidx.collection.a<c0, g0>>();
    }
    
    public static void a(@androidx.annotation.j0 final ViewGroup viewGroup) {
        b(viewGroup, null);
    }
    
    public static void b(@androidx.annotation.j0 final ViewGroup viewGroup, @k0 g0 u) {
        if (!j0.f.contains(viewGroup) && androidx.core.view.j0.T0((View)viewGroup)) {
            j0.f.add(viewGroup);
            g0 d;
            if ((d = u) == null) {
                d = j0.d;
            }
            u = d.u();
            j(viewGroup, u);
            c0.g(viewGroup, null);
            i(viewGroup, u);
        }
    }
    
    private static void c(final c0 c0, g0 u) {
        final ViewGroup e = c0.e();
        if (!j0.f.contains(e)) {
            final c0 c2 = c0.c(e);
            if (u == null) {
                if (c2 != null) {
                    c2.b();
                }
                c0.a();
            }
            else {
                j0.f.add(e);
                u = u.u();
                u.E0(e);
                if (c2 != null && c2.f()) {
                    u.x0(true);
                }
                j(e, u);
                c0.a();
                i(e, u);
            }
        }
    }
    
    public static void d(final ViewGroup o) {
        j0.f.remove(o);
        final ArrayList<? extends g0> c = e().get(o);
        if (c != null && !c.isEmpty()) {
            final ArrayList list = new ArrayList<g0>(c);
            for (int i = list.size() - 1; i >= 0; --i) {
                list.get(i).L(o);
            }
        }
    }
    
    static androidx.collection.a<ViewGroup, ArrayList<g0>> e() {
        final WeakReference<androidx.collection.a<ViewGroup, ArrayList<g0>>> weakReference = j0.e.get();
        if (weakReference != null) {
            final androidx.collection.a<ViewGroup, ArrayList<g0>> a = weakReference.get();
            if (a != null) {
                return a;
            }
        }
        final androidx.collection.a<ViewGroup, ArrayList<g0>> referent = new androidx.collection.a<ViewGroup, ArrayList<g0>>();
        j0.e.set(new WeakReference<androidx.collection.a<ViewGroup, ArrayList<g0>>>(referent));
        return referent;
    }
    
    private g0 f(final c0 c0) {
        final ViewGroup e = c0.e();
        if (e != null) {
            final c0 c2 = c0.c(e);
            if (c2 != null) {
                final androidx.collection.a<Object, g0> a = this.b.get(c0);
                if (a != null) {
                    final g0 g0 = a.get(c2);
                    if (g0 != null) {
                        return g0;
                    }
                }
            }
        }
        g0 d = this.a.get(c0);
        if (d == null) {
            d = j0.d;
        }
        return d;
    }
    
    public static void g(@androidx.annotation.j0 final c0 c0) {
        c(c0, j0.d);
    }
    
    public static void h(@androidx.annotation.j0 final c0 c0, @k0 final g0 g0) {
        c(c0, g0);
    }
    
    private static void i(final ViewGroup viewGroup, final g0 g0) {
        if (g0 != null && viewGroup != null) {
            final a a = new a(g0, viewGroup);
            viewGroup.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)a);
            viewGroup.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)a);
        }
    }
    
    private static void j(final ViewGroup viewGroup, final g0 g0) {
        final ArrayList<g0> list = e().get(viewGroup);
        if (list != null && list.size() > 0) {
            final Iterator<g0> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next().n0((View)viewGroup);
            }
        }
        if (g0 != null) {
            g0.s(viewGroup, true);
        }
        final c0 c = c0.c(viewGroup);
        if (c != null) {
            c.b();
        }
    }
    
    public void k(@androidx.annotation.j0 final c0 c0, @androidx.annotation.j0 final c0 c2, @k0 final g0 g0) {
        androidx.collection.a<c0, g0> a;
        if ((a = this.b.get(c2)) == null) {
            a = new androidx.collection.a<c0, g0>();
            this.b.put(c2, a);
        }
        a.put(c0, g0);
    }
    
    public void l(@androidx.annotation.j0 final c0 c0, @k0 final g0 g0) {
        this.a.put(c0, g0);
    }
    
    public void m(@androidx.annotation.j0 final c0 c0) {
        c(c0, this.f(c0));
    }
    
    private static class a implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener
    {
        g0 G;
        ViewGroup H;
        
        a(final g0 g, final ViewGroup h) {
            this.G = g;
            this.H = h;
        }
        
        private void a() {
            this.H.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            this.H.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        }
        
        public boolean onPreDraw() {
            this.a();
            if (!j0.f.remove(this.H)) {
                return true;
            }
            final androidx.collection.a<ViewGroup, ArrayList<g0>> e = j0.e();
            final ArrayList<g0> c = e.get(this.H);
            ArrayList<g0> list = null;
            ArrayList<g0> list2;
            if (c == null) {
                list2 = new ArrayList<g0>();
                e.put(this.H, list2);
            }
            else {
                list2 = c;
                if (c.size() > 0) {
                    list = new ArrayList<g0>(c);
                    list2 = c;
                }
            }
            list2.add(this.G);
            this.G.a((g0.h)new i0() {
                @Override
                public void c(@androidx.annotation.j0 final g0 o) {
                    ((ArrayList)e.get(androidx.transition.j0.a.this.H)).remove(o);
                    o.p0((g0.h)this);
                }
            });
            this.G.s(this.H, false);
            if (list != null) {
                final Iterator<g0> iterator = list.iterator();
                while (iterator.hasNext()) {
                    iterator.next().u0((View)this.H);
                }
            }
            this.G.o0(this.H);
            return true;
        }
        
        public void onViewAttachedToWindow(final View view) {
        }
        
        public void onViewDetachedFromWindow(final View view) {
            this.a();
            j0.f.remove(this.H);
            final ArrayList<g0> list = j0.e().get(this.H);
            if (list != null && list.size() > 0) {
                final Iterator<g0> iterator = list.iterator();
                while (iterator.hasNext()) {
                    iterator.next().u0((View)this.H);
                }
            }
            this.G.t(true);
        }
    }
}
