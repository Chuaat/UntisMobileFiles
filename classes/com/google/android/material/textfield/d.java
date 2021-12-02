// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.textfield;

import android.view.View$OnClickListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.content.res.ColorStateList;
import o2.a;
import android.view.MotionEvent;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.shape.o;
import android.widget.AutoCompleteTextView$OnDismissListener;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Spinner;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.text.Editable;
import com.google.android.material.internal.s;
import androidx.annotation.j0;
import android.os.Build$VERSION;
import android.animation.ValueAnimator;
import androidx.annotation.k0;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.shape.j;
import android.graphics.drawable.StateListDrawable;
import android.annotation.SuppressLint;
import android.view.View$OnFocusChangeListener;
import android.text.TextWatcher;

class d extends e
{
    private static final boolean q;
    private static final int r = 50;
    private static final int s = 67;
    private final TextWatcher d;
    private final View$OnFocusChangeListener e;
    private final TextInputLayout.e f;
    private final TextInputLayout.h g;
    @SuppressLint({ "ClickableViewAccessibility" })
    private final TextInputLayout.i h;
    private boolean i;
    private boolean j;
    private long k;
    private StateListDrawable l;
    private j m;
    @k0
    private AccessibilityManager n;
    private ValueAnimator o;
    private ValueAnimator p;
    
    static {
        q = (Build$VERSION.SDK_INT >= 21);
    }
    
