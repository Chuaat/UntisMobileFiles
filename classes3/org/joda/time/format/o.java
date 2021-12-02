// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import org.joda.time.n0;
import java.io.IOException;
import java.util.Locale;
import org.joda.time.i;
import org.joda.time.a;
import java.io.Writer;

class o implements g, n
{
    private final n G;
    
    private o(final n g) {
        this.G = g;
    }
    
    static g a(final n n) {
        if (n instanceof h) {
            return ((h)n).a();
        }
        if (n instanceof g) {
            return (g)n;
        }
        if (n == null) {
            return null;
        }
        return new o(n);
    }
    
    @Override
    public int d() {
        return this.G.d();
    }
    
    @Override
    public void e(final Writer writer, final long n, final a a, final int n2, final i i, final Locale locale) throws IOException {
        this.G.h(writer, n, a, n2, i, locale);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof o && this.G.equals(((o)o).G));
    }
    
    @Override
    public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
        this.G.f(appendable, n0, locale);
    }
    
    @Override
    public void g(final StringBuffer sb, final n0 n0, final Locale locale) {
        try {
            this.G.f(sb, n0, locale);
        }
        catch (IOException ex) {}
    }
    
    @Override
    public void h(final Appendable appendable, final long n, final a a, final int n2, final i i, final Locale locale) throws IOException {
        this.G.h(appendable, n, a, n2, i, locale);
    }
    
    @Override
    public void i(final StringBuffer sb, final long n, final a a, final int n2, final i i, final Locale locale) {
        try {
            this.G.h(sb, n, a, n2, i, locale);
        }
        catch (IOException ex) {}
    }
    
    @Override
    public void j(final Writer writer, final n0 n0, final Locale locale) throws IOException {
        this.G.f(writer, n0, locale);
    }
}
