// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public class h extends RuntimeException
{
    private static final long H = -4415279469780082174L;
    private Integer G;
    
    public h(final int i, final String message) {
        super(message);
        this.G = null;
        this.G = i;
    }
    
    public h(final int i, final String message, final Throwable cause) {
        super(message, cause);
        this.G = null;
        this.G = i;
    }
    
    public h(final String message) {
        super(message);
        this.G = null;
    }
    
    public h(final String message, final Throwable cause) {
        super(message, cause);
        this.G = null;
    }
    
    public Integer a() {
        return this.G;
    }
    
    public boolean b() {
        return this.G != null;
    }
}
