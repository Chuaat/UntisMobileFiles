// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Objects;
import java.util.Iterator;

final class p3 extends l3
{
    private final o3 b;
    
    p3() {
        this.b = new o3();
    }
    
    @Override
    public final void a(Throwable a) {
        a.printStackTrace();
        a = (Throwable)this.b.a(a, false);
        if (a == null) {
            return;
        }
        synchronized (a) {
            for (final Throwable t : a) {
                System.err.print("Suppressed: ");
                t.printStackTrace();
            }
        }
    }
    
    @Override
    public final void b(final Throwable t, final Throwable t2) {
        if (t2 != t) {
            Objects.requireNonNull(t2, "The suppressed exception cannot be null.");
            this.b.a(t, true).add(t2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", t2);
    }
}
