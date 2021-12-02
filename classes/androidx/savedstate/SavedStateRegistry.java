// 
// Decompiled by Procyon v0.5.36
// 

package androidx.savedstate;

import java.util.Iterator;
import java.util.Map;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.q;
import androidx.lifecycle.s;
import androidx.annotation.g0;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.arch.core.internal.b;
import android.annotation.SuppressLint;

@SuppressLint({ "RestrictedApi" })
public final class SavedStateRegistry
{
    private static final String f = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private androidx.arch.core.internal.b<String, b> a;
    @k0
    private Bundle b;
    private boolean c;
    private Recreator.a d;
    boolean e;
    
    SavedStateRegistry() {
        this.a = new androidx.arch.core.internal.b<String, b>();
        this.e = true;
    }
    
    @g0
    @k0
    public Bundle a(@j0 final String s) {
        if (!this.c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        final Bundle b = this.b;
        if (b != null) {
            final Bundle bundle = b.getBundle(s);
            this.b.remove(s);
            if (this.b.isEmpty()) {
                this.b = null;
            }
            return bundle;
        }
        return null;
    }
    
    @g0
    public boolean b() {
        return this.c;
    }
    
    @g0
    void c(@j0 final s s, @k0 final Bundle bundle) {
        if (!this.c) {
            if (bundle != null) {
                this.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            s.a(new q() {
                @Override
                public void h(final y y, final s.b b) {
                    SavedStateRegistry savedStateRegistry;
                    boolean e;
                    if (b == s.b.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        e = true;
                    }
                    else {
                        if (b != s.b.ON_STOP) {
                            return;
                        }
                        savedStateRegistry = SavedStateRegistry.this;
                        e = false;
                    }
                    savedStateRegistry.e = e;
                }
            });
            this.c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
    
    @g0
    void d(@j0 final Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        final Bundle b = this.b;
        if (b != null) {
            bundle2.putAll(b);
        }
        final androidx.arch.core.internal.b.d h = this.a.h();
        while (h.hasNext()) {
            final Map.Entry<String, V> entry = ((Iterator<Map.Entry<String, V>>)h).next();
            bundle2.putBundle((String)entry.getKey(), ((b)entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
    
    @g0
    public void e(@j0 final String s, @j0 final b b) {
        if (this.a.l(s, b) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }
    
    @g0
    public void f(@j0 final Class<? extends a> clazz) {
        if (this.e) {
            if (this.d == null) {
                this.d = new Recreator.a(this);
            }
            try {
                clazz.getDeclaredConstructor((Class<?>[])new Class[0]);
                this.d.b(clazz.getName());
                return;
            }
            catch (NoSuchMethodException cause) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Class");
                sb.append(clazz.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), cause);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    
    @g0
    public void g(@j0 final String s) {
        this.a.m(s);
    }
    
    public interface a
    {
        void a(@j0 final c p0);
    }
    
    public interface b
    {
        @j0
        Bundle a();
    }
}
