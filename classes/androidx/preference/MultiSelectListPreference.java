// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.j0;
import java.util.Collections;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.util.Collection;
import androidx.annotation.e;
import android.content.res.TypedArray;
import java.util.HashSet;
import androidx.core.content.res.i;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference
{
    private CharSequence[] F0;
    private CharSequence[] G0;
    private Set<String> H0;
    
    public MultiSelectListPreference(final Context context) {
        this(context, null);
    }
    
    public MultiSelectListPreference(final Context context, final AttributeSet set) {
        this(context, set, i.a(context, o.b.f1, 16842897));
    }
    
    public MultiSelectListPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public MultiSelectListPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.H0 = new HashSet<String>();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o.m.K6, n, n2);
        this.F0 = i.q(obtainStyledAttributes, o.m.N6, o.m.L6);
        this.G0 = i.q(obtainStyledAttributes, o.m.O6, o.m.M6);
        obtainStyledAttributes.recycle();
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
    
    public CharSequence[] H2() {
        return this.G0;
    }
    
    protected boolean[] I2() {
        final CharSequence[] g0 = this.G0;
        final int length = g0.length;
        final Set<String> h0 = this.H0;
        final boolean[] array = new boolean[length];
        for (int i = 0; i < length; ++i) {
            array[i] = h0.contains(g0[i].toString());
        }
        return array;
    }
    
    public Set<String> J2() {
        return this.H0;
    }
    
    public void L2(@androidx.annotation.e final int n) {
        this.M2(this.l().getResources().getTextArray(n));
    }
    
    public void M2(final CharSequence[] f0) {
        this.F0 = f0;
    }
    
    @Override
    protected Object N0(final TypedArray typedArray, int i) {
        final CharSequence[] textArray = typedArray.getTextArray(i);
        final HashSet<String> set = new HashSet<String>();
        int length;
        for (length = textArray.length, i = 0; i < length; ++i) {
            set.add(textArray[i].toString());
        }
        return set;
    }
    
    public void N2(@androidx.annotation.e final int n) {
        this.P2(this.l().getResources().getTextArray(n));
    }
    
    public void P2(final CharSequence[] g0) {
        this.G0 = g0;
    }
    
    public void Q2(final Set<String> set) {
        this.H0.clear();
        this.H0.addAll(set);
        this.g1(set);
        this.z0();
    }
    
    @Override
    protected void S0(final Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(a.class)) {
            final a a = (a)parcelable;
            super.S0(a.getSuperState());
            this.Q2(a.G);
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
    protected void U0(final Object o) {
        this.Q2(this.T((Set<String>)o));
    }
    
    private static class a extends b
    {
        public static final Parcelable$Creator<a> CREATOR;
        Set<String> G;
        
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
            final int int1 = parcel.readInt();
            this.G = new HashSet<String>();
            final String[] elements = new String[int1];
            parcel.readStringArray(elements);
            Collections.addAll(this.G, elements);
        }
        
        a(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.G.size());
            final Set<String> g = this.G;
            parcel.writeStringArray((String[])g.toArray(new String[g.size()]));
        }
    }
}
