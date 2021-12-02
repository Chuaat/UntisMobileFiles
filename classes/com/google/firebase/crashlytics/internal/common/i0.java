// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.Map;

public class i0
{
    static final int d = 64;
    static final int e = 1024;
    static final int f = 8192;
    private String a;
    private final z b;
    private final z c;
    
    public i0() {
        this.a = null;
        this.b = new z(64, 1024);
        this.c = new z(64, 8192);
    }
    
    @j0
    public Map<String, String> a() {
        return this.b.a();
    }
    
    public Map<String, String> b() {
        return this.c.a();
    }
    
    @k0
    public String c() {
        return this.a;
    }
    
    public void d(final String s, final String s2) {
        this.b.d(s, s2);
    }
    
    public void e(final Map<String, String> map) {
        this.b.e(map);
    }
    
    public void f(final String s, final String s2) {
        this.c.d(s, s2);
    }
    
    public void g(final String s) {
        this.a = this.b.b(s);
    }
}
