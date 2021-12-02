// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.content.ComponentName;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.x;
import java.util.concurrent.LinkedBlockingQueue;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import f2.a;
import android.content.ServiceConnection;

@a
public class b implements ServiceConnection
{
    private boolean c;
    private final BlockingQueue<IBinder> d;
    
    public b() {
        this.c = false;
        this.d = new LinkedBlockingQueue<IBinder>();
    }
    
    @RecentlyNonNull
    @a
    public IBinder a() throws InterruptedException {
        x.j("BlockingServiceConnection.getService() called on main thread");
        if (!this.c) {
            this.c = true;
            return this.d.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }
    
    @RecentlyNonNull
    @a
    public IBinder b(@RecentlyNonNull final long n, @RecentlyNonNull final TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        x.j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.c) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.c = true;
        final IBinder binder = this.d.poll(n, timeUnit);
        if (binder != null) {
            return binder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }
    
    public void onServiceConnected(@RecentlyNonNull final ComponentName componentName, @RecentlyNonNull final IBinder binder) {
        this.d.add(binder);
    }
    
    public void onServiceDisconnected(@RecentlyNonNull final ComponentName componentName) {
    }
}
