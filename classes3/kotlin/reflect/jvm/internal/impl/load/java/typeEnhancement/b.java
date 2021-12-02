// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.collections.v;
import java.util.Iterator;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

final class b implements g
{
    @e
    private final kotlin.reflect.jvm.internal.impl.name.b G;
    
    public b(@e final kotlin.reflect.jvm.internal.impl.name.b g) {
        k0.p((Object)g, "fqNameToMatch");
        this.G = g;
    }
    
    public boolean B4(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        return g$b.b((g)this, b);
    }
    
    @f
    public a b(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p((Object)b, "fqName");
        a a;
        if (k0.g((Object)b, (Object)this.G)) {
            a = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public boolean isEmpty() {
        return false;
    }
    
    @e
    public Iterator<c> iterator() {
        return v.E().iterator();
    }
}
