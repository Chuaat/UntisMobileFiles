// 
// Decompiled by Procyon v0.5.36
// 

package androidx.tracing;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.Trace;
import android.os.Build$VERSION;
import android.annotation.SuppressLint;
import androidx.annotation.j0;
import java.lang.reflect.Method;

public final class b
{
    static final String a = "Trace";
    private static long b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;
    
    private b() {
    }
    
    @SuppressLint({ "NewApi" })
    public static void a(@j0 final String s, final int n) {
        while (true) {
            try {
                if (androidx.tracing.b.d == null) {
                    androidx.tracing.d.a(s, n);
                    return;
                }
                b(s, n);
            }
            catch (NoSuchMethodError | NoClassDefFoundError noSuchMethodError) {
                continue;
            }
            break;
        }
    }
    
    private static void b(@j0 final String s, final int i) {
        if (Build$VERSION.SDK_INT >= 18) {
            try {
                if (androidx.tracing.b.d == null) {
                    androidx.tracing.b.d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                androidx.tracing.b.d.invoke(null, androidx.tracing.b.b, s, i);
            }
            catch (Exception ex) {
                g("asyncTraceBegin", ex);
            }
        }
    }
    
    public static void c(@j0 final String s) {
        if (Build$VERSION.SDK_INT >= 18) {
            androidx.tracing.c.a(s);
        }
    }
    
    @SuppressLint({ "NewApi" })
    public static void d(@j0 final String s, final int n) {
        while (true) {
            try {
                if (androidx.tracing.b.e == null) {
                    androidx.tracing.d.b(s, n);
                    return;
                }
                e(s, n);
            }
            catch (NoSuchMethodError | NoClassDefFoundError noSuchMethodError) {
                continue;
            }
            break;
        }
    }
    
    private static void e(@j0 final String s, final int i) {
        if (Build$VERSION.SDK_INT >= 18) {
            try {
                if (androidx.tracing.b.e == null) {
                    androidx.tracing.b.e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                }
                androidx.tracing.b.e.invoke(null, androidx.tracing.b.b, s, i);
            }
            catch (Exception ex) {
                g("asyncTraceEnd", ex);
            }
        }
    }
    
    public static void f() {
        if (Build$VERSION.SDK_INT >= 18) {
            androidx.tracing.c.b();
        }
    }
    
    private static void g(@j0 final String str, @j0 final Exception ex) {
        if (!(ex instanceof InvocationTargetException)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to call ");
            sb.append(str);
            sb.append(" via reflection");
            Log.v("Trace", sb.toString(), (Throwable)ex);
            return;
        }
        final Throwable cause = ex.getCause();
        if (cause instanceof RuntimeException) {
            throw (RuntimeException)cause;
        }
        throw new RuntimeException(cause);
    }
    
    @SuppressLint({ "NewApi" })
    public static boolean h() {
        try {
            if (androidx.tracing.b.c == null) {
                return Trace.isEnabled();
            }
            return i();
        }
        catch (NoSuchMethodError | NoClassDefFoundError noSuchMethodError) {
            return i();
        }
    }
    
    private static boolean i() {
        if (Build$VERSION.SDK_INT >= 18) {
            try {
                if (androidx.tracing.b.c == null) {
                    androidx.tracing.b.b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    androidx.tracing.b.c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return (boolean)androidx.tracing.b.c.invoke(null, androidx.tracing.b.b);
            }
            catch (Exception ex) {
                g("isTagEnabled", ex);
            }
        }
        return false;
    }
    
    @SuppressLint({ "NewApi" })
    public static void j(@j0 final String s, final int n) {
        while (true) {
            try {
                if (androidx.tracing.b.f == null) {
                    androidx.tracing.d.c(s, n);
                    return;
                }
                k(s, n);
            }
            catch (NoSuchMethodError | NoClassDefFoundError noSuchMethodError) {
                continue;
            }
            break;
        }
    }
    
    private static void k(@j0 final String s, final int i) {
        if (Build$VERSION.SDK_INT >= 18) {
            try {
                if (androidx.tracing.b.f == null) {
                    androidx.tracing.b.f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                }
                androidx.tracing.b.f.invoke(null, androidx.tracing.b.b, s, i);
            }
            catch (Exception ex) {
                g("traceCounter", ex);
            }
        }
    }
}
