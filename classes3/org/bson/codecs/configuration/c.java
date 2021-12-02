// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.configuration;

import java.util.Iterator;
import java.util.ArrayList;
import org.bson.internal.i;
import java.util.Arrays;
import org.bson.codecs.n0;
import java.util.List;

public final class c
{
    private c() {
    }
    
    public static d a(final List<? extends n0<?>> list) {
        return d(new e(list));
    }
    
    public static d b(final n0<?>... a) {
        return a(Arrays.asList(a));
    }
    
    public static d c(final List<? extends b> list) {
        return new i(list);
    }
    
    public static d d(final b... a) {
        return c(Arrays.asList(a));
    }
    
    public static d e(final List<? extends d> list) {
        final ArrayList<b> list2 = new ArrayList<b>();
        final Iterator<? extends d> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(g((d)iterator.next()));
        }
        return new i(list2);
    }
    
    public static d f(final d... a) {
        return e(Arrays.asList(a));
    }
    
    private static b g(final d d) {
        if (d instanceof b) {
            return (b)d;
        }
        return new b() {
            @Override
            public <T> n0<T> b(final Class<T> clazz, final d d) {
                try {
                    return d.a(clazz);
                }
                catch (a a) {
                    return null;
                }
            }
        };
    }
}
