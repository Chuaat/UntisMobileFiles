// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import kotlin.jvm.internal.h0;
import kotlin.coroutines.jvm.internal.h;
import java.util.concurrent.Executor;
import kotlin.b1$a;
import java.util.concurrent.CancellationException;
import kotlin.b1;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.k0;
import kotlin.c1;
import x2.a;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H\u00f8\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004" }, d2 = { "Landroidx/work/u;", "Landroidx/work/u$b$c;", "a", "(Landroidx/work/u;Lkotlin/coroutines/d;)Ljava/lang/Object;", "work-runtime-ktx_release" }, k = 2, mv = { 1, 4, 1 })
public final class v
{
    @org.jetbrains.annotations.f
    public static final Object a(@e final u u, @e final d<? super u.b.c> d) {
        Object o = null;
        Label_0046: {
            if (d instanceof v$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (v$a)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    o = d2;
                    break Label_0046;
                }
            }
            o = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                Object I;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return v.a(null, (d<? super u.b.c>)this);
                }
            };
        }
        final Object g = ((v$a)o).G;
        final Object h2 = b.h();
        final int h3 = ((v$a)o).H;
        Object value = null;
        Label_0219: {
            if (h3 != 0) {
                if (h3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                final a a = (a)((v$a)o).I;
                c1.n(g);
                value = g;
            }
            else {
                c1.n(g);
                final a<u.b.c> a2 = u.a();
                k0.o((Object)a2, "result");
                if (a2.isDone()) {
                    try {
                        value = a2.get();
                        break Label_0219;
                    }
                    catch (ExecutionException ex) {
                        final Throwable cause = ex.getCause();
                        if (cause != null) {
                            ex = (ExecutionException)cause;
                        }
                        throw ex;
                    }
                }
                ((v$a)o).I = a2;
                ((v$a)o).H = 1;
                final p p2 = new p(b.d((d)o), 1);
                p2.H();
                a2.g(new Runnable() {
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
                    h.c((d)o);
                }
                if ((value = y) == h2) {
                    return h2;
                }
            }
        }
        k0.o(value, "result.await()");
        return value;
    }
    
    @org.jetbrains.annotations.f
    private static final Object b(@e final u u, @e final d d) {
        final a<u.b.c> a = u.a();
        k0.o((Object)a, "result");
        Object o = null;
        Label_0105: {
            if (a.isDone()) {
                try {
                    o = a.get();
                    break Label_0105;
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
                        final Object value = a2.get();
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
            o = p2.y();
            if (o == b.h()) {
                h.c(d);
            }
            h0.e(1);
        }
        k0.o(o, "result.await()");
        return o;
    }
}
