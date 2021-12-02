// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h$c;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public final class m extends z
{
    public m(@e final e0 e0, @e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p(e0, "module");
        k0.p(b, "fqName");
        super(e0, b);
    }
    
    @e
    public h$c G0() {
        return h$c.b;
    }
}
