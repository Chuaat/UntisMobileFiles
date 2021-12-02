// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import androidx.annotation.j0;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
final class u implements Parcelable
{
    public static final Parcelable$Creator<u> CREATOR;
    final String G;
    final String H;
    final boolean I;
    final int J;
    final int K;
    final String L;
    final boolean M;
    final boolean N;
    final boolean O;
    final Bundle P;
    final boolean Q;
    final int R;
    Bundle S;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<u>() {
            public u a(final Parcel parcel) {
                return new u(parcel);
            }
            
            public u[] b(final int n) {
                return new u[n];
            }
        };
    }
    
    u(final Parcel parcel) {
        this.G = parcel.readString();
        this.H = parcel.readString();
        final int int1 = parcel.readInt();
        final boolean b = true;
        this.I = (int1 != 0);
        this.J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readString();
        this.M = (parcel.readInt() != 0);
        this.N = (parcel.readInt() != 0);
        this.O = (parcel.readInt() != 0);
        this.P = parcel.readBundle();
        this.Q = (parcel.readInt() != 0 && b);
        this.S = parcel.readBundle();
        this.R = parcel.readInt();
    }
    
    u(final Fragment fragment) {
        this.G = fragment.getClass().getName();
        this.H = fragment.mWho;
        this.I = fragment.mFromLayout;
        this.J = fragment.mFragmentId;
        this.K = fragment.mContainerId;
        this.L = fragment.mTag;
        this.M = fragment.mRetainInstance;
        this.N = fragment.mRemoving;
        this.O = fragment.mDetached;
        this.P = fragment.mArguments;
        this.Q = fragment.mHidden;
        this.R = fragment.mMaxState.ordinal();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.G);
        sb.append(" (");
        sb.append(this.H);
        sb.append(")}:");
        if (this.I) {
            sb.append(" fromLayout");
        }
        if (this.K != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.K));
        }
        final String l = this.L;
        if (l != null && !l.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.L);
        }
        if (this.M) {
            sb.append(" retainInstance");
        }
        if (this.N) {
            sb.append(" removing");
        }
        if (this.O) {
            sb.append(" detached");
        }
        if (this.Q) {
            sb.append(" hidden");
        }
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeInt((int)(this.I ? 1 : 0));
        parcel.writeInt(this.J);
        parcel.writeInt(this.K);
        parcel.writeString(this.L);
        parcel.writeInt((int)(this.M ? 1 : 0));
        parcel.writeInt((int)(this.N ? 1 : 0));
        parcel.writeInt((int)(this.O ? 1 : 0));
        parcel.writeBundle(this.P);
        parcel.writeInt((int)(this.Q ? 1 : 0));
        parcel.writeBundle(this.S);
        parcel.writeInt(this.R);
    }
}
