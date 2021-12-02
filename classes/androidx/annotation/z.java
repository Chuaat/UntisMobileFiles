// 
// Decompiled by Procyon v0.5.36
// 

package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.METHOD })
public @interface z {
    int attributeId() default 0;
    
    a[] enumMapping() default {};
    
    b[] flagMapping() default {};
    
    boolean hasAttributeId() default true;
    
    String name() default "";
    
    c valueType() default c.H;
    
    @Retention(RetentionPolicy.SOURCE)
    @Target({ ElementType.TYPE })
    public @interface a {
        String name();
        
        int value();
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @Target({ ElementType.TYPE })
    public @interface b {
        int mask() default 0;
        
        String name();
        
        int target();
    }
    
    public enum c
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L, 
        M;
    }
}
