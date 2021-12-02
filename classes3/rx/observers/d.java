// 
// Decompiled by Procyon v0.5.36
// 

package rx.observers;

import rx.exceptions.e;
import rx.exceptions.f;
import rx.exceptions.b;
import rx.exceptions.c;
import rx.o;

public final class d implements rx.d, o
{
    final rx.d G;
    o H;
    boolean I;
    
    public d(final rx.d g) {
        this.G = g;
    }
    
    @Override
    public void a(final o h) {
        this.H = h;
        try {
            this.G.a(this);
        }
        finally {
            final Throwable t;
            c.e(t);
            h.i();
            this.b(t);
        }
    }
    
    @Override
    public void b(final Throwable t) {
        if (this.I) {
            rx.plugins.c.I(t);
            return;
        }
        this.I = true;
        try {
            this.G.b(t);
        }
        finally {
            final Throwable t2;
            c.e(t2);
            throw new f(new b(new Throwable[] { t, t2 }));
        }
    }
    
    @Override
    public void c() {
        if (this.I) {
            return;
        }
        this.I = true;
        try {
            this.G.c();
        }
        finally {
            final Throwable t;
            c.e(t);
            throw new e(t);
        }
    }
    
    @Override
    public boolean g() {
        return this.I || this.H.g();
    }
    
    @Override
    public void i() {
        this.H.i();
    }
}
