// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import c6.h;
import android.content.Context;
import android.net.Uri;

public final class z6
{
    final String a;
    final Uri b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;
    @h
    final g7<Context, Boolean> i;
    
    public z6(final Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
    
    private z6(final String s, final Uri b, final String s2, final String s3, final boolean e, final boolean b2, final boolean b3, final boolean b4, @h final g7<Context, Boolean> g7) {
        this.a = null;
        this.b = b;
        this.c = "";
        this.d = "";
        this.e = e;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = null;
    }
    
    public final z6 a() {
        if (this.c.isEmpty()) {
            return new z6(null, this.b, this.c, this.d, true, false, false, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }
    
    public final c7<Double> b(final String s, final double n) {
        return new x6(this, "measurement.test.double_flag", -3.0, true);
    }
    
    public final c7<Long> c(final String s, final long l) {
        return new v6(this, s, l, true);
    }
    
    public final c7<String> d(final String s, final String s2) {
        return new y6(this, s, s2, true);
    }
    
    public final c7<Boolean> e(final String s, final boolean b) {
        return new w6(this, s, b, true);
    }
}
