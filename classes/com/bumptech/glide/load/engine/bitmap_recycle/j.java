// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.Iterator;
import java.util.TreeMap;
import androidx.annotation.k0;
import android.util.Log;
import com.bumptech.glide.util.k;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Map;
import androidx.annotation.b1;

public final class j implements com.bumptech.glide.load.engine.bitmap_recycle.b
{
    private static final int h = 4194304;
    @b1
    static final int i = 8;
    private static final int j = 2;
    private final h<a, Object> b;
    private final b c;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> d;
    private final Map<Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>> e;
    private final int f;
    private int g;
    
    @b1
    public j() {
        this.b = new h<a, Object>();
        this.c = new b();
        this.d = new HashMap<Class<?>, NavigableMap<Integer, Integer>>();
        this.e = new HashMap<Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>>();
        this.f = 4194304;
    }
    
    public j(final int f) {
        this.b = new h<a, Object>();
        this.c = new b();
        this.d = new HashMap<Class<?>, NavigableMap<Integer, Integer>>();
        this.e = new HashMap<Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>>();
        this.f = f;
    }
    
    private void g(final int i, final Class<?> clazz) {
        final NavigableMap<Integer, Integer> o = this.o(clazz);
        final Integer n = o.get(i);
        if (n != null) {
            final int intValue = n;
            final Integer value = i;
            if (intValue == 1) {
                o.remove(value);
            }
            else {
                o.put(value, n - 1);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Tried to decrement empty size, size: ");
        sb.append(i);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }
    
    private void h() {
        this.i(this.f);
    }
    
    private void i(final int n) {
        while (this.g > n) {
            final Object f = this.b.f();
            k.d(f);
            final com.bumptech.glide.load.engine.bitmap_recycle.a<Object> j = this.j(f);
            this.g -= j.b(f) * j.a();
            this.g(j.b(f), f.getClass());
            if (Log.isLoggable(j.J(), 2)) {
                final String i = j.J();
                final StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(j.b(f));
                Log.v(i, sb.toString());
            }
        }
    }
    
    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> j(final T t) {
        return this.k(t.getClass());
    }
    
    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> k(final Class<T> clazz) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<?> a;
        if ((a = this.e.get(clazz)) == null) {
            if (clazz.equals(int[].class)) {
                a = new i();
            }
            else {
                if (!clazz.equals(byte[].class)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("No array pool found for: ");
                    sb.append(clazz.getSimpleName());
                    throw new IllegalArgumentException(sb.toString());
                }
                a = new g();
            }
            this.e.put(clazz, a);
        }
        return (com.bumptech.glide.load.engine.bitmap_recycle.a<T>)a;
    }
    
    @k0
    private <T> T l(final a a) {
        return (T)this.b.a(a);
    }
    
    private <T> T n(final a a, final Class<T> clazz) {
        final com.bumptech.glide.load.engine.bitmap_recycle.a<T> k = this.k(clazz);
        final T l = this.l(a);
        if (l != null) {
            this.g -= k.b(l) * k.a();
            this.g(k.b(l), clazz);
        }
        T array;
        if ((array = l) == null) {
            if (Log.isLoggable(k.J(), 2)) {
                final String j = k.J();
                final StringBuilder sb = new StringBuilder();
                sb.append("Allocated ");
                sb.append(a.b);
                sb.append(" bytes");
                Log.v(j, sb.toString());
            }
            array = k.newArray(a.b);
        }
        return array;
    }
    
    private NavigableMap<Integer, Integer> o(final Class<?> clazz) {
        NavigableMap<Integer, Integer> navigableMap;
        if ((navigableMap = this.d.get(clazz)) == null) {
            navigableMap = new TreeMap<Integer, Integer>();
            this.d.put(clazz, navigableMap);
        }
        return navigableMap;
    }
    
    private boolean p() {
        final int g = this.g;
        return g == 0 || this.f / g >= 2;
    }
    
    private boolean q(final int n) {
        return n <= this.f / 2;
    }
    
    private boolean r(final int n, final Integer n2) {
        return n2 != null && (this.p() || n2 <= n * 8);
    }
    
    @Override
    public void a(final int n) {
        // monitorenter(this)
        Label_0041: {
            Label_0019: {
                if (n >= 40) {
                    Label_0044: {
                        try {
                            this.b();
                            break Label_0041;
                        }
                        finally {
                            break Label_0044;
                        }
                        break Label_0019;
                    }
                }
                // monitorexit(this)
            }
            if (n >= 20 || n == 15) {
                this.i(this.f / 2);
            }
        }
    }
    // monitorexit(this)
    
    @Override
    public void b() {
        synchronized (this) {
            this.i(0);
        }
    }
    
    @Override
    public <T> T c(final int n, final Class<T> clazz) {
        synchronized (this) {
            return this.n(this.c.e(n, clazz), clazz);
        }
    }
    
    @Override
    public <T> void d(final T t) {
        synchronized (this) {
            final Class<?> class1 = t.getClass();
            final com.bumptech.glide.load.engine.bitmap_recycle.a<T> k = this.k(class1);
            final int b = k.b(t);
            final int n = k.a() * b;
            if (!this.q(n)) {
                return;
            }
            final a e = this.c.e(b, class1);
            this.b.d(e, t);
            final NavigableMap<Integer, Integer> o = this.o(class1);
            final Integer n2 = o.get(e.b);
            final int b2 = e.b;
            int i = 1;
            if (n2 != null) {
                i = 1 + n2;
            }
            o.put(b2, i);
            this.g += n;
            this.h();
        }
    }
    
    @Deprecated
    @Override
    public <T> void e(final T t, final Class<T> clazz) {
        this.d(t);
    }
    
    @Override
    public <T> T f(final int i, final Class<T> clazz) {
        synchronized (this) {
            final Integer n = this.o(clazz).ceilingKey(i);
            a a;
            if (this.r(i, n)) {
                a = this.c.e(n, clazz);
            }
            else {
                a = this.c.e(i, clazz);
            }
            return this.n(a, clazz);
        }
    }
    
    int m() {
        final Iterator<Class<Object>> iterator = this.d.keySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Class<Object> clazz = iterator.next();
            final Iterator<Integer> iterator2 = this.d.get(clazz).keySet().iterator();
            int n2 = n;
            while (true) {
                n = n2;
                if (!iterator2.hasNext()) {
                    break;
                }
                final Integer n3 = iterator2.next();
                n2 += n3 * (int)this.d.get(clazz).get(n3) * this.k(clazz).a();
            }
        }
        return n;
    }
    
    private static final class a implements m
    {
        private final b a;
        int b;
        private Class<?> c;
        
        a(final b a) {
            this.a = a;
        }
        
        @Override
        public void a() {
            this.a.c(this);
        }
        
        void b(final int b, final Class<?> c) {
            this.b = b;
            this.c = c;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof a;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final a a = (a)o;
                b3 = b2;
                if (this.b == a.b) {
                    b3 = b2;
                    if (this.c == a.c) {
                        b3 = true;
                    }
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            final int b = this.b;
            final Class<?> c = this.c;
            int hashCode;
            if (c != null) {
                hashCode = c.hashCode();
            }
            else {
                hashCode = 0;
            }
            return b * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Key{size=");
            sb.append(this.b);
            sb.append("array=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }
    
    private static final class b extends d<a>
    {
        b() {
        }
        
        protected a d() {
            return new a(this);
        }
        
        a e(final int n, final Class<?> clazz) {
            final a a = this.b();
            a.b(n, clazz);
            return a;
        }
    }
}
