// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.g0;
import org.bson.p0;
import org.bson.z0;

public class y0 implements n0<Float>
{
    public Float e(final p0 p2, final s0 s0) {
        final double a = i1.a(p2);
        if (a >= -3.4028234663852886E38 && a <= 3.4028234663852886E38) {
            return (float)a;
        }
        throw new g0(String.format("%s can not be converted into a Float.", a));
    }
    
    @Override
    public Class<Float> g() {
        return Float.class;
    }
    
    public void h(final z0 z0, final Float n, final x0 x0) {
        z0.P(n);
    }
}
