// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import android.animation.ValueAnimator;
import android.animation.Animator;
import androidx.annotation.k0;
import androidx.transition.n0;
import android.view.View;
import androidx.annotation.j0;
import android.view.ViewGroup;
import androidx.transition.f1;

public final class i extends f1
{
    @j0
    @Override
    public Animator M0(@j0 final ViewGroup viewGroup, @j0 final View view, @k0 final n0 n0, @k0 final n0 n2) {
        return (Animator)ValueAnimator.ofFloat(new float[] { 0.0f });
    }
    
    @j0
    @Override
    public Animator O0(@j0 final ViewGroup viewGroup, @j0 final View view, @k0 final n0 n0, @k0 final n0 n2) {
        return (Animator)ValueAnimator.ofFloat(new float[] { 0.0f });
    }
}
