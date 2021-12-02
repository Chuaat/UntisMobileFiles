// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import android.text.Editable;
import com.google.android.material.internal.s;
import android.view.View$OnClickListener;
import android.content.res.Configuration;
import android.text.TextUtils;
import java.util.Arrays;
import android.text.InputFilter;
import android.os.Build$VERSION;
import android.view.View;
import android.view.ViewGroup;
import o2.a;
import android.view.LayoutInflater;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.TextView;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.chip.Chip;
import android.widget.Checkable;
import android.widget.FrameLayout;

class ChipTextInputComboView extends FrameLayout implements Checkable
{
    private final Chip G;
    private final TextInputLayout H;
    private final EditText I;
    private TextWatcher J;
    private TextView K;
    
    public ChipTextInputComboView(@j0 final Context context) {
        this(context, null);
    }
    
    public ChipTextInputComboView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ChipTextInputComboView(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        final LayoutInflater from = LayoutInflater.from(context);
        final Chip g = (Chip)from.inflate(a.k.b0, (ViewGroup)this, false);
        this.G = g;
        final TextInputLayout h = (TextInputLayout)from.inflate(a.k.c0, (ViewGroup)this, false);
        this.H = h;
        final EditText editText = h.getEditText();
        (this.I = editText).setVisibility(4);
        editText.addTextChangedListener(this.J = (TextWatcher)new b());
        this.j();
        this.addView((View)g);
        this.addView((View)h);
        this.K = (TextView)this.findViewById(a.h.w2);
        editText.setSaveEnabled(false);
    }
    
    private String d(final CharSequence charSequence) {
        return e.a(this.getResources(), charSequence);
    }
    
    private void j() {
        if (Build$VERSION.SDK_INT >= 24) {
            this.I.setImeHintLocales(this.getContext().getResources().getConfiguration().getLocales());
        }
    }
    
    public void c(final InputFilter inputFilter) {
        final InputFilter[] filters = this.I.getFilters();
        final InputFilter[] filters2 = Arrays.copyOf(filters, filters.length + 1);
        filters2[filters.length] = inputFilter;
        this.I.setFilters(filters2);
    }
    
    public TextInputLayout e() {
        return this.H;
    }
    
    public void f(final androidx.core.view.a a) {
        androidx.core.view.j0.z1((View)this.G, a);
    }
    
    public void g(final boolean cursorVisible) {
        this.I.setCursorVisible(cursorVisible);
    }
    
    public void h(final CharSequence text) {
        this.K.setText(text);
    }
    
    public void i(final CharSequence charSequence) {
        this.G.setText((CharSequence)this.d(charSequence));
        if (!TextUtils.isEmpty((CharSequence)this.I.getText())) {
            this.I.removeTextChangedListener(this.J);
            this.I.setText((CharSequence)null);
            this.I.addTextChangedListener(this.J);
        }
    }
    
    public boolean isChecked() {
        return this.G.isChecked();
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.j();
    }
    
    public void setChecked(final boolean checked) {
        this.G.setChecked(checked);
        final EditText i = this.I;
        final int n = 0;
        int visibility;
        if (checked) {
            visibility = 0;
        }
        else {
            visibility = 4;
        }
        i.setVisibility(visibility);
        final Chip g = this.G;
        int visibility2 = n;
        if (checked) {
            visibility2 = 8;
        }
        g.setVisibility(visibility2);
        if (this.isChecked()) {
            this.I.requestFocus();
            if (!TextUtils.isEmpty((CharSequence)this.I.getText())) {
                final EditText j = this.I;
                j.setSelection(j.getText().length());
            }
        }
    }
    
    public void setOnClickListener(@k0 final View$OnClickListener onClickListener) {
        this.G.setOnClickListener(onClickListener);
    }
    
    public void setTag(final int n, final Object o) {
        this.G.setTag(n, o);
    }
    
    public void toggle() {
        this.G.toggle();
    }
    
    private class b extends s
    {
        private static final String H = "00";
        
        @Override
        public void afterTextChanged(final Editable editable) {
            if (TextUtils.isEmpty((CharSequence)editable)) {
                ChipTextInputComboView.this.G.setText((CharSequence)ChipTextInputComboView.this.d("00"));
                return;
            }
            ChipTextInputComboView.this.G.setText((CharSequence)ChipTextInputComboView.this.d((CharSequence)editable));
        }
    }
}
