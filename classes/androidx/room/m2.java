// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface m2 {
    i1 associateBy() default @i1(Object.class);
    
    Class<?> entity() default Object.class;
    
    String entityColumn();
    
    String parentColumn();
    
    String[] projection() default {};
}