// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences$Editor;
import androidx.annotation.c1;
import com.google.android.gms.common.internal.x;

public final class y3
{
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    final /* synthetic */ c4 e;
    
    public y3(final c4 e, final String a, final long b) {
        this.e = e;
        x.g(a);
        this.a = a;
        this.b = b;
    }
    
    @c1
    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.l().getLong(this.a, this.b);
        }
        return this.d;
    }
    
    @c1
    public final void b(final long d) {
        final SharedPreferences$Editor edit = this.e.l().edit();
        edit.putLong(this.a, d);
        edit.apply();
        this.d = d;
    }
}
