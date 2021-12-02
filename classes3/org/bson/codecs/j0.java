// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.g0;
import org.bson.p0;
import org.bson.z0;

public class j0 implements n0<Byte>
{
    public Byte e(final p0 p2, final s0 s0) {
        final int b = i1.b(p2);
        if (b >= -128 && b <= 127) {
            return (byte)b;
        }
        throw new g0(String.format("%s can not be converted into a Byte.", b));
    }
    
    @Override
    public Class<Byte> g() {
        return Byte.class;
    }
    
    public void h(final z0 z0, final Byte b, final x0 x0) {
        z0.l(b);
    }
}
