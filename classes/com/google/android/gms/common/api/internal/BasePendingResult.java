// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Pair;
import androidx.annotation.j0;
import com.google.android.gms.common.api.w;
import java.util.concurrent.TimeUnit;
import android.util.Log;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import android.os.Looper;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;
import androidx.annotation.k0;
import com.google.android.gms.common.api.u;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import com.google.android.gms.common.api.k;
import java.lang.ref.WeakReference;
import f2.a;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.t;

@KeepName
@f2.a
public abstract class BasePendingResult<R extends t> extends n<R>
{
    static final ThreadLocal<Boolean> p;
    private final Object a;
    private final a<R> b;
    private final WeakReference<k> c;
    private final CountDownLatch d;
    private final ArrayList<n.a> e;
    @k0
    private u<? super R> f;
    private final AtomicReference<t2> g;
    @k0
    private R h;
    private Status i;
    private volatile boolean j;
    private boolean k;
    private boolean l;
    @k0
    private q m;
    @KeepName
    private b mResultGuardian;
    private volatile q2<R> n;
    private boolean o;
    
    static {
        p = new g3();
    }
    
    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<n.a>();
        this.g = new AtomicReference<t2>();
        this.o = false;
        this.b = new a<R>(Looper.getMainLooper());
        this.c = new WeakReference<k>(null);
    }
    
    @Deprecated
    @f2.a
    protected BasePendingResult(@RecentlyNonNull final Looper looper) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<n.a>();
        this.g = new AtomicReference<t2>();
        this.o = false;
        this.b = new a<R>(looper);
        this.c = new WeakReference<k>(null);
    }
    
    @d0
    @f2.a
    protected BasePendingResult(@RecentlyNonNull final a<R> a) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<n.a>();
        this.g = new AtomicReference<t2>();
        this.o = false;
        this.b = x.l(a, "CallbackHandler must not be null");
        this.c = new WeakReference<k>(null);
    }
    
    @f2.a
    protected BasePendingResult(@k0 final k referent) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<n.a>();
        this.g = new AtomicReference<t2>();
        this.o = false;
        Looper looper;
        if (referent != null) {
            looper = referent.q();
        }
        else {
            looper = Looper.getMainLooper();
        }
        this.b = new a<R>(looper);
        this.c = new WeakReference<k>(referent);
    }
    
    public static void r(@k0 final t obj) {
        if (obj instanceof p) {
            try {
                ((p)obj).release();
            }
            catch (RuntimeException ex) {
                final String value = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(value.length() + 18);
                sb.append("Unable to release ");
                sb.append(value);
                Log.w("BasePendingResult", sb.toString(), (Throwable)ex);
            }
        }
    }
    
    @k0
    private static <R extends t> u<R> u(@k0 final u<R> u) {
        return u;
    }
    
    private final void w(final R h) {
        this.h = h;
        this.i = h.h();
        this.m = null;
        this.d.countDown();
        if (this.k) {
            this.f = null;
        }
        else {
            final u<? super R> f = this.f;
            if (f == null) {
                if (this.h instanceof p) {
                    this.mResultGuardian = new b((g3)null);
                }
            }
            else {
                this.b.removeMessages(2);
                this.b.a(f, this.x());
            }
        }
        final ArrayList<n.a> e = this.e;
        final int size = e.size();
        int i = 0;
        while (i < size) {
            final n.a value = e.get(i);
            ++i;
            value.a(this.i);
        }
        this.e.clear();
    }
    
    private final R x() {
        Object a = this.a;
        synchronized (a) {
            x.r(!this.j, "Result has already been consumed.");
            x.r(this.m(), "Result is not ready.");
            final t h = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
            // monitorexit(a)
            a = this.g.getAndSet(null);
            if (a != null) {
                ((t2)a).a(this);
            }
            return x.k(h);
        }
    }
    
    @Override
    public final void c(@RecentlyNonNull final n.a e) {
        x.b(e != null, "Callback cannot be null.");
        synchronized (this.a) {
            if (this.m()) {
                e.a(this.i);
            }
            else {
                this.e.add(e);
            }
        }
    }
    
    @RecentlyNonNull
    @Override
    public final R d() {
        x.j("await must not be called on the UI thread");
        final boolean j = this.j;
        boolean b = true;
        x.r(j ^ true, "Result has already been consumed");
        if (this.n != null) {
            b = false;
        }
        x.r(b, "Cannot await if then() has been called.");
        try {
            this.d.await();
        }
        catch (InterruptedException ex) {
            this.l(Status.M);
        }
        x.r(this.m(), "Result is not ready.");
        return this.x();
    }
    
    @RecentlyNonNull
    @Override
    public final R e(@RecentlyNonNull final long timeout, @RecentlyNonNull final TimeUnit unit) {
        if (timeout > 0L) {
            x.j("await must not be called on the UI thread when time is greater than zero.");
        }
        final boolean j = this.j;
        boolean b = true;
        x.r(j ^ true, "Result has already been consumed.");
        if (this.n != null) {
            b = false;
        }
        x.r(b, "Cannot await if then() has been called.");
        try {
            if (!this.d.await(timeout, unit)) {
                this.l(Status.O);
            }
        }
        catch (InterruptedException ex) {
            this.l(Status.M);
        }
        x.r(this.m(), "Result is not ready.");
        return this.x();
    }
    
    @f2.a
    @Override
    public void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/common/api/internal/BasePendingResult.a:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/common/api/internal/BasePendingResult.k:Z
        //    11: ifne            65
        //    14: aload_0        
        //    15: getfield        com/google/android/gms/common/api/internal/BasePendingResult.j:Z
        //    18: ifeq            24
        //    21: goto            65
        //    24: aload_0        
        //    25: getfield        com/google/android/gms/common/api/internal/BasePendingResult.m:Lcom/google/android/gms/common/internal/q;
        //    28: astore_2       
        //    29: aload_2        
        //    30: ifnull          39
        //    33: aload_2        
        //    34: invokeinterface com/google/android/gms/common/internal/q.cancel:()V
        //    39: aload_0        
        //    40: getfield        com/google/android/gms/common/api/internal/BasePendingResult.h:Lcom/google/android/gms/common/api/t;
        //    43: invokestatic    com/google/android/gms/common/api/internal/BasePendingResult.r:(Lcom/google/android/gms/common/api/t;)V
        //    46: aload_0        
        //    47: iconst_1       
        //    48: putfield        com/google/android/gms/common/api/internal/BasePendingResult.k:Z
        //    51: aload_0        
        //    52: aload_0        
        //    53: getstatic       com/google/android/gms/common/api/Status.P:Lcom/google/android/gms/common/api/Status;
        //    56: invokevirtual   com/google/android/gms/common/api/internal/BasePendingResult.k:(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/t;
        //    59: invokespecial   com/google/android/gms/common/api/internal/BasePendingResult.w:(Lcom/google/android/gms/common/api/t;)V
        //    62: aload_1        
        //    63: monitorexit    
        //    64: return         
        //    65: aload_1        
        //    66: monitorexit    
        //    67: return         
        //    68: astore_2       
        //    69: aload_1        
        //    70: monitorexit    
        //    71: aload_2        
        //    72: athrow         
        //    73: astore_2       
        //    74: goto            39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      21     68     73     Any
        //  24     29     68     73     Any
        //  33     39     73     77     Landroid/os/RemoteException;
        //  33     39     68     73     Any
        //  39     64     68     73     Any
        //  65     67     68     73     Any
        //  69     71     68     73     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @RecentlyNonNull
    @Override
    public boolean g() {
        synchronized (this.a) {
            return this.k;
        }
    }
    
    @f2.a
    @Override
    public final void h(@k0 final u<? super R> f) {
        final Object a = this.a;
        // monitorenter(a)
        Label_0019: {
            if (f != null) {
                break Label_0019;
            }
            try {
                this.f = null;
                return;
                while (true) {
                    this.b.a(f, this.x());
                    return;
                    Label_0098: {
                        this.f = f;
                    }
                    return;
                    final boolean j = this.j;
                    final boolean b = true;
                    x.r(!j, "Result has already been consumed.");
                    x.r(this.n == null && b, "Cannot set callbacks if then() has been called.");
                    return;
                    Label_0076:
                    continue;
                }
            }
            // iftrue(Label_0076:, !this.g())
            // iftrue(Label_0098:, !this.m())
            finally {
            }
            // monitorexit(a)
        }
    }
    
    @f2.a
    @Override
    public final void i(@RecentlyNonNull final u<? super R> f, @RecentlyNonNull long millis, @RecentlyNonNull final TimeUnit timeUnit) {
        final Object a = this.a;
        // monitorenter(a)
        Label_0022: {
            if (f != null) {
                break Label_0022;
            }
            try {
                this.f = null;
                return;
                Label_0110: {
                    this.f = f;
                }
                final a<R> b = this.b;
                millis = timeUnit.toMillis(millis);
                b.sendMessageDelayed(b.obtainMessage(2, (Object)this), millis);
                return;
                Label_0088:
                // iftrue(Label_0110:, !this.m())
                this.b.a(f, this.x());
                return;
                final boolean j = this.j;
                final boolean b2 = true;
                x.r(!j, "Result has already been consumed.");
                x.r(this.n == null && b2, "Cannot set callbacks if then() has been called.");
            }
            // iftrue(Label_0088:, !this.g())
            finally {
            }
            // monitorexit(a)
        }
    }
    
    @RecentlyNonNull
    @Override
    public <S extends t> com.google.android.gms.common.api.x<S> j(@RecentlyNonNull final w<? super R, ? extends S> w) {
        x.r(this.j ^ true, "Result has already been consumed.");
        synchronized (this.a) {
            final q2<R> n = this.n;
            final boolean b = false;
            x.r(n == null, "Cannot call then() twice.");
            x.r(this.f == null, "Cannot call then() if callbacks are set.");
            boolean b2 = b;
            if (!this.k) {
                b2 = true;
            }
            x.r(b2, "Cannot call then() if result was canceled.");
            this.o = true;
            this.n = new q2<R>(this.c);
            final com.google.android.gms.common.api.x<S> c = this.n.c((w<? super t, ? extends S>)w);
            if (this.m()) {
                this.b.a(this.n, this.x());
            }
            else {
                this.f = this.n;
            }
            return c;
        }
    }
    
    @j0
    @f2.a
    protected abstract R k(@RecentlyNonNull final Status p0);
    
    @Deprecated
    @f2.a
    public final void l(@RecentlyNonNull final Status status) {
        synchronized (this.a) {
            if (!this.m()) {
                this.o(this.k(status));
                this.l = true;
            }
        }
    }
    
    @RecentlyNonNull
    @f2.a
    public final boolean m() {
        return this.d.getCount() == 0L;
    }
    
    @f2.a
    protected final void n(@RecentlyNonNull final q m) {
        synchronized (this.a) {
            this.m = m;
        }
    }
    
    @f2.a
    public final void o(@RecentlyNonNull final R r) {
        synchronized (this.a) {
            if (!this.l && !this.k) {
                this.m();
                final boolean m = this.m();
                final boolean b = true;
                x.r(!m, "Results have already been set");
                x.r(!this.j && b, "Result has already been consumed");
                this.w(r);
                return;
            }
            r(r);
        }
    }
    
    public final void s(@k0 final t2 newValue) {
        this.g.set(newValue);
    }
    
    @RecentlyNonNull
    public final boolean t() {
        synchronized (this.a) {
            if (this.c.get() == null || !this.o) {
                this.f();
            }
            return this.g();
        }
    }
    
    public final void v() {
        this.o = (this.o || BasePendingResult.p.get());
    }
    
    @d0
    public static class a<R extends t> extends p
    {
        public a() {
            this(Looper.getMainLooper());
        }
        
        public a(@RecentlyNonNull final Looper looper) {
            super(looper);
        }
        
        public final void a(@RecentlyNonNull final u<? super R> u, @RecentlyNonNull final R r) {
            this.sendMessage(this.obtainMessage(1, (Object)new Pair((Object)x.k(u(u)), (Object)r)));
        }
        
        public void handleMessage(@RecentlyNonNull final Message message) {
            final int what = message.what;
            if (what != 1) {
                if (what != 2) {
                    final StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(what);
                    Log.wtf("BasePendingResult", sb.toString(), (Throwable)new Exception());
                    return;
                }
                ((BasePendingResult)message.obj).l(Status.O);
            }
            else {
                final Pair pair = (Pair)message.obj;
                final u u = (u)pair.first;
                final t t = (t)pair.second;
                try {
                    u.a(t);
                }
                catch (RuntimeException ex) {
                    BasePendingResult.r(t);
                    throw ex;
                }
            }
        }
    }
    
    private final class b
    {
        @Override
        protected final void finalize() throws Throwable {
            BasePendingResult.r(BasePendingResult.this.h);
            super.finalize();
        }
    }
}
