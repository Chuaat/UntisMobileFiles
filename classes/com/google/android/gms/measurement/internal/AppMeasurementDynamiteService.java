// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.app.Application$ActivityLifecycleCallbacks;
import com.google.android.gms.internal.measurement.n1;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.qd;
import com.google.android.gms.internal.measurement.l1;
import android.app.Activity;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.dynamic.f;
import android.content.Context;
import com.google.android.gms.internal.measurement.o1;
import com.google.android.gms.dynamic.d;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.j0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import com.google.android.gms.internal.measurement.i1;
import androidx.collection.a;
import androidx.annotation.w;
import java.util.Map;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.e1;

@DynamiteApi
public class AppMeasurementDynamiteService extends e1
{
    @d0
    z4 e;
    @w("listenerMap")
    private final Map<Integer, b6> f;
    
    public AppMeasurementDynamiteService() {
        this.e = null;
        this.f = new a<Integer, b6>();
    }
    
    private final void x2(final i1 i1, final String s) {
        this.zzb();
        this.e.M().G(i1, s);
    }
    
    @EnsuresNonNull({ "scion" })
    private final void zzb() {
        if (this.e != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }
    
    @Override
    public void beginAdUnitExposure(@j0 final String s, final long n) throws RemoteException {
        this.zzb();
        this.e.v().i(s, n);
    }
    
    @Override
    public void clearConditionalUserProperty(@j0 final String s, @j0 final String s2, @j0 final Bundle bundle) throws RemoteException {
        this.zzb();
        this.e.G().f0(s, s2, bundle);
    }
    
    @Override
    public void clearMeasurementEnabled(final long n) throws RemoteException {
        this.zzb();
        this.e.G().E(null);
    }
    
    @Override
    public void endAdUnitExposure(@j0 final String s, final long n) throws RemoteException {
        this.zzb();
        this.e.v().j(s, n);
    }
    
    @Override
    public void generateEventId(final i1 i1) throws RemoteException {
        this.zzb();
        final long r0 = this.e.M().r0();
        this.zzb();
        this.e.M().E(i1, r0);
    }
    
    @Override
    public void getAppInstanceId(final i1 i1) throws RemoteException {
        this.zzb();
        this.e.b().w(new i6(this, i1));
    }
    
    @Override
    public void getCachedAppInstanceId(final i1 i1) throws RemoteException {
        this.zzb();
        this.x2(i1, this.e.G().T());
    }
    
    @Override
    public void getConditionalUserProperties(final String s, final String s2, final i1 i1) throws RemoteException {
        this.zzb();
        this.e.b().w(new ja(this, i1, s, s2));
    }
    
    @Override
    public void getCurrentScreenClass(final i1 i1) throws RemoteException {
        this.zzb();
        this.x2(i1, this.e.G().U());
    }
    
    @Override
    public void getCurrentScreenName(final i1 i1) throws RemoteException {
        this.zzb();
        this.x2(i1, this.e.G().V());
    }
    
    @Override
    public void getGmpAppId(final i1 i1) throws RemoteException {
        this.zzb();
        final e7 g = this.e.G();
        String s;
        if (g.a.N() != null) {
            s = g.a.N();
        }
        else {
            try {
                s = l7.c(g.a.X(), "google_app_id", g.a.Q());
            }
            catch (IllegalStateException ex) {
                g.a.c().o().b("getGoogleAppId failed with exception", ex);
                s = null;
            }
        }
        this.x2(i1, s);
    }
    
    @Override
    public void getMaxUserProperties(final String s, final i1 i1) throws RemoteException {
        this.zzb();
        this.e.G().O(s);
        this.zzb();
        this.e.M().D(i1, 25);
    }
    
    @Override
    public void getTestFlag(final i1 i1, final int n) throws RemoteException {
        this.zzb();
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        this.e.M().D(i1, this.e.G().R());
                        return;
                    }
                    if (n != 4) {
                        return;
                    }
                    this.e.M().z(i1, this.e.G().P());
                    return;
                }
                else {
                    final ga m = this.e.M();
                    final double doubleValue = this.e.G().Q();
                    final Bundle bundle = new Bundle();
                    bundle.putDouble("r", doubleValue);
                    try {
                        i1.G(bundle);
                        return;
                    }
                    catch (RemoteException ex) {
                        m.a.c().t().b("Error returning double value to wrapper", ex);
                        return;
                    }
                }
            }
            this.e.M().E(i1, this.e.G().S());
            return;
        }
        this.e.M().G(i1, this.e.G().W());
    }
    
    @Override
    public void getUserProperties(final String s, final String s2, final boolean b, final i1 i1) throws RemoteException {
        this.zzb();
        this.e.b().w(new k8(this, i1, s, s2, b));
    }
    
    @Override
    public void initForTests(@j0 final Map map) throws RemoteException {
        this.zzb();
    }
    
    @Override
    public void initialize(final d d, final o1 o1, final long l) throws RemoteException {
        final z4 e = this.e;
        if (e == null) {
            this.e = z4.E(x.k(com.google.android.gms.dynamic.f.y2(d)), o1, l);
            return;
        }
        e.c().t().a("Attempting to initialize multiple times");
    }
    
    @Override
    public void isDataCollectionEnabled(final i1 i1) throws RemoteException {
        this.zzb();
        this.e.b().w(new ka(this, i1));
    }
    
    @Override
    public void logEvent(@j0 final String s, @j0 final String s2, @j0 final Bundle bundle, final boolean b, final boolean b2, final long n) throws RemoteException {
        this.zzb();
        this.e.G().o(s, s2, bundle, b, b2, n);
    }
    
    @Override
    public void logEventAndBundle(final String s, final String s2, final Bundle bundle, final i1 i1, final long n) throws RemoteException {
        this.zzb();
        x.g(s2);
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        }
        else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.e.b().w(new j7(this, i1, new u(s2, new s(bundle), "app", n), s));
    }
    
    @Override
    public void logHealthData(final int n, @j0 final String s, @j0 final d d, @j0 final d d2, @j0 final d d3) throws RemoteException {
        this.zzb();
        final Object o = null;
        Object y2;
        if (d == null) {
            y2 = null;
        }
        else {
            y2 = com.google.android.gms.dynamic.f.y2(d);
        }
        Object y3;
        if (d2 == null) {
            y3 = null;
        }
        else {
            y3 = com.google.android.gms.dynamic.f.y2(d2);
        }
        Object y4;
        if (d3 == null) {
            y4 = o;
        }
        else {
            y4 = com.google.android.gms.dynamic.f.y2(d3);
        }
        this.e.c().C(n, true, false, s, y2, y3, y4);
    }
    
    @Override
    public void onActivityCreated(@j0 final d d, @j0 final Bundle bundle, final long n) throws RemoteException {
        this.zzb();
        final d7 c = this.e.G().c;
        if (c != null) {
            this.e.G().l();
            ((Application$ActivityLifecycleCallbacks)c).onActivityCreated(com.google.android.gms.dynamic.f.y2(d), bundle);
        }
    }
    
    @Override
    public void onActivityDestroyed(@j0 final d d, final long n) throws RemoteException {
        this.zzb();
        final d7 c = this.e.G().c;
        if (c != null) {
            this.e.G().l();
            ((Application$ActivityLifecycleCallbacks)c).onActivityDestroyed(com.google.android.gms.dynamic.f.y2(d));
        }
    }
    
    @Override
    public void onActivityPaused(@j0 final d d, final long n) throws RemoteException {
        this.zzb();
        final d7 c = this.e.G().c;
        if (c != null) {
            this.e.G().l();
            ((Application$ActivityLifecycleCallbacks)c).onActivityPaused(com.google.android.gms.dynamic.f.y2(d));
        }
    }
    
    @Override
    public void onActivityResumed(@j0 final d d, final long n) throws RemoteException {
        this.zzb();
        final d7 c = this.e.G().c;
        if (c != null) {
            this.e.G().l();
            ((Application$ActivityLifecycleCallbacks)c).onActivityResumed(com.google.android.gms.dynamic.f.y2(d));
        }
    }
    
    @Override
    public void onActivitySaveInstanceState(final d d, final i1 i1, final long n) throws RemoteException {
        this.zzb();
        final d7 c = this.e.G().c;
        final Bundle bundle = new Bundle();
        if (c != null) {
            this.e.G().l();
            ((Application$ActivityLifecycleCallbacks)c).onActivitySaveInstanceState(com.google.android.gms.dynamic.f.y2(d), bundle);
        }
        try {
            i1.G(bundle);
        }
        catch (RemoteException ex) {
            this.e.c().t().b("Error returning bundle value to wrapper", ex);
        }
    }
    
    @Override
    public void onActivityStarted(@j0 final d d, final long n) throws RemoteException {
        this.zzb();
        if (this.e.G().c != null) {
            this.e.G().l();
            final Activity activity = com.google.android.gms.dynamic.f.y2(d);
        }
    }
    
    @Override
    public void onActivityStopped(@j0 final d d, final long n) throws RemoteException {
        this.zzb();
        if (this.e.G().c != null) {
            this.e.G().l();
            final Activity activity = com.google.android.gms.dynamic.f.y2(d);
        }
    }
    
    @Override
    public void performAction(final Bundle bundle, final i1 i1, final long n) throws RemoteException {
        this.zzb();
        i1.G(null);
    }
    
    @Override
    public void registerOnMeasurementEventListener(final l1 l1) throws RemoteException {
        this.zzb();
        synchronized (this.f) {
            b6 b6;
            if ((b6 = this.f.get(l1.c())) == null) {
                b6 = new ma(this, l1);
                this.f.put(l1.c(), b6);
            }
            // monitorexit(this.f)
            this.e.G().t(b6);
        }
    }
    
    @Override
    public void resetAnalyticsData(final long n) throws RemoteException {
        this.zzb();
        this.e.G().u(n);
    }
    
    @Override
    public void setConditionalUserProperty(@j0 final Bundle bundle, final long n) throws RemoteException {
        this.zzb();
        if (bundle == null) {
            this.e.c().o().a("Conditional user property must not be null");
            return;
        }
        this.e.G().A(bundle, n);
    }
    
    @Override
    public void setConsent(@j0 final Bundle bundle, final long n) throws RemoteException {
        this.zzb();
        final e7 g = this.e.G();
        qd.b();
        if (g.a.w().y(null, a3.w0) && !TextUtils.isEmpty((CharSequence)g.a.y().r())) {
            g.a.c().u().a("Using developer consent only; google app id found");
            return;
        }
        g.B(bundle, 0, n);
    }
    
    @Override
    public void setConsentThirdParty(@j0 final Bundle bundle, final long n) throws RemoteException {
        this.zzb();
        this.e.G().B(bundle, -20, n);
    }
    
    @Override
    public void setCurrentScreen(@j0 final d d, @j0 final String s, @j0 final String s2, final long n) throws RemoteException {
        this.zzb();
        this.e.I().B(com.google.android.gms.dynamic.f.y2(d), s, s2);
    }
    
    @Override
    public void setDataCollectionEnabled(final boolean b) throws RemoteException {
        this.zzb();
        final e7 g = this.e.G();
        g.f();
        g.a.b().w(new f6(g, b));
    }
    
    @Override
    public void setDefaultEventParameters(@j0 Bundle bundle) {
        this.zzb();
        final e7 g = this.e.G();
        if (bundle == null) {
            bundle = null;
        }
        else {
            bundle = new Bundle(bundle);
        }
        g.a.b().w(new e6(g, bundle));
    }
    
    @Override
    public void setEventInterceptor(final l1 l1) throws RemoteException {
        this.zzb();
        final la la = new la(this, l1);
        if (this.e.b().z()) {
            this.e.G().D(la);
            return;
        }
        this.e.b().w(new l9(this, la));
    }
    
    @Override
    public void setInstanceIdProvider(final n1 n1) throws RemoteException {
        this.zzb();
    }
    
    @Override
    public void setMeasurementEnabled(final boolean b, final long n) throws RemoteException {
        this.zzb();
        this.e.G().E(b);
    }
    
    @Override
    public void setMinimumSessionDuration(final long n) throws RemoteException {
        this.zzb();
    }
    
    @Override
    public void setSessionTimeoutDuration(final long n) throws RemoteException {
        this.zzb();
        final e7 g = this.e.G();
        g.a.b().w(new h6(g, n));
    }
    
    @Override
    public void setUserId(@j0 final String s, final long n) throws RemoteException {
        this.zzb();
        if (this.e.w().y(null, a3.u0) && s != null && s.length() == 0) {
            this.e.c().t().a("User ID must be non-empty");
            return;
        }
        this.e.G().I(null, "_id", s, true, n);
    }
    
    @Override
    public void setUserProperty(@j0 final String s, @j0 final String s2, @j0 final d d, final boolean b, final long n) throws RemoteException {
        this.zzb();
        this.e.G().I(s, s2, com.google.android.gms.dynamic.f.y2(d), b, n);
    }
    
    @Override
    public void unregisterOnMeasurementEventListener(final l1 l1) throws RemoteException {
        this.zzb();
        Object f = this.f;
        synchronized (f) {
            final b6 b6 = this.f.remove(l1.c());
            // monitorexit(f)
            f = b6;
            if (b6 == null) {
                f = new ma(this, l1);
            }
            this.e.G().K((b6)f);
        }
    }
}
