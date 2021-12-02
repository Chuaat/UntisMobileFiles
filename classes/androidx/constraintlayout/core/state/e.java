// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state;

import java.util.Set;
import java.util.HashMap;

public class e
{
    private static final e b;
    private HashMap<String, f> a;
    
    static {
        b = new e();
    }
    
    public e() {
        this.a = new HashMap<String, f>();
    }
    
    public static e c() {
        return e.b;
    }
    
    public String a(final String key) {
        final f f = this.a.get(key);
        if (f != null) {
            return f.b();
        }
        return null;
    }
    
    public String b(final String key) {
        final f f = this.a.get(key);
        if (f != null) {
            return f.g();
        }
        return null;
    }
    
    public long d(final String key) {
        final f f = this.a.get(key);
        if (f != null) {
            return f.h();
        }
        return Long.MAX_VALUE;
    }
    
    public Set<String> e() {
        return this.a.keySet();
    }
    
    public void f(final String key, final f value) {
        this.a.put(key, value);
    }
    
    public void g(final String key, final int n) {
        final f f = this.a.get(key);
        if (f != null) {
            f.c(n);
        }
    }
    
    public void h(final String key, final int n) {
        final f f = this.a.get(key);
        if (f != null) {
            f.d(n);
        }
    }
    
    public void i(final String key, final f f) {
        this.a.remove(key);
    }
    
    public void j(final String key, final String s) {
        final f f = this.a.get(key);
        if (f != null) {
            f.a(s);
        }
    }
    
    public void k(final String key, final int n, final int n2) {
        final f f = this.a.get(key);
        if (f != null) {
            f.f(n, n2);
        }
    }
    
    public void l(final String key, final float n) {
        final f f = this.a.get(key);
        if (f != null) {
            f.e(n);
        }
    }
}
