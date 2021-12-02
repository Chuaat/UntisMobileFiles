// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import org.jetbrains.annotations.e;

public final class z
{
    @e
    public static final u a(@e final y y, @f final kotlin.reflect.jvm.internal.impl.metadata.a.x x) {
        k0.p((Object)y, "<this>");
        int n;
        if (x == null) {
            n = -1;
        }
        else {
            n = a.c[x.ordinal()];
        }
        String s = "PRIVATE";
        u u = null;
        switch (n) {
            case 6: {
                u = t.f;
                s = "LOCAL";
                break;
            }
            case 5: {
                u = t.e;
                s = "PUBLIC";
                break;
            }
            case 4: {
                u = t.c;
                s = "PROTECTED";
                break;
            }
            case 3: {
                u = t.b;
                s = "PRIVATE_TO_THIS";
                break;
            }
            default:
            case 2: {
                u = t.a;
                break;
            }
            case 1: {
                u = t.d;
                s = "INTERNAL";
                break;
            }
        }
        k0.o((Object)u, s);
        return u;
    }
    
    @e
    public static final b$a b(@e final y y, @f final kotlin.reflect.jvm.internal.impl.metadata.a.j j) {
        k0.p((Object)y, "<this>");
        int n;
        if (j == null) {
            n = -1;
        }
        else {
            n = a.a[j.ordinal()];
        }
        if (n != 1) {
            if (n == 2) {
                return b$a.H;
            }
            if (n == 3) {
                return b$a.I;
            }
            if (n == 4) {
                return b$a.J;
            }
        }
        return b$a.G;
    }
}
