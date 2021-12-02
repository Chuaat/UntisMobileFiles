// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.animation;

import androidx.annotation.k0;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import java.util.WeakHashMap;
import android.graphics.drawable.Drawable;
import android.util.Property;

public class e extends Property<Drawable, Integer>
{
    public static final Property<Drawable, Integer> b;
    private final WeakHashMap<Drawable, Integer> a;
    
    static {
        b = new e();
    }
    
    private e() {
        super((Class)Integer.class, "drawableAlphaCompat");
        this.a = new WeakHashMap<Drawable, Integer>();
    }
    
    @k0
    public Integer a(@j0 final Drawable drawable) {
        if (Build$VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        if (this.a.containsKey(drawable)) {
            return this.a.get(drawable);
        }
        return 255;
    }
    
    public void b(@j0 final Drawable key, @j0 final Integer value) {
        if (Build$VERSION.SDK_INT < 19) {
            this.a.put(key, value);
        }
        key.setAlpha((int)value);
    }
}
