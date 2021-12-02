// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import java.util.concurrent.TimeUnit;
import io.reactivex.annotations.f;
import io.reactivex.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.j0;

public final class e extends j0
{
    public static final j0 H;
    static final c I;
    static final io.reactivex.disposables.c J;
    
    static {
        H = new e();
        I = new a();
        (J = d.b()).dispose();
    }
    
    private e() {
    }
    
    @f
    @Override
    public c c() {
        return e.I;
    }
    
    @f
    @Override
    public io.reactivex.disposables.c e(@f final Runnable runnable) {
        runnable.run();
        return e.J;
    }
    
    @f
    @Override
    public io.reactivex.disposables.c f(@f final Runnable runnable, final long n, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }
    
    @f
    @Override
    public io.reactivex.disposables.c g(@f final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }
    
    static final class a extends c
    {
        @f
        @Override
        public io.reactivex.disposables.c b(@f final Runnable runnable) {
            runnable.run();
            return e.J;
        }
        
        @f
        @Override
        public io.reactivex.disposables.c c(@f final Runnable runnable, final long n, @f final TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }
        
        @f
        @Override
        public io.reactivex.disposables.c d(@f final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }
        
        @Override
        public void dispose() {
        }
        
        @Override
        public boolean i() {
            return false;
        }
    }
}
