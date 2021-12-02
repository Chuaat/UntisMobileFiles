// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.TimeUnit;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.annotation.k0;
import com.google.android.gms.common.c;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.api.a;
import androidx.annotation.j0;

public interface s1
{
    void I();
    
     <A extends a.b, R extends t, T extends e.a<R, A>> T K(@j0 final T p0);
    
     <A extends a.b, T extends e.a<? extends t, A>> T L(@j0 final T p0);
    
    boolean a(final w p0);
    
    void b();
    
    void c();
    
    boolean d();
    
    void e();
    
    c f();
    
    @k0
    c g(@j0 final a<?> p0);
    
    boolean h();
    
    void i(final String p0, @k0 final FileDescriptor p1, final PrintWriter p2, @k0 final String[] p3);
    
    c j(final long p0, final TimeUnit p1);
}
