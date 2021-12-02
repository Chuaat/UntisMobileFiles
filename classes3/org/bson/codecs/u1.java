// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import java.util.UUID;
import org.bson.codecs.configuration.d;
import org.bson.q1;
import org.bson.codecs.configuration.b;

public class u1 implements b
{
    private q1 a;
    
    public u1(final q1 a) {
        this.a = a;
    }
    
    @Override
    public <T> n0<T> b(final Class<T> clazz, final d d) {
        if (clazz == UUID.class) {
            return (n0<T>)new s1(this.a);
        }
        return null;
    }
}
