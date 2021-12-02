// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.c;
import o7.d;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class a extends AtomicReferenceArray<d> implements c
{
    private static final long G = 2746389416410565408L;
    
    public a(final int length) {
        super(length);
    }
    
    public d a(final int n, final d newValue) {
        d expectedValue;
        do {
            expectedValue = this.get(n);
            if (expectedValue == j.G) {
                if (newValue != null) {
                    newValue.cancel();
                }
                return null;
            }
        } while (!this.compareAndSet(n, expectedValue, newValue));
        return expectedValue;
    }
    
    public boolean b(final int n, final d newValue) {
        d expectedValue;
        do {
            expectedValue = this.get(n);
            if (expectedValue == j.G) {
                if (newValue != null) {
                    newValue.cancel();
                }
                return false;
            }
        } while (!this.compareAndSet(n, expectedValue, newValue));
        if (expectedValue != null) {
            expectedValue.cancel();
        }
        return true;
    }
    
    @Override
    public void dispose() {
        int i = 0;
        if (this.get(0) != j.G) {
            while (i < this.length()) {
                final d d = this.get(i);
                final j g = j.G;
                if (d != g) {
                    final d d2 = this.getAndSet(i, (d)g);
                    if (d2 != g && d2 != null) {
                        d2.cancel();
                    }
                }
                ++i;
            }
        }
    }
    
    @Override
    public boolean i() {
        boolean b = false;
        if (this.get(0) == j.G) {
            b = true;
        }
        return b;
    }
}
