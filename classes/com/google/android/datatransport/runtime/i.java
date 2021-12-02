// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import com.google.auto.value.AutoValue$Builder;
import java.util.Collections;
import androidx.annotation.k0;
import java.util.Map;
import java.util.HashMap;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class i
{
    public static a a() {
        return new com.google.android.datatransport.runtime.a.b().f(new HashMap<String, String>());
    }
    
    public final String b(String s) {
        if ((s = this.c().get(s)) == null) {
            s = "";
        }
        return s;
    }
    
    protected abstract Map<String, String> c();
    
    @k0
    public abstract Integer d();
    
    public abstract h e();
    
    public abstract long f();
    
    public final int g(String s) {
        s = this.c().get(s);
        int intValue;
        if (s == null) {
            intValue = 0;
        }
        else {
            intValue = Integer.valueOf(s);
        }
        return intValue;
    }
    
    public final long h(String s) {
        s = this.c().get(s);
        long longValue;
        if (s == null) {
            longValue = 0L;
        }
        else {
            longValue = Long.valueOf(s);
        }
        return longValue;
    }
    
    public final Map<String, String> i() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends String>)this.c());
    }
    
    public final String j(String s, String s2) {
        s = this.c().get(s);
        if (s != null) {
            s2 = s;
        }
        return s2;
    }
    
    @Deprecated
    public byte[] k() {
        return this.e().a();
    }
    
    public abstract String l();
    
    public abstract long m();
    
    public a n() {
        return new com.google.android.datatransport.runtime.a.b().j(this.l()).g(this.d()).h(this.e()).i(this.f()).k(this.m()).f(new HashMap<String, String>(this.c()));
    }
    
    @AutoValue$Builder
    public abstract static class a
    {
        public final a a(final String s, final int i) {
            this.e().put(s, String.valueOf(i));
            return this;
        }
        
        public final a b(final String s, final long l) {
            this.e().put(s, String.valueOf(l));
            return this;
        }
        
        public final a c(final String s, final String s2) {
            this.e().put(s, s2);
            return this;
        }
        
        public abstract i d();
        
        protected abstract Map<String, String> e();
        
        protected abstract a f(final Map<String, String> p0);
        
        public abstract a g(final Integer p0);
        
        public abstract a h(final h p0);
        
        public abstract a i(final long p0);
        
        public abstract a j(final String p0);
        
        public abstract a k(final long p0);
    }
}
