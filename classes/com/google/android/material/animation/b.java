// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.animation;

import java.util.Collection;
import android.animation.ValueAnimator;
import android.animation.Animator;
import java.util.List;
import androidx.annotation.j0;
import android.animation.AnimatorSet;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class b
{
    public static void a(@j0 final AnimatorSet set, @j0 final List<Animator> list) {
        final int size = list.size();
        long max = 0L;
        for (int i = 0; i < size; ++i) {
            final Animator animator = list.get(i);
            max = Math.max(max, animator.getStartDelay() + animator.getDuration());
        }
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 0, 0 });
        ((Animator)ofInt).setDuration(max);
        list.add(0, (Animator)ofInt);
        set.playTogether((Collection)list);
    }
}
