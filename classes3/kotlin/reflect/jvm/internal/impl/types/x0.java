// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import m6.h;
import java.util.Map;
import m6.k;
import java.util.List;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public abstract class x0 extends b1
{
    @e
    public static final a c;
    
    static {
        c = new a(null);
    }
    
    @k
    @e
    public static final b1 h(@e final w0 w0, @e final List<? extends y0> list) {
        return x0.c.b(w0, list);
    }
    
    @k
    @h
    @e
    public static final x0 i(@e final Map<w0, ? extends y0> map) {
        return x0.c.c(map);
    }
    
    @f
    @Override
    public y0 e(@e final c0 c0) {
        k0.p((Object)c0, "key");
        return this.j(c0.N0());
    }
    
    @f
    public abstract y0 j(@e final w0 p0);
    
    public static final class a
    {
        private a() {
        }
        
        public static /* synthetic */ x0 e(final a a, final Map map, boolean b, final int n, final Object o) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            return a.d(map, b);
        }
        
        @k
        @e
        public final b1 a(@e final c0 c0) {
            k0.p((Object)c0, "kotlinType");
            return this.b(c0.N0(), c0.M0());
        }
        
        @k
        @e
        public final b1 b(@e final w0 w0, @e final List<? extends y0> list) {
            k0.p((Object)w0, "typeConstructor");
            k0.p((Object)list, "arguments");
            final List<kotlin.reflect.jvm.internal.impl.descriptors.b1> parameters = w0.getParameters();
            k0.o((Object)parameters, "typeConstructor.parameters");
            final kotlin.reflect.jvm.internal.impl.descriptors.b1 b1 = (kotlin.reflect.jvm.internal.impl.descriptors.b1)v.i3((List)parameters);
            Object value;
            if (b1 == null) {
                value = null;
            }
            else {
                value = b1.s0();
            }
            if (k0.g(value, (Object)Boolean.TRUE)) {
                final List<kotlin.reflect.jvm.internal.impl.descriptors.b1> parameters2 = w0.getParameters();
                k0.o((Object)parameters2, "typeConstructor.parameters");
                final ArrayList list2 = new ArrayList<w0>(v.Y((Iterable)parameters2, 10));
                final Iterator<Object> iterator = parameters2.iterator();
                while (iterator.hasNext()) {
                    list2.add(iterator.next().l());
                }
                return e(this, kotlin.collections.y0.B0((Iterable)v.V5((Iterable)list2, (Iterable)list)), false, 2, null);
            }
            return new a0(parameters, list);
        }
        
        @k
        @h
        @e
        public final x0 c(@e final Map<w0, ? extends y0> map) {
            k0.p((Object)map, "map");
            return e(this, map, false, 2, null);
        }
        
        @k
        @h
        @e
        public final x0 d(@e final Map<w0, ? extends y0> map, final boolean b) {
            k0.p((Object)map, "map");
            return new x0() {
                @Override
                public boolean a() {
                    return b;
                }
                
                @Override
                public boolean f() {
                    return map.isEmpty();
                }
                
                @f
                @Override
                public y0 j(@e final w0 w0) {
                    k0.p((Object)w0, "key");
                    return map.get(w0);
                }
            };
        }
    }
}
