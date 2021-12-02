// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.textfield;

import android.view.View;
import android.view.View$OnClickListener;
import o2.a;
import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.internal.s;
import androidx.annotation.j0;
import android.text.TextWatcher;

class i extends e
{
    private final TextWatcher d;
    private final TextInputLayout.h e;
    private final TextInputLayout.i f;
    
    i(@j0 final TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = (TextWatcher)new s() {
            @Override
            public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                final i g = i.this;
                g.c.setChecked(g.g() ^ true);
            }
        };
        this.e = new TextInputLayout.h() {
            @Override
            public void a(@j0 final TextInputLayout textInputLayout) {
                final EditText editText = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(true);
                textInputLayout.setEndIconCheckable(true);
                final i a = i.this;
                a.c.setChecked(a.g() ^ true);
                editText.removeTextChangedListener(i.this.d);
                editText.addTextChangedListener(i.this.d);
            }
        };
        this.f = new TextInputLayout.i() {
            @Override
            public void a(@j0 final TextInputLayout textInputLayout, final int n) {
                final EditText editText = textInputLayout.getEditText();
                if (editText != null && n == 1) {
                    editText.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
                    editText.post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            editText.removeTextChangedListener(i.this.d);
                        }
                    });
                }
            }
        };
    }
    
    private boolean g() {
        final EditText editText = super.a.getEditText();
        return editText != null && editText.getTransformationMethod() instanceof PasswordTransformationMethod;
    }
    
    private static boolean h(final EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }
    
    @Override
    void a() {
        super.a.setEndIconDrawable(androidx.appcompat.content.res.a.d(super.b, o2.a.g.J0));
        final TextInputLayout a = super.a;
        a.setEndIconContentDescription(a.getResources().getText(o2.a.m.T0));
        super.a.setEndIconOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final EditText editText = i.this.a.getEditText();
                if (editText == null) {
                    return;
                }
                final int selectionEnd = editText.getSelectionEnd();
                Object instance;
                if (i.this.g()) {
                    instance = null;
                }
                else {
                    instance = PasswordTransformationMethod.getInstance();
                }
                editText.setTransformationMethod((TransformationMethod)instance);
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                i.this.a.i0();
            }
        });
        super.a.e(this.e);
        super.a.f(this.f);
        final EditText editText = super.a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
        }
    }
}
