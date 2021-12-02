// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.textfield;

import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import androidx.annotation.j0;

class b extends e
{
    b(@j0 final TextInputLayout textInputLayout) {
        super(textInputLayout);
    }
    
    @Override
    void a() {
        super.a.setEndIconOnClickListener(null);
        super.a.setEndIconOnLongClickListener(null);
    }
}
