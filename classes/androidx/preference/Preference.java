// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.widget.Toast;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.MenuItem;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.view.MenuItem$OnMenuItemClickListener;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.content.SharedPreferences;
import java.util.Set;
import android.view.AbsSavedState;
import android.os.Parcelable;
import androidx.core.view.accessibility.d;
import android.view.View$OnCreateContextMenuListener;
import androidx.appcompat.content.res.a;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.t0;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.text.TextUtils;
import androidx.annotation.j0;
import android.content.SharedPreferences$Editor;
import android.content.res.TypedArray;
import android.view.View;
import androidx.core.content.res.i;
import android.util.AttributeSet;
import android.view.View$OnClickListener;
import java.util.List;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import android.content.Context;

public class Preference implements Comparable<Preference>
{
    public static final int x0 = Integer.MAX_VALUE;
    private static final String y0 = "Preference";
    private Context G;
    @k0
    private l H;
    @k0
    private androidx.preference.f I;
    private long J;
    private boolean K;
    private d L;
    private e M;
    private int N;
    private int O;
    private CharSequence P;
    private CharSequence Q;
    private int R;
    private Drawable S;
    private String T;
    private Intent U;
    private String V;
    private Bundle W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean a0;
    private String b0;
    private Object c0;
    private boolean d0;
    private boolean e0;
    private boolean f0;
    private boolean g0;
    private boolean h0;
    private boolean i0;
    private boolean j0;
    private boolean k0;
    private boolean l0;
    private boolean m0;
    private int n0;
    private int o0;
    private c p0;
    private List<Preference> q0;
    private PreferenceGroup r0;
    private boolean s0;
    private boolean t0;
    private f u0;
    private g v0;
    private final View$OnClickListener w0;
    
    public Preference(final Context context) {
        this(context, null);
    }
    
    public Preference(final Context context, final AttributeSet set) {
        this(context, set, i.a(context, o.b.H3, 16842894));
    }
    
