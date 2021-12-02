// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.util.Pair;
import android.net.Uri;
import androidx.annotation.c1;
import java.util.Iterator;
import android.text.TextUtils;
import android.net.Uri$Builder;
import android.os.Bundle;

public final class pa
{
    private final z4 a;
    
    public pa(final z4 a) {
        this.a = a;
    }
    
    @c1
    final void a(String string, final Bundle bundle) {
        this.a.b().e();
        if (!this.a.l()) {
            if (bundle.isEmpty()) {
                string = null;
            }
            else {
                String s = string;
                if (string.isEmpty()) {
                    s = "auto";
                }
                final Uri$Builder uri$Builder = new Uri$Builder();
                uri$Builder.path(s);
                for (final String s2 : bundle.keySet()) {
                    uri$Builder.appendQueryParameter(s2, bundle.getString(s2));
                }
                string = uri$Builder.build().toString();
            }
            if (!TextUtils.isEmpty((CharSequence)string)) {
                this.a.C().u.b(string);
                this.a.C().v.b(this.a.F().a());
            }
        }
    }
    
    @c1
    final void b() {
        this.a.b().e();
        if (!this.d()) {
            return;
        }
        if (this.e()) {
            this.a.C().u.b(null);
            final Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.a.G().q("auto", "_cmpx", bundle);
        }
        else {
            final String a = this.a.C().u.a();
            if (TextUtils.isEmpty((CharSequence)a)) {
                this.a.c().q().a("Cache still valid but referrer not found");
            }
            else {
                final long n = this.a.C().v.a() / 3600000L;
                final Uri parse = Uri.parse(a);
                final Bundle bundle2 = new Bundle();
                final Pair pair = new Pair((Object)parse.getPath(), (Object)bundle2);
                for (final String s : parse.getQueryParameterNames()) {
                    bundle2.putString(s, parse.getQueryParameter(s));
                }
                ((Bundle)pair.second).putLong("_cc", (n - 1L) * 3600000L);
                final Object first = pair.first;
                String s2;
                if (first == null) {
                    s2 = "app";
                }
                else {
                    s2 = (String)first;
                }
                this.a.G().q(s2, "_cmp", (Bundle)pair.second);
            }
            this.a.C().u.b(null);
        }
        this.a.C().v.b(0L);
    }
    
    final void c() {
        if (this.d() && this.e()) {
            this.a.C().u.b(null);
        }
    }
    
    final boolean d() {
        return this.a.C().v.a() > 0L;
    }
    
    final boolean e() {
        return this.d() && this.a.F().a() - this.a.C().v.a() > this.a.w().o(null, a3.S);
    }
}
