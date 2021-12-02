// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.g0;
import org.bson.p0;
import org.bson.z0;

public class p1 implements n0<Short>
{
    public Short e(final p0 p2, final s0 s0) {
        final int b = i1.b(p2);
        if (b >= -32768 && b <= 32767) {
            return (short)b;
        }
        throw new g0(String.format("%s can not be converted into a Short.", b));
    }
    
    @Override
    public Class<Short> g() {
        return Short.class;
    }
    
    public void h(final z0 z0, final Short n, final x0 x0) {
        z0.l(n);
    }
}
