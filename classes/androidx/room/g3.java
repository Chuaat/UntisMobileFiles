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
@Target({ ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.FIELD })
public @interface g3 {
    Class<?>[] value();
}
