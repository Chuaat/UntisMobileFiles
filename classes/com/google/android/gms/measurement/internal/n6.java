// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.x;
import android.os.Bundle;

final class n6 implements Runnable
{
    final /* synthetic */ Bundle G;
    final /* synthetic */ e7 H;
    
    n6(final e7 h, final Bundle g) {
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
        final String string = g.getString("name");
        final String string2 = g.getString("origin");
        x.g(string);
        x.g(string2);
        x.k(g.get("value"));
        if (!h.a.l()) {
            h.a.c().s().a("Conditional property not set since app measurement is disabled");
            return;
        }
        final ca ca = new ca(string, g.getLong("triggered_timestamp"), g.get("value"), string2);
        try {
            h.a.J().p(new c(g.getString("app_id"), string2, ca, g.getLong("creation_timestamp"), false, g.getString("trigger_event_name"), h.a.M().w0(g.getString("app_id"), g.getString("timed_out_event_name"), g.getBundle("timed_out_event_params"), string2, 0L, true, true), g.getLong("trigger_timeout"), h.a.M().w0(g.getString("app_id"), g.getString("triggered_event_name"), g.getBundle("triggered_event_params"), string2, 0L, true, true), g.getLong("time_to_live"), h.a.M().w0(g.getString("app_id"), g.getString("expired_event_name"), g.getBundle("expired_event_params"), string2, 0L, true, true)));
        }
        catch (IllegalArgumentException ex) {}
    }
}
