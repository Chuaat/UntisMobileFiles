// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.objectstore;

import io.realm.internal.j;
import io.realm.internal.k;

public class OsKeyPathMapping implements k
{
    private static final long H;
    public long G;
    
    static {
        H = nativeGetFinalizerMethodPtr();
    }
    
    public OsKeyPathMapping(final long n) {
        this.G = -1L;
        this.G = nativeCreateMapping(n);
        j.c.a(this);
    }
    
    private static native long nativeCreateMapping(final long p0);
    
    private static native long nativeGetFinalizerMethodPtr();
    
    @Override
    public long getNativeFinalizerPtr() {
        return OsKeyPathMapping.H;
    }
    
    @Override
    public long getNativePtr() {
        return this.G;
    }
}
