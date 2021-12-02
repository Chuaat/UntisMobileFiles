// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.o;
import org.bson.internal.k;
import org.bson.h;
import org.bson.q;
import org.bson.p0;
import org.bson.z0;
import e7.a;
import org.bson.q1;
import java.util.UUID;

public class s1 implements n0<UUID>
{
    private final q1 a;
    
    public s1() {
        this.a = q1.J;
    }
    
    public s1(final q1 a) {
        e7.a.e("uuidRepresentation", a);
        this.a = a;
    }
    
    @Override
    public Class<UUID> g() {
        return UUID.class;
    }
    
    public UUID h(final p0 p2, final s0 s0) {
        final byte a4 = p2.a4();
        if (a4 != q.K.b() && a4 != q.L.b()) {
            throw new h("Unexpected BsonBinarySubType");
        }
        return k.a(p2.o0().b1(), a4, this.a);
    }
    
    public void i(final z0 z0, final UUID uuid, final x0 x0) {
        final q1 a = this.a;
        if (a != q1.G) {
            final byte[] b = k.b(uuid, a);
            o o;
            if (this.a == q1.H) {
                o = new o(q.L, b);
            }
            else {
                o = new o(q.K, b);
            }
            z0.X(o);
            return;
        }
        throw new org.bson.codecs.configuration.a("The uuidRepresentation has not been specified, so the UUID cannot be encoded.");
    }
    
    public q1 j() {
        return this.a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UuidCodec{uuidRepresentation=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
