// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import java.util.Arrays;
import android.graphics.RectF;
import androidx.annotation.j0;
import androidx.annotation.t0;

@t0({ t0.a.H })
public final class b implements d
{
    private final d a;
    private final float b;
    
    public b(float b, @j0 d a) {
        while (a instanceof b) {
            a = ((b)a).a;
            b += ((b)a).b;
        }
        this.a = a;
        this.b = b;
    }
    
    @Override
    public float a(@j0 final RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b2 = (b)o;
        if (!this.a.equals(b2.a) || this.b != b2.b) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
