// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.t0;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.View;
import android.os.Parcelable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public abstract class TwoStatePreference extends Preference
{
    private CharSequence A0;
    private CharSequence B0;
    private boolean C0;
    private boolean D0;
    protected boolean z0;
    
    public TwoStatePreference(final Context context) {
        this(context, null);
    }
    
    public TwoStatePreference(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TwoStatePreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public TwoStatePreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    @Override
    protected void I0() {
        super.I0();
        final boolean b = this.m2() ^ true;
        if (this.d(b)) {
            this.n2(b);
        }
    }
    
    @Override
    protected Object N0(final TypedArray typedArray, final int n) {
        return typedArray.getBoolean(n, false);
    }
    
    @Override
    protected void S0(final Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(a.class)) {
            final a a = (a)parcelable;
            super.S0(a.getSuperState());
            this.n2(a.G);
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
        a.G = this.m2();
        return (Parcelable)a;
    }
    
    @Override
    protected void U0(final Object o) {
        Object false = o;
        if (o == null) {
            false = Boolean.FALSE;
        }
        this.n2(this.K((boolean)false));
    }
    
    @Override
    public boolean a2() {
        final boolean d0 = this.D0;
        final boolean b = true;
        boolean z0;
        if (d0) {
            z0 = this.z0;
        }
        else {
            z0 = !this.z0;
        }
        boolean b2 = b;
        if (!z0) {
            b2 = (super.a2() && b);
        }
        return b2;
    }
    
    public boolean i2() {
        return this.D0;
    }
    
    public CharSequence j2() {
        return this.B0;
    }
    
    public CharSequence l2() {
        return this.A0;
    }
    
    public boolean m2() {
        return this.z0;
    }
    
    public void n2(final boolean z0) {
        final boolean b = this.z0 != z0;
        if (b || !this.C0) {
            this.z0 = z0;
            this.C0 = true;
            this.Z0(z0);
            if (b) {
                this.A0(this.a2());
                this.z0();
            }
        }
    }
    
    public void o2(final boolean d0) {
        this.D0 = d0;
    }
    
    public void r2(final int n) {
        this.s2(this.l().getString(n));
    }
    
    public void s2(final CharSequence b0) {
        this.B0 = b0;
        if (!this.m2()) {
            this.z0();
        }
    }
    
    public void t2(final int n) {
        this.v2(this.l().getString(n));
    }
    
    public void v2(final CharSequence a0) {
        this.A0 = a0;
        if (this.m2()) {
            this.z0();
        }
    }
    
    @t0({ androidx.annotation.t0.a.G })
    protected void w2(final View view) {
        if (!(view instanceof TextView)) {
            return;
        }
        final TextView textView = (TextView)view;
        final int n = 1;
        final boolean z0 = this.z0;
        final int n2 = 0;
        int n3 = 0;
        Label_0086: {
            CharSequence text;
            if (z0 && !TextUtils.isEmpty(this.A0)) {
                text = this.A0;
            }
            else {
                n3 = n;
                if (this.z0) {
                    break Label_0086;
                }
                n3 = n;
                if (TextUtils.isEmpty(this.B0)) {
                    break Label_0086;
                }
                text = this.B0;
            }
            textView.setText(text);
            n3 = 0;
        }
        int n4;
        if ((n4 = n3) != 0) {
            final CharSequence c0 = this.c0();
            n4 = n3;
            if (!TextUtils.isEmpty(c0)) {
                textView.setText(c0);
                n4 = 0;
            }
        }
        int visibility;
        if (n4 == 0) {
            visibility = n2;
        }
        else {
            visibility = 8;
        }
        if (visibility != textView.getVisibility()) {
            textView.setVisibility(visibility);
        }
    }
    
    protected void x2(final n n) {
        this.w2(n.b(16908304));
    }
    
    static class a extends b
    {
        public static final Parcelable$Creator<a> CREATOR;
        boolean G;
        
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
            boolean g = true;
            if (int1 != 1) {
                g = false;
            }
            this.G = g;
        }
        
        a(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt((int)(this.G ? 1 : 0));
        }
    }
}
