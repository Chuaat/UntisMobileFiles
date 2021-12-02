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
@Target({ ElementType.PARAMETER, ElementType.METHOD })
public @interface a {
    public static final String F1 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
    public static final String G1 = "this";
    public static final String H1 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";
    public static final String I1 = "The return value of this method";
    public static final String J1 = "this";
    
    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
    
    boolean sourceIsContainer() default false;
    
    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";
    
    boolean targetIsContainer() default false;
}
