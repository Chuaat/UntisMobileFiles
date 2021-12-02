// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.j0;
import com.bumptech.glide.util.m;
import androidx.annotation.k0;
import com.bumptech.glide.request.d;

public abstract class e<T> implements p<T>
{
    private final int G;
    private final int H;
    @k0
    private d I;
    
    public e() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    public e(final int n, final int n2) {
        if (m.v(n, n2)) {
            this.G = n;
            this.H = n2;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(n);
        sb.append(" and height: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public final void b(@j0 final o o) {
    }
    
    @Override
    public final void e(@k0 final d i) {
        this.I = i;
    }
    
    @Override
    public void f() {
    }
    
    @Override
    public void h(@k0 final Drawable drawable) {
    }
    
    @Override
    public void k(@k0 final Drawable drawable) {
    }
    
    @k0
    @Override
    public final d o() {
        return this.I;
    }
    
    @Override
    public void onDestroy() {
    }
    
    @Override
    public final void r(@j0 final o o) {
        o.f(this.G, this.H);
    }
}
