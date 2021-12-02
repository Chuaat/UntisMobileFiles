// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import com.bumptech.glide.util.m;
import androidx.annotation.j0;

@Deprecated
public abstract class n<Z> extends b<Z>
{
    private final int H;
    private final int I;
    
    public n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    public n(final int h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    public void b(@j0 final o o) {
    }
    
    @Override
    public final void r(@j0 final o o) {
        if (m.v(this.H, this.I)) {
            o.f(this.H, this.I);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(this.H);
        sb.append(" and height: ");
        sb.append(this.I);
        sb.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(sb.toString());
    }
}
