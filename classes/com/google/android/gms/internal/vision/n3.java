// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Objects;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class n3 extends WeakReference<Throwable>
{
    private final int a;
    
    public n3(final Throwable t, final ReferenceQueue<Throwable> q) {
        super(t, q);
        Objects.requireNonNull(t, "The referent cannot be null");
        this.a = System.identityHashCode(t);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != null) {
            if (o.getClass() == n3.class) {
                if (this == o) {
                    return true;
                }
                final n3 n3 = (n3)o;
                if (this.a == n3.a && this.get() == n3.get()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
}
