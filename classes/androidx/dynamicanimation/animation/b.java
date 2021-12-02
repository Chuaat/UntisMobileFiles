// 
// Decompiled by Procyon v0.5.36
// 

package androidx.dynamicanimation.animation;

import androidx.annotation.t;
import android.util.AndroidRuntimeException;
import android.os.Looper;
import androidx.annotation.t0;
import androidx.core.view.j0;
import android.view.View;
import java.util.ArrayList;

public abstract class b<T extends b<T>> implements androidx.dynamicanimation.animation.a.b
{
    public static final float A = 1.0f;
    public static final float B = 0.1f;
    public static final float C = 0.00390625f;
    public static final float D = 0.002f;
    private static final float E = Float.MAX_VALUE;
    private static final float F = 0.75f;
    public static final s m;
    public static final s n;
    public static final s o;
    public static final s p;
    public static final s q;
    public static final s r;
    public static final s s;
    public static final s t;
    public static final s u;
    public static final s v;
    public static final s w;
    public static final s x;
    public static final s y;
    public static final s z;
    float a;
    float b;
    boolean c;
    final Object d;
    final androidx.dynamicanimation.animation.d e;
    boolean f;
    float g;
    float h;
    private long i;
    private float j;
    private final ArrayList<q> k;
    private final ArrayList<r> l;
    
    static {
        m = (s)new s("translationX") {
            public float d(final View view) {
                return view.getTranslationX();
            }
            
            public void e(final View view, final float translationX) {
                view.setTranslationX(translationX);
            }
        };
        n = (s)new s("translationY") {
            public float d(final View view) {
                return view.getTranslationY();
            }
            
            public void e(final View view, final float translationY) {
                view.setTranslationY(translationY);
            }
        };
        o = (s)new s("translationZ") {
            public float d(final View view) {
                return j0.z0(view);
            }
            
            public void e(final View view, final float n) {
                j0.u2(view, n);
            }
        };
        p = (s)new s("scaleX") {
            public float d(final View view) {
                return view.getScaleX();
            }
            
            public void e(final View view, final float scaleX) {
                view.setScaleX(scaleX);
            }
        };
        q = (s)new s("scaleY") {
            public float d(final View view) {
                return view.getScaleY();
            }
            
            public void e(final View view, final float scaleY) {
                view.setScaleY(scaleY);
            }
        };
        r = (s)new s("rotation") {
            public float d(final View view) {
                return view.getRotation();
            }
            
            public void e(final View view, final float rotation) {
                view.setRotation(rotation);
            }
        };
        s = (s)new s("rotationX") {
            public float d(final View view) {
                return view.getRotationX();
            }
            
            public void e(final View view, final float rotationX) {
                view.setRotationX(rotationX);
            }
        };
        t = (s)new s("rotationY") {
            public float d(final View view) {
                return view.getRotationY();
            }
            
            public void e(final View view, final float rotationY) {
                view.setRotationY(rotationY);
            }
        };
        u = (s)new s("x") {
            public float d(final View view) {
                return view.getX();
            }
            
            public void e(final View view, final float x) {
                view.setX(x);
            }
        };
        v = (s)new s("y") {
            public float d(final View view) {
                return view.getY();
            }
            
            public void e(final View view, final float y) {
                view.setY(y);
            }
        };
        w = (s)new s("z") {
            public float d(final View view) {
                return j0.E0(view);
            }
            
            public void e(final View view, final float n) {
                j0.z2(view, n);
            }
        };
        x = (s)new s("alpha") {
            public float d(final View view) {
                return view.getAlpha();
            }
            
            public void e(final View view, final float alpha) {
                view.setAlpha(alpha);
            }
        };
        y = (s)new s("scrollX") {
            public float d(final View view) {
                return (float)view.getScrollX();
            }
            
            public void e(final View view, final float n) {
                view.setScrollX((int)n);
            }
        };
        z = (s)new s("scrollY") {
            public float d(final View view) {
                return (float)view.getScrollY();
            }
            
            public void e(final View view, final float n) {
                view.setScrollY((int)n);
            }
        };
    }
    
