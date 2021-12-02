// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

public class h extends o
{
    private j G;
    
    public h(final String s) {
        super(s);
    }
    
    public h(final j g) {
        final StringBuffer sb = new StringBuffer();
        sb.append("Missing argument for option: ");
        sb.append(g.l());
        this(sb.toString());
        this.G = g;
    }
    
    public j a() {
        return this.G;
    }
}
