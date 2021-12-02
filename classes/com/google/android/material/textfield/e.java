// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.textfield;

import androidx.annotation.j0;
import com.google.android.material.internal.CheckableImageButton;
import android.content.Context;

abstract class e
{
    TextInputLayout a;
    Context b;
    CheckableImageButton c;
    
    e(@j0 final TextInputLayout a) {
        this.a = a;
        this.b = a.getContext();
        this.c = a.getEndIconView();
    }
    
    abstract void a();
    
    boolean b(final int n) {
        return true;
    }
    
    void c(final boolean b) {
    }
    
    boolean d() {
        return false;
    }
}
