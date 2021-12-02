// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamic;

import com.google.android.gms.internal.common.b;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import android.os.IBinder;
import com.google.android.gms.internal.common.a;
import android.os.Bundle;
import androidx.annotation.RecentlyNullable;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import android.os.IInterface;

public interface c extends IInterface
{
    void F(@RecentlyNonNull final boolean p0) throws RemoteException;
    
    void I(@RecentlyNonNull final Intent p0) throws RemoteException;
    
    void P1(@RecentlyNonNull final boolean p0) throws RemoteException;
    
    void T1(@RecentlyNonNull final d p0) throws RemoteException;
    
    @RecentlyNonNull
    int a() throws RemoteException;
    
    @RecentlyNullable
    c c() throws RemoteException;
    
    @RecentlyNonNull
    d e() throws RemoteException;
    
    void f0(@RecentlyNonNull final boolean p0) throws RemoteException;
    
    void f1(@RecentlyNonNull final Intent p0, @RecentlyNonNull final int p1) throws RemoteException;
    
    @RecentlyNullable
    c g() throws RemoteException;
    
    void h1(@RecentlyNonNull final boolean p0) throws RemoteException;
    
    @RecentlyNonNull
    d i() throws RemoteException;
    
    @RecentlyNonNull
    boolean j() throws RemoteException;
    
    @RecentlyNonNull
    int k() throws RemoteException;
    
    @RecentlyNonNull
    boolean l() throws RemoteException;
    
    @RecentlyNullable
    String m() throws RemoteException;
    
    @RecentlyNonNull
    boolean n() throws RemoteException;
    
    @RecentlyNonNull
    boolean o() throws RemoteException;
    
    void o1(@RecentlyNonNull final d p0) throws RemoteException;
    
    @RecentlyNonNull
    boolean p() throws RemoteException;
    
    @RecentlyNonNull
    boolean q() throws RemoteException;
    
    @RecentlyNonNull
    boolean r() throws RemoteException;
    
    @RecentlyNonNull
    boolean s() throws RemoteException;
    
    @RecentlyNonNull
    boolean t() throws RemoteException;
    
    @RecentlyNonNull
    d zza() throws RemoteException;
    
    @RecentlyNonNull
    Bundle zzb() throws RemoteException;
    
    public abstract static class a extends a implements c
    {
        public a() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }
        
