// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language;

import org.apache.commons.codec.h;
import org.apache.commons.codec.k;

@Deprecated
public class d implements k
{
    private final c a;
    
    public d() {
        this.a = new c();
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o instanceof String) {
            return this.b((String)o);
        }
        throw new h("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }
    
    public String b(final String s) {
        return this.a.d(s);
    }
    
    public boolean c(final String s, final String s2) {
        return this.b(s).equals(this.b(s2));
    }
    
    @Override
    public String d(final String s) {
        return this.b(s);
    }
}
