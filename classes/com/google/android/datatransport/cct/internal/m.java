// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue$Builder;
import h3.a$a;
import java.util.List;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class m
{
    @j0
    public static a a() {
        return (a)new g.b();
    }
    
    @k0
    public abstract k b();
    
    @a$a(name = "logEvent")
    @k0
    public abstract List<l> c();
    
    @k0
    public abstract Integer d();
    
    @k0
    public abstract String e();
    
    @k0
    public abstract p f();
    
    public abstract long g();
    
    public abstract long h();
    
    @AutoValue$Builder
    public abstract static class a
    {
        @j0
        public abstract m a();
        
        @j0
        public abstract a b(@k0 final k p0);
        
        @j0
        public abstract a c(@k0 final List<l> p0);
        
        @j0
        abstract a d(@k0 final Integer p0);
        
        @j0
        abstract a e(@k0 final String p0);
        
        @j0
        public abstract a f(@k0 final p p0);
        
        @j0
        public abstract a g(final long p0);
        
        @j0
        public abstract a h(final long p0);
        
        @j0
        public a i(final int i) {
            return this.d(i);
        }
        
        @j0
        public a j(@j0 final String s) {
            return this.e(s);
        }
    }
}
