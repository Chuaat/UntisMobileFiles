// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.animation;

import o2.a;
import androidx.annotation.j0;
import android.view.ViewGroup;
import android.util.Property;

public class d extends Property<ViewGroup, Float>
{
    public static final Property<ViewGroup, Float> a;
    
    static {
        a = new d("childrenAlpha");
    }
    
    private d(final String s) {
        super((Class)Float.class, s);
    }
    
    @j0
    public Float a(@j0 final ViewGroup viewGroup) {
        final Float n = (Float)viewGroup.getTag(o2.a.h.c3);
        if (n != null) {
            return n;
        }
        return 1.0f;
    }
    
    public void b(@j0 final ViewGroup viewGroup, @j0 final Float n) {
        final float floatValue = n;
        viewGroup.setTag(o2.a.h.c3, (Object)floatValue);
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
