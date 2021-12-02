// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class z extends IllegalStateException
{
    public z(@e final String s) {
        k0.p(s, "message");
        super(s);
    }
}
