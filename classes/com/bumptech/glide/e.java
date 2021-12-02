// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide;

import com.bumptech.glide.util.m;
import java.util.Queue;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.transition.f;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.d;
import android.widget.AbsListView;
import androidx.annotation.k0;
import java.util.List;
import com.bumptech.glide.request.target.p;
import androidx.annotation.j0;
import android.widget.AbsListView$OnScrollListener;

public class e<T> implements AbsListView$OnScrollListener
{
    private final int a;
    private final d b;
    private final l c;
    private final a<T> d;
    private final b<T> e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    
    public e(@j0 final l c, @j0 final a<T> d, @j0 final b<T> e, final int a) {
        this.h = -1;
        this.j = true;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = new d(a + 1);
    }
    
    private void a() {
        for (int i = 0; i < this.b.a.size(); ++i) {
            this.c.B(this.b.a(0, 0));
        }
    }
    
    private void b(int i, final int n) {
        int max;
        int min;
        if (i < n) {
            max = Math.max(this.f, i);
            min = n;
        }
        else {
            min = Math.min(this.g, i);
            max = n;
        }
        final int min2 = Math.min(this.i, min);
        final int min3 = Math.min(this.i, Math.max(0, max));
        if (i < n) {
            for (i = min3; i < min2; ++i) {
                this.d(this.d.a(i), i, true);
            }
        }
        else {
            for (i = min2 - 1; i >= min3; --i) {
                this.d(this.d.a(i), i, false);
            }
        }
        this.g = min3;
        this.f = min2;
    }
    
    private void c(final int n, final boolean j) {
        if (this.j != j) {
            this.j = j;
            this.a();
        }
        int a;
        if (j) {
            a = this.a;
        }
        else {
            a = -this.a;
        }
        this.b(n, a + n);
    }
    
    private void d(final List<T> list, final int n, final boolean b) {
        final int size = list.size();
        if (b) {
            for (int i = 0; i < size; ++i) {
                this.e(list.get(i), n, i);
            }
        }
        else {
            for (int j = size - 1; j >= 0; --j) {
                this.e(list.get(j), n, j);
            }
        }
    }
    
    private void e(@k0 final T t, final int n, final int n2) {
        if (t == null) {
            return;
        }
        final int[] a = this.e.a(t, n, n2);
        if (a == null) {
            return;
        }
        final k<?> b = this.d.b(t);
        if (b == null) {
            return;
        }
        b.o1(this.b.a(a[0], a[1]));
    }
    
    public void onScroll(final AbsListView absListView, final int h, final int n, int h2) {
        this.i = h2;
        h2 = this.h;
        if (h > h2) {
            this.c(n + h, true);
        }
        else if (h < h2) {
            this.c(h, false);
        }
        this.h = h;
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
    }
    
    public interface a<U>
    {
        @j0
        List<U> a(final int p0);
        
        @k0
        k<?> b(@j0 final U p0);
    }
    
    public interface b<T>
    {
        @k0
        int[] a(@j0 final T p0, final int p1, final int p2);
    }
    
    private static final class c implements p<Object>
    {
        int G;
        int H;
        @k0
        private com.bumptech.glide.request.d I;
        
        c() {
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public void b(@j0 final o o) {
        }
        
        @Override
        public void c(@j0 final Object o, @k0 final f<? super Object> f) {
        }
        
        @Override
        public void e(@k0 final com.bumptech.glide.request.d i) {
            this.I = i;
        }
        
        @Override
        public void f() {
        }
        
        @Override
        public void h(@k0 final Drawable drawable) {
        }
        
        @Override
        public void k(@k0 final Drawable drawable) {
        }
        
        @k0
        @Override
        public com.bumptech.glide.request.d o() {
            return this.I;
        }
        
        @Override
        public void onDestroy() {
        }
        
        @Override
        public void p(@k0 final Drawable drawable) {
        }
        
        @Override
        public void r(@j0 final o o) {
            o.f(this.H, this.G);
        }
    }
    
    private static final class d
    {
        final Queue<c> a;
        
        d(final int n) {
            this.a = m.f(n);
            for (int i = 0; i < n; ++i) {
                this.a.offer(new c());
            }
        }
        
        public c a(final int h, final int g) {
            final c c = this.a.poll();
            this.a.offer(c);
            c.H = h;
            c.G = g;
            return c;
        }
    }
}
