// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.CLASS)
@Target({})
public @interface w0 {
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 4;
    public static final int y = 5;
    
    String[] childColumns();
    
    boolean deferred() default false;
    
    Class<?> entity();
    
    @a
    int onDelete() default 1;
    
    @a
    int onUpdate() default 1;
    
    String[] parentColumns();
    
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }
}
