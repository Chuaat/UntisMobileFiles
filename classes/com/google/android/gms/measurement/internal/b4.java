// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences$Editor;
import androidx.annotation.c1;
import com.google.android.gms.common.internal.x;

public final class b4
{
    private final String a;
    private boolean b;
    private String c;
    final /* synthetic */ c4 d;
    
    public b4(final c4 d, final String a, final String s) {
        this.d = d;
        x.g(a);
        this.a = a;
    }
    
    @c1
    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.l().getString(this.a, (String)null);
        }
        return this.c;
    }
    
    @c1
    public final void b(final String c) {
        final SharedPreferences$Editor edit = this.d.l().edit();
        edit.putString(this.a, c);
        edit.apply();
        this.c = c;
    }
}
