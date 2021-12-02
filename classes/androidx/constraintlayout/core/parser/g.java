// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.parser;

import java.io.PrintStream;

public class g
{
    static boolean d = false;
    private String a;
    private boolean b;
    private int c;
    
    public g(final String a) {
        this.b = false;
        this.a = a;
    }
    
    private c a(final c c, int n, final b obj, final boolean b, final char[] array) {
        if (g.d) {
            final PrintStream out = System.out;
            final StringBuilder sb = new StringBuilder();
            sb.append("CREATE ");
            sb.append(obj);
            sb.append(" at ");
            sb.append(array[n]);
            out.println(sb.toString());
        }
        c c2 = null;
        Label_0167: {
            switch (g$a.a[obj.ordinal()]) {
                default: {
                    c2 = null;
                    break Label_0167;
                }
                case 6: {
                    c2 = j.C(array);
                    break Label_0167;
                }
                case 5: {
                    c2 = androidx.constraintlayout.core.parser.d.D(array);
                    break Label_0167;
                }
                case 4: {
                    c2 = e.C(array);
                    break Label_0167;
                }
                case 3: {
                    c2 = i.C(array);
                    break Label_0167;
                }
                case 2: {
                    c2 = androidx.constraintlayout.core.parser.a.D(array);
                    break;
                }
                case 1: {
                    c2 = f.j0(array);
                    break;
                }
            }
            ++n;
        }
        if (c2 == null) {
            return null;
        }
        c2.x(this.c);
        if (b) {
            c2.z(n);
        }
        if (c instanceof androidx.constraintlayout.core.parser.b) {
            c2.v((androidx.constraintlayout.core.parser.b)c);
        }
        return c2;
    }
    
