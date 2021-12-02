// 
// Decompiled by Procyon v0.5.36
// 

package c6;

import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;
import javax.annotation.meta.f;
import javax.annotation.meta.g;
import javax.annotation.meta.e;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@o("RegEx")
@Documented
@Retention(RetentionPolicy.RUNTIME)
@e
public @interface m {
    g when() default g.G;
    
    public static class a implements f<m>
    {
        public g b(final m m, final Object o) {
            if (!(o instanceof String)) {
                return g.J;
            }
            try {
                Pattern.compile((String)o);
                return g.G;
            }
            catch (PatternSyntaxException ex) {
                return g.J;
            }
        }
    }
}
