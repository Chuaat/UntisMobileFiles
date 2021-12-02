// 
// Decompiled by Procyon v0.5.36
// 

package c6;

import javax.annotation.meta.g;
import javax.annotation.meta.c;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@c(applicableTo = CharSequence.class)
public @interface o {
    String value();
    
    g when() default g.G;
}
