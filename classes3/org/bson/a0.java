// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.bson.codecs.x0;
import org.bson.codecs.configuration.d;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.bson.codecs.w0;

public final class a0<T> extends y
{
    private static final long L = 1L;
    private final transient T I;
    private final transient w0<T> J;
    private y K;
    
    public a0(final T i, final w0<T> j) {
        if (i != null) {
            this.I = i;
            this.J = j;
            return;
        }
        throw new IllegalArgumentException("Document can not be null");
    }
    
    private void D2(final ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object J2() {
        return this.P2();
    }
    
    public static y L2(final Object o, final d d) {
        if (o == null) {
            return null;
        }
        if (o instanceof y) {
            return (y)o;
        }
        return new a0<Object>(o, d.a(o.getClass()));
    }
    
    private y P2() {
        if (this.J != null) {
            if (this.K == null) {
                final y k = new y();
                this.J.a(new b0(k), this.I, x0.a().b());
                this.K = k;
            }
            return this.K;
        }
        throw new g0("Can not unwrap a BsonDocumentWrapper with no Encoder");
    }
    
    @Override
    public y0 C2(final String s, final y0 y0) {
        return this.P2().C2(s, y0);
    }
    
    @Override
    public y0 E2(final Object o) {
        return this.P2().E2(o);
    }
    
    public w0<T> M2() {
        return this.J;
    }
    
    public T Q2() {
        return this.I;
    }
    
    public boolean R2() {
        return this.K != null;
    }
    
    @Override
    public y Z0() {
        return this.P2().Z0();
    }
    
    @Override
    public y0 b1(final Object o) {
        return this.P2().b1(o);
    }
    
    @Override
    public void clear() {
        super.clear();
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.P2().containsKey(o);
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.P2().containsValue(o);
    }
    
    @Override
    public Set<Entry<String, y0>> entrySet() {
        return this.P2().entrySet();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this.P2().equals(o);
    }
    
    @Override
    public int hashCode() {
        return this.P2().hashCode();
    }
    
    @Override
    public boolean isEmpty() {
        return this.P2().isEmpty();
    }
    
    @Override
    public Set<String> keySet() {
        return this.P2().keySet();
    }
    
    @Override
    public void putAll(final Map<? extends String, ? extends y0> map) {
        super.putAll(map);
    }
    
    @Override
    public int size() {
        return this.P2().size();
    }
    
    @Override
    public String toString() {
        return this.P2().toString();
    }
    
    @Override
    public Collection<y0> values() {
        return this.P2().values();
    }
}
