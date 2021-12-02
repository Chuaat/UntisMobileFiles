// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import java.util.Set;
import org.bson.x0;
import org.bson.v0;
import org.bson.types.j;
import org.bson.r0;
import org.bson.types.ObjectId;
import org.bson.types.f;
import org.bson.types.d;
import org.bson.types.h;
import org.bson.types.g;
import org.bson.types.Decimal128;
import org.bson.d1;
import org.bson.w;
import java.util.Date;
import org.bson.types.c;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import org.bson.w0;
import java.util.Map;

public class d0
{
    private final Map<w0, Class<?>> a;
    
    public d0() {
        this(Collections.emptyMap());
    }
    
    public d0(final Map<w0, Class<?>> map) {
        final HashMap<Object, Object> a = new HashMap<Object, Object>();
        this.a = (Map<w0, Class<?>>)a;
        this.a();
        a.putAll(map);
    }
    
    private void a() {
        this.a.put(w0.L, List.class);
        this.a.put(w0.M, c.class);
        this.a.put(w0.P, Boolean.class);
        this.a.put(w0.Q, Date.class);
        this.a.put(w0.T, w.class);
        this.a.put(w0.K, d1.class);
        this.a.put(w0.I, Double.class);
        this.a.put(w0.X, Integer.class);
        this.a.put(w0.Z, Long.class);
        this.a.put(w0.a0, Decimal128.class);
        this.a.put(w0.c0, g.class);
        this.a.put(w0.b0, h.class);
        this.a.put(w0.U, d.class);
        this.a.put(w0.W, f.class);
        this.a.put(w0.O, ObjectId.class);
        this.a.put(w0.S, r0.class);
        this.a.put(w0.J, String.class);
        this.a.put(w0.V, j.class);
        this.a.put(w0.Y, v0.class);
        this.a.put(w0.N, x0.class);
    }
    
    public Class<?> b(final w0 w0) {
        return this.a.get(w0);
    }
    
    Set<w0> c() {
        return this.a.keySet();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((d0)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
