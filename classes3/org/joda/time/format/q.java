// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import org.joda.time.d0;
import org.joda.time.b0;
import org.joda.time.i0;
import org.joda.time.o0;
import org.joda.time.e0;
import java.util.Locale;

public class q
{
    private final t a;
    private final s b;
    private final Locale c;
    private final e0 d;
    
    public q(final t a, final s b) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
    }
    
    q(final t a, final s b, final Locale c, final e0 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private void a() {
        if (this.b != null) {
            return;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }
    
    private void b(final o0 o0) {
        if (o0 != null) {
            return;
        }
        throw new IllegalArgumentException("Period must not be null");
    }
    
    private void c() {
        if (this.a != null) {
            return;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }
    
    public Locale d() {
        return this.c;
    }
    
    public e0 e() {
        return this.d;
    }
    
    public s f() {
        return this.b;
    }
    
    public t g() {
        return this.a;
    }
    
    public boolean h() {
        return this.b != null;
    }
    
    public boolean i() {
        return this.a != null;
    }
    
    public int j(final i0 i0, final String s, final int n) {
        this.a();
        this.b(i0);
        return this.f().d(i0, s, n, this.c);
    }
    
    public b0 k(final String s) {
        this.a();
        final b0 b0 = new b0(0L, this.d);
        final int d = this.f().d(b0, s, 0, this.c);
        int n;
        if (d >= 0) {
            if ((n = d) >= s.length()) {
                return b0;
            }
        }
        else {
            n = ~d;
        }
        throw new IllegalArgumentException(i.j(s, n));
    }
    
    public d0 l(final String s) {
        this.a();
        return this.k(s).r();
    }
    
    public String m(final o0 o0) {
        this.c();
        this.b(o0);
        final t g = this.g();
        final StringBuffer sb = new StringBuffer(g.c(o0, this.c));
        g.b(sb, o0, this.c);
        return sb.toString();
    }
    
    public void n(final Writer writer, final o0 o0) throws IOException {
        this.c();
        this.b(o0);
        this.g().a(writer, o0, this.c);
    }
    
    public void o(final StringBuffer sb, final o0 o0) {
        this.c();
        this.b(o0);
        this.g().b(sb, o0, this.c);
    }
    
    public q p(final Locale locale) {
        if (locale != this.d() && (locale == null || !locale.equals(this.d()))) {
            return new q(this.a, this.b, locale, this.d);
        }
        return this;
    }
    
    public q q(final e0 e0) {
        if (e0 == this.d) {
            return this;
        }
        return new q(this.a, this.b, this.c, e0);
    }
}
