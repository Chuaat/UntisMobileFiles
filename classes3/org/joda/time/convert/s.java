// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.convert;

import org.joda.time.d0;
import org.joda.time.c;
import org.joda.time.o0;
import org.joda.time.h0;
import org.joda.time.format.b;
import org.joda.time.n0;
import org.joda.time.format.q;
import org.joda.time.format.k;
import org.joda.time.i0;
import org.joda.time.format.j;

class s extends a implements h, l, g, m, i
{
    static final s a;
    
    static {
        a = new s();
    }
    
    protected s() {
    }
    
    @Override
    public long d(final Object o, final org.joda.time.a a) {
        return j.D().N(a).s((String)o);
    }
    
    @Override
    public void e(final i0 i0, final Object o, final org.joda.time.a a) {
        final String str = (String)o;
        final q e = k.e();
        i0.clear();
        final int j = e.j(i0, str, 0);
        if (j < str.length()) {
            if (j < 0) {
                e.q(i0.I()).k(str);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(str);
            sb.append('\"');
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    @Override
    public long f(Object o) {
        final String s = (String)o;
        int length = s.length();
        if (length >= 4 && (s.charAt(0) == 'P' || s.charAt(0) == 'p') && (s.charAt(1) == 'T' || s.charAt(1) == 't')) {
            --length;
            if (s.charAt(length) == 'S' || s.charAt(length) == 's') {
                final String substring = s.substring(2, length);
                int i = 0;
                int n = 0;
                int endIndex = -1;
                while (i < substring.length()) {
                    if (substring.charAt(i) < '0' || substring.charAt(i) > '9') {
                        if (i == 0 && substring.charAt(0) == '-') {
                            n = 1;
                        }
                        else {
                            if (i <= n || substring.charAt(i) != '.' || endIndex != -1) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Invalid format: \"");
                                sb.append(s);
                                sb.append('\"');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            endIndex = i;
                        }
                    }
                    ++i;
                }
                long long1;
                long n2;
                if (endIndex > 0) {
                    long1 = Long.parseLong(substring.substring(n, endIndex));
                    String s2;
                    final String str = s2 = substring.substring(endIndex + 1);
                    if (str.length() != 3) {
                        o = new StringBuilder();
                        ((StringBuilder)o).append(str);
                        ((StringBuilder)o).append("000");
                        s2 = ((StringBuilder)o).toString().substring(0, 3);
                    }
                    n2 = Integer.parseInt(s2);
                }
                else {
                    long n3;
                    if (n != 0) {
                        n3 = Long.parseLong(substring.substring(n, substring.length()));
                    }
                    else {
                        n3 = Long.parseLong(substring);
                    }
                    long1 = n3;
                    n2 = 0L;
                }
                if (n != 0) {
                    return org.joda.time.field.j.e(org.joda.time.field.j.i(-long1, 1000), -n2);
                }
                return org.joda.time.field.j.e(org.joda.time.field.j.i(long1, 1000), n2);
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid format: \"");
        sb2.append(s);
        sb2.append('\"');
        throw new IllegalArgumentException(sb2.toString());
    }
    
    @Override
    public Class<?> g() {
        return String.class;
    }
    
    @Override
    public int[] i(final n0 n0, final Object o, final org.joda.time.a a, final b b) {
        org.joda.time.a s = a;
        if (b.j() != null) {
            s = a.S(b.j());
        }
        return s.m(n0, b.N(s).s((String)o));
    }
    
    @Override
    public void k(final h0 h0, final Object o, org.joda.time.a a) {
        final String s = (String)o;
        final int index = s.indexOf(47);
        if (index < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Format requires a '/' separator: ");
            sb.append(s);
            throw new IllegalArgumentException(sb.toString());
        }
        final String substring = s.substring(0, index);
        if (substring.length() <= 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Format invalid: ");
            sb2.append(s);
            throw new IllegalArgumentException(sb2.toString());
        }
        final String substring2 = s.substring(index + 1);
        if (substring2.length() > 0) {
            final b n = j.D().N(a);
            final q e = k.e();
            long n2 = 0L;
            final char char1 = substring.charAt(0);
            org.joda.time.a a2 = null;
            o0 l;
            if (char1 != 'P' && char1 != 'p') {
                final org.joda.time.c n3 = n.n(substring);
                n2 = n3.n();
                a2 = n3.t();
                l = null;
            }
            else {
                l = e.q(this.h(substring)).l(substring);
            }
            final char char2 = substring2.charAt(0);
            long b;
            if (char2 != 'P' && char2 != 'p') {
                final org.joda.time.c n4 = n.n(substring2);
                final long n5 = n4.n();
                if (a2 == null) {
                    a2 = n4.t();
                }
                if (a != null) {
                    a2 = a;
                }
                b = n5;
                a = a2;
                if (l != null) {
                    n2 = a2.b(l, n5, -1);
                    b = n5;
                    a = a2;
                }
            }
            else {
                if (l != null) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Interval composed of two durations: ");
                    sb3.append(s);
                    throw new IllegalArgumentException(sb3.toString());
                }
                final d0 i = e.q(this.h(substring2)).l(substring2);
                if (a != null) {
                    a2 = a;
                }
                b = a2.b(i, n2, 1);
                a = a2;
            }
            h0.f(n2, b);
            h0.J(a);
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Format invalid: ");
        sb4.append(s);
        throw new IllegalArgumentException(sb4.toString());
    }
}
