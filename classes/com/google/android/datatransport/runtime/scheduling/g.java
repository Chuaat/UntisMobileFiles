// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.p;
import com.google.android.datatransport.runtime.time.a;
import e6.c;

public final class g implements com.google.android.datatransport.runtime.dagger.internal.g<com.google.android.datatransport.runtime.scheduling.jobscheduling.g>
{
    private final c<a> a;
    
    public g(final c<a> a) {
        this.a = a;
    }
    
    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.g a(final a a) {
        return p.c(f.a(a), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public static g b(final c<a> c) {
        return new g(c);
    }
    
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.g c() {
        return a((a)this.a.get());
    }
}
