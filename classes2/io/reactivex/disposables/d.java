// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.disposables;

import java.util.concurrent.Future;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.functions.a;
import io.reactivex.annotations.f;
import io.reactivex.internal.disposables.e;

public final class d
{
    private d() {
        throw new IllegalStateException("No instances!");
    }
    
    @f
    public static c a() {
        return e.G;
    }
    
    @f
    public static c b() {
        return f(a.b);
    }
    
    @f
    public static c c(@f final x5.a a) {
        b.g(a, "run is null");
        return new io.reactivex.disposables.a(a);
    }
    
    @f
    public static c d(@f final Future<?> future) {
        b.g(future, "future is null");
        return e(future, true);
    }
    
    @f
    public static c e(@f final Future<?> future, final boolean b) {
        b.g(future, "future is null");
        return new io.reactivex.disposables.e(future, b);
    }
    
    @f
    public static c f(@f final Runnable runnable) {
        b.g(runnable, "run is null");
        return new g(runnable);
    }
    
    @f
    public static c g(@f final o7.d d) {
        b.g(d, "subscription is null");
        return new i(d);
    }
}
