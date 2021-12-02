// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.jsr310;

import org.bson.w0;
import org.bson.p0;
import org.bson.codecs.n0;

abstract class a<T> implements n0<T>
{
    long e(final p0 p) {
        final org.bson.w0 o5 = p.O5();
        final org.bson.w0 q = org.bson.w0.Q;
        if (o5.equals(q)) {
            return p.U1();
        }
        throw new org.bson.codecs.configuration.a(String.format("Could not decode into %s, expected '%s' BsonType but got '%s'.", this.g().getSimpleName(), q, o5));
    }
}
