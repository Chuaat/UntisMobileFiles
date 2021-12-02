// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.util;

import androidx.annotation.j0;
import java.util.Iterator;
import java.util.HashMap;
import com.google.android.datatransport.e;
import android.util.SparseArray;

public final class a
{
    private static SparseArray<e> a;
    private static HashMap<e, Integer> b;
    
    static {
        com.google.android.datatransport.runtime.util.a.a = (SparseArray<e>)new SparseArray();
        (com.google.android.datatransport.runtime.util.a.b = new HashMap<e, Integer>()).put(e.G, 0);
        com.google.android.datatransport.runtime.util.a.b.put(e.H, 1);
        com.google.android.datatransport.runtime.util.a.b.put(e.I, 2);
        for (final e key : com.google.android.datatransport.runtime.util.a.b.keySet()) {
            com.google.android.datatransport.runtime.util.a.a.append((int)com.google.android.datatransport.runtime.util.a.b.get(key), (Object)key);
        }
    }
    
    public static int a(@j0 final e e) {
        final Integer n = com.google.android.datatransport.runtime.util.a.b.get(e);
        if (n != null) {
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("PriorityMapping is missing known Priority value ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }
    
    @j0
    public static e b(final int i) {
        final e e = (e)com.google.android.datatransport.runtime.util.a.a.get(i);
        if (e != null) {
            return e;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown Priority for value ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
