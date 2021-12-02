// 
// Decompiled by Procyon v0.5.36
// 

package com.auth0.android.jwt;

import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.Date;

class h
{
    final String a;
    final String b;
    final Date c;
    final Date d;
    final Date e;
    final String f;
    final List<String> g;
    final Map<String, c> h;
    
    h(final String a, final String b, final Date c, final Date d, final Date e, final String f, final List<String> g, final Map<String, c> m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = Collections.unmodifiableMap((Map<? extends String, ? extends c>)m);
    }
    
    c a(final String s) {
        c c = this.h.get(s);
        if (c == null) {
            c = new a();
        }
        return c;
    }
}
