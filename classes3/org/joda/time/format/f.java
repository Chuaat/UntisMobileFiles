// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

class f implements l
{
    private final d G;
    
    private f(final d g) {
        this.G = g;
    }
    
    static l c(final d d) {
        if (d instanceof m) {
            return (l)d;
        }
        if (d == null) {
            return null;
        }
        return new f(d);
    }
    
    d a() {
        return this.G;
    }
    
    @Override
    public int b() {
        return this.G.b();
    }
    
    @Override
    public int g(final e e, final CharSequence charSequence, final int n) {
        return this.G.c(e, charSequence.toString(), n);
    }
}
