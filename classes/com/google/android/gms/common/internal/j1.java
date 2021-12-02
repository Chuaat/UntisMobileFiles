// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.content.ServiceConnection;
import android.os.Handler$Callback;
import com.google.android.gms.internal.common.i;
import android.os.Handler;
import android.content.Context;
import d6.a;
import java.util.HashMap;

final class j1 extends m
{
    @d6.a("connectionStatus")
    private final HashMap<a, l1> d;
    private final Context e;
    private final Handler f;
    private final com.google.android.gms.common.stats.a g;
    private final long h;
    private final long i;
    
    j1(final Context context) {
        this.d = new HashMap<a, l1>();
        this.e = context.getApplicationContext();
        this.f = new i(context.getMainLooper(), (Handler$Callback)new k1(this, null));
        this.g = com.google.android.gms.common.stats.a.b();
        this.h = 5000L;
        this.i = 300000L;
    }
    
    @Override
    protected final boolean h(final a obj, final ServiceConnection serviceConnection, final String s) {
        x.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.d) {
            final l1 l1 = this.d.get(obj);
            l1 l2;
            if (l1 == null) {
                final l1 value = new l1(this, obj);
                value.a(serviceConnection, serviceConnection, s);
                value.c(s);
                this.d.put(obj, value);
                l2 = value;
            }
            else {
                this.f.removeMessages(0, (Object)obj);
                if (l1.e(serviceConnection)) {
                    final String value2 = String.valueOf(obj);
                    final StringBuilder sb = new StringBuilder(value2.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(value2);
                    throw new IllegalStateException(sb.toString());
                }
                l1.a(serviceConnection, serviceConnection, s);
                final int f = l1.f();
                if (f != 1) {
                    if (f != 2) {
                        l2 = l1;
                    }
                    else {
                        l1.c(s);
                        l2 = l1;
                    }
                }
                else {
                    serviceConnection.onServiceConnected(l1.j(), l1.i());
                    l2 = l1;
                }
            }
            return l2.d();
        }
    }
    
    @Override
    protected final void i(final a obj, final ServiceConnection serviceConnection, String value) {
        x.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.d) {
            final l1 l1 = this.d.get(obj);
            if (l1 == null) {
                final String value2 = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(value2.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(value2);
                throw new IllegalStateException(sb.toString());
            }
            if (l1.e(serviceConnection)) {
                l1.b(serviceConnection, value);
                if (l1.h()) {
                    this.f.sendMessageDelayed(this.f.obtainMessage(0, (Object)obj), this.h);
                }
                return;
            }
            value = String.valueOf(obj);
            final StringBuilder sb2 = new StringBuilder(value.length() + 76);
            sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
            sb2.append(value);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
