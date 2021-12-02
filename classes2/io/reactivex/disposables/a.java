// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.disposables;

import io.reactivex.internal.util.k;

final class a extends f<x5.a>
{
    private static final long H = -8219729196779211169L;
    
    a(final x5.a a) {
        super(a);
    }
    
    protected void b(@io.reactivex.annotations.f final x5.a a) {
        try {
            a.run();
        }
        finally {
            final Throwable t;
            throw k.f(t);
        }
    }
}
