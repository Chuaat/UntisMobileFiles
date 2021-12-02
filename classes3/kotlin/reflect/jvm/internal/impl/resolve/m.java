// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;

public final class m
{
    @e
    private static final d0<l> a;
    
    static {
        a = new d0("ResolutionAnchorProvider");
    }
    
    @f
    public static final e0 a(@e e0 a) {
        k0.p((Object)a, "<this>");
        final l l = (l)a.I0((d0)m.a);
        if (l == null) {
            a = null;
        }
        else {
            a = l.a(a);
        }
        return a;
    }
}
