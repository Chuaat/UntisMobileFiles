// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import androidx.annotation.j0;
import android.util.Log;
import android.os.Trace;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

@Deprecated
public final class t
{
    private static final String a = "TraceCompat";
    private static long b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 18 && sdk_INT < 29) {
            try {
                t.b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                final Class<Long> type = Long.TYPE;
                t.c = Trace.class.getMethod("isTagEnabled", type);
                final Class<Integer> type2 = Integer.TYPE;
                t.d = Trace.class.getMethod("asyncTraceBegin", type, String.class, type2);
                t.e = Trace.class.getMethod("asyncTraceEnd", type, String.class, type2);
                t.f = Trace.class.getMethod("traceCounter", type, String.class, type2);
            }
            catch (Exception ex) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", (Throwable)ex);
            }
        }
    }
    
    private t() {
    }
    
    public static void a(@j0 final String s, final int i) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            Trace.beginAsyncSection(s, i);
        }
        else if (sdk_INT >= 18) {
            try {
                t.d.invoke(null, t.b, s, i);
            }
            catch (Exception ex) {
                Log.v("TraceCompat", "Unable to invoke asyncTraceBegin() via reflection.");
            }
        }
    }
    
    public static void b(@j0 final String s) {
        if (Build$VERSION.SDK_INT >= 18) {
            Trace.beginSection(s);
        }
    }
    
    public static void c(@j0 final String s, final int i) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            Trace.endAsyncSection(s, i);
        }
        else if (sdk_INT >= 18) {
            try {
                t.e.invoke(null, t.b, s, i);
            }
            catch (Exception ex) {
                Log.v("TraceCompat", "Unable to invoke endAsyncSection() via reflection.");
            }
        }
    }
    
    public static void d() {
        if (Build$VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
    
    public static boolean e() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            return Trace.isEnabled();
        }
        if (sdk_INT >= 18) {
            try {
                return (boolean)t.c.invoke(null, t.b);
            }
            catch (Exception ex) {
                Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            }
        }
        return false;
    }
    
    public static void f(@j0 final String s, final int i) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            Trace.setCounter(s, (long)i);
        }
        else if (sdk_INT >= 18) {
            try {
                t.f.invoke(null, t.b, s, i);
            }
            catch (Exception ex) {
                Log.v("TraceCompat", "Unable to invoke traceCounter() via reflection.");
            }
        }
    }
}
