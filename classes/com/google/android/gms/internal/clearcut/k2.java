// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public final class k2<K, V>
{
    static <K, V> int a(final l2<K, V> l2, final K k, final V v) {
        return a1.f(l2.a, 1, k) + a1.f(l2.c, 2, v);
    }
    
    static <K, V> void b(final p0 p4, final l2<K, V> l2, final K k, final V v) throws IOException {
        a1.h(p4, l2.a, 1, k);
        a1.h(p4, l2.c, 2, v);
    }
}
