// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.util.Iterator;
import java.util.ArrayList;

class m
{
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static int k;
    public int a;
    public boolean b;
    p c;
    p d;
    ArrayList<p> e;
    int f;
    int g;
    
    public m(final p p2, final int g) {
        this.a = 0;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = new ArrayList<p>();
        this.f = 0;
        final int k = m.k;
        this.f = k;
        m.k = k + 1;
        this.c = p2;
        this.d = p2;
        this.g = g;
    }
    
    private boolean c(final p p2, final int n) {
        if (!p2.b.g[n]) {
            return false;
        }
        for (final d d : p2.h.k) {
            if (d instanceof f) {
                final f f = (f)d;
                final p d2 = f.d;
                if (d2 == p2) {
                    continue;
                }
                if (f != d2.h) {
                    continue;
                }
                if (p2 instanceof c) {
                    final Iterator<p> iterator2 = ((c)p2).k.iterator();
                    while (iterator2.hasNext()) {
                        this.c(iterator2.next(), n);
                    }
                }
                else if (!(p2 instanceof k)) {
                    p2.b.g[n] = false;
                }
                this.c(f.d, n);
            }
        }
        for (final d d3 : p2.i.k) {
            if (d3 instanceof f) {
                final f f2 = (f)d3;
                final p d4 = f2.d;
                if (d4 == p2) {
                    continue;
                }
                if (f2 != d4.h) {
                    continue;
                }
                if (p2 instanceof c) {
                    final Iterator<p> iterator4 = ((c)p2).k.iterator();
                    while (iterator4.hasNext()) {
                        this.c(iterator4.next(), n);
                    }
                }
                else if (!(p2 instanceof k)) {
                    p2.b.g[n] = false;
                }
                this.c(f2.d, n);
            }
        }
        return false;
    }
    
    private long e(f h, long n) {
        final p d = h.d;
        if (d instanceof k) {
            return n;
        }
        final int size = h.k.size();
        int i = 0;
        long n2 = n;
        while (i < size) {
            final d d2 = h.k.get(i);
            long min = n2;
            if (d2 instanceof f) {
                final f f = (f)d2;
                if (f.d == d) {
                    min = n2;
                }
                else {
                    min = Math.min(n2, this.e(f, f.f + n));
                }
            }
            ++i;
            n2 = min;
        }
        long min2 = n2;
        if (h == d.i) {
            final long j = d.j();
            h = d.h;
            n -= j;
            min2 = Math.min(Math.min(n2, this.e(h, n)), n - d.h.f);
        }
        return min2;
    }
    
    private long f(f i, long n) {
        final p d = i.d;
        if (d instanceof k) {
            return n;
        }
        final int size = i.k.size();
        int j = 0;
        long n2 = n;
        while (j < size) {
            final d d2 = i.k.get(j);
            long max = n2;
            if (d2 instanceof f) {
                final f f = (f)d2;
                if (f.d == d) {
                    max = n2;
                }
                else {
                    max = Math.max(n2, this.f(f, f.f + n));
                }
            }
            ++j;
            n2 = max;
        }
        long max2 = n2;
        if (i == d.h) {
            final long k = d.j();
            i = d.i;
            n += k;
            max2 = Math.max(Math.max(n2, this.f(i, n)), n - d.i.f);
        }
        return max2;
    }
    
    public void a(final p p) {
        this.e.add(p);
        this.d = p;
    }
    
    public long b(final androidx.constraintlayout.core.widgets.f f, final int n) {
        final p c = this.c;
        final boolean b = c instanceof c;
        long n2 = 0L;
        if (b) {
            if (((c)c).f != n) {
                return 0L;
            }
        }
        else if (n == 0) {
            if (!(c instanceof l)) {
                return 0L;
            }
        }
        else if (!(c instanceof n)) {
            return 0L;
        }
        p p2;
        if (n == 0) {
            p2 = f.e;
        }
        else {
            p2 = f.f;
        }
        final f h = p2.h;
        p p3;
        if (n == 0) {
            p3 = f.e;
        }
        else {
            p3 = f.f;
        }
        final f i = p3.i;
        final boolean contains = c.h.l.contains(h);
        final boolean contains2 = this.c.i.l.contains(i);
        final long j = this.c.j();
        if (!contains || !contains2) {
            long f2;
            long b2;
            if (contains) {
                final f h2 = this.c.h;
                f2 = this.f(h2, h2.f);
                b2 = this.c.h.f + j;
            }
            else {
                if (!contains2) {
                    final p c2 = this.c;
                    final long n3 = c2.h.f + c2.j();
                    final p p4 = this.c;
                    return n3 - p4.i.f;
                }
                final f k = this.c.i;
                final long e = this.e(k, k.f);
                b2 = -this.c.i.f + j;
                f2 = -e;
            }
            return Math.max(f2, b2);
        }
        final long f3 = this.f(this.c.h, 0L);
        final long e2 = this.e(this.c.i, 0L);
        final long n4 = f3 - j;
        final p c3 = this.c;
        final int f4 = c3.i.f;
        long n5 = n4;
        if (n4 >= -f4) {
            n5 = n4 + f4;
        }
        final long n6 = -e2;
        final int f5 = c3.h.f;
        long n8;
        final long n7 = n8 = n6 - j - f5;
        if (n7 >= f5) {
            n8 = n7 - f5;
        }
        final float u = c3.b.u(n);
        if (u > 0.0f) {
            n2 = (long)(n8 / u + n5 / (1.0f - u));
        }
        final float n9 = (float)n2;
        final long n10 = (long)(n9 * u + 0.5f);
        final long n11 = (long)(n9 * (1.0f - u) + 0.5f);
        final p p4 = this.c;
        final long n3 = p4.h.f + (n10 + j + n11);
        return n3 - p4.i.f;
    }
    
    public void d(final boolean b, final boolean b2) {
        if (b) {
            final p c = this.c;
            if (c instanceof l) {
                this.c(c, 0);
            }
        }
        if (b2) {
            final p c2 = this.c;
            if (c2 instanceof n) {
                this.c(c2, 1);
            }
        }
    }
}
