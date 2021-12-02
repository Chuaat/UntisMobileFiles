// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;

public class c1
{
    private final HashMap<String, w0> a;
    
    public c1() {
        this.a = new HashMap<String, w0>();
    }
    
    public final void a() {
        final Iterator<w0> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().clear();
        }
        this.a.clear();
    }
    
    final w0 b(final String key) {
        return this.a.get(key);
    }
    
    Set<String> c() {
        return new HashSet<String>(this.a.keySet());
    }
    
    final void d(final String key, final w0 value) {
        final w0 w0 = this.a.put(key, value);
        if (w0 != null) {
            w0.onCleared();
        }
    }
}
