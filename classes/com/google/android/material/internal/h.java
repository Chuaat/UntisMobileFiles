// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import androidx.annotation.j0;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.view.menu.j;
import android.view.SubMenu;
import android.content.Context;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.g;

@t0({ t0.a.H })
public class h extends g
{
    public h(final Context context) {
        super(context);
    }
    
    @j0
    @Override
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final j j = (j)this.a(n, n2, n3, charSequence);
        final com.google.android.material.internal.j i = new com.google.android.material.internal.j(this.x(), this, j);
        j.A(i);
        return (SubMenu)i;
    }
}
