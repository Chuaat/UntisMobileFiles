// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class u extends WeakReference<Throwable>
{
    private final int a;
    
    public u(final Throwable referent, final ReferenceQueue<Throwable> q) {
        super(referent, q);
        this.a = System.identityHashCode(referent);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != null) {
            if (o.getClass() == u.class) {
                if (this == o) {
                    return true;
                }
                final u u = (u)o;
                if (this.a == u.a && this.get() == u.get()) {
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
