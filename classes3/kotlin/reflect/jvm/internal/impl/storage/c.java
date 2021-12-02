// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;

public final class c extends d
{
    @e
    private final Runnable c;
    @e
    private final l<InterruptedException, j2> d;
    
    public c(@e final Runnable runnable, @e final l<? super InterruptedException, j2> l) {
        k0.p((Object)runnable, "checkCancelled");
        k0.p((Object)l, "interruptedExceptionHandler");
        this(new ReentrantLock(), runnable, l);
    }
    
    public c(@e final Lock lock, @e final Runnable c, @e final l<? super InterruptedException, j2> d) {
        k0.p((Object)lock, "lock");
        k0.p((Object)c, "checkCancelled");
        k0.p((Object)d, "interruptedExceptionHandler");
        super(lock);
        this.c = c;
        this.d = (l<InterruptedException, j2>)d;
    }
    
    @Override
    public void lock() {
        try {
            while (!this.a().tryLock(50L, TimeUnit.MILLISECONDS)) {
                this.c.run();
            }
        }
        catch (InterruptedException ex) {
            this.d.invoke((Object)ex);
        }
    }
}
