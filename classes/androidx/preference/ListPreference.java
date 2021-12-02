// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.j0;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.util.Log;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.e;
import android.content.res.TypedArray;
import androidx.core.content.res.i;
import android.util.AttributeSet;
import android.content.Context;

public class ListPreference extends DialogPreference
{
    private static final String K0 = "ListPreference";
    private CharSequence[] F0;
    private CharSequence[] G0;
    private String H0;
    private String I0;
    private boolean J0;
    
    public ListPreference(final Context context) {
        this(context, null);
    }
    
    public ListPreference(final Context context, final AttributeSet set) {
        this(context, set, i.a(context, o.b.f1, 16842897));
    }
    
    public ListPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public ListPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o.m.P5, n, n2);
        this.F0 = i.q(obtainStyledAttributes, o.m.S5, o.m.Q5);
        this.G0 = i.q(obtainStyledAttributes, o.m.T5, o.m.R5);
        final int u5 = o.m.U5;
        if (i.b(obtainStyledAttributes, u5, u5, false)) {
            this.U1((g)b.b());
        }
        obtainStyledAttributes.recycle();
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, o.m.V6, n, n2);
        this.I0 = i.o(obtainStyledAttributes2, o.m.D7, o.m.d7);
        obtainStyledAttributes2.recycle();
    }
    
    private int L2() {
        return this.F2(this.H0);
    }
    
    public int F2(final String obj) {
        if (obj != null) {
            final CharSequence[] g0 = this.G0;
            if (g0 != null) {
                for (int i = g0.length - 1; i >= 0; --i) {
                    if (this.G0[i].equals(obj)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    
    public CharSequence[] G2() {
        return this.F0;
    }
    
    public CharSequence H2() {
        final int l2 = this.L2();
        if (l2 >= 0) {
            final CharSequence[] f0 = this.F0;
            if (f0 != null) {
                return f0[l2];
            }
        }
        return null;
    }
    
    public CharSequence[] I2() {
        return this.G0;
    }
    
    public String J2() {
        return this.H0;
    }
    
    public void M2(@androidx.annotation.e final int n) {
        this.N2(this.l().getResources().getTextArray(n));
    }
    
    @Override
    protected Object N0(final TypedArray typedArray, final int n) {
        return typedArray.getString(n);
    }
    
    public void N2(final CharSequence[] f0) {
        this.F0 = f0;
    }
    
    public void P2(@androidx.annotation.e final int n) {
        this.Q2(this.l().getResources().getTextArray(n));
    }
    
    public void Q2(final CharSequence[] g0) {
        this.G0 = g0;
    }
    
    public void R2(final String h0) {
        final boolean b = TextUtils.equals((CharSequence)this.H0, (CharSequence)h0) ^ true;
        if (b || !this.J0) {
            this.H0 = h0;
            this.J0 = true;
            this.f1(h0);
            if (b) {
                this.z0();
            }
        }
    }
    
    @Override
    protected void S0(final Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(a.class)) {
            final a a = (a)parcelable;
            super.S0(a.getSuperState());
            this.R2(a.G);
            return;
        }
        super.S0(parcelable);
    }
    
    @Override
    protected Parcelable T0() {
        final Parcelable t0 = super.T0();
        if (this.s0()) {
            return t0;
        }
        final a a = new a(t0);
        a.G = this.J2();
        return (Parcelable)a;
    }
    
    @Override
    public void T1(final CharSequence charSequence) {
        super.T1(charSequence);
        String string;
        if (charSequence == null && this.I0 != null) {
            string = null;
        }
        else {
            if (charSequence == null || charSequence.equals(this.I0)) {
                return;
            }
            string = charSequence.toString();
        }
        this.I0 = string;
    }
    
    public void T2(final int n) {
        final CharSequence[] g0 = this.G0;
        if (g0 != null) {
            this.R2(g0[n].toString());
        }
    }
    
    @Override
    protected void U0(final Object o) {
        this.R2(this.Q((String)o));
    }
    
    @Override
    public CharSequence c0() {
        if (this.i0() != null) {
            return this.i0().a(this);
        }
        final CharSequence h2 = this.H2();
        final CharSequence c0 = super.c0();
        final String i0 = this.I0;
        if (i0 == null) {
            return c0;
        }
        CharSequence charSequence;
        if ((charSequence = h2) == null) {
            charSequence = "";
        }
        final String format = String.format(i0, charSequence);
        if (TextUtils.equals((CharSequence)format, c0)) {
            return c0;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }
    
    private static class a extends Preference.b
    {
        public static final Parcelable$Creator<a> CREATOR;
        String G;
        
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
        
        a(final Parcel parcel) {
            super(parcel);
            this.G = parcel.readString();
        }
        
        a(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeString(this.G);
        }
    }
    
    public static final class b implements g<ListPreference>
    {
        private static b a;
        
        private b() {
        }
        
        public static b b() {
            if (b.a == null) {
                b.a = new b();
            }
            return b.a;
        }
        
        public CharSequence c(final ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.H2())) {
                return listPreference.l().getString(o.k.D);
            }
            return listPreference.H2();
        }
    }
}
