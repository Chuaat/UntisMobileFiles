// 
// Decompiled by Procyon v0.5.36
// 

package x1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface h {
    Class<?>[] includes() default {};
    
    Class<?>[] subcomponents() default {};
}
