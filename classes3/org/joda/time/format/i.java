// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import java.io.Writer;
import java.io.IOException;

public class i
{
    private static final double a;
    
    static {
        a = Math.log(10.0);
    }
    
    private i() {
    }
    
    public static void a(final Appendable appendable, int n, int i) throws IOException {
        int j = n;
        if (n < 0) {
            appendable.append('-');
            int k = i;
            if (n == Integer.MIN_VALUE) {
                while (k > 10) {
                    appendable.append('0');
                    --k;
                }
                appendable.append("2147483648");
                return;
            }
            j = -n;
        }
        if (j < 10) {
            while (true) {
                n = j;
                if (i <= 1) {
                    break;
                }
                appendable.append('0');
                --i;
            }
        }
        else {
            if (j >= 100) {
                if (j < 1000) {
                    n = 3;
                }
                else if (j < 10000) {
                    n = 4;
                }
                else {
                    n = (int)(Math.log(j) / i.a) + 1;
                }
                while (i > n) {
                    appendable.append('0');
                    --i;
                }
                appendable.append(Integer.toString(j));
                return;
            }
            while (i > 2) {
                appendable.append('0');
                --i;
            }
            n = (j + 1) * 13421772 >> 27;
            appendable.append((char)(n + 48));
            n = j - (n << 3) - (n << 1);
        }
        appendable.append((char)(n + 48));
    }
    
    public static void b(final Appendable appendable, long i, int n) throws IOException {
        final int n2 = (int)i;
        if (n2 == i) {
            a(appendable, n2, n);
        }
        else {
            if (n > 19) {
                long n3 = i;
                if (i < 0L) {
                    appendable.append('-');
                    int j = n;
                    if (i == Long.MIN_VALUE) {
                        while (j > 19) {
                            appendable.append('0');
                            --j;
                        }
                        appendable.append("9223372036854775808");
                        return;
                    }
                    n3 = -i;
                }
                final int n4 = (int)(Math.log((double)n3) / i.a);
                while (true) {
                    i = n3;
                    if (n <= n4 + 1) {
                        break;
                    }
                    appendable.append('0');
                    --n;
                }
            }
            appendable.append(Long.toString(i));
        }
    }
    
    public static void c(final StringBuffer sb, final int n, final int n2) {
        try {
            a(sb, n, n2);
        }
        catch (IOException ex) {}
    }
    
    public static void d(final StringBuffer sb, final long n, final int n2) {
        try {
            b(sb, n, n2);
        }
        catch (IOException ex) {}
    }
    
    public static void e(final Appendable appendable, int n) throws IOException {
        int i = n;
        if (n < 0) {
            appendable.append('-');
            if (n == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i = -n;
        }
        if (i >= 10) {
            if (i >= 100) {
                appendable.append(Integer.toString(i));
                return;
            }
            n = (i + 1) * 13421772 >> 27;
            appendable.append((char)(n + 48));
            i = i - (n << 3) - (n << 1);
        }
        appendable.append((char)(i + 48));
    }
    
    public static void f(final Appendable appendable, final long i) throws IOException {
        final int n = (int)i;
        if (n == i) {
            e(appendable, n);
        }
        else {
            appendable.append(Long.toString(i));
        }
    }
    
    public static void g(final StringBuffer sb, final int n) {
        try {
            e(sb, n);
        }
        catch (IOException ex) {}
    }
    
    public static void h(final StringBuffer sb, final long n) {
        try {
            f(sb, n);
        }
        catch (IOException ex) {}
    }
    
    public static int i(final long n) {
        int n2 = 1;
        if (n >= 0L) {
            if (n >= 10L) {
                if (n < 100L) {
                    n2 = 2;
                }
                else if (n < 1000L) {
                    n2 = 3;
                }
                else if (n < 10000L) {
                    n2 = 4;
                }
                else {
                    n2 = 1 + (int)(Math.log((double)n) / i.a);
                }
            }
            return n2;
        }
        if (n != Long.MIN_VALUE) {
            return i(-n) + 1;
        }
        return 20;
    }
    
    static String j(final String s, final int beginIndex) {
        final int endIndex = beginIndex + 32;
        String concat;
        if (s.length() <= endIndex + 3) {
            concat = s;
        }
        else {
            concat = s.substring(0, endIndex).concat("...");
        }
        StringBuilder sb;
        if (beginIndex <= 0) {
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(concat);
        }
        else {
            if (beginIndex >= s.length()) {
                sb = new StringBuilder();
                sb.append("Invalid format: \"");
                sb.append(concat);
                sb.append("\" is too short");
                return sb.toString();
            }
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(concat);
            sb.append("\" is malformed at \"");
            sb.append(concat.substring(beginIndex));
        }
        sb.append('\"');
        return sb.toString();
    }
    
    static int k(final CharSequence charSequence, final int n) {
        final int n2 = charSequence.charAt(n) - '0';
        return (n2 << 3) + (n2 << 1) + charSequence.charAt(n + 1) - 48;
    }
    
    public static void l(final Writer writer, int n, int i) throws IOException {
        int j = n;
        if (n < 0) {
            writer.write(45);
            int k = i;
            if (n == Integer.MIN_VALUE) {
                while (k > 10) {
                    writer.write(48);
                    --k;
                }
                writer.write("2147483648");
                return;
            }
            j = -n;
        }
        if (j < 10) {
            while (true) {
                n = j;
                if (i <= 1) {
                    break;
                }
                writer.write(48);
                --i;
            }
        }
        else {
            if (j >= 100) {
                if (j < 1000) {
                    n = 3;
                }
                else if (j < 10000) {
                    n = 4;
                }
                else {
                    n = (int)(Math.log(j) / i.a) + 1;
                }
                while (i > n) {
                    writer.write(48);
                    --i;
                }
                writer.write(Integer.toString(j));
                return;
            }
            while (i > 2) {
                writer.write(48);
                --i;
            }
            n = (j + 1) * 13421772 >> 27;
            writer.write(n + 48);
            n = j - (n << 3) - (n << 1);
        }
        writer.write(n + 48);
    }
    
    public static void m(final Writer writer, long i, int n) throws IOException {
        final int n2 = (int)i;
        if (n2 == i) {
            l(writer, n2, n);
        }
        else {
            if (n > 19) {
                long n3 = i;
                if (i < 0L) {
                    writer.write(45);
                    int j = n;
                    if (i == Long.MIN_VALUE) {
                        while (j > 19) {
                            writer.write(48);
                            --j;
                        }
                        writer.write("9223372036854775808");
                        return;
                    }
                    n3 = -i;
                }
                final int n4 = (int)(Math.log((double)n3) / i.a);
                while (true) {
                    i = n3;
                    if (n <= n4 + 1) {
                        break;
                    }
                    writer.write(48);
                    --n;
                }
            }
            writer.write(Long.toString(i));
        }
    }
    
    public static void n(final Writer writer, int n) throws IOException {
        int i = n;
        if (n < 0) {
            writer.write(45);
            if (n == Integer.MIN_VALUE) {
                writer.write("2147483648");
                return;
            }
            i = -n;
        }
        if (i >= 10) {
            if (i >= 100) {
                writer.write(Integer.toString(i));
                return;
            }
            n = (i + 1) * 13421772 >> 27;
            writer.write(n + 48);
            i = i - (n << 3) - (n << 1);
        }
        writer.write(i + 48);
    }
    
    public static void o(final Writer writer, final long i) throws IOException {
        final int n = (int)i;
        if (n == i) {
            n(writer, n);
        }
        else {
            writer.write(Long.toString(i));
        }
    }
}
