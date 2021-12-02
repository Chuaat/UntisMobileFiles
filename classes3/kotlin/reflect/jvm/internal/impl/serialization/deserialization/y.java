// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.h0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import org.jetbrains.annotations.e;

public final class y
{
    @e
    public static final y a;
    
    static {
        a = new y();
    }
    
    private y() {
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.descriptors.f a(@f final kotlin.reflect.jvm.internal.impl.metadata.a.c.c c) {
        int n;
        if (c == null) {
            n = -1;
        }
        else {
            n = y.a.d[c.ordinal()];
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f f = null;
        switch (n) {
            case 6:
            case 7: {
                f = kotlin.reflect.jvm.internal.impl.descriptors.f.L;
                break;
            }
            case 5: {
                f = kotlin.reflect.jvm.internal.impl.descriptors.f.K;
                break;
            }
            case 4: {
                f = kotlin.reflect.jvm.internal.impl.descriptors.f.J;
                break;
            }
            case 3: {
                f = kotlin.reflect.jvm.internal.impl.descriptors.f.I;
                break;
            }
            case 2: {
                f = kotlin.reflect.jvm.internal.impl.descriptors.f.H;
                break;
            }
            default:
            case 1: {
                f = kotlin.reflect.jvm.internal.impl.descriptors.f.G;
                break;
            }
        }
        return f;
    }
    
    @e
    public final b0 b(@f final kotlin.reflect.jvm.internal.impl.metadata.a.k k) {
        int n;
        if (k == null) {
            n = -1;
        }
        else {
            n = y.a.a[k.ordinal()];
        }
        if (n != 1) {
            if (n == 2) {
                return b0.J;
            }
            if (n == 3) {
                return b0.K;
            }
            if (n == 4) {
                return b0.I;
            }
        }
        return b0.H;
    }
    
    @e
    public final k1 c(@e final kotlin.reflect.jvm.internal.impl.metadata.a.q.b.c c) {
        k0.p((Object)c, "projection");
        final int n = y.a.g[c.ordinal()];
        k1 k1;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        throw new h0();
                    }
                    throw new IllegalArgumentException(k0.C("Only IN, OUT and INV are supported. Actual argument: ", (Object)c));
                }
                else {
                    k1 = kotlin.reflect.jvm.internal.impl.types.k1.K;
                }
            }
            else {
                k1 = kotlin.reflect.jvm.internal.impl.types.k1.M;
            }
        }
        else {
            k1 = kotlin.reflect.jvm.internal.impl.types.k1.L;
        }
        return k1;
    }
    
    @e
    public final k1 d(@e final kotlin.reflect.jvm.internal.impl.metadata.a.s.c c) {
        k0.p((Object)c, "variance");
        final int n = y.a.f[c.ordinal()];
        k1 k1;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                k1 = kotlin.reflect.jvm.internal.impl.types.k1.K;
            }
            else {
                k1 = kotlin.reflect.jvm.internal.impl.types.k1.M;
            }
        }
        else {
            k1 = kotlin.reflect.jvm.internal.impl.types.k1.L;
        }
        return k1;
    }
}
