// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

final class w extends t
{
    private final v a;
    
    w() {
        this.a = new v();
    }
    
    @Override
    public final void a(final Throwable t, final Throwable cause) {
        if (cause != t) {
            this.a.a(t, true).add(cause);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", cause);
    }
}
