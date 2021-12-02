// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.cache;

import androidx.annotation.k0;
import androidx.annotation.j0;
import android.annotation.SuppressLint;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.h;

public class i extends h<g, v<?>> implements j
{
    private a e;
    
    public i(final long n) {
        super(n);
    }
    
    @SuppressLint({ "InlinedApi" })
    @Override
    public void a(final int n) {
        if (n >= 40) {
            this.b();
        }
        else if (n >= 20 || n == 15) {
            this.q(this.e() / 2L);
        }
    }
    
    @Override
    public void h(@j0 final a e) {
        this.e = e;
    }
    
    protected int r(@k0 final v<?> v) {
        if (v == null) {
            return super.m(null);
        }
        return v.l0();
    }
    
    protected void s(@j0 final g g, @k0 final v<?> v) {
        final a e = this.e;
        if (e != null && v != null) {
            e.a(v);
        }
    }
}
