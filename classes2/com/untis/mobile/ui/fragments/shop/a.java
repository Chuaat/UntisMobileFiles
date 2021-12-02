// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.shop;

import com.untis.mobile.utils.h0;
import android.os.Parcel;
import androidx.annotation.j0;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class a implements Serializable, Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    @j0
    private String G;
    private boolean H;
    @j0
    private String I;
    private boolean J;
    @j0
    private String K;
    private boolean L;
    @j0
    private String M;
    private boolean N;
    @j0
    private String O;
    private boolean P;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
            public a a(final Parcel parcel) {
                return new a(parcel);
            }
            
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    public a() {
        this.G = "";
        this.I = "";
        this.K = "";
        this.M = "";
        this.O = "";
    }
    
    protected a(final Parcel parcel) {
        this.G = parcel.readString();
        final byte byte1 = parcel.readByte();
        final boolean b = true;
        this.H = (byte1 != 0);
        this.I = parcel.readString();
        this.J = (parcel.readByte() != 0);
        this.K = parcel.readString();
        this.L = (parcel.readByte() != 0);
        this.M = parcel.readString();
        this.N = (parcel.readByte() != 0);
        this.O = parcel.readString();
        this.P = (parcel.readByte() != 0 && b);
    }
    
    @j0
    public String a() {
        return h0.f(this.K);
    }
    
    @j0
    public String b() {
        return h0.f(this.G);
    }
    
    @j0
    public String c() {
        return h0.f(this.O);
    }
    
    @j0
    public String d() {
        return h0.f(this.M);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @j0
    public String e() {
        return h0.f(this.I);
    }
    
    public boolean f() {
        return this.L;
    }
    
    public boolean g() {
        return this.H;
    }
    
    public boolean h() {
        return this.P;
    }
    
    public boolean i() {
        return this.N;
    }
    
    public boolean j() {
        return this.J;
    }
    
    public void k(final boolean l) {
        this.L = l;
    }
    
    public void l(@j0 final String k) {
        this.K = k;
    }
    
    public void m(final boolean h) {
        this.H = h;
    }
    
    public void n(@j0 final String g) {
        this.G = g;
    }
    
    public void o(final boolean p) {
        this.P = p;
    }
    
    public void p(@j0 final String o) {
        this.O = o;
    }
    
    public void q(final boolean n) {
        this.N = n;
    }
    
    public void r(@j0 final String m) {
        this.M = m;
    }
    
    public void s(final boolean j) {
        this.J = j;
    }
    
    public void t(@j0 final String i) {
        this.I = i;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.G);
        parcel.writeByte((byte)(byte)(this.H ? 1 : 0));
        parcel.writeString(this.I);
        parcel.writeByte((byte)(byte)(this.J ? 1 : 0));
        parcel.writeString(this.K);
        parcel.writeByte((byte)(byte)(this.L ? 1 : 0));
        parcel.writeString(this.M);
        parcel.writeByte((byte)(byte)(this.N ? 1 : 0));
        parcel.writeString(this.O);
        parcel.writeByte((byte)(byte)(this.P ? 1 : 0));
    }
}
