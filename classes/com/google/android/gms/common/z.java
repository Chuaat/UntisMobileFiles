// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class z extends x
{
    private static final WeakReference<byte[]> h;
    private WeakReference<byte[]> g;
    
    static {
        h = new WeakReference<byte[]>(null);
    }
    
    z(final byte[] array) {
        super(array);
        this.g = z.h;
    }
    
    protected abstract byte[] A2();
    
    @Override
    final byte[] y2() {
        synchronized (this) {
            byte[] a2;
            if ((a2 = this.g.get()) == null) {
                a2 = this.A2();
                this.g = new WeakReference<byte[]>(a2);
            }
            return a2;
        }
    }
}
