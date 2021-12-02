// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Inherited;
import java.lang.annotation.Annotation;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface RealmModule {
    boolean allClasses() default false;
    
    h classNamingPolicy() default h.G;
    
    Class<?>[] classes() default {};
    
    h fieldNamingPolicy() default h.G;
    
    boolean library() default false;
}
