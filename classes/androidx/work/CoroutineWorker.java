// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import kotlinx.coroutines.u0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import kotlin.coroutines.intrinsics.b;
import java.util.concurrent.ExecutionException;
import kotlin.j2;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import kotlin.i;
import androidx.work.impl.utils.taskexecutor.a;
import kotlinx.coroutines.i1;
import java.util.concurrent.Executor;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.k2$a;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.o2;
import kotlin.jvm.internal.k0;
import android.content.Context;
import kotlinx.coroutines.m0;
import androidx.work.impl.utils.futures.c;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.b0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\tR\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0016@\u0017X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010\"\u001a\u00020\u001e8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)" }, d2 = { "Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Lx2/a;", "Landroidx/work/ListenableWorker$a;", "startWork", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/work/f;", "data", "Lkotlin/j2;", "i", "(Landroidx/work/f;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/work/l;", "foregroundInfo", "h", "(Landroidx/work/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onStopped", "Landroidx/work/impl/utils/futures/c;", "b", "Landroidx/work/impl/utils/futures/c;", "e", "()Landroidx/work/impl/utils/futures/c;", "future", "Lkotlinx/coroutines/m0;", "c", "Lkotlinx/coroutines/m0;", "()Lkotlinx/coroutines/m0;", "getCoroutineContext$annotations", "()V", "coroutineContext", "Lkotlinx/coroutines/b0;", "Lkotlinx/coroutines/b0;", "g", "()Lkotlinx/coroutines/b0;", "job", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release" }, k = 1, mv = { 1, 4, 1 })
public abstract class CoroutineWorker extends ListenableWorker
{
    @e
    private final b0 a;
    @e
    private final androidx.work.impl.utils.futures.c<ListenableWorker.a> b;
    @e
    private final m0 c;
    
    public CoroutineWorker(@e final Context context, @e final WorkerParameters workerParameters) {
        k0.p((Object)context, "appContext");
        k0.p((Object)workerParameters, "params");
        super(context, workerParameters);
        this.a = o2.d((k2)null, 1, (Object)null);
        final androidx.work.impl.utils.futures.c<ListenableWorker.a> v = (androidx.work.impl.utils.futures.c<ListenableWorker.a>)androidx.work.impl.utils.futures.c.v();
        k0.o((Object)v, "SettableFuture.create()");
        this.b = v;
        final Runnable runnable = new Runnable() {
            final /* synthetic */ CoroutineWorker G;
            
            @Override
            public final void run() {
                if (this.G.e().isCancelled()) {
                    k2$a.b((k2)this.G.g(), (CancellationException)null, 1, (Object)null);
                }
            }
        };
        final a taskExecutor = this.getTaskExecutor();
        k0.o((Object)taskExecutor, "taskExecutor");
        v.g(runnable, taskExecutor.d());
        this.c = i1.a();
    }
    
    @f
    public abstract Object a(@e final d<? super ListenableWorker.a> p0);
    
    @e
    public m0 c() {
        return this.c;
    }
    
    @e
    public final androidx.work.impl.utils.futures.c<ListenableWorker.a> e() {
        return this.b;
    }
    
    @e
    public final b0 g() {
        return this.a;
    }
    
    @f
    public final Object h(@e final l foregroundAsync, @e final d<? super j2> d) {
        final x2.a<Void> setForegroundAsync = this.setForegroundAsync(foregroundAsync);
        k0.o((Object)setForegroundAsync, "setForegroundAsync(foregroundInfo)");
        Object value = null;
        Label_0100: {
            if (setForegroundAsync.isDone()) {
                try {
                    value = setForegroundAsync.get();
                    break Label_0100;
                }
                catch (ExecutionException ex) {
                    final Throwable cause = ex.getCause();
                    if (cause != null) {
                        ex = (ExecutionException)cause;
                    }
                    throw ex;
                }
            }
            final p p2 = new p(kotlin.coroutines.intrinsics.b.d((d)d), 1);
            p2.H();
            setForegroundAsync.g(new Runnable() {
                @Override
                public final void run() {
                    try {
                        final o g = (o)p2;
                        final Object value = setForegroundAsync.get();
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
            }, androidx.work.i.G);
            final Object y = p2.y();
            if ((value = y) == kotlin.coroutines.intrinsics.b.h()) {
                h.c((d)d);
                value = y;
            }
        }
        if (value == kotlin.coroutines.intrinsics.b.h()) {
            return value;
        }
        return j2.a;
    }
    
    @f
    public final Object i(@e final androidx.work.f progressAsync, @e final d<? super j2> d) {
        final x2.a<Void> setProgressAsync = this.setProgressAsync(progressAsync);
        k0.o((Object)setProgressAsync, "setProgressAsync(data)");
        Object value = null;
        Label_0100: {
            if (setProgressAsync.isDone()) {
                try {
                    value = setProgressAsync.get();
                    break Label_0100;
                }
                catch (ExecutionException ex) {
                    final Throwable cause = ex.getCause();
                    if (cause != null) {
                        ex = (ExecutionException)cause;
                    }
                    throw ex;
                }
            }
            final p p2 = new p(kotlin.coroutines.intrinsics.b.d((d)d), 1);
            p2.H();
            setProgressAsync.g(new Runnable() {
                @Override
                public final void run() {
                    try {
                        final o g = (o)p2;
                        final Object value = setProgressAsync.get();
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
            }, androidx.work.i.G);
            final Object y = p2.y();
            if ((value = y) == kotlin.coroutines.intrinsics.b.h()) {
                h.c((d)d);
                value = y;
            }
        }
        if (value == kotlin.coroutines.intrinsics.b.h()) {
            return value;
        }
        return j2.a;
    }
    
    @Override
    public final void onStopped() {
        super.onStopped();
        this.b.cancel(false);
    }
    
    @e
    @Override
    public final x2.a<ListenableWorker.a> startWork() {
        kotlinx.coroutines.h.f(s0.a(((kotlin.coroutines.a)this.c()).plus((g)this.a)), (g)null, (u0)null, (n6.p)new n6.p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ CoroutineWorker H;
            
            @e
            public final d<j2> create(@f final Object o, @e final d<?> d) {
                k0.p((Object)d, "completion");
                return (d<j2>)new n6.p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ CoroutineWorker H = this.H;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((CoroutineWorker$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@e Object a) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0071: {
                    if (g != 0) {
                        if (g == 1) {
                            Label_0091: {
                                try {
                                    c1.n(a);
                                    break Label_0071;
                                }
                                finally {
                                    break Label_0091;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            this.H.e().r((Throwable)a);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(a);
                    final CoroutineWorker h2 = this.H;
                    this.G = 1;
                    if ((a = h2.a((d<? super ListenableWorker.a>)this)) == h) {
                        return h;
                    }
                }
                this.H.e().q((ListenableWorker.a)a);
                return j2.a;
            }
        }, 3, (Object)null);
        return this.b;
    }
}
