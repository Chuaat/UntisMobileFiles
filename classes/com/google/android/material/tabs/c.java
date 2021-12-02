// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.tabs;

import java.lang.ref.WeakReference;
import androidx.annotation.k0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.annotation.j0;

public final class c
{
    @j0
    private final TabLayout a;
    @j0
    private final ViewPager2 b;
    private final boolean c;
    private final boolean d;
    private final b e;
    @k0
    private RecyclerView.h<?> f;
    private boolean g;
    @k0
    private c h;
    @k0
    private TabLayout.f i;
    @k0
    private RecyclerView.j j;
    
    public c(@j0 final TabLayout tabLayout, @j0 final ViewPager2 viewPager2, @j0 final b b) {
        this(tabLayout, viewPager2, true, b);
    }
    
    public c(@j0 final TabLayout tabLayout, @j0 final ViewPager2 viewPager2, final boolean b, @j0 final b b2) {
        this(tabLayout, viewPager2, b, true, b2);
    }
    
    public c(@j0 final TabLayout a, @j0 final ViewPager2 b, final boolean c, final boolean d, @j0 final b e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public void a() {
        if (this.g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        if ((this.f = (RecyclerView.h<?>)this.b.getAdapter()) != null) {
            this.g = true;
            final c h = new c(this.a);
            this.h = h;
            this.b.n((ViewPager2.j)h);
            final d i = new d(this.b, this.d);
            this.i = i;
            this.a.d((TabLayout.f)i);
            if (this.c) {
                final a j = new a();
                this.j = j;
                this.f.registerAdapterDataObserver(j);
            }
            this.d();
            this.a.P(this.b.getCurrentItem(), 0.0f, true);
            return;
        }
        throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
    }
    
    public void b() {
        if (this.c) {
            final RecyclerView.h<?> f = this.f;
            if (f != null) {
                f.unregisterAdapterDataObserver(this.j);
                this.j = null;
            }
        }
        this.a.I(this.i);
        this.b.x((ViewPager2.j)this.h);
        this.i = null;
        this.h = null;
        this.f = null;
        this.g = false;
    }
    
    public boolean c() {
        return this.g;
    }
    
    void d() {
        this.a.G();
        final RecyclerView.h<?> f = this.f;
        if (f != null) {
            final int itemCount = f.getItemCount();
            for (int i = 0; i < itemCount; ++i) {
                final TabLayout.i d = this.a.D();
                this.e.a(d, i);
                this.a.h(d, false);
            }
            if (itemCount > 0) {
                final int min = Math.min(this.b.getCurrentItem(), this.a.getTabCount() - 1);
                if (min != this.a.getSelectedTabPosition()) {
                    final TabLayout a = this.a;
                    a.M(a.z(min));
                }
            }
        }
    }
    
    private class a extends j
    {
        a() {
        }
        
        @Override
        public void a() {
            c.this.d();
        }
        
        @Override
        public void b(final int n, final int n2) {
            c.this.d();
        }
        
        @Override
        public void c(final int n, final int n2, @k0 final Object o) {
            c.this.d();
        }
        
        @Override
        public void d(final int n, final int n2) {
            c.this.d();
        }
        
        @Override
        public void e(final int n, final int n2, final int n3) {
            c.this.d();
        }
        
        @Override
        public void f(final int n, final int n2) {
            c.this.d();
        }
    }
    
    public interface b
    {
        void a(@j0 final TabLayout.i p0, final int p1);
    }
    
    private static class c extends j
    {
        @j0
        private final WeakReference<TabLayout> a;
        private int b;
        private int c;
        
        c(final TabLayout referent) {
            this.a = new WeakReference<TabLayout>(referent);
            this.d();
        }
        
        @Override
        public void a(final int c) {
            this.b = this.c;
            this.c = c;
        }
        
        @Override
        public void b(final int n, final float n2, int c) {
            final TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                c = this.c;
                boolean b = false;
                final boolean b2 = c != 2 || this.b == 1;
                if (c != 2 || this.b != 0) {
                    b = true;
                }
                tabLayout.Q(n, n2, b2, b);
            }
        }
        
        @Override
        public void c(final int n) {
            final TabLayout tabLayout = this.a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != n && n < tabLayout.getTabCount()) {
                final int c = this.c;
                tabLayout.N(tabLayout.z(n), c == 0 || (c == 2 && this.b == 0));
            }
        }
        
        void d() {
            this.c = 0;
            this.b = 0;
        }
    }
    
    private static class d implements f
    {
        private final ViewPager2 G;
        private final boolean H;
        
        d(final ViewPager2 g, final boolean h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void g(final i i) {
        }
        
        @Override
        public void i(@j0 final i i) {
            this.G.s(i.k(), this.H);
        }
        
        @Override
        public void p(final i i) {
        }
    }
}
