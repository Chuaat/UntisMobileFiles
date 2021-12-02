// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import com.google.android.datatransport.h;
import com.google.android.datatransport.g;
import com.google.android.datatransport.c;
import java.util.Set;
import com.google.android.datatransport.i;

final class p implements i
{
    private final Set<c> a;
    private final o b;
    private final s c;
    
    p(final Set<c> a, final o b, final s c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public <T> h<T> a(final String s, final Class<T> clazz, final g<T, byte[]> g) {
        return this.b(s, clazz, com.google.android.datatransport.c.b("proto"), g);
    }
    
    @Override
    public <T> h<T> b(final String s, final Class<T> clazz, final c c, final g<T, byte[]> g) {
        if (this.a.contains(c)) {
            return new r<T>(this.b, s, c, g, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c, this.a));
    }
}
