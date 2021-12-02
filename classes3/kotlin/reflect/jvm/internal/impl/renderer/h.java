// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.collections.j1;
import kotlin.reflect.jvm.internal.impl.name.b;
import java.util.Set;
import org.jetbrains.annotations.e;

public final class h
{
    @e
    public static final h a;
    @e
    private static final Set<b> b;
    
    static {
        a = new h();
        b = j1.u((Object[])new b[] { new b("kotlin.internal.NoInfer"), new b("kotlin.internal.Exact") });
    }
    
    private h() {
    }
    
    @e
    public final Set<b> a() {
        return h.b;
    }
}
