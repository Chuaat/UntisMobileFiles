// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;

public final class p
{
    final String a;
    final String b;
    final String c;
    final long d;
    final long e;
    final s f;
    
    p(final z4 z4, final String s, final String a, String s2, final long d, final long e, final Bundle bundle) {
        x.g(a);
        x.g(s2);
        this.a = a;
        this.b = s2;
        s2 = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            s2 = null;
        }
        this.c = s2;
        this.d = d;
        this.e = e;
        if (e != 0L && e > d) {
            z4.c().t().b("Event created with reverse previous/current timestamps. appId", n3.w(a));
        }
        s f;
        if (bundle != null && !bundle.isEmpty()) {
            final Bundle bundle2 = new Bundle(bundle);
            final Iterator iterator = bundle2.keySet().iterator();
            while (iterator.hasNext()) {
                final String s3 = iterator.next();
                if (s3 == null) {
                    z4.c().o().a("Param name can't be null");
                }
                else {
                    final Object l = z4.M().l(s3, bundle2.get(s3));
                    if (l != null) {
                        z4.M().y(bundle2, s3, l);
                        continue;
                    }
                    z4.c().t().b("Param value can't be null", z4.A().o(s3));
                }
                iterator.remove();
            }
            f = new s(bundle2);
        }
        else {
            f = new s(new Bundle());
        }
        this.f = f;
    }
    
    private p(final z4 z4, final String s, final String a, final String b, final long d, final long e, final s f) {
        x.g(a);
        x.g(b);
        x.k(f);
        this.a = a;
        this.b = b;
        String c = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            c = null;
        }
        this.c = c;
        this.d = d;
        this.e = e;
        if (e != 0L && e > d) {
            z4.c().t().c("Event created with reverse previous/current timestamps. appId, name", n3.w(a), n3.w(b));
        }
        this.f = f;
    }
    
    final p a(final z4 z4, final long n) {
        return new p(z4, this.c, this.a, this.b, this.d, n, this.f);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String value = String.valueOf(this.f);
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 33 + String.valueOf(b).length() + value.length());
        sb.append("Event{appId='");
        sb.append(a);
        sb.append("', name='");
        sb.append(b);
        sb.append("', params=");
        sb.append(value);
        sb.append('}');
        return sb.toString();
    }
}
