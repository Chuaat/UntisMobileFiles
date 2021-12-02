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
import android.view.View;
import androidx.constraintlayout.widget.a;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.o;

public abstract class c extends androidx.constraintlayout.core.motion.utils.o
{
    private static final String g = "ViewSpline";
    
    public static c k(final String s, final SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(s, sparseArray);
    }
    
    public static c l(final String s) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 156108012: {
                if (!s.equals("waveOffset")) {
                    break;
                }
                n = 15;
                break;
            }
            case 92909918: {
                if (!s.equals("alpha")) {
                    break;
                }
                n = 14;
                break;
            }
            case 37232917: {
                if (!s.equals("transitionPathRotate")) {
                    break;
                }
                n = 13;
                break;
            }
            case -4379043: {
                if (!s.equals("elevation")) {
                    break;
                }
                n = 12;
                break;
            }
            case -40300674: {
                if (!s.equals("rotation")) {
                    break;
                }
                n = 11;
                break;
            }
            case -760884509: {
                if (!s.equals("transformPivotY")) {
                    break;
                }
                n = 10;
                break;
            }
            case -760884510: {
                if (!s.equals("transformPivotX")) {
                    break;
                }
                n = 9;
                break;
            }
            case -797520672: {
                if (!s.equals("waveVariesBy")) {
                    break;
                }
                n = 8;
                break;
            }
            case -908189617: {
                if (!s.equals("scaleY")) {
                    break;
                }
                n = 7;
                break;
            }
            case -908189618: {
                if (!s.equals("scaleX")) {
                    break;
                }
                n = 6;
                break;
            }
            case -1001078227: {
                if (!s.equals("progress")) {
                    break;
                }
                n = 5;
                break;
            }
            case -1225497655: {
                if (!s.equals("translationZ")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1225497656: {
                if (!s.equals("translationY")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1225497657: {
                if (!s.equals("translationX")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1249320805: {
                if (!s.equals("rotationY")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1249320806: {
                if (!s.equals("rotationX")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return null;
            }
            case 15: {
                return new a();
            }
            case 14: {
                return new a();
            }
            case 13: {
                return new d();
            }
            case 12: {
                return new c();
            }
            case 11: {
                return new h();
            }
            case 10: {
                return new f();
            }
            case 9: {
                return new e();
            }
            case 8: {
                return new a();
            }
            case 7: {
                return new l();
            }
            case 6: {
                return new k();
            }
            case 5: {
                return new g();
            }
            case 4: {
                return new o();
            }
            case 3: {
                return new n();
            }
            case 2: {
                return new m();
            }
            case 1: {
                return new j();
            }
            case 0: {
                return new i();
            }
        }
    }
    
    public abstract void m(final View p0, final float p1);
    
    static class a extends c
    {
        @Override
        public void m(final View view, final float n) {
            view.setAlpha(this.a(n));
        }
    }
    
    public static class b extends c
    {
        String h;
        SparseArray<androidx.constraintlayout.widget.a> i;
        float[] j;
        
        public b(final String s, final SparseArray<androidx.constraintlayout.widget.a> i) {
            this.h = s.split(",")[1];
            this.i = i;
        }
        
        @Override
        public void g(final int n, final float n2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }
        
        @Override
        public void j(final int n) {
            final int size = this.i.size();
            final int i = ((androidx.constraintlayout.widget.a)this.i.valueAt(0)).i();
            final double[] array = new double[size];
            this.j = new float[i];
            final double[][] array2 = new double[size][i];
            for (int j = 0; j < size; ++j) {
                final int key = this.i.keyAt(j);
                final androidx.constraintlayout.widget.a a = (androidx.constraintlayout.widget.a)this.i.valueAt(j);
                array[j] = key * 0.01;
                a.g(this.j);
                int n2 = 0;
                while (true) {
                    final float[] k = this.j;
                    if (n2 >= k.length) {
                        break;
                    }
                    array2[j][n2] = k[n2];
                    ++n2;
                }
            }
            super.a = androidx.constraintlayout.core.motion.utils.b.a(n, array, array2);
        }
        
        @Override
        public void m(final View view, final float n) {
            super.a.e(n, this.j);
            ((androidx.constraintlayout.widget.a)this.i.valueAt(0)).o(view, this.j);
        }
        
        public void n(final int n, final androidx.constraintlayout.widget.a a) {
            this.i.append(n, (Object)a);
        }
    }
    
    static class c extends androidx.constraintlayout.motion.utils.c
    {
        @Override
        public void m(final View view, final float n) {
            if (Build$VERSION.SDK_INT >= 21) {
                view.setElevation(this.a(n));
            }
        }
    }
    
    public static class d extends c
    {
        @Override
        public void m(final View view, final float n) {
        }
        
        public void n(final View view, final float n, final double x, final double y) {
            view.setRotation(this.a(n) + (float)Math.toDegrees(Math.atan2(y, x)));
        }
    }
    
    static class e extends c
    {
        @Override
        public void m(final View view, final float n) {
            view.setPivotX(this.a(n));
        }
    }
    
    static class f extends c
    {
        @Override
        public void m(final View view, final float n) {
            view.setPivotY(this.a(n));
        }
    }
    
    static class g extends c
    {
        boolean h;
        
        g() {
            this.h = false;
        }
        
        @Override
        public void m(final View obj, final float n) {
            if (obj instanceof s) {
                ((s)obj).setProgress(this.a(n));
            }
            else {
                if (this.h) {
                    return;
                }
                Method method = null;
                try {
                    method = obj.getClass().getMethod("setProgress", Float.TYPE);
                }
                catch (NoSuchMethodException ex) {
                    this.h = true;
                }
                if (method != null) {
                    try {
                        method.invoke(obj, this.a(n));
                        return;
                    }
                    catch (InvocationTargetException obj) {}
                    catch (IllegalAccessException ex2) {}
                    Log.e("ViewSpline", "unable to setProgress", (Throwable)obj);
                }
            }
        }
    }
    
    static class h extends c
    {
        @Override
        public void m(final View view, final float n) {
            view.setRotation(this.a(n));
        }
    }
    
    static class i extends c
    {
        @Override
        public void m(final View view, final float n) {
            view.setRotationX(this.a(n));
        }
    }
    
    static class j extends c
    {
        @Override
        public void m(final View view, final float n) {
            view.setRotationY(this.a(n));
        }
    }
    
    static class k extends c
    {
        @Override
        public void m(final View view, final float n) {
            view.setScaleX(this.a(n));
        }
    }
    
    static class l extends c
    {
        @Override
        public void m(final View view, final float n) {
            view.setScaleY(this.a(n));
        }
    }
    
    static class m extends c
    {
        @Override
        public void m(final View view, final float n) {
            view.setTranslationX(this.a(n));
        }
    }
    
    static class n extends c
    {
        @Override
        public void m(final View view, final float n) {
            view.setTranslationY(this.a(n));
        }
    }
    
    static class o extends c
    {
        @Override
        public void m(final View view, final float n) {
            if (Build$VERSION.SDK_INT >= 21) {
                view.setTranslationZ(this.a(n));
            }
        }
    }
}
