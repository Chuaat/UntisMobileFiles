// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition.platform;

import android.animation.ValueAnimator;
import android.animation.Animator;
import androidx.annotation.k0;
import android.transition.TransitionValues;
import android.view.View;
import androidx.annotation.j0;
import android.view.ViewGroup;
import androidx.annotation.p0;
import android.transition.Visibility;

@p0(21)
public final class i extends Visibility
{
    @j0
    public Animator onAppear(@j0 final ViewGroup viewGroup, @j0 final View view, @k0 final TransitionValues transitionValues, @k0 final TransitionValues transitionValues2) {
        return (Animator)ValueAnimator.ofFloat(new float[] { 0.0f });
    }
    
    @j0
    public Animator onDisappear(@j0 final ViewGroup viewGroup, @j0 final View view, @k0 final TransitionValues transitionValues, @k0 final TransitionValues transitionValues2) {
        return (Animator)ValueAnimator.ofFloat(new float[] { 0.0f });
    }
}
