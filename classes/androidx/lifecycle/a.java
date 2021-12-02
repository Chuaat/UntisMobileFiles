// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.t0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import androidx.savedstate.c;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

public abstract class a extends c
{
    static final String d = "androidx.lifecycle.savedstate.vm.tag";
    private final SavedStateRegistry a;
    private final s b;
    private final Bundle c;
    
    public a(@j0 final androidx.savedstate.c c, @k0 final Bundle c2) {
        this.a = c.getSavedStateRegistry();
        this.b = c.getLifecycle();
        this.c = c2;
    }
    
    @j0
    @Override
    public final <T extends w0> T a(@j0 final Class<T> clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName != null) {
            return this.c(canonicalName, clazz);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    
    @Override
    void b(@j0 final w0 w0) {
        SavedStateHandleController.e(w0, this.a, this.b);
    }
    
    @j0
    @t0({ t0.a.H })
    @Override
    public final <T extends w0> T c(@j0 final String s, @j0 final Class<T> clazz) {
        final SavedStateHandleController j = SavedStateHandleController.j(this.a, this.b, s, this.c);
        final w0 d = this.d(s, clazz, j.k());
        d.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", j);
        return (T)d;
    }
    
    @j0
    protected abstract <T extends w0> T d(@j0 final String p0, @j0 final Class<T> p1, @j0 final r0 p2);
}
