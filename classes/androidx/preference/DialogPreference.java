// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.k0;
import androidx.annotation.j0;
import androidx.appcompat.content.res.a;
import android.content.res.TypedArray;
import androidx.core.content.res.i;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;

public abstract class DialogPreference extends Preference
{
    private CharSequence A0;
    private Drawable B0;
    private CharSequence C0;
    private CharSequence D0;
    private int E0;
    private CharSequence z0;
    
    public DialogPreference(final Context context) {
        this(context, null);
    }
    
    public DialogPreference(final Context context, final AttributeSet set) {
        this(context, set, i.a(context, o.b.f1, 16842897));
    }
    
    public DialogPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public DialogPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o.m.j4, n, n2);
        final String o = i.o(obtainStyledAttributes, androidx.preference.o.m.t4, androidx.preference.o.m.k4);
        this.z0 = o;
        if (o == null) {
            this.z0 = this.k0();
        }
        this.A0 = i.o(obtainStyledAttributes, androidx.preference.o.m.s4, androidx.preference.o.m.l4);
        this.B0 = i.c(obtainStyledAttributes, androidx.preference.o.m.q4, androidx.preference.o.m.m4);
        this.C0 = i.o(obtainStyledAttributes, androidx.preference.o.m.v4, androidx.preference.o.m.n4);
        this.D0 = i.o(obtainStyledAttributes, androidx.preference.o.m.u4, androidx.preference.o.m.o4);
        this.E0 = i.n(obtainStyledAttributes, androidx.preference.o.m.r4, androidx.preference.o.m.p4, 0);
        obtainStyledAttributes.recycle();
    }
    
    public void B2(final int n) {
        this.C2(this.l().getString(n));
    }
    
    public void C2(final CharSequence d0) {
        this.D0 = d0;
    }
    
    public void D2(final int n) {
        this.E2(this.l().getString(n));
    }
    
    public void E2(final CharSequence c0) {
        this.C0 = c0;
    }
    
    @Override
    protected void I0() {
        this.V().I(this);
    }
    
    public Drawable i2() {
        return this.B0;
    }
    
    public int j2() {
        return this.E0;
    }
    
    public CharSequence l2() {
        return this.A0;
    }
    
    public CharSequence m2() {
        return this.z0;
    }
    
    public CharSequence n2() {
        return this.D0;
    }
    
    public CharSequence o2() {
        return this.C0;
    }
    
    public void r2(final int n) {
        this.B0 = androidx.appcompat.content.res.a.d(this.l(), n);
    }
    
    public void s2(final Drawable b0) {
        this.B0 = b0;
    }
    
    public void t2(final int e0) {
        this.E0 = e0;
    }
    
    public void v2(final int n) {
        this.w2(this.l().getString(n));
    }
    
    public void w2(final CharSequence a0) {
        this.A0 = a0;
    }
    
    public void x2(final int n) {
        this.y2(this.l().getString(n));
    }
    
    public void y2(final CharSequence z0) {
        this.z0 = z0;
    }
    
    public interface a
    {
        @k0
         <T extends Preference> T d(@j0 final CharSequence p0);
    }
}
