// 
// Decompiled by Procyon v0.5.36
// 

package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.ANNOTATION_TYPE })
public @interface f0 {
    boolean flag() default false;
    
    boolean open() default false;
    
    long[] value() default {};
}
