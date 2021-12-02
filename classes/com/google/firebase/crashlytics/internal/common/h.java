// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Callable;
import androidx.annotation.j0;
import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.p;
import com.google.android.gms.tasks.m;
import java.util.concurrent.Executor;

class h
{
    private final Executor a;
    private m<Void> b;
    private final Object c;
    private final ThreadLocal<Boolean> d;
    
    public h(final Executor a) {
        this.b = p.g((Void)null);
        this.c = new Object();
        this.d = new ThreadLocal<Boolean>();
        (this.a = a).execute(new Runnable() {
            @Override
            public void run() {
                h.this.d.set(Boolean.TRUE);
            }
        });
    }
    
    private <T> m<Void> d(final m<T> m) {
        return m.n(this.a, (c<T, Void>)new c<T, Void>() {
            public Void b(@j0 final m<T> m) throws Exception {
                return null;
            }
        });
    }
    
    private boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }
    
    private <T> c<Void, T> f(final Callable<T> callable) {
        return new c<Void, T>() {
            @Override
            public T a(@j0 final m<Void> m) throws Exception {
                return callable.call();
            }
        };
    }
    
    public void b() {
        if (this.e()) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }
    
    public Executor c() {
        return this.a;
    }
    
    m<Void> g(final Runnable runnable) {
        return this.h((Callable<Void>)new Callable<Void>() {
            public Void a() throws Exception {
                runnable.run();
                return null;
            }
        });
    }
    
    public <T> m<T> h(final Callable<T> callable) {
        synchronized (this.c) {
            final m<T> n = this.b.n(this.a, (c<Void, T>)this.f((Callable<TContinuationResult>)callable));
            this.b = this.d((m<Object>)n);
            return (m<T>)n;
        }
    }
    
    public <T> m<T> i(final Callable<m<T>> callable) {
        synchronized (this.c) {
            final m<T> p = this.b.p(this.a, (c<Void, m<T>>)this.f((Callable<m<TContinuationResult>>)callable));
            this.b = this.d((m<Object>)p);
            return (m<T>)p;
        }
    }
}
