// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.key;

import java.util.HashSet;
import androidx.constraintlayout.core.motion.utils.o;
import java.util.HashMap;
import androidx.constraintlayout.core.motion.utils.w;

public abstract class b implements w
{
    public static int m = -1;
    public static final String n = "alpha";
    public static final String o = "elevation";
    public static final String p = "rotationZ";
    public static final String q = "rotationX";
    public static final String r = "transitionPathRotate";
    public static final String s = "scaleX";
    public static final String t = "scaleY";
    public static final String u = "translationX";
    public static final String v = "translationY";
    public static final String w = "CUSTOM";
    public static final String x = "visibility";
    public int h;
    int i;
    String j;
    public int k;
    public HashMap<String, androidx.constraintlayout.core.motion.b> l;
    
    public b() {
        final int m = b.m;
        this.h = m;
        this.i = m;
        this.j = null;
    }
    
    public abstract void a(final HashMap<String, o> p0);
    
    @Override
    public boolean b(final int n, final int h) {
        if (n != 100) {
            return false;
        }
        this.h = h;
        return true;
    }
    
    @Override
    public boolean c(final int n, final float n2) {
        return false;
    }
    
    @Override
    public boolean d(final int n, final String j) {
        if (n != 101) {
            return false;
        }
        this.j = j;
        return true;
    }
    
    @Override
    public boolean e(final int n, final boolean b) {
        return false;
    }
    
    public abstract b g();
    
    public b h(final b b) {
        this.h = b.h;
        this.i = b.i;
        this.j = b.j;
        this.k = b.k;
        return this;
    }
    
    public abstract void i(final HashSet<String> p0);
    
    public int j() {
        return this.h;
    }
    
    boolean k(final String s) {
        final String j = this.j;
        return j != null && s != null && s.matches(j);
    }
    
    public void l(final String key, final int n, final float n2) {
        this.l.put(key, new androidx.constraintlayout.core.motion.b(key, n, n2));
    }
    
    public void m(final String key, final int n, final int n2) {
        this.l.put(key, new androidx.constraintlayout.core.motion.b(key, n, n2));
    }
    
    public void n(final String key, final int n, final String s) {
        this.l.put(key, new androidx.constraintlayout.core.motion.b(key, n, s));
    }
    
    public void o(final String key, final int n, final boolean b) {
        this.l.put(key, new androidx.constraintlayout.core.motion.b(key, n, b));
    }
    
    public void p(final int h) {
        this.h = h;
    }
    
    public void q(final HashMap<String, Integer> hashMap) {
    }
    
    public b r(final int i) {
        this.i = i;
        return this;
    }
    
    boolean s(final Object o) {
        boolean b;
        if (o instanceof Boolean) {
            b = (boolean)o;
        }
        else {
            b = Boolean.parseBoolean(o.toString());
        }
        return b;
    }
    
    float t(final Object o) {
        float n;
        if (o instanceof Float) {
            n = (float)o;
        }
        else {
            n = Float.parseFloat(o.toString());
        }
        return n;
    }
    
    int u(final Object o) {
        int n;
        if (o instanceof Integer) {
            n = (int)o;
        }
        else {
            n = Integer.parseInt(o.toString());
        }
        return n;
    }
}
