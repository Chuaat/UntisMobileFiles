// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.view.ViewGroup$LayoutParams;
import java.util.ArrayList;
import android.view.View;
import java.util.List;

class g
{
    private static final boolean d = false;
    private static final String e = "ChildrenHelper";
    final b a;
    final a b;
    final List<View> c;
    
    g(final b a) {
        this.a = a;
        this.b = new a();
        this.c = new ArrayList<View>();
    }
    
    private int h(final int n) {
        if (n < 0) {
            return -1;
        }
        int n2;
        for (int c = this.a.c(), i = n; i < c; i += n2) {
            n2 = n - (i - this.b.b(i));
            if (n2 == 0) {
                while (this.b.d(i)) {
                    ++i;
                }
                return i;
            }
        }
        return -1;
    }
    
    private void l(final View view) {
        this.c.add(view);
        this.a.b(view);
    }
    
    private boolean t(final View view) {
        if (this.c.remove(view)) {
            this.a.h(view);
            return true;
        }
        return false;
    }
    
    void a(final View view, int n, final boolean b) {
        if (n < 0) {
            n = this.a.c();
        }
        else {
            n = this.h(n);
        }
        this.b.e(n, b);
        if (b) {
            this.l(view);
        }
        this.a.i(view, n);
    }
    
    void b(final View view, final boolean b) {
        this.a(view, -1, b);
    }
    
    void c(final View view, int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        if (n < 0) {
            n = this.a.c();
        }
        else {
            n = this.h(n);
        }
        this.b.e(n, b);
        if (b) {
            this.l(view);
        }
        this.a.k(view, n, viewGroup$LayoutParams);
    }
    
    void d(int h) {
        h = this.h(h);
        this.b.f(h);
        this.a.g(h);
    }
    
    View e(final int n) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final View view = this.c.get(i);
            final RecyclerView.g0 f = this.a.f(view);
            if (f.getLayoutPosition() == n && !f.isInvalid() && !f.isRemoved()) {
                return view;
            }
        }
        return null;
    }
    
    View f(int h) {
        h = this.h(h);
        return this.a.a(h);
    }
    
    int g() {
        return this.a.c() - this.c.size();
    }
    
    View i(final int n) {
        return this.a.a(n);
    }
    
    int j() {
        return this.a.c();
    }
    
    void k(final View obj) {
        final int e = this.a.e(obj);
        if (e >= 0) {
            this.b.h(e);
            this.l(obj);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("view is not a child, cannot hide ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    int m(final View view) {
        final int e = this.a.e(view);
        if (e == -1) {
            return -1;
        }
        if (this.b.d(e)) {
            return -1;
        }
        return e - this.b.b(e);
    }
    
    boolean n(final View view) {
        return this.c.contains(view);
    }
    
    void o() {
        this.b.g();
        for (int i = this.c.size() - 1; i >= 0; --i) {
            this.a.h(this.c.get(i));
            this.c.remove(i);
        }
        this.a.d();
    }
    
    void p(final View view) {
        final int e = this.a.e(view);
        if (e < 0) {
            return;
        }
        if (this.b.f(e)) {
            this.t(view);
        }
        this.a.j(e);
    }
    
    void q(int h) {
        h = this.h(h);
        final View a = this.a.a(h);
        if (a == null) {
            return;
        }
        if (this.b.f(h)) {
            this.t(a);
        }
        this.a.j(h);
    }
    
    boolean r(final View view) {
        final int e = this.a.e(view);
        if (e == -1) {
            this.t(view);
            return true;
        }
        if (this.b.d(e)) {
            this.b.f(e);
            this.t(view);
            this.a.j(e);
            return true;
        }
        return false;
    }
    
    void s(final View view) {
        final int e = this.a.e(view);
        if (e < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.b.d(e)) {
            this.b.a(e);
            this.t(view);
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("trying to unhide a view that was not hidden");
        sb2.append(view);
        throw new RuntimeException(sb2.toString());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b.toString());
        sb.append(", hidden list:");
        sb.append(this.c.size());
        return sb.toString();
    }
    
    static class a
    {
        static final int c = 64;
        static final long d = Long.MIN_VALUE;
        long a;
        a b;
        
        a() {
            this.a = 0L;
        }
        
        private void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }
        
        void a(final int n) {
            if (n >= 64) {
                final a b = this.b;
                if (b != null) {
                    b.a(n - 64);
                }
            }
            else {
                this.a &= ~(1L << n);
            }
        }
        
        int b(final int n) {
            final a b = this.b;
            if (b == null) {
                if (n >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & (1L << n) - 1L);
            }
            else {
                if (n < 64) {
                    return Long.bitCount(this.a & (1L << n) - 1L);
                }
                return b.b(n - 64) + Long.bitCount(this.a);
            }
        }
        
        boolean d(final int n) {
            if (n >= 64) {
                this.c();
                return this.b.d(n - 64);
            }
            return (this.a & 1L << n) != 0x0L;
        }
        
        void e(final int n, final boolean b) {
            if (n >= 64) {
                this.c();
                this.b.e(n - 64, b);
            }
            else {
                final long a = this.a;
                final boolean b2 = (Long.MIN_VALUE & a) != 0x0L;
                final long n2 = (1L << n) - 1L;
                this.a = ((a & ~n2) << 1 | (a & n2));
                if (b) {
                    this.h(n);
                }
                else {
                    this.a(n);
                }
                if (b2 || this.b != null) {
                    this.c();
                    this.b.e(0, b2);
                }
            }
        }
        
        boolean f(final int n) {
            if (n >= 64) {
                this.c();
                return this.b.f(n - 64);
            }
            final long n2 = 1L << n;
            final long a = this.a;
            final boolean b = (a & n2) != 0x0L;
            final long a2 = a & ~n2;
            this.a = a2;
            final long n3 = n2 - 1L;
            this.a = ((a2 & n3) | Long.rotateRight(~n3 & a2, 1));
            final a b2 = this.b;
            if (b2 != null) {
                if (b2.d(0)) {
                    this.h(63);
                }
                this.b.f(0);
            }
            return b;
        }
        
        void g() {
            this.a = 0L;
            final a b = this.b;
            if (b != null) {
                b.g();
            }
        }
        
        void h(final int n) {
            if (n >= 64) {
                this.c();
                this.b.h(n - 64);
            }
            else {
                this.a |= 1L << n;
            }
        }
        
        @Override
        public String toString() {
            String s;
            if (this.b == null) {
                s = Long.toBinaryString(this.a);
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.b.toString());
                sb.append("xx");
                sb.append(Long.toBinaryString(this.a));
                s = sb.toString();
            }
            return s;
        }
    }
    
    interface b
    {
        View a(final int p0);
        
        void b(final View p0);
        
        int c();
        
        void d();
        
        int e(final View p0);
        
        RecyclerView.g0 f(final View p0);
        
        void g(final int p0);
        
        void h(final View p0);
        
        void i(final View p0, final int p1);
        
        void j(final int p0);
        
        void k(final View p0, final int p1, final ViewGroup$LayoutParams p2);
    }
}
