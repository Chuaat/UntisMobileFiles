// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.floatingactionbutton;

import android.graphics.drawable.LayerDrawable;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.content.Context;
import o2.a;
import androidx.core.util.n;
import com.google.android.material.shape.o;
import com.google.android.material.shape.j;
import android.graphics.drawable.Drawable;
import com.google.android.material.ripple.b;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import java.util.ArrayList;
import android.animation.StateListAnimator;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.view.View;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.google.android.material.shadow.c;
import androidx.annotation.p0;

@p0(21)
class e extends d
{
    e(final FloatingActionButton floatingActionButton, final c c) {
        super(floatingActionButton, c);
    }
    
    @j0
    private Animator m0(final float n, final float n2) {
        final AnimatorSet set = new AnimatorSet();
        set.play((Animator)ObjectAnimator.ofFloat((Object)super.y, "elevation", new float[] { n }).setDuration(0L)).with((Animator)ObjectAnimator.ofFloat((Object)super.y, View.TRANSLATION_Z, new float[] { n2 }).setDuration(100L));
        set.setInterpolator(com.google.android.material.floatingactionbutton.d.F);
        return (Animator)set;
    }
    
    @Override
    void A() {
    }
    
    @Override
    void C() {
        this.i0();
    }
    
    @Override
    void E(final int[] array) {
        if (Build$VERSION.SDK_INT == 21) {
            final boolean enabled = super.y.isEnabled();
            float translationZ = 0.0f;
            FloatingActionButton floatingActionButton = null;
            Label_0102: {
                if (enabled) {
                    super.y.setElevation(super.h);
                    if (super.y.isPressed()) {
                        floatingActionButton = super.y;
                        translationZ = super.j;
                        break Label_0102;
                    }
                    if (super.y.isFocused() || super.y.isHovered()) {
                        floatingActionButton = super.y;
                        translationZ = super.i;
                        break Label_0102;
                    }
                }
                else {
                    super.y.setElevation(0.0f);
                }
                floatingActionButton = super.y;
            }
            floatingActionButton.setTranslationZ(translationZ);
        }
    }
    
    @Override
    void F(final float n, final float n2, final float n3) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT == 21) {
            super.y.refreshDrawableState();
        }
        else {
            final StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.S, this.m0(n, n3));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.T, this.m0(n, n2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.U, this.m0(n, n2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.V, this.m0(n, n2));
            final AnimatorSet set = new AnimatorSet();
            final ArrayList<ObjectAnimator> list = new ArrayList<ObjectAnimator>();
            list.add(ObjectAnimator.ofFloat((Object)super.y, "elevation", new float[] { n }).setDuration(0L));
            if (sdk_INT >= 22 && sdk_INT <= 24) {
                final FloatingActionButton y = super.y;
                list.add(ObjectAnimator.ofFloat((Object)y, View.TRANSLATION_Z, new float[] { y.getTranslationZ() }).setDuration(100L));
            }
            list.add(ObjectAnimator.ofFloat((Object)super.y, View.TRANSLATION_Z, new float[] { 0.0f }).setDuration(100L));
            set.playSequentially((Animator[])list.toArray(new Animator[0]));
            set.setInterpolator(com.google.android.material.floatingactionbutton.d.F);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.W, (Animator)set);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.X, this.m0(0.0f, 0.0f));
            super.y.setStateListAnimator(stateListAnimator);
        }
        if (this.c0()) {
            this.i0();
        }
    }
    
    @Override
    boolean N() {
        return false;
    }
    
    @Override
    void Y(@k0 final ColorStateList list) {
        final Drawable c = super.c;
        if (c instanceof RippleDrawable) {
            ((RippleDrawable)c).setColor(com.google.android.material.ripple.b.d(list));
        }
        else {
            super.Y(list);
        }
    }
    
    @Override
    boolean c0() {
        return super.z.c() || !this.e0();
    }
    
    @Override
    void g0() {
    }
    
    @j0
    @Override
    com.google.android.material.shape.j j() {
        return new a(androidx.core.util.n.g(super.a));
    }
    
    @j0
    com.google.android.material.floatingactionbutton.c l0(final int n, final ColorStateList list) {
        final Context context = super.y.getContext();
        final com.google.android.material.floatingactionbutton.c c = new com.google.android.material.floatingactionbutton.c(n.g(super.a));
        c.f(androidx.core.content.d.f(context, o2.a.e.D0), androidx.core.content.d.f(context, o2.a.e.C0), androidx.core.content.d.f(context, o2.a.e.A0), androidx.core.content.d.f(context, o2.a.e.B0));
        c.e((float)n);
        c.d(list);
        return c;
    }
    
    public float n() {
        return super.y.getElevation();
    }
    
    @Override
    void s(@j0 final Rect rect) {
        if (super.z.c()) {
            super.s(rect);
        }
        else {
            int n;
            if (!this.e0()) {
                n = (super.k - super.y.getSizeDimension()) / 2;
            }
            else {
                n = 0;
            }
            rect.set(n, n, n, n);
        }
    }
    
    @Override
    void x(final ColorStateList tintList, @k0 final PorterDuff$Mode tintMode, final ColorStateList list, final int n) {
        (super.b = this.j()).setTintList(tintList);
        if (tintMode != null) {
            super.b.setTintMode(tintMode);
        }
        super.b.Y(super.y.getContext());
        Object b;
        if (n > 0) {
            super.d = this.l0(n, tintList);
            b = new LayerDrawable(new Drawable[] { n.g(super.d), n.g(super.b) });
        }
        else {
            super.d = null;
            b = super.b;
        }
        final RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.d(list), (Drawable)b, (Drawable)null);
        super.c = (Drawable)rippleDrawable;
        super.e = (Drawable)rippleDrawable;
    }
    
    static class a extends j
    {
        a(final o o) {
            super(o);
        }
        
        @Override
        public boolean isStateful() {
            return true;
        }
    }
}
