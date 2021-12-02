// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;

public class q extends d
{
    private static final boolean m = false;
    k l;
    
    q(final String a) {
        super.a = a;
        final double[] original = new double[a.length() / 2];
        int fromIndex;
        int i;
        int n;
        for (fromIndex = a.indexOf(40) + 1, i = a.indexOf(44, fromIndex), n = 0; i != -1; i = a.indexOf(44, fromIndex), ++n) {
            original[n] = Double.parseDouble(a.substring(fromIndex, i).trim());
            fromIndex = i + 1;
        }
        original[n] = Double.parseDouble(a.substring(fromIndex, a.indexOf(41, fromIndex)).trim());
        this.l = e(Arrays.copyOf(original, n + 1));
    }
    
    private static k d(final String s) {
        final String[] split = s.split("\\s+");
        final int length = split.length;
        final double[] array = new double[length];
        for (int i = 0; i < length; ++i) {
            array[i] = Double.parseDouble(split[i]);
        }
        return e(array);
    }
    
    private static k e(final double[] array) {
        final int n = array.length * 3 - 2;
        final int n2 = array.length - 1;
        final double n3 = 1.0 / n2;
        final double[][] array2 = new double[n][1];
        final double[] array3 = new double[n];
        for (int i = 0; i < array.length; ++i) {
            final double n4 = array[i];
            final int n5 = i + n2;
            array2[n5][0] = n4;
            final double n6 = i * n3;
            array3[n5] = n6;
            if (i > 0) {
                final int n7 = n2 * 2 + i;
                array2[n7][0] = n4 + 1.0;
                array3[n7] = n6 + 1.0;
                final int n8 = i - 1;
                array2[n8][0] = n4 - 1.0 - n3;
                array3[n8] = n6 - 1.0 - n3;
            }
        }
        final k k = new k(array3, array2);
        final PrintStream out = System.out;
        final StringBuilder sb = new StringBuilder();
        sb.append(" 0 ");
        sb.append(k.c(0.0, 0));
        out.println(sb.toString());
        final PrintStream out2 = System.out;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(" 1 ");
        sb2.append(k.c(1.0, 0));
        out2.println(sb2.toString());
        return k;
    }
    
    @Override
    public double a(final double n) {
        return this.l.c(n, 0);
    }
    
    @Override
    public double b(final double n) {
        return this.l.f(n, 0);
    }
}
