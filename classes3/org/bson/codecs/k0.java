// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import e7.a;
import org.bson.g0;
import org.bson.p0;
import org.bson.z0;

public class k0 implements n0<Character>
{
    public Character e(final p0 p2, final s0 s0) {
        final String u = p2.U();
        if (u.length() == 1) {
            return u.charAt(0);
        }
        throw new g0(String.format("Attempting to decode the string '%s' to a character, but its length is not equal to one", u));
    }
    
    @Override
    public Class<Character> g() {
        return Character.class;
    }
    
    public void h(final z0 z0, final Character c, final x0 x0) {
        a.e("value", c);
        z0.i(c.toString());
    }
}
