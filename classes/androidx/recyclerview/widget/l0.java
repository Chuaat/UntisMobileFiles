// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import androidx.annotation.j0;
import androidx.annotation.k0;
import androidx.collection.h;
import androidx.annotation.b1;
import androidx.collection.m;

class l0
{
    private static final boolean c = false;
    @b1
    final m<RecyclerView.g0, a> a;
    @b1
    final h<RecyclerView.g0> b;
    
    l0() {
        this.a = new m<RecyclerView.g0, a>();
        this.b = new h<RecyclerView.g0>();
    }
    
    private RecyclerView.m.d l(final RecyclerView.g0 g0, final int n) {
        final int f = this.a.f(g0);
        if (f < 0) {
            return null;
        }
        final a a = this.a.o(f);
        if (a != null) {
            final int a2 = a.a;
            if ((a2 & n) != 0x0) {
                final int a3 = ~n & a2;
                a.a = a3;
                RecyclerView.m.d d;
                if (n == 4) {
                    d = a.b;
                }
                else {
                    if (n != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    d = a.c;
                }
                if ((a3 & 0xC) == 0x0) {
                    this.a.k(f);
                    l0.a.c(a);
                }
                return d;
            }
        }
        return null;
    }
    
    void a(final RecyclerView.g0 g0, final RecyclerView.m.d b) {
        a b2;
        if ((b2 = this.a.get(g0)) == null) {
            b2 = l0.a.b();
            this.a.put(g0, b2);
        }
        b2.a |= 0x2;
        b2.b = b;
    }
    
    void b(final RecyclerView.g0 g0) {
        a b;
        if ((b = this.a.get(g0)) == null) {
            b = l0.a.b();
            this.a.put(g0, b);
        }
        b.a |= 0x1;
    }
    
    void c(final long n, final RecyclerView.g0 g0) {
        this.b.s(n, g0);
    }
    
    void d(final RecyclerView.g0 g0, final RecyclerView.m.d c) {
        a b;
        if ((b = this.a.get(g0)) == null) {
            b = l0.a.b();
            this.a.put(g0, b);
        }
        b.c = c;
        b.a |= 0x8;
    }
    
    void e(final RecyclerView.g0 g0, final RecyclerView.m.d b) {
        a b2;
        if ((b2 = this.a.get(g0)) == null) {
            b2 = l0.a.b();
            this.a.put(g0, b2);
        }
        b2.b = b;
        b2.a |= 0x4;
    }
    
    void f() {
        this.a.clear();
        this.b.b();
    }
    
    RecyclerView.g0 g(final long n) {
        return this.b.j(n);
    }
    
    boolean h(final RecyclerView.g0 g0) {
        final a a = this.a.get(g0);
        boolean b = true;
        if (a == null || (a.a & 0x1) == 0x0) {
            b = false;
        }
        return b;
    }
    
    boolean i(final RecyclerView.g0 g0) {
        final a a = this.a.get(g0);
        return a != null && (a.a & 0x4) != 0x0;
    }
    
    void j() {
        l0.a.a();
    }
    
    public void k(final RecyclerView.g0 g0) {
        this.p(g0);
    }
    
    @k0
    RecyclerView.m.d m(final RecyclerView.g0 g0) {
        return this.l(g0, 8);
    }
    
    @k0
    RecyclerView.m.d n(final RecyclerView.g0 g0) {
        return this.l(g0, 4);
    }
    
    void o(final b b) {
        for (int i = this.a.size() - 1; i >= 0; --i) {
            final RecyclerView.g0 g0 = this.a.i(i);
            final a a = this.a.k(i);
            final int a2 = a.a;
            Label_0198: {
                Label_0054: {
                    if ((a2 & 0x3) != 0x3) {
                        RecyclerView.m.d d = null;
                        RecyclerView.m.d c = null;
                        Label_0093: {
                            if ((a2 & 0x1) == 0x0) {
                                if ((a2 & 0xE) != 0xE) {
                                    if ((a2 & 0xC) == 0xC) {
                                        b.d(g0, a.b, a.c);
                                        break Label_0198;
                                    }
                                    if ((a2 & 0x4) != 0x0) {
                                        d = a.b;
                                        c = null;
                                        break Label_0093;
                                    }
                                    if ((a2 & 0x8) == 0x0) {
                                        break Label_0198;
                                    }
                                }
                                b.b(g0, a.b, a.c);
                                break Label_0198;
                            }
                            d = a.b;
                            if (d == null) {
                                break Label_0054;
                            }
                            c = a.c;
                        }
                        b.c(g0, d, c);
                        break Label_0198;
                    }
                }
                b.a(g0);
            }
            l0.a.c(a);
        }
    }
    
    void p(final RecyclerView.g0 g0) {
        final a a = this.a.get(g0);
        if (a == null) {
            return;
        }
        a.a &= 0xFFFFFFFE;
    }
    
    void q(final RecyclerView.g0 g0) {
        for (int i = this.b.B() - 1; i >= 0; --i) {
            if (g0 == this.b.C(i)) {
                this.b.x(i);
                break;
            }
        }
        final a a = this.a.remove(g0);
        if (a != null) {
            l0.a.c(a);
        }
    }
    
    static class a
    {
        static final int d = 1;
        static final int e = 2;
        static final int f = 4;
        static final int g = 8;
        static final int h = 3;
        static final int i = 12;
        static final int j = 14;
        static androidx.core.util.m.a<a> k;
        int a;
        @k0
        RecyclerView.m.d b;
        @k0
        RecyclerView.m.d c;
        
        static {
            a.k = new androidx.core.util.m.b<a>(20);
        }
        
        private a() {
        }
        
        static void a() {
            while (a.k.b() != null) {}
        }
        
        static a b() {
            a a;
            if ((a = l0.a.k.b()) == null) {
                a = new a();
            }
            return a;
        }
        
        static void c(final a a) {
            a.a = 0;
            a.b = null;
            a.c = null;
            l0.a.k.a(a);
        }
    }
    
    interface b
    {
        void a(final RecyclerView.g0 p0);
        
        void b(final RecyclerView.g0 p0, @k0 final RecyclerView.m.d p1, final RecyclerView.m.d p2);
        
        void c(final RecyclerView.g0 p0, @j0 final RecyclerView.m.d p1, @k0 final RecyclerView.m.d p2);
        
        void d(final RecyclerView.g0 p0, @j0 final RecyclerView.m.d p1, @j0 final RecyclerView.m.d p2);
    }
}
