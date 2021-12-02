// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.exceptions.a;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.g;
import o7.c;
import io.reactivex.q;

public final class d<T> implements q<T>, o7.d
{
    final c<? super T> G;
    o7.d H;
    boolean I;
    
    public d(final c<? super T> g) {
        this.G = g;
    }
    
    void a() {
        final NullPointerException ex = new NullPointerException("Subscription not set!");
        try {
            this.G.z((o7.d)g.G);
            try {
                this.G.b((Throwable)ex);
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(new a(new Throwable[] { ex, t }));
            }
        }
        finally {
            final Throwable t2;
            b.b(t2);
            io.reactivex.plugins.a.Y(new a(new Throwable[] { ex, t2 }));
        }
    }
    
    public void b(final Throwable t) {
        if (this.I) {
            io.reactivex.plugins.a.Y(t);
            return;
        }
        this.I = true;
        if (this.H == null) {
            final NullPointerException ex = new NullPointerException("Subscription not set!");
            try {
                this.G.z((o7.d)g.G);
                try {
                    this.G.b((Throwable)new a(new Throwable[] { t, ex }));
                }
                finally {
                    final Throwable t2;
                    b.b(t2);
                    io.reactivex.plugins.a.Y(new a(new Throwable[] { t, ex, t2 }));
                }
                return;
            }
            finally {
                final Throwable t3;
                b.b(t3);
                io.reactivex.plugins.a.Y(new a(new Throwable[] { t, ex, t3 }));
                return;
            }
        }
        Throwable t4;
        if ((t4 = t) == null) {
            t4 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.G.b(t4);
        }
        finally {
            b.b(t);
            io.reactivex.plugins.a.Y(new a(new Throwable[] { t4, t }));
        }
    }
    
    void c() {
        this.I = true;
        final NullPointerException ex = new NullPointerException("Subscription not set!");
        try {
            this.G.z((o7.d)g.G);
            try {
                this.G.b((Throwable)ex);
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(new a(new Throwable[] { ex, t }));
            }
        }
        finally {
            final Throwable t2;
            b.b(t2);
            io.reactivex.plugins.a.Y(new a(new Throwable[] { ex, t2 }));
        }
    }
    
    public void cancel() {
        try {
            this.H.cancel();
        }
        finally {
            final Throwable t;
            b.b(t);
            io.reactivex.plugins.a.Y(t);
        }
    }
    
    public void f() {
        if (this.I) {
            return;
        }
        this.I = true;
        if (this.H == null) {
            this.a();
            return;
        }
        try {
            this.G.f();
        }
        finally {
            final Throwable t;
            b.b(t);
            io.reactivex.plugins.a.Y(t);
        }
    }
    
    public void m(final T t) {
        if (this.I) {
            return;
        }
        if (this.H == null) {
            this.c();
            return;
        }
        a a;
        if (t == null) {
            final NullPointerException ex = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.H.cancel();
                this.b(ex);
                return;
            }
            finally {
                final Throwable t2;
                b.b(t2);
                a = new a(new Throwable[] { ex, t2 });
            }
        }
        else {
            final Throwable t3;
            try {
                this.G.m((Object)t);
                return;
            }
            finally {
                b.b(t3);
                final d d = this;
                final o7.d d2 = d.H;
                d2.cancel();
                final d d3 = this;
                final Throwable t4 = t3;
                d3.b(t4);
            }
            try {
                final d d = this;
                final o7.d d2 = d.H;
                d2.cancel();
                final d d3 = this;
                final Throwable t4 = t3;
                d3.b(t4);
                return;
            }
            finally {
                final Throwable t5;
                b.b(t5);
                a = new a(new Throwable[] { t3, t5 });
            }
        }
        this.b(a);
    }
    
    public void v(final long n) {
        final Throwable t;
        try {
            this.H.v(n);
            return;
        }
        finally {
            b.b(t);
            final d d = this;
            final o7.d d2 = d.H;
            d2.cancel();
            final Throwable t2 = t;
            io.reactivex.plugins.a.Y(t2);
        }
        try {
            final d d = this;
            final o7.d d2 = d.H;
            d2.cancel();
            final Throwable t2 = t;
            io.reactivex.plugins.a.Y(t2);
        }
        finally {
            final Throwable t3;
            b.b(t3);
            io.reactivex.plugins.a.Y(new a(new Throwable[] { t, t3 }));
        }
    }
    
    @Override
    public void z(final o7.d h) {
        if (j.o(this.H, h)) {
            this.H = h;
            try {
                this.G.z((o7.d)this);
            }
            finally {
                final Throwable t;
                b.b(t);
                this.I = true;
                try {
                    h.cancel();
                    io.reactivex.plugins.a.Y(t);
                }
                finally {
                    final Throwable t2;
                    b.b(t2);
                    io.reactivex.plugins.a.Y(new a(new Throwable[] { t, t2 }));
                }
            }
        }
    }
}
