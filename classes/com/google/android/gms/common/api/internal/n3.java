// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;

final class n3 implements a
{
    private final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ o3 b;
    
    n3(final o3 b, final BasePendingResult a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Status status) {
        this.b.a.remove(this.a);
    }
}
