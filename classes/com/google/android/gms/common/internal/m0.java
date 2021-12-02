// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import androidx.annotation.j0;
import com.google.android.gms.common.c;
import com.google.android.gms.common.api.internal.q;

final class m0 implements b
{
    private final /* synthetic */ q c;
    
    m0(final q c) {
        this.c = c;
    }
    
    @Override
    public final void onConnectionFailed(@j0 final com.google.android.gms.common.c c) {
        this.c.onConnectionFailed(c);
    }
}
