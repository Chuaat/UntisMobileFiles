// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.disposables;

import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class h extends AtomicReference<c> implements c
{
    private static final long G = -754898800686245608L;
    
    public h() {
    }
    
    public h(final c newValue) {
        this.lazySet(newValue);
    }
    
    public boolean a(final c c) {
        return d.f(this, c);
    }
    
    public boolean b(final c c) {
        return d.h(this, c);
    }
    
    @Override
    public void dispose() {
        d.b(this);
    }
    
    @Override
    public boolean i() {
        return d.d(this.get());
    }
}
