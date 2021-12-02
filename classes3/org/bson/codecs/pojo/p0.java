// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

final class p0
{
    private final Map<Integer, Integer> a;
    
    private p0(final Map<Integer, Integer> m) {
        this.a = Collections.unmodifiableMap((Map<? extends Integer, ? extends Integer>)m);
    }
    
    static b a() {
        return new b();
    }
    
    Map<Integer, Integer> b() {
        return this.a;
    }
    
    boolean c() {
        return this.a.isEmpty() ^ true;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && p0.class == o.getClass() && this.b().equals(((p0)o).b()));
    }
    
    @Override
    public int hashCode() {
        return this.b().hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TypeParameterMap{fieldToClassParamIndexMap=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b
    {
        private final Map<Integer, Integer> a;
        
        private b() {
            this.a = new HashMap<Integer, Integer>();
        }
        
        b a(final int i) {
            this.a.put(-1, i);
            return this;
        }
        
        b b(final int i, final int j) {
            this.a.put(i, j);
            return this;
        }
        
        p0 c() {
            if (this.a.size() > 1 && this.a.containsKey(-1)) {
                throw new IllegalStateException("You cannot have a generic field that also has type parameters.");
            }
            return new p0(this.a, null);
        }
    }
}
