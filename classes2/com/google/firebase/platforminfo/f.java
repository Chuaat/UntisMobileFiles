// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.platforminfo;

import c6.g;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class f
{
    static f a(final String s, final String s2) {
        return new a(s, s2);
    }
    
    @g
    public abstract String b();
    
    @g
    public abstract String c();
}
