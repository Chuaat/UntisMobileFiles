// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.g;
import org.joda.time.f;
import org.joda.time.o;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class j
{
    private j() {
    }
    
    public static boolean a(final Object o, final Object obj) {
        return o == obj || (o != null && obj != null && o.equals(obj));
    }
    
    public static int b(int n, final int n2, int n3) {
        if (n2 >= n3) {
            throw new IllegalArgumentException("MIN > MAX");
        }
        n3 = n3 - n2 + 1;
        n -= n2;
        if (n >= 0) {
            return n % n3 + n2;
        }
        n = -n % n3;
        if (n == 0) {
            return n2 + 0;
        }
        return n3 - n + n2;
    }
    
    public static int c(final int n, final int n2, final int n3, final int n4) {
        return b(n + n2, n3, n4);
    }
    
    public static int d(final int i, final int j) {
        final int n = i + j;
        if ((i ^ n) < 0 && (i ^ j) >= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The calculation caused an overflow: ");
            sb.append(i);
            sb.append(" + ");
            sb.append(j);
            throw new ArithmeticException(sb.toString());
        }
        return n;
    }
    
    public static long e(final long lng, final long lng2) {
        final long n = lng + lng2;
        if ((lng ^ n) < 0L && (lng ^ lng2) >= 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The calculation caused an overflow: ");
            sb.append(lng);
            sb.append(" + ");
            sb.append(lng2);
            throw new ArithmeticException(sb.toString());
        }
        return n;
    }
    
    public static long f(final long lng, final long lng2) {
        if (lng == Long.MIN_VALUE && lng2 == -1L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Multiplication overflows a long: ");
            sb.append(lng);
            sb.append(" / ");
            sb.append(lng2);
            throw new ArithmeticException(sb.toString());
        }
        return lng / lng2;
    }
    
    public static long g(final long n, final long n2, final RoundingMode roundingMode) {
        if (n == Long.MIN_VALUE && n2 == -1L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Multiplication overflows a long: ");
            sb.append(n);
            sb.append(" / ");
            sb.append(n2);
            throw new ArithmeticException(sb.toString());
        }
        return new BigDecimal(n).divide(new BigDecimal(n2), roundingMode).longValue();
    }
    
    public static int h(final int i, final int j) {
        final long n = i * (long)j;
        if (n >= -2147483648L && n <= 2147483647L) {
            return (int)n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Multiplication overflows an int: ");
        sb.append(i);
        sb.append(" * ");
        sb.append(j);
        throw new ArithmeticException(sb.toString());
    }
    
    public static long i(final long n, final int n2) {
        if (n2 != -1) {
            if (n2 == 0) {
                return 0L;
            }
            if (n2 == 1) {
                return n;
            }
            final long n3 = n2;
            final long n4 = n * n3;
            if (n4 / n3 == n) {
                return n4;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Multiplication overflows a long: ");
            sb.append(n);
            sb.append(" * ");
            sb.append(n2);
            throw new ArithmeticException(sb.toString());
        }
        else {
            if (n != Long.MIN_VALUE) {
                return -n;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Multiplication overflows a long: ");
            sb2.append(n);
            sb2.append(" * ");
            sb2.append(n2);
            throw new ArithmeticException(sb2.toString());
        }
    }
    
    public static long j(final long lng, final long lng2) {
        if (lng2 == 1L) {
            return lng;
        }
        if (lng == 1L) {
            return lng2;
        }
        if (lng == 0L || lng2 == 0L) {
            return 0L;
        }
        final long n = lng * lng2;
        if (n / lng2 == lng && (lng != Long.MIN_VALUE || lng2 != -1L) && (lng2 != Long.MIN_VALUE || lng != -1L)) {
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Multiplication overflows a long: ");
        sb.append(lng);
        sb.append(" * ");
        sb.append(lng2);
        throw new ArithmeticException(sb.toString());
    }
    
    public static int k(final long n, final long n2) {
        return n(j(n, n2));
    }
    
    public static int l(final int n) {
        if (n != Integer.MIN_VALUE) {
            return -n;
        }
        throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
    }
    
    public static long m(final long lng, final long lng2) {
        final long n = lng - lng2;
        if ((lng ^ n) < 0L && (lng ^ lng2) < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The calculation caused an overflow: ");
            sb.append(lng);
            sb.append(" - ");
            sb.append(lng2);
            throw new ArithmeticException(sb.toString());
        }
        return n;
    }
    
    public static int n(final long lng) {
        if (-2147483648L <= lng && lng <= 2147483647L) {
            return (int)lng;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Value cannot fit in an int: ");
        sb.append(lng);
        throw new ArithmeticException(sb.toString());
    }
    
    public static void o(final String s, final int i, final int j, final int k) {
        if (i >= j && i <= k) {
            return;
        }
        throw new o(s, i, j, k);
    }
    
    public static void p(final f f, final int i, final int j, final int k) {
        if (i >= j && i <= k) {
            return;
        }
        throw new o(f.J(), i, j, k);
    }
    
    public static void q(final g g, final int i, final int j, final int k) {
        if (i >= j && i <= k) {
            return;
        }
        throw new o(g, i, j, k);
    }
}
