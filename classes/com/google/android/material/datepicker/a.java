// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import android.os.Bundle;
import java.util.Arrays;
import androidx.core.util.i;
import android.os.Parcel;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    @j0
    private final m G;
    @j0
    private final m H;
    @j0
    private final c I;
    @k0
    private m J;
    private final int K;
    private final int L;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
            @j0
            public a a(@j0 final Parcel parcel) {
                return new a((m)parcel.readParcelable(m.class.getClassLoader()), (m)parcel.readParcelable(m.class.getClassLoader()), (c)parcel.readParcelable(c.class.getClassLoader()), (m)parcel.readParcelable(m.class.getClassLoader()), null);
            }
            
            @j0
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    private a(@j0 final m g, @j0 final m h, @j0 final c i, @k0 final m j) {
        this.G = g;
        this.H = h;
        this.J = j;
        this.I = i;
        if (j != null && g.b(j) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (j != null && j.b(h) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.L = g.o(h) + 1;
        this.K = h.I - g.I + 1;
    }
    
    public int describeContents() {
        return 0;
    }
    
    m e(final m m) {
        if (m.b(this.G) < 0) {
            return this.G;
        }
        m h = m;
        if (m.b(this.H) > 0) {
            h = this.H;
        }
        return h;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        if (!this.G.equals(a.G) || !this.H.equals(a.H) || !i.a(this.J, a.J) || !this.I.equals(a.I)) {
            b = false;
        }
        return b;
    }
    
    public c f() {
        return this.I;
    }
    
    @j0
    m g() {
        return this.H;
    }
    
    int h() {
        return this.L;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.G, this.H, this.J, this.I });
    }
    
    @k0
    m i() {
        return this.J;
    }
    
    @j0
    m j() {
        return this.G;
    }
    
    int k() {
        return this.K;
    }
    
    boolean l(final long n) {
        final m g = this.G;
        boolean b = true;
        if (g.i(1) <= n) {
            final m h = this.H;
            if (n <= h.i(h.K)) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    void m(@k0 final m j) {
        this.J = j;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.G, 0);
        parcel.writeParcelable((Parcelable)this.H, 0);
        parcel.writeParcelable((Parcelable)this.J, 0);
        parcel.writeParcelable((Parcelable)this.I, 0);
    }
    
    public static final class b
    {
        static final long e;
        static final long f;
        private static final String g = "DEEP_COPY_VALIDATOR_KEY";
        private long a;
        private long b;
        private Long c;
        private c d;
        
        static {
            e = u.a(m.d(1900, 0).L);
            f = u.a(m.d(2100, 11).L);
        }
        
        public b() {
            this.a = b.e;
            this.b = b.f;
            this.d = com.google.android.material.datepicker.i.a(Long.MIN_VALUE);
        }
        
        b(@j0 final a a) {
            this.a = b.e;
            this.b = b.f;
            this.d = com.google.android.material.datepicker.i.a(Long.MIN_VALUE);
            this.a = a.G.L;
            this.b = a.H.L;
            this.c = a.J.L;
            this.d = a.I;
        }
        
        @j0
        public a a() {
            final Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", (Parcelable)this.d);
            final m f = m.f(this.a);
            final m f2 = m.f(this.b);
            final c c = (c)bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            final Long c2 = this.c;
            m f3;
            if (c2 == null) {
                f3 = null;
            }
            else {
                f3 = m.f(c2);
            }
            return new a(f, f2, c, f3, null);
        }
        
        @j0
        public b b(final long b) {
            this.b = b;
            return this;
        }
        
        @j0
        public b c(final long l) {
            this.c = l;
            return this;
        }
        
        @j0
        public b d(final long a) {
            this.a = a;
            return this;
        }
        
        @j0
        public b e(@j0 final c d) {
            this.d = d;
            return this;
        }
    }
    
    public interface c extends Parcelable
    {
        boolean S3(final long p0);
    }
}
