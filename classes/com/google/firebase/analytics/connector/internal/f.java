// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import j2.a;

final class f implements c
{
    final /* synthetic */ g a;
    
    public f(final g a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s, final String s2, final Bundle bundle, final long n) {
        if (s != null && !s.equals("crash") && com.google.firebase.analytics.connector.internal.c.k(s2)) {
            final Bundle bundle2 = new Bundle();
            bundle2.putString("name", s2);
            bundle2.putLong("timestampInMillis", n);
            bundle2.putBundle("params", bundle);
            g.c(this.a).a(3, bundle2);
        }
    }
}
