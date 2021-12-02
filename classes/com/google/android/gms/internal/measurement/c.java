// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public final class c
{
    private b a;
    private b b;
    private final List<b> c;
    
    public c() {
        this.a = new b("", 0L, null);
        this.b = new b("", 0L, null);
        this.c = new ArrayList<b>();
    }
    
    public c(final b a) {
        this.a = a;
        this.b = a.b();
        this.c = new ArrayList<b>();
    }
    
    public final b a() {
        return this.a;
    }
    
    public final b b() {
        return this.b;
    }
    
    public final List<b> c() {
        return this.c;
    }
    
    public final void d(final b a) {
        this.a = a;
        this.b = a.b();
        this.c.clear();
    }
    
    public final void e(final String s, final long n, final Map<String, Object> map) {
        this.c.add(new b(s, n, map));
    }
    
    public final void f(final b b) {
        this.b = b;
    }
}
