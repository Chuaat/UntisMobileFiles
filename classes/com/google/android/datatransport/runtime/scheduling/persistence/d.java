// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.auto.value.AutoValue$Builder;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class d
{
    private static final long a = 10485760L;
    private static final int b = 200;
    private static final int c = 10000;
    private static final long d = 604800000L;
    private static final int e = 81920;
    static final d f;
    
    static {
        f = a().f(10485760L).d(200).b(10000).c(604800000L).e(81920).a();
    }
    
    static a a() {
        return (a)new com.google.android.datatransport.runtime.scheduling.persistence.a.b();
    }
    
    abstract int b();
    
    abstract long c();
    
    abstract int d();
    
    abstract int e();
    
    abstract long f();
    
    a g() {
        return a().f(this.f()).d(this.d()).b(this.b()).c(this.c()).e(this.e());
    }
    
    @AutoValue$Builder
    abstract static class a
    {
        abstract d a();
        
        abstract a b(final int p0);
        
        abstract a c(final long p0);
        
        abstract a d(final int p0);
        
        abstract a e(final int p0);
        
        abstract a f(final long p0);
    }
}
