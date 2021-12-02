// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import java.util.Iterator;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import java.util.List;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.Executor;
import android.app.Activity;
import androidx.annotation.j0;
import java.util.concurrent.CancellationException;
import com.google.android.gms.common.internal.x;
import androidx.annotation.k0;
import d6.a;

final class l0<TResult> extends m<TResult>
{
    private final Object a;
    private final h0<TResult> b;
    @d6.a("mLock")
    private boolean c;
    private volatile boolean d;
    @k0
    @d6.a("mLock")
    private TResult e;
    @d6.a("mLock")
    private Exception f;
    
    l0() {
        this.a = new Object();
        this.b = new h0<TResult>();
    }
    
    @d6.a("mLock")
    private final void B() {
        x.r(this.c, "Task is not yet complete");
    }
    
    @d6.a("mLock")
    private final void E() {
        if (!this.c) {
            return;
        }
        throw com.google.android.gms.tasks.d.a(this);
    }
    
    @d6.a("mLock")
    private final void F() {
        if (!this.d) {
            return;
        }
        throw new CancellationException("Task is already canceled.");
    }
    
    private final void G() {
        synchronized (this.a) {
            if (!this.c) {
                return;
            }
            // monitorexit(this.a)
            this.b.a(this);
        }
    }
    
    public final boolean A() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            // monitorexit(this.a)
            this.b.a(this);
            return true;
        }
    }
    
    public final boolean C(@j0 final Exception f) {
        x.l(f, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = f;
            // monitorexit(this.a)
            this.b.a(this);
            return true;
        }
    }
    
    public final boolean D(@k0 final TResult e) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = e;
            // monitorexit(this.a)
            this.b.a(this);
            return true;
        }
    }
    
    @j0
    @Override
    public final m<TResult> a(@j0 final Activity activity, @j0 final e e) {
        final y<TResult> y = new y<TResult>(m0.a(o.a), e);
        this.b.b(y);
        l0.a.m(activity).n(y);
        this.G();
        return this;
    }
    
    @j0
    @Override
    public final m<TResult> b(@j0 final e e) {
        return this.c(o.a, e);
    }
    
    @j0
    @Override
    public final m<TResult> c(@j0 final Executor executor, @j0 final e e) {
        this.b.b(new y<TResult>(m0.a(executor), e));
        this.G();
        return this;
    }
    
    @j0
    @Override
    public final m<TResult> d(@j0 final Activity activity, @j0 final f<TResult> f) {
        final z<TResult> z = new z<TResult>(m0.a(o.a), f);
        this.b.b(z);
        l0.a.m(activity).n(z);
        this.G();
        return this;
    }
    
    @j0
    @Override
    public final m<TResult> e(@j0 final f<TResult> f) {
        return this.f(o.a, f);
    }
    
    @j0
    @Override
    public final m<TResult> f(@j0 final Executor executor, @j0 final f<TResult> f) {
        this.b.b(new z<TResult>(m0.a(executor), f));
        this.G();
        return this;
    }
    
    @j0
    @Override
    public final m<TResult> g(@j0 final Activity activity, @j0 final g g) {
        final c0<TResult> c0 = new c0<TResult>(m0.a(o.a), g);
        this.b.b(c0);
        l0.a.m(activity).n(c0);
        this.G();
        return this;
    }
    
    @j0
    @Override
    public final m<TResult> h(@j0 final g g) {
        return this.i(o.a, g);
    }
    
    @j0
    @Override
    public final m<TResult> i(@j0 final Executor executor, @j0 final g g) {
        this.b.b(new c0<TResult>(m0.a(executor), g));
        this.G();
        return this;
    }
    
    @j0
    @Override
    public final m<TResult> j(@j0 final Activity activity, @j0 final h<? super TResult> h) {
        final d0<TResult> d0 = new d0<TResult>(m0.a(o.a), h);
        this.b.b(d0);
        l0.a.m(activity).n(d0);
        this.G();
        return this;
    }
    
    @j0
    @Override
    public final m<TResult> k(@j0 final h<? super TResult> h) {
        return this.l(o.a, h);
    }
    
    @j0
    @Override
    public final m<TResult> l(@j0 final Executor executor, @j0 final h<? super TResult> h) {
        this.b.b(new d0<TResult>(m0.a(executor), h));
        this.G();
        return this;
    }
    
    @j0
    @Override
    public final <TContinuationResult> m<TContinuationResult> m(@j0 final c<TResult, TContinuationResult> c) {
        return this.n(o.a, c);
    }
    
    @j0
    @Override
    public final <TContinuationResult> m<TContinuationResult> n(@j0 final Executor executor, @j0 final c<TResult, TContinuationResult> c) {
        final l0<Object> l0 = new l0<Object>();
        this.b.b(new t<TResult, Object>(m0.a(executor), (c<Object, Object>)c, l0));
        this.G();
        return (m<TContinuationResult>)l0;
    }
    
    @j0
    @Override
    public final <TContinuationResult> m<TContinuationResult> o(@j0 final c<TResult, m<TContinuationResult>> c) {
        return this.p(o.a, c);
    }
    
    @j0
    @Override
    public final <TContinuationResult> m<TContinuationResult> p(@j0 final Executor executor, @j0 final c<TResult, m<TContinuationResult>> c) {
        final l0<Object> l0 = new l0<Object>();
        this.b.b(new u<TResult, Object>(m0.a(executor), (c<Object, m<Object>>)c, l0));
        this.G();
        return (m<TContinuationResult>)l0;
    }
    
    @k0
    @Override
    public final Exception q() {
        synchronized (this.a) {
            return this.f;
        }
    }
    
    @Override
    public final TResult r() {
        synchronized (this.a) {
            this.B();
            this.F();
            if (this.f == null) {
                return this.e;
            }
            throw new k(this.f);
        }
    }
    
    @Override
    public final <X extends Throwable> TResult s(@j0 final Class<X> clazz) throws X, Throwable {
        synchronized (this.a) {
            this.B();
            this.F();
            if (clazz.isInstance(this.f)) {
                throw clazz.cast(this.f);
            }
            if (this.f == null) {
                return this.e;
            }
            throw new k(this.f);
        }
    }
    
    @Override
    public final boolean t() {
        return this.d;
    }
    
    @Override
    public final boolean u() {
        synchronized (this.a) {
            return this.c;
        }
    }
    
    @Override
    public final boolean v() {
        synchronized (this.a) {
            return this.c && !this.d && this.f == null;
        }
    }
    
    @j0
    @Override
    public final <TContinuationResult> m<TContinuationResult> w(@j0 final l<TResult, TContinuationResult> l) {
        return this.x(o.a, l);
    }
    
    @j0
    @Override
    public final <TContinuationResult> m<TContinuationResult> x(final Executor executor, final l<TResult, TContinuationResult> l) {
        final l0<Object> l2 = new l0<Object>();
        this.b.b(new g0<TResult, Object>(m0.a(executor), (l<Object, Object>)l, l2));
        this.G();
        return (m<TContinuationResult>)l2;
    }
    
    public final void y(@j0 final Exception f) {
        x.l(f, "Exception must not be null");
        synchronized (this.a) {
            this.E();
            this.c = true;
            this.f = f;
            // monitorexit(this.a)
            this.b.a(this);
        }
    }
    
    public final void z(@k0 final TResult e) {
        synchronized (this.a) {
            this.E();
            this.c = true;
            this.e = e;
            // monitorexit(this.a)
            this.b.a(this);
        }
    }
    
    private static class a extends LifecycleCallback
    {
        private final List<WeakReference<i0<?>>> H;
        
        private a(final com.google.android.gms.common.api.internal.m m) {
            super(m);
            this.H = new ArrayList<WeakReference<i0<?>>>();
            super.G.b("TaskOnStopCallback", this);
        }
        
        public static a m(final Activity activity) {
            final com.google.android.gms.common.api.internal.m c = LifecycleCallback.c(activity);
            a a;
            if ((a = c.e("TaskOnStopCallback", a.class)) == null) {
                a = new a(c);
            }
            return a;
        }
        
        @androidx.annotation.g0
        @Override
        public void l() {
            synchronized (this.H) {
                final Iterator<WeakReference<i0<?>>> iterator = this.H.iterator();
                while (iterator.hasNext()) {
                    final i0 i0 = iterator.next().get();
                    if (i0 != null) {
                        i0.zza();
                    }
                }
                this.H.clear();
            }
        }
        
        public final <T> void n(final i0<T> referent) {
            synchronized (this.H) {
                this.H.add(new WeakReference<i0<?>>(referent));
            }
        }
    }
}
