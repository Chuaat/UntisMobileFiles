// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import java.util.ArrayList;
import x5.o;
import java.util.List;
import java.util.concurrent.Callable;

public enum b implements Callable<List<Object>>, o<Object, List<Object>>
{
    G;
    
    public static <T> Callable<List<T>> d() {
        return (Callable<List<T>>)b.G;
    }
    
    public static <T, O> o<O, List<T>> f() {
        return (o<O, List<T>>)b.G;
    }
    
    public List<Object> b(final Object o) throws Exception {
        return new ArrayList<Object>();
    }
    
    public List<Object> g() throws Exception {
        return new ArrayList<Object>();
    }
}
