// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
public @interface h {
    public static final String A1 = "io.reactivex:computation";
    public static final String B1 = "io.reactivex:io";
    public static final String C1 = "io.reactivex:new-thread";
    public static final String D1 = "io.reactivex:trampoline";
    public static final String E1 = "io.reactivex:single";
    public static final String y1 = "none";
    public static final String z1 = "custom";
    
    String value();
}
