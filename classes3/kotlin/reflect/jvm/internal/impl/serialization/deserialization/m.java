// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;

public final class m implements g
{
    @e
    private final i0 a;
    
    public m(@e final i0 a) {
        k0.p((Object)a, "packageFragmentProvider");
        this.a = a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public f a(@e final a a) {
        k0.p((Object)a, "classId");
        final i0 a2 = this.a;
        final b h = a.h();
        k0.o((Object)h, "classId.packageFqName");
        for (final h0 h2 : kotlin.reflect.jvm.internal.impl.descriptors.k0.b(a2, h)) {
            if (!(h2 instanceof n)) {
                continue;
            }
            final f a3 = ((n)h2).G0().a(a);
            if (a3 == null) {
                continue;
            }
            return a3;
        }
        return null;
    }
}
