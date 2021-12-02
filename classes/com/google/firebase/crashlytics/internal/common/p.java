// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.j0;
import com.google.firebase.crashlytics.internal.model.a0;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class p
{
    @j0
    public static p a(final a0 a0, final String s) {
        return new b(a0, s);
    }
    
    public abstract a0 b();
    
    public abstract String c();
}
