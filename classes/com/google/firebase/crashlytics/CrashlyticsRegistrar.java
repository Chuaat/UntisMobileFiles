// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics;

import java.util.Arrays;
import com.google.firebase.platforminfo.h;
import com.google.firebase.components.t;
import com.google.firebase.components.f;
import java.util.List;
import com.google.firebase.crashlytics.internal.a;
import com.google.firebase.installations.j;
import com.google.firebase.e;
import com.google.firebase.components.g;
import com.google.firebase.components.k;

public class CrashlyticsRegistrar implements k
{
    private i b(final g g) {
        return i.e(g.a(e.class), g.a(j.class), g.f(a.class), g.f(com.google.firebase.analytics.connector.a.class));
    }
    
    @Override
    public List<f<?>> getComponents() {
        return Arrays.asList(f.d(i.class).b(t.j(e.class)).b(t.j(j.class)).b(t.a(a.class)).b(t.a(com.google.firebase.analytics.connector.a.class)).f((com.google.firebase.components.j<?>)new com.google.firebase.crashlytics.g(this)).e().d(), h.b("fire-cls", "18.2.1"));
    }
}
