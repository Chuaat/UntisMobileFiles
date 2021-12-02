// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.LinkedHashMap;

public class j<K, V>
{
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    
    public j(final int c) {
        if (c > 0) {
            this.c = c;
            this.a = new LinkedHashMap<K, V>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
    
    private int n(final K obj, final V obj2) {
        final int p2 = this.p(obj, obj2);
        if (p2 >= 0) {
            return p2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(obj);
        sb.append("=");
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }
    
    @k0
    protected V a(@j0 final K k) {
        return null;
    }
    
    public final int b() {
        synchronized (this) {
            return this.e;
        }
    }
    
    protected void c(final boolean b, @j0 final K k, @j0 final V v, @k0 final V v2) {
    }
    
    public final void d() {
        this.r(-1);
    }
    
    public final int e() {
        synchronized (this) {
            return this.f;
        }
    }
    
    @k0
    public final V f(@j0 final K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            final V value = this.a.get(k);
            if (value != null) {
                ++this.g;
                return value;
            }
            ++this.h;
            // monitorexit(this)
            final V a = this.a(k);
            if (a == null) {
                return null;
            }
            synchronized (this) {
                ++this.e;
                final V put = this.a.put(k, a);
                if (put != null) {
                    this.a.put(k, put);
                }
                else {
                    this.b += this.n(k, a);
                }
                // monitorexit(this)
                if (put != null) {
                    this.c(false, k, a, put);
                    return put;
                }
                this.r(this.c);
                return a;
            }
        }
    }
    
    public final int g() {
        synchronized (this) {
            return this.g;
        }
    }
    
    public final int h() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final int i() {
        synchronized (this) {
            return this.h;
        }
    }
    
    @k0
    public final V j(@j0 final K key, @j0 final V value) {
        if (key != null && value != null) {
            synchronized (this) {
                ++this.d;
                this.b += this.n(key, value);
                final V put = this.a.put(key, value);
                if (put != null) {
                    this.b -= this.n(key, put);
                }
                // monitorexit(this)
                if (put != null) {
                    this.c(false, key, put, value);
                }
                this.r(this.c);
                return put;
            }
        }
        throw new NullPointerException("key == null || value == null");
    }
    
    public final int k() {
        synchronized (this) {
            return this.d;
        }
    }
    
    @k0
    public final V l(@j0 final K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            final V remove = this.a.remove(k);
            if (remove != null) {
                this.b -= this.n(k, remove);
            }
            // monitorexit(this)
            if (remove != null) {
                this.c(false, k, remove, null);
            }
            return remove;
        }
    }
    
    public void m(final int c) {
        if (c > 0) {
            synchronized (this) {
                this.c = c;
                // monitorexit(this)
                this.r(c);
                return;
            }
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
    
    public final int o() {
        synchronized (this) {
            return this.b;
        }
    }
    
    protected int p(@j0 final K k, @j0 final V v) {
        return 1;
    }
    
    public final Map<K, V> q() {
        synchronized (this) {
            return new LinkedHashMap<K, V>((Map<? extends K, ? extends V>)this.a);
        }
    }
    
    public void r(final int n) {
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.getClass().getName());
                    sb.append(".sizeOf() is reporting inconsistent results!");
                    throw new IllegalStateException(sb.toString());
                }
                if (this.b <= n || this.a.isEmpty()) {
                    return;
                }
                final Map.Entry<K, V> entry = this.a.entrySet().iterator().next();
                final K key = entry.getKey();
                final V value = entry.getValue();
                this.a.remove(key);
                this.b -= this.n(key, value);
                ++this.f;
                // monitorexit(this)
                this.c(true, key, value, null);
            }
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final int g = this.g;
            final int n = this.h + g;
            int i;
            if (n != 0) {
                i = g * 100 / n;
            }
            else {
                i = 0;
            }
            return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.c, this.g, this.h, i);
        }
    }
}
