// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.bson.codecs.n0;
import org.bson.codecs.configuration.d;
import org.bson.diagnostics.c;
import java.util.List;
import java.util.Set;
import java.util.Map;
import org.bson.codecs.configuration.b;

public final class c0 implements org.bson.codecs.configuration.b
{
    static final org.bson.diagnostics.b g;
    private final boolean a;
    private final Map<Class<?>, org.bson.codecs.pojo.b<?>> b;
    private final Set<String> c;
    private final List<e> d;
    private final m e;
    private final List<f0> f;
    
    static {
        g = c.a("codecs.pojo");
    }
    
    private c0(final boolean a, final Map<Class<?>, org.bson.codecs.pojo.b<?>> b, final Set<String> c, final List<e> d, final List<f0> f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new m(b, c);
        this.f = f;
    }
    
    public static b c() {
        return new b();
    }
    
    private static <T> org.bson.codecs.pojo.b<T> d(final Class<T> clazz, final List<e> list) {
        final org.bson.codecs.pojo.c<T> a = org.bson.codecs.pojo.b.a(clazz);
        if (list != null) {
            a.e(list);
        }
        return a.c();
    }
    
    private <T> a0<T> e(final Class<T> clazz, final d d) {
        final org.bson.codecs.pojo.b<?> b = this.b.get(clazz);
        if (b != null) {
            return new b0<T>((org.bson.codecs.pojo.b<Object>)b, d, this.f, this.e);
        }
        Label_0100: {
            if (!this.a) {
                if (clazz.getPackage() == null || !this.c.contains(clazz.getPackage().getName())) {
                    break Label_0100;
                }
            }
            try {
                final org.bson.codecs.pojo.b<T> d2 = d(clazz, this.d);
                if (!clazz.isInterface() && d2.j().isEmpty()) {
                    return null;
                }
                this.e.a(d2);
                return new a<T>(new b0<Object>((org.bson.codecs.pojo.b<Object>)d2, d, this.f, this.e));
            }
            catch (Exception ex) {
                c0.g.j(String.format("Cannot use '%s' with the PojoCodec.", clazz.getSimpleName()), ex);
                return null;
            }
        }
    }
    
    @Override
    public <T> n0<T> b(final Class<T> clazz, final d d) {
        return this.e(clazz, d);
    }
    
    public static final class b
    {
        private final Set<String> a;
        private final Map<Class<?>, org.bson.codecs.pojo.b<?>> b;
        private final List<Class<?>> c;
        private List<e> d;
        private final List<f0> e;
        private boolean f;
        
        private b() {
            this.a = new HashSet<String>();
            this.b = new HashMap<Class<?>, org.bson.codecs.pojo.b<?>>();
            this.c = new ArrayList<Class<?>>();
            this.d = null;
            this.e = new ArrayList<f0>();
        }
        
        public b a(final boolean f) {
            this.f = f;
            return this;
        }
        
        public c0 b() {
            List<Object> unmodifiableList;
            if (this.d != null) {
                unmodifiableList = Collections.unmodifiableList((List<?>)new ArrayList<Object>(this.d));
            }
            else {
                unmodifiableList = null;
            }
            for (final Class<?> clazz : this.c) {
                if (!this.b.containsKey(clazz)) {
                    this.f(d((Class<Object>)clazz, unmodifiableList));
                }
            }
            return new c0(this.f, this.b, this.a, unmodifiableList, this.e, null);
        }
        
        public b c(final List<e> list) {
            this.d = e7.a.e("conventions", list);
            return this;
        }
        
        public b d(final Class<?>... a) {
            this.c.addAll(Arrays.asList(a));
            return this;
        }
        
        public b e(final String... array) {
            this.a.addAll((Collection<? extends String>)Arrays.asList((Object[])e7.a.e("packageNames", (T[])array)));
            return this;
        }
        
        public b f(final org.bson.codecs.pojo.b<?>... array) {
            e7.a.e("classModels", array);
            for (final org.bson.codecs.pojo.b<?> b : array) {
                this.b.put(b.l(), b);
            }
            return this;
        }
        
        public b g(final f0... array) {
            this.e.addAll((Collection<? extends f0>)Arrays.asList((Object[])e7.a.e("providers", (T[])array)));
            return this;
        }
    }
}
