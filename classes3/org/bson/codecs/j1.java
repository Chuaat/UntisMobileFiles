// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.p0;
import org.bson.z0;
import org.bson.types.ObjectId;

public class j1 implements n0<ObjectId>
{
    public ObjectId e(final p0 p2, final s0 s0) {
        return p2.E();
    }
    
    @Override
    public Class<ObjectId> g() {
        return ObjectId.class;
    }
    
    public void h(final z0 z0, final ObjectId objectId, final x0 x0) {
        z0.B(objectId);
    }
}
