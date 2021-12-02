// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

public class q
{
    public static final Class a;
    public static final Class b;
    public static final Class c;
    public static final Class d;
    public static final Class e;
    public static final Class f;
    public static final Class g;
    public static final Class h;
    public static final Class i;
    static /* synthetic */ Class j;
    static /* synthetic */ Class k;
    static /* synthetic */ Class l;
    static /* synthetic */ Class m;
    static /* synthetic */ Class n;
    static /* synthetic */ Class o;
    static /* synthetic */ Class p;
    static /* synthetic */ Class q;
    static /* synthetic */ Class r;
    
    static {
        Class j;
        if ((j = org.apache.commons.cli.q.j) == null) {
            j = (org.apache.commons.cli.q.j = a("java.lang.String"));
        }
        a = j;
        Class k;
        if ((k = org.apache.commons.cli.q.k) == null) {
            k = (org.apache.commons.cli.q.k = a("java.lang.Object"));
        }
        b = k;
        Class l;
        if ((l = org.apache.commons.cli.q.l) == null) {
            l = (org.apache.commons.cli.q.l = a("java.lang.Number"));
        }
        c = l;
        Class m;
        if ((m = org.apache.commons.cli.q.m) == null) {
            m = (org.apache.commons.cli.q.m = a("java.util.Date"));
        }
        d = m;
        Class n;
        if ((n = org.apache.commons.cli.q.n) == null) {
            n = (org.apache.commons.cli.q.n = a("java.lang.Class"));
        }
        e = n;
        Class o;
        if ((o = org.apache.commons.cli.q.o) == null) {
            o = (org.apache.commons.cli.q.o = a("java.io.FileInputStream"));
        }
        f = o;
        Class p;
        if ((p = org.apache.commons.cli.q.p) == null) {
            p = (org.apache.commons.cli.q.p = a("java.io.File"));
        }
        g = p;
        Class q;
        if ((q = org.apache.commons.cli.q.q) == null) {
            q = (org.apache.commons.cli.q.q = a("[Ljava.io.File;"));
        }
        h = q;
        Class r;
        if ((r = org.apache.commons.cli.q.r) == null) {
            r = (org.apache.commons.cli.q.r = a("java.net.URL"));
        }
        i = r;
    }
    
    static /* synthetic */ Class a(final String className) {
        try {
            return Class.forName(className);
        }
        catch (ClassNotFoundException cause) {
            throw new NoClassDefFoundError().initCause(cause);
        }
    }
    
    public static Object b(final char c) {
        if (c == '#') {
            return org.apache.commons.cli.q.d;
        }
        if (c == '%') {
            return org.apache.commons.cli.q.c;
        }
        if (c == '/') {
            return org.apache.commons.cli.q.i;
        }
        if (c == ':') {
            return org.apache.commons.cli.q.a;
        }
        if (c == '<') {
            return org.apache.commons.cli.q.f;
        }
        if (c == '>') {
            return org.apache.commons.cli.q.g;
        }
        if (c == '@') {
            return org.apache.commons.cli.q.b;
        }
        if (c == '*') {
            return org.apache.commons.cli.q.h;
        }
        if (c != '+') {
            return null;
        }
        return org.apache.commons.cli.q.e;
    }
    
    public static boolean c(final char c) {
        return c == '@' || c == ':' || c == '%' || c == '+' || c == '#' || c == '<' || c == '>' || c == '*' || c == '/' || c == '!';
    }
    
    public static n d(final String s) {
        final n n = new n();
        final boolean b = false;
        Object b2 = null;
        int index = 0;
        final char c = ' ';
        int n2 = 0;
        char c2 = c;
        while (true) {
            final int length = s.length();
            final boolean b3 = true;
            if (index >= length) {
                break;
            }
            final char char1 = s.charAt(index);
            char c3;
            if (!c(char1)) {
                Object o = b2;
                boolean b4 = n2 != 0;
                if (c2 != ' ') {
                    org.apache.commons.cli.k.e(b2 != null && b3);
                    org.apache.commons.cli.k.l((boolean)(n2 != 0));
                    org.apache.commons.cli.k.q(b2);
                    n.c(org.apache.commons.cli.k.b(c2));
                    o = null;
                    b4 = false;
                }
                c3 = char1;
                b2 = o;
                n2 = (b4 ? 1 : 0);
            }
            else if (char1 == '!') {
                n2 = (true ? 1 : 0);
                c3 = c2;
            }
            else {
                b2 = b(char1);
                c3 = c2;
            }
            ++index;
            c2 = c3;
        }
        if (c2 != ' ') {
            boolean b5 = b;
            if (b2 != null) {
                b5 = true;
            }
            org.apache.commons.cli.k.e(b5);
            org.apache.commons.cli.k.l((boolean)(n2 != 0));
            org.apache.commons.cli.k.q(b2);
            n.c(org.apache.commons.cli.k.b(c2));
        }
        return n;
    }
}
