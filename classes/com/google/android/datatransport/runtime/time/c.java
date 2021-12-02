// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

public class c implements a
{
    private final AtomicLong a;
    
    public c(final long initialValue) {
        this.a = new AtomicLong(initialValue);
    }
    
    @Override
    public long a() {
        return this.a.get();
    }
    
    public void b(final long delta) {
        if (delta >= 0L) {
            this.a.addAndGet(delta);
            return;
        }
        throw new IllegalArgumentException("cannot advance time backwards.");
    }
    
    public void c() {
        this.b(1L);
    }
}
