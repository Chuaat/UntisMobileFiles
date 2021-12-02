// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics.connector;

import java.util.Set;
import java.util.List;
import androidx.annotation.u0;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;
import androidx.annotation.c1;
import java.util.Map;

public interface a
{
    @c1
    @j0
    @a
    Map<String, Object> a(final boolean p0);
    
    @a
    void b(@j0 final c p0);
    
    @a
    void c(@j0 final String p0, @j0 final String p1, @k0 final Bundle p2);
    
    @a
    void clearConditionalUserProperty(@j0 @u0(max = 24L, min = 1L) final String p0, @k0 final String p1, @k0 final Bundle p2);
    
    @c1
    @a
    int d(@j0 @u0(min = 1L) final String p0);
    
    @c1
    @j0
    @a
    List<c> e(@j0 final String p0, @k0 @u0(max = 23L, min = 1L) final String p1);
    
    @a
    void f(@j0 final String p0, @j0 final String p1, @j0 final Object p2);
    
    @k0
    @a
    @y2.a
    a g(@j0 final String p0, @j0 final b p1);
    
    @f2.a
    public interface a
    {
        @f2.a
        void a();
        
        @f2.a
        void b();
        
        @f2.a
        void c(@j0 final Set<String> p0);
    }
    
    @a
    public interface b
    {
        @a
        void a(final int p0, @k0 final Bundle p1);
    }
    
    @a
    public static class c
    {
        @j0
        @a
        public String a;
        @j0
        @a
        public String b;
        @k0
        @a
        public Object c;
        @k0
        @a
        public String d;
        @a
        public long e;
        @k0
        @a
        public String f;
        @k0
        @a
        public Bundle g;
        @k0
        @a
        public String h;
        @k0
        @a
        public Bundle i;
        @a
        public long j;
        @k0
        @a
        public String k;
        @k0
        @a
        public Bundle l;
        @a
        public long m;
        @a
        public boolean n;
        @a
        public long o;
    }
}
