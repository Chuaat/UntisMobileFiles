// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.t0;
import android.view.Window;
import android.view.View$OnTouchListener;
import android.graphics.drawable.InsetDrawable;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Iterator;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.app.Dialog;
import androidx.fragment.app.a0;
import androidx.fragment.app.Fragment;
import android.content.res.TypedArray;
import com.google.android.material.resources.b;
import android.os.Parcelable;
import android.os.Bundle;
import android.view.View;
import android.content.res.Resources;
import androidx.annotation.j0;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.widget.Button;
import com.google.android.material.shape.j;
import com.google.android.material.internal.CheckableImageButton;
import android.widget.TextView;
import androidx.annotation.w0;
import androidx.annotation.k0;
import androidx.annotation.x0;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.view.View$OnClickListener;
import java.util.LinkedHashSet;
import androidx.fragment.app.DialogFragment;

public final class MaterialDatePicker<S> extends DialogFragment
{
    private static final String A0 = "CALENDAR_CONSTRAINTS_KEY";
    private static final String B0 = "TITLE_TEXT_RES_ID_KEY";
    private static final String C0 = "TITLE_TEXT_KEY";
    private static final String D0 = "INPUT_MODE_KEY";
    static final Object E0;
    static final Object F0;
    static final Object G0;
    public static final int H0 = 0;
    public static final int I0 = 1;
    private static final String y0 = "OVERRIDE_THEME_RES_ID";
    private static final String z0 = "DATE_SELECTOR_KEY";
    private final LinkedHashSet<com.google.android.material.datepicker.k<? super S>> h0;
    private final LinkedHashSet<View$OnClickListener> i0;
    private final LinkedHashSet<DialogInterface$OnCancelListener> j0;
    private final LinkedHashSet<DialogInterface$OnDismissListener> k0;
    @x0
    private int l0;
    @k0
    private com.google.android.material.datepicker.f<S> m0;
    private PickerFragment<S> n0;
    @k0
    private a o0;
    private MaterialCalendar<S> p0;
    @w0
    private int q0;
    private CharSequence r0;
    private boolean s0;
    private int t0;
    private TextView u0;
    private CheckableImageButton v0;
    @k0
    private com.google.android.material.shape.j w0;
    private Button x0;
    
    static {
        E0 = "CONFIRM_BUTTON_TAG";
        F0 = "CANCEL_BUTTON_TAG";
        G0 = "TOGGLE_BUTTON_TAG";
    }
    
    public MaterialDatePicker() {
        this.h0 = new LinkedHashSet<com.google.android.material.datepicker.k<? super S>>();
        this.i0 = new LinkedHashSet<View$OnClickListener>();
        this.j0 = new LinkedHashSet<DialogInterface$OnCancelListener>();
        this.k0 = new LinkedHashSet<DialogInterface$OnDismissListener>();
    }
    