    public Preference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public Preference(final Context g, final AttributeSet set, int n, final int n2) {
        this.N = Integer.MAX_VALUE;
        this.O = 0;
        this.X = true;
        this.Y = true;
        this.a0 = true;
        this.d0 = true;
        this.e0 = true;
        this.f0 = true;
        this.g0 = true;
        this.h0 = true;
        this.j0 = true;
        this.m0 = true;
        final int l = o.j.L;
        this.n0 = l;
        this.w0 = (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                Preference.this.Y0(view);
            }
        };
        this.G = g;
        final TypedArray obtainStyledAttributes = g.obtainStyledAttributes(set, o.m.V6, n, n2);
        this.R = i.n(obtainStyledAttributes, o.m.t7, o.m.W6, 0);
        this.T = i.o(obtainStyledAttributes, o.m.w7, o.m.c7);
        this.P = i.p(obtainStyledAttributes, o.m.E7, o.m.a7);
        this.Q = i.p(obtainStyledAttributes, o.m.D7, o.m.d7);
        this.N = i.d(obtainStyledAttributes, o.m.y7, o.m.e7, Integer.MAX_VALUE);
        this.V = i.o(obtainStyledAttributes, o.m.s7, o.m.j7);
        this.n0 = i.n(obtainStyledAttributes, o.m.x7, o.m.Z6, l);
        this.o0 = i.n(obtainStyledAttributes, o.m.F7, o.m.f7, 0);
        this.X = i.b(obtainStyledAttributes, o.m.r7, o.m.Y6, true);
        this.Y = i.b(obtainStyledAttributes, o.m.A7, o.m.b7, true);
        this.a0 = i.b(obtainStyledAttributes, o.m.z7, o.m.X6, true);
        this.b0 = i.o(obtainStyledAttributes, o.m.p7, o.m.g7);
        n = o.m.m7;
        this.g0 = i.b(obtainStyledAttributes, n, n, this.Y);
        n = o.m.n7;
        this.h0 = i.b(obtainStyledAttributes, n, n, this.Y);
        n = o.m.o7;
        Label_0358: {
            if (!obtainStyledAttributes.hasValue(n)) {
                n = o.m.h7;
                if (!obtainStyledAttributes.hasValue(n)) {
                    break Label_0358;
                }
            }
            this.c0 = this.N0(obtainStyledAttributes, n);
        }
        this.m0 = i.b(obtainStyledAttributes, o.m.B7, o.m.i7, true);
        n = o.m.C7;
        final boolean hasValue = obtainStyledAttributes.hasValue(n);
        this.i0 = hasValue;
        if (hasValue) {
            this.j0 = i.b(obtainStyledAttributes, n, o.m.k7, true);
        }
        this.k0 = i.b(obtainStyledAttributes, o.m.u7, o.m.l7, false);
        n = o.m.v7;
        this.f0 = i.b(obtainStyledAttributes, n, n, true);
        n = o.m.q7;
        this.l0 = i.b(obtainStyledAttributes, n, n, false);
        obtainStyledAttributes.recycle();
    }
    
    private void d2(@j0 final SharedPreferences$Editor sharedPreferences$Editor) {
        if (this.H.H()) {
            sharedPreferences$Editor.apply();
        }
    }
    
    private void e2() {
        final String b0 = this.b0;
        if (b0 != null) {
            final Preference k = this.k(b0);
            if (k != null) {
                k.g2(this);
            }
        }
    }
    
    private void g2(final Preference preference) {
        final List<Preference> q0 = this.q0;
        if (q0 != null) {
            q0.remove(preference);
        }
    }
    
    private void h1() {
        if (TextUtils.isEmpty((CharSequence)this.b0)) {
            return;
        }
        final Preference k = this.k(this.b0);
        if (k != null) {
            k.i1(this);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Dependency \"");
        sb.append(this.b0);
        sb.append("\" not found for preference \"");
        sb.append(this.T);
        sb.append("\" (title: \"");
        sb.append((Object)this.P);
        sb.append("\"");
        throw new IllegalStateException(sb.toString());
    }
    
    private void i1(final Preference preference) {
        if (this.q0 == null) {
            this.q0 = new ArrayList<Preference>();
        }
        this.q0.add(preference);
        preference.J0(this, this.a2());
    }
    
    private void j() {
        final androidx.preference.f u = this.U();
        boolean b = true;
        if (u != null) {
            this.V0(true, this.c0);
            return;
        }
        Object c0;
        if (this.b2() && this.a0().contains(this.T)) {
            c0 = null;
        }
        else {
            c0 = this.c0;
            if (c0 == null) {
                return;
            }
            b = false;
        }
        this.V0(b, c0);
    }
    
    private void s1(final View view, final boolean enabled) {
        view.setEnabled(enabled);
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                this.s1(viewGroup.getChildAt(i), enabled);
            }
        }
    }
    
    public final int A() {
        return this.n0;
    }
    
    public void A0(final boolean b) {
        final List<Preference> q0 = this.q0;
        if (q0 == null) {
            return;
        }
        for (int size = q0.size(), i = 0; i < size; ++i) {
            q0.get(i).J0(this, b);
        }
    }
    
    public void A1(final Intent u) {
        this.U = u;
    }
    
    public d B() {
        return this.L;
    }
    
    protected void B0() {
        final c p0 = this.p0;
        if (p0 != null) {
            p0.b(this);
        }
    }
    
    public void B1(final String t) {
        this.T = t;
        if (this.Z && !this.n0()) {
            this.j1();
        }
    }
    
    public void C0() {
        this.h1();
    }
    
    public void C1(final int n0) {
        this.n0 = n0;
    }
    
    final void D1(final c p) {
        this.p0 = p;
    }
    
    public e E() {
        return this.M;
    }
    
    protected void E0(final l h) {
        this.H = h;
        if (!this.K) {
            this.J = h.h();
        }
        this.j();
    }
    
    @t0({ androidx.annotation.t0.a.I })
    protected void F0(final l l, final long j) {
        this.J = j;
        this.K = true;
        try {
            this.E0(l);
        }
        finally {
            this.K = false;
        }
    }
    
    public int G() {
        return this.N;
    }
    
    public void G0(final n n) {
        final View itemView = n.itemView;
        itemView.setOnClickListener(this.w0);
        itemView.setId(this.O);
        final TextView textView = (TextView)n.b(16908304);
        final int n2 = 8;
        Integer value = null;
        Label_0086: {
            if (textView != null) {
                final CharSequence c0 = this.c0();
                if (!TextUtils.isEmpty(c0)) {
                    textView.setText(c0);
                    textView.setVisibility(0);
                    value = textView.getCurrentTextColor();
                    break Label_0086;
                }
                textView.setVisibility(8);
            }
            value = null;
        }
        final TextView textView2 = (TextView)n.b(16908310);
        if (textView2 != null) {
            final CharSequence k0 = this.k0();
            if (!TextUtils.isEmpty(k0)) {
                textView2.setText(k0);
                textView2.setVisibility(0);
                if (this.i0) {
                    textView2.setSingleLine(this.j0);
                }
                if (!this.t0() && this.q0() && value != null) {
                    textView2.setTextColor((int)value);
                }
            }
            else {
                textView2.setVisibility(8);
            }
        }
        final ImageView imageView = (ImageView)n.b(16908294);
        if (imageView != null) {
            final int r = this.R;
            if (r != 0 || this.S != null) {
                if (this.S == null) {
                    this.S = a.d(this.G, r);
                }
                final Drawable s = this.S;
                if (s != null) {
                    imageView.setImageDrawable(s);
                }
            }
            if (this.S != null) {
                imageView.setVisibility(0);
            }
            else {
                int visibility;
                if (this.k0) {
                    visibility = 4;
                }
                else {
                    visibility = 8;
                }
                imageView.setVisibility(visibility);
            }
        }
        View view;
        if ((view = n.b(o.g.z0)) == null) {
            view = n.b(16908350);
        }
        if (view != null) {
            if (this.S != null) {
                view.setVisibility(0);
            }
            else {
                int visibility2 = n2;
                if (this.k0) {
                    visibility2 = 4;
                }
                view.setVisibility(visibility2);
            }
        }
        this.s1(itemView, !this.m0 || this.q0());
        final boolean t0 = this.t0();
        itemView.setFocusable(t0);
        itemView.setClickable(t0);
        n.e(this.g0);
        n.f(this.h0);
        final boolean o0 = this.o0();
        if (o0 && this.u0 == null) {
            this.u0 = new f(this);
        }
        Object u0;
        if (o0) {
            u0 = this.u0;
        }
        else {
            u0 = null;
        }
        itemView.setOnCreateContextMenuListener((View$OnCreateContextMenuListener)u0);
        itemView.setLongClickable(o0);
        if (o0 && !t0) {
            androidx.core.view.j0.G1(itemView, null);
        }
    }
    
    @k0
    public PreferenceGroup I() {
        return this.r0;
    }
    
    protected void I0() {
    }
    
    public void I1(final d l) {
        this.L = l;
    }
    
    public void J0(final Preference preference, final boolean b) {
        if (this.d0 == b) {
            this.d0 = (b ^ true);
            this.A0(this.a2());
            this.z0();
        }
    }
    
    public void J1(final e m) {
        this.M = m;
    }
    
    protected boolean K(final boolean b) {
        if (!this.b2()) {
            return b;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            return u.a(this.T, b);
        }
        return this.H.o().getBoolean(this.T, b);
    }
    
    public void K0() {
        this.e2();
        this.s0 = true;
    }
    
    public void K1(final int n) {
        if (n != this.N) {
            this.N = n;
            this.B0();
        }
    }
    
    protected float M(final float n) {
        if (!this.b2()) {
            return n;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            return u.b(this.T, n);
        }
        return this.H.o().getFloat(this.T, n);
    }
    
    public void M1(final boolean a0) {
        this.a0 = a0;
    }
    
    protected Object N0(final TypedArray typedArray, final int n) {
        return null;
    }
    
    public void N1(final androidx.preference.f i) {
        this.I = i;
    }
    
    protected int O(final int n) {
        if (!this.b2()) {
            return n;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            return u.c(this.T, n);
        }
        return this.H.o().getInt(this.T, n);
    }
    
    @Deprecated
    @androidx.annotation.i
    public void O0(final androidx.core.view.accessibility.d d) {
    }
    
    public void O1(final boolean y) {
        if (this.Y != y) {
            this.Y = y;
            this.z0();
        }
    }
    
    protected long P(final long n) {
        if (!this.b2()) {
            return n;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            return u.d(this.T, n);
        }
        return this.H.o().getLong(this.T, n);
    }
    
    public void P0(final Preference preference, final boolean b) {
        if (this.e0 == b) {
            this.e0 = (b ^ true);
            this.A0(this.a2());
            this.z0();
        }
    }
    
    protected String Q(final String s) {
        if (!this.b2()) {
            return s;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            return u.e(this.T, s);
        }
        return this.H.o().getString(this.T, s);
    }
    
    public void Q1(final boolean m0) {
        if (this.m0 != m0) {
            this.m0 = m0;
            this.z0();
        }
    }
    
    protected void R0() {
        this.e2();
    }
    
    public void R1(final boolean j0) {
        this.i0 = true;
        this.j0 = j0;
    }
    
    protected void S0(final Parcelable parcelable) {
        this.t0 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }
    
    public void S1(final int n) {
        this.T1(this.G.getString(n));
    }
    
    public Set<String> T(final Set<String> set) {
        if (!this.b2()) {
            return set;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            return u.f(this.T, set);
        }
        return (Set<String>)this.H.o().getStringSet(this.T, (Set)set);
    }
    
    protected Parcelable T0() {
        this.t0 = true;
        return (Parcelable)AbsSavedState.EMPTY_STATE;
    }
    
    public void T1(final CharSequence q) {
        if (this.i0() == null) {
            if (!TextUtils.equals(this.Q, q)) {
                this.Q = q;
                this.z0();
            }
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }
    
    @k0
    public androidx.preference.f U() {
        final androidx.preference.f i = this.I;
        if (i != null) {
            return i;
        }
        final l h = this.H;
        if (h != null) {
            return h.m();
        }
        return null;
    }
    
    protected void U0(@k0 final Object o) {
    }
    
    public final void U1(@k0 final g v0) {
        this.v0 = v0;
        this.z0();
    }
    
    public l V() {
        return this.H;
    }
    
    @Deprecated
    protected void V0(final boolean b, final Object o) {
        this.U0(o);
    }
    
    public void V1(final int n) {
        this.W1(this.G.getString(n));
    }
    
    public Bundle W0() {
        return this.W;
    }
    
    public void W1(final CharSequence p) {
        if ((p == null && this.P != null) || (p != null && !p.equals(this.P))) {
            this.P = p;
            this.z0();
        }
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void X0() {
        if (this.q0()) {
            if (this.t0()) {
                this.I0();
                final e m = this.M;
                if (m != null && m.a(this)) {
                    return;
                }
                final l v = this.V();
                if (v != null) {
                    final l.c k = v.k();
                    if (k != null && k.m(this)) {
                        return;
                    }
                }
                if (this.U != null) {
                    this.l().startActivity(this.U);
                }
            }
        }
    }
    
    public void X1(final int o) {
        this.O = o;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    protected void Y0(final View view) {
        this.X0();
    }
    
    public final void Y1(final boolean f0) {
        if (this.f0 != f0) {
            this.f0 = f0;
            final c p = this.p0;
            if (p != null) {
                p.d(this);
            }
        }
    }
    
    protected boolean Z0(final boolean b) {
        if (!this.b2()) {
            return false;
        }
        if (b == this.K(b ^ true)) {
            return true;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            u.g(this.T, b);
        }
        else {
            final SharedPreferences$Editor g = this.H.g();
            g.putBoolean(this.T, b);
            this.d2(g);
        }
        return true;
    }
    
    public void Z1(final int o0) {
        this.o0 = o0;
    }
    
    public SharedPreferences a0() {
        if (this.H != null && this.U() == null) {
            return this.H.o();
        }
        return null;
    }
    
    public boolean a2() {
        return this.q0() ^ true;
    }
    
    void b(@k0 final PreferenceGroup r0) {
        if (r0 != null && this.r0 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.r0 = r0;
    }
    
    public boolean b0() {
        return this.m0;
    }
    
    protected boolean b1(final float n) {
        if (!this.b2()) {
            return false;
        }
        if (n == this.M(Float.NaN)) {
            return true;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            u.h(this.T, n);
        }
        else {
            final SharedPreferences$Editor g = this.H.g();
            g.putFloat(this.T, n);
            this.d2(g);
        }
        return true;
    }
    
    protected boolean b2() {
        return this.H != null && this.s0() && this.n0();
    }
    
    public CharSequence c0() {
        if (this.i0() != null) {
            return this.i0().a(this);
        }
        return this.Q;
    }
    
    protected boolean c1(final int n) {
        if (!this.b2()) {
            return false;
        }
        if (n == this.O(~n)) {
            return true;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            u.i(this.T, n);
        }
        else {
            final SharedPreferences$Editor g = this.H.g();
            g.putInt(this.T, n);
            this.d2(g);
        }
        return true;
    }
    
    public boolean d(final Object o) {
        final d l = this.L;
        return l == null || l.a(this, o);
    }
    
    protected boolean e1(final long n) {
        if (!this.b2()) {
            return false;
        }
        if (n == this.P(~n)) {
            return true;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            u.j(this.T, n);
        }
        else {
            final SharedPreferences$Editor g = this.H.g();
            g.putLong(this.T, n);
            this.d2(g);
        }
        return true;
    }
    
    final void f() {
        this.s0 = false;
    }
    
    protected boolean f1(final String s) {
        if (!this.b2()) {
            return false;
        }
        if (TextUtils.equals((CharSequence)s, (CharSequence)this.Q(null))) {
            return true;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            u.k(this.T, s);
        }
        else {
            final SharedPreferences$Editor g = this.H.g();
            g.putString(this.T, s);
            this.d2(g);
        }
        return true;
    }
    
    public int g(@j0 final Preference preference) {
        final int n = this.N;
        final int n2 = preference.N;
        if (n != n2) {
            return n - n2;
        }
        final CharSequence p = this.P;
        final CharSequence p2 = preference.P;
        if (p == p2) {
            return 0;
        }
        if (p == null) {
            return 1;
        }
        if (p2 == null) {
            return -1;
        }
        return p.toString().compareToIgnoreCase(preference.P.toString());
    }
    
    public boolean g1(final Set<String> set) {
        if (!this.b2()) {
            return false;
        }
        if (set.equals(this.T(null))) {
            return true;
        }
        final androidx.preference.f u = this.U();
        if (u != null) {
            u.l(this.T, set);
        }
        else {
            final SharedPreferences$Editor g = this.H.g();
            g.putStringSet(this.T, (Set)set);
            this.d2(g);
        }
        return true;
    }
    
    void h(final Bundle bundle) {
        if (this.n0()) {
            final Parcelable parcelable = bundle.getParcelable(this.T);
            if (parcelable != null) {
                this.t0 = false;
                this.S0(parcelable);
                if (!this.t0) {
                    throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
                }
            }
        }
    }
    
    final boolean h2() {
        return this.s0;
    }
    
    void i(final Bundle bundle) {
        if (this.n0()) {
            this.t0 = false;
            final Parcelable t0 = this.T0();
            if (!this.t0) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (t0 != null) {
                bundle.putParcelable(this.T, t0);
            }
        }
    }
    
    @k0
    public final g i0() {
        return this.v0;
    }
    
    void j1() {
        if (!TextUtils.isEmpty((CharSequence)this.T)) {
            this.Z = true;
            return;
        }
        throw new IllegalStateException("Preference does not have a key assigned.");
    }
    
    @k0
    protected <T extends Preference> T k(@j0 final String s) {
        final l h = this.H;
        if (h == null) {
            return null;
        }
        return (T)h.b(s);
    }
    
    public CharSequence k0() {
        return this.P;
    }
    
    public Context l() {
        return this.G;
    }
    
    public final int l0() {
        return this.o0;
    }
    
    public void l1(final Bundle bundle) {
        this.h(bundle);
    }
    
    public String m() {
        return this.b0;
    }
    
    public void m1(final Bundle bundle) {
        this.i(bundle);
    }
    
    public boolean n0() {
        return TextUtils.isEmpty((CharSequence)this.T) ^ true;
    }
    
    public void n1(final boolean l0) {
        if (this.l0 != l0) {
            this.l0 = l0;
            this.z0();
        }
    }
    
    public Bundle o() {
        if (this.W == null) {
            this.W = new Bundle();
        }
        return this.W;
    }
    
    public boolean o0() {
        return this.l0;
    }
    
    public void o1(final Object c0) {
        this.c0 = c0;
    }
    
    StringBuilder p() {
        final StringBuilder sb = new StringBuilder();
        final CharSequence k0 = this.k0();
        if (!TextUtils.isEmpty(k0)) {
            sb.append(k0);
            sb.append(' ');
        }
        final CharSequence c0 = this.c0();
        if (!TextUtils.isEmpty(c0)) {
            sb.append(c0);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }
    
    public boolean q0() {
        return this.X && this.d0 && this.e0;
    }
    
    public void q1(final String b0) {
        this.e2();
        this.b0 = b0;
        this.h1();
    }
    
    public boolean r0() {
        return this.k0;
    }
    
    public void r1(final boolean x) {
        if (this.X != x) {
            this.X = x;
            this.A0(this.a2());
            this.z0();
        }
    }
    
    public String s() {
        return this.V;
    }
    
    public boolean s0() {
        return this.a0;
    }
    
    public boolean t0() {
        return this.Y;
    }
    
    @Override
    public String toString() {
        return this.p().toString();
    }
    
    public Drawable u() {
        if (this.S == null) {
            final int r = this.R;
            if (r != 0) {
                this.S = a.d(this.G, r);
            }
        }
        return this.S;
    }
    
    public final boolean u0() {
        if (!this.x0()) {
            return false;
        }
        if (this.V() == null) {
            return false;
        }
        if (this == this.V().n()) {
            return true;
        }
        final PreferenceGroup i = this.I();
        return i != null && i.u0();
    }
    
    public void u1(final String v) {
        this.V = v;
    }
    
    long v() {
        return this.J;
    }
    
    public boolean v0() {
        return this.j0;
    }
    
    public void w1(final int r) {
        this.x1(a.d(this.G, r));
        this.R = r;
    }
    
    public final boolean x0() {
        return this.f0;
    }
    
    public void x1(final Drawable s) {
        if (this.S != s) {
            this.S = s;
            this.R = 0;
            this.z0();
        }
    }
    
    public Intent y() {
        return this.U;
    }
    
    public void y1(final boolean k0) {
        if (this.k0 != k0) {
            this.k0 = k0;
            this.z0();
        }
    }
    
    public String z() {
        return this.T;
    }
    
    protected void z0() {
        final c p0 = this.p0;
        if (p0 != null) {
            p0.f(this);
        }
    }
    
    public static class b extends AbsSavedState
    {
        public static final Parcelable$Creator<b> CREATOR;
        
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
        
        public b(final Parcel parcel) {
            super(parcel);
        }
        
        public b(final Parcelable parcelable) {
            super(parcelable);
        }
    }
    
    interface c
    {
        void b(final Preference p0);
        
        void d(final Preference p0);
        
        void f(final Preference p0);
    }
    
    public interface d
    {
        boolean a(final Preference p0, final Object p1);
    }
    
    public interface e
    {
        boolean a(final Preference p0);
    }
    
    private static class f implements View$OnCreateContextMenuListener, MenuItem$OnMenuItemClickListener
    {
        private final Preference G;
        
        f(final Preference g) {
            this.G = g;
        }
        
        public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
            final CharSequence c0 = this.G.c0();
            if (this.G.o0()) {
                if (!TextUtils.isEmpty(c0)) {
                    contextMenu.setHeaderTitle(c0);
                    contextMenu.add(0, 0, 0, o.k.B).setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)this);
                }
            }
        }
        
        public boolean onMenuItemClick(final MenuItem menuItem) {
            final ClipboardManager clipboardManager = (ClipboardManager)this.G.l().getSystemService("clipboard");
            final CharSequence c0 = this.G.c0();
            clipboardManager.setPrimaryClip(ClipData.newPlainText((CharSequence)"Preference", c0));
            Toast.makeText(this.G.l(), (CharSequence)this.G.l().getString(o.k.E, new Object[] { c0 }), 0).show();
            return true;
        }
    }
    
    public interface g<T extends Preference>
    {
        CharSequence a(final T p0);
    }
}
