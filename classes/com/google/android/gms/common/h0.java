// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class h0 extends f0
{
    private final Callable<String> e;
    
    private h0(final Callable<String> e) {
        super(false, null, null);
        this.e = e;
    }
    
    @Override
    final String f() {
        try {
            return this.e.call();
        }
        catch (Exception cause) {
            throw new RuntimeException(cause);
        }
    }
}
