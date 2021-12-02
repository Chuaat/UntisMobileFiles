// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.types;

import org.bson.d1;

public class f extends d
{
    private static final long J = -6284832275113680002L;
    private final d1 I;
    
    public f(final String s, final d1 i) {
        super(s);
        this.I = i;
    }
    
    public d1 b() {
        return this.I;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final f f = (f)o;
        final d1 i = this.I;
        final d1 j = f.I;
        if (i != null) {
            if (i.equals(j)) {
                return true;
            }
        }
        else if (j == null) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.a().hashCode() ^ this.I.hashCode();
    }
}
