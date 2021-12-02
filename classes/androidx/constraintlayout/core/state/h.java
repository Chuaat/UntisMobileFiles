// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.key.d;
import androidx.constraintlayout.core.motion.key.b;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.motion.utils.g;
import java.util.Iterator;
import androidx.constraintlayout.core.motion.c;
import androidx.constraintlayout.core.motion.utils.u;
import java.util.ArrayList;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.e;
import java.util.HashMap;

public class h
{
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    HashMap<String, b> a;
    HashMap<Integer, HashMap<String, a>> b;
    private int c;
    
    public h() {
        this.a = new HashMap<String, b>();
        this.b = new HashMap<Integer, HashMap<String, a>>();
        this.c = -1;
    }
    
    private b v(final String s, final e e, final int n) {
        b b;
        if ((b = this.a.get(s)) == null) {
            final b value = new b();
            final int c = this.c;
            if (c != -1) {
                value.d.T(c);
            }
            this.a.put(s, value);
            b = value;
            if (e != null) {
                value.f(e, n);
                b = value;
            }
        }
        return b;
    }
    
    public void A(final f f, final int n) {
        final ArrayList<e> f2 = f.f2();
        for (int size = f2.size(), i = 0; i < size; ++i) {
            final e e = f2.get(i);
            this.v(e.o, null, n).f(e, n);
        }
    }
    
    public void a(final int n, final String s, final String s2, final int n2) {
        this.v(s, null, n).a(n).c(s2, n2);
    }
    
    public void b(final int n, final String s, final String s2, final float n2) {
        this.v(s, null, n).a(n).d(s2, n2);
    }
    
    public void c(final String s, final u u) {
        this.v(s, null, 0).c(u);
    }
    
    public void d(final String s, final u u) {
        this.v(s, null, 0).d(u);
    }
    
    public void e(final String key, final int n, final int n2, final float n3, final float n4) {
        final u u = new u();
        u.b(510, 2);
        u.b(100, n);
        u.a(506, n3);
        u.a(507, n4);
        this.v(key, null, 0).e(u);
        final a value = new a(key, n, n2, n3, n4);
        HashMap<String, a> value2;
        if ((value2 = this.b.get(n)) == null) {
            value2 = new HashMap<String, a>();
            this.b.put(n, value2);
        }
        value2.put(key, value);
    }
    
    public void f(final String s, final u u) {
        this.v(s, null, 0).e(u);
    }
    
    public void g() {
        this.a.clear();
    }
    
    public boolean h(final String key) {
        return this.a.containsKey(key);
    }
    
    public void i(final i i, final float[] array, final float[] array2, final float[] array3) {
        int j = 0;
        int n = 0;
        while (j <= 100) {
            final HashMap<String, a> hashMap = this.b.get(j);
            int n2 = n;
            if (hashMap != null) {
                final a a = hashMap.get(i.a.o);
                n2 = n;
                if (a != null) {
                    array[n] = a.d;
                    array2[n] = a.e;
                    array3[n] = (float)a.a;
                    n2 = n + 1;
                }
            }
            ++j;
            n = n2;
        }
    }
    
    public a j(final String key, int i) {
        while (i <= 100) {
            final HashMap<String, a> hashMap = this.b.get(i);
            if (hashMap != null) {
                final a a = hashMap.get(key);
                if (a != null) {
                    return a;
                }
            }
            ++i;
        }
        return null;
    }
    
    public a k(final String key, int i) {
        while (i >= 0) {
            final HashMap<String, a> hashMap = this.b.get(i);
            if (hashMap != null) {
                final a a = hashMap.get(key);
                if (a != null) {
                    return a;
                }
            }
            --i;
        }
        return null;
    }
    
    public i l(final e e) {
        return this.v(e.o, null, 1).b;
    }
    
    public i m(final String key) {
        final b b = this.a.get(key);
        if (b == null) {
            return null;
        }
        return b.b;
    }
    
