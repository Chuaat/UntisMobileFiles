// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import java.io.PrintWriter;
import androidx.annotation.t0;

@t0({ t0.a.I })
public final class w
{
    @t0({ t0.a.I })
    public static final int a = 19;
    private static final int b = 60;
    private static final int c = 3600;
    private static final int d = 86400;
    private static final Object e;
    private static char[] f;
    
    static {
        e = new Object();
        w.f = new char[24];
    }
    
    private w() {
    }
    
    private static int a(final int n, final int n2, final boolean b, final int n3) {
        if (n > 99 || (b && n3 >= 3)) {
            return n2 + 3;
        }
        if (n > 9 || (b && n3 >= 2)) {
            return n2 + 2;
        }
        if (!b && n <= 0) {
            return 0;
        }
        return n2 + 1;
    }
    
    @t0({ t0.a.I })
    public static void b(final long n, final long n2, final PrintWriter printWriter) {
        if (n == 0L) {
            printWriter.print("--");
            return;
        }
        d(n - n2, printWriter, 0);
    }
    
    @t0({ t0.a.I })
    public static void c(final long n, final PrintWriter printWriter) {
        d(n, printWriter, 0);
    }
    
    @t0({ t0.a.I })
    public static void d(final long n, final PrintWriter printWriter, int f) {
        synchronized (w.e) {
            f = f(n, f);
            printWriter.print(new String(w.f, 0, f));
        }
    }
    
    @t0({ t0.a.I })
    public static void e(final long n, final StringBuilder sb) {
        synchronized (w.e) {
            sb.append(w.f, 0, f(n, 0));
        }
    }
    
    private static int f(long n, int g) {
        if (w.f.length < g) {
            w.f = new char[g];
        }
        final char[] f = w.f;
        final long n2 = lcmp(n, 0L);
        if (n2 == 0) {
            while (g - 1 > 0) {
                f[0] = 32;
            }
            f[0] = 48;
            return 1;
        }
        int n3;
        if (n2 > 0) {
            n3 = 43;
        }
        else {
            n3 = 45;
            n = -n;
        }
        final int n4 = (int)(n % 1000L);
        int n5 = (int)Math.floor((double)(n / 1000L));
        int n6;
        if (n5 > 86400) {
            n6 = n5 / 86400;
            n5 -= 86400 * n6;
        }
        else {
            n6 = 0;
        }
        int n7;
        if (n5 > 3600) {
            n7 = n5 / 3600;
            n5 -= n7 * 3600;
        }
        else {
            n7 = 0;
        }
        int n8;
        int n9;
        if (n5 > 60) {
            n8 = n5 / 60;
            n9 = n5 - n8 * 60;
        }
        else {
            n8 = 0;
            n9 = n5;
        }
        int n16;
        if (g != 0) {
            final int a = a(n6, 1, false, 0);
            final int n10 = a + a(n7, 1, a > 0, 2);
            final int n11 = n10 + a(n8, 1, n10 > 0, 2);
            final int n12 = n11 + a(n9, 1, n11 > 0, 2);
            int n13;
            if (n12 > 0) {
                n13 = 3;
            }
            else {
                n13 = 0;
            }
            int n14 = n12 + (a(n4, 2, true, n13) + 1);
            int n15 = 0;
            while (true) {
                n16 = n15;
                if (n14 >= g) {
                    break;
                }
                f[n15] = 32;
                ++n15;
                ++n14;
            }
        }
        else {
            n16 = 0;
        }
        f[n16] = (char)n3;
        final int n17 = n16 + 1;
        if (g != 0) {
            g = 1;
        }
        else {
            g = 0;
        }
        final int g2 = g(f, n6, 'd', n17, false, 0);
        final boolean b = g2 != n17;
        int n18;
        if (g != 0) {
            n18 = 2;
        }
        else {
            n18 = 0;
        }
        final int g3 = g(f, n7, 'h', g2, b, n18);
        final boolean b2 = g3 != n17;
        int n19;
        if (g != 0) {
            n19 = 2;
        }
        else {
            n19 = 0;
        }
        final int g4 = g(f, n8, 'm', g3, b2, n19);
        final boolean b3 = g4 != n17;
        int n20;
        if (g != 0) {
            n20 = 2;
        }
        else {
            n20 = 0;
        }
        final int g5 = g(f, n9, 's', g4, b3, n20);
        if (g != 0 && g5 != n17) {
            g = 3;
        }
        else {
            g = 0;
        }
        g = g(f, n4, 'm', g5, true, g);
        f[g] = 115;
        return g + 1;
    }
    
    private static int g(final char[] array, int n, final char c, int n2, final boolean b, int n3) {
        if (!b) {
            final int n4 = n2;
            if (n <= 0) {
                return n4;
            }
        }
        int n6;
        if ((b && n3 >= 3) || n > 99) {
            final int n5 = n / 100;
            array[n2] = (char)(n5 + 48);
            n6 = n2 + 1;
            n -= n5 * 100;
        }
        else {
            n6 = n2;
        }
        int n7 = 0;
        Label_0123: {
            if ((!b || n3 < 2) && n <= 9) {
                n7 = n6;
                n3 = n;
                if (n2 == n6) {
                    break Label_0123;
                }
            }
            n2 = n / 10;
            array[n6] = (char)(n2 + 48);
            n7 = n6 + 1;
            n3 = n - n2 * 10;
        }
        array[n7] = (char)(n3 + 48);
        n = n7 + 1;
        array[n] = c;
        return n + 1;
    }
}
