// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import androidx.annotation.a1;
import androidx.annotation.c1;
import androidx.annotation.k0;
import android.util.SparseBooleanArray;
import android.util.Log;
import android.util.SparseIntArray;

public class e<T>
{
    static final String s = "AsyncListUtil";
    static final boolean t = false;
    final Class<T> a;
    final int b;
    final c<T> c;
    final d d;
    final j0<T> e;
    final i0.b<T> f;
    final i0.a<T> g;
    final int[] h;
    final int[] i;
    final int[] j;
    boolean k;
    private int l;
    int m;
    int n;
    int o;
    final SparseIntArray p;
    private final i0.b<T> q;
    private final i0.a<T> r;
    
    public e(@androidx.annotation.j0 final Class<T> a, final int b, @androidx.annotation.j0 final c<T> c, @androidx.annotation.j0 final d d) {
        this.h = new int[2];
        this.i = new int[2];
        this.j = new int[2];
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = new SparseIntArray();
        final i0.b<T> q = new i0.b<T>() {
            private boolean d(final int n) {
                return n == androidx.recyclerview.widget.e.this.o;
            }
            
            private void e() {
                for (int i = 0; i < androidx.recyclerview.widget.e.this.e.f(); ++i) {
                    final e a = androidx.recyclerview.widget.e.this;
                    a.g.b(a.e.c(i));
                }
                androidx.recyclerview.widget.e.this.e.b();
            }
            
            @Override
            public void a(int i, final j0.a<T> a) {
                if (!this.d(i)) {
                    androidx.recyclerview.widget.e.this.g.b(a);
                    return;
                }
                final j0.a<T> a2 = androidx.recyclerview.widget.e.this.e.a(a);
                if (a2 != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("duplicate tile @");
                    sb.append(a2.b);
                    Log.e("AsyncListUtil", sb.toString());
                    androidx.recyclerview.widget.e.this.g.b(a2);
                }
                final int b = a.b;
                final int c = a.c;
                i = 0;
                while (i < androidx.recyclerview.widget.e.this.p.size()) {
                    final int key = androidx.recyclerview.widget.e.this.p.keyAt(i);
                    if (a.b <= key && key < b + c) {
                        androidx.recyclerview.widget.e.this.p.removeAt(i);
                        androidx.recyclerview.widget.e.this.d.d(key);
                    }
                    else {
                        ++i;
                    }
                }
            }
            
            @Override
            public void b(final int n, final int i) {
                if (!this.d(n)) {
                    return;
                }
                final j0.a<T> e = androidx.recyclerview.widget.e.this.e.e(i);
                if (e == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("tile not found @");
                    sb.append(i);
                    Log.e("AsyncListUtil", sb.toString());
                    return;
                }
                androidx.recyclerview.widget.e.this.g.b(e);
            }
            
            @Override
            public void c(final int n, final int m) {
                if (!this.d(n)) {
                    return;
                }
                final e a = androidx.recyclerview.widget.e.this;
                a.m = m;
                a.d.c();
                final e a2 = androidx.recyclerview.widget.e.this;
                a2.n = a2.o;
                this.e();
                final e a3 = androidx.recyclerview.widget.e.this;
                a3.k = false;
                a3.g();
            }
        };
        this.q = q;
        final i0.a<T> r = new i0.a<T>() {
            private j0.a<T> a;
            final SparseBooleanArray b = new SparseBooleanArray();
            private int c;
            private int d;
            private int e;
            private int f;
            
            private j0.a<T> e() {
                final j0.a<T> a = this.a;
                if (a != null) {
                    this.a = a.d;
                    return a;
                }
                final e g = androidx.recyclerview.widget.e.this;
                return (j0.a<T>)new j0.a((Class<Object>)g.a, g.b);
            }
            
            private void f(final j0.a<T> a) {
                this.b.put(a.b, true);
                androidx.recyclerview.widget.e.this.f.a(this.c, a);
            }
            
            private void g(final int n) {
                while (this.b.size() >= androidx.recyclerview.widget.e.this.c.b()) {
                    final int key = this.b.keyAt(0);
                    final SparseBooleanArray b = this.b;
                    final int key2 = b.keyAt(b.size() - 1);
                    final int n2 = this.e - key;
                    final int n3 = key2 - this.f;
                    if (n2 > 0 && (n2 >= n3 || n == 2)) {
                        this.k(key);
                    }
                    else {
                        if (n3 <= 0 || (n2 >= n3 && n != 1)) {
                            break;
                        }
                        this.k(key2);
                    }
                }
            }
            
            private int h(final int n) {
                return n - n % androidx.recyclerview.widget.e.this.b;
            }
            
            private boolean i(final int n) {
                return this.b.get(n);
            }
            
            private void j(final String format, final Object... args) {
                final StringBuilder sb = new StringBuilder();
                sb.append("[BKGR] ");
                sb.append(String.format(format, args));
                Log.d("AsyncListUtil", sb.toString());
            }
            
            private void k(final int n) {
                this.b.delete(n);
                androidx.recyclerview.widget.e.this.f.b(this.c, n);
            }
            
            private void l(final int n, final int n2, final int n3, final boolean b) {
                for (int i = n; i <= n2; i += androidx.recyclerview.widget.e.this.b) {
                    int n4;
                    if (b) {
                        n4 = n2 + n - i;
                    }
                    else {
                        n4 = i;
                    }
                    androidx.recyclerview.widget.e.this.g.c(n4, n3);
                }
            }
            
            @Override
            public void a(int h, int h2, int h3, final int n, final int n2) {
                if (h > h2) {
                    return;
                }
                h = this.h(h);
                h2 = this.h(h2);
                this.e = this.h(h3);
                h3 = this.h(n);
                this.f = h3;
                if (n2 == 1) {
                    this.l(this.e, h2, n2, true);
                    this.l(h2 + androidx.recyclerview.widget.e.this.b, this.f, n2, false);
                }
                else {
                    this.l(h, h3, n2, false);
                    this.l(this.e, h - androidx.recyclerview.widget.e.this.b, n2, true);
                }
            }
            
            @Override
            public void b(final j0.a<T> a) {
                androidx.recyclerview.widget.e.this.c.c(a.a, a.c);
                a.d = this.a;
                this.a = a;
            }
            
            @Override
            public void c(int min, final int n) {
                if (this.i(min)) {
                    return;
                }
                final j0.a<T> e = this.e();
                e.b = min;
                min = Math.min(androidx.recyclerview.widget.e.this.b, this.d - min);
                e.c = min;
                androidx.recyclerview.widget.e.this.c.a(e.a, e.b, min);
                this.g(n);
                this.f(e);
            }
            
            @Override
            public void d(int d) {
                this.c = d;
                this.b.clear();
                d = androidx.recyclerview.widget.e.this.c.d();
                this.d = d;
                androidx.recyclerview.widget.e.this.f.c(this.c, d);
            }
        };
        this.r = r;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new j0<T>(b);
        final w<T> w = new w<T>();
        this.f = w.b((i0.b<T>)q);
        this.g = w.a((i0.a<T>)r);
        this.f();
    }
    
