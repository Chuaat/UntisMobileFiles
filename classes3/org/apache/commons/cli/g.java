// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Comparator;

public class g
{
    public static final int j = 74;
    public static final int k = 1;
    public static final int l = 3;
    public static final String m = "usage: ";
    public static final String n = "-";
    public static final String o = "--";
    public static final String p = "arg";
    public int a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    protected Comparator i;
    
    public g() {
        this.a = 74;
        this.b = 1;
        this.c = 3;
        this.d = "usage: ";
        this.e = System.getProperty("line.separator");
        this.f = "-";
        this.g = "--";
        this.h = "arg";
        this.i = new a(null);
    }
    
    private static void a(final StringBuffer sb, final j j, final boolean b) {
        if (!b) {
            sb.append("[");
        }
        String str;
        if (j.n() != null) {
            sb.append("-");
            str = j.n();
        }
        else {
            sb.append("--");
            str = j.m();
        }
        sb.append(str);
        if (j.x() && j.y()) {
            sb.append(" <");
            sb.append(j.f());
            sb.append(">");
        }
        if (!b) {
            sb.append("]");
        }
    }
    
    private void b(final StringBuffer sb, final l l) {
        if (!l.e()) {
            sb.append("[");
        }
        final ArrayList<Object> list = new ArrayList<Object>(l.c());
        Collections.sort(list, this.k());
        final Iterator<j> iterator = list.iterator();
        while (iterator.hasNext()) {
            a(sb, iterator.next(), true);
            if (iterator.hasNext()) {
                sb.append(" | ");
            }
        }
        if (!l.e()) {
            sb.append("]");
        }
    }
    
    protected StringBuffer A(final StringBuffer sb, final int n, final n n2, int length, final int n3) {
        final String c = this.c(length);
        final String c2 = this.c(n3);
        final ArrayList<StringBuffer> list = new ArrayList<StringBuffer>();
        final List k = n2.k();
        Collections.sort((List<Object>)k, this.k());
        final Iterator<j> iterator = k.iterator();
        int n4 = 0;
        length = 0;
        while (iterator.hasNext()) {
            final j j = iterator.next();
            final StringBuffer sb2 = new StringBuffer(8);
            final String n5 = j.n();
            sb2.append(c);
            Label_0201: {
                String str;
                if (n5 == null) {
                    final StringBuffer sb3 = new StringBuffer();
                    sb3.append("   ");
                    sb3.append(this.g);
                    str = sb3.toString();
                }
                else {
                    sb2.append(this.f);
                    sb2.append(j.n());
                    if (!j.B()) {
                        break Label_0201;
                    }
                    sb2.append(',');
                    str = this.g;
                }
                sb2.append(str);
                sb2.append(j.m());
            }
            if (j.x()) {
                if (j.y()) {
                    sb2.append(" <");
                    sb2.append(j.f());
                    sb2.append(">");
                }
                else {
                    sb2.append(' ');
                }
            }
            list.add(sb2);
            if (sb2.length() > length) {
                length = sb2.length();
            }
        }
        final Iterator<j> iterator2 = k.iterator();
        while (iterator2.hasNext()) {
            final j i = iterator2.next();
            final StringBuffer sb4 = new StringBuffer(list.get(n4).toString());
            if (sb4.length() < length) {
                sb4.append(this.c(length - sb4.length()));
            }
            sb4.append(c2);
            if (i.i() != null) {
                sb4.append(i.i());
            }
            this.B(sb, n, length + n3, sb4.toString());
            if (iterator2.hasNext()) {
                sb.append(this.e);
            }
            ++n4;
        }
        return sb;
    }
    
    protected StringBuffer B(final StringBuffer sb, final int n, int n2, String string) {
        final int d = this.d(string, n, 0);
        if (d == -1) {
            sb.append(this.C(string));
            return sb;
        }
        sb.append(this.C(string.substring(0, d)));
        sb.append(this.e);
        int n3;
        if ((n3 = n2) >= n) {
            n3 = 1;
        }
        final String c = this.c(n3);
        n2 = d;
        while (true) {
            final StringBuffer sb2 = new StringBuffer();
            sb2.append(c);
            sb2.append(string.substring(n2).trim());
            string = sb2.toString();
            final int d2 = this.d(string, n, 0);
            if (d2 == -1) {
                break;
            }
            n2 = d2;
            if (string.length() > n && (n2 = d2) == n3 - 1) {
                n2 = n;
            }
            sb.append(this.C(string.substring(0, n2)));
            sb.append(this.e);
        }
        sb.append(string);
        return sb;
    }
    
    protected String C(final String s) {
        String substring = s;
        if (s != null) {
            if (s.length() == 0) {
                substring = s;
            }
            else {
                int length;
                for (length = s.length(); length > 0 && Character.isWhitespace(s.charAt(length - 1)); --length) {}
                substring = s.substring(0, length);
            }
        }
        return substring;
    }
    
    public void D(final String h) {
        this.h = h;
    }
    
    public void E(final int c) {
        this.c = c;
    }
    
    public void F(final int b) {
        this.b = b;
    }
    
    public void G(final String g) {
        this.g = g;
    }
    
    public void H(final String e) {
        this.e = e;
    }
    
    public void I(final String f) {
        this.f = f;
    }
    
    public void J(final Comparator comparator) {
        Comparator i = comparator;
        if (comparator == null) {
            i = new a(null);
        }
        this.i = i;
    }
    
