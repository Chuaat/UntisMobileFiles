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
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface i0 {
    public static final String h = "[field-name]";
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    @p0(21)
    public static final int r = 5;
    @p0(21)
    public static final int s = 6;
    public static final String t = "[value-unspecified]";
    
    @a
    int collate() default 1;
    
    String defaultValue() default "[value-unspecified]";
    
    boolean index() default false;
    
    String name() default "[field-name]";
    
    @b
    int typeAffinity() default 1;
    
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }
    
    @Retention(RetentionPolicy.CLASS)
    public @interface b {
    }
}