    private boolean c() {
        return this.o != this.n;
    }
    
    @k0
    public T a(final int i) {
        if (i >= 0 && i < this.m) {
            final T d = this.e.d(i);
            if (d == null && !this.c()) {
                this.p.put(i, 0);
            }
            return d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not within 0 and ");
        sb.append(this.m);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public int b() {
        return this.m;
    }
    
    void d(final String format, final Object... args) {
        final StringBuilder sb = new StringBuilder();
        sb.append("[MAIN] ");
        sb.append(String.format(format, args));
        Log.d("AsyncListUtil", sb.toString());
    }
    
    public void e() {
        if (this.c()) {
            return;
        }
        this.g();
        this.k = true;
    }
    
    public void f() {
        this.p.clear();
        this.g.d(++this.o);
    }
    
    void g() {
        this.d.b(this.h);
        final int[] h = this.h;
        if (h[0] <= h[1]) {
            if (h[0] >= 0) {
                if (h[1] >= this.m) {
                    return;
                }
                Label_0119: {
                    if (this.k) {
                        final int n = h[0];
                        final int[] i = this.i;
                        if (n <= i[1]) {
                            if (i[0] <= h[1]) {
                                if (h[0] < i[0]) {
                                    this.l = 1;
                                    break Label_0119;
                                }
                                if (h[0] > i[0]) {
                                    this.l = 2;
                                }
                                break Label_0119;
                            }
                        }
                    }
                    this.l = 0;
                }
                final int[] j = this.i;
                j[0] = h[0];
                j[1] = h[1];
                this.d.a(h, this.j, this.l);
                final int[] k = this.j;
                k[0] = Math.min(this.h[0], Math.max(k[0], 0));
                final int[] l = this.j;
                l[1] = Math.max(this.h[1], Math.min(l[1], this.m - 1));
                final i0.a<T> g = this.g;
                final int[] h2 = this.h;
                final int n2 = h2[0];
                final int n3 = h2[1];
                final int[] m = this.j;
                g.a(n2, n3, m[0], m[1], this.l);
            }
        }
    }
    
    public abstract static class c<T>
    {
        @c1
        public abstract void a(@androidx.annotation.j0 final T[] p0, final int p1, final int p2);
        
        @c1
        public int b() {
            return 10;
        }
        
        @c1
        public void c(@androidx.annotation.j0 final T[] array, final int n) {
        }
        
        @c1
        public abstract int d();
    }
    
    public abstract static class d
    {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        
        @a1
        public void a(@androidx.annotation.j0 final int[] array, @androidx.annotation.j0 final int[] array2, final int n) {
            int n2 = array[1] - array[0] + 1;
            final int n3 = n2 / 2;
            final int n4 = array[0];
            int n5;
            if (n == 1) {
                n5 = n2;
            }
            else {
                n5 = n3;
            }
            array2[0] = n4 - n5;
            final int n6 = array[1];
            if (n != 2) {
                n2 = n3;
            }
            array2[1] = n6 + n2;
        }
        
        @a1
        public abstract void b(@androidx.annotation.j0 final int[] p0);
        
        @a1
        public abstract void c();
        
        @a1
        public abstract void d(final int p0);
    }
}
