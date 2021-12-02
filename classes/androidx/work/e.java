// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.f;
import androidx.annotation.t0;
import kotlin.coroutines.jvm.internal.h;
import java.util.concurrent.Executor;
import kotlin.b1$a;
import kotlin.c1;
import java.util.concurrent.CancellationException;
import kotlin.b1;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import kotlin.coroutines.intrinsics.b;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.d;
import x2.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087H\u00f8\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004" }, d2 = { "R", "Lx2/a;", "a", "(Lx2/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "work-runtime-ktx_release" }, k = 2, mv = { 1, 4, 1 })
public final class e
{
    @t0({ t0.a.H })
    @f
    public static final <R> Object a(@org.jetbrains.annotations.e final a<R> a, @org.jetbrains.annotations.e final d<? super R> d) {
        if (a.isDone()) {
            try {
                return a.get();
            }
            catch (ExecutionException ex) {
                final Throwable cause = ex.getCause();
                if (cause != null) {
                    ex = (ExecutionException)cause;
                }
                throw ex;
            }
        }
        final p p2 = new p(b.d((d)d), 1);
        p2.H();
        a.g(new Runnable() {
            final /* synthetic */ o G;
            final /* synthetic */ a H;
            
            @Override
            public final void run() {
                try {
                    final o g = this.G;
                    final Object value = this.H.get();
                    final b1$a h = b1.H;
                    ((d)g).resumeWith(b1.b(value));
                }
                finally {
                    final Throwable t;
                    Throwable cause = t.getCause();
                    if (cause == null) {
                        cause = t;
                    }
                    if (t instanceof CancellationException) {
                        this.G.c(cause);
                    }
                    else {
                        final o g2 = this.G;
                        final b1$a h2 = b1.H;
                        ((d)g2).resumeWith(b1.b(c1.a(cause)));
                    }
                }
            }
        }, i.G);
        final Object y = p2.y();
        if (y == b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    @t0({ t0.a.H })
    @f
    private static final Object b(@org.jetbrains.annotations.e final a a, @org.jetbrains.annotations.e final d d) {
        if (a.isDone()) {
            try {
                return a.get();
            }
            catch (ExecutionException ex) {
                final Throwable cause = ex.getCause();
                if (cause != null) {
                    ex = (ExecutionException)cause;
                }
                throw ex;
            }
        }
        h0.e(0);
        final p p2 = new p(b.d(d), 1);
        p2.H();
        a.g(new Runnable() {
            final /* synthetic */ o G;
            final /* synthetic */ a H;
            
            @Override
            public final void run() {
                try {
                    final o g = (o)p2;
                    final Object value = a.get();
                    final b1$a h = b1.H;
                    ((d)g).resumeWith(b1.b(value));
                }
                finally {
                    final Throwable t;
                    Throwable cause = t.getCause();
                    if (cause == null) {
                        cause = t;
                    }
                    if (t instanceof CancellationException) {
                        ((o)p2).c(cause);
                    }
                    else {
                        final o g2 = (o)p2;
                        final b1$a h2 = b1.H;
                        ((d)g2).resumeWith(b1.b(c1.a(cause)));
                    }
                }
            }
        }, i.G);
        final Object y = p2.y();
        if (y == b.h()) {
            h.c(d);
        }
        h0.e(1);
        return y;
    }
}
