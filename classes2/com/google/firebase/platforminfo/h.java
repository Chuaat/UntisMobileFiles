// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.platforminfo;

import com.google.firebase.components.j;
import com.google.firebase.components.t;
import android.content.Context;
import com.google.firebase.components.g;

public class h
{
    private h() {
    }
    
    public static com.google.firebase.components.f<?> b(final String s, final String s2) {
        return (com.google.firebase.components.f<?>)com.google.firebase.components.f.j((Object)f.a(s, s2), (Class)f.class);
    }
    
    public static com.google.firebase.components.f<?> c(final String s, final a<Context> a) {
        return (com.google.firebase.components.f<?>)com.google.firebase.components.f.k((Class)f.class).b(t.j((Class)Context.class)).f((j)new com.google.firebase.platforminfo.g(s, (a)a)).d();
    }
    
    public interface a<T>
    {
        String a(final T p0);
    }
}
