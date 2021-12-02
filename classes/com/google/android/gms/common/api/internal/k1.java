// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.e;

final class k1 implements e
{
    final /* synthetic */ com.google.android.gms.common.api.internal.i.a a;
    
    k1(final com.google.android.gms.common.api.internal.i.a a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.a.p.o.post((Runnable)new m1(this));
    }
}
