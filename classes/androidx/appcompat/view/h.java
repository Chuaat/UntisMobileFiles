// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view;

import java.util.Iterator;
import android.view.View;
import androidx.core.view.r0;
import androidx.core.view.q0;
import android.view.animation.Interpolator;
import androidx.core.view.p0;
import java.util.ArrayList;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class h
{
    final ArrayList<p0> a;
    private long b;
    private Interpolator c;
    q0 d;
    private boolean e;
    private final r0 f;
    
    public h() {
        this.b = -1L;
        this.f = new r0() {
            private boolean a = false;
            private int b = 0;
            
            @Override
            public void b(final View view) {
                final int b = this.b + 1;
                this.b = b;
                if (b == h.this.a.size()) {
                    final q0 d = h.this.d;
                    if (d != null) {
                        d.b(null);
                    }
                    this.d();
                }
            }
            
            @Override
            public void c(final View view) {
                if (this.a) {
                    return;
                }
                this.a = true;
                final q0 d = h.this.d;
                if (d != null) {
                    d.c(null);
                }
            }
            
            void d() {
                this.b = 0;
                this.a = false;
                h.this.b();
            }
        };
        this.a = new ArrayList<p0>();
    }
    
    public void a() {
        if (!this.e) {
            return;
        }
        final Iterator<p0> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().c();
        }
        this.e = false;
    }
    
    void b() {
        this.e = false;
    }
    
    public h c(final p0 e) {
        if (!this.e) {
            this.a.add(e);
        }
        return this;
    }
    
    public h d(final p0 e, final p0 e2) {
        this.a.add(e);
        e2.u(e.d());
        this.a.add(e2);
        return this;
    }
    
    public h e(final long b) {
        if (!this.e) {
            this.b = b;
        }
        return this;
    }
    
    public h f(final Interpolator c) {
        if (!this.e) {
            this.c = c;
        }
        return this;
    }
    
    public h g(final q0 d) {
        if (!this.e) {
            this.d = d;
        }
        return this;
    }
    
    public void h() {
        if (this.e) {
            return;
        }
        for (final p0 p0 : this.a) {
            final long b = this.b;
            if (b >= 0L) {
                p0.q(b);
            }
            final Interpolator c = this.c;
            if (c != null) {
                p0.r(c);
            }
            if (this.d != null) {
                p0.s(this.f);
            }
            p0.w();
        }
        this.e = true;
    }
}
