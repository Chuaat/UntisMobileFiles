// 
// Decompiled by Procyon v0.5.36
// 

package rx.exceptions;

import rx.m;
import rx.h;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;

public final class c
{
    private static final int a = 25;
    
    private c() {
        throw new IllegalStateException("No instances!");
    }
    
    public static void a(Throwable cause, final Throwable cause2) {
        final HashSet<Throwable> set = new HashSet<Throwable>();
        int n = 0;
        Throwable t;
        while (true) {
            t = cause;
            if (cause.getCause() == null) {
                break;
            }
            if (n >= 25) {
                return;
            }
            cause = cause.getCause();
            if (set.contains(cause.getCause())) {
                t = cause;
                break;
            }
            set.add(cause.getCause());
            ++n;
        }
        try {
            t.initCause(cause2);
        }
        finally {}
    }
    
    public static Throwable b(Throwable cause) {
        for (int n = 0; cause.getCause() != null; cause = cause.getCause(), ++n) {
            if (n >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
        }
        return cause;
    }
    
    public static RuntimeException c(final Throwable cause) {
        if (cause instanceof RuntimeException) {
            throw (RuntimeException)cause;
        }
        if (cause instanceof Error) {
            throw (Error)cause;
        }
        throw new RuntimeException(cause);
    }
    
    public static void d(final List<? extends Throwable> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new b(list);
        }
        final Throwable cause = (Throwable)list.get(0);
        if (cause instanceof RuntimeException) {
            throw (RuntimeException)cause;
        }
        if (cause instanceof Error) {
            throw (Error)cause;
        }
        throw new RuntimeException(cause);
    }
    
    public static void e(final Throwable t) {
        if (t instanceof g) {
            throw (g)t;
        }
        if (t instanceof f) {
            throw (f)t;
        }
        if (t instanceof e) {
            throw (e)t;
        }
        if (t instanceof VirtualMachineError) {
            throw (VirtualMachineError)t;
        }
        if (t instanceof ThreadDeath) {
            throw (ThreadDeath)t;
        }
        if (!(t instanceof LinkageError)) {
            return;
        }
        throw (LinkageError)t;
    }
    
    public static void f(final Throwable t, final h<?> h) {
        e(t);
        h.b(t);
    }
    
    public static void g(final Throwable t, final h<?> h, final Object o) {
        e(t);
        h.b(h.a(t, o));
    }
    
    public static void h(final Throwable t, final m<?> m) {
        e(t);
        m.b(t);
    }
    
    public static void i(final Throwable t, final m<?> m, final Object o) {
        e(t);
        m.b(rx.exceptions.h.a(t, o));
    }
}
