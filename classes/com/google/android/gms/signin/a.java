// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.signin;

import com.google.android.gms.common.internal.v;
import androidx.annotation.k0;
import androidx.annotation.RecentlyNonNull;

public final class a implements f
{
    @RecentlyNonNull
    public static final a P;
    private final boolean G;
    private final boolean H;
    @k0
    private final String I;
    private final boolean J;
    @k0
    private final String K;
    @k0
    private final String L;
    private final boolean M;
    @k0
    private final Long N;
    @k0
    private final Long O;
    
    static {
        new a();
        P = new a(false, false, null, false, null, null, false, null, null);
    }
    
    private a(final boolean b, final boolean b2, @k0 final String s, final boolean b3, @k0 final String s2, @k0 final String s3, final boolean b4, @k0 final Long n, @k0 final Long n2) {
        this.G = false;
        this.H = false;
        this.I = null;
        this.J = false;
        this.M = false;
        this.K = null;
        this.L = null;
        this.N = null;
        this.O = null;
    }
    
    @RecentlyNonNull
    @Override
    public final boolean equals(@k0 final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return v.b(null, null) && v.b(null, null) && v.b(null, null) && v.b(null, null) && v.b(null, null);
    }
    
    @RecentlyNonNull
    @Override
    public final int hashCode() {
        final Boolean false = Boolean.FALSE;
        return v.c(false, false, null, false, false, null, null, null, null);
    }
    
    public static final class a
    {
    }
}
