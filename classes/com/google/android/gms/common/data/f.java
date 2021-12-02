// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNullable;
import android.net.Uri;
import com.google.android.gms.common.internal.v;
import androidx.annotation.k0;
import android.database.CharArrayBuffer;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public class f
{
    @RecentlyNonNull
    @a
    protected final DataHolder a;
    @RecentlyNonNull
    @a
    protected int b;
    private int c;
    
    @a
    public f(@RecentlyNonNull final DataHolder dataHolder, @RecentlyNonNull final int n) {
        this.a = x.k(dataHolder);
        this.n(n);
    }
    
    @a
    protected void a(@RecentlyNonNull final String s, @RecentlyNonNull final CharArrayBuffer charArrayBuffer) {
        this.a.R5(s, this.b, this.c, charArrayBuffer);
    }
    
    @RecentlyNonNull
    @a
    protected boolean b(@RecentlyNonNull final String s) {
        return this.a.q1(s, this.b, this.c);
    }
    
    @RecentlyNonNull
    @a
    protected byte[] c(@RecentlyNonNull final String s) {
        return this.a.Q1(s, this.b, this.c);
    }
    
    @RecentlyNonNull
    @a
    protected int d() {
        return this.b;
    }
    
    @RecentlyNonNull
    @a
    protected double e(@RecentlyNonNull final String s) {
        return this.a.U5(s, this.b, this.c);
    }
    
    @RecentlyNonNull
    @Override
    public boolean equals(@k0 final Object o) {
        if (o instanceof f) {
            final f f = (f)o;
            if (v.b(f.b, this.b) && v.b(f.c, this.c) && f.a == this.a) {
                return true;
            }
        }
        return false;
    }
    
    @RecentlyNonNull
    @a
    protected float f(@RecentlyNonNull final String s) {
        return this.a.U4(s, this.b, this.c);
    }
    
    @RecentlyNonNull
    @a
    protected int g(@RecentlyNonNull final String s) {
        return this.a.j2(s, this.b, this.c);
    }
    
    @RecentlyNonNull
    @a
    protected long h(@RecentlyNonNull final String s) {
        return this.a.N2(s, this.b, this.c);
    }
    
    @RecentlyNonNull
    @Override
    public int hashCode() {
        return v.c(this.b, this.c, this.a);
    }
    
    @RecentlyNonNull
    @a
    protected String i(@RecentlyNonNull final String s) {
        return this.a.j3(s, this.b, this.c);
    }
    
    @RecentlyNonNull
    @a
    public boolean j(@RecentlyNonNull final String s) {
        return this.a.U3(s);
    }
    
    @RecentlyNonNull
    @a
    protected boolean k(@RecentlyNonNull final String s) {
        return this.a.Q4(s, this.b, this.c);
    }
    
    @RecentlyNonNull
    @a
    public boolean l() {
        return !this.a.isClosed();
    }
    
    @RecentlyNullable
    @a
    protected Uri m(@RecentlyNonNull String j3) {
        j3 = this.a.j3(j3, this.b, this.c);
        if (j3 == null) {
            return null;
        }
        return Uri.parse(j3);
    }
    
    protected final void n(@RecentlyNonNull final int b) {
        x.q(b >= 0 && b < this.a.getCount());
        this.b = b;
        this.c = this.a.O3(b);
    }
}
