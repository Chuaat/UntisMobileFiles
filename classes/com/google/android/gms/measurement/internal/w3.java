// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.c1;
import android.content.SharedPreferences$Editor;
import com.google.android.gms.common.internal.x;

public final class w3
{
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    final /* synthetic */ c4 e;
    
    public w3(final c4 e, final String a, final boolean b) {
        this.e = e;
        x.g(a);
        this.a = a;
        this.b = b;
    }
    
    @c1
    public final void a(final boolean d) {
        final SharedPreferences$Editor edit = this.e.l().edit();
        edit.putBoolean(this.a, d);
        edit.apply();
        this.d = d;
    }
    
    @c1
    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.l().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
