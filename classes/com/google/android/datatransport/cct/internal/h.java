// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

final class h extends n
{
    private final long b;
    
    h(final long b) {
        this.b = b;
    }
    
    @Override
    public long c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof n) {
            if (this.b != ((n)o).c()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long b = this.b;
        return 0xF4243 ^ (int)(b ^ b >>> 32);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LogResponse{nextRequestWaitMillis=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
