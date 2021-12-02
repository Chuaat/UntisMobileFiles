// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import b2.b;
import java.util.concurrent.Executor;
import e6.c;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class r implements g<q>
{
    private final c<Executor> a;
    private final c<com.google.android.datatransport.runtime.scheduling.persistence.c> b;
    private final c<s> c;
    private final c<b> d;
    
    public r(final c<Executor> a, final c<com.google.android.datatransport.runtime.scheduling.persistence.c> b, final c<s> c, final c<b> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static r a(final c<Executor> c, final c<com.google.android.datatransport.runtime.scheduling.persistence.c> c2, final c<s> c3, final c<b> c4) {
        return new r(c, c2, c3, c4);
    }
    
    public static q c(final Executor executor, final com.google.android.datatransport.runtime.scheduling.persistence.c c, final s s, final b b) {
        return new q(executor, c, s, b);
    }
    
    public q b() {
        return c((Executor)this.a.get(), (com.google.android.datatransport.runtime.scheduling.persistence.c)this.b.get(), (s)this.c.get(), (b)this.d.get());
    }
}
