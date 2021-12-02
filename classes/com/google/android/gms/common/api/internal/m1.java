// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;

final class m1 implements Runnable
{
    private final /* synthetic */ k1 G;
    
    m1(final k1 g) {
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.G.a.f.j(this.G.a.f.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
