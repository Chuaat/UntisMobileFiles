// 
// Decompiled by Procyon v0.5.36
// 

package x2;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface a<V> extends Future<V>
{
    void g(final Runnable p0, final Executor p1);
}
