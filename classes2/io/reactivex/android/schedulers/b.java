// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.android.schedulers;

import io.reactivex.disposables.d;
import android.annotation.SuppressLint;
import android.os.Message;
import io.reactivex.plugins.a;
import java.util.Objects;
import io.reactivex.disposables.c;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import io.reactivex.j0;

final class b extends j0
{
    private final Handler H;
    private final boolean I;
    
    b(final Handler h, final boolean i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    public c c() {
        return new a(this.H, this.I);
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public io.reactivex.disposables.c f(Runnable b0, final long duration, final TimeUnit obj) {
        Objects.requireNonNull(b0, "run == null");
        Objects.requireNonNull(obj, "unit == null");
        b0 = io.reactivex.plugins.a.b0(b0);
        final b b2 = new b(this.H, b0);
        final Message obtain = Message.obtain(this.H, (Runnable)b2);
        if (this.I) {
            obtain.setAsynchronous(true);
        }
        this.H.sendMessageDelayed(obtain, obj.toMillis(duration));
        return b2;
    }
    
    private static final class a extends c
    {
        private final Handler G;
        private final boolean H;
        private volatile boolean I;
        
        a(final Handler g, final boolean h) {
            this.G = g;
            this.H = h;
        }
        
        @SuppressLint({ "NewApi" })
        @Override
        public io.reactivex.disposables.c c(Runnable b0, final long duration, final TimeUnit obj) {
            Objects.requireNonNull(b0, "run == null");
            Objects.requireNonNull(obj, "unit == null");
            if (this.I) {
                return d.a();
            }
            b0 = io.reactivex.plugins.a.b0(b0);
            final b b2 = new b(this.G, b0);
            final Message obtain = Message.obtain(this.G, (Runnable)b2);
            obtain.obj = this;
            if (this.H) {
                obtain.setAsynchronous(true);
            }
            this.G.sendMessageDelayed(obtain, obj.toMillis(duration));
            if (this.I) {
                this.G.removeCallbacks((Runnable)b2);
                return d.a();
            }
            return b2;
        }
        
        @Override
        public void dispose() {
            this.I = true;
            this.G.removeCallbacksAndMessages((Object)this);
        }
        
        @Override
        public boolean i() {
            return this.I;
        }
    }
    
    private static final class b implements Runnable, c
    {
        private final Handler G;
        private final Runnable H;
        private volatile boolean I;
        
        b(final Handler g, final Runnable h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void dispose() {
            this.G.removeCallbacks((Runnable)this);
            this.I = true;
        }
        
        @Override
        public boolean i() {
            return this.I;
        }
        
        @Override
        public void run() {
            try {
                this.H.run();
            }
            finally {
                final Throwable t;
                io.reactivex.plugins.a.Y(t);
            }
        }
    }
}
