// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.io.Closeable;
import okio.r0;
import okio.d0;
import okio.n;
import java.math.BigDecimal;
import java.io.EOFException;
import java.util.Objects;
import java.io.IOException;
import c6.h;
import okio.p;

final class o extends m
{
    private static final int A0 = 7;
    private static final long U = -922337203685477580L;
    private static final p V;
    private static final p W;
    private static final p X;
    private static final p Y;
    private static final p Z;
    private static final int a0 = 0;
    private static final int b0 = 1;
    private static final int c0 = 2;
    private static final int d0 = 3;
    private static final int e0 = 4;
    private static final int f0 = 5;
    private static final int g0 = 6;
    private static final int h0 = 7;
    private static final int i0 = 8;
    private static final int j0 = 9;
    private static final int k0 = 10;
    private static final int l0 = 11;
    private static final int m0 = 12;
    private static final int n0 = 13;
    private static final int o0 = 14;
    private static final int p0 = 15;
    private static final int q0 = 16;
    private static final int r0 = 17;
    private static final int s0 = 18;
    private static final int t0 = 0;
    private static final int u0 = 1;
    private static final int v0 = 2;
    private static final int w0 = 3;
    private static final int x0 = 4;
    private static final int y0 = 5;
    private static final int z0 = 6;
    private final okio.o N;
    private final okio.m O;
    private int P;
    private long Q;
    private int R;
    @h
    private String S;
    @h
    private r T;
    
    static {
        V = p.o("'\\");
        W = p.o("\"\\");
        X = p.o("{}[]:, \n\t\r\f/\\;#=");
        Y = p.o("\n\r");
        Z = p.o("*/");
    }
    
    o(final o o) {
        super(o);
        this.P = 0;
        final okio.o peek = o.N.peek();
        this.N = peek;
        this.O = peek.z();
        this.P = o.P;
        this.Q = o.Q;
        this.R = o.R;
        this.S = o.S;
        try {
            peek.B5(o.O.h0());
        }
        catch (IOException ex) {
            throw new AssertionError();
        }
    }
    
    o(final okio.o o) {
        this.P = 0;
        Objects.requireNonNull(o, "source == null");
        this.N = o;
        this.O = o.z();
        this.C(6);
    }
    
