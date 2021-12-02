// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language;

import org.apache.commons.codec.h;
import org.apache.commons.codec.k;

public abstract class a implements k
{
    @Override
    public Object a(final Object o) throws h {
        if (o instanceof String) {
            return this.d((String)o);
        }
        throw new h("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }
    
    public boolean b(final String s, final String s2) throws h {
        return this.d(s).equals(this.d(s2));
    }
}
