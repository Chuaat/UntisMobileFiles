// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.utils;

import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;

public class k
{
    private static final Object a;
    public static volatile boolean b;
    
    static {
        a = new Object() {
            @Override
            public String toString() {
                return "NULL_VALUE";
            }
        };
        k.b = false;
    }
    
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 1 && n != 2) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 1 && n != 2) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        if (n != 1 && n != 2) {
            if (n != 3) {
                args[0] = "value";
            }
            else {
                args[0] = "throwable";
            }
        }
        else {
            args[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (n != 1 && n != 2) {
            args[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        else {
            args[1] = "escapeNull";
        }
        if (n != 1 && n != 2) {
            if (n != 3) {
                if (n != 4) {
                    args[2] = "unescapeNull";
                }
                else {
                    args[2] = "unescapeExceptionOrNull";
                }
            }
            else {
                args[2] = "escapeThrowable";
            }
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 1 && n != 2) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    @e
    public static <V> Object b(@f final V v) {
        V v2 = v;
        if (v == null) {
            final Object a = k.a;
            if ((v2 = (V)a) == null) {
                a(1);
                v2 = (V)a;
            }
        }
        return v2;
    }
    
    @e
    public static Object c(@e final Throwable t) {
        if (t == null) {
            a(3);
        }
        return new b(t);
    }
    
    @f
    public static <V> V d(@e final Object o) {
        if (o == null) {
            a(4);
        }
        return (V)e(f(o));
    }
    
    @f
    public static <V> V e(@e final Object o) {
        if (o == null) {
            a(0);
        }
        Object o2;
        if ((o2 = o) == k.a) {
            o2 = null;
        }
        return (V)o2;
    }
    
    @f
    public static <V> V f(@f final Object o) {
        if (!(o instanceof b)) {
            return (V)o;
        }
        final Throwable b = ((b)o).b();
        if (k.b && kotlin.reflect.jvm.internal.impl.utils.c.a(b)) {
            throw new c(b);
        }
        throw kotlin.reflect.jvm.internal.impl.utils.c.b(b);
    }
    
    private static final class b
    {
        private final Throwable a;
        
        private b(@e final Throwable a) {
            if (a == null) {
                a(0);
            }
            this.a = a;
        }
        
        private static /* synthetic */ void a(final int n) {
            String format;
            if (n != 1) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 1) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            if (n != 1) {
                args[0] = "throwable";
            }
            else {
                args[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (n != 1) {
                args[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            else {
                args[1] = "getThrowable";
            }
            if (n != 1) {
                args[2] = "<init>";
            }
            final String format2 = String.format(format, args);
            RuntimeException ex;
            if (n != 1) {
                ex = new IllegalArgumentException(format2);
            }
            else {
                ex = new IllegalStateException(format2);
            }
            throw ex;
        }
        
        @e
        public Throwable b() {
            final Throwable a = this.a;
            if (a == null) {
                a(1);
            }
            return a;
        }
        
        @Override
        public String toString() {
            return this.a.toString();
        }
    }
    
    public static class c extends RuntimeException
    {
        public c(final Throwable cause) {
            super("Rethrow stored exception", cause);
        }
    }
}
