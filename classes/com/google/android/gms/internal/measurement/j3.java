// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Random;
import com.google.android.gms.measurement.internal.a6;
import android.app.Activity;
import android.os.NetworkOnMainThreadException;
import android.os.BadParcelableException;
import android.os.RemoteException;
import androidx.annotation.j0;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import androidx.annotation.c1;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.common.internal.x;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.util.Log;
import com.google.android.gms.measurement.internal.l7;
import com.google.android.gms.measurement.internal.r4;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;
import com.google.android.gms.common.util.k;
import android.os.Bundle;
import android.content.Context;
import androidx.annotation.w;
import com.google.android.gms.measurement.internal.b6;
import android.util.Pair;
import java.util.List;
import j2.a;
import java.util.concurrent.ExecutorService;
import com.google.android.gms.common.util.g;

public final class j3
{
    private static volatile j3 j;
    private final String a;
    protected final g b;
    protected final ExecutorService c;
    private final a d;
    @w("listenerList")
    private final List<Pair<b6, z2>> e;
    private int f;
    private boolean g;
    private final String h;
    private volatile f1 i;
    
    protected j3(final Context context, String c, final String h, final String s, final Bundle bundle) {
        if (c == null || !v(h, s)) {
            c = "FA";
        }
        this.a = c;
        this.b = k.e();
        final w0 a = z0.a();
        final m2 m2 = new m2(this);
        int n = true ? 1 : 0;
        this.c = a.e(m2, 1);
        this.d = new a(this);
        this.e = new ArrayList<Pair<b6, z2>>();
        try {
            c = l7.c(context, "google_app_id", r4.a(context));
            if (c != null) {
                if (!r()) {
                    this.h = null;
                    this.g = true;
                    Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        }
        catch (IllegalStateException ex) {}
        if (!v(h, s)) {
            this.h = "fa";
            if (h != null && s != null) {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
            else {
                final boolean b = h == null;
                if (s != null) {
                    n = (false ? 1 : 0);
                }
                if (((b ? 1 : 0) ^ n) != 0x0) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        }
        else {
            this.h = h;
        }
        this.u(new a2(this, h, s, context, bundle));
        final Application application = (Application)context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
            return;
        }
        application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new i3(this));
    }
    
    public static j3 C(final Context context, final String s, final String s2, final String s3, final Bundle bundle) {
        x.k(context);
        if (j3.j == null) {
            synchronized (j3.class) {
                if (j3.j == null) {
                    j3.j = new j3(context, s, s2, s3, bundle);
                }
            }
        }
        return j3.j;
    }
    
    protected static final boolean r() {
        return true;
    }
    
    private final void s(final Exception ex, final boolean b, final boolean b2) {
        this.g |= b;
        if (b) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", (Throwable)ex);
            return;
        }
        if (b2) {
            this.a(5, "Error with data collection. Data lost.", ex, null, null);
        }
        Log.w(this.a, "Error with data collection. Data lost.", (Throwable)ex);
    }
    
    private final void t(final String s, final String s2, final Bundle bundle, final boolean b, final boolean b2, final Long n) {
        this.u(new v2(this, n, s, s2, bundle, b, b2));
    }
    
    private final void u(final x2 x2) {
        this.c.execute(x2);
    }
    
    private static final boolean v(final String s, final String s2) {
        return s2 != null && s != null && !r();
    }
    
    protected final f1 B(final Context context, final boolean b) {
        try {
            return e1.asInterface(DynamiteModule.e(context, DynamiteModule.n, "com.google.android.gms.measurement.dynamite").d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        }
        catch (DynamiteModule.a a) {
            this.s(a, true, false);
            return null;
        }
    }
    
    public final Object D(final int n) {
        final b1 b1 = new b1();
        this.u(new p2(this, b1, n));
        return com.google.android.gms.internal.measurement.b1.z2(b1.x2(15000L), Object.class);
    }
    
    public final String F() {
        return this.h;
    }
    
    @c1
    public final String G() {
        final b1 b1 = new b1();
        this.u(new o2(this, b1));
        return b1.y2(120000L);
    }
    
    public final String H() {
        final b1 b1 = new b1();
        this.u(new f2(this, b1));
        return b1.y2(50L);
    }
    
    public final String I() {
        final b1 b1 = new b1();
        this.u(new i2(this, b1));
        return b1.y2(500L);
    }
    
    public final String J() {
        final b1 b1 = new b1();
        this.u(new h2(this, b1));
        return b1.y2(500L);
    }
    
    public final String K() {
        final b1 b1 = new b1();
        this.u(new e2(this, b1));
        return b1.y2(500L);
    }
    
    public final List<Bundle> L(final String s, final String s2) {
        final b1 b1 = new b1();
        this.u(new s1(this, s, s2, b1));
        List<Bundle> emptyList;
        if ((emptyList = com.google.android.gms.internal.measurement.b1.z2(b1.x2(5000L), (Class<List<Bundle>>)List.class)) == null) {
            emptyList = Collections.emptyList();
        }
        return emptyList;
    }
    
    public final Map<String, Object> M(final String s, final String s2, final boolean b) {
        final b1 b2 = new b1();
        this.u(new j2(this, s, s2, b, b2));
        final Bundle x2 = b2.x2(5000L);
        if (x2 != null && x2.size() != 0) {
            final HashMap hashMap = new HashMap<String, Object>(x2.size());
            for (final String s3 : x2.keySet()) {
                final Object value = x2.get(s3);
                if (value instanceof Double || value instanceof Long || value instanceof String) {
                    hashMap.put(s3, value);
                }
            }
            return (Map<String, Object>)hashMap;
        }
        return Collections.emptyMap();
    }
    
    public final void Q(final String s) {
        this.u(new b2(this, s));
    }
    
    public final void R(final String s, final String s2, final Bundle bundle) {
        this.u(new r1(this, s, s2, bundle));
    }
    
    public final void S(final String s) {
        this.u(new c2(this, s));
    }
    
    public final void T(@j0 final String s, final Bundle bundle) {
        this.t(null, s, bundle, false, true, null);
    }
    
    public final void U(final String s, final String s2, final Bundle bundle) {
        this.t(s, s2, bundle, true, true, null);
    }
    
    public final void V(final String s, final String s2, final Bundle bundle, final long l) {
        this.t(s, s2, bundle, true, false, l);
    }
    
    public final void a(final int n, final String s, final Object o, final Object o2, final Object o3) {
        this.u(new k2(this, false, 5, s, o, null, null));
    }
    
    public final void b(final b6 b6) {
        x.k(b6);
        final List<Pair<b6, z2>> e = this.e;
        // monitorenter(e)
        int i = 0;
        try {
            while (i < this.e.size()) {
                if (b6.equals(this.e.get(i).first)) {
                    Log.w(this.a, "OnEventListener already registered.");
                    return;
                }
                ++i;
            }
            final z2 z2 = new z2(b6);
            this.e.add((Pair<b6, z2>)new Pair((Object)b6, (Object)z2));
            // monitorexit(e)
            if (this.i != null) {
                try {
                    this.i.registerOnMeasurementEventListener(z2);
                    return;
                }
                catch (RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException ex) {
                    Log.w(this.a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            this.u(new t2(this, z2));
        }
        finally {
        }
        // monitorexit(e)
    }
    
    public final void c() {
        this.u(new y1(this));
    }
    
    public final void d(final Bundle bundle) {
        this.u(new q1(this, bundle));
    }
    
    public final void e(final Bundle bundle) {
        this.u(new w1(this, bundle));
    }
    
    public final void f(final Bundle bundle) {
        this.u(new x1(this, bundle));
    }
    
    public final void g(final Activity activity, final String s, final String s2) {
        this.u(new u1(this, activity, s, s2));
    }
    
    public final void h(final boolean b) {
        this.u(new q2(this, b));
    }
    
    public final void i(final Bundle bundle) {
        this.u(new r2(this, bundle));
    }
    
    public final void j(final a6 a6) {
        final y2 eventInterceptor = new y2(a6);
        if (this.i != null) {
            try {
                this.i.setEventInterceptor(eventInterceptor);
                return;
            }
            catch (RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException ex) {
                Log.w(this.a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.u(new s2(this, eventInterceptor));
    }
    
    public final void k(final Boolean b) {
        this.u(new v1(this, b));
    }
    
    public final void l(final long n) {
        this.u(new z1(this, n));
    }
    
    public final void m(final String s) {
        this.u(new t1(this, s));
    }
    
    public final void n(final String s, final String s2, final Object o, final boolean b) {
        this.u(new w2(this, s, s2, o, b));
    }
    
    public final void o(b6 b6) {
        x.k(b6);
        List<Pair<b6, z2>> e = this.e;
        // monitorenter(e)
        int i = 0;
        try {
            while (true) {
                while (i < this.e.size()) {
                    if (b6.equals(this.e.get(i).first)) {
                        final Pair pair = this.e.get(i);
                        if (pair == null) {
                            Log.w(this.a, "OnEventListener had not been registered.");
                            return;
                        }
                        this.e.remove(pair);
                        b6 = (b6)pair.second;
                        // monitorexit(e)
                        if (this.i != null) {
                            try {
                                this.i.unregisterOnMeasurementEventListener((l1)b6);
                                return;
                            }
                            catch (RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException ex) {
                                final List list;
                                e = (List<Pair<b6, z2>>)list;
                                Log.w(this.a, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                            }
                        }
                        this.u(new u2(this, (z2)b6));
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final Pair pair = null;
                continue;
            }
        }
        finally {
        }
        // monitorexit(e)
    }
    
    public final int w(final String s) {
        final b1 b1 = new b1();
        this.u(new n2(this, s, b1));
        final Integer n = com.google.android.gms.internal.measurement.b1.z2(b1.x2(10000L), Integer.class);
        if (n == null) {
            return 25;
        }
        return n;
    }
    
    public final long x() {
        final b1 b1 = new b1();
        this.u(new g2(this, b1));
        final Long n = com.google.android.gms.internal.measurement.b1.z2(b1.x2(500L), Long.class);
        long longValue;
        if (n == null) {
            final long nextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
            final int f = this.f + 1;
            this.f = f;
            longValue = nextLong + f;
        }
        else {
            longValue = n;
        }
        return longValue;
    }
    
    public final Bundle y(final Bundle bundle, final boolean b) {
        final b1 b2 = new b1();
        this.u(new l2(this, bundle, b2));
        if (b) {
            return b2.x2(5000L);
        }
        return null;
    }
    
    public final a z() {
        return this.d;
    }
}
