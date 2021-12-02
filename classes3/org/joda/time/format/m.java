// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

class m implements d, l
{
    private final l G;
    
    private m(final l g) {
        this.G = g;
    }
    
    static d a(final l l) {
        if (l instanceof f) {
            return ((f)l).a();
        }
        if (l instanceof d) {
            return (d)l;
        }
        if (l == null) {
            return null;
        }
        return new m(l);
    }
    
    @Override
    public int b() {
        return this.G.b();
    }
    
    @Override
    public int c(final e e, final String s, final int n) {
        return this.G.g(e, s, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof m && this.G.equals(((m)o).G));
    }
    
    @Override
    public int g(final e e, final CharSequence charSequence, final int n) {
        return this.G.g(e, charSequence, n);
    }
}
