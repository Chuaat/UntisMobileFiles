// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.k0;
import com.google.android.gms.common.util.d0;
import f2.a;

@a
public class b
{
    @d0
    private static int b = 31;
    private int a;
    
    public b() {
        this.a = 1;
    }
    
    @RecentlyNonNull
    @a
    public b a(@k0 final Object o) {
        final int b = com.google.android.gms.auth.api.signin.internal.b.b;
        final int a = this.a;
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        this.a = b * a + hashCode;
        return this;
    }
    
    @RecentlyNonNull
    @a
    public int b() {
        return this.a;
    }
    
    @RecentlyNonNull
    public final b c(@RecentlyNonNull final boolean b) {
        this.a = b.b * this.a + (b ? 1 : 0);
        return this;
    }
}
