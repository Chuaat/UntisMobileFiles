// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics.connector.internal;

import java.util.Iterator;
import java.util.Collection;
import com.google.android.gms.common.internal.x;
import java.util.HashSet;
import java.util.Set;

public final class e implements a
{
    final Set<String> a;
    private final com.google.firebase.analytics.connector.a.b b;
    private final j2.a c;
    private final d d;
    
    public e(final j2.a c, final com.google.firebase.analytics.connector.a.b b) {
        this.b = b;
        (this.c = c).s((j2.a.c)(this.d = new d(this)));
        this.a = new HashSet<String>();
    }
    
    @Override
    public final void a() {
        this.a.clear();
    }
    
    @Override
    public final void b(final Set<String> set) {
        this.a.clear();
        final Set<String> a = this.a;
        final HashSet<String> set2 = new HashSet<String>();
        for (final String s : set) {
            if (set2.size() >= 50) {
                break;
            }
            if (!com.google.firebase.analytics.connector.internal.c.f(s) || !com.google.firebase.analytics.connector.internal.c.g(s)) {
                continue;
            }
            final String d = com.google.firebase.analytics.connector.internal.c.d(s);
            x.k(d);
            set2.add(d);
        }
        a.addAll(set2);
    }
    
    @Override
    public final com.google.firebase.analytics.connector.a.b zza() {
        return this.b;
    }
}
