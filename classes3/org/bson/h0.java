// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public class h0 extends y0
{
    private final String a;
    
    public h0(final String a) {
        this.a = a;
    }
    
    public String X0() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((h0)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public w0 t0() {
        return w0.U;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonJavaScript{code='");
        sb.append(this.a);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
