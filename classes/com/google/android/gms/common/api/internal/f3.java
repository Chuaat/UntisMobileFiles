// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class f3 extends q1
{
    private final /* synthetic */ Dialog a;
    private final /* synthetic */ d3 b;
    
    f3(final d3 b, final Dialog a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.b.H.p();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
