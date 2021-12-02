// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import org.jetbrains.annotations.f;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import n6.l;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import java.util.List;
import org.jetbrains.annotations.e;

public final class h
{
    @e
    public static final h a;
    
    static {
        a = new h();
    }
    
    private h() {
    }
    
    private final b a(final List<?> list, final PrimitiveType primitiveType) {
        final List i5 = v.I5((Iterable)list);
        final ArrayList<g<?>> list2 = new ArrayList<g<?>>();
        final Iterator<Object> iterator = i5.iterator();
        while (iterator.hasNext()) {
            final g<?> c = this.c(iterator.next());
            if (c != null) {
                list2.add(c);
            }
        }
        return new b(list2, (l<? super e0, ? extends c0>)new l<e0, c0>() {
            @e
            public final c0 a(@e final e0 e0) {
                k0.p((Object)e0, "module");
                final kotlin.reflect.jvm.internal.impl.types.k0 primitiveArrayKotlinType = e0.w().getPrimitiveArrayKotlinType(primitiveType);
                k0.o((Object)primitiveArrayKotlinType, "module.builtIns.getPrimitiveArrayKotlinType(componentType)");
                return primitiveArrayKotlinType;
            }
        });
    }
    
    @e
    public final b b(@e final List<? extends g<?>> list, @e final c0 c0) {
        k0.p((Object)list, "value");
        k0.p((Object)c0, "type");
        return new b(list, (l<? super e0, ? extends c0>)new l<e0, c0>() {
            @e
            public final c0 a(@e final e0 e0) {
                k0.p((Object)e0, "it");
                return c0;
            }
        });
    }
    
    @f
    public final g<?> c(@f final Object o) {
        Object a;
        if (o instanceof Byte) {
            a = new d(((Number)o).byteValue());
        }
        else if (o instanceof Short) {
            a = new u(((Number)o).shortValue());
        }
        else if (o instanceof Integer) {
            a = new m(((Number)o).intValue());
        }
        else if (o instanceof Long) {
            a = new r(((Number)o).longValue());
        }
        else if (o instanceof Character) {
            a = new kotlin.reflect.jvm.internal.impl.resolve.constants.e((char)o);
        }
        else if (o instanceof Float) {
            a = new kotlin.reflect.jvm.internal.impl.resolve.constants.l(((Number)o).floatValue());
        }
        else if (o instanceof Double) {
            a = new i(((Number)o).doubleValue());
        }
        else if (o instanceof Boolean) {
            a = new c((boolean)o);
        }
        else if (o instanceof String) {
            a = new kotlin.reflect.jvm.internal.impl.resolve.constants.v((String)o);
        }
        else {
            List list;
            PrimitiveType primitiveType;
            if (o instanceof byte[]) {
                list = kotlin.collections.m.Yx((byte[])o);
                primitiveType = PrimitiveType.BYTE;
            }
            else if (o instanceof short[]) {
                list = kotlin.collections.m.fy((short[])o);
                primitiveType = PrimitiveType.SHORT;
            }
            else if (o instanceof int[]) {
                list = kotlin.collections.m.cy((int[])o);
                primitiveType = PrimitiveType.INT;
            }
            else if (o instanceof long[]) {
                list = kotlin.collections.m.dy((long[])o);
                primitiveType = PrimitiveType.LONG;
            }
            else if (o instanceof char[]) {
                list = kotlin.collections.m.Zx((char[])o);
                primitiveType = PrimitiveType.CHAR;
            }
            else if (o instanceof float[]) {
                list = kotlin.collections.m.by((float[])o);
                primitiveType = PrimitiveType.FLOAT;
            }
            else if (o instanceof double[]) {
                list = kotlin.collections.m.ay((double[])o);
                primitiveType = PrimitiveType.DOUBLE;
            }
            else if (o instanceof boolean[]) {
                list = kotlin.collections.m.gy((boolean[])o);
                primitiveType = PrimitiveType.BOOLEAN;
            }
            else {
                if (o == null) {
                    a = new s();
                    return (g<?>)a;
                }
                a = null;
                return (g<?>)a;
            }
            a = this.a(list, primitiveType);
        }
        return (g<?>)a;
    }
}
