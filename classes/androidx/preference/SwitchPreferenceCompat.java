// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.widget.CompoundButton;
import androidx.annotation.t0;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import android.view.View;
import android.content.res.TypedArray;
import androidx.core.content.res.i;
import android.util.AttributeSet;
import android.content.Context;

public class SwitchPreferenceCompat extends TwoStatePreference
{
    private final a E0;
    private CharSequence F0;
    private CharSequence G0;
    
    public SwitchPreferenceCompat(final Context context) {
        this(context, null);
    }
    
    public SwitchPreferenceCompat(final Context context, final AttributeSet set) {
        this(context, set, o.b.F4);
    }
    
    public SwitchPreferenceCompat(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public SwitchPreferenceCompat(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.E0 = new a();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o.m.V9, n, n2);
        this.v2(i.o(obtainStyledAttributes, o.m.da, o.m.W9));
        this.s2(i.o(obtainStyledAttributes, o.m.ca, o.m.X9));
        this.F2(i.o(obtainStyledAttributes, o.m.fa, o.m.Z9));
        this.D2(i.o(obtainStyledAttributes, o.m.ea, o.m.aa));
        this.o2(i.b(obtainStyledAttributes, o.m.ba, o.m.Y9, false));
        obtainStyledAttributes.recycle();
    }
    
    private void G2(final View view) {
        final boolean b = view instanceof SwitchCompat;
        if (b) {
            ((SwitchCompat)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(super.z0);
        }
        if (b) {
            final SwitchCompat switchCompat = (SwitchCompat)view;
            switchCompat.setTextOn(this.F0);
            switchCompat.setTextOff(this.G0);
            switchCompat.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.E0);
        }
    }
    
    private void H2(final View view) {
        if (!((AccessibilityManager)this.l().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.G2(view.findViewById(o.g.C1));
        this.w2(view.findViewById(16908304));
    }
    
    public CharSequence B2() {
        return this.F0;
    }
    
    public void C2(final int n) {
        this.D2(this.l().getString(n));
    }
    
    public void D2(final CharSequence g0) {
        this.G0 = g0;
        this.z0();
    }
    
    public void E2(final int n) {
        this.F2(this.l().getString(n));
    }
    
    public void F2(final CharSequence f0) {
        this.F0 = f0;
        this.z0();
    }
    
    @Override
    public void G0(final n n) {
        super.G0(n);
        this.G2(n.b(o.g.C1));
        this.x2(n);
    }
    
    @t0({ androidx.annotation.t0.a.G })
    @Override
    protected void Y0(final View view) {
        super.Y0(view);
        this.H2(view);
    }
    
    public CharSequence y2() {
        return this.G0;
    }
    
    private class a implements CompoundButton$OnCheckedChangeListener
    {
        a() {
        }
        
        public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
            if (!SwitchPreferenceCompat.this.d(b)) {
                compoundButton.setChecked(b ^ true);
                return;
            }
            SwitchPreferenceCompat.this.n2(b);
        }
    }
}
