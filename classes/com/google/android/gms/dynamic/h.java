// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamic;

import com.google.android.gms.common.l;
import com.google.android.gms.common.internal.x;
import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@f2.a
public abstract class h<T>
{
    private final String a;
    private T b;
    
    @f2.a
    protected h(@RecentlyNonNull final String a) {
        this.a = a;
    }
    
    @RecentlyNonNull
    @f2.a
    protected abstract T a(@RecentlyNonNull final IBinder p0);
    
    @RecentlyNonNull
    @f2.a
    protected final T b(@RecentlyNonNull Context i) throws a {
        if (this.b == null) {
            x.k(i);
            i = l.i(i);
            if (i != null) {
                final ClassLoader classLoader = i.getClassLoader();
                try {
                    this.b = this.a((IBinder)classLoader.loadClass(this.a).newInstance());
                    return this.b;
                }
                catch (IllegalAccessException ex) {
                    throw new a("Could not access creator.", ex);
                }
                catch (InstantiationException ex2) {
                    throw new a("Could not instantiate creator.", ex2);
                }
                catch (ClassNotFoundException ex3) {
                    throw new a("Could not load creator class.", ex3);
                }
            }
            throw new a("Could not get remote context.");
        }
        return this.b;
    }
    
    @f2.a
    public static class a extends Exception
    {
        public a(@RecentlyNonNull final String message) {
            super(message);
        }
        
        public a(@RecentlyNonNull final String message, @RecentlyNonNull final Throwable cause) {
            super(message, cause);
        }
    }
}
