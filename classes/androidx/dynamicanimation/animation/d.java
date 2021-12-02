// 
// Decompiled by Procyon v0.5.36
// 

package androidx.dynamicanimation.animation;

import androidx.annotation.p0;
import android.util.FloatProperty;

public abstract class d<T>
{
    final String a;
    
    public d(final String a) {
        this.a = a;
    }
    
    @p0(24)
    public static <T> d<T> a(final FloatProperty<T> floatProperty) {
        return new d<T>(floatProperty.getName()) {
            @Override
            public float b(final T t) {
                return (float)floatProperty.get((Object)t);
            }
            
            @Override
            public void c(final T t, final float n) {
                floatProperty.setValue((Object)t, n);
            }
        };
    }
    
    public abstract float b(final T p0);
    
    public abstract void c(final T p0, final float p1);
}
