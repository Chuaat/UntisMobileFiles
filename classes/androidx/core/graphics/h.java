// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import androidx.annotation.p0;
import java.util.Objects;
import androidx.annotation.b1;
import androidx.annotation.t;
import android.graphics.Color;
import androidx.annotation.j0;
import androidx.annotation.b0;
import androidx.annotation.l;

public final class h
{
    private static final double a = 95.047;
    private static final double b = 100.0;
    private static final double c = 108.883;
    private static final double d = 0.008856;
    private static final double e = 903.3;
    private static final int f = 10;
    private static final int g = 1;
    private static final ThreadLocal<double[]> h;
    
    static {
        h = new ThreadLocal<double[]>();
    }
    
    private h() {
    }
    
    private static double A(double pow) {
        if (pow > 0.008856) {
            pow = Math.pow(pow, 0.3333333333333333);
        }
        else {
            pow = (pow * 903.3 + 16.0) / 116.0;
        }
        return pow;
    }
    
    @l
    public static int B(@l final int n, @b0(from = 0L, to = 255L) final int n2) {
        if (n2 >= 0 && n2 <= 255) {
            return (n & 0xFFFFFF) | n2 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
    
    @l
    public static int a(@j0 final float[] array) {
        final float n = array[0];
        final float n2 = array[1];
        final float n3 = array[2];
        final float n4 = (1.0f - Math.abs(n3 * 2.0f - 1.0f)) * n2;
        final float n5 = n3 - 0.5f * n4;
        final float n6 = (1.0f - Math.abs(n / 60.0f % 2.0f - 1.0f)) * n4;
        int n8 = 0;
        int n9 = 0;
        Label_0274: {
            Label_0210: {
                switch ((int)n / 60) {
                    default: {
                        final int n7 = 0;
                        n8 = 0;
                        n9 = 0;
                        return Color.rgb(x(n8, 0, 255), x(n9, 0, 255), x(n7, 0, 255));
                    }
                    case 5:
                    case 6: {
                        n8 = Math.round((n4 + n5) * 255.0f);
                        n9 = Math.round(n5 * 255.0f);
                        break Label_0210;
                    }
                    case 4: {
                        n8 = Math.round((n6 + n5) * 255.0f);
                        n9 = Math.round(n5 * 255.0f);
                        break;
                    }
                    case 3: {
                        n8 = Math.round(n5 * 255.0f);
                        n9 = Math.round((n6 + n5) * 255.0f);
                        break;
                    }
                    case 2: {
                        n8 = Math.round(n5 * 255.0f);
                        n9 = Math.round((n4 + n5) * 255.0f);
                        break Label_0210;
                    }
                    case 1: {
                        n8 = Math.round((n6 + n5) * 255.0f);
                        n9 = Math.round((n4 + n5) * 255.0f);
                        break Label_0274;
                    }
                    case 0: {
                        n8 = Math.round((n4 + n5) * 255.0f);
                        n9 = Math.round((n6 + n5) * 255.0f);
                        break Label_0274;
                    }
                }
                final int n7 = Math.round((n4 + n5) * 255.0f);
                return Color.rgb(x(n8, 0, 255), x(n9, 0, 255), x(n7, 0, 255));
            }
            final int n7 = Math.round((n6 + n5) * 255.0f);
            return Color.rgb(x(n8, 0, 255), x(n9, 0, 255), x(n7, 0, 255));
        }
        final int n7 = Math.round(n5 * 255.0f);
        return Color.rgb(x(n8, 0, 255), x(n9, 0, 255), x(n7, 0, 255));
    }
    
    @l
    public static int b(@t(from = 0.0, to = 100.0) final double n, @t(from = -128.0, to = 127.0) final double n2, @t(from = -128.0, to = 127.0) final double n3) {
        final double[] z = z();
        c(n, n2, n3, z);
        return g(z[0], z[1], z[2]);
    }
    
    public static void c(@t(from = 0.0, to = 100.0) double pow, @t(from = -128.0, to = 127.0) double pow2, @t(from = -128.0, to = 127.0) double pow3, @j0 final double[] array) {
        final double a = (pow + 16.0) / 116.0;
        final double a2 = pow2 / 500.0 + a;
        final double a3 = a - pow3 / 200.0;
        pow2 = Math.pow(a2, 3.0);
        if (pow2 <= 0.008856) {
            pow2 = (a2 * 116.0 - 16.0) / 903.3;
        }
        if (pow > 7.9996247999999985) {
            pow = Math.pow(a, 3.0);
        }
        else {
            pow /= 903.3;
        }
        pow3 = Math.pow(a3, 3.0);
        if (pow3 <= 0.008856) {
            pow3 = (a3 * 116.0 - 16.0) / 903.3;
        }
        array[0] = pow2 * 95.047;
        array[1] = pow * 100.0;
        array[2] = pow3 * 108.883;
    }
    
    public static void d(@b0(from = 0L, to = 255L) final int n, @b0(from = 0L, to = 255L) final int n2, @b0(from = 0L, to = 255L) final int n3, @j0 final float[] array) {
        final float n4 = n / 255.0f;
        final float n5 = n2 / 255.0f;
        final float n6 = n3 / 255.0f;
        final float max = Math.max(n4, Math.max(n5, n6));
        final float min = Math.min(n4, Math.min(n5, n6));
        final float n7 = max - min;
        final float n8 = (max + min) / 2.0f;
        float n9;
        float n10;
        if (max == min) {
            n9 = 0.0f;
            n10 = 0.0f;
        }
        else {
            float n11;
            if (max == n4) {
                n11 = (n5 - n6) / n7 % 6.0f;
            }
            else if (max == n5) {
                n11 = (n6 - n4) / n7 + 2.0f;
            }
            else {
                n11 = 4.0f + (n4 - n5) / n7;
            }
            final float n12 = n7 / (1.0f - Math.abs(2.0f * n8 - 1.0f));
            n9 = n11;
            n10 = n12;
        }
        float n14;
        final float n13 = n14 = n9 * 60.0f % 360.0f;
        if (n13 < 0.0f) {
            n14 = n13 + 360.0f;
        }
        array[0] = w(n14, 0.0f, 360.0f);
        array[1] = w(n10, 0.0f, 1.0f);
        array[2] = w(n8, 0.0f, 1.0f);
    }
    
    public static void e(@b0(from = 0L, to = 255L) final int n, @b0(from = 0L, to = 255L) final int n2, @b0(from = 0L, to = 255L) final int n3, @j0 final double[] array) {
        f(n, n2, n3, array);
        h(array[0], array[1], array[2], array);
    }
    
    public static void f(@b0(from = 0L, to = 255L) final int n, @b0(from = 0L, to = 255L) final int n2, @b0(from = 0L, to = 255L) final int n3, @j0 final double[] array) {
        if (array.length == 3) {
            final double n4 = n / 255.0;
            double pow;
            if (n4 < 0.04045) {
                pow = n4 / 12.92;
            }
            else {
                pow = Math.pow((n4 + 0.055) / 1.055, 2.4);
            }
            final double n5 = n2 / 255.0;
            double pow2;
            if (n5 < 0.04045) {
                pow2 = n5 / 12.92;
            }
            else {
                pow2 = Math.pow((n5 + 0.055) / 1.055, 2.4);
            }
            final double n6 = n3 / 255.0;
            double pow3;
            if (n6 < 0.04045) {
                pow3 = n6 / 12.92;
            }
            else {
                pow3 = Math.pow((n6 + 0.055) / 1.055, 2.4);
            }
            array[0] = (0.4124 * pow + 0.3576 * pow2 + 0.1805 * pow3) * 100.0;
            array[1] = (0.2126 * pow + 0.7152 * pow2 + 0.0722 * pow3) * 100.0;
            array[2] = (pow * 0.0193 + pow2 * 0.1192 + pow3 * 0.9505) * 100.0;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }
    
    @l
    public static int g(@t(from = 0.0, to = 95.047) double n, @t(from = 0.0, to = 100.0) double n2, @t(from = 0.0, to = 108.883) double a) {
        final double a2 = (3.2406 * n + -1.5372 * n2 + -0.4986 * a) / 100.0;
        final double a3 = (-0.9689 * n + 1.8758 * n2 + 0.0415 * a) / 100.0;
        a = (0.0557 * n + -0.204 * n2 + 1.057 * a) / 100.0;
        if (a2 > 0.0031308) {
            n = Math.pow(a2, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n = a2 * 12.92;
        }
        if (a3 > 0.0031308) {
            n2 = Math.pow(a3, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n2 = a3 * 12.92;
        }
        if (a > 0.0031308) {
            a = Math.pow(a, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            a *= 12.92;
        }
        return Color.rgb(x((int)Math.round(n * 255.0), 0, 255), x((int)Math.round(n2 * 255.0), 0, 255), x((int)Math.round(a * 255.0), 0, 255));
    }
    
    public static void h(@t(from = 0.0, to = 95.047) double a, @t(from = 0.0, to = 100.0) double a2, @t(from = 0.0, to = 108.883) double a3, @j0 final double[] array) {
        if (array.length == 3) {
            a = A(a / 95.047);
            a2 = A(a2 / 100.0);
            a3 = A(a3 / 108.883);
            array[0] = Math.max(0.0, 116.0 * a2 - 16.0);
            array[1] = (a - a2) * 500.0;
            array[2] = (a2 - a3) * 200.0;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }
    
    @l
    public static int i(@l final int n, @l final int n2, @t(from = 0.0, to = 1.0) final float n3) {
        final float n4 = 1.0f - n3;
        return Color.argb((int)(Color.alpha(n) * n4 + Color.alpha(n2) * n3), (int)(Color.red(n) * n4 + Color.red(n2) * n3), (int)(Color.green(n) * n4 + Color.green(n2) * n3), (int)(Color.blue(n) * n4 + Color.blue(n2) * n3));
    }
    
    public static void j(@j0 final float[] array, @j0 final float[] array2, @t(from = 0.0, to = 1.0) final float n, @j0 final float[] array3) {
        if (array3.length == 3) {
            final float n2 = 1.0f - n;
            array3[0] = o(array[0], array2[0], n);
            array3[1] = array[1] * n2 + array2[1] * n;
            array3[2] = array[2] * n2 + array2[2] * n;
            return;
        }
        throw new IllegalArgumentException("result must have a length of 3.");
    }
    
    public static void k(@j0 final double[] array, @j0 final double[] array2, @t(from = 0.0, to = 1.0) final double n, @j0 final double[] array3) {
        if (array3.length == 3) {
            final double n2 = 1.0 - n;
            array3[0] = array[0] * n2 + array2[0] * n;
            array3[1] = array[1] * n2 + array2[1] * n;
            array3[2] = array[2] * n2 + array2[2] * n;
            return;
        }
        throw new IllegalArgumentException("outResult must have a length of 3.");
    }
    
    public static double l(@l final int n, @l final int i) {
        if (Color.alpha(i) == 255) {
            int t = n;
            if (Color.alpha(n) < 255) {
                t = t(n, i);
            }
            final double n2 = m(t) + 0.05;
            final double n3 = m(i) + 0.05;
            return Math.max(n2, n3) / Math.min(n2, n3);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("background can not be translucent: #");
        sb.append(Integer.toHexString(i));
        throw new IllegalArgumentException(sb.toString());
    }
    
    @t(from = 0.0, to = 1.0)
    public static double m(@l final int n) {
        final double[] z = z();
        r(n, z);
        return z[1] / 100.0;
    }
    
    public static int n(@l final int n, @l final int i, final float n2) {
        final int alpha = Color.alpha(i);
        int n3 = 255;
        if (alpha != 255) {
            final StringBuilder sb = new StringBuilder();
            sb.append("background can not be translucent: #");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        final double l = l(B(n, 255), i);
        final double n4 = n2;
        if (l < n4) {
            return -1;
        }
        for (int n5 = 0, n6 = 0; n5 <= 10 && n3 - n6 > 1; ++n5) {
            final int n7 = (n6 + n3) / 2;
            if (l(B(n, n7), i) < n4) {
                n6 = n7;
            }
            else {
                n3 = n7;
            }
        }
        return n3;
    }
    
    @b1
    static float o(final float n, final float n2, final float n3) {
        float n4 = n;
        float n5 = n2;
        if (Math.abs(n2 - n) > 180.0f) {
            if (n2 > n) {
                n4 = n + 360.0f;
                n5 = n2;
            }
            else {
                n5 = n2 + 360.0f;
                n4 = n;
            }
        }
        return (n4 + (n5 - n4) * n3) % 360.0f;
    }
    
    public static void p(@l final int n, @j0 final float[] array) {
        d(Color.red(n), Color.green(n), Color.blue(n), array);
    }
    
    public static void q(@l final int n, @j0 final double[] array) {
        e(Color.red(n), Color.green(n), Color.blue(n), array);
    }
    
    public static void r(@l final int n, @j0 final double[] array) {
        f(Color.red(n), Color.green(n), Color.blue(n), array);
    }
    
    private static int s(final int n, final int n2) {
        return 255 - (255 - n2) * (255 - n) / 255;
    }
    
    public static int t(@l final int n, @l final int n2) {
        final int alpha = Color.alpha(n2);
        final int alpha2 = Color.alpha(n);
        final int s = s(alpha2, alpha);
        return Color.argb(s, v(Color.red(n), alpha2, Color.red(n2), alpha, s), v(Color.green(n), alpha2, Color.green(n2), alpha, s), v(Color.blue(n), alpha2, Color.blue(n2), alpha, s));
    }
    
    @j0
    @p0(26)
    public static Color u(@j0 Color convert, @j0 final Color color) {
        if (Objects.equals(convert.getModel(), color.getModel())) {
            if (!Objects.equals(color.getColorSpace(), convert.getColorSpace())) {
                convert = convert.convert(color.getColorSpace());
            }
            final float[] components = convert.getComponents();
            final float[] components2 = color.getComponents();
            final float alpha = convert.alpha();
            final float n = color.alpha() * (1.0f - alpha);
            final int n2 = color.getComponentCount() - 1;
            components2[n2] = alpha + n;
            float n3 = n;
            float n4 = alpha;
            if (components2[n2] > 0.0f) {
                n4 = alpha / components2[n2];
                n3 = n / components2[n2];
            }
            for (int i = 0; i < n2; ++i) {
                components2[i] = components[i] * n4 + components2[i] * n3;
            }
            return Color.valueOf(components2, color.getColorSpace());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Color models must match (");
        sb.append(convert.getModel());
        sb.append(" vs. ");
        sb.append(color.getModel());
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static int v(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            return 0;
        }
        return (n * 255 * n2 + n3 * n4 * (255 - n2)) / (n5 * 255);
    }
    
    private static float w(final float n, float n2, final float n3) {
        if (n >= n2) {
            n2 = n;
            if (n > n3) {
                n2 = n3;
            }
        }
        return n2;
    }
    
    private static int x(final int n, int n2, final int n3) {
        if (n >= n2) {
            if ((n2 = n) > n3) {
                n2 = n3;
            }
        }
        return n2;
    }
    
    public static double y(@j0 final double[] array, @j0 final double[] array2) {
        return Math.sqrt(Math.pow(array[0] - array2[0], 2.0) + Math.pow(array[1] - array2[1], 2.0) + Math.pow(array[2] - array2[2], 2.0));
    }
    
    private static double[] z() {
        final ThreadLocal<double[]> h = androidx.core.graphics.h.h;
        double[] value;
        if ((value = h.get()) == null) {
            value = new double[3];
            h.set(value);
        }
        return value;
    }
}