    public i n(final e e) {
        return this.v(e.o, null, 2).c;
    }
    
    public i o(final String key) {
        final b b = this.a.get(key);
        if (b == null) {
            return null;
        }
        return b.c;
    }
    
    public int p(final String key, final float[] array, final int[] array2, final int[] array3) {
        return this.a.get(key).d.e(array, array2, array3);
    }
    
    public c q(final String s) {
        return this.v(s, null, 0).d;
    }
    
    public int r(final i i) {
        int j = 0;
        int n = 0;
        while (j <= 100) {
            final HashMap<String, a> hashMap = this.b.get(j);
            int n2 = n;
            if (hashMap != null) {
                n2 = n;
                if (hashMap.get(i.a.o) != null) {
                    n2 = n + 1;
                }
            }
            ++j;
            n = n2;
        }
        return n;
    }
    
    public float[] s(final String key) {
        final b b = this.a.get(key);
        final float[] array = new float[124];
        b.d.f(array, 62);
        return array;
    }
    
    public i t(final e e) {
        return this.v(e.o, null, 0).a;
    }
    
    public i u(final String key) {
        final b b = this.a.get(key);
        if (b == null) {
            return null;
        }
        return b.a;
    }
    
    public boolean w() {
        return this.b.size() > 0;
    }
    
    public void x(final int n, final int n2, final float n3) {
        final Iterator<String> iterator = this.a.keySet().iterator();
        while (iterator.hasNext()) {
            this.a.get(iterator.next()).b(n, n2, n3, this);
        }
    }
    
    public boolean y() {
        return this.a.isEmpty();
    }
    
    public void z(final u u) {
        this.c = u.h(509);
    }
    
    static class a
    {
        int a;
        String b;
        int c;
        float d;
        float e;
        
        public a(final String b, final int a, final int c, final float d, final float e) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
    
    static class b
    {
        i a;
        i b;
        i c;
        c d;
        androidx.constraintlayout.core.motion.f e;
        androidx.constraintlayout.core.motion.f f;
        androidx.constraintlayout.core.motion.f g;
        g h;
        int i;
        int j;
        
        public b() {
            this.h = new g();
            this.i = -1;
            this.j = -1;
            this.a = new i();
            this.b = new i();
            this.c = new i();
            this.e = new androidx.constraintlayout.core.motion.f(this.a);
            this.f = new androidx.constraintlayout.core.motion.f(this.b);
            this.g = new androidx.constraintlayout.core.motion.f(this.c);
            (this.d = new c(this.e)).U(this.e);
            this.d.S(this.f);
        }
        
        public i a(final int n) {
            if (n == 0) {
                return this.a;
            }
            if (n == 1) {
                return this.b;
            }
            return this.c;
        }
        
        public void b(final int j, final int i, final float q, final h h) {
            this.i = i;
            this.j = j;
            this.d.Y(j, i, 1.0f, System.nanoTime());
            i.m(j, i, this.c, this.a, this.b, h, q);
            this.c.q = q;
            this.d.L(this.g, q, System.nanoTime(), this.h);
        }
        
        public void c(final u u) {
            final androidx.constraintlayout.core.motion.key.c c = new androidx.constraintlayout.core.motion.key.c();
            u.f(c);
            this.d.a(c);
        }
        
        public void d(final u u) {
            final d d = new d();
            u.f(d);
            this.d.a(d);
        }
        
        public void e(final u u) {
            final androidx.constraintlayout.core.motion.key.e e = new androidx.constraintlayout.core.motion.key.e();
            u.f(e);
            this.d.a(e);
        }
        
        public void f(final e e, final int n) {
            if (n == 0) {
                this.a.z(e);
                this.d.U(this.e);
            }
            else if (n == 1) {
                this.b.z(e);
                this.d.S(this.f);
            }
            this.j = -1;
        }
    }
}
