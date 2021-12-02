// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

public class v extends RuntimeException
{
    private static final long G = -6722022620020198727L;
    
    public v() {
    }
    
    public v(final String message) {
        super(message);
    }
    
    public v(final String format, final Object... args) {
        super(String.format(format, args));
    }
    
    public v(final Throwable cause) {
        super(cause);
    }
}
