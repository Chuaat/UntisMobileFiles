// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import androidx.annotation.l;
import android.graphics.Paint;
import androidx.annotation.t;
import androidx.annotation.j0;
import android.graphics.Canvas;

abstract class j<S extends c>
{
    S a;
    protected i b;
    
    public j(final S a) {
        this.a = a;
    }
    
    abstract void a(@j0 final Canvas p0, @t(from = 0.0, to = 1.0) final float p1);
    
    abstract void b(@j0 final Canvas p0, @j0 final Paint p1, @t(from = 0.0, to = 1.0) final float p2, @t(from = 0.0, to = 1.0) final float p3, @l final int p4);
    
    abstract void c(@j0 final Canvas p0, @j0 final Paint p1);
    
    abstract int d();
    
    abstract int e();
    
    protected void f(@j0 final i b) {
        this.b = b;
    }
    
    void g(@j0 final Canvas canvas, @t(from = 0.0, to = 1.0) final float n) {
        this.a.e();
        this.a(canvas, n);
    }
}
