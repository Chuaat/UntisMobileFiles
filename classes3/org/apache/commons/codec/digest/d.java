// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.digest;

public enum d
{
    H("HmacMD5"), 
    I("HmacSHA1"), 
    J("HmacSHA224"), 
    K("HmacSHA256"), 
    L("HmacSHA384"), 
    M("HmacSHA512");
    
    private final String G;
    
    private d(final String g) {
        this.G = g;
    }
    
    public String b() {
        return this.G;
    }
    
    @Override
    public String toString() {
        return this.G;
    }
}