    private c b(int n, final char c, final c c2, final char[] array) throws h {
        c c3 = c2;
        if (c != '\t') {
            c3 = c2;
            if (c != '\n') {
                c3 = c2;
                if (c != '\r') {
                    c3 = c2;
                    if (c != ' ') {
                        if (c != '\"' && c != '\'') {
                            if (c != '[') {
                                if (c != ']') {
                                    if (c == '{') {
                                        c3 = this.a(c2, n, g.b.H, true, array);
                                        return c3;
                                    }
                                    if (c != '}') {
                                        c3 = c2;
                                        switch (c) {
                                            default: {
                                                if (!(c2 instanceof androidx.constraintlayout.core.parser.b) || c2 instanceof f) {
                                                    c3 = this.a(c2, n, g.b.L, true, array);
                                                    return c3;
                                                }
                                                c3 = this.a(c2, n, g.b.M, true, array);
                                                final j j = (j)c3;
                                                if (j.G(c, n)) {
                                                    return c3;
                                                }
                                                final StringBuilder sb = new StringBuilder();
                                                sb.append("incorrect token <");
                                                sb.append(c);
                                                sb.append("> at line ");
                                                sb.append(this.c);
                                                throw new h(sb.toString(), j);
                                            }
                                            case '/': {
                                                ++n;
                                                c3 = c2;
                                                if (n >= array.length) {
                                                    return c3;
                                                }
                                                c3 = c2;
                                                if (array[n] == '/') {
                                                    this.b = true;
                                                    c3 = c2;
                                                    return c3;
                                                }
                                                return c3;
                                            }
                                            case '+':
                                            case '-':
                                            case '.':
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9': {
                                                c3 = this.a(c2, n, g.b.J, true, array);
                                            }
                                            case ',':
                                            case ':': {
                                                return c3;
                                            }
                                        }
                                    }
                                }
                                c2.w(n - 1);
                                c3 = c2.h();
                                c3.w(n);
                            }
                            else {
                                c3 = this.a(c2, n, g.b.I, true, array);
                            }
                        }
                        else if (c2 instanceof f) {
                            c3 = this.a(c2, n, g.b.L, true, array);
                        }
                        else {
                            c3 = this.a(c2, n, g.b.K, true, array);
                        }
                    }
                }
            }
        }
        return c3;
    }
    
    public static f d(final String s) throws h {
        return new g(s).c();
    }
    
    public f c() throws h {
        final char[] charArray = this.a.toCharArray();
        final int length = charArray.length;
        this.c = 1;
        int i = 0;
        while (true) {
            while (i < length) {
                final char c = charArray[i];
                if (c == '{') {
                    if (i != -1) {
                        final f j0 = f.j0(charArray);
                        j0.x(this.c);
                        j0.z(i);
                        ++i;
                        j k = (j)j0;
                        c h;
                        while (true) {
                            h = k;
                            if (i >= length) {
                                break;
                            }
                            final char c2 = charArray[i];
                            if (c2 == '\n') {
                                ++this.c;
                            }
                            c h2 = null;
                            Label_0625: {
                                if (this.b) {
                                    h2 = k;
                                    if (c2 != '\n') {
                                        break Label_0625;
                                    }
                                    this.b = false;
                                }
                                if (k == null) {
                                    h = k;
                                    break;
                                }
                                c c3 = null;
                                Label_0580: {
                                    Label_0171: {
                                        if (!k.q()) {
                                            if (k instanceof f) {
                                                if (c2 != '}') {
                                                    break Label_0171;
                                                }
                                            }
                                            else if (k instanceof a) {
                                                if (c2 != ']') {
                                                    break Label_0171;
                                                }
                                            }
                                            else {
                                                final boolean b = k instanceof i;
                                                if (b) {
                                                    final long h3 = k.H;
                                                    c3 = k;
                                                    if (charArray[(int)h3] != c2) {
                                                        break Label_0580;
                                                    }
                                                    k.z(h3 + 1L);
                                                }
                                                else {
                                                    if (k instanceof j) {
                                                        final j l = k;
                                                        if (!l.G(c2, i)) {
                                                            final StringBuilder sb = new StringBuilder();
                                                            sb.append("parsing incorrect token ");
                                                            sb.append(l.f());
                                                            sb.append(" at line ");
                                                            sb.append(this.c);
                                                            throw new h(sb.toString(), l);
                                                        }
                                                    }
                                                    if (k instanceof d || b) {
                                                        final long h4 = k.H;
                                                        final char c4 = charArray[(int)h4];
                                                        if ((c4 == '\'' || c4 == '\"') && c4 == c2) {
                                                            k.z(h4 + 1L);
                                                            k.w(i - 1);
                                                        }
                                                    }
                                                    c3 = k;
                                                    if (k.q()) {
                                                        break Label_0580;
                                                    }
                                                    if (c2 != '}' && c2 != ']' && c2 != ',' && c2 != ' ' && c2 != '\t' && c2 != '\r' && c2 != '\n') {
                                                        c3 = k;
                                                        if (c2 != ':') {
                                                            break Label_0580;
                                                        }
                                                    }
                                                    final long n = i - 1;
                                                    k.w(n);
                                                    if (c2 != '}') {
                                                        c3 = k;
                                                        if (c2 != ']') {
                                                            break Label_0580;
                                                        }
                                                    }
                                                    final c h5 = k.h();
                                                    h5.w(n);
                                                    c3 = h5;
                                                    if (h5 instanceof d) {
                                                        c3 = h5.h();
                                                        c3.w(n);
                                                    }
                                                    break Label_0580;
                                                }
                                            }
                                            k.w(i - 1);
                                            c3 = k;
                                            break Label_0580;
                                        }
                                    }
                                    c3 = this.b(i, c2, k, charArray);
                                }
                                h2 = c3;
                                if (c3.q()) {
                                    if (c3 instanceof d) {
                                        h2 = c3;
                                        if (((d)c3).N.size() <= 0) {
                                            break Label_0625;
                                        }
                                    }
                                    h2 = c3.h();
                                }
                            }
                            ++i;
                            k = (j)h2;
                        }
                        while (h != null && !h.q()) {
                            if (h instanceof i) {
                                h.z((int)h.H + 1);
                            }
                            h.w(length - 1);
                            h = h.h();
                        }
                        if (g.d) {
                            final PrintStream out = System.out;
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Root: ");
                            sb2.append(j0.B());
                            out.println(sb2.toString());
                        }
                        return j0;
                    }
                    throw new h("invalid json content", (c)null);
                }
                else {
                    if (c == '\n') {
                        ++this.c;
                    }
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    enum b
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L, 
        M;
    }
}
