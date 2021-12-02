// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.CLASS)
@Target({})
public @interface i1 {
    String entityColumn() default "";
    
    String parentColumn() default "";
    
    Class<?> value();
}
