// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import java.util.Iterator;
import org.bson.w0;
import e7.a;
import org.bson.codecs.configuration.d;

public class e0
{
    private final d0 a;
    private final n0<?>[] b;
    
    public e0(final d0 d0, final d d2) {
        this.b = (n0<?>[])new n0[256];
        this.a = e7.a.e("bsonTypeClassMap", d0);
        e7.a.e("codecRegistry", d2);
        for (final w0 w0 : d0.c()) {
            final Class<?> b = d0.b(w0);
            if (b != null) {
                try {
                    this.b[w0.d()] = d2.a(b);
                }
                catch (org.bson.codecs.configuration.a a) {}
            }
        }
    }
    
    public n0<?> a(final w0 w0) {
        final n0<?> n0 = this.b[w0.d()];
        if (n0 != null) {
            return n0;
        }
        final Class<?> b = this.a.b(w0);
        if (b == null) {
            throw new org.bson.codecs.configuration.a(String.format("No class mapped for BSON type %s.", w0));
        }
        throw new org.bson.codecs.configuration.a(String.format("Can't find a codec for %s.", b));
    }
}
