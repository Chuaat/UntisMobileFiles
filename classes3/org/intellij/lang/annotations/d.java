// 
// Decompiled by Procyon v0.5.36
// 

package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE })
public @interface d {
    @org.jetbrains.annotations.d
    String prefix() default "";
    
    @org.jetbrains.annotations.d
    String suffix() default "";
    
    @org.jetbrains.annotations.d
    String value();
}
