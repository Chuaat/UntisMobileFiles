// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util.pool;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import androidx.core.util.m;
import androidx.annotation.j0;

public final class a
{
    private static final String a = "FactoryPools";
    private static final int b = 20;
    private static final g<Object> c;
    
    static {
        c = (g)new g<Object>() {
            @Override
            public void a(@j0 final Object o) {
            }
        };
    }
    
    private a() {
    }
    
    @j0
    private static <T extends f> m.a<T> a(@j0 final m.a<T> a, @j0 final d<T> d) {
        return b(a, d, c());
    }
    
    @j0
    private static <T> m.a<T> b(@j0 final m.a<T> a, @j0 final d<T> d, @j0 final g<T> g) {
        return new e<T>(a, d, g);
    }
    
    @j0
    private static <T> g<T> c() {
        return (g<T>)com.bumptech.glide.util.pool.a.c;
    }
    
    @j0
    public static <T extends f> m.a<T> d(final int n, @j0 final d<T> d) {
        return a(new m.b<T>(n), d);
    }
    
    @j0
    public static <T extends f> m.a<T> e(final int n, @j0 final d<T> d) {
        return a(new m.c<T>(n), d);
    }
    
    @j0
    public static <T> m.a<List<T>> f() {
        return g(20);
    }
    
    @j0
    public static <T> m.a<List<T>> g(final int n) {
        return b(new m.c<List<T>>(n), (d<List<T>>)new d<List<T>>() {
            @j0
            public List<T> a() {
                return new ArrayList<T>();
            }
        }, (g<List<T>>)new g<List<T>>() {
            public void b(@j0 final List<T> list) {
                list.clear();
            }
        });
    }
    
    public interface d<T>
    {
        T create();
    }
    
    private static final class e<T> implements m.a<T>
    {
        private final d<T> a;
        private final g<T> b;
        private final m.a<T> c;
        
        e(@j0 final m.a<T> c, @j0 final d<T> a, @j0 final g<T> b) {
            this.c = c;
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean a(@j0 final T t) {
            if (t instanceof f) {
                ((f)t).g().b(true);
            }
            this.b.a(t);
            return this.c.a(t);
        }
        
        @Override
        public T b() {
            Object o;
            if ((o = this.c.b()) == null) {
                final T t = (T)(o = this.a.create());
                if (Log.isLoggable("FactoryPools", 2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(((f)t).getClass());
                    Log.v("FactoryPools", sb.toString());
                    o = t;
                }
            }
            if (o instanceof f) {
                ((f)o).g().b(false);
            }
            return (T)o;
        }
    }
    
    public interface f
    {
        @j0
        c g();
    }
    
    public interface g<T>
    {
        void a(@j0 final T p0);
    }
}
