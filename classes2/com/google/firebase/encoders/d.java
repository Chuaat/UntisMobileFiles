// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.encoders;

import java.util.HashMap;
import androidx.annotation.k0;
import java.lang.annotation.Annotation;
import java.util.Collections;
import androidx.annotation.j0;
import java.util.Map;

public final class d
{
    private final String a;
    private final Map<Class<?>, Object> b;
    
    private d(final String a, final Map<Class<?>, Object> b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    public static b a(@j0 final String s) {
        return new b(s);
    }
    
    @j0
    public static d d(@j0 final String s) {
        return new d(s, Collections.emptyMap());
    }
    
    @j0
    public String b() {
        return this.a;
    }
    
    @k0
    public <T extends Annotation> T c(@j0 final Class<T> clazz) {
        return (T)this.b.get(clazz);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        if (!this.a.equals(d.a) || !this.b.equals(d.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FieldDescriptor{name=");
        sb.append(this.a);
        sb.append(", properties=");
        sb.append(this.b.values());
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b
    {
        private final String a;
        private Map<Class<?>, Object> b;
        
        b(final String a) {
            this.b = null;
            this.a = a;
        }
        
        @j0
        public d a() {
            final String a = this.a;
            Map<Object, Object> map;
            if (this.b == null) {
                map = Collections.emptyMap();
            }
            else {
                map = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(this.b));
            }
            return new d(a, map, null);
        }
        
        @j0
        public <T extends Annotation> b b(@j0 final T t) {
            if (this.b == null) {
                this.b = new HashMap<Class<?>, Object>();
            }
            this.b.put(t.annotationType(), t);
            return this;
        }
    }
}
