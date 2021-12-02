// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags;

import android.util.Log;
import android.os.RemoteException;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.dynamite.DynamiteModule;
import android.content.Context;

public final class g
{
    private boolean a;
    private h b;
    
    public g() {
        this.a = false;
        this.b = null;
    }
    
    public final void a(final Context ex) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            try {
                (this.b = i.asInterface(DynamiteModule.e((Context)ex, DynamiteModule.m, "com.google.android.gms.flags").d("com.google.android.gms.flags.impl.FlagProviderImpl"))).init(f.z2(ex));
                this.a = true;
                return;
            }
            catch (RemoteException ex) {}
            catch (DynamiteModule.a a) {}
            Log.w("FlagValueProvider", "Failed to initialize flags module.", (Throwable)ex);
        }
    }
    
    public final <T> T b(final a<T> a) {
        synchronized (this) {
            if (!this.a) {
                return a.i();
            }
            return a.h(this.b);
        }
    }
}
