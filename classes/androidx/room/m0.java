// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import androidx.annotation.t0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.TYPE })
public @interface m0 {
    @t0({ t0.a.H })
    Class<?>[] autoMigrations() default {};
    
    Class<?>[] entities();
    
    boolean exportSchema() default true;
    
    int version();
    
    Class<?>[] views() default {};
}
