// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.core.motion.utils.d;
import android.util.Log;
import android.content.res.TypedArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.content.Context;
import androidx.constraintlayout.motion.utils.c;
import java.util.HashMap;

public class j extends k
{
    private static final String R = "KeyPosition";
    static final String S = "KeyPosition";
    public static final int T = 2;
    public static final int U = 1;
    public static final int V = 0;
    public static final String W = "transitionEasing";
    public static final String X = "drawPath";
    public static final String Y = "percentWidth";
    public static final String Z = "percentHeight";
    public static final String a0 = "sizePercent";
    public static final String b0 = "percentX";
    public static final String c0 = "percentY";
    static final int d0 = 2;
    String F;
    int G;
    int H;
    float I;
    float J;
    float K;
    float L;
    float M;
    float N;
    int O;
    private float P;
    private float Q;
    
    public j() {
        this.F = null;
        this.G = androidx.constraintlayout.motion.widget.f.f;
        this.H = 0;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.O = 0;
        this.P = Float.NaN;
        this.Q = Float.NaN;
        super.d = 2;
    }
    
    private void t(final float n, final float n2, float k, float n3) {
        final float n4 = k - n;
        final float n5 = n3 - n2;
        final boolean naN = Float.isNaN(this.K);
        float m = 0.0f;
        if (naN) {
            k = 0.0f;
        }
        else {
            k = this.K;
        }
        if (Float.isNaN(this.N)) {
            n3 = 0.0f;
        }
        else {
            n3 = this.N;
        }
        float l;
        if (Float.isNaN(this.L)) {
            l = 0.0f;
        }
        else {
            l = this.L;
        }
        if (!Float.isNaN(this.M)) {
            m = this.M;
        }
        this.P = (float)(int)(n + k * n4 + m * n5);
        this.Q = (float)(int)(n2 + n4 * n3 + n5 * l);
    }
    
    private void u(final float n, final float n2, float n3, float n4) {
        n3 -= n;
        final float n5 = n4 - n2;
        n4 = -n5;
        final float k = this.K;
        final float l = this.L;
        this.P = n + n3 * k + n4 * l;
        this.Q = n2 + n5 * k + n3 * l;
    }
    
    private void v(final int n, final int n2) {
        final float n3 = (float)(n - 0);
        final float k = this.K;
        final float n4 = 0;
        this.P = n3 * k + n4;
        this.Q = (n2 - 0) * k + n4;
    }
    
    @Override
    public void a(final HashMap<String, c> hashMap) {
    }
    
    @Override
    public f b() {
        return new j().c(this);
    }
    
    @Override
    public f c(final f f) {
        super.c(f);
        final j j = (j)f;
        this.F = j.F;
        this.G = j.G;
        this.H = j.H;
        this.I = j.I;
        this.J = Float.NaN;
        this.K = j.K;
        this.L = j.L;
        this.M = j.M;
        this.N = j.N;
        this.P = j.P;
        this.Q = j.Q;
        return this;
    }
    
