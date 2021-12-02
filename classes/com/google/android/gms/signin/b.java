// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.signin;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.api.a;

public final class b
{
    private static final a.g<com.google.android.gms.signin.internal.a> a;
    @b0
    private static final a.g<com.google.android.gms.signin.internal.a> b;
    public static final a.a<com.google.android.gms.signin.internal.a, com.google.android.gms.signin.a> c;
    private static final a.a<com.google.android.gms.signin.internal.a, f> d;
    private static final Scope e;
    private static final Scope f;
    public static final a<com.google.android.gms.signin.a> g;
    private static final a<f> h;
    
    static {
        final a.g<com.google.android.gms.signin.internal.a> g2 = (a.g<com.google.android.gms.signin.internal.a>)(a = new a.g());
        final a.g<com.google.android.gms.signin.internal.a> g3 = (a.g<com.google.android.gms.signin.internal.a>)(b = new a.g());
        final a.a<com.google.android.gms.signin.internal.a, com.google.android.gms.signin.a> a2 = (a.a<com.google.android.gms.signin.internal.a, com.google.android.gms.signin.a>)(c = new d());
        final a.a<com.google.android.gms.signin.internal.a, f> a3 = (a.a<com.google.android.gms.signin.internal.a, f>)(d = new c());
        e = new Scope("profile");
        f = new Scope("email");
        g = new a<com.google.android.gms.signin.a>("SignIn.API", (a.a<C, a.d>)a2, (a.g<C>)g2);
        h = new a<f>("SignIn.INTERNAL_API", (a.a<C, a.d>)a3, (a.g<C>)g3);
    }
}
