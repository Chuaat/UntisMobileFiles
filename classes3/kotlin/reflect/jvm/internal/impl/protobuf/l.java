// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

public class l extends m
{
    private final q e;
    
    public q e() {
        return this.c(this.e);
    }
    
    @Override
    public boolean equals(final Object obj) {
        return this.e().equals(obj);
    }
    
    @Override
    public int hashCode() {
        return this.e().hashCode();
    }
    
    @Override
    public String toString() {
        return this.e().toString();
    }
    
    static class b<K> implements Entry<K, Object>
    {
        private Entry<K, l> G;
        
        private b(final Entry<K, l> g) {
            this.G = g;
        }
        
        @Override
        public K getKey() {
            return this.G.getKey();
        }
        
        @Override
        public Object getValue() {
            final l l = this.G.getValue();
            if (l == null) {
                return null;
            }
            return l.e();
        }
        
        @Override
        public Object setValue(final Object o) {
            if (o instanceof q) {
                return this.G.getValue().d((q)o);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }
    
    static class c<K> implements Iterator<Map.Entry<K, Object>>
    {
        private Iterator<Map.Entry<K, Object>> G;
        
        public c(final Iterator<Map.Entry<K, Object>> g) {
            this.G = g;
        }
        
        public Map.Entry<K, Object> a() {
            final Map.Entry entry = this.G.next();
            if (entry.getValue() instanceof l) {
                return new b<K>(entry);
            }
            return (Map.Entry<K, Object>)entry;
        }
        
        @Override
        public boolean hasNext() {
            return this.G.hasNext();
        }
        
        @Override
        public void remove() {
            this.G.remove();
        }
    }
}
