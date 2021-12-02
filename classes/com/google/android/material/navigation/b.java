// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.navigation;

import android.view.SubMenu;
import androidx.appcompat.view.menu.j;
import android.view.MenuItem;
import android.content.Context;
import androidx.annotation.j0;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.g;

@t0({ t0.a.H })
public final class b extends g
{
    @j0
    private final Class<?> Q;
    private final int R;
    
    public b(@j0 final Context context, @j0 final Class<?> q, final int r) {
        super(context);
        this.Q = q;
        this.R = r;
    }
    
    @j0
    @Override
    protected MenuItem a(final int n, final int n2, final int n3, @j0 final CharSequence charSequence) {
        if (this.size() + 1 <= this.R) {
            this.m0();
            final MenuItem a = super.a(n, n2, n3, charSequence);
            if (a instanceof j) {
                ((j)a).w(true);
            }
            this.l0();
            return a;
        }
        final String simpleName = this.Q.getSimpleName();
        final StringBuilder sb = new StringBuilder();
        sb.append("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(this.R);
        sb.append(". Limit can be checked with ");
        sb.append(simpleName);
        sb.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @j0
    @Override
    public SubMenu addSubMenu(final int n, final int n2, final int n3, @j0 final CharSequence charSequence) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.Q.getSimpleName());
        sb.append(" does not support submenus");
        throw new UnsupportedOperationException(sb.toString());
    }
    
    public int n0() {
        return this.R;
    }
}
