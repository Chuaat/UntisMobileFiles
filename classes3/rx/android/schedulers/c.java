// 
// Decompiled by Procyon v0.5.36
// 

package rx.android.schedulers;

import rx.exceptions.g;
import android.os.Message;
import rx.subscriptions.f;
import java.util.concurrent.TimeUnit;
import rx.o;
import rx.android.plugins.a;
import rx.android.plugins.b;
import android.os.Looper;
import android.os.Handler;
import rx.j;

class c extends j
{
    private final Handler a;
    
    c(final Handler a) {
        this.a = a;
    }
    
    c(final Looper looper) {
        this.a = new Handler(looper);
    }
    
    @Override
    public j.a a() {
        return new a(this.a);
    }
    
    static class a extends j.a
    {
        private final Handler G;
        private final rx.android.plugins.b H;
        private volatile boolean I;
        
        a(final Handler g) {
            this.G = g;
            this.H = rx.android.plugins.a.a().b();
        }
        
        @Override
        public o c(final rx.functions.a a) {
            return this.d(a, 0L, TimeUnit.MILLISECONDS);
        }
        
        @Override
        public o d(final rx.functions.a a, final long duration, final TimeUnit timeUnit) {
            if (this.I) {
                return f.e();
            }
            final b b = new b(this.H.c(a), this.G);
            final Message obtain = Message.obtain(this.G, (Runnable)b);
            obtain.obj = this;
            this.G.sendMessageDelayed(obtain, timeUnit.toMillis(duration));
            if (this.I) {
                this.G.removeCallbacks((Runnable)b);
                return f.e();
            }
            return b;
        }
        
        @Override
        public boolean g() {
            return this.I;
        }
        
        @Override
        public void i() {
            this.I = true;
            this.G.removeCallbacksAndMessages((Object)this);
        }
    }
    
    static final class b implements Runnable, o
    {
        private final rx.functions.a G;
        private final Handler H;
        private volatile boolean I;
        
        b(final rx.functions.a g, final Handler h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public boolean g() {
            return this.I;
        }
        
        @Override
        public void i() {
            this.I = true;
            this.H.removeCallbacks((Runnable)this);
        }
        
        @Override
        public void run() {
            try {
                this.G.call();
            }
            finally {
                final Throwable t;
                IllegalStateException ex;
                if (t instanceof g) {
                    ex = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", t);
                }
                else {
                    ex = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", t);
                }
                rx.plugins.f.c().b().a(ex);
                final Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, ex);
            }
        }
    }
}
