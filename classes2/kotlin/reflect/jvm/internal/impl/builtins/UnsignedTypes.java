// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import org.jetbrains.annotations.f;
import m6.k;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.LinkedHashSet;
import kotlin.collections.y0;
import kotlin.n1;
import kotlin.s0;
import kotlin.collections.v;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.name.a;
import java.util.HashMap;
import java.util.Set;
import org.jetbrains.annotations.e;

public final class UnsignedTypes
{
    @e
    public static final UnsignedTypes INSTANCE;
    @e
    private static final Set<kotlin.reflect.jvm.internal.impl.name.e> a;
    @e
    private static final Set<kotlin.reflect.jvm.internal.impl.name.e> b;
    @e
    private static final HashMap<a, a> c;
    @e
    private static final HashMap<a, a> d;
    @e
    private static final HashMap<UnsignedArrayType, kotlin.reflect.jvm.internal.impl.name.e> e;
    @e
    private static final Set<kotlin.reflect.jvm.internal.impl.name.e> f;
    
    static {
        INSTANCE = new UnsignedTypes();
        final UnsignedType[] values = UnsignedType.values();
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>(values.length);
        final int length = values.length;
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            list.add(values[i].getTypeName());
        }
        a = v.N5((Iterable<? extends kotlin.reflect.jvm.internal.impl.name.e>)list);
        final UnsignedArrayType[] values2 = UnsignedArrayType.values();
        final ArrayList list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>(values2.length);
        for (int length2 = values2.length, j = 0; j < length2; ++j) {
            list2.add(values2[j].getTypeName());
        }
        b = v.N5((Iterable<? extends kotlin.reflect.jvm.internal.impl.name.e>)list2);
        c = new HashMap<a, a>();
        d = new HashMap<a, a>();
        e = y0.M(n1.a(UnsignedArrayType.UBYTEARRAY, kotlin.reflect.jvm.internal.impl.name.e.i("ubyteArrayOf")), n1.a(UnsignedArrayType.USHORTARRAY, kotlin.reflect.jvm.internal.impl.name.e.i("ushortArrayOf")), n1.a(UnsignedArrayType.UINTARRAY, kotlin.reflect.jvm.internal.impl.name.e.i("uintArrayOf")), n1.a(UnsignedArrayType.ULONGARRAY, kotlin.reflect.jvm.internal.impl.name.e.i("ulongArrayOf")));
        final UnsignedType[] values3 = UnsignedType.values();
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e> f2 = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.e>();
        for (int length3 = values3.length, k = 0; k < length3; ++k) {
            f2.add(values3[k].getArrayClassId().j());
        }
        f = f2;
        final UnsignedType[] values4 = UnsignedType.values();
        final int length4 = values4.length;
        int l = n;
        while (l < length4) {
            final UnsignedType unsignedType = values4[l];
            ++l;
            UnsignedTypes.c.put(unsignedType.getArrayClassId(), unsignedType.getClassId());
            UnsignedTypes.d.put(unsignedType.getClassId(), unsignedType.getArrayClassId());
        }
    }
    
    private UnsignedTypes() {
    }
    
    @k
    public static final boolean isUnsignedType(@e final c0 c0) {
        k0.p(c0, "type");
        if (f1.v(c0)) {
            return false;
        }
        final h c2 = c0.N0().c();
        return c2 != null && UnsignedTypes.INSTANCE.isUnsignedClass(c2);
    }
    
    @f
    public final a getUnsignedClassIdByArrayClassId(@e final a key) {
        k0.p(key, "arrayClassId");
        return UnsignedTypes.c.get(key);
    }
    
    public final boolean isShortNameOfUnsignedArray(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p(e, "name");
        return UnsignedTypes.f.contains(e);
    }
    
    public final boolean isUnsignedClass(@e final m m) {
        k0.p(m, "descriptor");
        final m c = m.c();
        return c instanceof h0 && k0.g(((h0)c).f(), StandardNames.BUILT_INS_PACKAGE_FQ_NAME) && UnsignedTypes.a.contains(m.getName());
    }
}
