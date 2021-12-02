// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.theme;

import com.google.android.material.textview.MaterialTextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.p;
import com.google.android.material.checkbox.a;
import com.google.android.material.button.MaterialButton;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.textfield.g;
import androidx.appcompat.widget.e;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.appcompat.app.j;

public class MaterialComponentsViewInflater extends j
{
    @j0
    @Override
    protected e b(@j0 final Context context, @k0 final AttributeSet set) {
        return new g(context, set);
    }
    
    @j0
    @Override
    protected AppCompatButton c(@j0 final Context context, @j0 final AttributeSet set) {
        return new MaterialButton(context, set);
    }
    
    @j0
    @Override
    protected androidx.appcompat.widget.g d(final Context context, final AttributeSet set) {
        return new com.google.android.material.checkbox.a(context, set);
    }
    
    @j0
    @Override
    protected p j(final Context context, final AttributeSet set) {
        return new com.google.android.material.radiobutton.a(context, set);
    }
    
    @j0
    @Override
    protected AppCompatTextView n(final Context context, final AttributeSet set) {
        return new MaterialTextView(context, set);
    }
}
