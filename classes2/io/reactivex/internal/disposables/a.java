// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.disposables;

import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class a extends AtomicReferenceArray<c> implements c
{
    private static final long G = 2746389416410565408L;
    
    public a(final int length) {
        super(length);
    }
    
    public c a(final int n, final c newValue) {
        c expectedValue;
        do {
            expectedValue = this.get(n);
            if (expectedValue == d.G) {
                newValue.dispose();
                return null;
            }
        } while (!this.compareAndSet(n, expectedValue, newValue));
        return expectedValue;
    }
    
    public boolean b(final int n, final c newValue) {
        c expectedValue;
        do {
            expectedValue = this.get(n);
            if (expectedValue == d.G) {
                newValue.dispose();
                return false;
            }
        } while (!this.compareAndSet(n, expectedValue, newValue));
        if (expectedValue != null) {
            expectedValue.dispose();
        }
        return true;
    }
    
    @Override
    public void dispose() {
        int i = 0;
        if (this.get(0) != d.G) {
            while (i < this.length()) {
                final c c = this.get(i);
                final d g = d.G;
                if (c != g) {
                    final d d = ((AtomicReferenceArray<d>)this).getAndSet(i, g);
                    if (d != g && d != null) {
                        d.dispose();
                    }
                }
                ++i;
            }
        }
    }
    
    @Override
    public boolean i() {
        boolean b = false;
        if (this.get(0) == d.G) {
            b = true;
        }
        return b;
    }
}
