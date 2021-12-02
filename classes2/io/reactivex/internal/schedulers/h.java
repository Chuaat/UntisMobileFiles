// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.schedulers;

import io.reactivex.annotations.f;
import java.util.concurrent.ThreadFactory;
import io.reactivex.j0;

public final class h extends j0
{
    private static final String I = "RxNewThreadScheduler";
    private static final k J;
    private static final String K = "rx2.newthread-priority";
    final ThreadFactory H;
    
    static {
        J = new k("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5))));
    }
    
    public h() {
        this(h.J);
    }
    
    public h(final ThreadFactory h) {
        this.H = h;
    }
    
    @f
    @Override
    public c c() {
        return new i(this.H);
    }
}
