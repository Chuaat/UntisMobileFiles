// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.p0;
import org.bson.z0;
import java.util.concurrent.atomic.AtomicLong;

public class c implements n0<AtomicLong>
{
    public AtomicLong e(final p0 p2, final s0 s0) {
        return new AtomicLong(i1.c(p2));
    }
    
    @Override
    public Class<AtomicLong> g() {
        return AtomicLong.class;
    }
    
    public void h(final z0 z0, final AtomicLong atomicLong, final x0 x0) {
        z0.I(atomicLong.longValue());
    }
}
