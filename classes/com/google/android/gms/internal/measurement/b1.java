// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.util.Log;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

public final class b1 extends h1
{
    private final AtomicReference<Bundle> e;
    private boolean f;
    
    public b1() {
        this.e = new AtomicReference<Bundle>();
    }
    
    public static final <T> T z2(Bundle value, final Class<T> clazz) {
        T cast = null;
        if (value != null) {
            value = (Bundle)value.get("r");
            cast = cast;
            if (value != null) {
                try {
                    cast = clazz.cast(value);
                }
                catch (ClassCastException ex) {
                    Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", clazz.getCanonicalName(), value.getClass().getCanonicalName()), (Throwable)ex);
                    throw ex;
                }
            }
        }
        return cast;
    }
    
    @Override
    public final void G(final Bundle newValue) {
        final AtomicReference<Bundle> e = this.e;
        // monitorenter(e)
        try {
            this.e.set(newValue);
            this.f = true;
            return;
        }
        finally {
            this.e.notify();
        }
        try {}
        finally {
        }
        // monitorexit(e)
    }
    
    public final Bundle x2(final long n) {
        synchronized (this.e) {
            if (!this.f) {
                try {
                    this.e.wait(n);
                }
                catch (InterruptedException ex) {
                    return null;
                }
            }
            return this.e.get();
        }
    }
    
    public final String y2(final long n) {
        return z2(this.x2(n), String.class);
    }
}
