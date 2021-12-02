// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.time.a;
import e6.c;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class d0 implements g<c0>
{
    private final c<a> a;
    private final c<a> b;
    private final c<d> c;
    private final c<i0> d;
    
    public d0(final c<a> a, final c<a> b, final c<d> c, final c<i0> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static d0 a(final c<a> c, final c<a> c2, final c<d> c3, final c<i0> c4) {
        return new d0(c, c2, c3, c4);
    }
    
    public static c0 c(final a a, final a a2, final Object o, final Object o2) {
        return new c0(a, a2, (d)o, (i0)o2);
    }
    
    public c0 b() {
        return c((a)this.a.get(), (a)this.b.get(), this.c.get(), this.d.get());
    }
}
