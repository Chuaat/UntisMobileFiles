// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import java.io.IOException;
import org.joda.time.n0;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Locale;
import org.joda.time.i;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.ConcurrentHashMap;

public class a
{
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 3;
    static final int e = 4;
    static final int f = 0;
    static final int g = 1;
    static final int h = 2;
    private static final int i = 500;
    private static final ConcurrentHashMap<String, org.joda.time.format.b> j;
    private static final AtomicReferenceArray<org.joda.time.format.b> k;
    
    static {
        j = new ConcurrentHashMap<String, org.joda.time.format.b>();
        k = new AtomicReferenceArray<org.joda.time.format.b>(25);
    }
    
    protected a() {
    }
    
    static void a(final c c, final String s) {
        r(c, s);
    }
    
    private static org.joda.time.format.b b(final int n, final int n2) {
        int n3;
        if (n == 4) {
            n3 = 1;
        }
        else if (n2 == 4) {
            n3 = 0;
        }
        else {
            n3 = 2;
        }
        final a a = new a(n, n2, n3);
        return new org.joda.time.format.b(a, a);
    }
    
    private static org.joda.time.format.b c(final String s) {
        if (s != null && s.length() != 0) {
            final ConcurrentHashMap<String, org.joda.time.format.b> j = org.joda.time.format.a.j;
            org.joda.time.format.b u0;
            if ((u0 = j.get(s)) == null) {
                final c c = new c();
                r(c, s);
                final org.joda.time.format.b value = u0 = c.u0();
                if (j.size() < 500) {
                    final org.joda.time.format.b b = j.putIfAbsent(s, value);
                    u0 = value;
                    if (b != null) {
                        u0 = b;
                    }
                }
            }
            return u0;
        }
        throw new IllegalArgumentException("Invalid pattern specification");
    }
    
