// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

final class l implements a
{
    private final /* synthetic */ FrameLayout a;
    private final /* synthetic */ LayoutInflater b;
    private final /* synthetic */ ViewGroup c;
    private final /* synthetic */ Bundle d;
    private final /* synthetic */ com.google.android.gms.dynamic.a e;
    
    l(final com.google.android.gms.dynamic.a e, final FrameLayout a, final LayoutInflater b, final ViewGroup c, final Bundle d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final e e) {
        this.a.removeAllViews();
        this.a.addView(this.e.a.c(this.b, this.c, this.d));
    }
    
    @Override
    public final int b() {
        return 2;
    }
}