    b(final androidx.dynamicanimation.animation.e e) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -Float.MAX_VALUE;
        this.i = 0L;
        this.k = new ArrayList<q>();
        this.l = new ArrayList<r>();
        this.d = null;
        this.e = new androidx.dynamicanimation.animation.d("FloatValueHolder") {
            @Override
            public float b(final Object o) {
                return e.a();
            }
            
            @Override
            public void c(final Object o, final float n) {
                e.b(n);
            }
        };
        this.j = 1.0f;
    }
    
     <K> b(final K d, final androidx.dynamicanimation.animation.d<K> e) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -Float.MAX_VALUE;
        this.i = 0L;
        this.k = new ArrayList<q>();
        this.l = new ArrayList<r>();
        this.d = d;
        this.e = e;
        float j;
        if (e != androidx.dynamicanimation.animation.b.r && e != androidx.dynamicanimation.animation.b.s && e != androidx.dynamicanimation.animation.b.t) {
            if (e == androidx.dynamicanimation.animation.b.x || e == androidx.dynamicanimation.animation.b.p || e == androidx.dynamicanimation.animation.b.q) {
                this.j = 0.00390625f;
                return;
            }
            j = 1.0f;
        }
        else {
            j = 0.1f;
        }
        this.j = j;
    }
    
    private void e(final boolean b) {
        int i = 0;
        this.f = false;
        androidx.dynamicanimation.animation.a.e().h((androidx.dynamicanimation.animation.a.b)this);
        this.i = 0L;
        this.c = false;
        while (i < this.k.size()) {
            if (this.k.get(i) != null) {
                this.k.get(i).a(this, b, this.b, this.a);
            }
            ++i;
        }
        n(this.k);
    }
    
    private float h() {
        return this.e.b(this.d);
    }
    
    private static <T> void m(final ArrayList<T> list, final T o) {
        final int index = list.indexOf(o);
        if (index >= 0) {
            list.set(index, null);
        }
    }
    
    private static <T> void n(final ArrayList<T> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i) == null) {
                list.remove(i);
            }
        }
    }
    
    private void x() {
        if (!this.f) {
            this.f = true;
            if (!this.c) {
                this.b = this.h();
            }
            final float b = this.b;
            if (b > this.g || b < this.h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            androidx.dynamicanimation.animation.a.e().a((androidx.dynamicanimation.animation.a.b)this, 0L);
        }
    }
    
    @t0({ t0.a.G })
    @Override
    public boolean a(final long n) {
        final long i = this.i;
        if (i == 0L) {
            this.i = n;
            this.s(this.b);
            return false;
        }
        this.i = n;
        final boolean y = this.y(n - i);
        final float min = Math.min(this.b, this.g);
        this.b = min;
        this.s(this.b = Math.max(min, this.h));
        if (y) {
            this.e(false);
        }
        return y;
    }
    
    public T b(final q q) {
        if (!this.k.contains(q)) {
            this.k.add(q);
        }
        return (T)this;
    }
    
    public T c(final r r) {
        if (!this.k()) {
            if (!this.l.contains(r)) {
                this.l.add(r);
            }
            return (T)this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }
    
    public void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f) {
                this.e(true);
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }
    
    abstract float f(final float p0, final float p1);
    
    public float g() {
        return this.j;
    }
    
    float i() {
        return this.j * 0.75f;
    }
    
    abstract boolean j(final float p0, final float p1);
    
    public boolean k() {
        return this.f;
    }
    
    public void l(final q q) {
        m(this.k, q);
    }
    
    public void o(final r r) {
        m(this.l, r);
    }
    
    public T p(final float g) {
        this.g = g;
        return (T)this;
    }
    
    public T q(final float h) {
        this.h = h;
        return (T)this;
    }
    
    public T r(@t(from = 0.0, fromInclusive = false) final float j) {
        if (j > 0.0f) {
            this.v((this.j = j) * 0.75f);
            return (T)this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }
    
    void s(final float n) {
        this.e.c(this.d, n);
        for (int i = 0; i < this.l.size(); ++i) {
            if (this.l.get(i) != null) {
                this.l.get(i).a(this, this.b, this.a);
            }
        }
        n(this.l);
    }
    
    public T t(final float b) {
        this.b = b;
        this.c = true;
        return (T)this;
    }
    
    public T u(final float a) {
        this.a = a;
        return (T)this;
    }
    
    abstract void v(final float p0);
    
    public void w() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f) {
                this.x();
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }
    
    abstract boolean y(final long p0);
    
    static class p
    {
        float a;
        float b;
    }
    
    public interface q
    {
        void a(final b p0, final boolean p1, final float p2, final float p3);
    }
    
    public interface r
    {
        void a(final b p0, final float p1, final float p2);
    }
    
    public abstract static class s extends d<View>
    {
        private s(final String s) {
            super(s);
        }
    }
}
