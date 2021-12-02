// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.p;
import com.google.android.datatransport.runtime.time.a;
import android.content.Context;
import e6.c;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class i implements g<s>
{
    private final c<Context> a;
    private final c<com.google.android.datatransport.runtime.scheduling.persistence.c> b;
    private final c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> c;
    private final c<a> d;
    
    public i(final c<Context> a, final c<com.google.android.datatransport.runtime.scheduling.persistence.c> b, final c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> c, final c<a> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static i a(final c<Context> c, final c<com.google.android.datatransport.runtime.scheduling.persistence.c> c2, final c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> c3, final c<a> c4) {
        return new i(c, c2, c3, c4);
    }
    
    public static s c(final Context context, final com.google.android.datatransport.runtime.scheduling.persistence.c c, final com.google.android.datatransport.runtime.scheduling.jobscheduling.g g, final a a) {
        return p.c(h.b(context, c, g, a), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public s b() {
        return c((Context)this.a.get(), (com.google.android.datatransport.runtime.scheduling.persistence.c)this.b.get(), (com.google.android.datatransport.runtime.scheduling.jobscheduling.g)this.c.get(), (a)this.d.get());
    }
}
