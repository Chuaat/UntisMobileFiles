// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface i {
    boolean generateAdapter();
    
    String generator() default "";
}
