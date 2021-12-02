// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import androidx.annotation.j0;
import androidx.vectordrawable.graphics.drawable.b;
import android.animation.Animator;

abstract class k<T extends Animator>
{
    protected l a;
    protected final float[] b;
    protected final int[] c;
    
    protected k(final int n) {
        this.b = new float[n * 2];
        this.c = new int[n];
    }
    
    abstract void a();
    
    protected float b(final int n, final int n2, final int n3) {
        return (n - n2) / (float)n3;
    }
    
    public abstract void c();
    
    public abstract void d(@j0 final b.a p0);
    
    protected void e(@j0 final l a) {
        this.a = a;
    }
    
    abstract void f();
    
    abstract void g();
    
    public abstract void h();
}
