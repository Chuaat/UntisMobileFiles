// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue$Builder;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class d
{
    @j0
    public static a a() {
        return (a)new com.google.firebase.installations.remote.a.b();
    }
    
    @k0
    public abstract f b();
    
    @k0
    public abstract String c();
    
    @k0
    public abstract String d();
    
    @k0
    public abstract b e();
    
    @k0
    public abstract String f();
    
    @j0
    public abstract a g();
    
    @AutoValue$Builder
    public abstract static class a
    {
        @j0
        public abstract d a();
        
        @j0
        public abstract a b(@j0 final f p0);
        
        @j0
        public abstract a c(@j0 final String p0);
        
        @j0
        public abstract a d(@j0 final String p0);
        
        @j0
        public abstract a e(@j0 final b p0);
        
        @j0
        public abstract a f(@j0 final String p0);
    }
    
    public enum b
    {
        G, 
        H;
    }
}
