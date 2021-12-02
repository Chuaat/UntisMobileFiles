// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging.reporting;

import com.google.android.gms.internal.firebase_messaging.d0;
import com.google.android.gms.internal.firebase_messaging.f0;
import androidx.annotation.j0;

public final class a
{
    private static final a p;
    private final long a;
    private final String b;
    private final String c;
    private final c d;
    private final d e;
    private final String f;
    private final String g;
    private final int h;
    private final int i;
    private final String j;
    private final long k;
    private final b l;
    private final String m;
    private final long n;
    private final String o;
    
    static {
        p = new a().a();
    }
    
    a(final long a, final String b, final String c, final c d, final d e, final String f, final String g, final int h, final int i, final String j, final long k, final b l, final String m, final long n, final String o) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
    }
    
    @j0
    public static a f() {
        return a.p;
    }
    
    @j0
    public static a q() {
        return new a();
    }
    
    @j0
    @f0(zza = 13)
    public String a() {
        return this.m;
    }
    
    @f0(zza = 11)
    public long b() {
        return this.k;
    }
    
    @f0(zza = 14)
    public long c() {
        return this.n;
    }
    
    @j0
    @f0(zza = 7)
    public String d() {
        return this.g;
    }
    
    @j0
    @f0(zza = 15)
    public String e() {
        return this.o;
    }
    
    @j0
    @f0(zza = 12)
    public b g() {
        return this.l;
    }
    
    @j0
    @f0(zza = 3)
    public String h() {
        return this.c;
    }
    
    @j0
    @f0(zza = 2)
    public String i() {
        return this.b;
    }
    
    @j0
    @f0(zza = 4)
    public c j() {
        return this.d;
    }
    
    @j0
    @f0(zza = 6)
    public String k() {
        return this.f;
    }
    
    @f0(zza = 8)
    public int l() {
        return this.h;
    }
    
    @f0(zza = 1)
    public long m() {
        return this.a;
    }
    
    @j0
    @f0(zza = 5)
    public d n() {
        return this.e;
    }
    
    @j0
    @f0(zza = 10)
    public String o() {
        return this.j;
    }
    
    @f0(zza = 9)
    public int p() {
        return this.i;
    }
    
    public static final class a
    {
        private long a;
        private String b;
        private String c;
        private c d;
        private d e;
        private String f;
        private String g;
        private int h;
        private int i;
        private String j;
        private long k;
        private b l;
        private String m;
        private long n;
        private String o;
        
        a() {
            this.a = 0L;
            this.b = "";
            this.c = "";
            this.d = c.H;
            this.e = d.H;
            this.f = "";
            this.g = "";
            this.h = 0;
            this.i = 0;
            this.j = "";
            this.k = 0L;
            this.l = b.H;
            this.m = "";
            this.n = 0L;
            this.o = "";
        }
        
        @j0
        public com.google.firebase.messaging.reporting.a a() {
            return new com.google.firebase.messaging.reporting.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        
        @j0
        public a b(@j0 final String m) {
            this.m = m;
            return this;
        }
        
        @j0
        public a c(final long k) {
            this.k = k;
            return this;
        }
        
        @j0
        public a d(final long n) {
            this.n = n;
            return this;
        }
        
        @j0
        public a e(@j0 final String g) {
            this.g = g;
            return this;
        }
        
        @j0
        public a f(@j0 final String o) {
            this.o = o;
            return this;
        }
        
        @j0
        public a g(@j0 final b l) {
            this.l = l;
            return this;
        }
        
        @j0
        public a h(@j0 final String c) {
            this.c = c;
            return this;
        }
        
        @j0
        public a i(@j0 final String b) {
            this.b = b;
            return this;
        }
        
        @j0
        public a j(@j0 final c d) {
            this.d = d;
            return this;
        }
        
        @j0
        public a k(@j0 final String f) {
            this.f = f;
            return this;
        }
        
        @j0
        public a l(final int h) {
            this.h = h;
            return this;
        }
        
        @j0
        public a m(final long a) {
            this.a = a;
            return this;
        }
        
        @j0
        public a n(@j0 final d e) {
            this.e = e;
            return this;
        }
        
        @j0
        public a o(@j0 final String j) {
            this.j = j;
            return this;
        }
        
        @j0
        public a p(final int i) {
            this.i = i;
            return this;
        }
    }
    
    public enum b implements d0
    {
        @j0
        H(0), 
        @j0
        I(1), 
        @j0
        J(2);
        
        private final int G;
        
        static {
            K = b();
        }
        
        private b(final int g) {
            this.G = g;
        }
        
        private static /* synthetic */ b[] b() {
            return new b[] { b.H, b.I, b.J };
        }
        
        public int q() {
            return this.G;
        }
    }
    
    public enum c implements d0
    {
        @j0
        H(0), 
        @j0
        I(1), 
        @j0
        J(2), 
        @j0
        K(3);
        
        private final int G;
        
        static {
            L = b();
        }
        
        private c(final int g) {
            this.G = g;
        }
        
        private static /* synthetic */ c[] b() {
            return new c[] { c.H, c.I, c.J, c.K };
        }
        
        public int q() {
            return this.G;
        }
    }
    
    public enum d implements d0
    {
        @j0
        H(0), 
        @j0
        I(1), 
        @j0
        J(2), 
        @j0
        K(3);
        
        private final int G;
        
        static {
            L = b();
        }
        
        private d(final int g) {
            this.G = g;
        }
        
        private static /* synthetic */ d[] b() {
            return new d[] { d.H, d.I, d.J, d.K };
        }
        
        public int q() {
            return this.G;
        }
    }
}
