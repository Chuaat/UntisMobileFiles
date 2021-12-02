// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.observers;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.a;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.e;
import io.reactivex.annotations.f;
import io.reactivex.disposables.c;
import io.reactivex.i0;

public final class l<T> implements i0<T>, c
{
    final i0<? super T> G;
    c H;
    boolean I;
    
    public l(@f final i0<? super T> g) {
        this.G = g;
    }
    
    void a() {
        final NullPointerException ex = new NullPointerException("Subscription not set!");
        try {
            this.G.l(e.G);
            try {
                this.G.b(ex);
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
    
    @Override
    public void b(@f final Throwable t) {
        if (this.I) {
            io.reactivex.plugins.a.Y(t);
            return;
        }
        this.I = true;
        if (this.H == null) {
            final NullPointerException ex = new NullPointerException("Subscription not set!");
            try {
                this.G.l(e.G);
                try {
                    this.G.b(new a(new Throwable[] { t, ex }));
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
            this.G.l(e.G);
            try {
                this.G.b(ex);
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
    
    @Override
    public void dispose() {
        this.H.dispose();
    }
    
    @Override
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
    
    @Override
    public boolean i() {
        return this.H.i();
    }
    
    @Override
    public void l(@f final c h) {
        if (d.l(this.H, h)) {
            this.H = h;
            try {
                this.G.l(this);
            }
            finally {
                final Throwable t;
                b.b(t);
                this.I = true;
                try {
                    h.dispose();
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
    
    @Override
    public void m(@f final T t) {
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
                this.H.dispose();
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
                final l l = this;
                final c c = l.H;
                c.dispose();
                final l i = this;
                final Throwable t4 = t3;
                i.b(t4);
            }
            try {
                final l l = this;
                final c c = l.H;
                c.dispose();
                final l i = this;
                final Throwable t4 = t3;
                i.b(t4);
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
}
