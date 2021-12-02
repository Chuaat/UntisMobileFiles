// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.IOException;

public final class r7<K, V>
{
    static <K, V> int a(final u7<K, V> u7, final K k, final V v) {
        return h6.a(u7.a, 1, k) + h6.a(u7.c, 2, v);
    }
    
    static <K, V> void b(final v5 v5, final u7<K, V> u7, final K k, final V v6) throws IOException {
        h6.f(v5, u7.a, 1, k);
        h6.f(v5, u7.c, 2, v6);
    }
}
