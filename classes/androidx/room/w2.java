// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.util.concurrent.Executor;
import android.annotation.SuppressLint;
import androidx.arch.core.executor.a;
import androidx.annotation.j0;
import java.util.Set;
import androidx.annotation.g0;
import androidx.annotation.c1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Callable;
import androidx.lifecycle.LiveData;

class w2<T> extends LiveData<T>
{
    final r2 m;
    final boolean n;
    final Callable<T> o;
    private final f1 p;
    final h1.c q;
    final AtomicBoolean r;
    final AtomicBoolean s;
    final AtomicBoolean t;
    final Runnable u;
    final Runnable v;
    
    @SuppressLint({ "RestrictedApi" })
    w2(final r2 m, final f1 p5, final boolean n, final Callable<T> o, final String[] array) {
        this.r = new AtomicBoolean(true);
        this.s = new AtomicBoolean(false);
        this.t = new AtomicBoolean(false);
        this.u = new Runnable() {
            @c1
            @Override
            public void run() {
                if (w2.this.t.compareAndSet(false, true)) {
                    w2.this.m.n().b(w2.this.q);
                }
                int n;
                do {
                    if (w2.this.s.compareAndSet(false, true)) {
                        Object call = null;
                        n = 0;
                        try {
                            while (w2.this.r.compareAndSet(true, false)) {
                                try {
                                    call = w2.this.o.call();
                                    n = 1;
                                    continue;
                                }
                                catch (Exception cause) {
                                    throw new RuntimeException("Exception while computing database live data.", cause);
                                }
                                break;
                            }
                            if (n == 0) {
                                continue;
                            }
                            LiveData.this.n(call);
                            continue;
                        }
                        finally {
                            w2.this.s.set(false);
                        }
                    }
                    n = 0;
                } while (n != 0 && w2.this.r.get());
            }
        };
        this.v = new Runnable() {
            @g0
            @Override
            public void run() {
                final boolean h = w2.this.h();
                if (w2.this.r.compareAndSet(false, true) && h) {
                    w2.this.s().execute(w2.this.u);
                }
            }
        };
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p5;
        this.q = new h1.c(array) {
            @Override
            public void b(@j0 final Set<String> set) {
                a.f().b(w2.this.v);
            }
        };
    }
    
    @Override
    protected void l() {
        super.l();
        this.p.b(this);
        this.s().execute(this.u);
    }
    
    @Override
    protected void m() {
        super.m();
        this.p.c(this);
    }
    
    Executor s() {
        if (this.n) {
            return this.m.s();
        }
        return this.m.p();
    }
}