    private void Q() throws IOException {
        if (super.K) {
            return;
        }
        throw this.L("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
    
    private int R() throws IOException {
        final int[] h = super.H;
        final int g = super.G;
        final int n = h[g - 1];
        Label_0265: {
            if (n == 1) {
                h[g - 1] = 2;
            }
            else {
                if (n == 2) {
                    final int w = this.W(true);
                    this.O.readByte();
                    if (w == 44) {
                        break Label_0265;
                    }
                    if (w != 59) {
                        if (w == 93) {
                            return this.P = 4;
                        }
                        throw this.L("Unterminated array");
                    }
                }
                else if (n != 3 && n != 5) {
                    if (n == 4) {
                        h[g - 1] = 5;
                        final int w2 = this.W(true);
                        this.O.readByte();
                        if (w2 == 58) {
                            break Label_0265;
                        }
                        if (w2 != 61) {
                            throw this.L("Expected ':'");
                        }
                        this.Q();
                        if (this.N.v(1L) && this.O.F(0L) == 62) {
                            this.O.readByte();
                        }
                        break Label_0265;
                    }
                    else {
                        if (n == 6) {
                            h[g - 1] = 7;
                            break Label_0265;
                        }
                        if (n == 7) {
                            if (this.W(false) == -1) {
                                return this.P = 18;
                            }
                        }
                        else {
                            if (n == 9) {
                                this.T.b();
                                this.T = null;
                                --super.G;
                                return this.R();
                            }
                            if (n != 8) {
                                break Label_0265;
                            }
                            throw new IllegalStateException("JsonReader is closed");
                        }
                    }
                }
                else {
                    h[g - 1] = 4;
                    if (n == 5) {
                        final int w3 = this.W(true);
                        this.O.readByte();
                        if (w3 != 44) {
                            if (w3 != 59) {
                                if (w3 == 125) {
                                    return this.P = 2;
                                }
                                throw this.L("Unterminated object");
                            }
                            else {
                                this.Q();
                            }
                        }
                    }
                    final int w4 = this.W(true);
                    if (w4 == 34) {
                        this.O.readByte();
                        return this.P = 13;
                    }
                    if (w4 == 39) {
                        this.O.readByte();
                        this.Q();
                        return this.P = 12;
                    }
                    if (w4 != 125) {
                        this.Q();
                        if (this.V((char)w4)) {
                            return this.P = 14;
                        }
                        throw this.L("Expected name");
                    }
                    else {
                        if (n != 5) {
                            this.O.readByte();
                            return this.P = 2;
                        }
                        throw this.L("Expected name");
                    }
                }
                this.Q();
            }
        }
        final int w5 = this.W(true);
        if (w5 == 34) {
            this.O.readByte();
            return this.P = 9;
        }
        if (w5 == 39) {
            this.Q();
            this.O.readByte();
            return this.P = 8;
        }
        if (w5 != 44 && w5 != 59) {
            if (w5 == 91) {
                this.O.readByte();
                return this.P = 3;
            }
            if (w5 != 93) {
                if (w5 == 123) {
                    this.O.readByte();
                    return this.P = 1;
                }
                final int z = this.Z();
                if (z != 0) {
                    return z;
                }
                final int a0 = this.a0();
                if (a0 != 0) {
                    return a0;
                }
                if (this.V(this.O.F(0L))) {
                    this.Q();
                    return this.P = 10;
                }
                throw this.L("Expected value");
            }
            else if (n == 1) {
                this.O.readByte();
                return this.P = 4;
            }
        }
        if (n != 1 && n != 2) {
            throw this.L("Unexpected value");
        }
        this.Q();
        return this.P = 7;
    }
    
    private int S(final String s, final b b) {
        for (int length = b.a.length, i = 0; i < length; ++i) {
            if (s.equals(b.a[i])) {
                this.P = 0;
                super.I[super.G - 1] = s;
                return i;
            }
        }
        return -1;
    }
    
    private int T(final String s, final b b) {
        for (int length = b.a.length, i = 0; i < length; ++i) {
            if (s.equals(b.a[i])) {
                this.P = 0;
                final int[] j = super.J;
                final int n = super.G - 1;
                ++j[n];
                return i;
            }
        }
        return -1;
    }
    
    private boolean V(final int n) throws IOException {
        if (n != 9 && n != 10 && n != 12 && n != 13 && n != 32) {
            if (n != 35) {
                if (n == 44) {
                    return false;
                }
                if (n != 47 && n != 61) {
                    if (n == 123 || n == 125 || n == 58) {
                        return false;
                    }
                    if (n != 59) {
                        switch (n) {
                            default: {
                                return true;
                            }
                            case 92: {
                                break;
                            }
                            case 91:
                            case 93: {
                                return false;
                            }
                        }
                    }
                }
            }
            this.Q();
        }
        return false;
    }
    
    private int W(final boolean b) throws IOException {
        while (true) {
            int n = 0;
            while (true) {
                final okio.o n2 = this.N;
                final int n3 = n + 1;
                if (n2.v((long)n3)) {
                    final byte f = this.O.F((long)n);
                    if (f != 10 && f != 32 && f != 13 && f != 9) {
                        this.O.skip((long)(n3 - 1));
                        if (f == 47) {
                            if (!this.N.v(2L)) {
                                return f;
                            }
                            this.Q();
                            final byte f2 = this.O.F(1L);
                            if (f2 != 42) {
                                if (f2 != 47) {
                                    return f;
                                }
                                this.O.readByte();
                                this.O.readByte();
                            }
                            else {
                                this.O.readByte();
                                this.O.readByte();
                                if (this.f0()) {
                                    break;
                                }
                                throw this.L("Unterminated comment");
                            }
                        }
                        else {
                            if (f != 35) {
                                return f;
                            }
                            this.Q();
                        }
                        this.g0();
                        break;
                    }
                    n = n3;
                }
                else {
                    if (!b) {
                        return -1;
                    }
                    throw new EOFException("End of input");
                }
            }
        }
    }
    
    private String X(final p p) throws IOException {
        StringBuilder sb = null;
        while (true) {
            final long y1 = this.N.Y1(p);
            if (y1 == -1L) {
                throw this.L("Unterminated string");
            }
            if (this.O.F(y1) == 92) {
                StringBuilder sb2;
                if ((sb2 = sb) == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.O.t0(y1));
                this.O.readByte();
                sb2.append(this.d0());
                sb = sb2;
            }
            else {
                final String t0 = this.O.t0(y1);
                if (sb == null) {
                    this.O.readByte();
                    return t0;
                }
                sb.append(t0);
                this.O.readByte();
                return sb.toString();
            }
        }
    }
    
    private String Y() throws IOException {
        final long y1 = this.N.Y1(o.X);
        String s;
        if (y1 != -1L) {
            s = this.O.t0(y1);
        }
        else {
            s = this.O.y4();
        }
        return s;
    }
    
    private int Z() throws IOException {
        final byte f = this.O.F(0L);
        int p;
        String s;
        String s2;
        if (f != 116 && f != 84) {
            if (f != 102 && f != 70) {
                if (f != 110 && f != 78) {
                    return 0;
                }
                p = 7;
                s = "null";
                s2 = "NULL";
            }
            else {
                p = 6;
                s = "false";
                s2 = "FALSE";
            }
        }
        else {
            p = 5;
            s = "true";
            s2 = "TRUE";
        }
        final int length = s.length();
        int n2;
        for (int i = 1; i < length; i = n2) {
            final okio.o n = this.N;
            n2 = i + 1;
            if (!n.v((long)n2)) {
                return 0;
            }
            final byte f2 = this.O.F((long)i);
            if (f2 != s.charAt(i) && f2 != s2.charAt(i)) {
                return 0;
            }
        }
        if (this.N.v((long)(length + 1)) && this.V(this.O.F((long)length))) {
            return 0;
        }
        this.O.skip((long)length);
        return this.P = p;
    }
    
    private int a0() throws IOException {
        int n = 0;
        long q = 0L;
        int r = 0;
        int n2 = 0;
        int n3 = 1;
        int n4 = 0;
        while (true) {
            final okio.o n5 = this.N;
            final int n6 = r + 1;
            if (!n5.v((long)n6)) {
                break;
            }
            final byte f = this.O.F((long)r);
            Label_0458: {
                if (f != 43) {
                    if (f != 69 && f != 101) {
                        if (f != 45) {
                            if (f != 46) {
                                if (f >= 48 && f <= 57) {
                                    if (n2 != 1 && n2 != 0) {
                                        long n7 = 0L;
                                        int n9 = 0;
                                        Label_0227: {
                                            if (n2 == 2) {
                                                if (q == 0L) {
                                                    return n;
                                                }
                                                n7 = 10L * q - (f - 48);
                                                final long n8 = lcmp(q, -922337203685477580L);
                                                n9 = (n3 & ((n8 > 0 || (n8 == 0 && n7 < q)) ? 1 : 0));
                                            }
                                            else {
                                                if (n2 == 3) {
                                                    n = 0;
                                                    n2 = 4;
                                                    break Label_0458;
                                                }
                                                if (n2 != 5) {
                                                    n9 = n3;
                                                    n7 = q;
                                                    if (n2 != 6) {
                                                        break Label_0227;
                                                    }
                                                }
                                                n = 0;
                                                n2 = 7;
                                                break Label_0458;
                                            }
                                        }
                                        n = 0;
                                        n3 = n9;
                                        q = n7;
                                        break Label_0458;
                                    }
                                    q = -(f - 48);
                                    n = 0;
                                    n2 = 2;
                                    break Label_0458;
                                }
                                else {
                                    if (!this.V(f)) {
                                        break;
                                    }
                                    return 0;
                                }
                            }
                            else {
                                if (n2 == 2) {
                                    n2 = 3;
                                    break Label_0458;
                                }
                                return n;
                            }
                        }
                        else {
                            if (n2 == 0) {
                                n2 = 1;
                                n4 = 1;
                                break Label_0458;
                            }
                            if (n2 != 5) {
                                return n;
                            }
                        }
                    }
                    else {
                        if (n2 != 2 && n2 != 4) {
                            return n;
                        }
                        n2 = 5;
                        break Label_0458;
                    }
                }
                else if (n2 != 5) {
                    return n;
                }
                n2 = 6;
            }
            r = n6;
        }
        int p;
        if (n2 == 2 && n3 != 0 && (q != Long.MIN_VALUE || n4 != 0) && (q != 0L || n4 == 0)) {
            if (n4 == 0) {
                q = -q;
            }
            this.Q = q;
            this.O.skip((long)r);
            p = 16;
        }
        else {
            if (n2 != 2 && n2 != 4 && n2 != 7) {
                return 0;
            }
            this.R = r;
            p = 17;
        }
        return this.P = p;
    }
    
    private char d0() throws IOException {
        if (!this.N.v(1L)) {
            throw this.L("Unterminated escape sequence");
        }
        final byte byte1 = this.O.readByte();
        if (byte1 == 10 || byte1 == 34 || byte1 == 39 || byte1 == 47 || byte1 == 92) {
            return (char)byte1;
        }
        if (byte1 == 98) {
            return '\b';
        }
        if (byte1 == 102) {
            return '\f';
        }
        if (byte1 == 110) {
            return '\n';
        }
        if (byte1 == 114) {
            return '\r';
        }
        if (byte1 == 116) {
            return '\t';
        }
        if (byte1 != 117) {
            if (super.K) {
                return (char)byte1;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid escape sequence: \\");
            sb.append((char)byte1);
            throw this.L(sb.toString());
        }
        else {
            if (this.N.v(4L)) {
                int i = 0;
                char c = '\0';
                while (i < 4) {
                    int f = this.O.F((long)i);
                    final char c2 = (char)(c << 4);
                    if (f >= 48 && f <= 57) {
                        f -= 48;
                    }
                    else {
                        if (f >= 97 && f <= 102) {
                            f -= 97;
                        }
                        else {
                            if (f < 65 || f > 70) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("\\u");
                                sb2.append(this.O.t0(4L));
                                throw this.L(sb2.toString());
                            }
                            f -= 65;
                        }
                        f += 10;
                    }
                    final char c3 = (char)(c2 + f);
                    ++i;
                    c = c3;
                }
                this.O.skip(4L);
                return c;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Unterminated escape sequence at path ");
            sb3.append(this.getPath());
            throw new EOFException(sb3.toString());
        }
    }
    
    private void e0(final p p) throws IOException {
        while (true) {
            final long y1 = this.N.Y1(p);
            if (y1 == -1L) {
                throw this.L("Unterminated string");
            }
            if (this.O.F(y1) != 92) {
                this.O.skip(y1 + 1L);
                return;
            }
            this.O.skip(y1 + 1L);
            this.d0();
        }
    }
    
    private boolean f0() throws IOException {
        final okio.o n = this.N;
        final p z = o.Z;
        final long y1 = n.y1(z);
        final boolean b = y1 != -1L;
        final okio.m o = this.O;
        long h0;
        if (b) {
            h0 = y1 + z.size();
        }
        else {
            h0 = o.h0();
        }
        o.skip(h0);
        return b;
    }
    
    private void g0() throws IOException {
        final long y1 = this.N.Y1(o.Y);
        final okio.m o = this.O;
        long h0;
        if (y1 != -1L) {
            h0 = y1 + 1L;
        }
        else {
            h0 = o.h0();
        }
        o.skip(h0);
    }
    
    private void h0() throws IOException {
        long n = this.N.Y1(o.X);
        final okio.m o = this.O;
        if (n == -1L) {
            n = o.h0();
        }
        o.skip(n);
    }
    
    @Override
    public void C1() throws IOException {
        if (!super.L) {
            int n;
            if ((n = this.P) == 0) {
                n = this.R();
            }
            Label_0073: {
                if (n == 14) {
                    this.h0();
                }
                else {
                    p p;
                    if (n == 13) {
                        p = o.W;
                    }
                    else if (n == 12) {
                        p = o.V;
                    }
                    else {
                        if (n == 15) {
                            break Label_0073;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Expected a name but was ");
                        sb.append(this.w());
                        sb.append(" at path ");
                        sb.append(this.getPath());
                        throw new j(sb.toString());
                    }
                    this.e0(p);
                }
            }
            this.P = 0;
            super.I[super.G - 1] = "null";
            return;
        }
        final c w = this.w();
        this.o();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot skip unexpected ");
        sb2.append(w);
        sb2.append(" at ");
        sb2.append(this.getPath());
        throw new j(sb2.toString());
    }
    
    @Override
    public int F(final b b) throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        if (n < 12 || n > 15) {
            return -1;
        }
        if (n == 15) {
            return this.S(this.S, b);
        }
        final int p = this.N.P5(b.b);
        if (p != -1) {
            this.P = 0;
            super.I[super.G - 1] = b.a[p];
            return p;
        }
        final String s = super.I[super.G - 1];
        final String o = this.o();
        final int s2 = this.S(o, b);
        if (s2 == -1) {
            this.P = 15;
            this.S = o;
            super.I[super.G - 1] = s;
        }
        return s2;
    }
    
    @Override
    public int G(final b b) throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        if (n < 8 || n > 11) {
            return -1;
        }
        if (n == 11) {
            return this.T(this.S, b);
        }
        final int p = this.N.P5(b.b);
        if (p != -1) {
            this.P = 0;
            final int[] j = super.J;
            final int n2 = super.G - 1;
            ++j[n2];
            return p;
        }
        final String s = this.s();
        final int t = this.T(s, b);
        if (t == -1) {
            this.P = 11;
            this.S = s;
            final int[] i = super.J;
            final int n3 = super.G - 1;
            --i[n3];
        }
        return t;
    }
    
    @Override
    public void a() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        if (n == 3) {
            this.C(1);
            super.J[super.G - 1] = 0;
            this.P = 0;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(this.w());
        sb.append(" at path ");
        sb.append(this.getPath());
        throw new j(sb.toString());
    }
    
    @Override
    public void b() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        if (n == 1) {
            this.C(3);
            this.P = 0;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(this.w());
        sb.append(" at path ");
        sb.append(this.getPath());
        throw new j(sb.toString());
    }
    
    @Override
    public void c() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        if (n == 4) {
            int g = super.G - 1;
            super.G = g;
            final int[] j = super.J;
            --g;
            ++j[g];
            this.P = 0;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected END_ARRAY but was ");
        sb.append(this.w());
        sb.append(" at path ");
        sb.append(this.getPath());
        throw new j(sb.toString());
    }
    
    @Override
    public void close() throws IOException {
        this.P = 0;
        super.H[0] = 8;
        super.G = 1;
        this.O.c();
        ((r0)this.N).close();
    }
    
    @Override
    public void d() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        if (n == 2) {
            int g = super.G - 1;
            super.G = g;
            super.I[g] = null;
            final int[] j = super.J;
            --g;
            ++j[g];
            this.P = 0;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected END_OBJECT but was ");
        sb.append(this.w());
        sb.append(" at path ");
        sb.append(this.getPath());
        throw new j(sb.toString());
    }
    
    @Override
    public boolean f() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        return n != 2 && n != 4 && n != 18;
    }
    
    @Override
    public boolean h() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        if (n == 5) {
            this.P = 0;
            final int[] j = super.J;
            final int n2 = super.G - 1;
            ++j[n2];
            return true;
        }
        if (n == 6) {
            this.P = 0;
            final int[] i = super.J;
            final int n3 = super.G - 1;
            ++i[n3];
            return false;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected a boolean but was ");
        sb.append(this.w());
        sb.append(" at path ");
        sb.append(this.getPath());
        throw new j(sb.toString());
    }
    
    @Override
    public double j() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        if (n == 16) {
            this.P = 0;
            final int[] j = super.J;
            final int n2 = super.G - 1;
            ++j[n2];
            return (double)this.Q;
        }
        Label_0313: {
            Label_0132: {
                String s = null;
                Label_0072: {
                    if (n == 17) {
                        s = this.O.t0((long)this.R);
                    }
                    else {
                        p p;
                        if (n == 9) {
                            p = o.W;
                        }
                        else if (n == 8) {
                            p = o.V;
                        }
                        else {
                            if (n == 10) {
                                s = this.Y();
                                break Label_0072;
                            }
                            if (n == 11) {
                                break Label_0132;
                            }
                            break Label_0313;
                        }
                        s = this.X(p);
                    }
                }
                this.S = s;
            }
            this.P = 11;
            try {
                final double double1 = Double.parseDouble(this.S);
                if (!super.K && (Double.isNaN(double1) || Double.isInfinite(double1))) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("JSON forbids NaN and infinities: ");
                    sb.append(double1);
                    sb.append(" at path ");
                    sb.append(this.getPath());
                    throw new k(sb.toString());
                }
                this.S = null;
                this.P = 0;
                final int[] i = super.J;
                final int n3 = super.G - 1;
                ++i[n3];
                return double1;
            }
            catch (NumberFormatException ex) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a double but was ");
                sb2.append(this.S);
                sb2.append(" at path ");
                sb2.append(this.getPath());
                throw new j(sb2.toString());
            }
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Expected a double but was ");
        sb3.append(this.w());
        sb3.append(" at path ");
        sb3.append(this.getPath());
        throw new j(sb3.toString());
    }
    
    @Override
    public int k() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        if (n == 16) {
            final long q = this.Q;
            final int n2 = (int)q;
            if (q == n2) {
                this.P = 0;
                final int[] j = super.J;
                final int n3 = super.G - 1;
                ++j[n3];
                return n2;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected an int but was ");
            sb.append(this.Q);
            sb.append(" at path ");
            sb.append(this.getPath());
            throw new j(sb.toString());
        }
        else {
            while (true) {
                if (n == 17) {
                    this.S = this.O.t0((long)this.R);
                    break Label_0305;
                }
                p p;
                if (n != 9 && n != 8) {
                    if (n == 11) {
                        break Label_0305;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected an int but was ");
                    sb2.append(this.w());
                    sb2.append(" at path ");
                    sb2.append(this.getPath());
                    throw new j(sb2.toString());
                }
                else if (n == 9) {
                    p = o.W;
                }
                else {
                    p = o.V;
                }
                final String x = this.X(p);
                this.S = x;
                try {
                    final int int1 = Integer.parseInt(x);
                    this.P = 0;
                    final int[] i = super.J;
                    final int n4 = super.G - 1;
                    ++i[n4];
                    return int1;
                    this.P = 11;
                    try {
                        final double double1 = Double.parseDouble(this.S);
                        final int n5 = (int)double1;
                        if (n5 == double1) {
                            this.S = null;
                            this.P = 0;
                            final int[] k = super.J;
                            final int n6 = super.G - 1;
                            ++k[n6];
                            return n5;
                        }
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Expected an int but was ");
                        sb3.append(this.S);
                        sb3.append(" at path ");
                        sb3.append(this.getPath());
                        throw new j(sb3.toString());
                    }
                    catch (NumberFormatException ex) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Expected an int but was ");
                        sb4.append(this.S);
                        sb4.append(" at path ");
                        sb4.append(this.getPath());
                        throw new j(sb4.toString());
                    }
                }
                catch (NumberFormatException ex2) {
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public long n() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        if (n == 16) {
            this.P = 0;
            final int[] j = super.J;
            final int n2 = super.G - 1;
            ++j[n2];
            return this.Q;
        }
        while (true) {
            if (n == 17) {
                this.S = this.O.t0((long)this.R);
                break Label_0217;
            }
            p p;
            if (n != 9 && n != 8) {
                if (n == 11) {
                    break Label_0217;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected a long but was ");
                sb.append(this.w());
                sb.append(" at path ");
                sb.append(this.getPath());
                throw new j(sb.toString());
            }
            else if (n == 9) {
                p = o.W;
            }
            else {
                p = o.V;
            }
            final String x = this.X(p);
            this.S = x;
            try {
                final long long1 = Long.parseLong(x);
                this.P = 0;
                final int[] i = super.J;
                final int n3 = super.G - 1;
                ++i[n3];
                return long1;
                this.P = 11;
                try {
                    final long longValueExact = new BigDecimal(this.S).longValueExact();
                    this.S = null;
                    this.P = 0;
                    final int[] k = super.J;
                    final int n4 = super.G - 1;
                    ++k[n4];
                    return longValueExact;
                }
                catch (NumberFormatException | ArithmeticException ex) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected a long but was ");
                    sb2.append(this.S);
                    sb2.append(" at path ");
                    sb2.append(this.getPath());
                    throw new j(sb2.toString());
                }
            }
            catch (NumberFormatException ex2) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public String o() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        String s = null;
        Label_0078: {
            if (n == 14) {
                s = this.Y();
            }
            else {
                p p;
                if (n == 13) {
                    p = o.W;
                }
                else if (n == 12) {
                    p = o.V;
                }
                else {
                    if (n == 15) {
                        s = this.S;
                        this.S = null;
                        break Label_0078;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Expected a name but was ");
                    sb.append(this.w());
                    sb.append(" at path ");
                    sb.append(this.getPath());
                    throw new j(sb.toString());
                }
                s = this.X(p);
            }
        }
        this.P = 0;
        return super.I[super.G - 1] = s;
    }
    
    @h
    @Override
    public <T> T q() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        if (n == 7) {
            this.P = 0;
            final int[] j = super.J;
            final int n2 = super.G - 1;
            ++j[n2];
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected null but was ");
        sb.append(this.w());
        sb.append(" at path ");
        sb.append(this.getPath());
        throw new j(sb.toString());
    }
    
    @Override
    public okio.o r() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        final okio.m m = new okio.m();
        final p s = r.S;
        Object exception = null;
        int n2 = 0;
        Label_0326: {
            String s2;
            if (n == 3) {
                s2 = "[";
            }
            else {
                if (n != 1) {
                    Label_0088: {
                        if (n == 9) {
                            m.p1("\"");
                            exception = r.P;
                        }
                        else if (n == 8) {
                            m.p1("'");
                            exception = r.O;
                        }
                        else {
                            String s3;
                            if (n != 17 && n != 16 && n != 10) {
                                if (n == 5) {
                                    s3 = "true";
                                }
                                else if (n == 6) {
                                    s3 = "false";
                                }
                                else {
                                    if (n != 7) {
                                        if (n == 11) {
                                            final String s4 = this.s();
                                            exception = t.r((n)m);
                                            try {
                                                ((t)exception).M(s4);
                                                ((Closeable)exception).close();
                                                exception = s;
                                                break Label_0088;
                                            }
                                            finally {
                                                if (exception != null) {
                                                    try {
                                                        ((Closeable)exception).close();
                                                    }
                                                    finally {
                                                        final Throwable t;
                                                        t.addSuppressed((Throwable)exception);
                                                    }
                                                }
                                            }
                                        }
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("Expected a value but was ");
                                        sb.append(this.w());
                                        sb.append(" at path ");
                                        sb.append(this.getPath());
                                        throw new j(sb.toString());
                                    }
                                    s3 = "null";
                                }
                            }
                            else {
                                s3 = this.s();
                            }
                            m.p1(s3);
                            exception = s;
                        }
                    }
                    n2 = 0;
                    break Label_0326;
                }
                s2 = "{";
            }
            m.p1(s2);
            exception = r.N;
            n2 = 1;
        }
        if (this.P != 0) {
            final int[] j = super.J;
            final int n3 = super.G - 1;
            ++j[n3];
            this.P = 0;
        }
        this.T = new r(this.N, m, (p)exception, n2);
        this.C(9);
        return okio.d0.d((r0)this.T);
    }
    
    @Override
    public String s() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        String s = null;
        Label_0117: {
            if (n == 10) {
                s = this.Y();
            }
            else {
                p p;
                if (n == 9) {
                    p = o.W;
                }
                else if (n == 8) {
                    p = o.V;
                }
                else {
                    if (n == 11) {
                        s = this.S;
                        this.S = null;
                        break Label_0117;
                    }
                    if (n == 16) {
                        s = Long.toString(this.Q);
                        break Label_0117;
                    }
                    if (n == 17) {
                        s = this.O.t0((long)this.R);
                        break Label_0117;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Expected a string but was ");
                    sb.append(this.w());
                    sb.append(" at path ");
                    sb.append(this.getPath());
                    throw new j(sb.toString());
                }
                s = this.X(p);
            }
        }
        this.P = 0;
        final int[] j = super.J;
        final int n2 = super.G - 1;
        ++j[n2];
        return s;
    }
    
    @Override
    public void skipValue() throws IOException {
        if (!super.L) {
            int n = 0;
            int i = 0;
            do {
                int n2;
                if ((n2 = this.P) == 0) {
                    n2 = this.R();
                }
                Label_0386: {
                    if (n2 == 3) {
                        this.C(1);
                    }
                    else {
                        if (n2 != 1) {
                            if (n2 == 4) {
                                i = n - 1;
                                if (i < 0) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Expected a value but was ");
                                    sb.append(this.w());
                                    sb.append(" at path ");
                                    sb.append(this.getPath());
                                    throw new j(sb.toString());
                                }
                            }
                            else if (n2 == 2) {
                                i = n - 1;
                                if (i < 0) {
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Expected a value but was ");
                                    sb2.append(this.w());
                                    sb2.append(" at path ");
                                    sb2.append(this.getPath());
                                    throw new j(sb2.toString());
                                }
                            }
                            else {
                                if (n2 != 14 && n2 != 10) {
                                    p p;
                                    if (n2 != 9 && n2 != 13) {
                                        if (n2 != 8 && n2 != 12) {
                                            if (n2 == 17) {
                                                this.O.skip((long)this.R);
                                                i = n;
                                                break Label_0386;
                                            }
                                            if (n2 != 18) {
                                                i = n;
                                                break Label_0386;
                                            }
                                            final StringBuilder sb3 = new StringBuilder();
                                            sb3.append("Expected a value but was ");
                                            sb3.append(this.w());
                                            sb3.append(" at path ");
                                            sb3.append(this.getPath());
                                            throw new j(sb3.toString());
                                        }
                                        else {
                                            p = o.V;
                                        }
                                    }
                                    else {
                                        p = o.W;
                                    }
                                    this.e0(p);
                                    i = n;
                                    break Label_0386;
                                }
                                this.h0();
                                i = n;
                                break Label_0386;
                            }
                            --super.G;
                            break Label_0386;
                        }
                        this.C(3);
                    }
                    i = n + 1;
                }
                this.P = 0;
                n = i;
            } while (i != 0);
            final int[] j = super.J;
            final int g = super.G;
            final int n3 = g - 1;
            ++j[n3];
            super.I[g - 1] = "null";
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Cannot skip unexpected ");
        sb4.append(this.w());
        sb4.append(" at ");
        sb4.append(this.getPath());
        throw new j(sb4.toString());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("JsonReader(");
        sb.append(this.N);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public c w() throws IOException {
        int n;
        if ((n = this.P) == 0) {
            n = this.R();
        }
        switch (n) {
            default: {
                throw new AssertionError();
            }
            case 18: {
                return c.P;
            }
            case 16:
            case 17: {
                return c.M;
            }
            case 12:
            case 13:
            case 14:
            case 15: {
                return c.K;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                return c.L;
            }
            case 7: {
                return c.O;
            }
            case 5:
            case 6: {
                return c.N;
            }
            case 4: {
                return c.H;
            }
            case 3: {
                return c.G;
            }
            case 2: {
                return c.J;
            }
            case 1: {
                return c.I;
            }
        }
    }
    
    @Override
    public m x() {
        return new o(this);
    }
    
    @Override
    public void y() throws IOException {
        if (this.f()) {
            this.S = this.o();
            this.P = 11;
        }
    }
}
