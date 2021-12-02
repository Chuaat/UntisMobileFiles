// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import org.joda.time.i;
import org.joda.time.a;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.n0;

class h implements n
{
    private final g G;
    
    private h(final g g) {
        this.G = g;
    }
    
    static n b(final g g) {
        if (g instanceof o) {
            return (n)g;
        }
        if (g == null) {
            return null;
        }
        return new h(g);
    }
    
    g a() {
        return this.G;
    }
    
    @Override
    public int d() {
        return this.G.d();
    }
    
    @Override
    public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
        if (appendable instanceof StringBuffer) {
            this.G.g((StringBuffer)appendable, n0, locale);
        }
        else if (appendable instanceof Writer) {
            this.G.j((Writer)appendable, n0, locale);
        }
        else {
            final StringBuffer sb = new StringBuffer(this.d());
            this.G.g(sb, n0, locale);
            appendable.append(sb);
        }
    }
    
    @Override
    public void h(final Appendable appendable, final long n, final a a, final int n2, final i i, final Locale locale) throws IOException {
        if (appendable instanceof StringBuffer) {
            this.G.i((StringBuffer)appendable, n, a, n2, i, locale);
        }
        else if (appendable instanceof Writer) {
            this.G.e((Writer)appendable, n, a, n2, i, locale);
        }
        else {
            final StringBuffer sb = new StringBuffer(this.d());
            this.G.i(sb, n, a, n2, i, locale);
            appendable.append(sb);
        }
    }
}
