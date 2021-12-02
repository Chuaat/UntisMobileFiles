// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.k0;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class c0
{
    public static c0 b(final a a, final c c, final b b) {
        return new w(a, c, b);
    }
    
    public abstract a a();
    
    public abstract b c();
    
    public abstract c d();
    
    @AutoValue
    public abstract static class a
    {
        public static a b(final String s, final String s2, final String s3, final String s4, final int n, @k0 final String s5) {
            return (a)new x(s, s2, s3, s4, n, s5);
        }
        
        public abstract String a();
        
        public abstract int c();
        
        public abstract String d();
        
        @k0
        public abstract String e();
        
        public abstract String f();
        
        public abstract String g();
    }
    
    @AutoValue
    public abstract static class b
    {
        public static b c(final int n, final String s, final int n2, final long n3, final long n4, final boolean b, final int n5, final String s2, final String s3) {
            return (b)new y(n, s, n2, n3, n4, b, n5, s2, s3);
        }
        
        public abstract int a();
        
        public abstract int b();
        
        public abstract long d();
        
        public abstract boolean e();
        
        public abstract String f();
        
        public abstract String g();
        
        public abstract String h();
        
        public abstract int i();
        
        public abstract long j();
    }
    
    @AutoValue
    public abstract static class c
    {
        public static c a(final String s, final String s2, final boolean b) {
            return (c)new z(s, s2, b);
        }
        
        public abstract boolean b();
        
        public abstract String c();
        
        public abstract String d();
    }
}
