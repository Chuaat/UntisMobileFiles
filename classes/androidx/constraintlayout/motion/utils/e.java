// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.utils;

import java.lang.reflect.Method;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import androidx.constraintlayout.motion.widget.s;
import android.os.Build$VERSION;
import androidx.constraintlayout.core.motion.utils.b;
import androidx.constraintlayout.core.motion.utils.g;
import android.view.View;
import androidx.constraintlayout.widget.a;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.t;

public abstract class e extends t
{
    private static final String p = "ViewTimeCycle";
    
    public static e h(final String s, final SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(s, sparseArray);
    }
    
    public static e i(final String s, final long n) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n2 = -1;
        switch (hashCode) {
            case 92909918: {
                if (!s.equals("alpha")) {
                    break;
                }
                n2 = 11;
                break;
            }
            case 37232917: {
                if (!s.equals("transitionPathRotate")) {
                    break;
                }
                n2 = 10;
                break;
            }
            case -4379043: {
                if (!s.equals("elevation")) {
                    break;
                }
                n2 = 9;
                break;
            }
            case -40300674: {
                if (!s.equals("rotation")) {
                    break;
                }
                n2 = 8;
                break;
            }
            case -908189617: {
                if (!s.equals("scaleY")) {
                    break;
                }
                n2 = 7;
                break;
            }
            case -908189618: {
                if (!s.equals("scaleX")) {
                    break;
                }
                n2 = 6;
                break;
            }
            case -1001078227: {
                if (!s.equals("progress")) {
                    break;
                }
                n2 = 5;
                break;
            }
            case -1225497655: {
                if (!s.equals("translationZ")) {
                    break;
                }
                n2 = 4;
                break;
            }
            case -1225497656: {
                if (!s.equals("translationY")) {
                    break;
                }
                n2 = 3;
                break;
            }
            case -1225497657: {
                if (!s.equals("translationX")) {
                    break;
                }
                n2 = 2;
                break;
            }
            case -1249320805: {
                if (!s.equals("rotationY")) {
                    break;
                }
                n2 = 1;
                break;
            }
            case -1249320806: {
                if (!s.equals("rotationX")) {
                    break;
                }
                n2 = 0;
                break;
            }
        }
        e e = null;
        switch (n2) {
            default: {
                return null;
            }
            case 11: {
                e = new a();
                break;
            }
            case 10: {
                e = new d();
                break;
            }
            case 9: {
                e = new c();
                break;
            }
            case 8: {
                e = new f();
                break;
            }
            case 7: {
                e = new j();
                break;
            }
            case 6: {
                e = new i();
                break;
            }
            case 5: {
                e = new e();
                break;
            }
            case 4: {
                e = new m();
                break;
            }
            case 3: {
                e = new l();
                break;
            }
            case 2: {
                e = new k();
                break;
            }
            case 1: {
                e = new h();
                break;
            }
            case 0: {
                e = new g();
                break;
            }
        }
        e.d(n);
        return e;
    }
    
    public float g(float j, final long i, final View view, final androidx.constraintlayout.core.motion.utils.g g) {
        super.a.e(j, super.g);
        final float[] g2 = super.g;
        j = g2[1];
        final float n = fcmpl(j, 0.0f);
        if (n == 0) {
            super.h = false;
            return g2[2];
        }
        if (Float.isNaN(super.j)) {
            final float a = g.a(view, super.f, 0);
            super.j = a;
            if (Float.isNaN(a)) {
                super.j = 0.0f;
            }
        }
        j = (float)((super.j + (i - super.i) * 1.0E-9 * j) % 1.0);
        super.j = j;
        g.b(view, super.f, 0, j);
        super.i = i;
        j = super.g[0];
        final float a2 = this.a(super.j);
        final float n2 = super.g[2];
        super.h = (j != 0.0f || n != 0);
        return a2 * j + n2;
    }
    
    public abstract boolean j(final View p0, final float p1, final long p2, final androidx.constraintlayout.core.motion.utils.g p3);
    
    static class a extends e
    {
        @Override
        public boolean j(final View view, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            view.setAlpha(this.g(n, n2, view, g));
            return super.h;
        }
    }
    
    public static class b extends e
    {
        String q;
        SparseArray<androidx.constraintlayout.widget.a> r;
        SparseArray<float[]> s;
        float[] t;
        float[] u;
        
        public b(final String s, final SparseArray<androidx.constraintlayout.widget.a> r) {
            this.s = (SparseArray<float[]>)new SparseArray();
            this.q = s.split(",")[1];
            this.r = r;
        }
        
        @Override
        public void c(final int n, final float n2, final float n3, final int n4, final float n5) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }
        
        @Override
        public void f(final int n) {
            final int size = this.r.size();
            final int i = ((androidx.constraintlayout.widget.a)this.r.valueAt(0)).i();
            final double[] array = new double[size];
            final int n2 = i + 2;
            this.t = new float[n2];
            this.u = new float[i];
            final double[][] array2 = new double[size][n2];
            for (int j = 0; j < size; ++j) {
                final int key = this.r.keyAt(j);
                final androidx.constraintlayout.widget.a a = (androidx.constraintlayout.widget.a)this.r.valueAt(j);
                final float[] array3 = (float[])this.s.valueAt(j);
                array[j] = key * 0.01;
                a.g(this.t);
                int n3 = 0;
                while (true) {
                    final float[] t = this.t;
                    if (n3 >= t.length) {
                        break;
                    }
                    array2[j][n3] = t[n3];
                    ++n3;
                }
                array2[j][i] = array3[0];
                array2[j][i + 1] = array3[1];
            }
            super.a = androidx.constraintlayout.core.motion.utils.b.a(n, array, array2);
        }
        
        @Override
        public boolean j(final View view, float n, final long i, final androidx.constraintlayout.core.motion.utils.g g) {
            super.a.e(n, this.t);
            final float[] t = this.t;
            n = t[t.length - 2];
            final float n2 = t[t.length - 1];
            final long j = super.i;
            if (Float.isNaN(super.j)) {
                final float a = g.a(view, this.q, 0);
                super.j = a;
                if (Float.isNaN(a)) {
                    super.j = 0.0f;
                }
            }
            final float k = (float)((super.j + (i - j) * 1.0E-9 * n) % 1.0);
            super.j = k;
            super.i = i;
            final float a2 = this.a(k);
            super.h = false;
            int n3 = 0;
            while (true) {
                final float[] u = this.u;
                if (n3 >= u.length) {
                    break;
                }
                final boolean h = super.h;
                final float[] t2 = this.t;
                super.h = (h | t2[n3] != 0.0);
                u[n3] = t2[n3] * a2 + n2;
                ++n3;
            }
            ((androidx.constraintlayout.widget.a)this.r.valueAt(0)).o(view, this.u);
            if (n != 0.0f) {
                super.h = true;
            }
            return super.h;
        }
        
        public void k(final int n, final androidx.constraintlayout.widget.a a, final float n2, final int b, final float n3) {
            this.r.append(n, (Object)a);
            this.s.append(n, (Object)new float[] { n2, n3 });
            super.b = Math.max(super.b, b);
        }
    }
    
    static class c extends e
    {
        @Override
        public boolean j(final View view, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            if (Build$VERSION.SDK_INT >= 21) {
                view.setElevation(this.g(n, n2, view, g));
            }
            return super.h;
        }
    }
    
    public static class d extends e
    {
        @Override
        public boolean j(final View view, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            return super.h;
        }
        
        public boolean k(final View view, final androidx.constraintlayout.core.motion.utils.g g, final float n, final long n2, final double x, final double y) {
            view.setRotation(this.g(n, n2, view, g) + (float)Math.toDegrees(Math.atan2(y, x)));
            return super.h;
        }
    }
    
    static class e extends androidx.constraintlayout.motion.utils.e
    {
        boolean q;
        
        e() {
            this.q = false;
        }
        
        @Override
        public boolean j(final View obj, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            if (obj instanceof s) {
                ((s)obj).setProgress(this.g(n, n2, (View)obj, g));
            }
            else {
                if (this.q) {
                    return false;
                }
                Method method = null;
                try {
                    method = obj.getClass().getMethod("setProgress", Float.TYPE);
                }
                catch (NoSuchMethodException ex) {
                    this.q = true;
                }
                if (method != null) {
                    try {
                        method.invoke(obj, this.g(n, n2, (View)obj, g));
                        return super.h;
                    }
                    catch (InvocationTargetException obj) {}
                    catch (IllegalAccessException ex2) {}
                    Log.e("ViewTimeCycle", "unable to setProgress", (Throwable)obj);
                }
            }
            return super.h;
        }
    }
    
    static class f extends e
    {
        @Override
        public boolean j(final View view, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            view.setRotation(this.g(n, n2, view, g));
            return super.h;
        }
    }
    
    static class g extends e
    {
        @Override
        public boolean j(final View view, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            view.setRotationX(this.g(n, n2, view, g));
            return super.h;
        }
    }
    
    static class h extends e
    {
        @Override
        public boolean j(final View view, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            view.setRotationY(this.g(n, n2, view, g));
            return super.h;
        }
    }
    
    static class i extends e
    {
        @Override
        public boolean j(final View view, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            view.setScaleX(this.g(n, n2, view, g));
            return super.h;
        }
    }
    
    static class j extends e
    {
        @Override
        public boolean j(final View view, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            view.setScaleY(this.g(n, n2, view, g));
            return super.h;
        }
    }
    
    static class k extends e
    {
        @Override
        public boolean j(final View view, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            view.setTranslationX(this.g(n, n2, view, g));
            return super.h;
        }
    }
    
    static class l extends e
    {
        @Override
        public boolean j(final View view, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            view.setTranslationY(this.g(n, n2, view, g));
            return super.h;
        }
    }
    
    static class m extends e
    {
        @Override
        public boolean j(final View view, final float n, final long n2, final androidx.constraintlayout.core.motion.utils.g g) {
            if (Build$VERSION.SDK_INT >= 21) {
                view.setTranslationZ(this.g(n, n2, view, g));
            }
            return super.h;
        }
    }
}
