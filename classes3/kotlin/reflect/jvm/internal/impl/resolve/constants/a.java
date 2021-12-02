// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;

public final class a extends g<c>
{
    public a(@e final c c) {
        k0.p((Object)c, "value");
        super(c);
    }
    
    @e
    @Override
    public c0 a(@e final e0 e0) {
        k0.p((Object)e0, "module");
        return this.b().a();
    }
}
