// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.jvm.internal.h0;
import n6.l;
import kotlin.y0;
import kotlin.e1;
import kotlin.m;
import org.jetbrains.annotations.f;
import java.io.Closeable;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0006\u001a\u00028\u0001\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000\"\u0004\b\u0001\u0010\u0002*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0001\u0082\u0002\u000f\n\u0006\b\u0011(\u00050\u0001\n\u0005\b\u009920\u0001¨\u0006\f" }, d2 = { "Ljava/io/Closeable;", "T", "R", "Lkotlin/Function1;", "block", "Requires newer compiler version to be inlined correctly.", "b", "(Ljava/io/Closeable;Ln6/l;)Ljava/lang/Object;", "", "cause", "Lkotlin/j2;", "a", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "CloseableKt")
public final class c
{
    @e1(version = "1.1")
    @y0
    public static final void a(@f final Closeable closeable, @f final Throwable t) {
        if (closeable != null) {
            if (t == null) {
                closeable.close();
            }
            else {
                try {
                    closeable.close();
                }
                finally {
                    final Throwable t2;
                    m.a(t, t2);
                }
            }
        }
    }
    
    @kotlin.internal.f
    private static final <T extends Closeable, R> R b(final T t, final l<? super T, ? extends R> l) {
        try {
            final R invoke = l.invoke(t);
            h0.d(1);
            if (kotlin.internal.l.a(1, 1, 0)) {
                a(t, null);
            }
            else if (t != null) {
                t.close();
            }
            h0.c(1);
            return invoke;
        }
        finally {
            try {}
            finally {
                h0.d(1);
                Label_0078: {
                    if (kotlin.internal.l.a(1, 1, 0)) {
                        break Label_0078;
                    }
                    Label_0083: {
                        if (t == null) {
                            break Label_0083;
                        }
                        try {
                            t.close();
                            h0.c(1);
                            break Label_0078;
                            final Throwable t2;
                            a(t, t2);
                        }
                        finally {}
                    }
                }
            }
        }
    }
}
