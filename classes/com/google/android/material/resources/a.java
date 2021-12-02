// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.t0;

@t0({ t0.a.H })
public final class a extends f
{
    private final Typeface a;
    private final a b;
    private boolean c;
    
    public a(final a b, final Typeface a) {
        this.a = a;
        this.b = b;
    }
    
    private void d(final Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }
    
    @Override
    public void a(final int n) {
        this.d(this.a);
    }
    
    @Override
    public void b(final Typeface typeface, final boolean b) {
        this.d(typeface);
    }
    
    public void c() {
        this.c = true;
    }
    
    public interface a
    {
        void a(final Typeface p0);
    }
}
