// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import java.util.Calendar;
import androidx.annotation.s0;
import android.util.Log;
import android.annotation.SuppressLint;
import androidx.core.content.i;
import android.location.Location;
import androidx.annotation.b1;
import androidx.annotation.j0;
import android.location.LocationManager;
import android.content.Context;

class p
{
    private static final String d = "TwilightManager";
    private static final int e = 6;
    private static final int f = 22;
    private static p g;
    private final Context a;
    private final LocationManager b;
    private final a c;
    
    @b1
    p(@j0 final Context a, @j0 final LocationManager b) {
        this.c = new a();
        this.a = a;
        this.b = b;
    }
    
    static p a(@j0 Context applicationContext) {
        if (p.g == null) {
            applicationContext = applicationContext.getApplicationContext();
            p.g = new p(applicationContext, (LocationManager)applicationContext.getSystemService("location"));
        }
        return p.g;
    }
    
    @SuppressLint({ "MissingPermission" })
    private Location b() {
        final int d = i.d(this.a, "android.permission.ACCESS_COARSE_LOCATION");
        Location c = null;
        Location c2;
        if (d == 0) {
            c2 = this.c("network");
        }
        else {
            c2 = null;
        }
        if (i.d(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            c = this.c("gps");
        }
        if (c != null && c2 != null) {
            Location location = c2;
            if (c.getTime() > c2.getTime()) {
                location = c;
            }
            return location;
        }
        if (c != null) {
            c2 = c;
        }
        return c2;
    }
    
    @s0(anyOf = { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" })
    private Location c(final String s) {
        try {
            if (this.b.isProviderEnabled(s)) {
                return this.b.getLastKnownLocation(s);
            }
        }
        catch (Exception ex) {
            Log.d("TwilightManager", "Failed to get last known location", (Throwable)ex);
        }
        return null;
    }
    
    private boolean e() {
        return this.c.f > System.currentTimeMillis();
    }
    
    @b1
    static void f(final p g) {
        p.g = g;
    }
    
    private void g(@j0 final Location location) {
        final a c = this.c;
        final long currentTimeMillis = System.currentTimeMillis();
        final o b = o.b();
        b.a(currentTimeMillis - 86400000L, location.getLatitude(), location.getLongitude());
        final long a = b.a;
        b.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        final boolean a2 = b.c == 1;
        final long b2 = b.b;
        final long a3 = b.a;
        b.a(86400000L + currentTimeMillis, location.getLatitude(), location.getLongitude());
        final long b3 = b.b;
        long f;
        if (b2 != -1L && a3 != -1L) {
            long n;
            if (currentTimeMillis > a3) {
                n = 0L + b3;
            }
            else if (currentTimeMillis > b2) {
                n = 0L + a3;
            }
            else {
                n = 0L + b2;
            }
            f = n + 60000L;
        }
        else {
            f = 43200000L + currentTimeMillis;
        }
        c.a = a2;
        c.b = a;
        c.c = b2;
        c.d = a3;
        c.e = b3;
        c.f = f;
    }
    
    boolean d() {
        final a c = this.c;
        if (this.e()) {
            return c.a;
        }
        final Location b = this.b();
        if (b != null) {
            this.g(b);
            return c.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        final int value = Calendar.getInstance().get(11);
        return value < 6 || value >= 22;
    }
    
    private static class a
    {
        boolean a;
        long b;
        long c;
        long d;
        long e;
        long f;
        
        a() {
        }
    }
}
