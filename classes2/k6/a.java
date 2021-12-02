// 
// Decompiled by Procyon v0.5.36
// 

package k6;

import kotlin.jvm.internal.h0;
import n6.l;
import kotlin.y0;
import kotlin.e1;
import kotlin.m;
import org.jetbrains.annotations.f;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\u0005\u001a\u00028\u0001\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000\"\u0004\b\u0001\u0010\u0002*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b" }, d2 = { "Ljava/lang/AutoCloseable;", "T", "R", "Lkotlin/Function1;", "block", "b", "(Ljava/lang/AutoCloseable;Ln6/l;)Ljava/lang/Object;", "", "cause", "Lkotlin/j2;", "a", "kotlin-stdlib-jdk7" }, k = 2, mv = { 1, 5, 1 }, pn = "kotlin")
@g(name = "AutoCloseableKt")
public final class a
{
    @e1(version = "1.2")
    @y0
    public static final void a(@f final AutoCloseable autoCloseable, @f final Throwable t) {
        if (autoCloseable != null) {
            if (t == null) {
                autoCloseable.close();
            }
            else {
                try {
                    autoCloseable.close();
                }
                finally {
                    final Throwable t2;
                    m.a(t, t2);
                }
            }
        }
    }
    
    @e1(version = "1.2")
    @kotlin.internal.f
    private static final <T extends AutoCloseable, R> R b(final T t, final l<? super T, ? extends R> l) {
        try {
            final R invoke = (R)l.invoke(t);
            h0.d(1);
            a(t, null);
            h0.c(1);
            return invoke;
        }
        finally {
            try {}
            finally {
                h0.d(1);
                final Throwable t2;
                a(t, t2);
                h0.c(1);
            }
        }
    }
}
