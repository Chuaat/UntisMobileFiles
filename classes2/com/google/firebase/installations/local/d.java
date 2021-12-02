// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations.local;

import com.google.auto.value.AutoValue$Builder;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class d
{
    @j0
    public static d a;
    
    static {
        d.a = a().a();
    }
    
    @j0
    public static a a() {
        return new com.google.firebase.installations.local.a.b().h(0L).g(c.a.G).c(0L);
    }
    
    @k0
    public abstract String b();
    
    public abstract long c();
    
    @k0
    public abstract String d();
    
    @k0
    public abstract String e();
    
    @k0
    public abstract String f();
    
    @j0
    public abstract c.a g();
    
    public abstract long h();
    
    public boolean i() {
        return this.g() == c.a.K;
    }
    
    public boolean j() {
        return this.g() == c.a.H || this.g() == c.a.G;
    }
    
    public boolean k() {
        return this.g() == c.a.J;
    }
    
    public boolean l() {
        return this.g() == c.a.I;
    }
    
    public boolean m() {
        return this.g() == c.a.G;
    }
    
    @j0
    public abstract a n();
    
    @j0
    public d o(@j0 final String s, final long n, final long n2) {
        return this.n().b(s).c(n).h(n2).a();
    }
    
    @j0
    public d p() {
        return this.n().b(null).a();
    }
    
    @j0
    public d q(@j0 final String s) {
        return this.n().e(s).g(c.a.K).a();
    }
    
    @j0
    public d r() {
        return this.n().g(c.a.H).a();
    }
    
    @j0
    public d s(@j0 final String s, @j0 final String s2, final long n, @k0 final String s3, final long n2) {
        return this.n().d(s).g(c.a.J).b(s3).f(s2).c(n2).h(n).a();
    }
    
    @j0
    public d t(@j0 final String s) {
        return this.n().d(s).g(c.a.I).a();
    }
    
    @AutoValue$Builder
    public abstract static class a
    {
        @j0
        public abstract d a();
        
        @j0
        public abstract a b(@k0 final String p0);
        
        @j0
        public abstract a c(final long p0);
        
        @j0
        public abstract a d(@j0 final String p0);
        
        @j0
        public abstract a e(@k0 final String p0);
        
        @j0
        public abstract a f(@k0 final String p0);
        
        @j0
        public abstract a g(@j0 final c.a p0);
        
        @j0
        public abstract a h(final long p0);
    }
}
