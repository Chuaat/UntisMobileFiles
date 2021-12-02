// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.core.state.g;
import androidx.constraintlayout.core.state.d;

public class f implements e, d
{
    final g a;
    private int b;
    private h c;
    private int d;
    private int e;
    private float f;
    private Object g;
    
    public f(final g a) {
        this.d = -1;
        this.e = -1;
        this.f = 0.0f;
        this.a = a;
    }
    
    @Override
    public void a() {
        this.c.v2(this.b);
        final int d = this.d;
        if (d != -1) {
            this.c.q2(d);
        }
        else {
            final int e = this.e;
            if (e != -1) {
                this.c.r2(e);
            }
            else {
                this.c.s2(this.f);
            }
        }
    }
    
    @Override
    public androidx.constraintlayout.core.widgets.e b() {
        if (this.c == null) {
            this.c = new h();
        }
        return this.c;
    }
    
    @Override
    public void c(final androidx.constraintlayout.core.widgets.e e) {
        h c;
        if (e instanceof h) {
            c = (h)e;
        }
        else {
            c = null;
        }
        this.c = c;
    }
    
    @Override
    public void d(final Object g) {
        this.g = g;
    }
    
    @Override
    public e e() {
        return null;
    }
    
    public f f(final Object o) {
        this.d = -1;
        this.e = this.a.f(o);
        this.f = 0.0f;
        return this;
    }
    
    public int g() {
        return this.b;
    }
    
    @Override
    public Object getKey() {
        return this.g;
    }
    
    public f h(final float f) {
        this.d = -1;
        this.e = -1;
        this.f = f;
        return this;
    }
    
    public void i(final int b) {
        this.b = b;
    }
    
    public f j(final Object o) {
        this.d = this.a.f(o);
        this.e = -1;
        this.f = 0.0f;
        return this;
    }
}
