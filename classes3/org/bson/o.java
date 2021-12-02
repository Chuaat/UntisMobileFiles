// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.Arrays;
import e7.a;
import org.bson.internal.k;
import java.util.UUID;

public class o extends y0
{
    private final byte a;
    private final byte[] b;
    
    public o(final byte b, final byte[] b2) {
        if (b2 != null) {
            this.a = b;
            this.b = b2;
            return;
        }
        throw new IllegalArgumentException("data may not be null");
    }
    
    public o(final UUID uuid) {
        this(uuid, q1.H);
    }
    
    public o(final UUID uuid, final q1 q1) {
        if (uuid == null) {
            throw new IllegalArgumentException("uuid may not be null");
        }
        if (q1 != null) {
            this.b = k.b(uuid, q1);
            q q2;
            if (q1 == q1.H) {
                q2 = q.L;
            }
            else {
                q2 = q.K;
            }
            this.a = q2.b();
            return;
        }
        throw new IllegalArgumentException("uuidRepresentation may not be null");
    }
    
    public o(final q q, final byte[] b) {
        if (q == null) {
            throw new IllegalArgumentException("type may not be null");
        }
        if (b != null) {
            this.a = q.b();
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("data may not be null");
    }
    
    public o(final byte[] array) {
        this(q.H, array);
    }
    
    static o Z0(final o o) {
        return new o(o.a, o.b.clone());
    }
    
    public UUID X0() {
        if (!q.d(this.a)) {
            throw new g0("type must be a UUID subtype.");
        }
        if (this.a == q.L.b()) {
            return k.a(this.b.clone(), this.a, q1.H);
        }
        throw new g0("uuidRepresentation must be set to return the correct UUID.");
    }
    
    public UUID Y0(final q1 q1) {
        e7.a.e("uuidRepresentation", q1);
        q q2;
        if (q1 == q1.H) {
            q2 = q.L;
        }
        else {
            q2 = q.K;
        }
        if (this.a == q2.b()) {
            return k.a(this.b.clone(), this.a, q1);
        }
        throw new g0("uuidRepresentation does not match current uuidRepresentation.");
    }
    
    public byte[] b1() {
        return this.b;
    }
    
    public byte c1() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final o o2 = (o)o;
            return Arrays.equals(this.b, o2.b) && this.a == o2.a;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.a * 31 + Arrays.hashCode(this.b);
    }
    
    @Override
    public w0 t0() {
        return w0.M;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonBinary{type=");
        sb.append(this.a);
        sb.append(", data=");
        sb.append(Arrays.toString(this.b));
        sb.append('}');
        return sb.toString();
    }
}
