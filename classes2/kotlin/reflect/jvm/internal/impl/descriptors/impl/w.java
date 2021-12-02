// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.k0;
import java.util.Set;
import org.jetbrains.annotations.e;
import java.util.List;

public final class w implements v
{
    @e
    private final List<x> a;
    @e
    private final Set<x> b;
    @e
    private final List<x> c;
    @e
    private final Set<x> d;
    
    public w(@e final List<x> a, @e final Set<x> b, @e final List<x> c, @e final Set<x> d) {
        k0.p(a, "allDependencies");
        k0.p(b, "modulesWhoseInternalsAreVisible");
        k0.p(c, "directExpectedByDependencies");
        k0.p(d, "allExpectedByDependencies");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @e
    @Override
    public List<x> a() {
        return this.a;
    }
    
    @e
    @Override
    public Set<x> b() {
        return this.b;
    }
    
    @e
    @Override
    public List<x> c() {
        return this.c;
    }
}
