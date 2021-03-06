// 
// Decompiled by Procyon v0.5.36
// 

package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
public @interface u0 {
    long max() default Long.MAX_VALUE;
    
    long min() default Long.MIN_VALUE;
    
    long multiple() default 1L;
    
    long value() default -1L;
}