    public void K(final String d) {
        this.d = d;
    }
    
    public void L(final int a) {
        this.a = a;
    }
    
    protected String c(final int capacity) {
        final StringBuffer sb = new StringBuffer(capacity);
        for (int i = 0; i < capacity; ++i) {
            sb.append(' ');
        }
        return sb.toString();
    }
    
    protected int d(final String s, int i, int char1) {
        final int index = s.indexOf(10, char1);
        final int n = -1;
        int index2;
        if (index == -1 || (index2 = index) > i) {
            index2 = s.indexOf(9, char1);
            if (index2 == -1 || index2 > i) {
                i += char1;
                if (i >= s.length()) {
                    return -1;
                }
                int j;
                for (j = i; j >= char1; --j) {
                    final char char2 = s.charAt(j);
                    if (char2 == ' ' || char2 == '\n' || char2 == '\r') {
                        break;
                    }
                }
                if (j > char1) {
                    return j;
                }
                while (i <= s.length()) {
                    char1 = s.charAt(i);
                    if (char1 == 32 || char1 == 10 || char1 == 13) {
                        break;
                    }
                    ++i;
                }
                if (i == s.length()) {
                    i = n;
                }
                return i;
            }
        }
        return index2 + 1;
    }
    
    public String e() {
        return this.h;
    }
    
    public int f() {
        return this.c;
    }
    
    public int g() {
        return this.b;
    }
    
    public String h() {
        return this.g;
    }
    
    public String i() {
        return this.e;
    }
    
    public String j() {
        return this.f;
    }
    
    public Comparator k() {
        return this.i;
    }
    
    public String l() {
        return this.d;
    }
    
    public int m() {
        return this.a;
    }
    
    public void n(final int n, final String s, final String s2, final n n2, final String s3) {
        this.o(n, s, s2, n2, s3, false);
    }
    
    public void o(final int n, final String s, final String s2, final n n2, final String s3, final boolean b) {
        final PrintWriter printWriter = new PrintWriter(System.out);
        this.q(printWriter, n, s, s2, n2, this.b, this.c, s3, b);
        printWriter.flush();
    }
    
    public void p(final PrintWriter printWriter, final int n, final String s, final String s2, final n n2, final int n3, final int n4, final String s3) {
        this.q(printWriter, n, s, s2, n2, n3, n4, s3, false);
    }
    
    public void q(final PrintWriter printWriter, final int n, final String s, final String s2, final n n2, final int n3, final int n4, final String s3, final boolean b) {
        if (s != null && s.length() != 0) {
            if (b) {
                this.x(printWriter, n, s, n2);
            }
            else {
                this.w(printWriter, n, s);
            }
            if (s2 != null && s2.trim().length() > 0) {
                this.z(printWriter, n, s2);
            }
            this.v(printWriter, n, n2, n3, n4);
            if (s3 != null && s3.trim().length() > 0) {
                this.z(printWriter, n, s3);
            }
            return;
        }
        throw new IllegalArgumentException("cmdLineSyntax not provided");
    }
    
    public void r(final String s, final String s2, final n n, final String s3) {
        this.s(s, s2, n, s3, false);
    }
    
    public void s(final String s, final String s2, final n n, final String s3, final boolean b) {
        this.o(this.a, s, s2, n, s3, b);
    }
    
    public void t(final String s, final n n) {
        this.o(this.a, s, null, n, null, false);
    }
    
    public void u(final String s, final n n, final boolean b) {
        this.o(this.a, s, null, n, null, b);
    }
    
    public void v(final PrintWriter printWriter, final int n, final n n2, final int n3, final int n4) {
        final StringBuffer sb = new StringBuffer();
        this.A(sb, n, n2, n3, n4);
        printWriter.println(sb.toString());
    }
    
    public void w(final PrintWriter printWriter, final int n, final String str) {
        final int index = str.indexOf(32);
        final int length = this.d.length();
        final StringBuffer sb = new StringBuffer();
        sb.append(this.d);
        sb.append(str);
        this.y(printWriter, n, length + (index + 1), sb.toString());
    }
    
    public void x(final PrintWriter printWriter, final int n, final String str, final n n2) {
        final StringBuffer sb = new StringBuffer(this.d);
        sb.append(str);
        sb.append(" ");
        final ArrayList<l> list = new ArrayList<l>();
        final ArrayList<Object> list2 = new ArrayList<Object>(n2.h());
        Collections.sort(list2, this.k());
        final Iterator<j> iterator = list2.iterator();
        while (iterator.hasNext()) {
            final j j = iterator.next();
            final l f = n2.f(j);
            if (f != null) {
                if (!list.contains(f)) {
                    list.add(f);
                    this.b(sb, f);
                }
            }
            else {
                a(sb, j, j.F());
            }
            if (iterator.hasNext()) {
                sb.append(" ");
            }
        }
        this.y(printWriter, n, sb.toString().indexOf(32) + 1, sb.toString());
    }
    
    public void y(final PrintWriter printWriter, final int n, final int n2, final String s) {
        final StringBuffer sb = new StringBuffer(s.length());
        this.B(sb, n, n2, s);
        printWriter.println(sb.toString());
    }
    
    public void z(final PrintWriter printWriter, final int n, final String s) {
        this.y(printWriter, n, 0, s);
    }
    
    private static class a implements Comparator
    {
        @Override
        public int compare(final Object o, final Object o2) {
            return ((j)o).l().compareToIgnoreCase(((j)o2).l());
        }
    }
}
