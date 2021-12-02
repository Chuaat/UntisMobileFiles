// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.navigation;

import android.os.Parcel;
import com.google.android.material.internal.k;
import android.os.Parcelable$Creator;
import androidx.appcompat.view.menu.o;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.s;
import com.google.android.material.badge.b;
import android.os.Parcelable;
import android.content.Context;
import androidx.appcompat.view.menu.j;
import androidx.annotation.k0;
import androidx.annotation.j0;
import androidx.appcompat.view.menu.g;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.n;

@t0({ t0.a.H })
public class d implements n
{
    private g G;
    private c H;
    private boolean I;
    private int J;
    
    public d() {
        this.I = false;
    }
    
    public void a(final int j) {
        this.J = j;
    }
    
    @Override
    public int b() {
        return this.J;
    }
    
    public void c(@j0 final c h) {
        this.H = h;
    }
    
    @Override
    public void d(@k0 final g g, final boolean b) {
    }
    
    @Override
    public void e(final boolean b) {
        if (this.I) {
            return;
        }
        if (b) {
            this.H.c();
        }
        else {
            this.H.p();
        }
    }
    
    @Override
    public boolean f() {
        return false;
    }
    
    @Override
    public boolean g(@k0 final g g, @k0 final j j) {
        return false;
    }
    
    @Override
    public boolean h(@k0 final g g, @k0 final j j) {
        return false;
    }
    
    @Override
    public void i(@k0 final n.a a) {
    }
    
    @Override
    public void j(@j0 final Context context, @j0 final g g) {
        this.G = g;
        this.H.e(g);
    }
    
    @Override
    public void k(@j0 final Parcelable parcelable) {
        if (parcelable instanceof a) {
            final c h = this.H;
            final a a = (a)parcelable;
            h.o(a.G);
            this.H.setBadgeDrawables(b.e(this.H.getContext(), a.H));
        }
    }
    
    public void l(final boolean i) {
        this.I = i;
    }
    
    @Override
    public boolean m(@k0 final s s) {
        return false;
    }
    
    @k0
    @Override
    public o n(@k0 final ViewGroup viewGroup) {
        return this.H;
    }
    
    @j0
    @Override
    public Parcelable o() {
        final a a = new a();
        a.G = this.H.getSelectedItemId();
        a.H = b.f(this.H.getBadgeDrawables());
        return (Parcelable)a;
    }
    
    static class a implements Parcelable
    {
        public static final Parcelable$Creator<a> CREATOR;
        int G;
        @k0
        k H;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
                @j0
                public a a(@j0 final Parcel parcel) {
                    return new a(parcel);
                }
                
                @j0
                public a[] b(final int n) {
                    return new a[n];
                }
            };
        }
        
        a() {
        }
        
        a(@j0 final Parcel parcel) {
            this.G = parcel.readInt();
            this.H = (k)parcel.readParcelable(this.getClass().getClassLoader());
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            parcel.writeInt(this.G);
            parcel.writeParcelable((Parcelable)this.H, 0);
        }
    }
}
