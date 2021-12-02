// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public class u0 extends y0
{
    private final String a;
    
    public u0(final String a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("Value can not be null");
    }
    
    public String X0() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((u0)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public w0 t0() {
        return w0.V;
    }
    
    @Override
    public String toString() {
        return this.a;
    }
}
