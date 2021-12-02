// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.animation.TypeConverter;
import android.os.Build$VERSION;
import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

class z
{
    private z() {
    }
    
    static PropertyValuesHolder a(final Property<?, PointF> property, final Path path) {
        if (Build$VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject((Property)property, (TypeConverter)null, path);
        }
        return PropertyValuesHolder.ofFloat((Property)new x<Object>(property, path), new float[] { 0.0f, 1.0f });
    }
}
