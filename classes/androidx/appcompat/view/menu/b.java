// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.I })
public abstract class b implements n
{
    protected Context G;
    protected Context H;
    protected g I;
    protected LayoutInflater J;
    protected LayoutInflater K;
    private a L;
    private int M;
    private int N;
    protected o O;
    private int P;
    
    public b(final Context g, final int m, final int n) {
        this.G = g;
        this.J = LayoutInflater.from(g);
        this.M = m;
        this.N = n;
    }
    
    @Override
    public int b() {
        return this.P;
    }
    
    protected void c(final View view, final int n) {
        final ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup)this.O).addView(view, n);
    }
    
    @Override
    public void d(final g g, final boolean b) {
        final a l = this.L;
        if (l != null) {
            l.d(g, b);
        }
    }
    
    @Override
    public void e(final boolean b) {
        final ViewGroup viewGroup = (ViewGroup)this.O;
        if (viewGroup == null) {
            return;
        }
        final g i = this.I;
        int j = 0;
        if (i != null) {
            i.u();
            final ArrayList<j> h = this.I.H();
            final int size = h.size();
            int k = 0;
            j = 0;
            while (k < size) {
                final j l = h.get(k);
                int n = j;
                if (this.u(j, l)) {
                    final View child = viewGroup.getChildAt(j);
                    j itemData;
                    if (child instanceof o.a) {
                        itemData = ((o.a)child).getItemData();
                    }
                    else {
                        itemData = null;
                    }
                    final View s = this.s(l, child, viewGroup);
                    if (l != itemData) {
                        s.setPressed(false);
                        s.jumpDrawablesToCurrentState();
                    }
                    if (s != child) {
                        this.c(s, j);
                    }
                    n = j + 1;
                }
                ++k;
                j = n;
            }
        }
        while (j < viewGroup.getChildCount()) {
            if (!this.q(viewGroup, j)) {
                ++j;
            }
        }
    }
    
    @Override
    public boolean f() {
        return false;
    }
    
    @Override
    public boolean g(final g g, final j j) {
        return false;
    }
    
    @Override
    public boolean h(final g g, final j j) {
        return false;
    }
    
    @Override
    public void i(final a l) {
        this.L = l;
    }
    
    @Override
    public void j(final Context h, final g i) {
        this.H = h;
        this.K = LayoutInflater.from(h);
        this.I = i;
    }
    
    public abstract void l(final j p0, final o.a p1);
    
    @Override
    public boolean m(s i) {
        final a l = this.L;
        if (l != null) {
            if (i == null) {
                i = (s)this.I;
            }
            return l.e(i);
        }
        return false;
    }
    
    @Override
    public o n(final ViewGroup viewGroup) {
        if (this.O == null) {
            (this.O = (o)this.J.inflate(this.M, viewGroup, false)).e(this.I);
            this.e(true);
        }
        return this.O;
    }
    
    public o.a p(final ViewGroup viewGroup) {
        return (o.a)this.J.inflate(this.N, viewGroup, false);
    }
    
    protected boolean q(final ViewGroup viewGroup, final int n) {
        viewGroup.removeViewAt(n);
        return true;
    }
    
    public a r() {
        return this.L;
    }
    
    public View s(final j j, final View view, final ViewGroup viewGroup) {
        o.a p3;
        if (view instanceof o.a) {
            p3 = (o.a)view;
        }
        else {
            p3 = this.p(viewGroup);
        }
        this.l(j, p3);
        return (View)p3;
    }
    
    public void t(final int p) {
        this.P = p;
    }
    
    public boolean u(final int n, final j j) {
        return true;
    }
}
