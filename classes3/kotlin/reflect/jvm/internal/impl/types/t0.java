// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.Map;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;

public final class t0
{
    @e
    public static final a e;
    @f
    private final t0 a;
    @e
    private final a1 b;
    @e
    private final List<y0> c;
    @e
    private final Map<b1, y0> d;
    
    static {
        e = new a(null);
    }
    
    private t0(final t0 a, final a1 b, final List<? extends y0> c, final Map<b1, ? extends y0> d) {
        this.a = a;
        this.b = b;
        this.c = (List<y0>)c;
        this.d = (Map<b1, y0>)d;
    }
    
    @e
    public final List<y0> a() {
        return this.c;
    }
    
    @e
    public final a1 b() {
        return this.b;
    }
    
    @f
    public final y0 c(@e final w0 w0) {
        k0.p((Object)w0, "constructor");
        final h c = w0.c();
        y0 y0;
        if (c instanceof b1) {
            y0 = this.d.get(c);
        }
        else {
            y0 = null;
        }
        return y0;
    }
    
    public final boolean d(@e final a1 a1) {
        k0.p((Object)a1, "descriptor");
        final boolean g = k0.g((Object)this.b, (Object)a1);
        boolean b = false;
        if (!g) {
            final t0 a2 = this.a;
            if (a2 == null || !a2.d(a1)) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final t0 a(@f final t0 t0, @e final a1 a1, @e final List<? extends y0> list) {
            k0.p((Object)a1, "typeAliasDescriptor");
            k0.p((Object)list, "arguments");
            final List<b1> parameters = ((h)a1).l().getParameters();
            k0.o((Object)parameters, "typeAliasDescriptor.typeConstructor.parameters");
            final ArrayList list2 = new ArrayList<b1>(v.Y((Iterable)parameters, 10));
            final Iterator<Object> iterator = parameters.iterator();
            while (iterator.hasNext()) {
                list2.add(iterator.next().b());
            }
            return new t0(t0, a1, list, kotlin.collections.y0.B0((Iterable)v.V5((Iterable)list2, (Iterable)list)), null);
        }
    }
}
