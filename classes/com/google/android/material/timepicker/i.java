// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import android.text.TextUtils;
import android.text.Editable;
import android.widget.EditText;
import android.view.KeyEvent;
import android.view.View$OnKeyListener;
import android.widget.TextView$OnEditorActionListener;

class i implements TextView$OnEditorActionListener, View$OnKeyListener
{
    private final ChipTextInputComboView G;
    private final ChipTextInputComboView H;
    private final e I;
    private boolean J;
    
    i(final ChipTextInputComboView g, final ChipTextInputComboView h, final e i) {
        this.J = false;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    private void b(final int l) {
        final ChipTextInputComboView h = this.H;
        final boolean b = true;
        h.setChecked(l == 12);
        this.G.setChecked(l == 10 && b);
        this.I.L = l;
    }
    
    private boolean c(int n, final KeyEvent keyEvent, final EditText editText) {
        final Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (n >= 7 && n <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.b(12);
            return true;
        }
        return false;
    }
    
    private boolean d(int n, final KeyEvent keyEvent, final EditText editText) {
        if (n == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty((CharSequence)editText.getText())) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.b(10);
            return true;
        }
        return false;
    }
    
    public void a() {
        final TextInputLayout e = this.G.e();
        final TextInputLayout e2 = this.H.e();
        final EditText editText = e.getEditText();
        final EditText editText2 = e2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener((TextView$OnEditorActionListener)this);
        editText.setOnKeyListener((View$OnKeyListener)this);
        editText2.setOnKeyListener((View$OnKeyListener)this);
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        final boolean b = n == 5;
        if (b) {
            this.b(12);
        }
        return b;
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (this.J) {
            return false;
        }
        this.J = true;
        final EditText editText = (EditText)view;
        boolean b;
        if (this.I.L == 12) {
            b = this.d(n, keyEvent, editText);
        }
        else {
            b = this.c(n, keyEvent, editText);
        }
        this.J = false;
        return b;
    }
}
