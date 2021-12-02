// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Map;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

final class a1<FieldDescriptorType extends d1<FieldDescriptorType>>
{
    private static final a1 d;
    private final n3<FieldDescriptorType, Object> a;
    private boolean b;
    private boolean c;
    
    static {
        d = new a1(true);
    }
    
    private a1() {
        this.c = false;
        this.a = n3.f(16);
    }
    
    private a1(final boolean b) {
        this.c = false;
        this.a = n3.f(0);
        this.u();
    }
    
    static int f(final r4 r4, int c0, final Object o) {
        final int n = c0 = p0.C0(c0);
        if (r4 == r4.R) {
            l1.i((s2)o);
            c0 = n << 1;
        }
        return c0 + p(r4, o);
    }
    
    private final Object g(final FieldDescriptorType fieldDescriptorType) {
        Object o;
        if ((o = this.a.get(fieldDescriptorType)) instanceof u1) {
            o = u1.e();
        }
        return o;
    }
    
    static void h(final p0 p4, final r4 r4, final int n, final Object o) throws IOException {
        if (r4 == r4.R) {
            final s2 s2 = (s2)o;
            l1.i(s2);
            p4.G(n, 3);
            s2.c(p4);
            p4.G(n, 4);
            return;
        }
        p4.G(n, r4.d());
        switch (b1.b[r4.ordinal()]) {
            case 18: {
                if (o instanceof m1) {
                    p4.y0(((m1)o).a());
                    return;
                }
                p4.y0((int)o);
                break;
            }
            case 17: {
                p4.V((long)o);
            }
            case 16: {
                p4.A0((int)o);
            }
            case 15: {
                p4.c0((long)o);
            }
            case 14: {
                p4.B0((int)o);
            }
            case 13: {
                p4.z0((int)o);
            }
            case 12: {
                if (o instanceof d0) {
                    p4.q((d0)o);
                    return;
                }
                final byte[] array = (byte[])o;
                p4.d0(array, 0, array.length);
            }
            case 11: {
                if (o instanceof d0) {
                    p4.q((d0)o);
                    return;
                }
                p4.n0((String)o);
            }
            case 10: {
                p4.M((s2)o);
            }
            case 9: {
                ((s2)o).c(p4);
            }
            case 8: {
                p4.t((boolean)o);
            }
            case 7: {
                p4.B0((int)o);
            }
            case 6: {
                p4.c0((long)o);
            }
            case 5: {
                p4.y0((int)o);
            }
            case 4: {
                p4.L((long)o);
            }
            case 3: {
                p4.L((long)o);
            }
            case 2: {
                p4.i((float)o);
            }
            case 1: {
                p4.h((double)o);
                break;
            }
        }
    }
    
