// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import java.util.List;
import x5.c;

public enum o implements c<List, Object, List>
{
    G;
    
    public static <T> c<List<T>, T, List<T>> f() {
        return (c<List<T>, T, List<T>>)o.G;
    }
    
    public List d(final List list, final Object o) throws Exception {
        list.add(o);
        return list;
    }
}
