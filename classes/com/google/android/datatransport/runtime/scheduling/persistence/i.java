// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.o;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class i
{
    public static i a(final long n, final o o, final com.google.android.datatransport.runtime.i i) {
        return new b(n, o, i);
    }
    
    public abstract com.google.android.datatransport.runtime.i b();
    
    public abstract long c();
    
    public abstract o d();
}
