// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.textfield;

import android.view.View$OnClickListener;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.text.TextUtils;
import android.widget.EditText;
import android.view.View;
import android.text.Editable;
import androidx.annotation.j0;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import android.view.View$OnFocusChangeListener;
import android.text.TextWatcher;

class a extends e
{
    private static final int j = 100;
    private static final int k = 150;
    private static final float l = 0.8f;
    private final TextWatcher d;
    private final View$OnFocusChangeListener e;
    private final TextInputLayout.h f;
    private final TextInputLayout.i g;
    private AnimatorSet h;
    private ValueAnimator i;
    
    a(@j0 final TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = (TextWatcher)new TextWatcher() {
            public void afterTextChanged(@j0 final Editable editable) {
                if (a.this.a.getSuffixText() != null) {
                    return;
                }
                final a g = a.this;
                g.i(g.a.hasFocus() && l(editable));
            }
            
            public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
        };
        this.e = (View$OnFocusChangeListener)new View$OnFocusChangeListener() {
            public void onFocusChange(final View view, final boolean b) {
                final boolean empty = TextUtils.isEmpty((CharSequence)((EditText)view).getText());
                final boolean b2 = true;
                a.this.i((empty ^ true) && b && b2);
            }
        };
        this.f = new TextInputLayout.h() {
            @Override
            public void a(@j0 final TextInputLayout textInputLayout) {
                final EditText editText = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(editText.hasFocus() && l(editText.getText()));
                textInputLayout.setEndIconCheckable(false);
                editText.setOnFocusChangeListener(com.google.android.material.textfield.a.this.e);
                editText.removeTextChangedListener(com.google.android.material.textfield.a.this.d);
                editText.addTextChangedListener(com.google.android.material.textfield.a.this.d);
            }
        };
        this.g = new TextInputLayout.i() {
            @Override
            public void a(@j0 final TextInputLayout textInputLayout, final int n) {
                final EditText editText = textInputLayout.getEditText();
                if (editText != null && n == 2) {
                    editText.post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            editText.removeTextChangedListener(com.google.android.material.textfield.a.this.d);
                        }
                    });
                    if (editText.getOnFocusChangeListener() == com.google.android.material.textfield.a.this.e) {
                        editText.setOnFocusChangeListener((View$OnFocusChangeListener)null);
                    }
                }
            }
        };
    }
    
    private void i(final boolean b) {
        final boolean b2 = super.a.P() == b;
        if (b && !this.h.isRunning()) {
            this.i.cancel();
            this.h.start();
            if (b2) {
                this.h.end();
            }
        }
        else if (!b) {
            this.h.cancel();
            this.i.start();
            if (b2) {
                this.i.end();
            }
        }
    }
    
    private ValueAnimator j(final float... array) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(array);
        ofFloat.setInterpolator(com.google.android.material.animation.a.a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                com.google.android.material.textfield.a.this.c.setAlpha((float)valueAnimator.getAnimatedValue());
            }
        });
        return ofFloat;
    }
    
    private ValueAnimator k() {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.8f, 1.0f });
        ofFloat.setInterpolator(com.google.android.material.animation.a.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                final float floatValue = (float)valueAnimator.getAnimatedValue();
                com.google.android.material.textfield.a.this.c.setScaleX(floatValue);
                com.google.android.material.textfield.a.this.c.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
    
    private static boolean l(@j0 final Editable editable) {
        return editable.length() > 0;
    }
    
    private void m() {
        (this.h = new AnimatorSet()).playTogether(new Animator[] { (Animator)this.k(), (Animator)this.j(0.0f, 1.0f) });
        this.h.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationStart(final Animator animator) {
                com.google.android.material.textfield.a.this.a.setEndIconVisible(true);
            }
        });
        (this.i = this.j(1.0f, 0.0f)).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                com.google.android.material.textfield.a.this.a.setEndIconVisible(false);
            }
        });
    }
    
    @Override
    void a() {
        super.a.setEndIconDrawable(androidx.appcompat.content.res.a.d(super.b, o2.a.g.f1));
        final TextInputLayout a = super.a;
        a.setEndIconContentDescription(a.getResources().getText(o2.a.m.I));
        super.a.setEndIconOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final Editable text = a.this.a.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
                a.this.a.i0();
            }
        });
        super.a.e(this.f);
        super.a.f(this.g);
        this.m();
    }
    
    @Override
    void c(final boolean b) {
        if (super.a.getSuffixText() == null) {
            return;
        }
        this.i(b);
    }
}
