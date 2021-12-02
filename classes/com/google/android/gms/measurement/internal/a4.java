// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.util.Pair;
import android.content.SharedPreferences$Editor;
import androidx.annotation.c1;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.util.d0;

public final class a4
{
    @d0
    final String a;
    private final String b;
    private final String c;
    private final long d;
    final /* synthetic */ c4 e;
    
    @c1
    private final long c() {
        return this.e.l().getLong(this.a, 0L);
    }
    
    @c1
    private final void d() {
        this.e.e();
        final long a = this.e.a.F().a();
        final SharedPreferences$Editor edit = this.e.l().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, a);
        edit.apply();
    }
    
    @c1
    public final Pair<String, Long> a() {
        this.e.e();
        this.e.e();
        final long c = this.c();
        long abs;
        if (c == 0L) {
            this.d();
            abs = 0L;
        }
        else {
            abs = Math.abs(c - this.e.a.F().a());
        }
        final long d = this.d;
        if (abs < d) {
            return null;
        }
        if (abs > d + d) {
            this.d();
            return null;
        }
        final String string = this.e.l().getString(this.c, (String)null);
        final long long1 = this.e.l().getLong(this.b, 0L);
        this.d();
        if (string != null && long1 > 0L) {
            return (Pair<String, Long>)new Pair((Object)string, (Object)long1);
        }
        return c4.x;
    }
    
    @c1
    public final void b(final String s, long nextLong) {
        this.e.e();
        if (this.c() == 0L) {
            this.d();
        }
        String s2;
        if ((s2 = s) == null) {
            s2 = "";
        }
        final long long1 = this.e.l().getLong(this.b, 0L);
        if (long1 <= 0L) {
            final SharedPreferences$Editor edit = this.e.l().edit();
            edit.putString(this.c, s2);
            edit.putLong(this.b, 1L);
            edit.apply();
            return;
        }
        nextLong = this.e.a.M().q().nextLong();
        final long n = long1 + 1L;
        final long n2 = Long.MAX_VALUE / n;
        final SharedPreferences$Editor edit2 = this.e.l().edit();
        if ((nextLong & Long.MAX_VALUE) < n2) {
            edit2.putString(this.c, s2);
        }
        edit2.putLong(this.b, n);
        edit2.apply();
    }
}
