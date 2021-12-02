// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.p0;
import org.bson.z0;
import java.util.concurrent.atomic.AtomicBoolean;

public class a implements n0<AtomicBoolean>
{
    public AtomicBoolean e(final p0 p2, final s0 s0) {
        return new AtomicBoolean(p2.readBoolean());
    }
    
    @Override
    public Class<AtomicBoolean> g() {
        return AtomicBoolean.class;
    }
    
    public void h(final z0 z0, final AtomicBoolean atomicBoolean, final x0 x0) {
        z0.Q(atomicBoolean.get());
    }
}
