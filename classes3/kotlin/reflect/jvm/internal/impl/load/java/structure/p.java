// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.jvm.internal.k0;
import java.util.List;
import kotlin.collections.v;

public final class p
{
    private static final boolean a(final r r) {
        final a0 a0 = (a0)v.X4((List)r.m());
        j j = null;
        x a2;
        if (a0 == null) {
            a2 = null;
        }
        else {
            a2 = a0.a();
        }
        if (a2 instanceof j) {
            j = (j)a2;
        }
        final boolean b = false;
        if (j == null) {
            return false;
        }
        final i b2 = j.b();
        boolean b3 = b;
        if (b2 instanceof g) {
            final b f = ((g)b2).f();
            b3 = b;
            if (f != null) {
                b3 = b;
                if (k0.g((Object)f.b(), (Object)"java.lang.Object")) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    private static final boolean b(final r r) {
        final String d = r.getName().d();
        final int hashCode = d.hashCode();
        if (hashCode != -1776922004) {
            if (hashCode != -1295482945) {
                if (hashCode == 147696667) {
                    if (d.equals("hashCode")) {
                        return r.m().isEmpty();
                    }
                }
            }
            else if (d.equals("equals")) {
                return a(r);
            }
        }
        else if (d.equals("toString")) {
            return r.m().isEmpty();
        }
        return false;
        b = r.m().isEmpty();
        return b;
    }
    
    public static final boolean c(@e final q q) {
        k0.p((Object)q, "<this>");
        return q.O().G() && q instanceof r && b((r)q);
    }
}
