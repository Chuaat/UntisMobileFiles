// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.util;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

abstract class e<K, V> extends org.bson.util.a<K, V, Map<K, V>>
{
    private static final long J = 7935514534647505917L;
    
    protected e() {
        this(Collections.emptyMap(), i.a.H);
    }
    
    protected e(final Map<? extends K, ? extends V> map) {
        this(map, i.a.H);
    }
    
    protected e(final Map<? extends K, ? extends V> map, final i.a a) {
        super(map, a);
    }
    
    protected e(final i.a a) {
        super(Collections.emptyMap(), a);
    }
    
    public static <K, V> a<K, V> h() {
        return new a<K, V>();
    }
    
    public static <K, V> e<K, V> i() {
        return h().c();
    }
    
    public static <K, V> e<K, V> j(final Map<? extends K, ? extends V> map) {
        return h().a(map).c();
    }
    
    public static <K, V> e<K, V> k() {
        return h().d();
    }
    
    public static <K, V> e<K, V> n(final Map<? extends K, ? extends V> map) {
        return h().a(map).d();
    }
    
    protected abstract <N extends Map<? extends K, ? extends V>> Map<K, V> d(final N p0);
    
    public static class a<K, V>
    {
        private i.a a;
        private final Map<K, V> b;
        
        a() {
            this.a = i.a.G;
            this.b = new HashMap<K, V>();
        }
        
        public a<K, V> a(final Map<? extends K, ? extends V> map) {
            this.b.putAll(map);
            return this;
        }
        
        public a<K, V> b() {
            this.a = i.a.H;
            return this;
        }
        
        public e<K, V> c() {
            return new b<K, V>((Map<? extends K, ? extends V>)this.b, this.a);
        }
        
        public e<K, V> d() {
            return new c<K, V>((Map<? extends K, ? extends V>)this.b, this.a);
        }
        
        public a<K, V> e() {
            this.a = i.a.G;
            return this;
        }
    }
    
    static class b<K, V> extends e<K, V>
    {
        private static final long K = 5221824943734164497L;
        
        b(final Map<? extends K, ? extends V> map, final i.a a) {
            super(map, a);
        }
        
        public <N extends Map<? extends K, ? extends V>> Map<K, V> d(final N m) {
            return new HashMap<K, V>(m);
        }
    }
    
    static class c<K, V> extends e<K, V>
    {
        private static final long K = -8659999465009072124L;
        
        c(final Map<? extends K, ? extends V> map, final i.a a) {
            super(map, a);
        }
        
        public <N extends Map<? extends K, ? extends V>> Map<K, V> d(final N m) {
            return new LinkedHashMap<K, V>(m);
        }
    }
}
