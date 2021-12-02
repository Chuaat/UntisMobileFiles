// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.barcode;

import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import android.graphics.Rect;
import android.graphics.Point;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;

@h2.d.a(creator = "BarcodeCreator")
@h2.d.f({ 1 })
public class a extends a
{
    @RecentlyNonNull
    public static final Parcelable$Creator<a> CREATOR;
    public static final int W = 0;
    public static final int X = 1;
    public static final int Y = 2;
    public static final int Z = 4;
    public static final int a0 = 8;
    public static final int b0 = 16;
    public static final int c0 = 32;
    public static final int d0 = 64;
    public static final int e0 = 128;
    public static final int f0 = 256;
    public static final int g0 = 512;
    public static final int h0 = 1024;
    public static final int i0 = 2048;
    public static final int j0 = 4096;
    public static final int k0 = 1;
    public static final int l0 = 2;
    public static final int m0 = 3;
    public static final int n0 = 4;
    public static final int o0 = 5;
    public static final int p0 = 6;
    public static final int q0 = 7;
    public static final int r0 = 8;
    public static final int s0 = 9;
    public static final int t0 = 10;
    public static final int u0 = 11;
    public static final int v0 = 12;
    @h2.d.c(id = 2)
    public int G;
    @RecentlyNonNull
    @h2.d.c(id = 3)
    public String H;
    @RecentlyNonNull
    @h2.d.c(id = 4)
    public String I;
    @h2.d.c(id = 5)
    public int J;
    @RecentlyNonNull
    @h2.d.c(id = 6)
    public Point[] K;
    @RecentlyNonNull
    @h2.d.c(id = 7)
    public f L;
    @RecentlyNonNull
    @h2.d.c(id = 8)
    public i M;
    @RecentlyNonNull
    @h2.d.c(id = 9)
    public j N;
    @RecentlyNonNull
    @h2.d.c(id = 10)
    public l O;
    @RecentlyNonNull
    @h2.d.c(id = 11)
    public k P;
    @RecentlyNonNull
    @h2.d.c(id = 12)
    public g Q;
    @RecentlyNonNull
    @h2.d.c(id = 13)
    public c R;
    @RecentlyNonNull
    @h2.d.c(id = 14)
    public d S;
    @RecentlyNonNull
    @h2.d.c(id = 15)
    public e T;
    @RecentlyNonNull
    @h2.d.c(id = 16)
    public byte[] U;
    @h2.d.c(id = 17)
    public boolean V;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.vision.barcode.d();
    }
    
    public a() {
    }
    
    @h2.d.b
    public a(@h2.d.e(id = 2) final int g, @RecentlyNonNull @h2.d.e(id = 3) final String h, @RecentlyNonNull @h2.d.e(id = 4) final String i, @h2.d.e(id = 5) final int j, @RecentlyNonNull @h2.d.e(id = 6) final Point[] k, @RecentlyNonNull @h2.d.e(id = 7) final f l, @RecentlyNonNull @h2.d.e(id = 8) final i m, @RecentlyNonNull @h2.d.e(id = 9) final j n, @RecentlyNonNull @h2.d.e(id = 10) final l o, @RecentlyNonNull @h2.d.e(id = 11) final k p16, @RecentlyNonNull @h2.d.e(id = 12) final g q, @RecentlyNonNull @h2.d.e(id = 13) final c r, @RecentlyNonNull @h2.d.e(id = 14) final d s, @RecentlyNonNull @h2.d.e(id = 15) final e t, @RecentlyNonNull @h2.d.e(id = 16) final byte[] u, @h2.d.e(id = 17) final boolean v) {
        this.G = g;
        this.H = h;
        this.U = u;
        this.I = i;
        this.J = j;
        this.K = k;
        this.V = v;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p16;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.T = t;
    }
    
    @RecentlyNonNull
    public Rect M() {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int n = 0;
        while (true) {
            final Point[] k = this.K;
            if (n >= k.length) {
                break;
            }
            final Point point = k[n];
            min = Math.min(min, point.x);
            max = Math.max(max, point.x);
            min2 = Math.min(min2, point.y);
            max2 = Math.max(max2, point.y);
            ++n;
        }
        return new Rect(min, min2, max, max2);
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 2, this.G);
        h2.c.X(parcel, 3, this.H, false);
        h2.c.X(parcel, 4, this.I, false);
        h2.c.F(parcel, 5, this.J);
        h2.c.b0(parcel, 6, this.K, n, false);
        h2.c.S(parcel, 7, (Parcelable)this.L, n, false);
        h2.c.S(parcel, 8, (Parcelable)this.M, n, false);
        h2.c.S(parcel, 9, (Parcelable)this.N, n, false);
        h2.c.S(parcel, 10, (Parcelable)this.O, n, false);
        h2.c.S(parcel, 11, (Parcelable)this.P, n, false);
        h2.c.S(parcel, 12, (Parcelable)this.Q, n, false);
        h2.c.S(parcel, 13, (Parcelable)this.R, n, false);
        h2.c.S(parcel, 14, (Parcelable)this.S, n, false);
        h2.c.S(parcel, 15, (Parcelable)this.T, n, false);
        h2.c.m(parcel, 16, this.U, false);
        h2.c.g(parcel, 17, this.V);
        h2.c.b(parcel, a);
    }
    
    @h2.d.a(creator = "AddressCreator")
    @d.f({ 1 })
    public static class a extends h2.a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<a> CREATOR;
        public static final int I = 0;
        public static final int J = 1;
        public static final int K = 2;
        @d.c(id = 2)
        public int G;
        @RecentlyNonNull
        @d.c(id = 3)
        public String[] H;
        
        static {
            CREATOR = (Parcelable$Creator)new c();
        }
        
        public a() {
        }
        
        @d.b
        public a(@d.e(id = 2) final int g, @RecentlyNonNull @d.e(id = 3) final String[] h) {
            this.G = g;
            this.H = h;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, int a) {
            a = c.a(parcel);
            c.F(parcel, 2, this.G);
            c.Y(parcel, 3, this.H, false);
            c.b(parcel, a);
        }
    }
    
    @d.a(creator = "CalendarDateTimeCreator")
    @d.f({ 1 })
    public static class b extends a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<b> CREATOR;
        @d.c(id = 2)
        public int G;
        @d.c(id = 3)
        public int H;
        @d.c(id = 4)
        public int I;
        @d.c(id = 5)
        public int J;
        @d.c(id = 6)
        public int K;
        @d.c(id = 7)
        public int L;
        @d.c(id = 8)
        public boolean M;
        @RecentlyNonNull
        @d.c(id = 9)
        public String N;
        
        static {
            CREATOR = (Parcelable$Creator)new f();
        }
        
        public b() {
        }
        
        @h2.d.b
        public b(@d.e(id = 2) final int g, @d.e(id = 3) final int h, @d.e(id = 4) final int i, @d.e(id = 5) final int j, @d.e(id = 6) final int k, @d.e(id = 7) final int l, @d.e(id = 8) final boolean m, @RecentlyNonNull @d.e(id = 9) final String n) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = l;
            this.M = m;
            this.N = n;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, int a) {
            a = c.a(parcel);
            c.F(parcel, 2, this.G);
            c.F(parcel, 3, this.H);
            c.F(parcel, 4, this.I);
            c.F(parcel, 5, this.J);
            c.F(parcel, 6, this.K);
            c.F(parcel, 7, this.L);
            c.g(parcel, 8, this.M);
            c.X(parcel, 9, this.N, false);
            c.b(parcel, a);
        }
    }
    
    @d.a(creator = "CalendarEventCreator")
    @d.f({ 1 })
    public static class c extends a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<c> CREATOR;
        @RecentlyNonNull
        @h2.d.c(id = 2)
        public String G;
        @RecentlyNonNull
        @h2.d.c(id = 3)
        public String H;
        @RecentlyNonNull
        @h2.d.c(id = 4)
        public String I;
        @RecentlyNonNull
        @h2.d.c(id = 5)
        public String J;
        @RecentlyNonNull
        @h2.d.c(id = 6)
        public String K;
        @RecentlyNonNull
        @h2.d.c(id = 7)
        public b L;
        @RecentlyNonNull
        @h2.d.c(id = 8)
        public b M;
        
        static {
            CREATOR = (Parcelable$Creator)new com.google.android.gms.vision.barcode.h();
        }
        
        public c() {
        }
        
        @d.b
        public c(@RecentlyNonNull @d.e(id = 2) final String g, @RecentlyNonNull @d.e(id = 3) final String h, @RecentlyNonNull @d.e(id = 4) final String i, @RecentlyNonNull @d.e(id = 5) final String j, @RecentlyNonNull @d.e(id = 6) final String k, @RecentlyNonNull @d.e(id = 7) final b l, @RecentlyNonNull @d.e(id = 8) final b m) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = l;
            this.M = m;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
            final int a = h2.c.a(parcel);
            h2.c.X(parcel, 2, this.G, false);
            h2.c.X(parcel, 3, this.H, false);
            h2.c.X(parcel, 4, this.I, false);
            h2.c.X(parcel, 5, this.J, false);
            h2.c.X(parcel, 6, this.K, false);
            h2.c.S(parcel, 7, (Parcelable)this.L, n, false);
            h2.c.S(parcel, 8, (Parcelable)this.M, n, false);
            h2.c.b(parcel, a);
        }
    }
    
    @h2.d.a(creator = "ContactInfoCreator")
    @h2.d.f({ 1 })
    public static class d extends a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<d> CREATOR;
        @RecentlyNonNull
        @h2.d.c(id = 2)
        public h G;
        @RecentlyNonNull
        @h2.d.c(id = 3)
        public String H;
        @RecentlyNonNull
        @h2.d.c(id = 4)
        public String I;
        @RecentlyNonNull
        @h2.d.c(id = 5)
        public i[] J;
        @RecentlyNonNull
        @h2.d.c(id = 6)
        public f[] K;
        @RecentlyNonNull
        @h2.d.c(id = 7)
        public String[] L;
        @RecentlyNonNull
        @h2.d.c(id = 8)
        public a[] M;
        
        static {
            CREATOR = (Parcelable$Creator)new g();
        }
        
        public d() {
        }
        
        @h2.d.b
        public d(@RecentlyNonNull @h2.d.e(id = 2) final h g, @RecentlyNonNull @h2.d.e(id = 3) final String h, @RecentlyNonNull @h2.d.e(id = 4) final String i, @RecentlyNonNull @h2.d.e(id = 5) final i[] j, @RecentlyNonNull @h2.d.e(id = 6) final f[] k, @RecentlyNonNull @h2.d.e(id = 7) final String[] l, @RecentlyNonNull @h2.d.e(id = 8) final a[] m) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = l;
            this.M = m;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
            final int a = c.a(parcel);
            c.S(parcel, 2, (Parcelable)this.G, n, false);
            c.X(parcel, 3, this.H, false);
            c.X(parcel, 4, this.I, false);
            c.b0(parcel, 5, this.J, n, false);
            c.b0(parcel, 6, this.K, n, false);
            c.Y(parcel, 7, this.L, false);
            c.b0(parcel, 8, this.M, n, false);
            c.b(parcel, a);
        }
    }
    
    @d.a(creator = "DriverLicenseCreator")
    @d.f({ 1 })
    public static class e extends a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<e> CREATOR;
        @RecentlyNonNull
        @d.c(id = 2)
        public String G;
        @RecentlyNonNull
        @d.c(id = 3)
        public String H;
        @RecentlyNonNull
        @d.c(id = 4)
        public String I;
        @RecentlyNonNull
        @d.c(id = 5)
        public String J;
        @RecentlyNonNull
        @d.c(id = 6)
        public String K;
        @RecentlyNonNull
        @d.c(id = 7)
        public String L;
        @RecentlyNonNull
        @d.c(id = 8)
        public String M;
        @RecentlyNonNull
        @d.c(id = 9)
        public String N;
        @RecentlyNonNull
        @d.c(id = 10)
        public String O;
        @RecentlyNonNull
        @d.c(id = 11)
        public String P;
        @RecentlyNonNull
        @d.c(id = 12)
        public String Q;
        @RecentlyNonNull
        @d.c(id = 13)
        public String R;
        @RecentlyNonNull
        @d.c(id = 14)
        public String S;
        @RecentlyNonNull
        @d.c(id = 15)
        public String T;
        
        static {
            CREATOR = (Parcelable$Creator)new com.google.android.gms.vision.barcode.j();
        }
        
        public e() {
        }
        
        @d.b
        public e(@RecentlyNonNull @h2.d.e(id = 2) final String g, @RecentlyNonNull @h2.d.e(id = 3) final String h, @RecentlyNonNull @h2.d.e(id = 4) final String i, @RecentlyNonNull @h2.d.e(id = 5) final String j, @RecentlyNonNull @h2.d.e(id = 6) final String k, @RecentlyNonNull @h2.d.e(id = 7) final String l, @RecentlyNonNull @h2.d.e(id = 8) final String m, @RecentlyNonNull @h2.d.e(id = 9) final String n, @RecentlyNonNull @h2.d.e(id = 10) final String o, @RecentlyNonNull @h2.d.e(id = 11) final String p14, @RecentlyNonNull @h2.d.e(id = 12) final String q, @RecentlyNonNull @h2.d.e(id = 13) final String r, @RecentlyNonNull @h2.d.e(id = 14) final String s, @RecentlyNonNull @h2.d.e(id = 15) final String t) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = o;
            this.P = p14;
            this.Q = q;
            this.R = r;
            this.S = s;
            this.T = t;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, int a) {
            a = c.a(parcel);
            c.X(parcel, 2, this.G, false);
            c.X(parcel, 3, this.H, false);
            c.X(parcel, 4, this.I, false);
            c.X(parcel, 5, this.J, false);
            c.X(parcel, 6, this.K, false);
            c.X(parcel, 7, this.L, false);
            c.X(parcel, 8, this.M, false);
            c.X(parcel, 9, this.N, false);
            c.X(parcel, 10, this.O, false);
            c.X(parcel, 11, this.P, false);
            c.X(parcel, 12, this.Q, false);
            c.X(parcel, 13, this.R, false);
            c.X(parcel, 14, this.S, false);
            c.X(parcel, 15, this.T, false);
            c.b(parcel, a);
        }
    }
    
    @d.a(creator = "EmailCreator")
    @h2.d.f({ 1 })
    public static class f extends a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<f> CREATOR;
        public static final int K = 0;
        public static final int L = 1;
        public static final int M = 2;
        @d.c(id = 2)
        public int G;
        @RecentlyNonNull
        @d.c(id = 3)
        public String H;
        @RecentlyNonNull
        @d.c(id = 4)
        public String I;
        @RecentlyNonNull
        @d.c(id = 5)
        public String J;
        
        static {
            CREATOR = (Parcelable$Creator)new com.google.android.gms.vision.barcode.i();
        }
        
        public f() {
        }
        
        @d.b
        public f(@d.e(id = 2) final int g, @RecentlyNonNull @d.e(id = 3) final String h, @RecentlyNonNull @d.e(id = 4) final String i, @RecentlyNonNull @d.e(id = 5) final String j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, int a) {
            a = c.a(parcel);
            c.F(parcel, 2, this.G);
            c.X(parcel, 3, this.H, false);
            c.X(parcel, 4, this.I, false);
            c.X(parcel, 5, this.J, false);
            c.b(parcel, a);
        }
    }
    
    @d.a(creator = "GeoPointCreator")
    @d.f({ 1 })
    public static class g extends a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<g> CREATOR;
        @d.c(id = 2)
        public double G;
        @d.c(id = 3)
        public double H;
        
        static {
            CREATOR = (Parcelable$Creator)new com.google.android.gms.vision.barcode.l();
        }
        
        public g() {
        }
        
        @d.b
        public g(@d.e(id = 2) final double g, @d.e(id = 3) final double h) {
            this.G = g;
            this.H = h;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, int a) {
            a = c.a(parcel);
            c.r(parcel, 2, this.G);
            c.r(parcel, 3, this.H);
            c.b(parcel, a);
        }
    }
    
    @d.a(creator = "PersonNameCreator")
    @d.f({ 1 })
    public static class h extends a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<h> CREATOR;
        @RecentlyNonNull
        @d.c(id = 2)
        public String G;
        @RecentlyNonNull
        @d.c(id = 3)
        public String H;
        @RecentlyNonNull
        @d.c(id = 4)
        public String I;
        @RecentlyNonNull
        @d.c(id = 5)
        public String J;
        @RecentlyNonNull
        @d.c(id = 6)
        public String K;
        @RecentlyNonNull
        @d.c(id = 7)
        public String L;
        @RecentlyNonNull
        @d.c(id = 8)
        public String M;
        
        static {
            CREATOR = (Parcelable$Creator)new com.google.android.gms.vision.barcode.k();
        }
        
        public h() {
        }
        
        @d.b
        public h(@RecentlyNonNull @d.e(id = 2) final String g, @RecentlyNonNull @d.e(id = 3) final String h, @RecentlyNonNull @d.e(id = 4) final String i, @RecentlyNonNull @d.e(id = 5) final String j, @RecentlyNonNull @d.e(id = 6) final String k, @RecentlyNonNull @d.e(id = 7) final String l, @RecentlyNonNull @d.e(id = 8) final String m) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = l;
            this.M = m;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, int a) {
            a = c.a(parcel);
            c.X(parcel, 2, this.G, false);
            c.X(parcel, 3, this.H, false);
            c.X(parcel, 4, this.I, false);
            c.X(parcel, 5, this.J, false);
            c.X(parcel, 6, this.K, false);
            c.X(parcel, 7, this.L, false);
            c.X(parcel, 8, this.M, false);
            c.b(parcel, a);
        }
    }
    
    @d.a(creator = "PhoneCreator")
    @d.f({ 1 })
    public static class i extends a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<i> CREATOR;
        public static final int I = 0;
        public static final int J = 1;
        public static final int K = 2;
        public static final int L = 3;
        public static final int M = 4;
        @d.c(id = 2)
        public int G;
        @RecentlyNonNull
        @d.c(id = 3)
        public String H;
        
        static {
            CREATOR = (Parcelable$Creator)new n();
        }
        
        public i() {
        }
        
        @d.b
        public i(@d.e(id = 2) final int g, @RecentlyNonNull @d.e(id = 3) final String h) {
            this.G = g;
            this.H = h;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, int a) {
            a = c.a(parcel);
            c.F(parcel, 2, this.G);
            c.X(parcel, 3, this.H, false);
            c.b(parcel, a);
        }
    }
    
    @d.a(creator = "SmsCreator")
    @d.f({ 1 })
    public static class j extends a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<j> CREATOR;
        @RecentlyNonNull
        @d.c(id = 2)
        public String G;
        @RecentlyNonNull
        @d.c(id = 3)
        public String H;
        
        static {
            CREATOR = (Parcelable$Creator)new m();
        }
        
        public j() {
        }
        
        @d.b
        public j(@RecentlyNonNull @d.e(id = 2) final String g, @RecentlyNonNull @d.e(id = 3) final String h) {
            this.G = g;
            this.H = h;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, int a) {
            a = c.a(parcel);
            c.X(parcel, 2, this.G, false);
            c.X(parcel, 3, this.H, false);
            c.b(parcel, a);
        }
    }
    
    @d.a(creator = "UrlBookmarkCreator")
    @d.f({ 1 })
    public static class k extends a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<k> CREATOR;
        @RecentlyNonNull
        @d.c(id = 2)
        public String G;
        @RecentlyNonNull
        @d.c(id = 3)
        public String H;
        
        static {
            CREATOR = (Parcelable$Creator)new p();
        }
        
        public k() {
        }
        
        @d.b
        public k(@RecentlyNonNull @d.e(id = 2) final String g, @RecentlyNonNull @d.e(id = 3) final String h) {
            this.G = g;
            this.H = h;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, int a) {
            a = c.a(parcel);
            c.X(parcel, 2, this.G, false);
            c.X(parcel, 3, this.H, false);
            c.b(parcel, a);
        }
    }
    
    @d.a(creator = "WiFiCreator")
    @d.f({ 1 })
    public static class l extends a
    {
        @RecentlyNonNull
        public static final Parcelable$Creator<l> CREATOR;
        public static final int J = 1;
        public static final int K = 2;
        public static final int L = 3;
        @RecentlyNonNull
        @d.c(id = 2)
        public String G;
        @RecentlyNonNull
        @d.c(id = 3)
        public String H;
        @d.c(id = 4)
        public int I;
        
        static {
            CREATOR = (Parcelable$Creator)new o();
        }
        
        public l() {
        }
        
        @d.b
        public l(@RecentlyNonNull @d.e(id = 2) final String g, @RecentlyNonNull @d.e(id = 3) final String h, @d.e(id = 4) final int i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, int a) {
            a = c.a(parcel);
            c.X(parcel, 2, this.G, false);
            c.X(parcel, 3, this.H, false);
            c.F(parcel, 4, this.I);
            c.b(parcel, a);
        }
    }
}
