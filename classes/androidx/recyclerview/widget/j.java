// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import java.util.Iterator;
import java.util.Collection;
import androidx.annotation.j0;
import android.animation.ValueAnimator;
import java.util.List;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import android.animation.TimeInterpolator;

public class j extends d0
{
    private static TimeInterpolator A;
    private static final boolean z = false;
    private ArrayList<g0> o;
    private ArrayList<g0> p;
    private ArrayList<j> q;
    private ArrayList<i> r;
    ArrayList<ArrayList<g0>> s;
    ArrayList<ArrayList<j>> t;
    ArrayList<ArrayList<i>> u;
    ArrayList<g0> v;
    ArrayList<g0> w;
    ArrayList<g0> x;
    ArrayList<g0> y;
    
    public j() {
        this.o = new ArrayList<g0>();
        this.p = new ArrayList<g0>();
        this.q = new ArrayList<j>();
        this.r = new ArrayList<i>();
        this.s = new ArrayList<ArrayList<g0>>();
        this.t = new ArrayList<ArrayList<j>>();
        this.u = new ArrayList<ArrayList<i>>();
        this.v = new ArrayList<g0>();
        this.w = new ArrayList<g0>();
        this.x = new ArrayList<g0>();
        this.y = new ArrayList<g0>();
    }
    
    private void c0(final g0 e) {
        final View itemView = e.itemView;
        final ViewPropertyAnimator animate = itemView.animate();
        this.x.add(e);
        animate.setDuration(((RecyclerView.m)this).p()).alpha(0.0f).setListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                animate.setListener((Animator$AnimatorListener)null);
                itemView.setAlpha(1.0f);
                j.this.N(e);
                j.this.x.remove(e);
                j.this.e0();
            }
            
