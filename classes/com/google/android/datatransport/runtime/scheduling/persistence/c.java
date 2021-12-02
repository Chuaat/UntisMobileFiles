// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.k0;
import com.google.android.datatransport.runtime.i;
import com.google.android.datatransport.runtime.o;
import androidx.annotation.c1;
import java.io.Closeable;

@c1
public interface c extends Closeable
{
    @k0
    com.google.android.datatransport.runtime.scheduling.persistence.i D4(final o p0, final i p1);
    
    Iterable<o> N1();
    
    long T4(final o p0);
    
    boolean i5(final o p0);
    
    Iterable<com.google.android.datatransport.runtime.scheduling.persistence.i> j1(final o p0);
    
    int r0();
    
    void u0(final Iterable<com.google.android.datatransport.runtime.scheduling.persistence.i> p0);
    
    void u5(final Iterable<com.google.android.datatransport.runtime.scheduling.persistence.i> p0);
    
    void w1(final o p0, final long p1);
}