        @RecentlyNonNull
        public static c x2(@RecentlyNonNull final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof c) {
                return (c)queryLocalInterface;
            }
            return new c.a.a(binder);
        }
        
        @RecentlyNonNull
        @Override
        protected final boolean H(@RecentlyNonNull int n, @RecentlyNonNull final Parcel parcel, @RecentlyNonNull final Parcel parcel2, @RecentlyNonNull final int n2) throws RemoteException {
            Object o = null;
            Label_0475: {
                Label_0437: {
                    boolean b = false;
                    Label_0397: {
                        switch (n) {
                            default: {
                                return false;
                            }
                            case 27: {
                                this.o1(d.a.x2(parcel.readStrongBinder()));
                                break;
                            }
                            case 26: {
                                this.f1(com.google.android.gms.internal.common.d.a(parcel, (android.os.Parcelable$Creator<Intent>)Intent.CREATOR), parcel.readInt());
                                break;
                            }
                            case 25: {
                                this.I(com.google.android.gms.internal.common.d.a(parcel, (android.os.Parcelable$Creator<Intent>)Intent.CREATOR));
                                break;
                            }
                            case 24: {
                                this.f0(com.google.android.gms.internal.common.d.e(parcel));
                                break;
                            }
                            case 23: {
                                this.h1(com.google.android.gms.internal.common.d.e(parcel));
                                break;
                            }
                            case 22: {
                                this.F(com.google.android.gms.internal.common.d.e(parcel));
                                break;
                            }
                            case 21: {
                                this.P1(com.google.android.gms.internal.common.d.e(parcel));
                                break;
                            }
                            case 20: {
                                this.T1(d.a.x2(parcel.readStrongBinder()));
                                break;
                            }
                            case 19: {
                                b = this.l();
                                break Label_0397;
                            }
                            case 18: {
                                b = this.n();
                                break Label_0397;
                            }
                            case 17: {
                                b = this.j();
                                break Label_0397;
                            }
                            case 16: {
                                b = this.t();
                                break Label_0397;
                            }
                            case 15: {
                                b = this.s();
                                break Label_0397;
                            }
                            case 14: {
                                b = this.q();
                                break Label_0397;
                            }
                            case 13: {
                                b = this.p();
                                break Label_0397;
                            }
                            case 12: {
                                o = this.i();
                                break Label_0475;
                            }
                            case 11: {
                                b = this.r();
                                break Label_0397;
                            }
                            case 10: {
                                n = this.k();
                                break Label_0437;
                            }
                            case 9: {
                                o = this.g();
                                break Label_0475;
                            }
                            case 8: {
                                final String m = this.m();
                                parcel2.writeNoException();
                                parcel2.writeString(m);
                                return true;
                            }
                            case 7: {
                                b = this.o();
                                break Label_0397;
                            }
                            case 6: {
                                o = this.e();
                                break Label_0475;
                            }
                            case 5: {
                                o = this.c();
                                break Label_0475;
                            }
                            case 4: {
                                n = this.a();
                                break Label_0437;
                            }
                            case 3: {
                                final Bundle zzb = this.zzb();
                                parcel2.writeNoException();
                                com.google.android.gms.internal.common.d.f(parcel2, (Parcelable)zzb);
                                return true;
                            }
                            case 2: {
                                o = this.zza();
                                break Label_0475;
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.d.d(parcel2, b);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeInt(n);
                return true;
            }
            parcel2.writeNoException();
            com.google.android.gms.internal.common.d.b(parcel2, (IInterface)o);
            return true;
        }
        
        public static final class a extends b implements c
        {
            a(final IBinder binder) {
                super(binder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }
            
            @Override
            public final void F(final boolean b) throws RemoteException {
                final Parcel h = this.H();
                com.google.android.gms.internal.common.d.d(h, b);
                this.y2(22, h);
            }
            
            @Override
            public final void I(final Intent intent) throws RemoteException {
                final Parcel h = this.H();
                com.google.android.gms.internal.common.d.c(h, (Parcelable)intent);
                this.y2(25, h);
            }
            
            @Override
            public final void P1(final boolean b) throws RemoteException {
                final Parcel h = this.H();
                com.google.android.gms.internal.common.d.d(h, b);
                this.y2(21, h);
            }
            
            @Override
            public final void T1(final d d) throws RemoteException {
                final Parcel h = this.H();
                com.google.android.gms.internal.common.d.b(h, (IInterface)d);
                this.y2(20, h);
            }
            
            @Override
            public final int a() throws RemoteException {
                final Parcel x2 = this.x2(4, this.H());
                final int int1 = x2.readInt();
                x2.recycle();
                return int1;
            }
            
            @Override
            public final c c() throws RemoteException {
                final Parcel x2 = this.x2(5, this.H());
                final c x3 = c.a.x2(x2.readStrongBinder());
                x2.recycle();
                return x3;
            }
            
            @Override
            public final d e() throws RemoteException {
                final Parcel x2 = this.x2(6, this.H());
                final d x3 = d.a.x2(x2.readStrongBinder());
                x2.recycle();
                return x3;
            }
            
            @Override
            public final void f0(final boolean b) throws RemoteException {
                final Parcel h = this.H();
                com.google.android.gms.internal.common.d.d(h, b);
                this.y2(24, h);
            }
            
            @Override
            public final void f1(final Intent intent, final int n) throws RemoteException {
                final Parcel h = this.H();
                com.google.android.gms.internal.common.d.c(h, (Parcelable)intent);
                h.writeInt(n);
                this.y2(26, h);
            }
            
            @Override
            public final c g() throws RemoteException {
                final Parcel x2 = this.x2(9, this.H());
                final c x3 = c.a.x2(x2.readStrongBinder());
                x2.recycle();
                return x3;
            }
            
            @Override
            public final void h1(final boolean b) throws RemoteException {
                final Parcel h = this.H();
                com.google.android.gms.internal.common.d.d(h, b);
                this.y2(23, h);
            }
            
            @Override
            public final d i() throws RemoteException {
                final Parcel x2 = this.x2(12, this.H());
                final d x3 = d.a.x2(x2.readStrongBinder());
                x2.recycle();
                return x3;
            }
            
            @Override
            public final boolean j() throws RemoteException {
                final Parcel x2 = this.x2(17, this.H());
                final boolean e = com.google.android.gms.internal.common.d.e(x2);
                x2.recycle();
                return e;
            }
            
            @Override
            public final int k() throws RemoteException {
                final Parcel x2 = this.x2(10, this.H());
                final int int1 = x2.readInt();
                x2.recycle();
                return int1;
            }
            
            @Override
            public final boolean l() throws RemoteException {
                final Parcel x2 = this.x2(19, this.H());
                final boolean e = com.google.android.gms.internal.common.d.e(x2);
                x2.recycle();
                return e;
            }
            
            @Override
            public final String m() throws RemoteException {
                final Parcel x2 = this.x2(8, this.H());
                final String string = x2.readString();
                x2.recycle();
                return string;
            }
            
            @Override
            public final boolean n() throws RemoteException {
                final Parcel x2 = this.x2(18, this.H());
                final boolean e = com.google.android.gms.internal.common.d.e(x2);
                x2.recycle();
                return e;
            }
            
            @Override
            public final boolean o() throws RemoteException {
                final Parcel x2 = this.x2(7, this.H());
                final boolean e = com.google.android.gms.internal.common.d.e(x2);
                x2.recycle();
                return e;
            }
            
            @Override
            public final void o1(final d d) throws RemoteException {
                final Parcel h = this.H();
                com.google.android.gms.internal.common.d.b(h, (IInterface)d);
                this.y2(27, h);
            }
            
            @Override
            public final boolean p() throws RemoteException {
                final Parcel x2 = this.x2(13, this.H());
                final boolean e = com.google.android.gms.internal.common.d.e(x2);
                x2.recycle();
                return e;
            }
            
            @Override
            public final boolean q() throws RemoteException {
                final Parcel x2 = this.x2(14, this.H());
                final boolean e = com.google.android.gms.internal.common.d.e(x2);
                x2.recycle();
                return e;
            }
            
            @Override
            public final boolean r() throws RemoteException {
                final Parcel x2 = this.x2(11, this.H());
                final boolean e = com.google.android.gms.internal.common.d.e(x2);
                x2.recycle();
                return e;
            }
            
            @Override
            public final boolean s() throws RemoteException {
                final Parcel x2 = this.x2(15, this.H());
                final boolean e = com.google.android.gms.internal.common.d.e(x2);
                x2.recycle();
                return e;
            }
            
            @Override
            public final boolean t() throws RemoteException {
                final Parcel x2 = this.x2(16, this.H());
                final boolean e = com.google.android.gms.internal.common.d.e(x2);
                x2.recycle();
                return e;
            }
            
            @Override
            public final d zza() throws RemoteException {
                final Parcel x2 = this.x2(2, this.H());
                final d x3 = d.a.x2(x2.readStrongBinder());
                x2.recycle();
                return x3;
            }
            
            @Override
            public final Bundle zzb() throws RemoteException {
                final Parcel x2 = this.x2(3, this.H());
                final Bundle bundle = com.google.android.gms.internal.common.d.a(x2, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
                x2.recycle();
                return bundle;
            }
        }
    }
}
