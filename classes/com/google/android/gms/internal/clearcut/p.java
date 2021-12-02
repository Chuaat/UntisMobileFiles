// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.net.Uri;

public final class p
{
    private final String a;
    private final Uri b;
    private final String c;
    private final String d;
    private final boolean e;
    private final boolean f;
    
    public p(final Uri uri) {
        this(null, uri, "", "", false, false);
    }
    
    private p(final String a, final Uri b, final String c, final String d, final boolean e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final <T> f<T> a(final String s, final T t, final o<T> o) {
        return (f<T>)c(this, s, t, (o<Object>)o);
    }
    
    public final f<String> b(final String s, final String s2) {
        return (f<String>)com.google.android.gms.internal.clearcut.f.j(this, s, null);
    }
    
    public final f<Boolean> e(final String s, final boolean b) {
        return (f<Boolean>)com.google.android.gms.internal.clearcut.f.k(this, s, false);
    }
    
    public final p f(final String s) {
        final boolean e = this.e;
        if (!e) {
            return new p(this.a, this.b, s, this.d, e, this.f);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }
    
    public final p h(final String s) {
        return new p(this.a, this.b, this.c, s, this.e, this.f);
    }
}
