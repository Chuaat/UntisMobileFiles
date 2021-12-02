// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import java.util.Iterator;
import java.util.HashMap;
import android.content.ComponentName;
import androidx.annotation.k0;
import android.os.IBinder;
import java.util.Map;
import android.content.ServiceConnection;

final class l1 implements ServiceConnection, n1
{
    private final Map<ServiceConnection, ServiceConnection> c;
    private int d;
    private boolean e;
    @k0
    private IBinder f;
    private final m.a g;
    private ComponentName h;
    private final /* synthetic */ j1 i;
    
    public l1(final j1 i, final m.a g) {
        this.i = i;
        this.g = g;
        this.c = new HashMap<ServiceConnection, ServiceConnection>();
        this.d = 2;
    }
    
    public final void a(final ServiceConnection serviceConnection, final ServiceConnection serviceConnection2, final String s) {
        this.c.put(serviceConnection, serviceConnection2);
    }
    
    public final void b(final ServiceConnection serviceConnection, final String s) {
        this.c.remove(serviceConnection);
    }
    
    public final void c(final String s) {
        this.d = 3;
        final boolean e = this.i.g.e(this.i.e, s, this.g.a(this.i.e), (ServiceConnection)this, this.g.e());
        this.e = e;
        if (e) {
            this.i.f.sendMessageDelayed(this.i.f.obtainMessage(1, (Object)this.g), this.i.i);
            return;
        }
        this.d = 2;
        try {
            this.i.g.c(this.i.e, (ServiceConnection)this);
        }
        catch (IllegalArgumentException ex) {}
    }
    
    public final boolean d() {
        return this.e;
    }
    
    public final boolean e(final ServiceConnection serviceConnection) {
        return this.c.containsKey(serviceConnection);
    }
    
    public final int f() {
        return this.d;
    }
    
    public final void g(final String s) {
        this.i.f.removeMessages(1, (Object)this.g);
        this.i.g.c(this.i.e, (ServiceConnection)this);
        this.e = false;
        this.d = 2;
    }
    
    public final boolean h() {
        return this.c.isEmpty();
    }
    
    @k0
    public final IBinder i() {
        return this.f;
    }
    
    public final ComponentName j() {
        return this.h;
    }
    
    public final void onServiceConnected(final ComponentName h, final IBinder f) {
        synchronized (this.i.d) {
            this.i.f.removeMessages(1, (Object)this.g);
            this.f = f;
            this.h = h;
            final Iterator<ServiceConnection> iterator = this.c.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().onServiceConnected(h, f);
            }
            this.d = 1;
        }
    }
    
    public final void onServiceDisconnected(final ComponentName h) {
        synchronized (this.i.d) {
            this.i.f.removeMessages(1, (Object)this.g);
            this.f = null;
            this.h = h;
            final Iterator<ServiceConnection> iterator = this.c.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().onServiceDisconnected(h);
            }
            this.d = 2;
        }
    }
}
