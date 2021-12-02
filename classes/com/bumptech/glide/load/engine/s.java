// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import androidx.annotation.b1;
import java.util.Collections;
import java.util.HashMap;
import com.bumptech.glide.load.g;
import java.util.Map;

final class s
{
    private final Map<g, l<?>> a;
    private final Map<g, l<?>> b;
    
    s() {
        this.a = new HashMap<g, l<?>>();
        this.b = new HashMap<g, l<?>>();
    }
    
    private Map<g, l<?>> c(final boolean b) {
        Map<g, l<?>> map;
        if (b) {
            map = this.b;
        }
        else {
            map = this.a;
        }
        return map;
    }
    
    l<?> a(final g g, final boolean b) {
        return this.c(b).get(g);
    }
    
    @b1
    Map<g, l<?>> b() {
        return Collections.unmodifiableMap((Map<? extends g, ? extends l<?>>)this.a);
    }
    
    void d(final g g, final l<?> l) {
        this.c(l.q()).put(g, l);
    }
    
    void e(final g g, final l<?> l) {
        final Map<g, l<?>> c = this.c(l.q());
        if (l.equals(c.get(g))) {
            c.remove(g);
        }
    }
}
