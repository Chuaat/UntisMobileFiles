// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.floatingactionbutton;

import androidx.annotation.k0;
import android.animation.Animator;

class a
{
    @k0
    private Animator a;
    
    public void a() {
        final Animator a = this.a;
        if (a != null) {
            a.cancel();
        }
    }
    
    public void b() {
        this.a = null;
    }
    
    public void c(final Animator a) {
        this.a();
        this.a = a;
    }
}
