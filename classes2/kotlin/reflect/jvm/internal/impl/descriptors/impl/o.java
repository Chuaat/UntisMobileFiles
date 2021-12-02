// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.b;

public final class o extends b implements w
{
    @e
    private final q0 H;
    
    public o(@e final g g, @e final q0 h) {
        k0.p(g, "annotations");
        k0.p(h, "correspondingProperty");
        super(g);
        this.H = h;
    }
}
