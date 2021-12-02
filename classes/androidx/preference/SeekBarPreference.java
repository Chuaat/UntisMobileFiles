// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnKeyListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.SeekBar;

public class SeekBarPreference extends Preference
{
    private static final String L0 = "SeekBarPreference";
    int A0;
    private int B0;
    private int C0;
    boolean D0;
    SeekBar E0;
    private TextView F0;
    boolean G0;
    private boolean H0;
    boolean I0;
    private SeekBar$OnSeekBarChangeListener J0;
    private View$OnKeyListener K0;
    int z0;
    
    public SeekBarPreference(final Context context) {
        this(context, null);
    }
    
    public SeekBarPreference(final Context context, final AttributeSet set) {
        this(context, set, o.b.X3);
    }
    
    public SeekBarPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public SeekBarPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.J0 = (SeekBar$OnSeekBarChangeListener)new SeekBar$OnSeekBarChangeListener() {
            public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
                if (b) {
                    final SeekBarPreference a = SeekBarPreference.this;
                    if (a.I0 || !a.D0) {
                        a.D2(seekBar);
                        return;
                    }
                }
                final SeekBarPreference a2 = SeekBarPreference.this;
                a2.E2(n + a2.A0);
            }
            
            public void onStartTrackingTouch(final SeekBar seekBar) {
                SeekBarPreference.this.D0 = true;
            }
            
            public void onStopTrackingTouch(final SeekBar seekBar) {
                SeekBarPreference.this.D0 = false;
                final int progress = seekBar.getProgress();
                final SeekBarPreference a = SeekBarPreference.this;
                if (progress + a.A0 != a.z0) {
                    a.D2(seekBar);
                }
            }
        };
        this.K0 = (View$OnKeyListener)new View$OnKeyListener() {
            public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                final SeekBarPreference g = SeekBarPreference.this;
                if (!g.G0 && (n == 21 || n == 22)) {
                    return false;
                }
                if (n == 23 || n == 66) {
                    return false;
                }
                final SeekBar e0 = g.E0;
                if (e0 == null) {
                    Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                    return false;
                }
                return e0.onKeyDown(n, keyEvent);
            }
        };
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o.m.Y8, n, n2);
        this.A0 = obtainStyledAttributes.getInt(o.m.c9, 0);
        this.t2(obtainStyledAttributes.getInt(o.m.a9, 100));
        this.w2(obtainStyledAttributes.getInt(o.m.d9, 0));
        this.G0 = obtainStyledAttributes.getBoolean(o.m.b9, true);
        this.H0 = obtainStyledAttributes.getBoolean(o.m.e9, false);
        this.I0 = obtainStyledAttributes.getBoolean(o.m.f9, false);
        obtainStyledAttributes.recycle();
    }
    
    private void C2(int z0, final boolean b) {
        final int a0 = this.A0;
        int n = z0;
        if (z0 < a0) {
            n = a0;
        }
        final int b2 = this.B0;
        if ((z0 = n) > b2) {
            z0 = b2;
        }
        if (z0 != this.z0) {
            this.E2(this.z0 = z0);
            this.c1(z0);
            if (b) {
                this.z0();
            }
        }
    }
    
    public void B2(final int n) {
        this.C2(n, true);
    }
    
    void D2(final SeekBar seekBar) {
        final int i = this.A0 + seekBar.getProgress();
        if (i != this.z0) {
            if (this.d(i)) {
                this.C2(i, false);
            }
            else {
                seekBar.setProgress(this.z0 - this.A0);
                this.E2(this.z0);
            }
        }
    }
    
    void E2(final int i) {
        final TextView f0 = this.F0;
        if (f0 != null) {
            f0.setText((CharSequence)String.valueOf(i));
        }
    }
    
    @Override
    public void G0(final n n) {
        super.G0(n);
        n.itemView.setOnKeyListener(this.K0);
        this.E0 = (SeekBar)n.b(o.g.p1);
        final TextView f0 = (TextView)n.b(o.g.q1);
        this.F0 = f0;
        if (this.H0) {
            f0.setVisibility(0);
        }
        else {
            f0.setVisibility(8);
            this.F0 = null;
        }
        final SeekBar e0 = this.E0;
        if (e0 == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        e0.setOnSeekBarChangeListener(this.J0);
        this.E0.setMax(this.B0 - this.A0);
        final int c0 = this.C0;
        if (c0 != 0) {
            this.E0.setKeyProgressIncrement(c0);
        }
        else {
            this.C0 = this.E0.getKeyProgressIncrement();
        }
        this.E0.setProgress(this.z0 - this.A0);
        this.E2(this.z0);
        this.E0.setEnabled(this.q0());
    }
    
    @Override
    protected Object N0(final TypedArray typedArray, final int n) {
        return typedArray.getInt(n, 0);
    }
    
    @Override
    protected void S0(final Parcelable parcelable) {
        if (!parcelable.getClass().equals(c.class)) {
            super.S0(parcelable);
            return;
        }
        final c c = (c)parcelable;
        super.S0(c.getSuperState());
        this.z0 = c.G;
        this.A0 = c.H;
        this.B0 = c.I;
        this.z0();
    }
    
    @Override
    protected Parcelable T0() {
        final Parcelable t0 = super.T0();
        if (this.s0()) {
            return t0;
        }
        final c c = new c(t0);
        c.G = this.z0;
        c.H = this.A0;
        c.I = this.B0;
        return (Parcelable)c;
    }
    
    @Override
    protected void U0(final Object o) {
        Object value = o;
        if (o == null) {
            value = 0;
        }
        this.B2(this.O((int)value));
    }
    
    public int i2() {
        return this.B0;
    }
    
    public int j2() {
        return this.A0;
    }
    
    public final int l2() {
        return this.C0;
    }
    
    public boolean m2() {
        return this.H0;
    }
    
    public boolean n2() {
        return this.I0;
    }
    
    public int o2() {
        return this.z0;
    }
    
    public boolean r2() {
        return this.G0;
    }
    
    public void s2(final boolean g0) {
        this.G0 = g0;
    }
    
    public final void t2(final int n) {
        final int a0 = this.A0;
        int b0 = n;
        if (n < a0) {
            b0 = a0;
        }
        if (b0 != this.B0) {
            this.B0 = b0;
            this.z0();
        }
    }
    
    public void v2(final int n) {
        final int b0 = this.B0;
        int a0 = n;
        if (n > b0) {
            a0 = b0;
        }
        if (a0 != this.A0) {
            this.A0 = a0;
            this.z0();
        }
    }
    
    public final void w2(final int a) {
        if (a != this.C0) {
            this.C0 = Math.min(this.B0 - this.A0, Math.abs(a));
            this.z0();
        }
    }
    
    public void x2(final boolean h0) {
        this.H0 = h0;
        this.z0();
    }
    
    public void y2(final boolean i0) {
        this.I0 = i0;
    }
    
    private static class c extends b
    {
        public static final Parcelable$Creator<c> CREATOR;
        int G;
        int H;
        int I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<c>() {
                public c a(final Parcel parcel) {
                    return new c(parcel);
                }
                
                public c[] b(final int n) {
                    return new c[n];
                }
            };
        }
        
        c(final Parcel parcel) {
            super(parcel);
            this.G = parcel.readInt();
            this.H = parcel.readInt();
            this.I = parcel.readInt();
        }
        
        c(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.G);
            parcel.writeInt(this.H);
            parcel.writeInt(this.I);
        }
    }
}
