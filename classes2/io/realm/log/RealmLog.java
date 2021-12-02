// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.log;

import android.util.Log;
import java.util.Locale;
import c6.h;

public final class RealmLog
{
    private static String a = "REALM_JAVA";
    
    public static void a(final RealmLogger realmLogger) {
        if (realmLogger != null) {
            nativeAddLogger(realmLogger);
            return;
        }
        throw new IllegalArgumentException("A non-null logger has to be provided");
    }
    
    public static void b() {
        nativeClearLoggers();
    }
    
    public static void c(final String s, final Object... array) {
        e(null, s, array);
    }
    
    public static void d(@h final Throwable t) {
        e(t, null, new Object[0]);
    }
    
    public static void e(@h final Throwable t, @h final String s, final Object... array) {
        p(3, t, s, array);
    }
    
    public static void f(final String s, final Object... array) {
        h(null, s, array);
    }
    
    public static void g(final Throwable t) {
        h(t, null, new Object[0]);
    }
    
    public static void h(@h final Throwable t, @h final String s, final Object... array) {
        p(6, t, s, array);
    }
    
    public static void i(final String s, final Object... array) {
        k(null, s, array);
    }
    
    public static void j(final Throwable t) {
        k(t, null, new Object[0]);
    }
    
    public static void k(@h final Throwable t, @h final String s, final Object... array) {
        p(7, t, s, array);
    }
    
    public static int l() {
        return nativeGetLogLevel();
    }
    
    public static void m(final String s, final Object... array) {
        o(null, s, array);
    }
    
    public static void n(final Throwable t) {
        o(t, null, new Object[0]);
    }
    
    private static native void nativeAddLogger(final RealmLogger p0);
    
    private static native void nativeClearLoggers();
    
    static native void nativeCloseCoreLoggerBridge(final long p0);
    
    static native long nativeCreateCoreLoggerBridge(final String p0);
    
    private static native int nativeGetLogLevel();
    
    private static native void nativeLog(final int p0, final String p1, @h final Throwable p2, @h final String p3);
    
    static native void nativeLogToCoreLoggerBridge(final long p0, final int p1, final String p2);
    
    private static native void nativeRegisterDefaultLogger();
    
    private static native void nativeRemoveLogger(final RealmLogger p0);
    
    private static native void nativeSetLogLevel(final int p0);
    
    public static void o(@h final Throwable t, @h final String s, final Object... array) {
        p(4, t, s, array);
    }
    
    private static void p(final int n, @h final Throwable t, @h final String format, @h final Object... args) {
        if (n < l()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        String format2;
        if ((format2 = format) != null) {
            format2 = format;
            if (args != null) {
                format2 = format;
                if (args.length > 0) {
                    format2 = String.format(Locale.US, format, args);
                }
            }
        }
        if (t != null) {
            sb.append(Log.getStackTraceString(t));
        }
        if (format2 != null) {
            if (t != null) {
                sb.append("\n");
            }
            sb.append(format2);
        }
        nativeLog(n, RealmLog.a, t, sb.toString());
    }
    
    public static void q() {
        nativeRegisterDefaultLogger();
    }
    
    public static boolean r(final RealmLogger realmLogger) {
        if (realmLogger != null) {
            nativeRemoveLogger(realmLogger);
            return true;
        }
        throw new IllegalArgumentException("A non-null logger has to be provided");
    }
    
    public static void s(final int i) {
        if (i >= 1 && i <= 8) {
            nativeSetLogLevel(i);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid log level: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void t(final String s, final Object... array) {
        v(null, s, array);
    }
    
    public static void u(final Throwable t) {
        v(t, null, new Object[0]);
    }
    
    public static void v(@h final Throwable t, @h final String s, final Object... array) {
        p(2, t, s, array);
    }
    
    public static void w(final String s, final Object... array) {
        y(null, s, array);
    }
    
    public static void x(final Throwable t) {
        y(t, null, new Object[0]);
    }
    
    public static void y(@h final Throwable t, @h final String s, final Object... array) {
        p(5, t, s, array);
    }
}
