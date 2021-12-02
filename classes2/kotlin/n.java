// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import java.io.Writer;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.PrintStream;
import kotlin.internal.f;
import java.util.Objects;
import java.util.List;
import kotlin.internal.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0000H\u0007\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0007\"&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\r*\u00020\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u00008F@\u0006¢\u0006\f\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019" }, d2 = { "", "Lkotlin/j2;", "f", "Ljava/io/PrintWriter;", "writer", "h", "Ljava/io/PrintStream;", "stream", "g", "", "i", "exception", "a", "", "d", "(Ljava/lang/Throwable;)Ljava/util/List;", "getSuppressedExceptions$annotations", "(Ljava/lang/Throwable;)V", "suppressedExceptions", "", "Ljava/lang/StackTraceElement;", "b", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "getStackTrace$annotations", "stackTrace", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/ExceptionsKt")
class n
{
    public n() {
    }
    
    @e1(version = "1.1")
    @kotlin.internal.e
    public static void a(@e final Throwable t, @e final Throwable t2) {
        k0.p(t, "$this$addSuppressed");
        k0.p(t2, "exception");
        if (t != t2) {
            l.a.a(t, t2);
        }
    }
    
    @e
    public static final StackTraceElement[] b(@e final Throwable t) {
        k0.p(t, "$this$stackTrace");
        final StackTraceElement[] stackTrace = t.getStackTrace();
        k0.m(stackTrace);
        return stackTrace;
    }
    
    @e
    public static final List<Throwable> d(@e final Throwable t) {
        k0.p(t, "$this$suppressedExceptions");
        return l.a.d(t);
    }
    
    @f
    private static final void f(final Throwable obj) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Throwable");
        obj.printStackTrace();
    }
    
    @f
    private static final void g(final Throwable obj, final PrintStream s) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Throwable");
        obj.printStackTrace(s);
    }
    
    @f
    private static final void h(final Throwable obj, final PrintWriter s) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Throwable");
        obj.printStackTrace(s);
    }
    
    @e1(version = "1.4")
    @e
    public static final String i(@e final Throwable t) {
        k0.p(t, "$this$stackTraceToString");
        final StringWriter out = new StringWriter();
        final PrintWriter s = new PrintWriter(out);
        t.printStackTrace(s);
        s.flush();
        final String string = out.toString();
        k0.o(string, "sw.toString()");
        return string;
    }
}
