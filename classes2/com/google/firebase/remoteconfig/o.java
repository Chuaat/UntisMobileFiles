// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig;

public class o extends n
{
    private final long G;
    
    public o(final long n) {
        this("Fetch was throttled.", n);
    }
    
    public o(final String s, final long g) {
        super(s);
        this.G = g;
    }
    
    public long a() {
        return this.G;
    }
}
