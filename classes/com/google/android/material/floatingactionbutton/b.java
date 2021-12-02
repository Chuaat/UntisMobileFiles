// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import android.animation.ObjectAnimator;
import java.util.List;
import android.animation.AnimatorSet;
import androidx.core.util.n;
import androidx.annotation.i;
import androidx.annotation.k0;
import com.google.android.material.animation.h;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import androidx.annotation.j0;
import android.content.Context;

abstract class b implements f
{
    private final Context a;
    @j0
    private final ExtendedFloatingActionButton b;
    private final ArrayList<Animator$AnimatorListener> c;
    private final a d;
    @k0
    private h e;
    @k0
    private h f;
    
    b(@j0 final ExtendedFloatingActionButton b, final a d) {
        this.c = new ArrayList<Animator$AnimatorListener>();
        this.b = b;
        this.a = b.getContext();
        this.d = d;
    }
    
    @i
    @Override
    public void a() {
        this.d.b();
    }
    
    @Override
    public final h b() {
        final h f = this.f;
        if (f != null) {
            return f;
        }
        if (this.e == null) {
            this.e = h.d(this.a, this.c());
        }
        return n.g(this.e);
    }
    
    @k0
    @Override
    public h e() {
        return this.f;
    }
    
    @Override
    public final void g(@j0 final Animator$AnimatorListener o) {
        this.c.remove(o);
    }
    
    @Override
    public final void h(@j0 final Animator$AnimatorListener e) {
        this.c.add(e);
    }
    
    @i
    @Override
    public void i() {
        this.d.b();
    }
    
    @Override
    public final void j(@k0 final h f) {
        this.f = f;
    }
    
    @Override
    public AnimatorSet k() {
        return this.o(this.b());
    }
    
    @j0
    @Override
    public final List<Animator$AnimatorListener> l() {
        return this.c;
    }
    
    @j0
    AnimatorSet o(@j0 final h h) {
        final ArrayList<ObjectAnimator> list = new ArrayList<ObjectAnimator>();
        if (h.j("opacity")) {
            list.add(h.f("opacity", this.b, (android.util.Property<ExtendedFloatingActionButton, ?>)View.ALPHA));
        }
        if (h.j("scale")) {
            list.add(h.f("scale", this.b, (android.util.Property<ExtendedFloatingActionButton, ?>)View.SCALE_Y));
            list.add(h.f("scale", this.b, (android.util.Property<ExtendedFloatingActionButton, ?>)View.SCALE_X));
        }
        if (h.j("width")) {
            list.add(h.f("width", this.b, (android.util.Property<Object, ?>)ExtendedFloatingActionButton.A0));
        }
        if (h.j("height")) {
            list.add(h.f("height", this.b, (android.util.Property<Object, ?>)ExtendedFloatingActionButton.B0));
        }
        if (h.j("paddingStart")) {
            list.add(h.f("paddingStart", this.b, (android.util.Property<Object, ?>)ExtendedFloatingActionButton.C0));
        }
        if (h.j("paddingEnd")) {
            list.add(h.f("paddingEnd", this.b, (android.util.Property<Object, ?>)ExtendedFloatingActionButton.D0));
        }
        if (h.j("labelOpacity")) {
            list.add(h.f("labelOpacity", this.b, new Property<ExtendedFloatingActionButton, Float>(Float.class, "LABEL_OPACITY_PROPERTY") {
                public Float a(final ExtendedFloatingActionButton extendedFloatingActionButton) {
                    return com.google.android.material.animation.a.a(0.0f, 1.0f, Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f / Color.alpha(extendedFloatingActionButton.v0.getColorForState(extendedFloatingActionButton.getDrawableState(), com.google.android.material.floatingactionbutton.b.this.b.v0.getDefaultColor())));
                }
                
                public void b(final ExtendedFloatingActionButton extendedFloatingActionButton, final Float n) {
                    final int colorForState = extendedFloatingActionButton.v0.getColorForState(extendedFloatingActionButton.getDrawableState(), com.google.android.material.floatingactionbutton.b.this.b.v0.getDefaultColor());
                    final ColorStateList value = ColorStateList.valueOf(Color.argb((int)(com.google.android.material.animation.a.a(0.0f, Color.alpha(colorForState) / 255.0f, n) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (n == 1.0f) {
                        extendedFloatingActionButton.V(extendedFloatingActionButton.v0);
                    }
                    else {
                        extendedFloatingActionButton.V(value);
                    }
                }
            }));
        }
        final AnimatorSet set = new AnimatorSet();
        com.google.android.material.animation.b.a(set, (List<Animator>)list);
        return set;
    }
    
    @i
    @Override
    public void onAnimationStart(final Animator animator) {
        this.d.c(animator);
    }
}