            public void onAnimationStart(final Animator animator) {
                j.this.O(e);
            }
        }).start();
    }
    
    private void f0(final List<i> list, final g0 g0) {
        for (int i = list.size() - 1; i >= 0; --i) {
            final i j = list.get(i);
            if (this.h0(j, g0) && j.a == null && j.b == null) {
                list.remove(j);
            }
        }
    }
    
    private void g0(final i i) {
        final g0 a = i.a;
        if (a != null) {
            this.h0(i, a);
        }
        final g0 b = i.b;
        if (b != null) {
            this.h0(i, b);
        }
    }
    
    private boolean h0(final i i, final g0 g0) {
        final g0 b = i.b;
        boolean b2 = false;
        if (b == g0) {
            i.b = null;
        }
        else {
            if (i.a != g0) {
                return false;
            }
            i.a = null;
            b2 = true;
        }
        g0.itemView.setAlpha(1.0f);
        g0.itemView.setTranslationX(0.0f);
        g0.itemView.setTranslationY(0.0f);
        this.J(g0, b2);
        return true;
    }
    
    private void i0(final g0 g0) {
        if (j.A == null) {
            j.A = new ValueAnimator().getInterpolator();
        }
        g0.itemView.animate().setInterpolator(j.A);
        this.k(g0);
    }
    
    @Override
    public boolean D(final g0 e) {
        this.i0(e);
        e.itemView.setAlpha(0.0f);
        this.p.add(e);
        return true;
    }
    
    @Override
    public boolean E(final g0 g0, final g0 g2, final int n, final int n2, final int n3, final int n4) {
        if (g0 == g2) {
            return this.F(g0, n, n2, n3, n4);
        }
        final float translationX = g0.itemView.getTranslationX();
        final float translationY = g0.itemView.getTranslationY();
        final float alpha = g0.itemView.getAlpha();
        this.i0(g0);
        final int n5 = (int)(n3 - n - translationX);
        final int n6 = (int)(n4 - n2 - translationY);
        g0.itemView.setTranslationX(translationX);
        g0.itemView.setTranslationY(translationY);
        g0.itemView.setAlpha(alpha);
        if (g2 != null) {
            this.i0(g2);
            g2.itemView.setTranslationX((float)(-n5));
            g2.itemView.setTranslationY((float)(-n6));
            g2.itemView.setAlpha(0.0f);
        }
        this.r.add(new i(g0, g2, n, n2, n3, n4));
        return true;
    }
    
    @Override
    public boolean F(final g0 g0, int n, int n2, final int n3, final int n4) {
        final View itemView = g0.itemView;
        n += (int)itemView.getTranslationX();
        n2 += (int)g0.itemView.getTranslationY();
        this.i0(g0);
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        if (n5 == 0 && n6 == 0) {
            this.L(g0);
            return false;
        }
        if (n5 != 0) {
            itemView.setTranslationX((float)(-n5));
        }
        if (n6 != 0) {
            itemView.setTranslationY((float)(-n6));
        }
        this.q.add(new j(g0, n, n2, n3, n4));
        return true;
    }
    
    @Override
    public boolean G(final g0 e) {
        this.i0(e);
        this.o.add(e);
        return true;
    }
    
    void Z(final g0 e) {
        final View itemView = e.itemView;
        final ViewPropertyAnimator animate = itemView.animate();
        this.v.add(e);
        animate.alpha(1.0f).setDuration(((RecyclerView.m)this).m()).setListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationCancel(final Animator animator) {
                itemView.setAlpha(1.0f);
            }
            
            public void onAnimationEnd(final Animator animator) {
                animate.setListener((Animator$AnimatorListener)null);
                j.this.H(e);
                j.this.v.remove(e);
                j.this.e0();
            }
            
            public void onAnimationStart(final Animator animator) {
                j.this.I(e);
            }
        }).start();
    }
    
    void a0(final i i) {
        final g0 a = i.a;
        View itemView = null;
        View itemView2;
        if (a == null) {
            itemView2 = null;
        }
        else {
            itemView2 = a.itemView;
        }
        final g0 b = i.b;
        if (b != null) {
            itemView = b.itemView;
        }
        if (itemView2 != null) {
            final ViewPropertyAnimator setDuration = itemView2.animate().setDuration(((RecyclerView.m)this).n());
            this.y.add(i.a);
            setDuration.translationX((float)(i.e - i.c));
            setDuration.translationY((float)(i.f - i.d));
            setDuration.alpha(0.0f).setListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationEnd(final Animator animator) {
                    setDuration.setListener((Animator$AnimatorListener)null);
                    itemView2.setAlpha(1.0f);
                    itemView2.setTranslationX(0.0f);
                    itemView2.setTranslationY(0.0f);
                    j.this.J(i.a, true);
                    j.this.y.remove(i.a);
                    j.this.e0();
                }
                
                public void onAnimationStart(final Animator animator) {
                    j.this.K(i.a, true);
                }
            }).start();
        }
        if (itemView != null) {
            final ViewPropertyAnimator animate = itemView.animate();
            this.y.add(i.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(((RecyclerView.m)this).n()).alpha(1.0f).setListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationEnd(final Animator animator) {
                    animate.setListener((Animator$AnimatorListener)null);
                    itemView.setAlpha(1.0f);
                    itemView.setTranslationX(0.0f);
                    itemView.setTranslationY(0.0f);
                    j.this.J(i.b, false);
                    j.this.y.remove(i.b);
                    j.this.e0();
                }
                
                public void onAnimationStart(final Animator animator) {
                    j.this.K(i.b, false);
                }
            }).start();
        }
    }
    
    void b0(final g0 e, int n, int n2, final int n3, final int n4) {
        final View itemView = e.itemView;
        n = n3 - n;
        n2 = n4 - n2;
        if (n != 0) {
            itemView.animate().translationX(0.0f);
        }
        if (n2 != 0) {
            itemView.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = itemView.animate();
        this.w.add(e);
        animate.setDuration(((RecyclerView.m)this).o()).setListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationCancel(final Animator animator) {
                if (n != 0) {
                    itemView.setTranslationX(0.0f);
                }
                if (n2 != 0) {
                    itemView.setTranslationY(0.0f);
                }
            }
            
            public void onAnimationEnd(final Animator animator) {
                animate.setListener((Animator$AnimatorListener)null);
                j.this.L(e);
                j.this.w.remove(e);
                j.this.e0();
            }
            
            public void onAnimationStart(final Animator animator) {
                j.this.M(e);
            }
        }).start();
    }
    
    void d0(final List<g0> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            list.get(i).itemView.animate().cancel();
        }
    }
    
    void e0() {
        if (!this.q()) {
            ((RecyclerView.m)this).j();
        }
    }
    
    @Override
    public boolean g(@j0 final g0 g0, @j0 final List<Object> list) {
        return !list.isEmpty() || super.g(g0, list);
    }
    
    @Override
    public void k(final g0 o) {
        final View itemView = o.itemView;
        itemView.animate().cancel();
        for (int i = this.q.size() - 1; i >= 0; --i) {
            if (this.q.get(i).a == o) {
                itemView.setTranslationY(0.0f);
                itemView.setTranslationX(0.0f);
                this.L(o);
                this.q.remove(i);
            }
        }
        this.f0(this.r, o);
        if (this.o.remove(o)) {
            itemView.setAlpha(1.0f);
            this.N(o);
        }
        if (this.p.remove(o)) {
            itemView.setAlpha(1.0f);
            this.H(o);
        }
        for (int j = this.u.size() - 1; j >= 0; --j) {
            final ArrayList<i> list = this.u.get(j);
            this.f0(list, o);
            if (list.isEmpty()) {
                this.u.remove(j);
            }
        }
        for (int k = this.t.size() - 1; k >= 0; --k) {
            final ArrayList<j> list2 = this.t.get(k);
            int l = list2.size() - 1;
            while (l >= 0) {
                if (list2.get(l).a == o) {
                    itemView.setTranslationY(0.0f);
                    itemView.setTranslationX(0.0f);
                    this.L(o);
                    list2.remove(l);
                    if (list2.isEmpty()) {
                        this.t.remove(k);
                        break;
                    }
                    break;
                }
                else {
                    --l;
                }
            }
        }
        for (int n = this.s.size() - 1; n >= 0; --n) {
            final ArrayList<g0> list3 = this.s.get(n);
            if (list3.remove(o)) {
                itemView.setAlpha(1.0f);
                this.H(o);
                if (list3.isEmpty()) {
                    this.s.remove(n);
                }
            }
        }
        this.x.remove(o);
        this.v.remove(o);
        this.y.remove(o);
        this.w.remove(o);
        this.e0();
    }
    
    @Override
    public void l() {
        for (int i = this.q.size() - 1; i >= 0; --i) {
            final j j = this.q.get(i);
            final View itemView = j.a.itemView;
            itemView.setTranslationY(0.0f);
            itemView.setTranslationX(0.0f);
            this.L(j.a);
            this.q.remove(i);
        }
        for (int k = this.o.size() - 1; k >= 0; --k) {
            this.N(this.o.get(k));
            this.o.remove(k);
        }
        for (int l = this.p.size() - 1; l >= 0; --l) {
            final g0 g0 = this.p.get(l);
            g0.itemView.setAlpha(1.0f);
            this.H(g0);
            this.p.remove(l);
        }
        for (int index = this.r.size() - 1; index >= 0; --index) {
            this.g0(this.r.get(index));
        }
        this.r.clear();
        if (!this.q()) {
            return;
        }
        for (int index2 = this.t.size() - 1; index2 >= 0; --index2) {
            final ArrayList<j> o = this.t.get(index2);
            for (int n = o.size() - 1; n >= 0; --n) {
                final j m = o.get(n);
                final View itemView2 = m.a.itemView;
                itemView2.setTranslationY(0.0f);
                itemView2.setTranslationX(0.0f);
                this.L(m.a);
                o.remove(n);
                if (o.isEmpty()) {
                    this.t.remove(o);
                }
            }
        }
        for (int index3 = this.s.size() - 1; index3 >= 0; --index3) {
            final ArrayList<g0> o2 = this.s.get(index3);
            for (int n2 = o2.size() - 1; n2 >= 0; --n2) {
                final g0 g2 = o2.get(n2);
                g2.itemView.setAlpha(1.0f);
                this.H(g2);
                o2.remove(n2);
                if (o2.isEmpty()) {
                    this.s.remove(o2);
                }
            }
        }
        for (int index4 = this.u.size() - 1; index4 >= 0; --index4) {
            final ArrayList<i> o3 = this.u.get(index4);
            for (int index5 = o3.size() - 1; index5 >= 0; --index5) {
                this.g0(o3.get(index5));
                if (o3.isEmpty()) {
                    this.u.remove(o3);
                }
            }
        }
        this.d0(this.x);
        this.d0(this.w);
        this.d0(this.v);
        this.d0(this.y);
        ((RecyclerView.m)this).j();
    }
    
    @Override
    public boolean q() {
        return !this.p.isEmpty() || !this.r.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.w.isEmpty() || !this.x.isEmpty() || !this.v.isEmpty() || !this.y.isEmpty() || !this.t.isEmpty() || !this.s.isEmpty() || !this.u.isEmpty();
    }
    
    @Override
    public void x() {
        final boolean b = this.o.isEmpty() ^ true;
        final boolean b2 = this.q.isEmpty() ^ true;
        final boolean b3 = this.r.isEmpty() ^ true;
        final boolean b4 = this.p.isEmpty() ^ true;
        if (!b && !b2 && !b4 && !b3) {
            return;
        }
        final Iterator<g0> iterator = this.o.iterator();
        while (iterator.hasNext()) {
            this.c0(iterator.next());
        }
        this.o.clear();
        if (b2) {
            final ArrayList<j> e = new ArrayList<j>();
            e.addAll(this.q);
            this.t.add(e);
            this.q.clear();
            final Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    for (final j j : e) {
                        j.this.b0(j.a, j.b, j.c, j.d, j.e);
                    }
                    e.clear();
                    j.this.t.remove(e);
                }
            };
            if (b) {
                androidx.core.view.j0.o1(e.get(0).a.itemView, runnable, ((RecyclerView.m)this).p());
            }
            else {
                runnable.run();
            }
        }
        if (b3) {
            final ArrayList<i> e2 = new ArrayList<i>();
            e2.addAll(this.r);
            this.u.add(e2);
            this.r.clear();
            final Runnable runnable2 = new Runnable() {
                @Override
                public void run() {
                    final Iterator<i> iterator = e2.iterator();
                    while (iterator.hasNext()) {
                        j.this.a0((i)iterator.next());
                    }
                    e2.clear();
                    j.this.u.remove(e2);
                }
            };
            if (b) {
                androidx.core.view.j0.o1(e2.get(0).a.itemView, runnable2, ((RecyclerView.m)this).p());
            }
            else {
                runnable2.run();
            }
        }
        if (b4) {
            final ArrayList<g0> e3 = new ArrayList<g0>();
            e3.addAll(this.p);
            this.s.add(e3);
            this.p.clear();
            final Runnable runnable3 = new Runnable() {
                @Override
                public void run() {
                    final Iterator<g0> iterator = e3.iterator();
                    while (iterator.hasNext()) {
                        j.this.Z(iterator.next());
                    }
                    e3.clear();
                    j.this.s.remove(e3);
                }
            };
            if (!b && !b2 && !b3) {
                runnable3.run();
            }
            else {
                long n = 0L;
                long p;
                if (b) {
                    p = ((RecyclerView.m)this).p();
                }
                else {
                    p = 0L;
                }
                long o;
                if (b2) {
                    o = ((RecyclerView.m)this).o();
                }
                else {
                    o = 0L;
                }
                if (b3) {
                    n = ((RecyclerView.m)this).n();
                }
                androidx.core.view.j0.o1(e3.get(0).itemView, runnable3, p + Math.max(o, n));
            }
        }
    }
    
    private static class i
    {
        public g0 a;
        public g0 b;
        public int c;
        public int d;
        public int e;
        public int f;
        
        private i(final g0 a, final g0 b) {
            this.a = a;
            this.b = b;
        }
        
        i(final g0 g0, final g0 g2, final int c, final int d, final int e, final int f) {
            this(g0, g2);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.a);
            sb.append(", newHolder=");
            sb.append(this.b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            sb.append(this.f);
            sb.append('}');
            return sb.toString();
        }
    }
    
    private static class j
    {
        public g0 a;
        public int b;
        public int c;
        public int d;
        public int e;
        
        j(final g0 a, final int b, final int c, final int d, final int e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
}
