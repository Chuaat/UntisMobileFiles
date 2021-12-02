// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.h;
import java.io.Serializable;

public final class x
{
    private static final Object a;
    private static final Object b;
    
    static {
        a = new Serializable() {
            private static final long G = 1L;
            
            @Override
            public String toString() {
                return "Notification=>Completed";
            }
        };
        b = new Serializable() {
            private static final long G = 2L;
            
            @Override
            public String toString() {
                return "Notification=>NULL";
            }
        };
    }
    
    private x() {
    }
    
    public static <T> boolean a(final h<? super T> h, final Object o) {
        if (o == x.a) {
            h.c();
            return true;
        }
        if (o == x.b) {
            h.m((Object)null);
            return false;
        }
        if (o == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        if (o.getClass() == c.class) {
            h.b(((c)o).G);
            return true;
        }
        h.m((Object)o);
        return false;
    }
    
    public static Object b() {
        return x.a;
    }
    
    public static Object c(final Throwable t) {
        return new c(t);
    }
    
    public static Throwable d(final Object o) {
        return ((c)o).G;
    }
    
    public static <T> T e(final Object o) {
        Object o2 = o;
        if (o == x.b) {
            o2 = null;
        }
        return (T)o2;
    }
    
    public static boolean f(final Object o) {
        return o == x.a;
    }
    
    public static boolean g(final Object o) {
        return o instanceof c;
    }
    
    public static boolean h(final Object o) {
        return o != null && !g(o) && !f(o);
    }
    
    public static boolean i(final Object o) {
        return o == x.b;
    }
    
    public static <T> Object j(final T t) {
        Object b = t;
        if (t == null) {
            b = x.b;
        }
        return b;
    }
    
    static final class c implements Serializable
    {
        private static final long H = 3L;
        final Throwable G;
        
        public c(final Throwable g) {
            this.G = g;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Notification=>Error:");
            sb.append(this.G);
            return sb.toString();
        }
    }
}
