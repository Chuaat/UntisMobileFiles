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
@Target({ ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE })
public @interface t {
    double from() default Double.NEGATIVE_INFINITY;
    
    boolean fromInclusive() default true;
    
    double to() default Double.POSITIVE_INFINITY;
    
    boolean toInclusive() default true;
}
