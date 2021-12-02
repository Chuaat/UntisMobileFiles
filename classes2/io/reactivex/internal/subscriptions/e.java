// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscriptions;

import o7.d;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e extends AtomicBoolean implements d
{
    private static final long G = -8127758972444290902L;
    
    public boolean a() {
        return this.get();
    }
    
    public void cancel() {
        this.lazySet(true);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BooleanSubscription(cancelled=");
        sb.append(this.get());
        sb.append(")");
        return sb.toString();
    }
    
    public void v(final long n) {
        j.m(n);
    }
}
