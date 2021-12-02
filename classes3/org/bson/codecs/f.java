// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.p0;
import org.bson.z0;

public class f implements n0<Boolean>
{
    public Boolean e(final p0 p2, final s0 s0) {
        return p2.readBoolean();
    }
    
    @Override
    public Class<Boolean> g() {
        return Boolean.class;
    }
    
    public void h(final z0 z0, final Boolean b, final x0 x0) {
        z0.Q(b);
    }
}
