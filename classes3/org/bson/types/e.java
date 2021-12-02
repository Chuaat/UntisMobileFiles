// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.types;

import org.bson.i;

public class e extends d
{
    private static final long J = -6284832275113680002L;
    private final i I;
    
    public e(final String s, final i i) {
        super(s);
        this.I = i;
    }
    
    public i b() {
        return this.I;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final e e = (e)o;
        boolean b2 = b;
        if (this.a().equals(e.a())) {
            b2 = b;
            if (this.I.equals(e.I)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        return this.a().hashCode() ^ this.I.hashCode();
    }
}
