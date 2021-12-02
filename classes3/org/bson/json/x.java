// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import org.bson.r0;
import java.io.Reader;

class x
{
    private final p a;
    
    x(final Reader reader) {
        this(new y(reader));
    }
    
    x(final String s) {
        this(new z(s));
    }
    
    x(final p a) {
        this.a = a;
    }
    
    private c0 e(final char c) {
        final StringBuilder sb = new StringBuilder();
        sb.append(c);
        b b;
        if (c != '-') {
            if (c != '0') {
                b = x.b.I;
            }
            else {
                b = x.b.H;
            }
        }
        else {
            b = x.b.G;
        }
        d0 d0 = org.bson.json.d0.R;
        while (true) {
            int codePoint = this.a.read();
            Label_0785: {
                Label_0767: {
                    Label_0734: {
                        Label_0727: {
                            Label_0720: {
                                Label_0555: {
                                    char c3 = '\0';
                                    Label_0547: {
                                        char c2 = '\0';
                                        Label_0364: {
                                            switch (x$a.b[b.ordinal()]) {
                                                default: {
                                                    break Label_0785;
                                                }
                                                case 9: {
                                                    boolean b2 = false;
                                                    int i = 0;
                                                    while (true) {
                                                        while (i < 7) {
                                                            if (codePoint != (new char[] { 'n', 'f', 'i', 'n', 'i', 't', 'y' })[i]) {
                                                                c2 = (char)codePoint;
                                                                if (b2) {
                                                                    final d0 p = org.bson.json.d0.P;
                                                                    if (codePoint != -1 && codePoint != ')' && codePoint != ',' && codePoint != ']' && codePoint != '}') {
                                                                        d0 = p;
                                                                        c3 = (char)codePoint;
                                                                        if (!Character.isWhitespace(codePoint)) {
                                                                            break Label_0547;
                                                                        }
                                                                    }
                                                                    final b p2 = x.b.P;
                                                                    d0 = p;
                                                                    b = p2;
                                                                    break Label_0555;
                                                                }
                                                                break Label_0364;
                                                            }
                                                            else {
                                                                sb.append((char)codePoint);
                                                                codePoint = this.a.read();
                                                                ++i;
                                                            }
                                                        }
                                                        b2 = true;
                                                        continue;
                                                    }
                                                }
                                                case 8: {
                                                    if (codePoint == ')' || codePoint == ',' || codePoint == ']' || codePoint == '}') {
                                                        break Label_0734;
                                                    }
                                                    if (Character.isDigit(codePoint)) {
                                                        break;
                                                    }
                                                    c2 = (char)codePoint;
                                                    if (Character.isWhitespace(codePoint)) {
                                                        break Label_0734;
                                                    }
                                                    break Label_0364;
                                                }
                                                case 7: {
                                                    c2 = (char)codePoint;
                                                    if (Character.isDigit(codePoint)) {
                                                        break;
                                                    }
                                                    break Label_0364;
                                                }
                                                case 6: {
                                                    final d0 p3 = org.bson.json.d0.P;
                                                    if (codePoint == '+' || codePoint == '-') {
                                                        final b m = x.b.M;
                                                        d0 = p3;
                                                        b = m;
                                                        break Label_0555;
                                                    }
                                                    d0 = p3;
                                                    c3 = (char)codePoint;
                                                    if (Character.isDigit(codePoint)) {
                                                        final b n = x.b.N;
                                                        d0 = p3;
                                                        b = n;
                                                        break Label_0555;
                                                    }
                                                    break Label_0547;
                                                }
                                                case 5: {
                                                    if (codePoint == -1 || codePoint == ')' || codePoint == ',') {
                                                        break Label_0734;
                                                    }
                                                    if (codePoint == 'E') {
                                                        break Label_0720;
                                                    }
                                                    if (codePoint == ']') {
                                                        break Label_0734;
                                                    }
                                                    if (codePoint == 'e') {
                                                        break Label_0720;
                                                    }
                                                    if (codePoint == '}') {
                                                        break Label_0734;
                                                    }
                                                    if (Character.isDigit(codePoint)) {
                                                        b = x.b.K;
                                                        break Label_0785;
                                                    }
                                                    c2 = (char)codePoint;
                                                    if (Character.isWhitespace(codePoint)) {
                                                        break Label_0734;
                                                    }
                                                    break Label_0364;
                                                }
                                                case 4: {
                                                    d0 = org.bson.json.d0.P;
                                                    c3 = (char)codePoint;
                                                    if (Character.isDigit(codePoint)) {
                                                        final b k = x.b.K;
                                                        d0 = d0;
                                                        b = k;
                                                        break Label_0555;
                                                    }
                                                    break Label_0547;
                                                }
                                                case 3: {
                                                    if (codePoint == -1 || codePoint == ')' || codePoint == ',') {
                                                        break Label_0734;
                                                    }
                                                    if (codePoint == '.') {
                                                        break Label_0727;
                                                    }
                                                    if (codePoint == 'E') {
                                                        break Label_0720;
                                                    }
                                                    if (codePoint == ']') {
                                                        break Label_0734;
                                                    }
                                                    if (codePoint == 'e') {
                                                        break Label_0720;
                                                    }
                                                    if (codePoint == '}') {
                                                        break Label_0734;
                                                    }
                                                    if (Character.isDigit(codePoint)) {
                                                        break Label_0767;
                                                    }
                                                    c2 = (char)codePoint;
                                                    if (Character.isWhitespace(codePoint)) {
                                                        break Label_0734;
                                                    }
                                                    break Label_0364;
                                                }
                                                case 2: {
                                                    if (codePoint == -1 || codePoint == ')' || codePoint == ',') {
                                                        break Label_0734;
                                                    }
                                                    if (codePoint == '.') {
                                                        break Label_0727;
                                                    }
                                                    if (codePoint == 'E') {
                                                        break Label_0720;
                                                    }
                                                    if (codePoint == ']') {
                                                        break Label_0734;
                                                    }
                                                    if (codePoint == 'e') {
                                                        break Label_0720;
                                                    }
                                                    if (codePoint == '}') {
                                                        break Label_0734;
                                                    }
                                                    if (Character.isDigit(codePoint)) {
                                                        break Label_0767;
                                                    }
                                                    c2 = (char)codePoint;
                                                    if (Character.isWhitespace(codePoint)) {
                                                        break Label_0734;
                                                    }
                                                    break Label_0364;
                                                }
                                                case 1: {
                                                    if (codePoint == '0') {
                                                        b = x.b.H;
                                                        break Label_0785;
                                                    }
                                                    if (codePoint == 'I') {
                                                        b = x.b.O;
                                                        break Label_0785;
                                                    }
                                                    c2 = (char)codePoint;
                                                    if (Character.isDigit(codePoint)) {
                                                        break Label_0767;
                                                    }
                                                    break Label_0364;
                                                }
                                            }
                                            b = x.b.N;
                                            break Label_0785;
                                        }
                                        b = x.b.Q;
                                        codePoint = c2;
                                        break Label_0785;
                                    }
                                    b = x.b.Q;
                                    codePoint = c3;
                                }
                                break Label_0785;
                            }
                            b = x.b.L;
                            break Label_0785;
                        }
                        b = x.b.J;
                        break Label_0785;
                    }
                    b = x.b.P;
                    break Label_0785;
                }
                b = x.b.I;
            }
            final int n2 = x$a.b[b.ordinal()];
            if (n2 == 10) {
                throw new v("Invalid JSON number");
            }
            if (n2 != 11) {
                sb.append((char)codePoint);
            }
            else {
                this.a.c(codePoint);
                final String string = sb.toString();
                final d0 p4 = org.bson.json.d0.P;
                if (d0 == p4) {
                    return new c0(p4, Double.parseDouble(string));
                }
                final long long1 = Long.parseLong(string);
                if (long1 >= -2147483648L && long1 <= 2147483647L) {
                    return new c0(org.bson.json.d0.Q, (int)long1);
                }
                return new c0(org.bson.json.d0.R, long1);
            }
        }
    }
    
