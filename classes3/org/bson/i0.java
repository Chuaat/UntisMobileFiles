// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public class i0 extends y0
{
    private final String a;
    private final y b;
    
    public i0(final String a, final y b) {
        if (a == null) {
            throw new IllegalArgumentException("code can not be null");
        }
        if (b != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("scope can not be null");
    }
    
    static i0 X0(final i0 i0) {
        return new i0(i0.a, i0.b.Z0());
    }
    
    public String Y0() {
        return this.a;
    }
    
    public y Z0() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final i0 i0 = (i0)o;
            return this.a.equals(i0.a) && this.b.equals(i0.b);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @Override
    public w0 t0() {
        return w0.W;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonJavaScriptWithScope{code=");
        sb.append(this.Y0());
        sb.append("scope=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
