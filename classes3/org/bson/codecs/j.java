// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.p0;
import org.bson.z0;
import org.bson.codecs.configuration.d;
import org.bson.y;
import g7.a;

public class j implements n0<a>
{
    private static final n0<y> b;
    private final d a;
    
    static {
        b = new o();
    }
    
    public j(final d a) {
        this.a = a;
    }
    
    public a e(final p0 p2, final s0 s0) {
        throw new UnsupportedOperationException("The BsonCodec can only encode to Bson");
    }
    
    @Override
    public Class<a> g() {
        return a.class;
    }
    
    public void h(final z0 z0, final a a, final x0 x0) {
        try {
            j.b.a(z0, a.b(y.class, this.a), x0);
        }
        catch (Exception ex) {
            throw new org.bson.codecs.configuration.a(String.format("Unable to encode a Bson implementation: %s", a), ex);
        }
    }
}
