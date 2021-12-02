// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;

public abstract class n extends z
{
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.n L;
    
    public n(@e final b b, @e final kotlin.reflect.jvm.internal.impl.storage.n l, @e final e0 e0) {
        k0.p((Object)b, "fqName");
        k0.p((Object)l, "storageManager");
        k0.p((Object)e0, "module");
        super(e0, b);
        this.L = l;
    }
    
    @e
    public abstract g G0();
    
    public boolean L0(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "name");
        final h x = ((h0)this).x();
        return x instanceof i && ((i)x).s().contains(e);
    }
    
    public abstract void M0(@e final j p0);
}
