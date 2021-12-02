// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import androidx.annotation.p0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.TYPE })
@p0(16)
public @interface x0 {
    String tokenizer() default "simple";
    
    String[] tokenizerArgs() default {};
}
