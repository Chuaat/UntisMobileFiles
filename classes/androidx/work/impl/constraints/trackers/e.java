// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.trackers;

import android.net.Network;
import android.content.Intent;
import androidx.annotation.b1;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager$NetworkCallback;
import android.os.Build$VERSION;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import androidx.annotation.p0;
import android.net.ConnectivityManager;
import androidx.annotation.t0;
import androidx.work.impl.constraints.b;

@t0({ t0.a.H })
public class e extends d<androidx.work.impl.constraints.b>
{
    static final String j;
    private final ConnectivityManager g;
    @p0(24)
    private b h;
    private a i;
    
    static {
        j = q.f("NetworkStateTracker");
    }
    
    public e(@j0 final Context context, @j0 final androidx.work.impl.utils.taskexecutor.a a) {
        super(context, a);
        this.g = (ConnectivityManager)super.b.getSystemService("connectivity");
        if (j()) {
            this.h = new b();
        }
        else {
            this.i = new a();
        }
    }
    
    private static boolean j() {
        return Build$VERSION.SDK_INT >= 24;
    }
    
    @Override
    public void e() {
        if (j()) {
            try {
                q.c().a(e.j, "Registering network callback", new Throwable[0]);
                this.g.registerDefaultNetworkCallback((ConnectivityManager$NetworkCallback)this.h);
                return;
            }
            catch (SecurityException ex) {}
            catch (IllegalArgumentException ex2) {}
            final SecurityException ex;
            q.c().b(e.j, "Received exception while registering network callback", ex);
        }
        else {
            q.c().a(e.j, "Registering broadcast receiver", new Throwable[0]);
            super.b.registerReceiver((BroadcastReceiver)this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }
    
    @Override
    public void f() {
        if (j()) {
            try {
                q.c().a(e.j, "Unregistering network callback", new Throwable[0]);
                this.g.unregisterNetworkCallback((ConnectivityManager$NetworkCallback)this.h);
                return;
            }
            catch (SecurityException ex) {}
            catch (IllegalArgumentException ex2) {}
            final SecurityException ex;
            q.c().b(e.j, "Received exception while unregistering network callback", ex);
        }
        else {
            q.c().a(e.j, "Unregistering broadcast receiver", new Throwable[0]);
            super.b.unregisterReceiver((BroadcastReceiver)this.i);
        }
    }
    
    androidx.work.impl.constraints.b g() {
        final NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean b = true;
        final boolean b2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        final boolean i = this.i();
        final boolean c = androidx.core.net.a.c(this.g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            b = false;
        }
        return new androidx.work.impl.constraints.b(b2, i, c, b);
    }
    
    public androidx.work.impl.constraints.b h() {
        return this.g();
    }
    
    @b1
    boolean i() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = false;
        if (sdk_INT < 23) {
            return false;
        }
        try {
            final NetworkCapabilities networkCapabilities = this.g.getNetworkCapabilities(this.g.getActiveNetwork());
            boolean b2 = b;
            if (networkCapabilities != null) {
                final boolean hasCapability = networkCapabilities.hasCapability(16);
                b2 = b;
                if (hasCapability) {
                    b2 = true;
                }
            }
            return b2;
        }
        catch (SecurityException ex) {
            q.c().b(e.j, "Unable to validate active network", ex);
            return false;
        }
    }
    
    private class a extends BroadcastReceiver
    {
        a() {
        }
        
        public void onReceive(final Context context, final Intent intent) {
            if (intent != null) {
                if (intent.getAction() != null) {
                    if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        q.c().a(e.j, "Network broadcast received", new Throwable[0]);
                        final e a = e.this;
                        a.d(a.g());
                    }
                }
            }
        }
    }
    
    @p0(24)
    private class b extends ConnectivityManager$NetworkCallback
    {
        b() {
        }
        
        public void onCapabilitiesChanged(@j0 final Network network, @j0 final NetworkCapabilities networkCapabilities) {
            q.c().a(e.j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            final e a = e.this;
            a.d(a.g());
        }
        
        public void onLost(@j0 final Network network) {
            q.c().a(e.j, "Network connection lost", new Throwable[0]);
            final e a = e.this;
            a.d(a.g());
        }
    }
}
