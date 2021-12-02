// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import java.util.concurrent.locks.Lock;

public class d implements k
{
    @e
    private final Lock b;
    
    public d() {
        this(null, 1, null);
    }
    
    public d(@e final Lock b) {
        k0.p((Object)b, "lock");
        this.b = b;
    }
    
    @e
    protected final Lock a() {
        return this.b;
    }
    
    @Override
    public void lock() {
        this.b.lock();
    }
    
    @Override
    public void unlock() {
        this.b.unlock();
    }
}
