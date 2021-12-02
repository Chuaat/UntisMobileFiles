// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

public final class c extends AtomicReference<Throwable>
{
    private static final long G = 3949248817947090603L;
    
    public boolean a(final Throwable t) {
        return k.a(this, t);
    }
    
    public boolean b() {
        return this.get() == k.a;
    }
    
    public Throwable c() {
        return k.c(this);
    }
}
