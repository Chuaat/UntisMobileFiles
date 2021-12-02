// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

final class i extends o
{
    @e
    private final g I;
    
    public i(@e final k0 k0, @e final g i) {
        kotlin.jvm.internal.k0.p((Object)k0, "delegate");
        kotlin.jvm.internal.k0.p((Object)i, "annotations");
        super(k0);
        this.I = i;
    }
    
    @e
    public i a1(@e final k0 k0) {
        kotlin.jvm.internal.k0.p((Object)k0, "delegate");
        return new i(k0, this.getAnnotations());
    }
    
    @e
    @Override
    public g getAnnotations() {
        return this.I;
    }
}
