// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import androidx.lifecycle.c1;
import java.util.Map;
import androidx.annotation.k0;
import java.util.Collection;

@Deprecated
public class n
{
    @k0
    private final Collection<Fragment> a;
    @k0
    private final Map<String, n> b;
    @k0
    private final Map<String, c1> c;
    
    n(@k0 final Collection<Fragment> a, @k0 final Map<String, n> b, @k0 final Map<String, c1> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @k0
    Map<String, n> a() {
        return this.b;
    }
    
    @k0
    Collection<Fragment> b() {
        return this.a;
    }
    
    @k0
    Map<String, c1> c() {
        return this.c;
    }
    
    boolean d(final Fragment fragment) {
        final Collection<Fragment> a = this.a;
        return a != null && a.contains(fragment);
    }
}
