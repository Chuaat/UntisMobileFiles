// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

public class a extends o
{
    private l G;
    private j H;
    
    public a(final String s) {
        super(s);
    }
    
    public a(final l g, final j h) {
        final StringBuffer sb = new StringBuffer();
        sb.append("The option '");
        sb.append(h.l());
        sb.append("' was specified but an option from this group ");
        sb.append("has already been selected: '");
        sb.append(g.d());
        sb.append("'");
        this(sb.toString());
        this.G = g;
        this.H = h;
    }
    
    public j a() {
        return this.H;
    }
    
    public l b() {
        return this.G;
    }
}
