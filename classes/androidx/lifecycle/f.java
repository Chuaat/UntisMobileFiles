// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.g0;
import androidx.annotation.c1;
import androidx.annotation.j0;
import androidx.arch.core.executor.a;
import androidx.annotation.b1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;
import androidx.annotation.t0;

@t0({ t0.a.I })
public abstract class f<T>
{
    final Executor a;
    final LiveData<T> b;
    final AtomicBoolean c;
    final AtomicBoolean d;
    @b1
    final Runnable e;
    @b1
    final Runnable f;
    
    public f() {
        this(androidx.arch.core.executor.a.e());
    }
    
    public f(@j0 final Executor a) {
        this.c = new AtomicBoolean(true);
        this.d = new AtomicBoolean(false);
        this.e = new Runnable() {
            @c1
            @Override
            public void run() {
                boolean b;
                do {
                    final AtomicBoolean d = androidx.lifecycle.f.this.d;
                    b = false;
                    if (d.compareAndSet(false, true)) {
                        T a = null;
                        b = false;
                        try {
                            while (androidx.lifecycle.f.this.c.compareAndSet(true, false)) {
                                a = androidx.lifecycle.f.this.a();
                                b = true;
                            }
                            if (!b) {
                                continue;
                            }
                            androidx.lifecycle.f.this.b.n(a);
                        }
                        finally {
                            androidx.lifecycle.f.this.d.set(false);
                        }
                    }
                } while (b && androidx.lifecycle.f.this.c.get());
            }
        };
        this.f = new Runnable() {
            @g0
            @Override
            public void run() {
                final boolean h = androidx.lifecycle.f.this.b.h();
                if (androidx.lifecycle.f.this.c.compareAndSet(false, true) && h) {
                    final f g = androidx.lifecycle.f.this;
                    g.a.execute(g.e);
                }
            }
        };
        this.a = a;
        this.b = new LiveData<T>() {
            @Override
            protected void l() {
                final f m = f.this;
                m.a.execute(m.e);
            }
        };
    }
    
    @c1
    protected abstract T a();
    
    @j0
    public LiveData<T> b() {
        return this.b;
    }
    
    public void c() {
        androidx.arch.core.executor.a.f().b(this.f);
    }
}
