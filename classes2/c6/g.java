// 
// Decompiled by Procyon v0.5.36
// 

package c6;

import javax.annotation.meta.f;
import javax.annotation.meta.c;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@c
public @interface g {
    javax.annotation.meta.g when() default javax.annotation.meta.g.G;
    
    public static class a implements f<g>
    {
        public javax.annotation.meta.g b(final g g, final Object o) {
            if (o == null) {
                return g.J;
            }
            return g.G;
        }
    }
}
