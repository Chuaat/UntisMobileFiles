// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import io.reactivex.internal.functions.b;
import java.io.Serializable;
import o7.d;
import o7.c;
import io.reactivex.i0;

public enum q
{
    G;
    
    public static <T> boolean b(final Object o, final i0<? super T> i0) {
        if (o == q.G) {
            i0.f();
            return true;
        }
        if (o instanceof b) {
            i0.b(((b)o).G);
            return true;
        }
        i0.m((Object)o);
        return false;
    }
    
    public static <T> boolean d(final Object o, final o7.c<? super T> c) {
        if (o == q.G) {
            c.f();
            return true;
        }
        if (o instanceof b) {
            c.b(((b)o).G);
            return true;
        }
        c.m(o);
        return false;
    }
    
    public static <T> boolean f(final Object o, final i0<? super T> i0) {
        if (o == q.G) {
            i0.f();
            return true;
        }
        if (o instanceof b) {
            i0.b(((b)o).G);
            return true;
        }
        if (o instanceof a) {
            i0.l(((a)o).G);
            return false;
        }
        i0.m((Object)o);
        return false;
    }
    
    public static <T> boolean g(final Object o, final o7.c<? super T> c) {
        if (o == q.G) {
            c.f();
            return true;
        }
        if (o instanceof b) {
            c.b(((b)o).G);
            return true;
        }
        if (o instanceof c) {
            c.z(((c)o).G);
            return false;
        }
        c.m(o);
        return false;
    }
    
    public static Object h() {
        return q.G;
    }
    
    public static Object i(final io.reactivex.disposables.c c) {
        return new a(c);
    }
    
    public static Object j(final Throwable t) {
        return new b(t);
    }
    
    public static io.reactivex.disposables.c k(final Object o) {
        return ((a)o).G;
    }
    
    public static Throwable l(final Object o) {
        return ((b)o).G;
    }
    
    public static d m(final Object o) {
        return ((c)o).G;
    }
    
    public static <T> T o(final Object o) {
        return (T)o;
    }
    
    public static boolean p(final Object o) {
        return o == q.G;
    }
    
    public static boolean s(final Object o) {
        return o instanceof a;
    }
    
    public static boolean u(final Object o) {
        return o instanceof b;
    }
    
    public static boolean v(final Object o) {
        return o instanceof c;
    }
    
    public static <T> Object y(final T t) {
        return t;
    }
    
    public static Object z(final d d) {
        return new c(d);
    }
    
    @Override
    public String toString() {
        return "NotificationLite.Complete";
    }
    
    static final class a implements Serializable
    {
        private static final long H = -7482590109178395495L;
        final io.reactivex.disposables.c G;
        
        a(final io.reactivex.disposables.c g) {
            this.G = g;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Disposable[");
            sb.append(this.G);
            sb.append("]");
            return sb.toString();
        }
    }
    
    static final class b implements Serializable
    {
        private static final long H = -8759979445933046293L;
        final Throwable G;
        
        b(final Throwable g) {
            this.G = g;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof b && io.reactivex.internal.functions.b.c(this.G, ((b)o).G);
        }
        
        @Override
        public int hashCode() {
            return this.G.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Error[");
            sb.append(this.G);
            sb.append("]");
            return sb.toString();
        }
    }
    
    static final class c implements Serializable
    {
        private static final long H = -1322257508628817540L;
        final d G;
        
        c(final d g) {
            this.G = g;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Subscription[");
            sb.append(this.G);
            sb.append("]");
            return sb.toString();
        }
    }
}
