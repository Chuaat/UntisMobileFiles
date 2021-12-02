// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import java.util.Iterator;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.LinkedHashMap;
import java.util.Map;

public class h<T, Y>
{
    private final Map<T, Y> a;
    private final long b;
    private long c;
    private long d;
    
    public h(final long n) {
        this.a = new LinkedHashMap<T, Y>(100, 0.75f, true);
        this.b = n;
        this.c = n;
    }
    
    private void j() {
        this.q(this.c);
    }
    
    public void b() {
        this.q(0L);
    }
    
    public void c(final float n) {
        // monitorenter(this)
        if (n >= 0.0f) {
            Label_0046: {
                try {
                    this.c = Math.round(this.b * n);
                    this.j();
                    // monitorexit(this)
                    return;
                }
                finally {
                    break Label_0046;
                }
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
        }
        // monitorexit(this)
        throw new IllegalArgumentException("Multiplier must be >= 0");
    }
    
    public long d() {
        synchronized (this) {
            return this.d;
        }
    }
    
    public long e() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public boolean i(@j0 final T t) {
        synchronized (this) {
            return this.a.containsKey(t);
        }
    }
    
    @k0
    public Y k(@j0 final T t) {
        synchronized (this) {
            return this.a.get(t);
        }
    }
    
    protected int l() {
        synchronized (this) {
            return this.a.size();
        }
    }
    
    protected int m(@k0 final Y y) {
        return 1;
    }
    
    protected void n(@j0 final T t, @k0 final Y y) {
    }
    
    @k0
    public Y o(@j0 final T t, @k0 final Y obj) {
        synchronized (this) {
            final long n = this.m(obj);
            if (n >= this.c) {
                this.n(t, obj);
                return null;
            }
            if (obj != null) {
                this.d += n;
            }
            final Y put = this.a.put(t, obj);
            if (put != null) {
                this.d -= this.m(put);
                if (!put.equals(obj)) {
                    this.n(t, put);
                }
            }
            this.j();
            return put;
        }
    }
    
    @k0
    public Y p(@j0 final T t) {
        synchronized (this) {
            final Y remove = this.a.remove(t);
            if (remove != null) {
                this.d -= this.m(remove);
            }
            return remove;
        }
    }
    
    protected void q(final long n) {
        synchronized (this) {
            while (this.d > n) {
                final Iterator<Map.Entry<T, Y>> iterator = this.a.entrySet().iterator();
                final Map.Entry<T, Y> entry = iterator.next();
                final Y value = entry.getValue();
                this.d -= this.m(value);
                final T key = entry.getKey();
                iterator.remove();
                this.n(key, value);
            }
        }
    }
}
