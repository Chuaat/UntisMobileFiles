// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import g7.a;
import org.bson.codecs.configuration.d;
import org.bson.codecs.configuration.b;

public class k implements b
{
    @Override
    public <T> n0<T> b(final Class<T> clazz, final d d) {
        if (a.class.isAssignableFrom(clazz)) {
            return (n0<T>)new j(d);
        }
        return null;
    }
}