    private c0 f() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        c g = c.G;
        while (true) {
            final int read = this.a.read();
            final int[] a = x$a.a;
            final int n = a[g.ordinal()];
            c c = null;
            Label_0199: {
                Label_0194: {
                    Label_0186: {
                        if (n != 1) {
                            if (n != 2) {
                                if (n != 3) {
                                    c = g;
                                    break Label_0199;
                                }
                                if (read != -1 && read != 41 && read != 44 && read != 93) {
                                    if (read == 105 || read == 109 || read == 115 || read == 120) {
                                        break Label_0186;
                                    }
                                    if (read != 125 && !Character.isWhitespace(read)) {
                                        break Label_0194;
                                    }
                                }
                                c = x.c.J;
                                break Label_0199;
                            }
                        }
                        else {
                            if (read == -1) {
                                break Label_0194;
                            }
                            if (read == 47) {
                                break Label_0186;
                            }
                            if (read == 92) {
                                c = x.c.H;
                                break Label_0199;
                            }
                        }
                        c = x.c.G;
                        break Label_0199;
                    }
                    c = x.c.I;
                    break Label_0199;
                }
                c = x.c.K;
            }
            final int n2 = a[c.ordinal()];
            if (n2 == 4) {
                this.a.c(read);
                return new c0(d0.S, new r0(sb.toString(), sb2.toString()));
            }
            if (n2 == 5) {
                throw new v("Invalid JSON regular expression. Position: %d.", new Object[] { this.a.getPosition() });
            }
            if (a[c.ordinal()] != 3) {
                sb.append((char)read);
                g = c;
            }
            else {
                g = c;
                if (read == 47) {
                    continue;
                }
                sb2.append((char)read);
                g = c;
            }
        }
    }
    
    private c0 g(final char c) {
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final int read = this.a.read();
            final char c2 = '\\';
            int n = 0;
            Label_0384: {
                char c4 = '\0';
                Label_0067: {
                    if (read == 92) {
                        final int read2 = this.a.read();
                        char c3 = '\"';
                        if (read2 != 34) {
                            c3 = '\'';
                            if (read2 != 39) {
                                c3 = '/';
                                if (read2 != 47) {
                                    n = read2;
                                    c4 = c2;
                                    if (read2 == 92) {
                                        break Label_0067;
                                    }
                                    if (read2 == 98) {
                                        final char c5 = '\b';
                                        n = read2;
                                        c4 = c5;
                                        break Label_0067;
                                    }
                                    if (read2 == 102) {
                                        final char c6 = '\f';
                                        n = read2;
                                        c4 = c6;
                                        break Label_0067;
                                    }
                                    if (read2 == 110) {
                                        final char c7 = '\n';
                                        n = read2;
                                        c4 = c7;
                                        break Label_0067;
                                    }
                                    if (read2 == 114) {
                                        final char c8 = '\r';
                                        n = read2;
                                        c4 = c8;
                                        break Label_0067;
                                    }
                                    if (read2 == 116) {
                                        final char c9 = '\t';
                                        n = read2;
                                        c4 = c9;
                                        break Label_0067;
                                    }
                                    if (read2 != 117) {
                                        throw new v("Invalid escape sequence in JSON string '\\%c'.", new Object[] { read2 });
                                    }
                                    final int read3 = this.a.read();
                                    final int read4 = this.a.read();
                                    final int read5 = this.a.read();
                                    final int read6 = this.a.read();
                                    n = read2;
                                    if (read6 != -1) {
                                        final char c10 = (char)Integer.parseInt(new String(new char[] { (char)read3, (char)read4, (char)read5, (char)read6 }), 16);
                                        n = read2;
                                        c4 = c10;
                                        break Label_0067;
                                    }
                                    break Label_0384;
                                }
                            }
                        }
                        sb.append(c3);
                        n = read2;
                        break Label_0384;
                    }
                    if (read == c) {
                        return new c0(d0.T, sb.toString());
                    }
                    if ((n = read) == -1) {
                        break Label_0384;
                    }
                    c4 = (char)read;
                    n = read;
                }
                sb.append(c4);
            }
            if (n != -1) {
                continue;
            }
            throw new v("End of file in JSON string.");
        }
    }
    
    private c0 h(final char c) {
        final StringBuilder sb = new StringBuilder();
        char c2 = c;
        int read;
        while (true) {
            sb.append(c2);
            read = this.a.read();
            if (read != 36 && read != 95 && !Character.isLetterOrDigit(read)) {
                break;
            }
            c2 = (char)read;
        }
        this.a.c(read);
        return new c0(d0.U, sb.toString());
    }
    
    public void a(final int n) {
        this.a.b(n);
    }
    
    public int b() {
        return this.a.O();
    }
    
    public c0 c() {
        int read;
        do {
            read = this.a.read();
        } while (read != -1 && Character.isWhitespace(read));
        if (read == -1) {
            return new c0(d0.V, "<eof>");
        }
        if (read != 34) {
            if (read == 44) {
                return new c0(d0.O, ",");
            }
            if (read == 47) {
                return this.f();
            }
            if (read == 58) {
                return new c0(d0.N, ":");
            }
            if (read == 91) {
                return new c0(d0.H, "[");
            }
            if (read == 93) {
                return new c0(d0.J, "]");
            }
            if (read == 123) {
                return new c0(d0.I, "{");
            }
            if (read == 125) {
                return new c0(d0.M, "}");
            }
            switch (read) {
                default: {
                    if (read == 45 || Character.isDigit(read)) {
                        return this.e((char)read);
                    }
                    if (read != 36 && read != 95 && !Character.isLetter(read)) {
                        final int position = this.a.getPosition();
                        this.a.c(read);
                        throw new v("Invalid JSON input. Position: %d. Character: '%c'.", new Object[] { position, read });
                    }
                    return this.h((char)read);
                }
                case 41: {
                    return new c0(d0.L, ")");
                }
                case 40: {
                    return new c0(d0.K, "(");
                }
                case 39: {
                    break;
                }
            }
        }
        return this.g((char)read);
    }
    
    public void d(final int n) {
        this.a.a(n);
    }
    
    private enum b
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L, 
        M, 
        N, 
        O, 
        P, 
        Q;
    }
    
    private enum c
    {
        G, 
        H, 
        I, 
        J, 
        K;
    }
}
