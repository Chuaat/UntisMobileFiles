// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

class s extends LinearLayoutManager
{
    private static final float O = 100.0f;
    
    s(final Context context, final int n, final boolean b) {
        super(context, n, b);
    }
    
    @Override
    public void f2(final RecyclerView recyclerView, final d0 d0, final int n) {
        final androidx.recyclerview.widget.s s = new androidx.recyclerview.widget.s(recyclerView.getContext()) {
            @Override
            protected float w(final DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
        };
        ((RecyclerView.c0)s).q(n);
        ((RecyclerView.p)this).g2(s);
    }
}
