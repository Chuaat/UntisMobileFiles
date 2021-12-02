// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import c6.h;
import android.content.Context;
import android.net.Uri;

public final class q0
{
    final String a;
    final Uri b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;
    @h
    final b1<Context, Boolean> i;
    
    public q0(final Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
    
    private q0(final String a, final Uri b, final String c, final String d, final boolean e, final boolean f, final boolean g, final boolean h, @h final b1<Context, Boolean> i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final <T> k0<T> a(final String s, final T t, final r0<T> r0) {
        return (k0<T>)k0.a(this, s, t, r0, true);
    }
    
    public final q0 b(final String s) {
        final boolean e = this.e;
        if (!e) {
            return new q0(this.a, this.b, s, this.d, e, this.f, this.g, this.h, this.i);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }
}
