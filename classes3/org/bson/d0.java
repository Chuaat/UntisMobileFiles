// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public class d0
{
    private final String a;
    private final y0 b;
    
    public d0(final String a, final y0 b) {
        this.a = a;
        this.b = b;
    }
    
    public String a() {
        return this.a;
    }
    
    public y0 b() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final d0 d0 = (d0)o;
            Label_0063: {
                if (this.a() != null) {
                    if (this.a().equals(d0.a())) {
                        break Label_0063;
                    }
                }
                else if (d0.a() == null) {
                    break Label_0063;
                }
                return false;
            }
            if (this.b() != null) {
                if (this.b().equals(d0.b())) {
                    return true;
                }
            }
            else if (d0.b() == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String a = this.a();
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = this.a().hashCode();
        }
        else {
            hashCode2 = 0;
        }
        if (this.b() != null) {
            hashCode = this.b().hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
}
