// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import com.google.auto.value.AutoValue$Builder;
import com.google.android.datatransport.g;
import com.google.android.datatransport.d;
import com.google.android.datatransport.c;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class n
{
    public static a a() {
        return (a)new b.b();
    }
    
    public abstract c b();
    
    abstract d<?> c();
    
    public byte[] d() {
        return this.e().apply(this.c().b());
    }
    
    abstract g<?, byte[]> e();
    
    public abstract o f();
    
    public abstract String g();
    
    @AutoValue$Builder
    public abstract static class a
    {
        public abstract n a();
        
        abstract a b(final c p0);
        
        abstract a c(final d<?> p0);
        
        public <T> a d(final d<T> d, final c c, final g<T, byte[]> g) {
            this.c(d);
            this.b(c);
            this.e(g);
            return this;
        }
        
        abstract a e(final g<?, byte[]> p0);
        
        public abstract a f(final o p0);
        
        public abstract a g(final String p0);
    }
}
