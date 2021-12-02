// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import androidx.annotation.j0;
import com.google.android.gms.common.c;
import com.google.android.gms.common.api.k;

final class y0 implements c
{
    private final /* synthetic */ z e;
    
    y0(final t0 t0, final z e) {
        this.e = e;
    }
    
    @Override
    public final void onConnectionFailed(@j0 final com.google.android.gms.common.c c) {
        this.e.o(new Status(8));
    }
}