    private static org.joda.time.format.b d(final String str) {
        if (str == null || str.length() != 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid style specification: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        final int u = u(str.charAt(0));
        final int u2 = u(str.charAt(1));
        if (u == 4 && u2 == 4) {
            throw new IllegalArgumentException("Style '--' is invalid");
        }
        return e(u, u2);
    }
    
    private static org.joda.time.format.b e(final int n, final int n2) {
        final int i = (n << 2) + n + n2;
        final AtomicReferenceArray<org.joda.time.format.b> k = org.joda.time.format.a.k;
        if (i >= k.length()) {
            return b(n, n2);
        }
        org.joda.time.format.b b;
        if ((b = k.get(i)) == null && !k.compareAndSet(i, null, b = b(n, n2))) {
            b = k.get(i);
        }
        return b;
    }
    
    public static org.joda.time.format.b f(final String s) {
        return c(s);
    }
    
    public static org.joda.time.format.b g(final String s) {
        return d(s);
    }
    
    public static org.joda.time.format.b h() {
        return e(0, 4);
    }
    
    public static org.joda.time.format.b i() {
        return e(0, 0);
    }
    
    public static org.joda.time.format.b j() {
        return e(4, 0);
    }
    
    private static boolean k(final String s) {
        final int length = s.length();
        if (length > 0) {
            switch (s.charAt(0)) {
                case 'M': {
                    if (length <= 2) {
                        return true;
                    }
                    break;
                }
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y': {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static org.joda.time.format.b l() {
        return e(1, 4);
    }
    
    public static org.joda.time.format.b m() {
        return e(1, 1);
    }
    
    public static org.joda.time.format.b n() {
        return e(4, 1);
    }
    
    public static org.joda.time.format.b o() {
        return e(2, 4);
    }
    
    public static org.joda.time.format.b p() {
        return e(2, 2);
    }
    
    public static org.joda.time.format.b q() {
        return e(4, 2);
    }
    
    private static void r(final c c, final String s) {
        final int length = s.length();
        final int[] array = { 0 };
        int n;
        for (int i = 0; i < length; i = n + 1) {
            array[0] = i;
            final String s2 = s(s, array);
            n = array[0];
            final int length2 = s2.length();
            if (length2 == 0) {
                break;
            }
            final char char1 = s2.charAt(0);
            if (char1 != '\'') {
                if (char1 != 'K') {
                    if (char1 != 'M') {
                        if (char1 != 'S') {
                            if (char1 != 'a') {
                                if (char1 != 'h') {
                                    if (char1 != 'k') {
                                        if (char1 != 'm') {
                                            if (char1 != 's') {
                                                if (char1 != 'G') {
                                                    if (char1 != 'H') {
                                                        Label_0399: {
                                                            if (char1 != 'Y') {
                                                                if (char1 == 'Z') {
                                                                    boolean b;
                                                                    if (length2 == 1) {
                                                                        b = false;
                                                                    }
                                                                    else {
                                                                        if (length2 != 2) {
                                                                            c.R();
                                                                            continue;
                                                                        }
                                                                        b = true;
                                                                    }
                                                                    c.U(null, "Z", b, 2, 2);
                                                                    continue;
                                                                }
                                                                if (char1 == 'd') {
                                                                    c.k(length2);
                                                                    continue;
                                                                }
                                                                if (char1 == 'e') {
                                                                    c.l(length2);
                                                                    continue;
                                                                }
                                                                switch (char1) {
                                                                    default: {
                                                                        switch (char1) {
                                                                            default: {
                                                                                final StringBuilder sb = new StringBuilder();
                                                                                sb.append("Illegal pattern component: ");
                                                                                sb.append(s2);
                                                                                throw new IllegalArgumentException(sb.toString());
                                                                            }
                                                                            case 122: {
                                                                                if (length2 >= 4) {
                                                                                    c.S();
                                                                                    continue;
                                                                                }
                                                                                c.X(null);
                                                                                continue;
                                                                            }
                                                                            case 119: {
                                                                                c.d0(length2);
                                                                                continue;
                                                                            }
                                                                            case 120:
                                                                            case 121: {
                                                                                break Label_0399;
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 69: {
                                                                        if (length2 >= 4) {
                                                                            c.n();
                                                                            continue;
                                                                        }
                                                                        c.m();
                                                                        continue;
                                                                    }
                                                                    case 68: {
                                                                        c.o(length2);
                                                                        continue;
                                                                    }
                                                                    case 67: {
                                                                        c.h(length2, length2);
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (length2 == 2) {
                                                            boolean b2;
                                                            if (n + 1 < length) {
                                                                ++array[0];
                                                                b2 = (k(s(s, array)) ^ true);
                                                                --array[0];
                                                            }
                                                            else {
                                                                b2 = true;
                                                            }
                                                            if (char1 != 'x') {
                                                                c.b0(new org.joda.time.c().k2() - 30, b2);
                                                            }
                                                            else {
                                                                c.Z(new org.joda.time.c().R4() - 30, b2);
                                                            }
                                                        }
                                                        else {
                                                            int n3;
                                                            final int n2 = n3 = 9;
                                                            if (n + 1 < length) {
                                                                ++array[0];
                                                                n3 = n2;
                                                                if (k(s(s, array))) {
                                                                    n3 = length2;
                                                                }
                                                                --array[0];
                                                            }
                                                            if (char1 != 'Y') {
                                                                if (char1 != 'x') {
                                                                    if (char1 == 'y') {
                                                                        c.f0(length2, n3);
                                                                    }
                                                                }
                                                                else {
                                                                    c.e0(length2, n3);
                                                                }
                                                            }
                                                            else {
                                                                c.h0(length2, n3);
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        c.z(length2);
                                                    }
                                                }
                                                else {
                                                    c.q();
                                                }
                                            }
                                            else {
                                                c.N(length2);
                                            }
                                        }
                                        else {
                                            c.G(length2);
                                        }
                                    }
                                    else {
                                        c.i(length2);
                                    }
                                }
                                else {
                                    c.j(length2);
                                }
                            }
                            else {
                                c.y();
                            }
                        }
                        else {
                            c.x(length2, length2);
                        }
                    }
                    else if (length2 >= 3) {
                        if (length2 >= 4) {
                            c.J();
                        }
                        else {
                            c.I();
                        }
                    }
                    else {
                        c.H(length2);
                    }
                }
                else {
                    c.A(length2);
                }
            }
            else {
                final String substring = s2.substring(1);
                if (substring.length() == 1) {
                    c.B(substring.charAt(0));
                }
                else {
                    c.C(new String(substring));
                }
            }
        }
    }
    
    private static String s(final String s, final int[] array) {
        final StringBuilder sb = new StringBuilder();
        int n = array[0];
        final int length = s.length();
        final char char1 = s.charAt(n);
        int n2;
        if ((char1 >= 'A' && char1 <= 'Z') || (char1 >= 'a' && char1 <= 'z')) {
            sb.append(char1);
            while (true) {
                final int index = n + 1;
                n2 = n;
                if (index >= length) {
                    break;
                }
                n2 = n;
                if (s.charAt(index) != char1) {
                    break;
                }
                sb.append(char1);
                n = index;
            }
        }
        else {
            sb.append('\'');
            int n3 = 0;
            while (true) {
                n2 = n;
                if (n >= length) {
                    break;
                }
                final char char2 = s.charAt(n);
                if (char2 == '\'') {
                    final int index2 = n + 1;
                    if (index2 < length && s.charAt(index2) == '\'') {
                        sb.append(char2);
                        n = index2;
                    }
                    else {
                        n3 ^= 0x1;
                    }
                }
                else {
                    if (n3 == 0 && ((char2 >= 'A' && char2 <= 'Z') || (char2 >= 'a' && char2 <= 'z'))) {
                        n2 = n - 1;
                        break;
                    }
                    sb.append(char2);
                }
                ++n;
            }
        }
        array[0] = n2;
        return sb.toString();
    }
    
    public static String t(final String s, final Locale locale) {
        final org.joda.time.format.b d = d(s);
        Locale default1 = locale;
        if (locale == null) {
            default1 = Locale.getDefault();
        }
        return ((a)d.i()).c(default1);
    }
    
    private static int u(final char c) {
        if (c == '-') {
            return 4;
        }
        if (c == 'F') {
            return 0;
        }
        if (c == 'S') {
            return 3;
        }
        if (c == 'L') {
            return 1;
        }
        if (c == 'M') {
            return 2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid style character: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static org.joda.time.format.b v() {
        return e(3, 4);
    }
    
    public static org.joda.time.format.b w() {
        return e(3, 3);
    }
    
    public static org.joda.time.format.b x() {
        return e(4, 3);
    }
    
    static class a implements n, l
    {
        private static final ConcurrentHashMap<b, org.joda.time.format.b> J;
        private final int G;
        private final int H;
        private final int I;
        
        static {
            J = new ConcurrentHashMap<b, org.joda.time.format.b>();
        }
        
        a(final int g, final int h, final int i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        private org.joda.time.format.b a(final Locale locale) {
            Locale default1 = locale;
            if (locale == null) {
                default1 = Locale.getDefault();
            }
            final b b = new b(this.I, this.G, this.H, default1);
            final ConcurrentHashMap<b, org.joda.time.format.b> j = a.J;
            org.joda.time.format.b f;
            if ((f = j.get(b)) == null) {
                f = org.joda.time.format.a.f(this.c(default1));
                final org.joda.time.format.b b2 = j.putIfAbsent(b, f);
                if (b2 != null) {
                    f = b2;
                }
            }
            return f;
        }
        
        @Override
        public int b() {
            return 40;
        }
        
        String c(final Locale locale) {
            final int i = this.I;
            DateFormat dateFormat;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        dateFormat = null;
                    }
                    else {
                        dateFormat = DateFormat.getDateTimeInstance(this.G, this.H, locale);
                    }
                }
                else {
                    dateFormat = DateFormat.getTimeInstance(this.H, locale);
                }
            }
            else {
                dateFormat = DateFormat.getDateInstance(this.G, locale);
            }
            if (dateFormat instanceof SimpleDateFormat) {
                return ((SimpleDateFormat)dateFormat).toPattern();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No datetime pattern for locale: ");
            sb.append(locale);
            throw new IllegalArgumentException(sb.toString());
        }
        
        @Override
        public int d() {
            return 40;
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
            this.a(locale).i().f(appendable, n0, locale);
        }
        
        @Override
        public int g(final e e, final CharSequence charSequence, final int n) {
            return this.a(e.q()).f().g(e, charSequence, n);
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, final int n2, final i i, final Locale locale) throws IOException {
            this.a(locale).i().h(appendable, n, a, n2, i, locale);
        }
    }
    
    static class b
    {
        private final int a;
        private final Locale b;
        
        public b(final int n, final int n2, final int n3, final Locale b) {
            this.b = b;
            this.a = n + (n2 << 4) + (n3 << 8);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            if (this.a != b.a) {
                return false;
            }
            final Locale b2 = this.b;
            final Locale b3 = b.b;
            if (b2 == null) {
                if (b3 != null) {
                    return false;
                }
            }
            else if (!b2.equals(b3)) {
                return false;
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            final int a = this.a;
            final Locale b = this.b;
            int hashCode;
            if (b == null) {
                hashCode = 0;
            }
            else {
                hashCode = b.hashCode();
            }
            return (a + 31) * 31 + hashCode;
        }
    }
}
