// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.j0;
import android.widget.EditText;
import android.text.TextUtils;
import android.os.Parcelable;
import android.content.res.TypedArray;
import androidx.core.content.res.i;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.k0;

public class EditTextPreference extends DialogPreference
{
    private String F0;
    @k0
    private a G0;
    
    public EditTextPreference(final Context context) {
        this(context, null);
    }
    
    public EditTextPreference(final Context context, final AttributeSet set) {
        this(context, set, i.a(context, o.b.E1, 16842898));
    }
    
    public EditTextPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public EditTextPreference(final Context context, final AttributeSet set, int g4, final int n) {
        super(context, set, g4, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o.m.F4, g4, n);
        g4 = o.m.G4;
        if (i.b(obtainStyledAttributes, g4, g4, false)) {
            this.U1((g)c.b());
        }
        obtainStyledAttributes.recycle();
    }
    
    @k0
    a F2() {
        return this.G0;
    }
    
    public String G2() {
        return this.F0;
    }
    
    public void H2(@k0 final a g0) {
        this.G0 = g0;
    }
    
    public void I2(final String f0) {
        final boolean a2 = this.a2();
        this.f1(this.F0 = f0);
        final boolean a3 = this.a2();
        if (a3 != a2) {
            this.A0(a3);
        }
        this.z0();
    }
    
    @Override
    protected Object N0(final TypedArray typedArray, final int n) {
        return typedArray.getString(n);
    }
    
    @Override
    protected void S0(final Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(b.class)) {
            final b b = (b)parcelable;
            super.S0(b.getSuperState());
            this.I2(b.G);
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
        final b b = new b(t0);
        b.G = this.G2();
        return (Parcelable)b;
    }
    
    @Override
    protected void U0(final Object o) {
        this.I2(this.Q((String)o));
    }
    
    @Override
    public boolean a2() {
        return TextUtils.isEmpty((CharSequence)this.F0) || super.a2();
    }
    
    public interface a
    {
        void a(@j0 final EditText p0);
    }
    
    private static class b extends Preference.b
    {
        public static final Parcelable$Creator<b> CREATOR;
        String G;
        
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
        
        b(final Parcel parcel) {
            super(parcel);
            this.G = parcel.readString();
        }
        
        b(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeString(this.G);
        }
    }
    
    public static final class c implements g<EditTextPreference>
    {
        private static c a;
        
        private c() {
        }
        
        public static c b() {
            if (c.a == null) {
                c.a = new c();
            }
            return c.a;
        }
        
        public CharSequence c(final EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty((CharSequence)editTextPreference.G2())) {
                return editTextPreference.l().getString(o.k.D);
            }
            return editTextPreference.G2();
        }
    }
}
