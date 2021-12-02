// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class r3 extends l3
{
    @Override
    public final void a(final Throwable t) {
        t.printStackTrace();
    }
    
    @Override
    public final void b(final Throwable t, final Throwable exception) {
        t.addSuppressed(exception);
    }
}
