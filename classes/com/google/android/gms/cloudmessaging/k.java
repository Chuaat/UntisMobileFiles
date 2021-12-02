// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import androidx.annotation.g0;
import android.os.IBinder;
import android.content.ComponentName;
import java.util.concurrent.TimeUnit;
import android.content.Intent;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;
import android.os.Message;
import java.util.Iterator;
import androidx.annotation.k0;
import android.util.Log;
import java.util.ArrayDeque;
import android.os.Handler;
import android.os.Handler$Callback;
import com.google.android.gms.internal.cloudmessaging.e;
import android.os.Looper;
import android.util.SparseArray;
import java.util.Queue;
import android.os.Messenger;
import d6.a;
import android.content.ServiceConnection;

final class k implements ServiceConnection
{
    @a("this")
    int c;
    final Messenger d;
    t e;
    @a("this")
    final Queue<v<?>> f;
    @a("this")
    final SparseArray<v<?>> g;
    final /* synthetic */ j h;
    
    private k(final j h) {
        this.h = h;
        this.c = 0;
        this.d = new Messenger((Handler)new e(Looper.getMainLooper(), (Handler$Callback)new n(this)));
        this.f = new ArrayDeque<v<?>>();
        this.g = (SparseArray<v<?>>)new SparseArray();
    }
    
    final void a() {
        this.h.b.execute(new o(this));
    }
    
    final void b(final int i) {
        synchronized (this) {
            final v v = (v)this.g.get(i);
            if (v != null) {
                final StringBuilder sb = new StringBuilder(31);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                this.g.remove(i);
                v.b(new u(3, "Timed out waiting for response"));
                this.f();
            }
        }
    }
    
    final void c(int i, @k0 final String obj) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                final String value = String.valueOf(obj);
                String concat;
                if (value.length() != 0) {
                    concat = "Disconnected: ".concat(value);
                }
                else {
                    concat = new String("Disconnected: ");
                }
                Log.d("MessengerIpcClient", concat);
            }
            final int c = this.c;
            if (c == 0) {
                throw new IllegalStateException();
            }
            if (c == 1 || c == 2) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.c = 4;
                com.google.android.gms.common.stats.a.b().c(this.h.a, (ServiceConnection)this);
                final u u = new u(i, obj);
                final Iterator<v> iterator = (Iterator<v>)this.f.iterator();
                while (iterator.hasNext()) {
                    iterator.next().b(u);
                }
                this.f.clear();
                for (i = 0; i < this.g.size(); ++i) {
                    ((v)this.g.valueAt(i)).b(u);
                }
                this.g.clear();
                return;
            }
            if (c == 3) {
                this.c = 4;
                return;
            }
            if (c == 4) {
                return;
            }
            i = this.c;
            final StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    final boolean d(final Message message) {
        final int arg1 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            final StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(arg1);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            final v v = (v)this.g.get(arg1);
            if (v == null) {
                final StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(arg1);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.g.remove(arg1);
            this.f();
            // monitorexit(this)
            final Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                v.b(new u(4, "Not supported by GmsCore"));
            }
            else {
                v.a(data);
            }
            return true;
        }
    }
    
    final boolean e(final v<?> v) {
        synchronized (this) {
            final int c = this.c;
            if (c == 0) {
                this.f.add(v);
                x.q(this.c == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.c = 1;
                final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                if (!com.google.android.gms.common.stats.a.b().a(this.h.a, intent, (ServiceConnection)this, 1)) {
                    this.c(0, "Unable to bind to service");
                }
                else {
                    this.h.b.schedule(new m(this), 30L, TimeUnit.SECONDS);
                }
                return true;
            }
            if (c == 1) {
                this.f.add(v);
                return true;
            }
            if (c == 2) {
                this.f.add(v);
                this.a();
                return true;
            }
            if (c != 3 && c != 4) {
                final int c2 = this.c;
                final StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(c2);
                throw new IllegalStateException(sb.toString());
            }
            return false;
        }
    }
    
    final void f() {
        synchronized (this) {
            if (this.c == 2 && this.f.isEmpty() && this.g.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.c = 3;
                com.google.android.gms.common.stats.a.b().c(this.h.a, (ServiceConnection)this);
            }
        }
    }
    
    final void g() {
        synchronized (this) {
            if (this.c == 1) {
                this.c(1, "Timed out while binding");
            }
        }
    }
    
    @g0
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.h.b.execute(new p(this, binder));
    }
    
    @g0
    public final void onServiceDisconnected(final ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.h.b.execute(new r(this));
    }
}
