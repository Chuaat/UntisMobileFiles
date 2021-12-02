// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

final class h1 implements a
{
    private final /* synthetic */ i a;
    
    h1(final i a) {
        this.a = a;
    }
    
    @Override
    public final void a(final boolean b) {
        this.a.o.sendMessage(this.a.o.obtainMessage(1, (Object)b));
    }
}
