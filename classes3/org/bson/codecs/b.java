// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.p0;
import org.bson.z0;
import java.util.concurrent.atomic.AtomicInteger;

public class b implements n0<AtomicInteger>
{
    public AtomicInteger e(final p0 p2, final s0 s0) {
        return new AtomicInteger(i1.b(p2));
    }
    
    @Override
    public Class<AtomicInteger> g() {
        return AtomicInteger.class;
    }
    
    public void h(final z0 z0, final AtomicInteger atomicInteger, final x0 x0) {
        z0.l(atomicInteger.intValue());
    }
}
