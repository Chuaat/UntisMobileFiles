// 
// Decompiled by Procyon v0.5.36
// 

package t1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.METHOD })
public @interface d {
    public static final int K1 = 0;
    public static final int L1 = 1;
    public static final int M1 = 2;
    
    boolean memoizeStaticMethod() default false;
    
    int override() default 0;
    
    boolean skipStaticMethod() default false;
    
    String staticMethodName() default "";
}