    @j0
    private static Drawable d0(final Context context) {
        final StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[] { 16842912 }, androidx.appcompat.content.res.a.d(context, o2.a.g.S0));
        stateListDrawable.addState(new int[0], androidx.appcompat.content.res.a.d(context, o2.a.g.U0));
        return (Drawable)stateListDrawable;
    }
    
    private static int e0(@j0 final Context context) {
        final Resources resources = context.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(o2.a.f.Z3);
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(o2.a.f.a4);
        final int dimensionPixelOffset2 = resources.getDimensionPixelOffset(o2.a.f.Y3);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(o2.a.f.J3);
        final int l = n.L;
        return dimensionPixelSize + dimensionPixelOffset + dimensionPixelOffset2 + dimensionPixelSize2 + (resources.getDimensionPixelSize(o2.a.f.E3) * l + (l - 1) * resources.getDimensionPixelOffset(o2.a.f.X3)) + resources.getDimensionPixelOffset(o2.a.f.B3);
    }
    
    private static int g0(@j0 final Context context) {
        final Resources resources = context.getResources();
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(o2.a.f.C3);
        final int j = com.google.android.material.datepicker.m.g().J;
        return dimensionPixelOffset * 2 + resources.getDimensionPixelSize(o2.a.f.I3) * j + (j - 1) * resources.getDimensionPixelOffset(o2.a.f.W3);
    }
    
    private int i0(final Context context) {
        final int l0 = this.l0;
        if (l0 != 0) {
            return l0;
        }
        return this.m0.L3(context);
    }
    
    private void j0(final Context context) {
        this.v0.setTag(MaterialDatePicker.G0);
        this.v0.setImageDrawable(d0(context));
        this.v0.setChecked(this.t0 != 0);
        androidx.core.view.j0.z1((View)this.v0, null);
        this.w0(this.v0);
        this.v0.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                MaterialDatePicker.this.x0.setEnabled(MaterialDatePicker.this.m0.d4());
                MaterialDatePicker.this.v0.toggle();
                final MaterialDatePicker g = MaterialDatePicker.this;
                g.w0(g.v0);
                MaterialDatePicker.this.s0();
            }
        });
    }
    
    static boolean k0(@j0 final Context context) {
        return n0(context, 16843277);
    }
    
    static boolean l0(@j0 final Context context) {
        return n0(context, o2.a.c.Ra);
    }
    
    @j0
    static <S> MaterialDatePicker<S> m0(@j0 final e<S> e) {
        final MaterialDatePicker<S> materialDatePicker = new MaterialDatePicker<S>();
        final Bundle arguments = new Bundle();
        arguments.putInt("OVERRIDE_THEME_RES_ID", e.b);
        arguments.putParcelable("DATE_SELECTOR_KEY", (Parcelable)e.a);
        arguments.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)e.c);
        arguments.putInt("TITLE_TEXT_RES_ID_KEY", e.d);
        arguments.putCharSequence("TITLE_TEXT_KEY", e.e);
        arguments.putInt("INPUT_MODE_KEY", e.g);
        materialDatePicker.setArguments(arguments);
        return materialDatePicker;
    }
    
    static boolean n0(@j0 final Context context, final int n) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.g(context, o2.a.c.I9, MaterialCalendar.class.getCanonicalName()), new int[] { n });
        final boolean boolean1 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return boolean1;
    }
    
    private void s0() {
        final int i0 = this.i0(this.requireContext());
        this.p0 = MaterialCalendar.J(this.m0, i0, this.o0);
        Fragment n0;
        if (this.v0.isChecked()) {
            n0 = MaterialTextInputPicker.v(this.m0, i0, this.o0);
        }
        else {
            n0 = this.p0;
        }
        this.n0 = (PickerFragment<S>)n0;
        this.v0();
        final a0 r = this.getChildFragmentManager().r();
        r.D(o2.a.h.U2, this.n0);
        r.t();
        this.n0.r(new p<S>() {
            @Override
            public void a() {
                MaterialDatePicker.this.x0.setEnabled(false);
            }
            
            @Override
            public void b(final S n) {
                MaterialDatePicker.this.v0();
                MaterialDatePicker.this.x0.setEnabled(MaterialDatePicker.this.m0.d4());
            }
        });
    }
    
    public static long t0() {
        return com.google.android.material.datepicker.m.g().L;
    }
    
    public static long u0() {
        return u.t().getTimeInMillis();
    }
    
    private void v0() {
        final String f0 = this.f0();
        this.u0.setContentDescription((CharSequence)String.format(this.getString(o2.a.m.q0), f0));
        this.u0.setText((CharSequence)f0);
    }
    
    private void w0(@j0 final CheckableImageButton checkableImageButton) {
        final boolean checked = this.v0.isChecked();
        final Context context = checkableImageButton.getContext();
        int n;
        if (checked) {
            n = o2.a.m.P0;
        }
        else {
            n = o2.a.m.R0;
        }
        this.v0.setContentDescription((CharSequence)context.getString(n));
    }
    
    @j0
    @Override
    public final Dialog B(@k0 final Bundle bundle) {
        final Dialog dialog = new Dialog(this.requireContext(), this.i0(this.requireContext()));
        final Context context = dialog.getContext();
        this.s0 = k0(context);
        final int g = b.g(context, o2.a.c.P2, MaterialDatePicker.class.getCanonicalName());
        (this.w0 = new com.google.android.material.shape.j(context, null, o2.a.c.I9, o2.a.n.Eb)).Y(context);
        this.w0.n0(ColorStateList.valueOf(g));
        this.w0.m0(androidx.core.view.j0.P(dialog.getWindow().getDecorView()));
        return dialog;
    }
    
    public boolean V(final DialogInterface$OnCancelListener e) {
        return this.j0.add(e);
    }
    
    public boolean W(final DialogInterface$OnDismissListener e) {
        return this.k0.add(e);
    }
    
    public boolean X(final View$OnClickListener e) {
        return this.i0.add(e);
    }
    
    public boolean Y(final com.google.android.material.datepicker.k<? super S> e) {
        return this.h0.add(e);
    }
    
    public void Z() {
        this.j0.clear();
    }
    
    public void a0() {
        this.k0.clear();
    }
    
    public void b0() {
        this.i0.clear();
    }
    
    public void c0() {
        this.h0.clear();
    }
    
    public String f0() {
        return this.m0.N0(this.getContext());
    }
    
    @k0
    public final S h0() {
        return this.m0.O4();
    }
    
    public boolean o0(final DialogInterface$OnCancelListener o) {
        return this.j0.remove(o);
    }
    
    @Override
    public final void onCancel(@j0 final DialogInterface dialogInterface) {
        final Iterator<DialogInterface$OnCancelListener> iterator = this.j0.iterator();
        while (iterator.hasNext()) {
            iterator.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }
    
    @Override
    public final void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        this.l0 = arguments.getInt("OVERRIDE_THEME_RES_ID");
        this.m0 = (com.google.android.material.datepicker.f<S>)arguments.getParcelable("DATE_SELECTOR_KEY");
        this.o0 = (a)arguments.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.q0 = arguments.getInt("TITLE_TEXT_RES_ID_KEY");
        this.r0 = arguments.getCharSequence("TITLE_TEXT_KEY");
        this.t0 = arguments.getInt("INPUT_MODE_KEY");
    }
    
    @j0
    @Override
    public final View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        int n;
        if (this.s0) {
            n = o2.a.k.B0;
        }
        else {
            n = o2.a.k.A0;
        }
        final View inflate = layoutInflater.inflate(n, viewGroup);
        final Context context = inflate.getContext();
        if (this.s0) {
            inflate.findViewById(o2.a.h.U2).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(g0(context), -2));
        }
        else {
            final View viewById = inflate.findViewById(o2.a.h.V2);
            final View viewById2 = inflate.findViewById(o2.a.h.U2);
            viewById.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(g0(context), -1));
            viewById2.setMinimumHeight(e0(this.requireContext()));
        }
        androidx.core.view.j0.B1((View)(this.u0 = (TextView)inflate.findViewById(o2.a.h.g3)), 1);
        this.v0 = (CheckableImageButton)inflate.findViewById(o2.a.h.i3);
        final TextView textView = (TextView)inflate.findViewById(o2.a.h.m3);
        final CharSequence r0 = this.r0;
        if (r0 != null) {
            textView.setText(r0);
        }
        else {
            textView.setText(this.q0);
        }
        this.j0(context);
        this.x0 = (Button)inflate.findViewById(o2.a.h.P0);
        if (this.m0.d4()) {
            this.x0.setEnabled(true);
        }
        else {
            this.x0.setEnabled(false);
        }
        this.x0.setTag(MaterialDatePicker.E0);
        this.x0.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final Iterator iterator = MaterialDatePicker.this.h0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(MaterialDatePicker.this.h0());
                }
                MaterialDatePicker.this.u();
            }
        });
        final Button button = (Button)inflate.findViewById(o2.a.h.B0);
        button.setTag(MaterialDatePicker.F0);
        button.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final Iterator iterator = MaterialDatePicker.this.i0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().onClick(view);
                }
                MaterialDatePicker.this.u();
            }
        });
        return inflate;
    }
    
    @Override
    public final void onDismiss(@j0 final DialogInterface dialogInterface) {
        final Iterator<DialogInterface$OnDismissListener> iterator = this.k0.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDismiss(dialogInterface);
        }
        final ViewGroup viewGroup = (ViewGroup)this.getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
    
    @Override
    public final void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.l0);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable)this.m0);
        final a.b b = new a.b(this.o0);
        if (this.p0.G() != null) {
            b.c(this.p0.G().L);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)b.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.q0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.r0);
    }
    
    @Override
    public void onStart() {
        super.onStart();
        final Window window = this.F().getWindow();
        if (this.s0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable((Drawable)this.w0);
        }
        else {
            window.setLayout(-2, -2);
            final int dimensionPixelOffset = this.getResources().getDimensionPixelOffset(o2.a.f.K3);
            final Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable((Drawable)new InsetDrawable((Drawable)this.w0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener((View$OnTouchListener)new com.google.android.material.dialog.a(this.F(), rect));
        }
        this.s0();
    }
    
    @Override
    public void onStop() {
        this.n0.s();
        super.onStop();
    }
    
    public boolean p0(final DialogInterface$OnDismissListener o) {
        return this.k0.remove(o);
    }
    
    public boolean q0(final View$OnClickListener o) {
        return this.i0.remove(o);
    }
    
    public boolean r0(final com.google.android.material.datepicker.k<? super S> o) {
        return this.h0.remove(o);
    }
    
    public static final class e<S>
    {
        final com.google.android.material.datepicker.f<S> a;
        int b;
        a c;
        int d;
        CharSequence e;
        @k0
        S f;
        int g;
        
        private e(final com.google.android.material.datepicker.f<S> a) {
            this.b = 0;
            this.d = 0;
            this.e = null;
            this.f = null;
            this.g = 0;
            this.a = a;
        }
        
        private com.google.android.material.datepicker.m b() {
            final long l = this.c.j().L;
            final long i = this.c.g().L;
            if (!this.a.A4().isEmpty()) {
                final long longValue = this.a.A4().iterator().next();
                if (longValue >= l && longValue <= i) {
                    return com.google.android.material.datepicker.m.f(longValue);
                }
            }
            final long t0 = MaterialDatePicker.t0();
            long n = l;
            if (l <= t0) {
                n = l;
                if (t0 <= i) {
                    n = t0;
                }
            }
            return com.google.android.material.datepicker.m.f(n);
        }
        
        @j0
        @t0({ t0.a.H })
        public static <S> e<S> c(@j0 final com.google.android.material.datepicker.f<S> f) {
            return new e<S>(f);
        }
        
        @j0
        public static e<Long> d() {
            return new e<Long>(new com.google.android.material.datepicker.r());
        }
        
        @j0
        public static e<androidx.core.util.j<Long, Long>> e() {
            return new e<androidx.core.util.j<Long, Long>>(new q());
        }
        
        @j0
        public MaterialDatePicker<S> a() {
            if (this.c == null) {
                this.c = new a.b().a();
            }
            if (this.d == 0) {
                this.d = this.a.X2();
            }
            final S f = this.f;
            if (f != null) {
                this.a.o1(f);
            }
            if (this.c.i() == null) {
                this.c.m(this.b());
            }
            return MaterialDatePicker.m0(this);
        }
        
        @j0
        public e<S> f(final a c) {
            this.c = c;
            return this;
        }
        
        @j0
        public e<S> g(final int g) {
            this.g = g;
            return this;
        }
        
        @j0
        public e<S> h(final S f) {
            this.f = f;
            return this;
        }
        
        @j0
        public e<S> i(@x0 final int b) {
            this.b = b;
            return this;
        }
        
        @j0
        public e<S> j(@w0 final int d) {
            this.d = d;
            this.e = null;
            return this;
        }
        
        @j0
        public e<S> k(@k0 final CharSequence e) {
            this.e = e;
            this.d = 0;
            return this;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface f {
    }
}
