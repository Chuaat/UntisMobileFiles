// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.disposables;

import io.reactivex.internal.disposables.d;
import io.reactivex.annotations.g;
import java.util.concurrent.atomic.AtomicReference;

public final class h implements c
{
    final AtomicReference<c> G;
    
    public h() {
        this.G = new AtomicReference<c>();
    }
    
    public h(@g final c initialValue) {
        this.G = new AtomicReference<c>(initialValue);
    }
    
    @g
    public c a() {
        c a;
        if ((a = this.G.get()) == d.G) {
            a = io.reactivex.disposables.d.a();
        }
        return a;
    }
    
    public boolean b(@g final c c) {
        return d.f(this.G, c);
    }
    
    public boolean c(@g final c c) {
        return d.h(this.G, c);
    }
    
    @Override
    public void dispose() {
        d.b(this.G);
    }
    
    @Override
    public boolean i() {
        return d.d(this.G.get());
    }
}