    d(@j0 final TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = (TextWatcher)new s() {
            @Override
            public void afterTextChanged(final Editable editable) {
                final AutoCompleteTextView e = y(com.google.android.material.textfield.d.this.a.getEditText());
                if (com.google.android.material.textfield.d.this.n.isTouchExplorationEnabled() && D((EditText)e) && !com.google.android.material.textfield.d.this.c.hasFocus()) {
                    e.dismissDropDown();
                }
                e.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        final boolean popupShowing = e.isPopupShowing();
                        com.google.android.material.textfield.d.this.E(popupShowing);
                        com.google.android.material.textfield.d.this.i = popupShowing;
                    }
                });
            }
        };
        this.e = (View$OnFocusChangeListener)new View$OnFocusChangeListener() {
            public void onFocusChange(final View view, final boolean endIconActivated) {
                com.google.android.material.textfield.d.this.a.setEndIconActivated(endIconActivated);
                if (!endIconActivated) {
                    com.google.android.material.textfield.d.this.E(false);
                    com.google.android.material.textfield.d.this.i = false;
                }
            }
        };
        this.f = new TextInputLayout.e(super.a) {
            @Override
            public void g(final View view, @j0 final androidx.core.view.accessibility.d d) {
                super.g(view, d);
                if (!D(d.this.a.getEditText())) {
                    d.U0(Spinner.class.getName());
                }
                if (d.y0()) {
                    d.j1(null);
                }
            }
            
            @Override
            public void h(final View view, @j0 final AccessibilityEvent accessibilityEvent) {
                super.h(view, accessibilityEvent);
                final AutoCompleteTextView e = y(d.this.a.getEditText());
                if (accessibilityEvent.getEventType() == 1 && d.this.n.isTouchExplorationEnabled() && !D(d.this.a.getEditText())) {
                    d.this.H(e);
                }
            }
        };
        this.g = new TextInputLayout.h() {
            @Override
            public void a(@j0 final TextInputLayout textInputLayout) {
                final AutoCompleteTextView e = y(textInputLayout.getEditText());
                com.google.android.material.textfield.d.this.F(e);
                com.google.android.material.textfield.d.this.v(e);
                com.google.android.material.textfield.d.this.G(e);
                e.setThreshold(0);
                e.removeTextChangedListener(com.google.android.material.textfield.d.this.d);
                e.addTextChangedListener(com.google.android.material.textfield.d.this.d);
                textInputLayout.setEndIconCheckable(true);
                textInputLayout.setErrorIconDrawable(null);
                if (!D((EditText)e)) {
                    androidx.core.view.j0.P1((View)com.google.android.material.textfield.d.this.c, 2);
                }
                textInputLayout.setTextInputAccessibilityDelegate(com.google.android.material.textfield.d.this.f);
                textInputLayout.setEndIconVisible(true);
            }
        };
        this.h = new TextInputLayout.i() {
            @Override
            public void a(@j0 final TextInputLayout textInputLayout, final int n) {
                final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)textInputLayout.getEditText();
                if (autoCompleteTextView != null && n == 3) {
                    autoCompleteTextView.post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            autoCompleteTextView.removeTextChangedListener(com.google.android.material.textfield.d.this.d);
                        }
                    });
                    if (autoCompleteTextView.getOnFocusChangeListener() == com.google.android.material.textfield.d.this.e) {
                        autoCompleteTextView.setOnFocusChangeListener((View$OnFocusChangeListener)null);
                    }
                    autoCompleteTextView.setOnTouchListener((View$OnTouchListener)null);
                    if (com.google.android.material.textfield.d.q) {
                        autoCompleteTextView.setOnDismissListener((AutoCompleteTextView$OnDismissListener)null);
                    }
                }
            }
        };
        this.i = false;
        this.j = false;
        this.k = Long.MAX_VALUE;
    }
    
    private j A(final float n, final float n2, final float n3, final int n4) {
        final o m = com.google.android.material.shape.o.a().K(n).P(n).x(n2).C(n2).m();
        final j n5 = com.google.android.material.shape.j.n(super.b, n3);
        n5.setShapeAppearanceModel(m);
        n5.p0(0, n4, 0, n4);
        return n5;
    }
    
    private void B() {
        this.p = this.z(67, 0.0f, 1.0f);
        (this.o = this.z(50, 1.0f, 0.0f)).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                final d a = com.google.android.material.textfield.d.this;
                a.c.setChecked(a.j);
                com.google.android.material.textfield.d.this.p.start();
            }
        });
    }
    
    private boolean C() {
        final long n = System.currentTimeMillis() - this.k;
        return n < 0L || n > 300L;
    }
    
    private static boolean D(@j0 final EditText editText) {
        return editText.getKeyListener() != null;
    }
    
    private void E(final boolean j) {
        if (this.j != j) {
            this.j = j;
            this.p.cancel();
            this.o.start();
        }
    }
    
    private void F(@j0 final AutoCompleteTextView autoCompleteTextView) {
        if (com.google.android.material.textfield.d.q) {
            final int boxBackgroundMode = super.a.getBoxBackgroundMode();
            Object dropDownBackgroundDrawable;
            if (boxBackgroundMode == 2) {
                dropDownBackgroundDrawable = this.m;
            }
            else {
                if (boxBackgroundMode != 1) {
                    return;
                }
                dropDownBackgroundDrawable = this.l;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable((Drawable)dropDownBackgroundDrawable);
        }
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    private void G(@j0 final AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener((View$OnTouchListener)new View$OnTouchListener() {
            public boolean onTouch(@j0 final View view, @j0 final MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (com.google.android.material.textfield.d.this.C()) {
                        com.google.android.material.textfield.d.this.i = false;
                    }
                    com.google.android.material.textfield.d.this.H(autoCompleteTextView);
                }
                return false;
            }
        });
        autoCompleteTextView.setOnFocusChangeListener(this.e);
        if (com.google.android.material.textfield.d.q) {
            autoCompleteTextView.setOnDismissListener((AutoCompleteTextView$OnDismissListener)new AutoCompleteTextView$OnDismissListener() {
                public void onDismiss() {
                    com.google.android.material.textfield.d.this.i = true;
                    com.google.android.material.textfield.d.this.k = System.currentTimeMillis();
                    com.google.android.material.textfield.d.this.E(false);
                }
            });
        }
    }
    
    private void H(@k0 final AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (this.C()) {
            this.i = false;
        }
        if (!this.i) {
            if (com.google.android.material.textfield.d.q) {
                this.E(this.j ^ true);
            }
            else {
                this.j ^= true;
                super.c.toggle();
            }
            if (this.j) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
            }
            else {
                autoCompleteTextView.dismissDropDown();
            }
        }
        else {
            this.i = false;
        }
    }
    
    private void v(@j0 final AutoCompleteTextView autoCompleteTextView) {
        if (D((EditText)autoCompleteTextView)) {
            return;
        }
        final int boxBackgroundMode = super.a.getBoxBackgroundMode();
        final j boxBackground = super.a.getBoxBackground();
        final int d = s2.a.d((View)autoCompleteTextView, o2.a.c.A2);
        final int[][] array = { { 16842919 }, new int[0] };
        if (boxBackgroundMode == 2) {
            this.x(autoCompleteTextView, d, array, boxBackground);
        }
        else if (boxBackgroundMode == 1) {
            this.w(autoCompleteTextView, d, array, boxBackground);
        }
    }
    
    private void w(@j0 final AutoCompleteTextView autoCompleteTextView, int n, final int[][] array, @j0 final j j) {
        final int boxBackgroundColor = super.a.getBoxBackgroundColor();
        n = s2.a.h(n, boxBackgroundColor, 0.1f);
        final int[] array2 = { n, boxBackgroundColor };
        if (com.google.android.material.textfield.d.q) {
            androidx.core.view.j0.G1((View)autoCompleteTextView, (Drawable)new RippleDrawable(new ColorStateList(array, array2), (Drawable)j, (Drawable)j));
        }
        else {
            final j i = new j(j.getShapeAppearanceModel());
            i.n0(new ColorStateList(array, array2));
            final LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { j, i });
            final int j2 = androidx.core.view.j0.j0((View)autoCompleteTextView);
            n = autoCompleteTextView.getPaddingTop();
            final int i2 = androidx.core.view.j0.i0((View)autoCompleteTextView);
            final int paddingBottom = autoCompleteTextView.getPaddingBottom();
            androidx.core.view.j0.G1((View)autoCompleteTextView, (Drawable)layerDrawable);
            androidx.core.view.j0.b2((View)autoCompleteTextView, j2, n, i2, paddingBottom);
        }
    }
    
    private void x(@j0 final AutoCompleteTextView autoCompleteTextView, int h, final int[][] array, @j0 final j j) {
        final int d = s2.a.d((View)autoCompleteTextView, o2.a.c.P2);
        final j i = new j(j.getShapeAppearanceModel());
        h = s2.a.h(h, d, 0.1f);
        i.n0(new ColorStateList(array, new int[] { h, 0 }));
        LayerDrawable layerDrawable;
        if (com.google.android.material.textfield.d.q) {
            i.setTint(d);
            final ColorStateList list = new ColorStateList(array, new int[] { h, d });
            final j k = new j(j.getShapeAppearanceModel());
            k.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)new RippleDrawable(list, (Drawable)i, (Drawable)k), j });
        }
        else {
            layerDrawable = new LayerDrawable(new Drawable[] { i, j });
        }
        androidx.core.view.j0.G1((View)autoCompleteTextView, (Drawable)layerDrawable);
    }
    
    @j0
    private static AutoCompleteTextView y(final EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView)editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }
    
    private ValueAnimator z(final int n, final float... array) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(array);
        ofFloat.setInterpolator(com.google.android.material.animation.a.a);
        ofFloat.setDuration((long)n);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                com.google.android.material.textfield.d.this.c.setAlpha((float)valueAnimator.getAnimatedValue());
            }
        });
        return ofFloat;
    }
    
    @Override
    void a() {
        final float n = (float)super.b.getResources().getDimensionPixelOffset(o2.a.f.M5);
        final float n2 = (float)super.b.getResources().getDimensionPixelOffset(o2.a.f.x4);
        final int dimensionPixelOffset = super.b.getResources().getDimensionPixelOffset(o2.a.f.z4);
        final j a = this.A(n, n, n2, dimensionPixelOffset);
        final j a2 = this.A(0.0f, n, n2, dimensionPixelOffset);
        this.m = a;
        (this.l = new StateListDrawable()).addState(new int[] { 16842922 }, (Drawable)a);
        this.l.addState(new int[0], (Drawable)a2);
        int n3;
        if (com.google.android.material.textfield.d.q) {
            n3 = o2.a.g.c1;
        }
        else {
            n3 = o2.a.g.d1;
        }
        super.a.setEndIconDrawable(androidx.appcompat.content.res.a.d(super.b, n3));
        final TextInputLayout a3 = super.a;
        a3.setEndIconContentDescription(a3.getResources().getText(o2.a.m.K));
        super.a.setEndIconOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                com.google.android.material.textfield.d.this.H((AutoCompleteTextView)com.google.android.material.textfield.d.this.a.getEditText());
            }
        });
        super.a.e(this.g);
        super.a.f(this.h);
        this.B();
        this.n = (AccessibilityManager)super.b.getSystemService("accessibility");
    }
    
    @Override
    boolean b(final int n) {
        return n != 0;
    }
    
    @Override
    boolean d() {
        return true;
    }
}
