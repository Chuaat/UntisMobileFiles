// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import java.util.Arrays;
import androidx.annotation.j0;
import android.graphics.RectF;
import androidx.annotation.t;

public final class m implements d
{
    private final float a;
    
    public m(@t(from = 0.0, to = 1.0) final float a) {
        this.a = a;
    }
    
    @Override
    public float a(@j0 final RectF rectF) {
        return this.a * rectF.height();
    }
    
    @t(from = 0.0, to = 1.0)
    public float b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        if (this.a != ((m)o).a) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
