// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.core.util.n;
import androidx.annotation.k0;
import androidx.annotation.j0;

class x
{
    @j0
    private final m0.c a;
    @j0
    private final h0.d b;
    public final RecyclerView.h<RecyclerView.g0> c;
    final b d;
    int e;
    private RecyclerView.j f;
    
    x(final RecyclerView.h<RecyclerView.g0> c, final b d, final m0 m0, final h0.d b) {
        this.f = new RecyclerView.j() {
            @Override
            public void a() {
                final x a = x.this;
                a.e = a.c.getItemCount();
                final x a2 = x.this;
                a2.d.f(a2);
            }
            
            @Override
            public void b(final int n, final int n2) {
                final x a = x.this;
                a.d.b(a, n, n2, null);
            }
            
            @Override
            public void c(final int n, final int n2, @k0 final Object o) {
                final x a = x.this;
                a.d.b(a, n, n2, o);
            }
            
            @Override
            public void d(final int n, final int n2) {
                final x a = x.this;
                a.e += n2;
                a.d.d(a, n, n2);
                final x a2 = x.this;
                if (a2.e > 0 && a2.c.getStateRestorationPolicy() == h.a.H) {
                    final x a3 = x.this;
                    a3.d.a(a3);
                }
            }
            
            @Override
            public void e(final int n, final int n2, final int n3) {
                boolean b = true;
                if (n3 != 1) {
                    b = false;
                }
                n.b(b, "moving more than 1 item is not supported in RecyclerView");
                final x a = x.this;
                a.d.e(a, n, n2);
            }
            
            @Override
            public void f(final int n, final int n2) {
                final x a = x.this;
                a.e -= n2;
                a.d.g(a, n, n2);
                final x a2 = x.this;
                if (a2.e < 1 && a2.c.getStateRestorationPolicy() == h.a.H) {
                    final x a3 = x.this;
                    a3.d.a(a3);
                }
            }
            
            @Override
            public void g() {
                final x a = x.this;
                a.d.a(a);
            }
        };
        this.c = c;
        this.d = d;
        this.a = m0.b(this);
        this.b = b;
        this.e = c.getItemCount();
        c.registerAdapterDataObserver(this.f);
    }
    
    void a() {
        this.c.unregisterAdapterDataObserver(this.f);
        this.a.dispose();
    }
    
    int b() {
        return this.e;
    }
    
    public long c(final int n) {
        return this.b.a(this.c.getItemId(n));
    }
    
    int d(final int n) {
        return this.a.b(this.c.getItemViewType(n));
    }
    
    void e(final RecyclerView.g0 g0, final int n) {
        this.c.bindViewHolder(g0, n);
    }
    
    RecyclerView.g0 f(final ViewGroup viewGroup, int a) {
        a = this.a.a(a);
        return this.c.onCreateViewHolder(viewGroup, a);
    }
    
    interface b
    {
        void a(final x p0);
        
        void b(@j0 final x p0, final int p1, final int p2, @k0 final Object p3);
        
        void c(@j0 final x p0, final int p1, final int p2);
        
        void d(@j0 final x p0, final int p1, final int p2);
        
        void e(@j0 final x p0, final int p1, final int p2);
        
        void f(@j0 final x p0);
        
        void g(@j0 final x p0, final int p1, final int p2);
    }
}
