// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.concurrent;

import kotlin.jvm.internal.h0;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import java.util.Arrays;
import kotlin.jvm.internal.p1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\b\u00f8\u0001\u0000\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\b\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012" }, d2 = { "Lokhttp3/internal/concurrent/a;", "task", "Lokhttp3/internal/concurrent/c;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Lkotlin/j2;", "e", "T", "block", "d", "(Lokhttp3/internal/concurrent/a;Lokhttp3/internal/concurrent/c;Ln6/a;)Ljava/lang/Object;", "message", "c", "", "ns", "b", "okhttp" }, k = 2, mv = { 1, 4, 0 })
public final class b
{
    @e
    public static final String b(long n) {
        StringBuilder sb = null;
        Label_0039: {
            Label_0022: {
                if (n > -999500000) {
                    Label_0069: {
                        if (n > -999500) {
                            if (n <= 0L) {
                                sb = new StringBuilder();
                                n -= 500;
                            }
                            else if (n < 999500) {
                                sb = new StringBuilder();
                                n += 500;
                            }
                            else {
                                final long n2 = 999500000;
                                sb = new(java.lang.StringBuilder.class);
                                if (n < n2) {
                                    new StringBuilder();
                                    n += 500000;
                                    break Label_0069;
                                }
                                new StringBuilder();
                                n += 500000000;
                                break Label_0022;
                            }
                            sb.append(n / 1000);
                            sb.append(" µs");
                            break Label_0039;
                        }
                        sb = new StringBuilder();
                        n -= 500000;
                    }
                    sb.append(n / 1000000);
                    sb.append(" ms");
                    break Label_0039;
                }
                sb = new StringBuilder();
                n -= 500000000;
            }
            sb.append(n / 1000000000);
            sb.append(" s ");
        }
        final String string = sb.toString();
        final p1 a = p1.a;
        final String format = String.format("%6s", Arrays.copyOf(new Object[] { string }, 1));
        k0.o((Object)format, "java.lang.String.format(format, *args)");
        return format;
    }
    
    private static final void c(final a a, final c c, final String s) {
        final Logger a2 = d.j.a();
        final StringBuilder sb = new StringBuilder();
        sb.append(c.h());
        sb.append(' ');
        final p1 a3 = p1.a;
        final String format = String.format("%-22s", Arrays.copyOf(new Object[] { s }, 1));
        k0.o((Object)format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(a.b());
        a2.fine(sb.toString());
    }
    
    public static final <T> T d(@e final a a, @e final c c, @e final n6.a<? extends T> a2) {
        k0.p((Object)a, "task");
        k0.p((Object)c, "queue");
        k0.p((Object)a2, "block");
        final boolean loggable = d.j.a().isLoggable(Level.FINE);
        long b;
        if (loggable) {
            b = c.k().h().b();
            c(a, c, "starting");
        }
        else {
            b = -1L;
        }
        try {
            final Object invoke = a2.invoke();
            h0.d(1);
            if (loggable) {
                final long b2 = c.k().h().b();
                final StringBuilder sb = new StringBuilder();
                sb.append("finished run in ");
                sb.append(b(b2 - b));
                c(a, c, sb.toString());
            }
            h0.c(1);
            return (T)invoke;
        }
        finally {
            h0.d(1);
            if (loggable) {
                final long b3 = c.k().h().b();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("failed a run in ");
                sb2.append(b(b3 - b));
                c(a, c, sb2.toString());
            }
            h0.c(1);
        }
    }
    
    public static final void e(@e final a a, @e final c c, @e final n6.a<String> a2) {
        k0.p((Object)a, "task");
        k0.p((Object)c, "queue");
        k0.p((Object)a2, "messageBlock");
        if (d.j.a().isLoggable(Level.FINE)) {
            c(a, c, (String)a2.invoke());
        }
    }
}
