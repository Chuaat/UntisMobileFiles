// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Iterator;
import org.bson.codecs.configuration.a;
import f7.e;
import java.util.HashMap;
import java.util.Map;

final class v<T> implements s<T>
{
    private final l<T> a;
    private final Map<j0<?>, Object> b;
    private final Map<String, Integer> c;
    private final Object[] d;
    private T e;
    
    v(final l<T> a) {
        this.a = a;
        if (a.i().isEmpty()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = a.e();
        }
        else {
            this.b = new HashMap<j0<?>, Object>();
            this.c = new HashMap<String, Integer>();
            for (int i = 0; i < a.i().size(); ++i) {
                if (a.d() != null && a.d() == i) {
                    this.c.put("_id", a.d());
                }
                else {
                    this.c.put(a.i().get(i).value(), i);
                }
            }
            this.d = new Object[this.c.size()];
        }
    }
    
    private void c() {
        try {
            this.e = this.a.f(this.d);
            for (final Map.Entry<j0<?>, Object> entry : this.b.entrySet()) {
                this.d((j0<Object>)entry.getKey(), entry.getValue());
            }
        }
        catch (Exception ex) {
            throw new a(ex.getMessage(), ex);
        }
    }
    
    private <S> void d(final j0<S> j0, final Object o) {
        this.b(o, (j0<Object>)j0);
    }
    
    @Override
    public T a() {
        if (this.e == null) {
            try {
                final Iterator<Map.Entry<String, Integer>> iterator = this.c.entrySet().iterator();
                while (iterator.hasNext()) {
                    this.d[iterator.next().getValue()] = null;
                }
                this.c();
            }
            catch (a a) {
                throw new a(String.format("Could not construct new instance of: %s. Missing the following properties: %s", this.a.j().getSimpleName(), this.c.keySet()), a);
            }
        }
        return this.e;
    }
    
    @Override
    public <S> void b(final S n, final j0<S> j0) {
        if (this.e != null) {
            j0.g().d(this.e, n);
        }
        else {
            if (!this.c.isEmpty()) {
                String s;
                if (!this.c.containsKey(s = j0.k())) {
                    s = j0.f();
                }
                final Integer n2 = this.c.get(s);
                if (n2 != null) {
                    this.d[n2] = n;
                }
                this.c.remove(s);
            }
            if (this.c.isEmpty()) {
                this.c();
            }
            else {
                this.b.put(j0, n);
            }
        }
    }
}
