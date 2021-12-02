// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;

public final class h implements g
{
    @e
    private final List<c> G;
    
    public h(@e final List<? extends c> g) {
        k0.p(g, "annotations");
        this.G = (List<c>)g;
    }
    
    @Override
    public boolean B4(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        return g.b.b(this, b);
    }
    
    @f
    @Override
    public c a0(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        return g.b.a(this, b);
    }
    
    @Override
    public boolean isEmpty() {
        return this.G.isEmpty();
    }
    
    @e
    @Override
    public Iterator<c> iterator() {
        return this.G.iterator();
    }
    
    @e
    @Override
    public String toString() {
        return this.G.toString();
    }
}
