// 
// Decompiled by Procyon v0.5.36
// 

package androidx.savedstate;

import androidx.annotation.g0;
import androidx.lifecycle.x;
import androidx.lifecycle.s;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;

public final class b
{
    private final c a;
    private final SavedStateRegistry b;
    
    private b(final c a) {
        this.a = a;
        this.b = new SavedStateRegistry();
    }
    
    @j0
    public static b a(@j0 final c c) {
        return new b(c);
    }
    
    @j0
    public SavedStateRegistry b() {
        return this.b;
    }
    
    @g0
    public void c(@k0 final Bundle bundle) {
        final s lifecycle = this.a.getLifecycle();
        if (lifecycle.b() == s.c.H) {
            lifecycle.a(new Recreator(this.a));
            this.b.c(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
    
    @g0
    public void d(@j0 final Bundle bundle) {
        this.b.d(bundle);
    }
}
