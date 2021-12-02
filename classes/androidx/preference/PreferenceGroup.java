// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.text.TextUtils;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import androidx.annotation.t0;
import androidx.annotation.k0;
import android.util.Log;
import androidx.annotation.j0;
import android.content.res.TypedArray;
import androidx.core.content.res.i;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import androidx.collection.m;
import java.util.List;
import android.os.Handler;

public abstract class PreferenceGroup extends Preference
{
    private static final String I0 = "PreferenceGroup";
    private final Handler A0;
    private List<Preference> B0;
    private boolean C0;
    private int D0;
    private boolean E0;
    private int F0;
    private b G0;
    private final Runnable H0;
    final m<String, Long> z0;
    
    public PreferenceGroup(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public PreferenceGroup(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public PreferenceGroup(final Context context, final AttributeSet set, int n, final int n2) {
        super(context, set, n, n2);
        this.z0 = new m<String, Long>();
        this.A0 = new Handler();
        this.C0 = true;
        this.D0 = 0;
        this.E0 = false;
        this.F0 = Integer.MAX_VALUE;
        this.G0 = null;
        this.H0 = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    PreferenceGroup.this.z0.clear();
                }
            }
        };
        this.B0 = new ArrayList<Preference>();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o.m.Q7, n, n2);
        n = o.m.T7;
        this.C0 = i.b(obtainStyledAttributes, n, n, true);
        n = o.m.S7;
        if (obtainStyledAttributes.hasValue(n)) {
            this.D2(i.d(obtainStyledAttributes, n, n, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }
    
    private boolean B2(final Preference preference) {
        synchronized (this) {
            preference.R0();
            if (preference.I() == this) {
                preference.b(null);
            }
            final boolean remove = this.B0.remove(preference);
            if (remove) {
                final String z = preference.z();
                if (z != null) {
                    this.z0.put(z, preference.v());
                    this.A0.removeCallbacks(this.H0);
                    this.A0.post(this.H0);
                }
                if (this.E0) {
                    preference.K0();
                }
            }
            return remove;
        }
    }
    
    @Override
    public void A0(final boolean b) {
        super.A0(b);
        for (int r2 = this.r2(), i = 0; i < r2; ++i) {
            this.o2(i).P0(this, b);
        }
    }
    
    @Override
    public void C0() {
        super.C0();
        this.E0 = true;
        for (int r2 = this.r2(), i = 0; i < r2; ++i) {
            this.o2(i).C0();
        }
    }
    
    public boolean C2(@j0 final CharSequence charSequence) {
        final Preference l2 = this.l2(charSequence);
        return l2 != null && l2.I().y2(l2);
    }
    
    public void D2(final int f0) {
        if (f0 != Integer.MAX_VALUE && !this.n0()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append(" should have a key defined if it contains an expandable preference");
            Log.e("PreferenceGroup", sb.toString());
        }
        this.F0 = f0;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void E2(@k0 final b g0) {
        this.G0 = g0;
    }
    
    public void F2(final boolean c0) {
        this.C0 = c0;
    }
    
    void G2() {
        synchronized (this) {
            Collections.sort(this.B0);
        }
    }
    
    @Override
    public void K0() {
        super.K0();
        int i = 0;
        this.E0 = false;
        while (i < this.r2()) {
            this.o2(i).K0();
            ++i;
        }
    }
    
    @Override
    protected void S0(final Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(d.class)) {
            final d d = (d)parcelable;
            this.F0 = d.G;
            super.S0(d.getSuperState());
            return;
        }
        super.S0(parcelable);
    }
    
    @Override
    protected Parcelable T0() {
        return (Parcelable)new d(super.T0(), this.F0);
    }
    
    protected void h(final Bundle bundle) {
        super.h(bundle);
        for (int r2 = this.r2(), i = 0; i < r2; ++i) {
            this.o2(i).h(bundle);
        }
    }
    
    protected void i(final Bundle bundle) {
        super.i(bundle);
        for (int r2 = this.r2(), i = 0; i < r2; ++i) {
            this.o2(i).i(bundle);
        }
    }
    
    public void i2(final Preference preference) {
        this.j2(preference);
    }
    
    public boolean j2(final Preference key) {
        if (this.B0.contains(key)) {
            return true;
        }
        if (key.z() != null) {
            PreferenceGroup i;
            for (i = this; i.I() != null; i = i.I()) {}
            final String z = key.z();
            if (i.l2(z) != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Found duplicated key: \"");
                sb.append(z);
                sb.append("\". This can cause unintended behaviour, please use unique keys for every preference.");
                Log.e("PreferenceGroup", sb.toString());
            }
        }
        if (key.G() == Integer.MAX_VALUE) {
            if (this.C0) {
                key.K1(this.D0++);
            }
            if (key instanceof PreferenceGroup) {
                ((PreferenceGroup)key).F2(this.C0);
            }
        }
        final int binarySearch = Collections.binarySearch(this.B0, key);
        int n;
        if ((n = binarySearch) < 0) {
            n = binarySearch * -1 - 1;
        }
        if (!this.w2(key)) {
            return false;
        }
        synchronized (this) {
            this.B0.add(n, key);
            // monitorexit(this)
            final l v = this.V();
            final String z2 = key.z();
            long n2;
            if (z2 != null && this.z0.containsKey(z2)) {
                n2 = this.z0.get(z2);
                this.z0.remove(z2);
            }
            else {
                n2 = v.h();
            }
            key.F0(v, n2);
            key.b(this);
            if (this.E0) {
                key.C0();
            }
            this.B0();
            return true;
        }
    }
    
    @k0
    public <T extends Preference> T l2(@j0 final CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals((CharSequence)this.z(), charSequence)) {
            return (T)this;
        }
        for (int r2 = this.r2(), i = 0; i < r2; ++i) {
            final Preference o2 = this.o2(i);
            if (TextUtils.equals((CharSequence)o2.z(), charSequence)) {
                return (T)o2;
            }
            if (o2 instanceof PreferenceGroup) {
                final Preference l2 = ((PreferenceGroup)o2).l2(charSequence);
                if (l2 != null) {
                    return (T)l2;
                }
            }
        }
        return null;
    }
    
    public int m2() {
        return this.F0;
    }
    
    @k0
    @t0({ androidx.annotation.t0.a.I })
    public b n2() {
        return this.G0;
    }
    
    public Preference o2(final int n) {
        return this.B0.get(n);
    }
    
    public int r2() {
        return this.B0.size();
    }
    
    @t0({ androidx.annotation.t0.a.G })
    public boolean s2() {
        return this.E0;
    }
    
    protected boolean t2() {
        return true;
    }
    
    public boolean v2() {
        return this.C0;
    }
    
    protected boolean w2(final Preference preference) {
        preference.P0(this, this.a2());
        return true;
    }
    
    public void x2() {
        synchronized (this) {
            final List<Preference> b0 = this.B0;
            for (int i = b0.size() - 1; i >= 0; --i) {
                this.B2(b0.get(0));
            }
            // monitorexit(this)
            this.B0();
        }
    }
    
    public boolean y2(final Preference preference) {
        final boolean b2 = this.B2(preference);
        this.B0();
        return b2;
    }
    
    @t0({ t0.a.I })
    public interface b
    {
        void a();
    }
    
    public interface c
    {
        int e(final Preference p0);
        
        int g(final String p0);
    }
    
    static class d extends Preference.b
    {
        public static final Parcelable$Creator<d> CREATOR;
        int G;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<d>() {
                public d a(final Parcel parcel) {
                    return new d(parcel);
                }
                
                public d[] b(final int n) {
                    return new d[n];
                }
            };
        }
        
        d(final Parcel parcel) {
            super(parcel);
            this.G = parcel.readInt();
        }
        
        d(final Parcelable parcelable, final int g) {
            super(parcelable);
            this.G = g;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.G);
        }
    }
}
