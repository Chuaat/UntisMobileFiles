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
@c(applicableTo = Number.class)
public @interface f {
    g when() default g.G;
    
    public static class a implements f<f>
    {
        public g b(final f f, final Object o) {
            if (!(o instanceof Number)) {
                return g.J;
            }
            final Number n = (Number)o;
            final boolean b = n instanceof Long;
            boolean b2 = true;
            Label_0091: {
                if (b) {
                    if (n.longValue() < 0L) {
                        break Label_0091;
                    }
                }
                else if (n instanceof Double) {
                    if (n.doubleValue() < 0.0) {
                        break Label_0091;
                    }
                }
                else if (n instanceof Float) {
                    if (n.floatValue() < 0.0f) {
                        break Label_0091;
                    }
                }
                else if (n.intValue() < 0) {
                    break Label_0091;
                }
                b2 = false;
            }
            if (b2) {
                return g.J;
            }
            return g.G;
        }
    }
}
