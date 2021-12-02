// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.CLASS)
public @interface h3 {
    Class<?> entity() default Object.class;
    
    @k1
    int onConflict() default 3;
}
