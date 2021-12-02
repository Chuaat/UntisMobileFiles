// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

public final class b
{
    private String a;
    private final long b;
    private final Map<String, Object> c;
    
    public b(final String a, final long b, final Map<String, Object> map) {
        this.a = a;
        this.b = b;
        final HashMap<Object, Object> c = new HashMap<Object, Object>();
        this.c = (Map<String, Object>)c;
        if (map != null) {
            c.putAll(map);
        }
    }
    
    public final long a() {
        return this.b;
    }
    
    public final b b() {
        return new b(this.a, this.b, new HashMap<String, Object>(this.c));
    }
    
    public final Object c(final String s) {
        if (this.c.containsKey(s)) {
            return this.c.get(s);
        }
        return null;
    }
    
    public final String d() {
        return this.a;
    }
    
    public final Map<String, Object> e() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return this.b == b.b && this.a.equals(b.a) && this.c.equals(b.c);
    }
    
    public final void f(final String a) {
        this.a = a;
    }
    
    public final void g(final String s, final Object o) {
        if (o == null) {
            this.c.remove(s);
            return;
        }
        this.c.put(s, o);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return (hashCode * 31 + (int)(b ^ b >>> 32)) * 31 + this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final long b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 55 + value.length());
        sb.append("Event{name='");
        sb.append(a);
        sb.append("', timestamp=");
        sb.append(b);
        sb.append(", params=");
        sb.append(value);
        sb.append('}');
        return sb.toString();
    }
}
