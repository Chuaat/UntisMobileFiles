// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling;

import b2.b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import com.google.android.datatransport.runtime.backends.e;
import java.util.concurrent.Executor;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class d implements g<c>
{
    private final e6.c<Executor> a;
    private final e6.c<e> b;
    private final e6.c<s> c;
    private final e6.c<com.google.android.datatransport.runtime.scheduling.persistence.c> d;
    private final e6.c<b> e;
    
    public d(final e6.c<Executor> a, final e6.c<e> b, final e6.c<s> c, final e6.c<com.google.android.datatransport.runtime.scheduling.persistence.c> d, final e6.c<b> e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static d a(final e6.c<Executor> c, final e6.c<e> c2, final e6.c<s> c3, final e6.c<com.google.android.datatransport.runtime.scheduling.persistence.c> c4, final e6.c<b> c5) {
        return new d(c, c2, c3, c4, c5);
    }
    
    public static c c(final Executor executor, final e e, final s s, final com.google.android.datatransport.runtime.scheduling.persistence.c c, final b b) {
        return new c(executor, e, s, c, b);
    }
    
    public c b() {
        return c((Executor)this.a.get(), (e)this.b.get(), (s)this.c.get(), (com.google.android.datatransport.runtime.scheduling.persistence.c)this.d.get(), (b)this.e.get());
    }
}
