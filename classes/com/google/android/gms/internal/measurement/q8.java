// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class q8 extends w7
{
    private static final Logger b;
    private static final boolean c;
    r8 a;
    
    static {
        b = Logger.getLogger(q8.class.getName());
        c = fc.C();
    }
    
    private q8() {
    }
    
    public static int A(final x9 x9) {
        final int a = x9.a();
        return a(a) + a;
    }
    
    static int B(final sa sa, final db db) {
        final q7 q7 = (q7)sa;
        int n;
        if ((n = q7.e()) == -1) {
            n = db.a(q7);
            q7.h(n);
        }
        return a(n) + n;
    }
    
    public static int C(final String s) {
        int n;
        try {
            n = kc.c(s);
        }
        catch (jc jc) {
            n = s.getBytes(s9.a).length;
        }
        return a(n) + n;
    }
    
    public static int D(final int n) {
        return a(n << 3);
    }
    
    public static int a(final int n) {
        if ((n & 0xFFFFFF80) == 0x0) {
            return 1;
        }
        if ((n & 0xFFFFC000) == 0x0) {
            return 2;
        }
        if ((0xFFE00000 & n) == 0x0) {
            return 3;
        }
        if ((n & 0xF0000000) == 0x0) {
            return 4;
        }
        return 5;
    }
    
    public static int b(long n) {
        if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
            return 1;
        }
        if (n < 0L) {
            return 10;
        }
        int n2;
        if ((0xFFFFFFF800000000L & n) != 0x0L) {
            n >>>= 28;
            n2 = 6;
        }
        else {
            n2 = 2;
        }
        int n3 = n2;
        long n4 = n;
        if ((0xFFFFFFFFFFE00000L & n) != 0x0L) {
            n3 = n2 + 2;
            n4 = n >>> 14;
        }
        int n5 = n3;
        if ((n4 & 0xFFFFFFFFFFFFC000L) != 0x0L) {
            n5 = n3 + 1;
        }
        return n5;
    }
    
    public static q8 c(final byte[] array) {
        return new n8(array, 0, array.length);
    }
    
    public static int x(final h8 h8) {
        final int h9 = h8.h();
        return a(h9) + h9;
    }
    
    @Deprecated
    static int y(int n, final sa sa, final db db) {
        final int a = a(n << 3);
        final q7 q7 = (q7)sa;
        if ((n = q7.e()) == -1) {
            n = db.a(q7);
            q7.h(n);
        }
        return a + a + n;
    }
    
    public static int z(final int n) {
        if (n >= 0) {
            return a(n);
        }
        return 10;
    }
    
    public final void d() {
        if (this.g() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }
    
    final void e(final String s, final jc thrown) throws IOException {
        q8.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", thrown);
        final byte[] bytes = s.getBytes(s9.a);
        try {
            final int length = bytes.length;
            this.u(length);
            this.q(bytes, 0, length);
        }
        catch (o8 o8) {
            throw o8;
        }
        catch (IndexOutOfBoundsException ex) {
            throw new o8(ex);
        }
    }
    
    public abstract int g();
    
    public abstract void h(final byte p0) throws IOException;
    
    public abstract void i(final int p0, final boolean p1) throws IOException;
    
    public abstract void j(final int p0, final h8 p1) throws IOException;
    
    public abstract void k(final int p0, final int p1) throws IOException;
    
    public abstract void l(final int p0) throws IOException;
    
    public abstract void m(final int p0, final long p1) throws IOException;
    
    public abstract void n(final long p0) throws IOException;
    
    public abstract void o(final int p0, final int p1) throws IOException;
    
    public abstract void p(final int p0) throws IOException;
    
    public abstract void q(final byte[] p0, final int p1, final int p2) throws IOException;
    
    public abstract void r(final int p0, final String p1) throws IOException;
    
    public abstract void s(final int p0, final int p1) throws IOException;
    
    public abstract void t(final int p0, final int p1) throws IOException;
    
    public abstract void u(final int p0) throws IOException;
    
    public abstract void v(final int p0, final long p1) throws IOException;
    
    public abstract void w(final long p0) throws IOException;
}
