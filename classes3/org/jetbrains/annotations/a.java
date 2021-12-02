// 
// Decompiled by Procyon v0.5.36
// 

package org.jetbrains.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

public interface a
{
    @Retention(RetentionPolicy.CLASS)
    @Target({ ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER })
    public @interface a {
    }
    
    @Retention(RetentionPolicy.CLASS)
    @Target({ ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER })
    public @interface b {
    }
}
