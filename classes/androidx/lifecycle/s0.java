// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.lang.reflect.Constructor;
import android.annotation.SuppressLint;
import androidx.annotation.j0;
import androidx.savedstate.c;
import androidx.annotation.k0;
import androidx.savedstate.SavedStateRegistry;
import android.os.Bundle;
import android.app.Application;

public final class s0 extends c
{
    private static final Class<?>[] f;
    private static final Class<?>[] g;
    private final Application a;
    private final b b;
    private final Bundle c;
    private final s d;
    private final SavedStateRegistry e;
    
    static {
        f = new Class[] { Application.class, r0.class };
        g = new Class[] { r0.class };
    }
    
    public s0(@k0 final Application application, @j0 final androidx.savedstate.c c) {
        this(application, c, null);
    }
    
    @SuppressLint({ "LambdaLast" })
    public s0(@k0 final Application a, @j0 final androidx.savedstate.c c, @k0 final Bundle c2) {
        this.e = c.getSavedStateRegistry();
        this.d = c.getLifecycle();
        this.c = c2;
        this.a = a;
        b b;
        if (a != null) {
            b = z0.a.c(a);
        }
        else {
            b = z0.d.b();
        }
        this.b = b;
    }
    
    private static <T> Constructor<T> d(final Class<T> clazz, final Class<?>[] a) {
        for (final Constructor constructor : clazz.getConstructors()) {
            if (Arrays.equals(a, constructor.getParameterTypes())) {
                return (Constructor<T>)constructor;
            }
        }
        return null;
    }
    
    @j0
    @Override
    public <T extends w0> T a(@j0 final Class<T> clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName != null) {
            return this.c(canonicalName, clazz);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    
    @Override
    void b(@j0 final w0 w0) {
        SavedStateHandleController.e(w0, this.e, this.d);
    }
    
    @j0
    @Override
    public <T extends w0> T c(@j0 final String s, @j0 final Class<T> obj) {
        final boolean assignable = androidx.lifecycle.b.class.isAssignableFrom(obj);
        Constructor<T> constructor;
        if (assignable && this.a != null) {
            constructor = d(obj, s0.f);
        }
        else {
            constructor = d(obj, s0.g);
        }
        if (constructor == null) {
            return this.b.a(obj);
        }
        final SavedStateHandleController j = SavedStateHandleController.j(this.e, this.d, s, this.c);
        Label_0116: {
            if (!assignable) {
                break Label_0116;
            }
            try {
                final Application a = this.a;
                w0 w0;
                if (a != null) {
                    w0 = constructor.newInstance(a, j.k());
                }
                else {
                    w0 = constructor.newInstance(j.k());
                }
                final w0 w2 = w0;
                w2.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", j);
                return (T)w2;
            }
            catch (InvocationTargetException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("An exception happened in constructor of ");
                sb.append(obj);
                throw new RuntimeException(sb.toString(), ex.getCause());
            }
            catch (InstantiationException cause) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("A ");
                sb2.append(obj);
                sb2.append(" cannot be instantiated.");
                throw new RuntimeException(sb2.toString(), cause);
            }
            catch (IllegalAccessException cause2) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to access ");
                sb3.append(obj);
                throw new RuntimeException(sb3.toString(), cause2);
            }
        }
    }
}
