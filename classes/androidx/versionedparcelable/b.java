// 
// Decompiled by Procyon v0.5.36
// 

package androidx.versionedparcelable;

import androidx.annotation.t0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.FIELD })
@t0({ t0.a.I })
public @interface b {
    String defaultValue() default "";
    
    int value();
}
