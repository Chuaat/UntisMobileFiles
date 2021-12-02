// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.x;
import android.os.Bundle;

final class o6 implements Runnable
{
    final /* synthetic */ Bundle G;
    final /* synthetic */ e7 H;
    
    o6(final e7 h, final Bundle g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        final e7 h = this.H;
        final Bundle g = this.G;
        h.e();
        h.f();
        x.k(g);
        x.g(g.getString("name"));
        Label_0293: {
            if (!h.a.l()) {
                break Label_0293;
            }
            final g w = h.a.w();
            final z2<Boolean> r0 = a3.r0;
            ca ca;
            if (w.y(null, r0)) {
                ca = new ca(g.getString("name"), 0L, null, "");
            }
            else {
                ca = new ca(g.getString("name"), 0L, null, null);
            }
            try {
                final ga m = h.a.M();
                final String string = g.getString("app_id");
                final String string2 = g.getString("expired_event_name");
                final Bundle bundle = g.getBundle("expired_event_params");
                String string3;
                if (h.a.w().y(null, r0)) {
                    string3 = "";
                }
                else {
                    string3 = g.getString("origin");
                }
                final u w2 = m.w0(string, string2, bundle, string3, g.getLong("creation_timestamp"), true, true);
                final String string4 = g.getString("app_id");
                String string5;
                if (h.a.w().y(null, r0)) {
                    string5 = "";
                }
                else {
                    string5 = g.getString("origin");
                }
                h.a.J().p(new c(string4, string5, ca, g.getLong("creation_timestamp"), g.getBoolean("active"), g.getString("trigger_event_name"), null, g.getLong("trigger_timeout"), null, g.getLong("time_to_live"), w2));
                return;
                h.a.c().s().a("Conditional property not cleared since app measurement is disabled");
            }
            catch (IllegalArgumentException ex) {}
        }
    }
}
