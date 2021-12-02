// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import java.util.Arrays;
import androidx.annotation.j0;
import android.graphics.RectF;

public final class a implements d
{
    private final float a;
    
    public a(final float a) {
        this.a = a;
    }
    
    @Override
    public float a(@j0 final RectF rectF) {
        return this.a;
    }
    
    public float b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        if (this.a != ((a)o).a) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
