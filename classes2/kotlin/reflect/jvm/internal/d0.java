// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import n6.a;

public class d0
{
    private static /* synthetic */ void a(final int n) {
        final Object[] args = { "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", null };
        if (n != 1 && n != 2) {
            args[2] = "lazy";
        }
        else {
            args[2] = "lazySoft";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
    }
    
    @e
    public static <T> b<T> b(@e final n6.a<T> a) {
        if (a == null) {
            a(0);
        }
        return new b<T>(a);
    }
    
    @e
    public static <T> a<T> c(@f final T t, @e final n6.a<T> a) {
        if (a == null) {
            a(1);
        }
        return new a<T>(t, a);
    }
    
    @e
    public static <T> a<T> d(@e final n6.a<T> a) {
        if (a == null) {
            a(2);
        }
        return c((T)null, a);
    }
    
    public static class a<T> extends c<T> implements n6.a<T>
    {
        private final n6.a<T> H;
        private volatile SoftReference<Object> I;
        
        public a(@f final T t, @e final n6.a<T> h) {
            if (h == null) {
                g(0);
            }
            this.I = null;
            this.H = h;
            if (t != null) {
                this.I = new SoftReference<Object>(this.a(t));
            }
        }
        
        private static /* synthetic */ void g(final int n) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }
        
        @Override
        public T invoke() {
            final SoftReference<Object> i = this.I;
            if (i != null) {
                final Object value = i.get();
                if (value != null) {
                    return this.c(value);
                }
            }
            final T invoke = this.H.invoke();
            this.I = new SoftReference<Object>(this.a(invoke));
            return invoke;
        }
    }
    
    public static class b<T> extends c<T>
    {
        private final n6.a<T> H;
        private volatile Object I;
        
        public b(@e final n6.a<T> h) {
            if (h == null) {
                g(0);
            }
            this.I = null;
            this.H = h;
        }
        
        private static /* synthetic */ void g(final int n) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }
        
        @Override
        public T invoke() {
            final Object i = this.I;
            if (i != null) {
                return this.c(i);
            }
            final T invoke = this.H.invoke();
            this.I = this.a(invoke);
            return invoke;
        }
    }
    
    public abstract static class c<T>
    {
        private static final Object G;
        
        static {
            G = new Object() {};
        }
        
        protected Object a(final T t) {
            Object g = t;
            if (t == null) {
                g = c.G;
            }
            return g;
        }
        
        public final T b(final Object o, final Object o2) {
            return this.invoke();
        }
        
        protected T c(final Object o) {
            Object o2 = o;
            if (o == c.G) {
                o2 = null;
            }
            return (T)o2;
        }
        
        public abstract T invoke();
    }
}
