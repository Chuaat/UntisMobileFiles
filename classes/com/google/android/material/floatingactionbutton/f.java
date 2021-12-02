// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import java.util.List;
import android.animation.AnimatorSet;
import androidx.annotation.j0;
import android.animation.Animator$AnimatorListener;
import androidx.annotation.k0;
import androidx.annotation.b;
import com.google.android.material.animation.h;

interface f
{
    void a();
    
    h b();
    
    @b
    int c();
    
    void d();
    
    @k0
    h e();
    
    boolean f();
    
    void g(@j0 final Animator$AnimatorListener p0);
    
    void h(@j0 final Animator$AnimatorListener p0);
    
    void i();
    
    void j(@k0 final h p0);
    
    AnimatorSet k();
    
    List<Animator$AnimatorListener> l();
    
    void m(@k0 final ExtendedFloatingActionButton.j p0);
    
    void onAnimationStart(final Animator p0);
}
