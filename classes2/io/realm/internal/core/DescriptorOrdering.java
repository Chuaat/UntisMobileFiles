// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.core;

import io.realm.internal.j;
import io.realm.internal.k;

public class DescriptorOrdering implements k
{
    private static final long K;
    private final long G;
    private boolean H;
    private boolean I;
    private boolean J;
    
    static {
        K = nativeGetFinalizerMethodPtr();
    }
    
    public DescriptorOrdering() {
        this.H = false;
        this.I = false;
        this.J = false;
        this.G = nativeCreate();
        j.c.a(this);
    }
    
    private static native void nativeAppendDistinct(final long p0, final QueryDescriptor p1);
    
    private static native void nativeAppendLimit(final long p0, final long p1);
    
    private static native void nativeAppendSort(final long p0, final QueryDescriptor p1);
    
    private static native long nativeCreate();
    
    private static native long nativeGetFinalizerMethodPtr();
    
    private static native boolean nativeIsEmpty(final long p0);
    
    public void a(final QueryDescriptor queryDescriptor) {
        if (!this.I) {
            nativeAppendDistinct(this.G, queryDescriptor);
            this.I = true;
            return;
        }
        throw new IllegalStateException("A distinct field was already defined. It cannot be redefined");
    }
    
    public void b(final QueryDescriptor queryDescriptor) {
        if (!this.H) {
            nativeAppendSort(this.G, queryDescriptor);
            this.H = true;
            return;
        }
        throw new IllegalStateException("A sorting order was already defined. It cannot be redefined");
    }
    
    public boolean c() {
        return nativeIsEmpty(this.G);
    }
    
    public void d(final long n) {
        if (!this.J) {
            nativeAppendLimit(this.G, n);
            this.J = true;
            return;
        }
        throw new IllegalStateException("A limit was already set. It cannot be redefined.");
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return DescriptorOrdering.K;
    }
    
    @Override
    public long getNativePtr() {
        return this.G;
    }
}
