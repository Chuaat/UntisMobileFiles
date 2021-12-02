// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import java.util.List;
import androidx.lifecycle.s;
import android.util.Log;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
final class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    private static final String U = "FragmentManager";
    final int[] G;
    final ArrayList<String> H;
    final int[] I;
    final int[] J;
    final int K;
    final String L;
    final int M;
    final int N;
    final CharSequence O;
    final int P;
    final CharSequence Q;
    final ArrayList<String> R;
    final ArrayList<String> S;
    final boolean T;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
            public b a(final Parcel parcel) {
                return new b(parcel);
            }
            
            public b[] b(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final Parcel parcel) {
        this.G = parcel.createIntArray();
        this.H = (ArrayList<String>)parcel.createStringArrayList();
        this.I = parcel.createIntArray();
        this.J = parcel.createIntArray();
        this.K = parcel.readInt();
        this.L = parcel.readString();
        this.M = parcel.readInt();
        this.N = parcel.readInt();
        this.O = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.P = parcel.readInt();
        this.Q = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.R = (ArrayList<String>)parcel.createStringArrayList();
        this.S = (ArrayList<String>)parcel.createStringArrayList();
        this.T = (parcel.readInt() != 0);
    }
    
    public b(final a a) {
        final int size = a.c.size();
        this.G = new int[size * 5];
        if (a.i) {
            this.H = new ArrayList<String>(size);
            this.I = new int[size];
            this.J = new int[size];
            for (int i = 0, n = 0; i < size; ++i, ++n) {
                final a0.a a2 = a.c.get(i);
                final int[] g = this.G;
                final int n2 = n + 1;
                g[n] = a2.a;
                final ArrayList<String> h = this.H;
                final Fragment b = a2.b;
                String mWho;
                if (b != null) {
                    mWho = b.mWho;
                }
                else {
                    mWho = null;
                }
                h.add(mWho);
                final int[] g2 = this.G;
                final int n3 = n2 + 1;
                g2[n2] = a2.c;
                final int n4 = n3 + 1;
                g2[n3] = a2.d;
                n = n4 + 1;
                g2[n4] = a2.e;
                g2[n] = a2.f;
                this.I[i] = a2.g.ordinal();
                this.J[i] = a2.h.ordinal();
            }
            this.K = a.h;
            this.L = a.k;
            this.M = a.N;
            this.N = a.l;
            this.O = a.m;
            this.P = a.n;
            this.Q = a.o;
            this.R = a.p;
            this.S = a.q;
            this.T = a.r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
    
    public a a(final FragmentManager fragmentManager) {
        final a obj = new a(fragmentManager);
        int i = 0;
        int n = 0;
        while (i < this.G.length) {
            final a0.a a = new a0.a();
            final int[] g = this.G;
            final int n2 = i + 1;
            a.a = g[i];
            if (FragmentManager.T0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(obj);
                sb.append(" op #");
                sb.append(n);
                sb.append(" base fragment #");
                sb.append(this.G[n2]);
                Log.v("FragmentManager", sb.toString());
            }
            final String s = this.H.get(n);
            Fragment n3;
            if (s != null) {
                n3 = fragmentManager.n0(s);
            }
            else {
                n3 = null;
            }
            a.b = n3;
            a.g = androidx.lifecycle.s.c.values()[this.I[n]];
            a.h = androidx.lifecycle.s.c.values()[this.J[n]];
            final int[] g2 = this.G;
            final int n4 = n2 + 1;
            final int n5 = g2[n2];
            a.c = n5;
            final int n6 = n4 + 1;
            final int n7 = g2[n4];
            a.d = n7;
            final int n8 = n6 + 1;
            final int n9 = g2[n6];
            a.e = n9;
            final int n10 = g2[n8];
            a.f = n10;
            obj.d = n5;
            obj.e = n7;
            obj.f = n9;
            obj.g = n10;
            obj.n(a);
            ++n;
            i = n8 + 1;
        }
        obj.h = this.K;
        obj.k = this.L;
        obj.N = this.M;
        obj.i = true;
        obj.l = this.N;
        obj.m = this.O;
        obj.n = this.P;
        obj.o = this.Q;
        obj.p = this.R;
        obj.q = this.S;
        obj.r = this.T;
        obj.V(1);
        return obj;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeIntArray(this.G);
        parcel.writeStringList((List)this.H);
        parcel.writeIntArray(this.I);
        parcel.writeIntArray(this.J);
        parcel.writeInt(this.K);
        parcel.writeString(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
        TextUtils.writeToParcel(this.O, parcel, 0);
        parcel.writeInt(this.P);
        TextUtils.writeToParcel(this.Q, parcel, 0);
        parcel.writeStringList((List)this.R);
        parcel.writeStringList((List)this.S);
        parcel.writeInt((int)(this.T ? 1 : 0));
    }
}
