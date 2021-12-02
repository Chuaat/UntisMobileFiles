// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.billing;

public class b extends Exception
{
    d G;
    
    public b(final int n, final String s) {
        this(new d(n, s));
    }
    
    public b(final int n, final String s, final Exception ex) {
        this(new d(n, s), ex);
    }
    
    public b(final d d) {
        this(d, null);
    }
    
    public b(final d g, final Exception cause) {
        super(g.a(), cause);
        this.G = g;
    }
    
    public d a() {
        return this.G;
    }
}