    public void f(final Context context, final AttributeSet set) {
        b(this, context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.uf));
    }
    
    @Override
    public void j(final String s, final Object o) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 428090548: {
                if (!s.equals("percentY")) {
                    break;
                }
                n = 6;
                break;
            }
            case 428090547: {
                if (!s.equals("percentX")) {
                    break;
                }
                n = 5;
                break;
            }
            case -200259324: {
                if (!s.equals("sizePercent")) {
                    break;
                }
                n = 4;
                break;
            }
            case -827014263: {
                if (!s.equals("drawPath")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1017587252: {
                if (!s.equals("percentHeight")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1127236479: {
                if (!s.equals("percentWidth")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1812823328: {
                if (!s.equals("transitionEasing")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        float n2 = 0.0f;
        switch (n) {
            default: {
                return;
            }
            case 6: {
                this.L = this.m(o);
                return;
            }
            case 5: {
                this.K = this.m(o);
                return;
            }
            case 4: {
                n2 = this.m(o);
                this.I = n2;
                break;
            }
            case 3: {
                this.H = this.n(o);
                return;
            }
            case 2: {
                n2 = this.m(o);
                break;
            }
            case 1: {
                this.I = this.m(o);
                return;
            }
            case 0: {
                this.F = o.toString();
                return;
            }
        }
        this.J = n2;
    }
    
    @Override
    void o(final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        final int o = this.O;
        if (o == 1) {
            this.u(n3, n4, n5, n6);
            return;
        }
        if (o != 2) {
            this.t(n3, n4, n5, n6);
            return;
        }
        this.v(n, n2);
    }
    
    @Override
    float p() {
        return this.P;
    }
    
    @Override
    float q() {
        return this.Q;
    }
    
    @Override
    public boolean r(final int n, final int n2, final RectF rectF, final RectF rectF2, final float n3, final float n4) {
        this.o(n, n2, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        return Math.abs(n3 - this.P) < 20.0f && Math.abs(n4 - this.Q) < 20.0f;
    }
    
    public void s(final View view, final RectF rectF, final RectF rectF2, final float n, final float n2, final String[] array, final float[] array2) {
        final int o = this.O;
        if (o == 1) {
            this.x(rectF, rectF2, n, n2, array, array2);
            return;
        }
        if (o != 2) {
            this.w(rectF, rectF2, n, n2, array, array2);
            return;
        }
        this.y(view, rectF, rectF2, n, n2, array, array2);
    }
    
    void w(final RectF rectF, final RectF rectF2, float n, final float n2, final String[] array, final float[] array2) {
        final float centerX = rectF.centerX();
        final float centerY = rectF.centerY();
        final float centerX2 = rectF2.centerX();
        final float centerY2 = rectF2.centerY();
        final float n3 = centerX2 - centerX;
        final float n4 = centerY2 - centerY;
        if (array[0] != null) {
            final boolean equals = "percentX".equals(array[0]);
            n = (n - centerX) / n3;
            if (equals) {
                array2[0] = n;
                array2[1] = (n2 - centerY) / n4;
            }
            else {
                array2[1] = n;
                array2[0] = (n2 - centerY) / n4;
            }
        }
        else {
            array[0] = "percentX";
            array2[0] = (n - centerX) / n3;
            array[1] = "percentY";
            array2[1] = (n2 - centerY) / n4;
        }
    }
    
    void x(final RectF rectF, final RectF rectF2, float n, float n2, final String[] array, final float[] array2) {
        final float centerX = rectF.centerX();
        final float centerY = rectF.centerY();
        final float centerX2 = rectF2.centerX();
        final float centerY2 = rectF2.centerY();
        final float n3 = centerX2 - centerX;
        final float n4 = centerY2 - centerY;
        final float n5 = (float)Math.hypot(n3, n4);
        if (n5 < 1.0E-4) {
            System.out.println("distance ~ 0");
            array2[1] = (array2[0] = 0.0f);
            return;
        }
        final float n6 = n3 / n5;
        final float n7 = n4 / n5;
        n2 -= centerY;
        final float n8 = n - centerX;
        n = (n6 * n2 - n8 * n7) / n5;
        n2 = (n6 * n8 + n7 * n2) / n5;
        if (array[0] != null) {
            if ("percentX".equals(array[0])) {
                array2[0] = n2;
                array2[1] = n;
            }
        }
        else {
            array[0] = "percentX";
            array[1] = "percentY";
            array2[0] = n2;
            array2[1] = n;
        }
    }
    
    void y(final View view, final RectF rectF, final RectF rectF2, float n, final float n2, final String[] array, final float[] array2) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        final ViewGroup viewGroup = (ViewGroup)view.getParent();
        final int width = viewGroup.getWidth();
        final int height = viewGroup.getHeight();
        if (array[0] != null) {
            final boolean equals = "percentX".equals(array[0]);
            n /= width;
            if (equals) {
                array2[0] = n;
                array2[1] = n2 / height;
            }
            else {
                array2[1] = n;
                array2[0] = n2 / height;
            }
        }
        else {
            array[0] = "percentX";
            array2[0] = n / width;
            array[1] = "percentY";
            array2[1] = n2 / height;
        }
    }
    
    public void z(final int o) {
        this.O = o;
    }
    
    private static class a
    {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 3;
        private static final int d = 4;
        private static final int e = 5;
        private static final int f = 6;
        private static final int g = 7;
        private static final int h = 8;
        private static final int i = 9;
        private static final int j = 10;
        private static final int k = 11;
        private static final int l = 12;
        private static SparseIntArray m;
        
        static {
            (androidx.constraintlayout.motion.widget.j.a.m = new SparseIntArray()).append(androidx.constraintlayout.widget.j.m.zf, 1);
            androidx.constraintlayout.motion.widget.j.a.m.append(androidx.constraintlayout.widget.j.m.xf, 2);
            androidx.constraintlayout.motion.widget.j.a.m.append(androidx.constraintlayout.widget.j.m.Gf, 3);
            androidx.constraintlayout.motion.widget.j.a.m.append(androidx.constraintlayout.widget.j.m.vf, 4);
            androidx.constraintlayout.motion.widget.j.a.m.append(androidx.constraintlayout.widget.j.m.wf, 5);
            androidx.constraintlayout.motion.widget.j.a.m.append(androidx.constraintlayout.widget.j.m.Df, 6);
            androidx.constraintlayout.motion.widget.j.a.m.append(androidx.constraintlayout.widget.j.m.Ef, 7);
            androidx.constraintlayout.motion.widget.j.a.m.append(androidx.constraintlayout.widget.j.m.yf, 9);
            androidx.constraintlayout.motion.widget.j.a.m.append(androidx.constraintlayout.widget.j.m.Ff, 8);
            androidx.constraintlayout.motion.widget.j.a.m.append(androidx.constraintlayout.widget.j.m.Cf, 11);
            androidx.constraintlayout.motion.widget.j.a.m.append(androidx.constraintlayout.widget.j.m.Bf, 12);
            androidx.constraintlayout.motion.widget.j.a.m.append(androidx.constraintlayout.widget.j.m.Af, 10);
        }
        
        private static void b(final j j, final TypedArray typedArray) {
            for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = typedArray.getIndex(i);
                float n = 0.0f;
                switch (androidx.constraintlayout.motion.widget.j.a.m.get(index)) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(androidx.constraintlayout.motion.widget.j.a.m.get(index));
                        Log.e("KeyPosition", sb.toString());
                        continue;
                    }
                    case 12: {
                        n = typedArray.getFloat(index, j.J);
                        break;
                    }
                    case 11: {
                        j.I = typedArray.getFloat(index, j.I);
                        continue;
                    }
                    case 10: {
                        j.G = typedArray.getInt(index, j.G);
                        continue;
                    }
                    case 9: {
                        j.O = typedArray.getInt(index, j.O);
                        continue;
                    }
                    case 8: {
                        n = typedArray.getFloat(index, j.J);
                        j.I = n;
                        break;
                    }
                    case 7: {
                        j.L = typedArray.getFloat(index, j.L);
                        continue;
                    }
                    case 6: {
                        j.K = typedArray.getFloat(index, j.K);
                        continue;
                    }
                    case 5: {
                        j.H = typedArray.getInt(index, j.H);
                        continue;
                    }
                    case 4: {
                        j.D = typedArray.getInteger(index, j.D);
                        continue;
                    }
                    case 3: {
                        String string;
                        if (typedArray.peekValue(index).type == 3) {
                            string = typedArray.getString(index);
                        }
                        else {
                            string = androidx.constraintlayout.core.motion.utils.d.k[typedArray.getInteger(index, 0)];
                        }
                        j.F = string;
                        continue;
                    }
                    case 2: {
                        j.a = typedArray.getInt(index, j.a);
                        continue;
                    }
                    case 1: {
                        if (androidx.constraintlayout.motion.widget.s.c2) {
                            if ((j.b = typedArray.getResourceId(index, j.b)) != -1) {
                                continue;
                            }
                        }
                        else if (typedArray.peekValue(index).type != 3) {
                            j.b = typedArray.getResourceId(index, j.b);
                            continue;
                        }
                        j.c = typedArray.getString(index);
                        continue;
                    }
                }
                j.J = n;
            }
            if (j.a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }
}
