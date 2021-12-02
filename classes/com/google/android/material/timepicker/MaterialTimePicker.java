// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import androidx.annotation.w0;
import androidx.annotation.x0;
import android.widget.Button;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Iterator;
import android.content.DialogInterface;
import androidx.annotation.b0;
import android.view.Window;
import android.content.res.TypedArray;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.app.Dialog;
import android.os.Parcelable;
import android.os.Bundle;
import androidx.annotation.j0;
import android.widget.LinearLayout;
import android.util.TypedValue;
import com.google.android.material.resources.b;
import o2.a;
import android.util.Pair;
import java.util.LinkedHashSet;
import com.google.android.material.button.MaterialButton;
import androidx.annotation.s;
import androidx.annotation.k0;
import android.view.ViewStub;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.view.View$OnClickListener;
import java.util.Set;
import androidx.fragment.app.DialogFragment;

public final class MaterialTimePicker extends DialogFragment
{
    static final String A0 = "TIME_PICKER_TIME_MODEL";
    static final String B0 = "TIME_PICKER_INPUT_MODE";
    static final String C0 = "TIME_PICKER_TITLE_RES";
    static final String D0 = "TIME_PICKER_TITLE_TEXT";
    static final String E0 = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    public static final int y0 = 0;
    public static final int z0 = 1;
    private final Set<View$OnClickListener> h0;
    private final Set<View$OnClickListener> i0;
    private final Set<DialogInterface$OnCancelListener> j0;
    private final Set<DialogInterface$OnDismissListener> k0;
    private TimePickerView l0;
    private ViewStub m0;
    @k0
    private f n0;
    @k0
    private com.google.android.material.timepicker.j o0;
    @k0
    private h p0;
    @s
    private int q0;
    @s
    private int r0;
    private int s0;
    private String t0;
    private MaterialButton u0;
    private int v0;
    private com.google.android.material.timepicker.e w0;
    private int x0;
    
    public MaterialTimePicker() {
        this.h0 = new LinkedHashSet<View$OnClickListener>();
        this.i0 = new LinkedHashSet<View$OnClickListener>();
        this.j0 = new LinkedHashSet<DialogInterface$OnCancelListener>();
        this.k0 = new LinkedHashSet<DialogInterface$OnDismissListener>();
        this.s0 = 0;
        this.v0 = 0;
        this.x0 = 0;
    }
    
