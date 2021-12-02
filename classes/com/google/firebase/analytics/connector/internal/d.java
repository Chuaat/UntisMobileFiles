// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import j2.a;

final class d implements c
{
    final /* synthetic */ e a;
    
    public d(final e a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s, final String s2, final Bundle bundle, final long n) {
        if (!this.a.a.contains(s2)) {
            return;
        }
        final Bundle bundle2 = new Bundle();
        bundle2.putString("events", com.google.firebase.analytics.connector.internal.c.c(s2));
        e.c(this.a).a(2, bundle2);
    }
}
