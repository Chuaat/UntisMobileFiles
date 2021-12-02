// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import x5.a;
import x5.g;
import java.util.concurrent.CountDownLatch;

public final class f extends CountDownLatch implements g<Throwable>, a
{
    public Throwable G;
    
    public f() {
        super(1);
    }
    
    public void a(final Throwable g) {
        this.G = g;
        this.countDown();
    }
    
    @Override
    public void run() {
        this.countDown();
    }
}