    private final void j(final FieldDescriptorType fieldDescriptorType, Object value) {
        if (fieldDescriptorType.L()) {
            if (!(value instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            final ArrayList<Object> list = new ArrayList<Object>();
            list.addAll((Collection<?>)value);
            final int size = list.size();
            int i = 0;
            while (i < size) {
                value = list.get(i);
                ++i;
                k(fieldDescriptorType.X(), value);
            }
            value = list;
        }
        else {
            k(fieldDescriptorType.X(), value);
        }
        if (value instanceof u1) {
            this.c = true;
        }
        this.a.d(fieldDescriptorType, value);
    }
    
    private static void k(final r4 r4, final Object o) {
        l1.a(o);
        final int n = b1.a[r4.b().ordinal()];
        final boolean b = true;
        int n2 = 0;
        Label_0201: {
            switch (n) {
                default: {
                    break Label_0201;
                }
                case 9: {
                    n2 = (b ? 1 : 0);
                    if (o instanceof s2) {
                        break Label_0201;
                    }
                    if (o instanceof u1) {
                        n2 = (b ? 1 : 0);
                        break Label_0201;
                    }
                    break;
                }
                case 8: {
                    n2 = (b ? 1 : 0);
                    if (o instanceof Integer) {
                        break Label_0201;
                    }
                    if (o instanceof m1) {
                        n2 = (b ? 1 : 0);
                        break Label_0201;
                    }
                    break;
                }
                case 7: {
                    n2 = (b ? 1 : 0);
                    if (o instanceof d0) {
                        break Label_0201;
                    }
                    if (o instanceof byte[]) {
                        n2 = (b ? 1 : 0);
                        break Label_0201;
                    }
                    break;
                }
                case 6: {
                    n2 = ((o instanceof String) ? 1 : 0);
                    break Label_0201;
                }
                case 5: {
                    n2 = ((o instanceof Boolean) ? 1 : 0);
                    break Label_0201;
                }
                case 4: {
                    n2 = ((o instanceof Double) ? 1 : 0);
                    break Label_0201;
                }
                case 3: {
                    n2 = ((o instanceof Float) ? 1 : 0);
                    break Label_0201;
                }
                case 2: {
                    n2 = ((o instanceof Long) ? 1 : 0);
                    break Label_0201;
                }
                case 1: {
                    n2 = ((o instanceof Integer) ? 1 : 0);
                    break Label_0201;
                }
            }
            n2 = 0;
        }
        if (n2 != 0) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
    
    public static <T extends d1<T>> a1<T> l() {
        return (a1<T>)a1.d;
    }
    
    private static int o(final d1<?> d1, final Object o) {
        final r4 x = d1.X();
        final int a = d1.a();
        if (!d1.L()) {
            return f(x, a, o);
        }
        final boolean a2 = d1.a1();
        final int n = 0;
        int n2 = 0;
        final List list = (List)o;
        if (a2) {
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                n2 += p(x, iterator.next());
            }
            return p0.C0(a) + n2 + p0.K0(n2);
        }
        final Iterator<Object> iterator2 = list.iterator();
        int n3 = n;
        while (iterator2.hasNext()) {
            n3 += f(x, a, iterator2.next());
        }
        return n3;
    }
    
    private static int p(final r4 r4, final Object o) {
        switch (b1.b[r4.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                if (o instanceof m1) {
                    return p0.I0(((m1)o).a());
                }
                return p0.I0((int)o);
            }
            case 17: {
                return p0.m0((long)o);
            }
            case 16: {
                return p0.F0((int)o);
            }
            case 15: {
                return p0.t0((long)o);
            }
            case 14: {
                return p0.H0((int)o);
            }
            case 13: {
                return p0.E0((int)o);
            }
            case 12: {
                if (o instanceof d0) {
                    return p0.D((d0)o);
                }
                return p0.a0((byte[])o);
            }
            case 11: {
                if (o instanceof d0) {
                    return p0.D((d0)o);
                }
                return p0.r0((String)o);
            }
            case 10: {
                if (o instanceof u1) {
                    return p0.e((y1)o);
                }
                return p0.R((s2)o);
            }
            case 9: {
                return p0.Z((s2)o);
            }
            case 8: {
                return p0.F((boolean)o);
            }
            case 7: {
                return p0.G0((int)o);
            }
            case 6: {
                return p0.q0((long)o);
            }
            case 5: {
                return p0.D0((int)o);
            }
            case 4: {
                return p0.i0((long)o);
            }
            case 3: {
                return p0.f0((long)o);
            }
            case 2: {
                return p0.x((float)o);
            }
            case 1: {
                return p0.w((double)o);
            }
        }
    }
    
    private static boolean q(final Map.Entry<FieldDescriptorType, Object> entry) {
        final d1<FieldDescriptorType> d1 = entry.getKey();
        if (d1.F() == w4.P) {
            final boolean l = d1.L();
            final List<s2> value = entry.getValue();
            if (l) {
                final Iterator<s2> iterator = value.iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().a()) {
                        return false;
                    }
                }
            }
            else if (value instanceof s2) {
                if (!((s2)value).a()) {
                    return false;
                }
            }
            else {
                if (value instanceof u1) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }
    
    private final void r(final Map.Entry<FieldDescriptorType, Object> entry) {
        final d1<FieldDescriptorType> d1 = entry.getKey();
        s2 s2;
        if ((s2 = entry.getValue()) instanceof u1) {
            s2 = u1.e();
        }
        if (d1.L()) {
            Object g;
            if ((g = this.g((FieldDescriptorType)d1)) == null) {
                g = new ArrayList<Object>();
            }
            final Iterator<Object> iterator = ((List<Object>)s2).iterator();
            while (iterator.hasNext()) {
                ((List<Object>)g).add(t(iterator.next()));
            }
            this.a.d((FieldDescriptorType)d1, g);
            return;
        }
        if (d1.F() != w4.P) {
            this.a.d((FieldDescriptorType)d1, t(s2));
            return;
        }
        final Object g2 = this.g((FieldDescriptorType)d1);
        if (g2 == null) {
            this.a.d((FieldDescriptorType)d1, t(s2));
            return;
        }
        s2 s3;
        if (g2 instanceof z2) {
            s3 = d1.u4((z2)g2, (z2)s2);
        }
        else {
            s3 = d1.L0(((z2)g2).b(), s2).g1();
        }
        this.a.d((FieldDescriptorType)d1, s3);
    }
    
    private static int s(final Map.Entry<FieldDescriptorType, Object> entry) {
        final d1<FieldDescriptorType> d1 = entry.getKey();
        final u1 value = entry.getValue();
        if (d1.F() != w4.P || d1.L() || d1.a1()) {
            return o(d1, value);
        }
        final boolean b = value instanceof u1;
        final int a = entry.getKey().a();
        if (b) {
            return p0.A(a, value);
        }
        return p0.Y(a, (s2)value);
    }
    
    private static Object t(final Object o) {
        if (o instanceof z2) {
            return ((z2)o).O3();
        }
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            final byte[] array2 = new byte[array.length];
            System.arraycopy(array, 0, array2, 0, array.length);
            return array2;
        }
        return o;
    }
    
    final Iterator<Map.Entry<FieldDescriptorType, Object>> a() {
        if (this.c) {
            return new x1<FieldDescriptorType>(this.a.p().iterator());
        }
        return this.a.p().iterator();
    }
    
    final boolean b() {
        return this.a.isEmpty();
    }
    
    public final boolean c() {
        return this.b;
    }
    
    public final boolean d() {
        for (int i = 0; i < this.a.n(); ++i) {
            if (!q(this.a.g(i))) {
                return false;
            }
        }
        final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator = this.a.o().iterator();
        while (iterator.hasNext()) {
            if (!q((Map.Entry)iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
        if (this.c) {
            return new x1<FieldDescriptorType>(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a1 && this.a.equals(((a1)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final void i(final a1<FieldDescriptorType> a1) {
        for (int i = 0; i < a1.a.n(); ++i) {
            this.r(a1.a.g(i));
        }
        final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator = a1.a.o().iterator();
        while (iterator.hasNext()) {
            this.r((Map.Entry)iterator.next());
        }
    }
    
    public final int m() {
        int i = 0;
        int n = 0;
        while (i < this.a.n()) {
            final Map.Entry<FieldDescriptorType, Object> g = this.a.g(i);
            n += o(g.getKey(), g.getValue());
            ++i;
        }
        for (final Map.Entry<d1<?>, V> entry : this.a.o()) {
            n += o(entry.getKey(), entry.getValue());
        }
        return n;
    }
    
    public final int n() {
        int i = 0;
        int n = 0;
        while (i < this.a.n()) {
            n += s(this.a.g(i));
            ++i;
        }
        final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator = this.a.o().iterator();
        while (iterator.hasNext()) {
            n += s((Map.Entry)iterator.next());
        }
        return n;
    }
    
    public final void u() {
        if (this.b) {
            return;
        }
        this.a.s();
        this.b = true;
    }
}
