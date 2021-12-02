// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.security.MessageDigest;
import java.math.BigInteger;
import java.util.Locale;
import androidx.annotation.c1;
import com.google.android.gms.ads.identifier.a;
import android.util.Pair;

public final class v8 extends p9
{
    private String d;
    private boolean e;
    private long f;
    public final y3 g;
    public final y3 h;
    public final y3 i;
    public final y3 j;
    public final y3 k;
    
    v8(final z9 z9) {
        super(z9);
        final c4 c = super.a.C();
        c.getClass();
        this.g = new y3(c, "last_delete_stale", 0L);
        final c4 c2 = super.a.C();
        c2.getClass();
        this.h = new y3(c2, "backoff", 0L);
        final c4 c3 = super.a.C();
        c3.getClass();
        this.i = new y3(c3, "last_upload", 0L);
        final c4 c4 = super.a.C();
        c4.getClass();
        this.j = new y3(c4, "last_upload_attempt", 0L);
        final c4 c5 = super.a.C();
        c5.getClass();
        this.k = new y3(c5, "midnight_offset", 0L);
    }
    
    @Override
    protected final boolean i() {
        return false;
    }
    
    @Deprecated
    @c1
    final Pair<String, Boolean> j(String a) {
        this.e();
        final long d = super.a.F().d();
        final String d2 = this.d;
        if (d2 != null && d < this.f) {
            return (Pair<String, Boolean>)new Pair((Object)d2, (Object)this.e);
        }
        this.f = d + super.a.w().o(a, a3.c);
        a.e(true);
        try {
            final a.a b = a.b(super.a.X());
            this.d = "";
            a = b.a();
            if (a != null) {
                this.d = a;
            }
            this.e = b.b();
        }
        catch (Exception ex) {
            super.a.c().n().b("Unable to get advertising id", ex);
            this.d = "";
        }
        a.e(false);
        return (Pair<String, Boolean>)new Pair((Object)this.d, (Object)this.e);
    }
    
    @c1
    final Pair<String, Boolean> k(final String s, final h h) {
        if (h.j()) {
            return this.j(s);
        }
        return (Pair<String, Boolean>)new Pair((Object)"", (Object)Boolean.FALSE);
    }
    
    @Deprecated
    @c1
    final String l(final String s) {
        this.e();
        final String s2 = (String)this.j(s).first;
        final MessageDigest p = ga.p("MD5");
        if (p == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, p.digest(s2.getBytes())));
    }
}
