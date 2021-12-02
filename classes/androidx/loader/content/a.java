// 
// Decompiled by Procyon v0.5.36
// 

package androidx.loader.content;

import androidx.core.os.n;
import java.util.concurrent.CountDownLatch;
import androidx.core.util.w;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.annotation.t0;
import androidx.annotation.k0;
import android.os.SystemClock;
import androidx.annotation.j0;
import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;

public abstract class a<D> extends c<D>
{
    static final String p = "AsyncTaskLoader";
    static final boolean q = false;
    private final Executor j;
    volatile a k;
    volatile a l;
    long m;
    long n;
    Handler o;
    
    public a(@j0 final Context context) {
        this(context, androidx.loader.content.d.R);
    }
    
    private a(@j0 final Context context, @j0 final Executor j) {
        super(context);
        this.n = -10000L;
        this.j = j;
    }
    
    public void D() {
    }
    
    void E(final a a, final D n) {
        this.J(n);
        if (this.l == a) {
            this.x();
            this.n = SystemClock.uptimeMillis();
            this.l = null;
            this.e();
            this.G();
        }
    }
    
    void F(final a a, final D n) {
        if (this.k != a) {
            this.E(a, n);
        }
        else if (this.k()) {
            this.J(n);
        }
        else {
            this.c();
            this.n = SystemClock.uptimeMillis();
            this.k = null;
            this.f(n);
        }
    }
    
    void G() {
        if (this.l == null && this.k != null) {
            if (this.k.X) {
                this.k.X = false;
                this.o.removeCallbacks((Runnable)this.k);
            }
            if (this.m > 0L && SystemClock.uptimeMillis() < this.n + this.m) {
                this.k.X = true;
                this.o.postAtTime((Runnable)this.k, this.n + this.m);
                return;
            }
            ((d<Void, Object, Object>)this.k).e(this.j, (Void[])null);
        }
    }
    
    public boolean H() {
        return this.l != null;
    }
    
    @k0
    public abstract D I();
    
    public void J(@k0 final D n) {
    }
    
    @k0
    protected D K() {
        return this.I();
    }
    
    public void L(final long m) {
        this.m = m;
        if (m != 0L) {
            this.o = new Handler();
        }
    }
    
    @t0({ t0.a.H })
    public void M() {
        final a k = this.k;
        if (k != null) {
            k.v();
        }
    }
    
    @Deprecated
    @Override
    public void g(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.g(s, fileDescriptor, printWriter, array);
        if (this.k != null) {
            printWriter.print(s);
            printWriter.print("mTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.X);
        }
        if (this.l != null) {
            printWriter.print(s);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.l);
            printWriter.print(" waiting=");
            printWriter.println(this.l.X);
        }
        if (this.m != 0L) {
            printWriter.print(s);
            printWriter.print("mUpdateThrottle=");
            w.c(this.m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            w.b(this.n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
    
    @Override
    protected boolean o() {
        if (this.k == null) {
            return false;
        }
        if (!super.e) {
            super.h = true;
        }
        if (this.l != null) {
            if (this.k.X) {
                this.k.X = false;
                this.o.removeCallbacks((Runnable)this.k);
            }
            this.k = null;
            return false;
        }
        if (this.k.X) {
            this.k.X = false;
            this.o.removeCallbacks((Runnable)this.k);
            this.k = null;
            return false;
        }
        final boolean a = this.k.a(false);
        if (a) {
            this.l = this.k;
            this.D();
        }
        this.k = null;
        return a;
    }
    
    @Override
    protected void q() {
        super.q();
        this.b();
        this.k = new a();
        this.G();
    }
    
    final class a extends d<Void, Void, D> implements Runnable
    {
        private final CountDownLatch W;
        boolean X;
        
        a() {
            this.W = new CountDownLatch(1);
        }
        
        @Override
        protected void m(final D n) {
            try {
                androidx.loader.content.a.this.E(this, n);
            }
            finally {
                this.W.countDown();
            }
        }
        
        @Override
        protected void n(final D n) {
            try {
                androidx.loader.content.a.this.F(this, n);
            }
            finally {
                this.W.countDown();
            }
        }
        
        @Override
        public void run() {
            this.X = false;
            androidx.loader.content.a.this.G();
        }
        
        protected D u(final Void... array) {
            try {
                return androidx.loader.content.a.this.K();
            }
            catch (n n) {
                if (this.k()) {
                    return null;
                }
                throw n;
            }
        }
        
        public void v() {
            try {
                this.W.await();
            }
            catch (InterruptedException ex) {}
        }
    }
}
