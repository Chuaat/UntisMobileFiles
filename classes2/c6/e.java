// 
// Decompiled by Procyon v0.5.36
// 

package c6;

import java.util.regex.Pattern;
import javax.annotation.meta.g;
import javax.annotation.meta.f;
import javax.annotation.meta.c;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@c(applicableTo = String.class)
public @interface e {
    int flags() default 0;
    
    @m
    String value();
    
    public static class a implements f<e>
    {
        public g b(final e e, final Object o) {
            if (Pattern.compile(e.value(), e.flags()).matcher((CharSequence)o).matches()) {
                return g.G;
            }
            return g.J;
        }
    }
}
