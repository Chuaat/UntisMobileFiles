// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.view.View;

class k0
{
    static final int c = 1;
    static final int d = 2;
    static final int e = 4;
    static final int f = 0;
    static final int g = 1;
    static final int h = 2;
    static final int i = 4;
    static final int j = 4;
    static final int k = 16;
    static final int l = 32;
    static final int m = 64;
    static final int n = 8;
    static final int o = 256;
    static final int p = 512;
    static final int q = 1024;
    static final int r = 12;
    static final int s = 4096;
    static final int t = 8192;
    static final int u = 16384;
    static final int v = 7;
    final b a;
    a b;
    
    k0(final b a) {
        this.a = a;
        this.b = new a();
    }
    
    View a(int i, final int n, final int n2, final int n3) {
        final int c = this.a.c();
        final int d = this.a.d();
        int n4;
        if (n > i) {
            n4 = 1;
        }
        else {
            n4 = -1;
        }
        View view = null;
        while (i != n) {
            final View a = this.a.a(i);
            this.b.e(c, d, this.a.b(a), this.a.e(a));
            if (n2 != 0) {
                this.b.d();
                this.b.a(n2);
                if (this.b.b()) {
                    return a;
                }
            }
            View view2 = view;
            if (n3 != 0) {
                this.b.d();
                this.b.a(n3);
                view2 = view;
                if (this.b.b()) {
                    view2 = a;
                }
            }
            i += n4;
            view = view2;
        }
        return view;
    }
    
    boolean b(final View view, final int n) {
        this.b.e(this.a.c(), this.a.d(), this.a.b(view), this.a.e(view));
        if (n != 0) {
            this.b.d();
            this.b.a(n);
            return this.b.b();
        }
        return false;
    }
    
    static class a
    {
        int a;
        int b;
        int c;
        int d;
        int e;
        
        a() {
            this.a = 0;
        }
        
        void a(final int n) {
            this.a |= n;
        }
        
        boolean b() {
            final int a = this.a;
            if ((a & 0x7) != 0x0 && (a & this.c(this.d, this.b) << 0) == 0x0) {
                return false;
            }
            final int a2 = this.a;
            if ((a2 & 0x70) != 0x0 && (a2 & this.c(this.d, this.c) << 4) == 0x0) {
                return false;
            }
            final int a3 = this.a;
            if ((a3 & 0x700) != 0x0 && (a3 & this.c(this.e, this.b) << 8) == 0x0) {
                return false;
            }
            final int a4 = this.a;
            return (a4 & 0x7000) == 0x0 || (a4 & this.c(this.e, this.c) << 12) != 0x0;
        }
        
        int c(final int n, final int n2) {
            if (n > n2) {
                return 1;
            }
            if (n == n2) {
                return 2;
            }
            return 4;
        }
        
        void d() {
            this.a = 0;
        }
        
        void e(final int b, final int c, final int d, final int e) {
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
    
    interface b
    {
        View a(final int p0);
        
        int b(final View p0);
        
        int c();
        
        int d();
        
        int e(final View p0);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }
}
