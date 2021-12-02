// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;

public abstract class u0<D extends a0>
{
    @j0
    public abstract D a();
    
    @k0
    public abstract a0 b(@j0 final D p0, @k0 final Bundle p1, @k0 final o0 p2, @k0 final a p3);
    
    public void c(@j0 final Bundle bundle) {
    }
    
    @k0
    public Bundle d() {
        return null;
    }
    
    public abstract boolean e();
    
    public interface a
    {
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ ElementType.TYPE })
    public @interface b {
        String value();
    }
}
