// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.backends;

import androidx.annotation.j0;
import com.google.android.datatransport.runtime.time.a;
import android.content.Context;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class i
{
    private static final String a = "cct";
    
    public static i a(final Context context, final a a, final a a2) {
        return new c(context, a, a2, "cct");
    }
    
    public static i b(final Context context, final a a, final a a2, final String s) {
        return new c(context, a, a2, s);
    }
    
    public abstract Context c();
    
    @j0
    public abstract String d();
    
    public abstract a e();
    
    public abstract a f();
}
