// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.animation;

import androidx.annotation.j0;
import android.graphics.Matrix;
import android.widget.ImageView;
import android.util.Property;

public class f extends Property<ImageView, Matrix>
{
    private final Matrix a;
    
    public f() {
        super((Class)Matrix.class, "imageMatrixProperty");
        this.a = new Matrix();
    }
    
    @j0
    public Matrix a(@j0 final ImageView imageView) {
        this.a.set(imageView.getImageMatrix());
        return this.a;
    }
    
    public void b(@j0 final ImageView imageView, @j0 final Matrix imageMatrix) {
        imageView.setImageMatrix(imageMatrix);
    }
}
