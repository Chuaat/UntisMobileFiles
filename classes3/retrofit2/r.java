// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import okio.n;
import java.io.IOException;
import okio.m;
import okhttp3.f0;
import okhttp3.t;
import okhttp3.z;
import okhttp3.y;
import okhttp3.v;
import okhttp3.e0;
import c6.h;
import okhttp3.w;
import java.util.regex.Pattern;

final class r
{
    private static final char[] l;
    private static final String m = " \"<>^`{}|\\?#";
    private static final Pattern n;
    private final String a;
    private final w b;
    @h
    private String c;
    @h
    private w.a d;
    private final e0.a e;
    private final v.a f;
    @h
    private y g;
    private final boolean h;
    @h
    private z.a i;
    @h
    private t.a j;
    @h
    private f0 k;
    
    static {
        l = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        n = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    }
    
    r(final String a, final w b, @h final String c, @h final v v, @h final y g, final boolean h, final boolean b2, final boolean b3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = new e0.a();
        this.g = g;
        this.h = h;
        Object p8;
        if (v != null) {
            p8 = v.p();
        }
        else {
            p8 = new v.a();
        }
        this.f = (v.a)p8;
        if (b2) {
            this.j = new t.a();
        }
        else if (b3) {
            (this.i = new z.a()).g(z.k);
        }
    }
    
    private static String i(final String s, final boolean b) {
        final int length = s.length();
        int index = 0;
        while (true) {
            final String y4 = s;
            if (index >= length) {
                return y4;
            }
            final int codePoint = s.codePointAt(index);
            if (codePoint < 32 || codePoint >= 127 || " \"<>^`{}|\\?#".indexOf(codePoint) != -1) {
                break;
            }
            if (!b) {
                if (codePoint == 47) {
                    break;
                }
                if (codePoint == 37) {
                    break;
                }
            }
            index += Character.charCount(codePoint);
        }
        final m m = new m();
        m.t1(s, 0, index);
        j(m, s, index, length, b);
        return m.y4();
    }
    
    private static void j(final m m, final String s, int i, final int n, final boolean b) {
        m j = null;
        while (i < n) {
            final int codePoint = s.codePointAt(i);
            m k = null;
            Label_0220: {
                if (b) {
                    k = j;
                    if (codePoint == 9) {
                        break Label_0220;
                    }
                    k = j;
                    if (codePoint == 10) {
                        break Label_0220;
                    }
                    k = j;
                    if (codePoint == 12) {
                        break Label_0220;
                    }
                    if (codePoint == 13) {
                        k = j;
                        break Label_0220;
                    }
                }
                Label_0128: {
                    if (codePoint >= 32 && codePoint < 127 && " \"<>^`{}|\\?#".indexOf(codePoint) == -1) {
                        if (!b) {
                            if (codePoint == 47) {
                                break Label_0128;
                            }
                            if (codePoint == 37) {
                                break Label_0128;
                            }
                        }
                        m.v1(codePoint);
                        k = j;
                        break Label_0220;
                    }
                }
                m l;
                if ((l = j) == null) {
                    l = new m();
                }
                l.v1(codePoint);
                while (true) {
                    k = l;
                    if (l.D1()) {
                        break;
                    }
                    final int n2 = l.readByte() & 0xFF;
                    m.G0(37);
                    final char[] l2 = r.l;
                    m.G0(l2[n2 >> 4 & 0xF]);
                    m.G0(l2[n2 & 0xF]);
                }
            }
            i += Character.charCount(codePoint);
            j = k;
        }
    }
    
    void a(final String s, final String s2, final boolean b) {
        if (b) {
            this.j.b(s, s2);
        }
        else {
            this.j.a(s, s2);
        }
    }
    
    void b(final String anotherString, final String str) {
        if ("Content-Type".equalsIgnoreCase(anotherString)) {
            try {
                this.g = y.h(str);
                return;
            }
            catch (IllegalArgumentException cause) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Malformed content type: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString(), cause);
            }
        }
        this.f.b(anotherString, str);
    }
    
    void c(final v v) {
        this.f.e(v);
    }
    
    void d(final v v, final f0 f0) {
        this.i.c(v, f0);
    }
    
    void e(final z.c c) {
        this.i.d(c);
    }
    
    void f(String replace, final String str, final boolean b) {
        if (this.c == null) {
            throw new AssertionError();
        }
        final String i = i(str, b);
        final String c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(replace);
        sb.append("}");
        replace = c.replace(sb.toString(), i);
        if (!r.n.matcher(replace).matches()) {
            this.c = replace;
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("@Path parameters shouldn't perform path traversal ('.' or '..'): ");
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    void g(final String s, @h final String s2, final boolean b) {
        final String c = this.c;
        if (c != null) {
            if ((this.d = this.b.I(c)) == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Malformed URL. Base: ");
                sb.append(this.b);
                sb.append(", Relative: ");
                sb.append(this.c);
                throw new IllegalArgumentException(sb.toString());
            }
            this.c = null;
        }
        if (b) {
            this.d.c(s, s2);
        }
        else {
            this.d.g(s, s2);
        }
    }
    
     <T> void h(final Class<T> clazz, @h final T t) {
        this.e.z(clazz, t);
    }
    
    e0.a k() {
        final w.a d = this.d;
        w w;
        if (d != null) {
            w = d.h();
        }
        else {
            w = this.b.W(this.c);
            if (w == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Malformed URL. Base: ");
                sb.append(this.b);
                sb.append(", Relative: ");
                sb.append(this.c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        final f0 k = this.k;
        f0 f0;
        if ((f0 = k) == null) {
            final t.a j = this.j;
            if (j != null) {
                f0 = j.c();
            }
            else {
                final z.a i = this.i;
                if (i != null) {
                    f0 = i.f();
                }
                else {
                    f0 = k;
                    if (this.h) {
                        f0 = okhttp3.f0.h(null, new byte[0]);
                    }
                }
            }
        }
        final y g = this.g;
        f0 f2 = f0;
        if (g != null) {
            if (f0 != null) {
                f2 = new a(f0, g);
            }
            else {
                this.f.b("Content-Type", g.toString());
                f2 = f0;
            }
        }
        return this.e.D(w).o(this.f.i()).p(this.a, f2);
    }
    
    void l(final f0 k) {
        this.k = k;
    }
    
    void m(final Object o) {
        this.c = o.toString();
    }
    
    private static class a extends f0
    {
        private final f0 b;
        private final y c;
        
        a(final f0 b, final y c) {
            this.b = b;
            this.c = c;
        }
        
        @Override
        public long a() throws IOException {
            return this.b.a();
        }
        
        @Override
        public y b() {
            return this.c;
        }
        
        @Override
        public void r(final n n) throws IOException {
            this.b.r(n);
        }
    }
}
