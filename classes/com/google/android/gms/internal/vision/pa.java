// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import android.content.Intent;
import com.google.android.gms.vision.e;
import android.util.Log;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import d6.a;
import androidx.annotation.k0;
import android.content.Context;

public abstract class pa<T>
{
    private final Context a;
    private final Object b;
    private final String c;
    private final String d;
    private final String e;
    private boolean f;
    private boolean g;
    @k0
    @a("lock")
    private T h;
    
    public pa(final Context a, final String c, final String s) {
        this.b = new Object();
        this.f = false;
        this.g = false;
        this.a = a;
        this.c = c;
        final String value = String.valueOf(s);
        String concat;
        if (value.length() != 0) {
            concat = "com.google.android.gms.vision.dynamite.".concat(value);
        }
        else {
            concat = new String("com.google.android.gms.vision.dynamite.");
        }
        this.d = concat;
        this.e = s;
    }
    
    @k0
    protected abstract T a(final DynamiteModule p0, final Context p1) throws RemoteException, DynamiteModule.a;
    
    protected abstract void b() throws RemoteException;
    
    public final boolean c() {
        return this.e() != null;
    }
    
    public final void d() {
        synchronized (this.b) {
            if (this.h == null) {
                return;
            }
            try {
                this.b();
            }
            catch (RemoteException ex) {
                Log.e(this.c, "Could not finalize native handle", (Throwable)ex);
            }
        }
    }
    
    @RequiresNonNull({ "context", "thickFeatureName", "featureName" })
    @k0
    protected final T e() {
        synchronized (this.b) {
            final T h = this.h;
            if (h != null) {
                return h;
            }
            final Throwable t = null;
            Object o = null;
            Label_0192: {
                try {
                    o = DynamiteModule.e(this.a, DynamiteModule.n, this.d);
                }
                catch (DynamiteModule.a a2) {
                    final String format = String.format("%s.%s", "com.google.android.gms.vision", this.e);
                    com.google.android.gms.vision.e.a("Cannot load thick client module, fall back to load optional module %s", format);
                    try {
                        o = DynamiteModule.e(this.a, DynamiteModule.i, format);
                    }
                    catch (DynamiteModule.a a) {
                        com.google.android.gms.vision.e.d(a, "Error loading optional module %s", format);
                        o = t;
                        if (this.f) {
                            break Label_0192;
                        }
                        com.google.android.gms.vision.e.a("Broadcasting download intent for dependency %s", this.e);
                        final String e = this.e;
                        final Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", e);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.a.sendBroadcast(intent);
                        this.f = true;
                        o = t;
                    }
                }
            }
            Label_0228: {
                if (o != null) {
                    try {
                        this.h = this.a((DynamiteModule)o, this.a);
                        break Label_0228;
                    }
                    catch (RemoteException o) {}
                    catch (DynamiteModule.a a3) {}
                    Log.e(this.c, "Error creating remote native handle", (Throwable)o);
                }
            }
            final boolean g = this.g;
            if (!g && this.h == null) {
                Log.w(this.c, "Native handle not yet available. Reverting to no-op handle.");
                this.g = true;
            }
            else if (g && this.h != null) {
                Log.w(this.c, "Native handle is now available.");
            }
            return this.h;
        }
    }
}
