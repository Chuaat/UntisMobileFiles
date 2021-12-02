// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.e;
import com.google.android.datatransport.runtime.time.a;
import e6.c;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class v implements g<t>
{
    private final c<a> a;
    private final c<a> b;
    private final c<e> c;
    private final c<m> d;
    private final c<q> e;
    
    public v(final c<a> a, final c<a> b, final c<e> c, final c<m> d, final c<q> e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static v a(final c<a> c, final c<a> c2, final c<e> c3, final c<m> c4, final c<q> c5) {
        return new v(c, c2, c3, c4, c5);
    }
    
    public static t c(final a a, final a a2, final e e, final m m, final q q) {
        return new t(a, a2, e, m, q);
    }
    
    public t b() {
        return c((a)this.a.get(), (a)this.b.get(), (e)this.c.get(), (m)this.d.get(), (q)this.e.get());
    }
}
