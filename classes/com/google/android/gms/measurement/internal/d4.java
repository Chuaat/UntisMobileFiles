// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.stats.a;
import android.net.Uri;
import android.os.Bundle;
import android.content.ServiceConnection;
import com.google.android.gms.internal.measurement.t0;

final class d4 implements Runnable
{
    final /* synthetic */ t0 G;
    final /* synthetic */ ServiceConnection H;
    final /* synthetic */ e4 I;
    
    d4(final e4 i, final t0 g, final ServiceConnection h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        final e4 i = this.I;
        final g4 d = i.d;
        final String a = e4.a(i);
        final t0 g = this.G;
        final ServiceConnection h = this.H;
        d.a.b().e();
        final Bundle bundle = new Bundle();
        bundle.putString("package_name", a);
        Bundle bundle2 = null;
        try {
            final Bundle g2 = g.G(bundle);
            if (g2 == null) {
                d.a.c().o().a("Install Referrer Service returned a null response");
            }
            else {
                bundle2 = g2;
            }
        }
        catch (Exception ex) {
            d.a.c().o().b("Exception occurred while retrieving the Install Referrer", ex.getMessage());
        }
        d.a.b().e();
        z4.q();
        Label_0502: {
            if (bundle2 != null) {
                final long n = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000L;
                l3 l3 = null;
                String s = null;
                Label_0173: {
                    if (n == 0L) {
                        l3 = d.a.c().t();
                        s = "Service response is missing Install Referrer install timestamp";
                    }
                    else {
                        final String string = bundle2.getString("install_referrer");
                        if (string != null && !string.isEmpty()) {
                            d.a.c().s().b("InstallReferrer API result", string);
                            final ga m = d.a.M();
                            String concat;
                            if (string.length() != 0) {
                                concat = "?".concat(string);
                            }
                            else {
                                concat = new String("?");
                            }
                            final Bundle t0 = m.t0(Uri.parse(concat));
                            if (t0 == null) {
                                l3 = d.a.c().o();
                                s = "No campaign params defined in Install Referrer result";
                            }
                            else {
                                final String string2 = t0.getString("medium");
                                if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                    final long n2 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000L;
                                    if (n2 == 0L) {
                                        l3 = d.a.c().o();
                                        s = "Install Referrer is missing click timestamp for ad campaign";
                                        break Label_0173;
                                    }
                                    t0.putLong("click_timestamp", n2);
                                }
                                if (n == d.a.C().f.a()) {
                                    d.a.c().s().a("Logging Install Referrer campaign from module while it may have already been logged.");
                                }
                                if (d.a.l()) {
                                    d.a.C().f.b(n);
                                    d.a.c().s().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                    t0.putString("_cis", "referrer API v2");
                                    d.a.G().p("auto", "_cmp", t0, a);
                                }
                                break Label_0502;
                            }
                        }
                        else {
                            l3 = d.a.c().o();
                            s = "No referrer defined in Install Referrer response";
                        }
                    }
                }
                l3.a(s);
            }
        }
        com.google.android.gms.common.stats.a.b().c(d.a.X(), h);
    }
}
