// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import io.reactivex.n0;
import x2.a;
import java.util.concurrent.Future;
import io.reactivex.c;
import io.reactivex.schedulers.b;
import androidx.annotation.g0;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.impl.utils.n;
import androidx.annotation.k0;
import java.util.concurrent.Executor;

public abstract class RxWorker extends ListenableWorker
{
    static final Executor b;
    @k0
    private a<ListenableWorker.a> a;
    
    static {
        b = new n();
    }
    
    public RxWorker(@j0 final Context context, @j0 final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    @g0
    @j0
    public abstract io.reactivex.k0<ListenableWorker.a> a();
    
    @j0
    protected io.reactivex.j0 c() {
        return io.reactivex.schedulers.b.b(this.getBackgroundExecutor());
    }
    
    @j0
    public final io.reactivex.c d(@j0 final f progressAsync) {
        return io.reactivex.c.W((Future)this.setProgressAsync(progressAsync));
    }
    
    @Deprecated
    @j0
    public final io.reactivex.k0<Void> e(@j0 final f progressAsync) {
        return (io.reactivex.k0<Void>)io.reactivex.k0.l0((Future)this.setProgressAsync(progressAsync));
    }
    
    @Override
    public void onStopped() {
        super.onStopped();
        final a<ListenableWorker.a> a = this.a;
        if (a != null) {
            a.a();
            this.a = null;
        }
    }
    
    @j0
    @Override
    public x2.a<ListenableWorker.a> startWork() {
        this.a = new a<ListenableWorker.a>();
        this.a().f1(this.c()).K0(io.reactivex.schedulers.b.b((Executor)this.getTaskExecutor().d())).c((n0)this.a);
        return this.a.G;
    }
    
    static class a<T> implements n0<T>, Runnable
    {
        final androidx.work.impl.utils.futures.c<T> G;
        @k0
        private io.reactivex.disposables.c H;
        
        a() {
            (this.G = androidx.work.impl.utils.futures.c.v()).g(this, RxWorker.b);
        }
        
        void a() {
            final io.reactivex.disposables.c h = this.H;
            if (h != null) {
                h.dispose();
            }
        }
        
        public void b(final Throwable t) {
            this.G.r(t);
        }
        
        public void d(final T t) {
            this.G.q(t);
        }
        
        public void l(final io.reactivex.disposables.c h) {
            this.H = h;
        }
        
        public void run() {
            if (this.G.isCancelled()) {
                this.a();
            }
        }
    }
}
