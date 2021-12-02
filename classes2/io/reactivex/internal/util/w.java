// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import x5.o;

public final class w<T> implements o<List<T>, List<T>>
{
    final Comparator<? super T> G;
    
    public w(final Comparator<? super T> g) {
        this.G = g;
    }
    
    public List<T> a(final List<T> list) throws Exception {
        Collections.sort(list, this.G);
        return list;
    }
}
