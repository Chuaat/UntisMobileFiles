// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.t0;
import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.content.res.TypedArray;
import androidx.core.content.res.i;
import android.util.AttributeSet;
import android.content.Context;

public class CheckBoxPreference extends TwoStatePreference
{
    private final a E0;
    
    public CheckBoxPreference(final Context context) {
        this(context, null);
    }
    
    public CheckBoxPreference(final Context context, final AttributeSet set) {
        this(context, set, i.a(context, o.b.v0, 16842895));
    }
    
    public CheckBoxPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public CheckBoxPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.E0 = new a();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o.m.I3, n, n2);
        this.v2(i.o(obtainStyledAttributes, o.m.O3, o.m.J3));
        this.s2(i.o(obtainStyledAttributes, o.m.N3, o.m.K3));
        this.o2(i.b(obtainStyledAttributes, o.m.M3, o.m.L3, false));
        obtainStyledAttributes.recycle();
    }
    
    private void B2(final View view) {
        if (!((AccessibilityManager)this.l().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.y2(view.findViewById(16908289));
        this.w2(view.findViewById(16908304));
    }
    
    private void y2(final View view) {
        final boolean b = view instanceof CompoundButton;
        if (b) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(super.z0);
        }
        if (b) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.E0);
        }
    }
    
    @Override
    public void G0(final n n) {
        super.G0(n);
        this.y2(n.b(16908289));
        this.x2(n);
    }
    
    @t0({ androidx.annotation.t0.a.G })
    @Override
    protected void Y0(final View view) {
        super.Y0(view);
        this.B2(view);
    }
    
    private class a implements CompoundButton$OnCheckedChangeListener
    {
        a() {
        }
        
        public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
            if (!CheckBoxPreference.this.d(b)) {
                compoundButton.setChecked(b ^ true);
                return;
            }
            CheckBoxPreference.this.n2(b);
        }
    }
}
