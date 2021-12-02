// 
// Decompiled by Procyon v0.5.36
// 

package h2;

import java.lang.annotation.Annotation;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable;

public interface d extends Parcelable
{
    @RecentlyNonNull
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";
    
    public @interface a {
        @RecentlyNonNull
        String creator();
        
        @RecentlyNonNull
        boolean validate() default false;
    }
    
    public @interface b {
    }
    
    public @interface c {
        @RecentlyNonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";
        
        @RecentlyNonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";
        
        @RecentlyNonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
        
        @RecentlyNonNull
        int id();
        
        @RecentlyNonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
    
    public @interface d {
        @RecentlyNonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }
    
    public @interface e {
        @RecentlyNonNull
        int id();
    }
    
    public @interface f {
        @RecentlyNonNull
        int[] value();
    }
    
    public @interface g {
        @RecentlyNonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
        
        @RecentlyNonNull
        int id();
        
        @RecentlyNonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
