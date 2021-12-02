// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import java.util.Iterator;
import com.google.android.gms.internal.play_billing.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.content.pm.PackageManager$NameNotFoundException;
import org.json.JSONObject;
import java.util.Collection;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import android.content.pm.ServiceInfo;
import android.content.ServiceConnection;
import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;
import android.text.TextUtils;
import java.util.List;
import java.util.ArrayList;
import com.google.android.gms.internal.play_billing.a;
import androidx.annotation.k0;
import android.os.Looper;
import android.app.Activity;
import java.util.concurrent.ExecutorService;
import android.content.Context;
import android.os.Handler;

class e extends d
{
    private volatile int a;
    private final String b;
    private final Handler c;
    private volatile o0 d;
    private Context e;
    private Context f;
    private volatile com.google.android.gms.internal.play_billing.d g;
    private volatile x h;
    private boolean i;
    private boolean j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private ExecutorService u;
    
    private e(final Activity activity, final boolean b, final String s) {
        this(activity.getApplicationContext(), b, new zzah(), s, null);
    }
    
    @androidx.annotation.d
    private e(final Context context, final boolean b, final o o, final String b2, final String s) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.k = 0;
        this.b = b2;
        this.o(context, o, b);
    }
    
    private e(final String b) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.k = 0;
        this.b = b;
    }
    
    @androidx.annotation.d
    e(@k0 String s, final boolean b, final Context context, final o o) {
        try {
            s = (String)Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        }
        catch (Exception ex) {
            s = "4.0.0";
        }
        this(context, b, o, s, null);
    }
    
    private final void A(final h h, final k k) {
        if (Thread.interrupted()) {
            return;
        }
        this.c.post((Runnable)new z0(k, h));
    }
    
    private void o(final Context e, final o o, final boolean t) {
        final Context applicationContext = e.getApplicationContext();
        this.f = applicationContext;
        this.d = new o0(applicationContext, o);
        this.e = e;
        this.t = t;
    }
    
    private int p(final Activity activity, final g g) {
        return this.g(activity, g).b();
    }
    
    private void q(final Activity activity, final l l, final long n) {
        this.h(activity, l, new zzah(n));
    }
    
    private void r(final long n) {
        final zzah zzah = new zzah(n);
        if (this.f()) {
            com.google.android.gms.internal.play_billing.a.j("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzah.f(b0.p);
            return;
        }
        if (this.a == 1) {
            com.google.android.gms.internal.play_billing.a.k("BillingClient", "Client is already in the process of connecting to billing service.");
            zzah.f(b0.d);
            return;
        }
        if (this.a == 3) {
            com.google.android.gms.internal.play_billing.a.k("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzah.f(b0.q);
            return;
        }
        this.a = 1;
        this.d.d();
        com.google.android.gms.internal.play_billing.a.j("BillingClient", "Starting in-app billing setup.");
        this.h = new x(this, zzah, null);
        final Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        final List queryIntentServices = this.f.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            final ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                final String packageName = serviceInfo.packageName;
                final String name = serviceInfo.name;
                String s;
                if ("com.android.vending".equals(packageName) && name != null) {
                    final ComponentName component = new ComponentName(packageName, name);
                    final Intent intent2 = new Intent(intent);
                    intent2.setComponent(component);
                    intent2.putExtra("playBillingLibraryVersion", this.b);
                    if (this.f.bindService(intent2, (ServiceConnection)this.h, 1)) {
                        com.google.android.gms.internal.play_billing.a.j("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    s = "Connection to Billing service is blocked.";
                }
                else {
                    s = "The device doesn't have valid Play Store.";
                }
                com.google.android.gms.internal.play_billing.a.k("BillingClient", s);
            }
        }
        this.a = 0;
        com.google.android.gms.internal.play_billing.a.j("BillingClient", "Billing service unavailable on device.");
        zzah.f(b0.c);
    }
    
    private final Handler v() {
        Handler c;
        if (Looper.myLooper() == null) {
            c = this.c;
        }
        else {
            c = new Handler(Looper.myLooper());
        }
        return c;
    }
    
    private final h w(final h h) {
        if (Thread.interrupted()) {
            return h;
        }
        this.c.post((Runnable)new x0(this, h));
        return h;
    }
    
    private final h x() {
        h h;
        if (this.a != 0 && this.a != 3) {
            h = b0.l;
        }
        else {
            h = b0.q;
        }
        return h;
    }
    
    private final h y(final String s) {
        final Future<Integer> z = this.z((Callable<Integer>)new u0(this, s), 5000L, null, this.v());
        try {
            h h;
            if (z.get(5000L, TimeUnit.MILLISECONDS) == 0) {
                h = b0.p;
            }
            else {
                h = b0.i;
            }
            return h;
        }
        catch (Exception ex) {
            com.google.android.gms.internal.play_billing.a.k("BillingClient", "Exception while checking if billing is supported; try to reconnect");
            return b0.q;
        }
    }
    
    @k0
    private final <T> Future<T> z(final Callable<T> callable, long n, @k0 final Runnable runnable, final Handler handler) {
        n *= (long)0.95;
        if (this.u == null) {
            this.u = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.a.a, new u(this));
        }
        try {
            final Future<T> submit = this.u.submit(callable);
            handler.postDelayed((Runnable)new d1(submit, runnable), n);
            return submit;
        }
        catch (Exception obj) {
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 28);
            sb.append("Async task throws exception ");
            sb.append(value);
            com.google.android.gms.internal.play_billing.a.k("BillingClient", sb.toString());
            return null;
        }
    }
    
    @Override
    public final void a(final com.android.billingclient.api.b b, final com.android.billingclient.api.c c) {
        h h;
        if (!this.f()) {
            h = b0.q;
        }
        else if (TextUtils.isEmpty((CharSequence)b.a())) {
            com.google.android.gms.internal.play_billing.a.k("BillingClient", "Please provide a valid purchase token.");
            h = b0.k;
        }
        else if (!this.n) {
            h = b0.b;
        }
        else {
            if (this.z((Callable<Object>)new r0(this, b, c), 30000L, new q0(c), this.v()) != null) {
                return;
            }
            h = this.x();
        }
        c.d(h);
    }
    
    @Override
    public final void b(final i i, final j j) {
        h h;
        if (!this.f()) {
            h = b0.q;
        }
        else {
            if (this.z((Callable<Object>)new s0(this, i, j), 30000L, new y0(j, i), this.v()) != null) {
                return;
            }
            h = this.x();
        }
        j.i(h, i.a());
    }
    
    @Override
    public final void c() {
        try {
            try {
                this.e = null;
                this.d.c();
                if (this.h != null) {
                    this.h.c();
                }
                if (this.h != null && this.g != null) {
                    com.google.android.gms.internal.play_billing.a.j("BillingClient", "Unbinding from service.");
                    this.f.unbindService((ServiceConnection)this.h);
                    this.h = null;
                }
                this.g = null;
                final ExecutorService u = this.u;
                if (u != null) {
                    u.shutdownNow();
                    this.u = null;
                }
                this.a = 3;
                return;
            }
            finally {}
        }
        catch (Exception obj) {
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 48);
            sb.append("There was an exception while ending connection: ");
            sb.append(value);
            com.google.android.gms.internal.play_billing.a.k("BillingClient", sb.toString());
            this.a = 3;
            return;
        }
        this.a = 3;
    }
    
    @Override
    public final int d() {
        return this.a;
    }
    
    @Override
    public final h e(String concat) {
        if (!this.f()) {
            return b0.q;
        }
        int n = 0;
        Label_0263: {
            switch (((String)concat).hashCode()) {
                case 1987365622: {
                    if (((String)concat).equals("subscriptions")) {
                        n = 0;
                        break Label_0263;
                    }
                    break;
                }
                case 1219490065: {
                    if (((String)concat).equals("subscriptionsOnVr")) {
                        n = 3;
                        break Label_0263;
                    }
                    break;
                }
                case 292218239: {
                    if (((String)concat).equals("inAppItemsOnVr")) {
                        n = 2;
                        break Label_0263;
                    }
                    break;
                }
                case 207616302: {
                    if (((String)concat).equals("priceChangeConfirmation")) {
                        n = 4;
                        break Label_0263;
                    }
                    break;
                }
                case 100293: {
                    if (((String)concat).equals("eee")) {
                        n = 9;
                        break Label_0263;
                    }
                    break;
                }
                case 99300: {
                    if (((String)concat).equals("ddd")) {
                        n = 7;
                        break Label_0263;
                    }
                    break;
                }
                case 98307: {
                    if (((String)concat).equals("ccc")) {
                        n = 8;
                        break Label_0263;
                    }
                    break;
                }
                case 97314: {
                    if (((String)concat).equals("bbb")) {
                        n = 5;
                        break Label_0263;
                    }
                    break;
                }
                case 96321: {
                    if (((String)concat).equals("aaa")) {
                        n = 6;
                        break Label_0263;
                    }
                    break;
                }
                case -422092961: {
                    if (((String)concat).equals("subscriptionsUpdate")) {
                        n = 1;
                        break Label_0263;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                if (((String)concat).length() != 0) {
                    concat = "Unsupported feature: ".concat((String)concat);
                }
                else {
                    concat = new String("Unsupported feature: ");
                }
                com.google.android.gms.internal.play_billing.a.k("BillingClient", (String)concat);
                return b0.v;
            }
            case 8:
            case 9: {
                h h;
                if (this.s) {
                    h = b0.p;
                }
                else {
                    h = b0.i;
                }
                return h;
            }
            case 7: {
                h h2;
                if (this.q) {
                    h2 = b0.p;
                }
                else {
                    h2 = b0.i;
                }
                return h2;
            }
            case 6: {
                h h3;
                if (this.r) {
                    h3 = b0.p;
                }
                else {
                    h3 = b0.i;
                }
                return h3;
            }
            case 5: {
                h h4;
                if (this.p) {
                    h4 = b0.p;
                }
                else {
                    h4 = b0.i;
                }
                return h4;
            }
            case 4: {
                h h5;
                if (this.m) {
                    h5 = b0.p;
                }
                else {
                    h5 = b0.i;
                }
                return h5;
            }
            case 3: {
                return this.y("subs");
            }
            case 2: {
                return this.y("inapp");
            }
            case 1: {
                h h6;
                if (this.j) {
                    h6 = b0.p;
                }
                else {
                    h6 = b0.i;
                }
                return h6;
            }
            case 0: {
                h h7;
                if (this.i) {
                    h7 = b0.p;
                }
                else {
                    h7 = b0.i;
                }
                return h7;
            }
        }
    }
    
    @Override
    public final boolean f() {
        return this.a == 2 && this.g != null && this.h != null;
    }
    
    @Override
    public final h g(final Activity activity, final g g) {
        String s = "BUY_INTENT";
        h h = null;
        Label_0015: {
            if (this.f()) {
                final ArrayList<SkuDetails> l = g.l();
                final SkuDetails skuDetails = l.get(0);
                final String q = skuDetails.q();
                if (q.equals("subs") && !this.i) {
                    com.google.android.gms.internal.play_billing.a.k("BillingClient", "Current client doesn't support subscriptions.");
                    h = b0.s;
                    break Label_0015;
                }
                if (g.o() && !this.l) {
                    com.google.android.gms.internal.play_billing.a.k("BillingClient", "Current client doesn't support extra params for buy intent.");
                    h = b0.h;
                    break Label_0015;
                }
                if (l.size() > 1 && !this.s) {
                    com.google.android.gms.internal.play_billing.a.k("BillingClient", "Current client doesn't support multi-item purchases.");
                    h = b0.u;
                    break Label_0015;
                }
                String str = "";
                for (int i = 0; i < l.size(); ++i) {
                    final String value = String.valueOf(str);
                    final String value2 = String.valueOf(l.get(i));
                    final StringBuilder sb = new StringBuilder(value.length() + value2.length());
                    sb.append(value);
                    sb.append(value2);
                    final String obj = str = sb.toString();
                    if (i < l.size() - 1) {
                        str = String.valueOf(obj).concat(", ");
                    }
                }
                final StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 41 + q.length());
                sb2.append("Constructing buy intent for ");
                sb2.append(str);
                sb2.append(", item type: ");
                sb2.append(q);
                com.google.android.gms.internal.play_billing.a.j("BillingClient", sb2.toString());
                Callable callable;
                Handler handler;
                if (this.l) {
                    final Bundle e = com.google.android.gms.internal.play_billing.a.e(g, this.n, this.t, this.b);
                    final ArrayList<String> list = new ArrayList<String>();
                    final ArrayList<String> list2 = new ArrayList<String>();
                    final ArrayList<String> list3 = new ArrayList<String>();
                    final ArrayList<Integer> list4 = new ArrayList<Integer>();
                    final ArrayList<String> list5 = new ArrayList<String>();
                    final int size = l.size();
                    int j = 0;
                    boolean b = false;
                    boolean b2 = false;
                    boolean b3 = false;
                    boolean b4 = false;
                    while (j < size) {
                        final SkuDetails skuDetails2 = l.get(j);
                        if (!skuDetails2.v().isEmpty()) {
                            list.add(skuDetails2.v());
                        }
                        final String h2 = skuDetails2.h();
                        String optString;
                        try {
                            optString = new JSONObject(h2).optString("offer_id_token");
                        }
                        catch (JSONException ex) {
                            optString = "";
                        }
                        final String s2 = skuDetails2.s();
                        final int r = skuDetails2.r();
                        final String u = skuDetails2.u();
                        list2.add(optString);
                        b |= (TextUtils.isEmpty((CharSequence)optString) ^ true);
                        list3.add(s2);
                        final boolean b5 = b2 | (TextUtils.isEmpty((CharSequence)s2) ^ true);
                        list4.add(r);
                        b3 |= (r != 0);
                        b4 |= (TextUtils.isEmpty((CharSequence)u) ^ true);
                        list5.add(u);
                        ++j;
                        b2 = b5;
                    }
                    if (!list.isEmpty()) {
                        e.putStringArrayList("skuDetailsTokens", (ArrayList)list);
                    }
                    if (b) {
                        if (!this.q) {
                            h = b0.i;
                            break Label_0015;
                        }
                        e.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", (ArrayList)list2);
                    }
                    if (b2) {
                        e.putStringArrayList("SKU_OFFER_ID_LIST", (ArrayList)list3);
                    }
                    if (b3) {
                        e.putIntegerArrayList("SKU_OFFER_TYPE_LIST", (ArrayList)list4);
                    }
                    if (b4) {
                        e.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", (ArrayList)list5);
                    }
                    boolean b6;
                    if (!TextUtils.isEmpty((CharSequence)skuDetails.t())) {
                        e.putString("skuPackageName", skuDetails.t());
                        b6 = true;
                    }
                    else {
                        b6 = false;
                    }
                    if (!TextUtils.isEmpty((CharSequence)null)) {
                        e.putString("accountName", (String)null);
                    }
                    final int size2 = l.size();
                    int k = 1;
                    if (size2 > 1) {
                        final ArrayList list6 = new ArrayList<String>(l.size() - 1);
                        final ArrayList list7 = new ArrayList<String>(l.size() - 1);
                        while (k < l.size()) {
                            list6.add(l.get(k).n());
                            list7.add(l.get(k).q());
                            ++k;
                        }
                        e.putStringArrayList("additionalSkus", list6);
                        e.putStringArrayList("additionalSkuTypes", list7);
                    }
                    if (!TextUtils.isEmpty((CharSequence)activity.getIntent().getStringExtra("PROXY_PACKAGE"))) {
                        final String stringExtra = activity.getIntent().getStringExtra("PROXY_PACKAGE");
                        e.putString("proxyPackage", stringExtra);
                        try {
                            e.putString("proxyPackageVersion", this.f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        }
                        catch (PackageManager$NameNotFoundException ex2) {
                            e.putString("proxyPackageVersion", "package not found");
                        }
                    }
                    int n;
                    if (this.r && b6) {
                        n = 15;
                    }
                    else if (this.n) {
                        n = 9;
                    }
                    else if (g.a()) {
                        n = 7;
                    }
                    else {
                        n = 6;
                    }
                    callable = new e1(this, n, skuDetails, q, g, e);
                    handler = this.c;
                }
                else {
                    s = "BUY_INTENT";
                    callable = new t0(this, skuDetails, q);
                    handler = this.c;
                }
                final Future<Bundle> z = this.z((Callable<Bundle>)callable, 5000L, null, handler);
                try {
                    final Bundle bundle = z.get(5000L, TimeUnit.MILLISECONDS);
                    final int a = com.google.android.gms.internal.play_billing.a.a(bundle, "BillingClient");
                    final String h3 = com.google.android.gms.internal.play_billing.a.h(bundle, "BillingClient");
                    if (a != 0) {
                        final StringBuilder sb3 = new StringBuilder(52);
                        sb3.append("Unable to buy item, Error response code: ");
                        sb3.append(a);
                        com.google.android.gms.internal.play_billing.a.k("BillingClient", sb3.toString());
                        final h.a c = com.android.billingclient.api.h.c();
                        c.c(a);
                        c.b(h3);
                        final h a2 = c.a();
                        this.w(a2);
                        return a2;
                    }
                    final Intent intent = new Intent((Context)activity, (Class)ProxyBillingActivity.class);
                    intent.putExtra(s, (Parcelable)bundle.getParcelable(s));
                    activity.startActivity(intent);
                    return b0.p;
                }
                catch (Exception ex3) {
                    final StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 69);
                    sb4.append("Exception while launching billing flow: ; for sku: ");
                    sb4.append(str);
                    sb4.append("; try to reconnect");
                    com.google.android.gms.internal.play_billing.a.k("BillingClient", sb4.toString());
                }
                catch (TimeoutException | CancellationException ex4) {
                    final StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 68);
                    sb5.append("Time out while launching billing flow: ; for sku: ");
                    sb5.append(str);
                    sb5.append("; try to reconnect");
                    com.google.android.gms.internal.play_billing.a.k("BillingClient", sb5.toString());
                    h = b0.r;
                    break Label_0015;
                }
            }
            h = b0.q;
        }
        this.w(h);
        return h;
    }
    
    @Override
    public final void h(final Activity activity, l n, final k k) {
        h h = null;
        Label_0011: {
            if (this.f()) {
                if (n != null) {
                    if (n.a() != null) {
                        n = (l)n.a().n();
                        if (n != null) {
                            if (!this.m) {
                                com.google.android.gms.internal.play_billing.a.k("BillingClient", "Current client doesn't support price change confirmation flow.");
                                h = b0.i;
                                break Label_0011;
                            }
                            final Bundle bundle = new Bundle();
                            bundle.putString("playBillingLibraryVersion", this.b);
                            bundle.putBoolean("subs_price_change", true);
                            final Future<Bundle> z = this.z((Callable<Bundle>)new v0(this, (String)n, bundle), 5000L, null, this.c);
                            try {
                                try {
                                    final Bundle bundle2 = z.get(5000L, TimeUnit.MILLISECONDS);
                                    final int a = com.google.android.gms.internal.play_billing.a.a(bundle2, "BillingClient");
                                    final String h2 = com.google.android.gms.internal.play_billing.a.h(bundle2, "BillingClient");
                                    final h.a c = com.android.billingclient.api.h.c();
                                    c.c(a);
                                    c.b(h2);
                                    final h a2 = c.a();
                                    if (a != 0) {
                                        final StringBuilder sb = new StringBuilder(68);
                                        sb.append("Unable to launch price change flow, error response code: ");
                                        sb.append(a);
                                        com.google.android.gms.internal.play_billing.a.k("BillingClient", sb.toString());
                                        this.A(a2, k);
                                        return;
                                    }
                                    final f1 f1 = new f1(this, this.c, k);
                                    final Intent intent = new Intent((Context)activity, (Class)ProxyBillingActivity.class);
                                    intent.putExtra("SUBS_MANAGEMENT_INTENT", (Parcelable)bundle2.getParcelable("SUBS_MANAGEMENT_INTENT"));
                                    intent.putExtra("result_receiver", (Parcelable)f1);
                                    activity.startActivity(intent);
                                    return;
                                }
                                catch (Exception ex) {
                                    final StringBuilder sb2 = new StringBuilder(((String)n).length() + 78);
                                    sb2.append("Exception caught while launching Price Change Flow for sku: ");
                                    sb2.append((String)n);
                                    sb2.append("; try to reconnect");
                                    com.google.android.gms.internal.play_billing.a.k("BillingClient", sb2.toString());
                                }
                                catch (CancellationException ex2) {
                                    final StringBuilder sb3 = new StringBuilder(((String)n).length() + 70);
                                    sb3.append("Time out while launching Price Change Flow for sku: ");
                                    sb3.append((String)n);
                                    sb3.append("; try to reconnect");
                                    com.google.android.gms.internal.play_billing.a.k("BillingClient", sb3.toString());
                                    h = b0.r;
                                }
                            }
                            catch (TimeoutException ex3) {}
                        }
                    }
                }
                com.google.android.gms.internal.play_billing.a.k("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
                h = b0.n;
                break Label_0011;
            }
            h = b0.q;
        }
        this.A(h, k);
    }
    
    @Override
    public final void j(final String s, final m m) {
        h h;
        if (!this.f()) {
            h = b0.q;
        }
        else {
            if (this.z((Callable<Object>)new t(this, s, m), 30000L, new a1(m), this.v()) != null) {
                return;
            }
            h = this.x();
        }
        m.e(h, null);
    }
    
    @Override
    public final Purchase.b k(final String s) {
        if (!this.f()) {
            return new Purchase.b(b0.q, null);
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            com.google.android.gms.internal.play_billing.a.k("BillingClient", "Please provide a valid SKU type.");
            return new Purchase.b(b0.g, null);
        }
        final Future<Purchase.b> z = this.z((Callable<Purchase.b>)new g1(this, s), 5000L, null, this.c);
        try {
            return z.get(5000L, TimeUnit.MILLISECONDS);
        }
        catch (Exception ex) {
            return new Purchase.b(b0.l, null);
        }
        catch (TimeoutException | CancellationException ex2) {
            return new Purchase.b(b0.r, null);
        }
    }
    
    @l0
    @Override
    public void l(final String s, final n n) {
        h h;
        if (!this.f()) {
            h = b0.q;
        }
        else if (TextUtils.isEmpty((CharSequence)s)) {
            com.google.android.gms.internal.play_billing.a.k("BillingClient", "Please provide a valid SKU type.");
            h = b0.g;
        }
        else {
            if (this.z((Callable<Object>)new s(this, s, n), 30000L, new b1(n), this.v()) != null) {
                return;
            }
            h = this.x();
        }
        n.a(h, (List<Purchase>)com.google.android.gms.internal.play_billing.p.m());
    }
    
    @Override
    public final void m(final com.android.billingclient.api.p p2, final q q) {
        h h;
        if (!this.f()) {
            h = b0.q;
        }
        else {
            final String a = p2.a();
            final List<String> b = p2.b();
            if (TextUtils.isEmpty((CharSequence)a)) {
                com.google.android.gms.internal.play_billing.a.k("BillingClient", "Please fix the input params. SKU type can't be empty.");
                h = b0.g;
            }
            else if (b != null) {
                final ArrayList<h0> list = new ArrayList<h0>();
                for (final String s : b) {
                    final g0 g0 = new g0(null);
                    g0.a(s);
                    list.add(g0.b());
                }
                if (this.z((Callable<Object>)new w0(this, a, list, null, q), 30000L, new c1(q), this.v()) != null) {
                    return;
                }
                h = this.x();
            }
            else {
                com.google.android.gms.internal.play_billing.a.k("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
                h = b0.f;
            }
        }
        q.b(h, null);
    }
    
    @Override
    public final void n(final f f) {
        if (this.f()) {
            com.google.android.gms.internal.play_billing.a.j("BillingClient", "Service connection is valid. No need to re-initialize.");
            f.f(b0.p);
            return;
        }
        if (this.a == 1) {
            com.google.android.gms.internal.play_billing.a.k("BillingClient", "Client is already in the process of connecting to billing service.");
            f.f(b0.d);
            return;
        }
        if (this.a == 3) {
            com.google.android.gms.internal.play_billing.a.k("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            f.f(b0.q);
            return;
        }
        this.a = 1;
        this.d.d();
        com.google.android.gms.internal.play_billing.a.j("BillingClient", "Starting in-app billing setup.");
        this.h = new x(this, f, null);
        final Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        final List queryIntentServices = this.f.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            final ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                final String packageName = serviceInfo.packageName;
                final String name = serviceInfo.name;
                String s;
                if ("com.android.vending".equals(packageName) && name != null) {
                    final ComponentName component = new ComponentName(packageName, name);
                    final Intent intent2 = new Intent(intent);
                    intent2.setComponent(component);
                    intent2.putExtra("playBillingLibraryVersion", this.b);
                    if (this.f.bindService(intent2, (ServiceConnection)this.h, 1)) {
                        com.google.android.gms.internal.play_billing.a.j("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    s = "Connection to Billing service is blocked.";
                }
                else {
                    s = "The device doesn't have valid Play Store.";
                }
                com.google.android.gms.internal.play_billing.a.k("BillingClient", s);
            }
        }
        this.a = 0;
        com.google.android.gms.internal.play_billing.a.j("BillingClient", "Billing service unavailable on device.");
        f.f(b0.c);
    }
}
