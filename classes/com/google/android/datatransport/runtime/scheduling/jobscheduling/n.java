// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.time.a;
import b2.b;
import java.util.concurrent.Executor;
import com.google.android.datatransport.runtime.backends.e;
import android.content.Context;
import e6.c;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class n implements g<m>
{
    private final c<Context> a;
    private final c<e> b;
    private final c<com.google.android.datatransport.runtime.scheduling.persistence.c> c;
    private final c<s> d;
    private final c<Executor> e;
    private final c<b> f;
    private final c<a> g;
    
    public n(final c<Context> a, final c<e> b, final c<com.google.android.datatransport.runtime.scheduling.persistence.c> c, final c<s> d, final c<Executor> e, final c<b> f, final c<a> g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static n a(final c<Context> c, final c<e> c2, final c<com.google.android.datatransport.runtime.scheduling.persistence.c> c3, final c<s> c4, final c<Executor> c5, final c<b> c6, final c<a> c7) {
        return new n(c, c2, c3, c4, c5, c6, c7);
    }
    
    public static m c(final Context context, final e e, final com.google.android.datatransport.runtime.scheduling.persistence.c c, final s s, final Executor executor, final b b, final a a) {
        return new m(context, e, c, s, executor, b, a);
    }
    
    public m b() {
        return c((Context)this.a.get(), (e)this.b.get(), (com.google.android.datatransport.runtime.scheduling.persistence.c)this.c.get(), (s)this.d.get(), (Executor)this.e.get(), (b)this.f.get(), (a)this.g.get());
    }
}
