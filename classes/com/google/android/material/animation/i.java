// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.animation;

import android.animation.Animator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.ValueAnimator;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.animation.TimeInterpolator;

public class i
{
    private long a;
    private long b;
    @k0
    private TimeInterpolator c;
    private int d;
    private int e;
    
    public i(final long a, final long b) {
        this.a = 0L;
        this.b = 300L;
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = a;
        this.b = b;
    }
    
    public i(final long a, final long b, @j0 final TimeInterpolator c) {
        this.a = 0L;
        this.b = 300L;
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @j0
    static i b(@j0 final ValueAnimator valueAnimator) {
        final i i = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        i.d = valueAnimator.getRepeatCount();
        i.e = valueAnimator.getRepeatMode();
        return i;
    }
    
    private static TimeInterpolator f(@j0 final ValueAnimator valueAnimator) {
        final TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (interpolator instanceof AccelerateDecelerateInterpolator || interpolator == null) {
            return a.b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.c;
        }
        TimeInterpolator d = interpolator;
        if (interpolator instanceof DecelerateInterpolator) {
            d = a.d;
        }
        return d;
    }
    
    public void a(@j0 final Animator animator) {
        animator.setStartDelay(this.c());
        animator.setDuration(this.d());
        animator.setInterpolator(this.e());
        if (animator instanceof ValueAnimator) {
            final ValueAnimator valueAnimator = (ValueAnimator)animator;
            valueAnimator.setRepeatCount(this.g());
            valueAnimator.setRepeatMode(this.h());
        }
    }
    
    public long c() {
        return this.a;
    }
    
    public long d() {
        return this.b;
    }
    
    @k0
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator == null) {
            timeInterpolator = com.google.android.material.animation.a.b;
        }
        return timeInterpolator;
    }
    
    @Override
    public boolean equals(@k0 final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return this.c() == i.c() && this.d() == i.d() && this.g() == i.g() && this.h() == i.h() && this.e().getClass().equals(i.e().getClass());
    }
    
    public int g() {
        return this.d;
    }
    
    public int h() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        return ((((int)(this.c() ^ this.c() >>> 32) * 31 + (int)(this.d() ^ this.d() >>> 32)) * 31 + this.e().getClass().hashCode()) * 31 + this.g()) * 31 + this.h();
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('\n');
        sb.append(this.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.c());
        sb.append(" duration: ");
        sb.append(this.d());
        sb.append(" interpolator: ");
        sb.append(this.e().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.g());
        sb.append(" repeatMode: ");
        sb.append(this.h());
        sb.append("}\n");
        return sb.toString();
    }
}
