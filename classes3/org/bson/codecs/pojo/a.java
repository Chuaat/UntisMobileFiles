// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.codecs.s0;
import org.bson.p0;
import org.bson.codecs.x0;
import org.bson.z0;

final class a<T> extends a0<T>
{
    private final a0<T> a;
    
    a(final a0<T> a) {
        this.a = a;
    }
    
    @Override
    public void a(final z0 z0, final T t, final x0 x0) {
        try {
            this.a.a(z0, t, x0);
        }
        catch (org.bson.codecs.configuration.a a) {
            throw new org.bson.codecs.configuration.a(String.format("An exception occurred when encoding using the AutomaticPojoCodec.%nEncoding a %s: '%s' failed with the following exception:%n%n%s%n%nA custom Codec or PojoCodec may need to be explicitly configured and registered to handle this type.", this.g().getSimpleName(), t, a.getMessage()), a);
        }
    }
    
    @Override
    public T c(final p0 p2, final s0 s0) {
        try {
            return this.a.c(p2, s0);
        }
        catch (org.bson.codecs.configuration.a a) {
            throw new org.bson.codecs.configuration.a(String.format("An exception occurred when decoding using the AutomaticPojoCodec.%nDecoding into a '%s' failed with the following exception:%n%n%s%n%nA custom Codec or PojoCodec may need to be explicitly configured and registered to handle this type.", this.a.g().getSimpleName(), a.getMessage()), a);
        }
    }
    
    @Override
    b<T> e() {
        return this.a.e();
    }
    
    @Override
    public Class<T> g() {
        return this.a.g();
    }
}
