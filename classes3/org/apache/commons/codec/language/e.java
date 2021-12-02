// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language;

import org.apache.commons.codec.h;
import java.util.Locale;
import org.apache.commons.codec.k;

public class e implements k
{
    private static final char[] a;
    private static final char[] b;
    private static final char[] c;
    private static final char[] d;
    private static final char[] e;
    private static final char[] f;
    private static final char[] g;
    private static final char[] h;
    private static final char[] i;
    private static final char j = '-';
    
    static {
        a = new char[] { 'A', 'E', 'I', 'J', 'O', 'U', 'Y' };
        b = new char[] { 'C', 'S', 'Z' };
        c = new char[] { 'F', 'P', 'V', 'W' };
        d = new char[] { 'G', 'K', 'Q' };
        e = new char[] { 'C', 'K', 'Q' };
        f = new char[] { 'A', 'H', 'K', 'L', 'O', 'Q', 'R', 'U', 'X' };
        g = new char[] { 'S', 'Z' };
        h = new char[] { 'A', 'H', 'K', 'O', 'Q', 'U', 'X' };
        i = new char[] { 'D', 'T', 'X' };
    }
    
    private static boolean b(final char[] array, final char c) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == c) {
                return true;
            }
        }
        return false;
    }
    
    private char[] g(final String s) {
        final char[] charArray = s.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            final char c = charArray[i];
            if (c != '\u00c4') {
                if (c != '\u00d6') {
                    if (c == '\u00dc') {
                        charArray[i] = 85;
                    }
                }
                else {
                    charArray[i] = 79;
                }
            }
            else {
                charArray[i] = 65;
            }
        }
        return charArray;
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o instanceof String) {
            return this.d((String)o);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("This method's parameter was expected to be of the type ");
        sb.append(String.class.getName());
        sb.append(". But actually it was of the type ");
        sb.append(o.getClass().getName());
        sb.append(".");
        throw new h(sb.toString());
    }
    
    public String c(final String s) {
        if (s == null) {
            return null;
        }
        final b b = new b(this.g(s));
        final c c = new c(((a)b).b() * 2);
        char c2 = '-';
        while (((a)b).b() > 0) {
            final char e = b.e();
            char c3;
            if (((a)b).b() > 0) {
                c3 = b.c();
            }
            else {
                c3 = '-';
            }
            if (e >= 'A') {
                if (e > 'Z') {
                    continue;
                }
                Label_0422: {
                    char c4 = '\0';
                    Label_0112: {
                        if (b(org.apache.commons.codec.language.e.a, e)) {
                            c4 = '0';
                        }
                        else if (e != 'B' && (e != 'P' || c3 == 'H')) {
                            if ((e == 'D' || e == 'T') && !b(org.apache.commons.codec.language.e.b, c3)) {
                                c4 = '2';
                            }
                            else {
                                if (!b(org.apache.commons.codec.language.e.c, e)) {
                                    Label_0210: {
                                        if (!b(org.apache.commons.codec.language.e.d, e)) {
                                            if (e == 'X' && !b(org.apache.commons.codec.language.e.e, c2)) {
                                                c.c('4');
                                            }
                                            else if (e != 'S') {
                                                if (e != 'Z') {
                                                    if (e == 'C') {
                                                        if (((a)c).b() == 0) {
                                                            if (b(org.apache.commons.codec.language.e.f, c3)) {
                                                                break Label_0210;
                                                            }
                                                        }
                                                        else if (!b(org.apache.commons.codec.language.e.g, c2)) {
                                                            if (b(org.apache.commons.codec.language.e.h, c3)) {
                                                                break Label_0210;
                                                            }
                                                        }
                                                    }
                                                    else if (!b(org.apache.commons.codec.language.e.i, e)) {
                                                        if (e == 'R') {
                                                            c4 = '7';
                                                            break Label_0112;
                                                        }
                                                        if (e == 'L') {
                                                            c4 = '5';
                                                            break Label_0112;
                                                        }
                                                        if (e == 'M' || e == 'N') {
                                                            c4 = '6';
                                                            break Label_0112;
                                                        }
                                                        if (e == 'H') {
                                                            c.c('-');
                                                        }
                                                        break Label_0422;
                                                    }
                                                }
                                            }
                                            c.c('8');
                                            break Label_0422;
                                        }
                                    }
                                    c.c('4');
                                    break Label_0422;
                                }
                                c4 = '3';
                            }
                        }
                        else {
                            c4 = '1';
                        }
                    }
                    c.c(c4);
                }
                c2 = e;
            }
        }
        return ((a)c).toString();
    }
    
    @Override
    public String d(final String s) {
        return this.c(s);
    }
    
    public boolean f(final String s, final String s2) {
        return this.c(s).equals(this.c(s2));
    }
    
    private abstract class a
    {
        protected final char[] a;
        protected int b;
        
        public a(final int n) {
            this.b = 0;
            this.a = new char[n];
            this.b = 0;
        }
        
        public a(final char[] a) {
            this.b = 0;
            this.a = a;
            this.b = a.length;
        }
        
        protected abstract char[] a(final int p0, final int p1);
        
        public int b() {
            return this.b;
        }
        
        @Override
        public String toString() {
            return new String(this.a(0, this.b));
        }
    }
    
    private class b extends a
    {
        public b(final char[] array) {
            super(array);
        }
        
        @Override
        protected char[] a(final int n, final int n2) {
            final char[] array = new char[n2];
            final char[] a = super.a;
            System.arraycopy(a, a.length - super.b + n, array, 0, n2);
            return array;
        }
        
        public char c() {
            return super.a[this.d()];
        }
        
        protected int d() {
            return super.a.length - super.b;
        }
        
        public char e() {
            final char c = this.c();
            --super.b;
            return c;
        }
    }
    
    private class c extends a
    {
        private char d;
        
        public c(final int n) {
            super(n);
            this.d = 47;
        }
        
        @Override
        protected char[] a(final int n, final int n2) {
            final char[] array = new char[n2];
            System.arraycopy(super.a, n, array, 0, n2);
            return array;
        }
        
        public void c(final char c) {
            if (c != '-' && this.d != c && (c != '0' || super.b == 0)) {
                final char[] a = super.a;
                final int b = super.b;
                a[b] = c;
                super.b = b + 1;
            }
            this.d = c;
        }
    }
}
