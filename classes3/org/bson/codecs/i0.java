// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.o;
import org.bson.p0;
import org.bson.z0;

public class i0 implements n0<byte[]>
{
    public byte[] e(final p0 p2, final s0 s0) {
        return p2.o0().b1();
    }
    
    @Override
    public Class<byte[]> g() {
        return byte[].class;
    }
    
    public void h(final z0 z0, final byte[] array, final x0 x0) {
        z0.X(new o(array));
    }
}
