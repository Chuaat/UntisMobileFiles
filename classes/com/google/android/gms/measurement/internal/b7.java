// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import android.net.Uri;

final class b7 implements Runnable
{
    final /* synthetic */ boolean G;
    final /* synthetic */ Uri H;
    final /* synthetic */ String I;
    final /* synthetic */ String J;
    final /* synthetic */ d7 K;
    
    b7(final d7 k, final boolean g, final Uri h, final String i, final String j) {
        this.K = k;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final void run() {
        final d7 k = this.K;
        final boolean g = this.G;
        final Uri h = this.H;
        final String i = this.I;
        final String j = this.J;
        k.G.e();
        try {
            final ga m = k.G.a.M();
            Bundle t0 = null;
            Label_0188: {
                if (!TextUtils.isEmpty((CharSequence)j)) {
                    if (!j.contains("gclid") && !j.contains("utm_campaign") && !j.contains("utm_source") && !j.contains("utm_medium")) {
                        m.a.c().n().a("Activity created with data 'referrer' without required params");
                    }
                    else {
                        String concat;
                        if (j.length() != 0) {
                            concat = "https://google.com/search?".concat(j);
                        }
                        else {
                            concat = new String("https://google.com/search?");
                        }
                        final Bundle bundle = t0 = m.t0(Uri.parse(concat));
                        if (bundle != null) {
                            bundle.putString("_cis", "referrer");
                            t0 = bundle;
                        }
                        break Label_0188;
                    }
                }
                t0 = null;
            }
            if (g) {
                final Bundle t2 = k.G.a.M().t0(h);
                if (t2 != null) {
                    t2.putString("_cis", "intent");
                    if (!t2.containsKey("gclid") && t0 != null && t0.containsKey("gclid")) {
                        t2.putString("_cer", String.format("gclid=%s", t0.getString("gclid")));
                    }
                    k.G.q(i, "_cmp", t2);
                    k.G.n.a(i, t2);
                }
            }
            if (!TextUtils.isEmpty((CharSequence)j)) {
                k.G.a.c().n().b("Activity created with referrer", j);
                if (k.G.a.w().y(null, a3.c0)) {
                    if (t0 != null) {
                        k.G.q(i, "_cmp", t0);
                        k.G.n.a(i, t0);
                    }
                    else {
                        k.G.a.c().n().b("Referrer does not contain valid parameters", j);
                    }
                    k.G.H("auto", "_ldl", null, true);
                    return;
                }
                if (!j.contains("gclid") || (!j.contains("utm_campaign") && !j.contains("utm_source") && !j.contains("utm_medium") && !j.contains("utm_term") && !j.contains("utm_content"))) {
                    k.G.a.c().n().a("Activity created with data 'referrer' without required params");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence)j)) {
                    k.G.H("auto", "_ldl", j, true);
                }
            }
        }
        catch (RuntimeException ex) {
            k.G.a.c().o().b("Throwable caught in handleReferrerForOnActivityCreated", ex);
        }
    }
}
