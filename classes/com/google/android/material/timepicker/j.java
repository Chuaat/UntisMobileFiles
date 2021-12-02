// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import androidx.core.content.d;
import android.view.inputmethod.InputMethodManager;
import java.util.Locale;
import java.lang.reflect.Field;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.l;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.text.InputFilter;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.TextView;
import o2.a;
import android.text.TextUtils;
import android.text.Editable;
import com.google.android.material.internal.s;
import com.google.android.material.button.MaterialButtonToggleGroup;
import android.widget.EditText;
import android.text.TextWatcher;
import android.widget.LinearLayout;

class j implements g, h
{
    private final LinearLayout G;
    private final com.google.android.material.timepicker.e H;
    private final TextWatcher I;
    private final TextWatcher J;
    private final ChipTextInputComboView K;
    private final ChipTextInputComboView L;
    private final i M;
    private final EditText N;
    private final EditText O;
    private MaterialButtonToggleGroup P;
    
    public j(final LinearLayout g, final com.google.android.material.timepicker.e h) {
        this.I = (TextWatcher)new s() {
            @Override
            public void afterTextChanged(final Editable editable) {
                try {
                    if (TextUtils.isEmpty((CharSequence)editable)) {
                        j.this.H.i(0);
                        return;
                    }
                    j.this.H.i(Integer.parseInt(editable.toString()));
                }
                catch (NumberFormatException ex) {}
            }
        };
        this.J = (TextWatcher)new s() {
            @Override
            public void afterTextChanged(final Editable editable) {
                try {
                    if (TextUtils.isEmpty((CharSequence)editable)) {
                        j.this.H.g(0);
                        return;
                    }
                    j.this.H.g(Integer.parseInt(editable.toString()));
                }
                catch (NumberFormatException ex) {}
            }
        };
        this.G = g;
        this.H = h;
        final Resources resources = g.getResources();
        final ChipTextInputComboView k = (ChipTextInputComboView)g.findViewById(o2.a.h.x2);
        this.K = k;
        final ChipTextInputComboView l = (ChipTextInputComboView)g.findViewById(o2.a.h.u2);
        this.L = l;
        final int w2 = o2.a.h.w2;
        final TextView textView = (TextView)k.findViewById(w2);
        final TextView textView2 = (TextView)l.findViewById(w2);
        textView.setText((CharSequence)resources.getString(a.m.g0));
        textView2.setText((CharSequence)resources.getString(a.m.f0));
        final int w3 = o2.a.h.w4;
        k.setTag(w3, 12);
        l.setTag(w3, 10);
        if (h.I == 0) {
            this.m();
        }
        final View$OnClickListener view$OnClickListener = (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                j.this.g((int)view.getTag(o2.a.h.w4));
            }
        };
        l.setOnClickListener((View$OnClickListener)view$OnClickListener);
        k.setOnClickListener((View$OnClickListener)view$OnClickListener);
        l.c((InputFilter)h.d());
        k.c((InputFilter)h.e());
        final EditText editText = l.e().getEditText();
        this.N = editText;
        final EditText editText2 = k.e().getEditText();
        this.O = editText2;
        if (Build$VERSION.SDK_INT < 21) {
            final int d = s2.a.d((View)g, o2.a.c.J2);
            k(editText, d);
            k(editText2, d);
        }
        this.M = new i(l, k, h);
        l.f(new a(g.getContext(), a.m.S));
        k.f(new a(g.getContext(), a.m.U));
        this.b();
    }
    
    private void e() {
        this.N.addTextChangedListener(this.J);
        this.O.addTextChangedListener(this.I);
    }
    
    private void i() {
        this.N.removeTextChangedListener(this.J);
        this.O.removeTextChangedListener(this.I);
    }
    
    private static void k(final EditText editText, @l final int n) {
        try {
            final Context context = editText.getContext();
            final Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            final int int1 = declaredField.getInt(editText);
            final Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            final Object value = declaredField2.get(editText);
            final Field declaredField3 = value.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            final Drawable d = androidx.appcompat.content.res.a.d(context, int1);
            d.setColorFilter(n, PorterDuff$Mode.SRC_IN);
            declaredField3.set(value, new Drawable[] { d, d });
        }
        finally {}
    }
    
    private void l(final com.google.android.material.timepicker.e e) {
        this.i();
        final Locale locale = this.G.getResources().getConfiguration().locale;
        final String format = String.format(locale, "%02d", e.K);
        final String format2 = String.format(locale, "%02d", e.c());
        this.K.i(format);
        this.L.i(format2);
        this.e();
        this.n();
    }
    
    private void m() {
        (this.P = (MaterialButtonToggleGroup)this.G.findViewById(o2.a.h.t2)).g((MaterialButtonToggleGroup.e)new MaterialButtonToggleGroup.e() {
            @Override
            public void a(final MaterialButtonToggleGroup materialButtonToggleGroup, int n, final boolean b) {
                if (n == o2.a.h.s2) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                j.this.H.j(n);
            }
        });
        this.P.setVisibility(0);
        this.n();
    }
    
    private void n() {
        final MaterialButtonToggleGroup p = this.P;
        if (p == null) {
            return;
        }
        int n;
        if (this.H.M == 0) {
            n = o2.a.h.r2;
        }
        else {
            n = o2.a.h.s2;
        }
        p.j(n);
    }
    
    @Override
    public void a() {
        this.G.setVisibility(0);
    }
    
    @Override
    public void b() {
        this.e();
        this.l(this.H);
        this.M.a();
    }
    
    @Override
    public void c() {
        this.l(this.H);
    }
    
    public void f() {
        this.K.setChecked(false);
        this.L.setChecked(false);
    }
    
    @Override
    public void g(final int l) {
        this.H.L = l;
        final ChipTextInputComboView k = this.K;
        final boolean b = true;
        k.setChecked(l == 12);
        this.L.setChecked(l == 10 && b);
        this.n();
    }
    
    @Override
    public void h() {
        final View focusedChild = this.G.getFocusedChild();
        if (focusedChild != null) {
            final InputMethodManager inputMethodManager = d.o(this.G.getContext(), InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
            }
        }
        this.G.setVisibility(8);
    }
    
    public void j() {
        final ChipTextInputComboView k = this.K;
        final int l = this.H.L;
        final boolean b = true;
        k.setChecked(l == 12);
        this.L.setChecked(this.H.L == 10 && b);
    }
}
