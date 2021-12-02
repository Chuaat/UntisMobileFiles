// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.internal;

import org.bson.codecs.configuration.a;
import org.bson.codecs.configuration.b;
import org.bson.q1;

public final class d
{
    private d() {
    }
    
    public static org.bson.codecs.configuration.d a(final org.bson.codecs.configuration.d d, final q1 q1) {
        org.bson.codecs.configuration.d d2 = d;
        if (q1 != q1.J) {
            if (!(d instanceof b)) {
                throw new a("Changing the default UuidRepresentation requires a CodecRegistry that also implements the CodecProvider interface");
            }
            d2 = new h((b)d, q1);
        }
        return d2;
    }
}
