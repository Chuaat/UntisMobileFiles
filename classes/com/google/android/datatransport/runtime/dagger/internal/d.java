// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public final class d
{
    private static final int a = 1073741824;
    
    private d() {
    }
    
    private static int a(final int n) {
        if (n < 3) {
            return n + 1;
        }
        if (n < 1073741824) {
            return (int)(n / 0.75f + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
    
    public static boolean b(final List<?> c) {
        final int size = c.size();
        boolean b = false;
        if (size < 2) {
            return false;
        }
        if (c.size() != new HashSet(c).size()) {
            b = true;
        }
        return b;
    }
    
    static <T> HashSet<T> c(final int n) {
        return new HashSet<T>(a(n));
    }
    
    public static <K, V> LinkedHashMap<K, V> d(final int n) {
        return new LinkedHashMap<K, V>(a(n));
    }
    
    public static <T> List<T> e(final int initialCapacity) {
        if (initialCapacity == 0) {
            return Collections.emptyList();
        }
        return new ArrayList<T>(initialCapacity);
    }
}