    private Pair<Integer, Integer> d0(final int i) {
        if (i == 0) {
            return (Pair<Integer, Integer>)new Pair((Object)this.q0, (Object)a.m.j0);
        }
        if (i == 1) {
            return (Pair<Integer, Integer>)new Pair((Object)this.r0, (Object)a.m.e0);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no icon for mode: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private int h0() {
        final int x0 = this.x0;
        if (x0 != 0) {
            return x0;
        }
        final TypedValue a = b.a(this.requireContext(), o2.a.c.Q9);
        int data;
        if (a == null) {
            data = 0;
        }
        else {
            data = a.data;
        }
        return data;
    }
    
    private h j0(final int n) {
        if (n == 0) {
            f n2;
            if ((n2 = this.n0) == null) {
                n2 = new f(this.l0, this.w0);
            }
            return this.n0 = n2;
        }
        if (this.o0 == null) {
            this.o0 = new com.google.android.material.timepicker.j((LinearLayout)this.m0.inflate(), this.w0);
        }
        this.o0.f();
        return this.o0;
    }
    
    @j0
    private static MaterialTimePicker k0(@j0 final e e) {
        final MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        final Bundle arguments = new Bundle();
        arguments.putParcelable("TIME_PICKER_TIME_MODEL", (Parcelable)e.a);
        arguments.putInt("TIME_PICKER_INPUT_MODE", e.b);
        arguments.putInt("TIME_PICKER_TITLE_RES", e.c);
        arguments.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", e.e);
        if (e.d != null) {
            arguments.putString("TIME_PICKER_TITLE_TEXT", e.d.toString());
        }
        materialTimePicker.setArguments(arguments);
        return materialTimePicker;
    }
    
    private void p0(@k0 final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ((this.w0 = (com.google.android.material.timepicker.e)bundle.getParcelable("TIME_PICKER_TIME_MODEL")) == null) {
            this.w0 = new com.google.android.material.timepicker.e();
        }
        this.v0 = bundle.getInt("TIME_PICKER_INPUT_MODE", 0);
        this.s0 = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.t0 = bundle.getString("TIME_PICKER_TITLE_TEXT");
        this.x0 = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }
    
    private void q0(final MaterialButton materialButton) {
        final h p = this.p0;
        if (p != null) {
            p.h();
        }
        (this.p0 = this.j0(this.v0)).a();
        this.p0.c();
        final Pair<Integer, Integer> d0 = this.d0(this.v0);
        materialButton.setIconResource((int)d0.first);
        materialButton.setContentDescription((CharSequence)this.getResources().getString((int)d0.second));
    }
    
    @j0
    @Override
    public final Dialog B(@k0 final Bundle bundle) {
        final Dialog dialog = new Dialog(this.requireContext(), this.h0());
        final Context context = dialog.getContext();
        final int g = b.g(context, a.c.P2, MaterialTimePicker.class.getCanonicalName());
        final int p = a.c.P9;
        final int gc = a.n.Gc;
        final com.google.android.material.shape.j backgroundDrawable = new com.google.android.material.shape.j(context, null, p, gc);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, a.o.Sl, p, gc);
        this.r0 = obtainStyledAttributes.getResourceId(a.o.Tl, 0);
        this.q0 = obtainStyledAttributes.getResourceId(a.o.Ul, 0);
        obtainStyledAttributes.recycle();
        backgroundDrawable.Y(context);
        backgroundDrawable.n0(ColorStateList.valueOf(g));
        final Window window = dialog.getWindow();
        window.setBackgroundDrawable((Drawable)backgroundDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        return dialog;
    }
    
    public boolean V(@j0 final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        return this.j0.add(dialogInterface$OnCancelListener);
    }
    
    public boolean W(@j0 final DialogInterface$OnDismissListener dialogInterface$OnDismissListener) {
        return this.k0.add(dialogInterface$OnDismissListener);
    }
    
    public boolean X(@j0 final View$OnClickListener view$OnClickListener) {
        return this.i0.add(view$OnClickListener);
    }
    
    public boolean Y(@j0 final View$OnClickListener view$OnClickListener) {
        return this.h0.add(view$OnClickListener);
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
    
    @b0(from = 0L, to = 23L)
    public int e0() {
        return this.w0.J % 24;
    }
    
    public int f0() {
        return this.v0;
    }
    
    @b0(from = 0L, to = 60L)
    public int g0() {
        return this.w0.K;
    }
    
    @k0
    f i0() {
        return this.n0;
    }
    
    public boolean l0(@j0 final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        return this.j0.remove(dialogInterface$OnCancelListener);
    }
    
    public boolean m0(@j0 final DialogInterface$OnDismissListener dialogInterface$OnDismissListener) {
        return this.k0.remove(dialogInterface$OnDismissListener);
    }
    
    public boolean n0(@j0 final View$OnClickListener view$OnClickListener) {
        return this.i0.remove(view$OnClickListener);
    }
    
    public boolean o0(@j0 final View$OnClickListener view$OnClickListener) {
        return this.h0.remove(view$OnClickListener);
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
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        this.p0(arguments);
    }
    
    @j0
    @Override
    public final View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final ViewGroup viewGroup2 = (ViewGroup)layoutInflater.inflate(a.k.e0, viewGroup);
        (this.l0 = (TimePickerView)viewGroup2.findViewById(a.h.F2)).R((TimePickerView.e)new TimePickerView.e() {
            @Override
            public void a() {
                MaterialTimePicker.this.v0 = 1;
                final MaterialTimePicker a = MaterialTimePicker.this;
                a.q0(a.u0);
                MaterialTimePicker.this.o0.j();
            }
        });
        this.m0 = (ViewStub)viewGroup2.findViewById(a.h.z2);
        this.u0 = (MaterialButton)viewGroup2.findViewById(a.h.D2);
        final TextView textView = (TextView)viewGroup2.findViewById(a.h.P1);
        if (!TextUtils.isEmpty((CharSequence)this.t0)) {
            textView.setText((CharSequence)this.t0);
        }
        final int s0 = this.s0;
        if (s0 != 0) {
            textView.setText(s0);
        }
        this.q0(this.u0);
        ((Button)viewGroup2.findViewById(a.h.E2)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final Iterator<View$OnClickListener> iterator = MaterialTimePicker.this.h0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().onClick(view);
                }
                MaterialTimePicker.this.u();
            }
        });
        ((Button)viewGroup2.findViewById(a.h.A2)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final Iterator<View$OnClickListener> iterator = MaterialTimePicker.this.i0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().onClick(view);
                }
                MaterialTimePicker.this.u();
            }
        });
        this.u0.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final MaterialTimePicker g = MaterialTimePicker.this;
                int n;
                if (g.v0 == 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                g.v0 = n;
                final MaterialTimePicker g2 = MaterialTimePicker.this;
                g2.q0(g2.u0);
            }
        });
        return (View)viewGroup2;
    }
    
    @Override
    public final void onDismiss(@j0 final DialogInterface dialogInterface) {
        final Iterator<DialogInterface$OnDismissListener> iterator = this.k0.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
    
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", (Parcelable)this.w0);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.v0);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.s0);
        bundle.putString("TIME_PICKER_TITLE_TEXT", this.t0);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.x0);
    }
    
    @Override
    public void onStop() {
        super.onStop();
        this.p0 = null;
        this.n0 = null;
        this.o0 = null;
        this.l0 = null;
    }
    
    public static final class e
    {
        private com.google.android.material.timepicker.e a;
        private int b;
        private int c;
        private CharSequence d;
        private int e;
        
        public e() {
            this.a = new com.google.android.material.timepicker.e();
            this.c = 0;
            this.e = 0;
        }
        
        @j0
        public MaterialTimePicker f() {
            return k0(this);
        }
        
        @j0
        public e g(@b0(from = 0L, to = 23L) final int n) {
            this.a.h(n);
            return this;
        }
        
        @j0
        public e h(final int b) {
            this.b = b;
            return this;
        }
        
        @j0
        public e i(@b0(from = 0L, to = 60L) final int n) {
            this.a.i(n);
            return this;
        }
        
        @j0
        public e j(@x0 final int e) {
            this.e = e;
            return this;
        }
        
        @j0
        public e k(final int n) {
            final com.google.android.material.timepicker.e a = this.a;
            final int j = a.J;
            (this.a = new com.google.android.material.timepicker.e(n)).i(a.K);
            this.a.h(j);
            return this;
        }
        
        @j0
        public e l(@w0 final int c) {
            this.c = c;
            return this;
        }
        
        @j0
        public e m(@k0 final CharSequence d) {
            this.d = d;
            return this;
        }
    }
}
