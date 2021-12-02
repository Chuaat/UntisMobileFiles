// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.model.i;
import kotlin.reflect.jvm.internal.impl.types.d;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.j1;
import org.jetbrains.annotations.e;

public final class r
{
    @e
    public static final r a;
    
    static {
        a = new r();
    }
    
    private r() {
    }
    
    public final boolean a(@e final j1 j1, @e final j1 j2) {
        k0.p((Object)j1, "a");
        k0.p((Object)j2, "b");
        return d.a.b(q.a, j1, j2);
    }
}
