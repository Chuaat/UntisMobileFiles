// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.util.AttributeSet;
import android.content.Context;
import java.util.HashSet;
import androidx.constraintlayout.motion.utils.c;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;

public abstract class f
{
    public static final String A = "motionProgress";
    public static final String B = "transitionEasing";
    public static final String C = "visibility";
    public static int f = -1;
    public static final String g = "alpha";
    public static final String h = "elevation";
    public static final String i = "rotation";
    public static final String j = "rotationX";
    public static final String k = "rotationY";
    public static final String l = "transformPivotX";
    public static final String m = "transformPivotY";
    public static final String n = "transitionPathRotate";
    public static final String o = "scaleX";
    public static final String p = "scaleY";
    public static final String q = "wavePeriod";
    public static final String r = "waveOffset";
    public static final String s = "wavePhase";
    public static final String t = "waveVariesBy";
    public static final String u = "translationX";
    public static final String v = "translationY";
    public static final String w = "translationZ";
    public static final String x = "progress";
    public static final String y = "CUSTOM";
    public static final String z = "curveFit";
    int a;
    int b;
    String c;
    protected int d;
    HashMap<String, a> e;
    
    public f() {
        final int f = androidx.constraintlayout.motion.widget.f.f;
        this.a = f;
        this.b = f;
        this.c = null;
    }
    
    public abstract void a(final HashMap<String, c> p0);
    
    public abstract f b();
    
    public f c(final f f) {
        this.a = f.a;
        this.b = f.b;
        this.c = f.c;
        this.d = f.d;
        this.e = f.e;
        return this;
    }
    
    abstract void d(final HashSet<String> p0);
    
    public int e() {
        return this.a;
    }
    
    abstract void f(final Context p0, final AttributeSet p1);
    
    boolean g(final String s) {
        final String c = this.c;
        return c != null && s != null && s.matches(c);
    }
    
    public void h(final int a) {
        this.a = a;
    }
    
    public void i(final HashMap<String, Integer> hashMap) {
    }
    
    public abstract void j(final String p0, final Object p1);
    
    public f k(final int b) {
        this.b = b;
        return this;
    }
    
    boolean l(final Object o) {
        boolean b;
        if (o instanceof Boolean) {
            b = (boolean)o;
        }
        else {
            b = Boolean.parseBoolean(o.toString());
        }
        return b;
    }
    
    float m(final Object o) {
        float n;
        if (o instanceof Float) {
            n = (float)o;
        }
        else {
            n = Float.parseFloat(o.toString());
        }
        return n;
    }
    
    int n(final Object o) {
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
