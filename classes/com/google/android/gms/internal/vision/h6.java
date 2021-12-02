// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.IOException;

final class h6<T extends j6<T>>
{
    private static final h6 d;
    final x8<T, Object> a;
    private boolean b;
    private boolean c;
    
    static {
        d = new h6(true);
    }
    
    private h6() {
        this.a = x8.b(16);
    }
    
    private h6(final x8<T, Object> a) {
        this.a = a;
        this.j();
    }
    
    private h6(final boolean b) {
        this(x8.b(0));
        this.j();
    }
    
    static int a(final ca ca, int h0, final Object o) {
        final int n = h0 = v5.h0(h0);
        if (ca == ca.R) {
            t6.g((z7)o);
            h0 = n << 1;
        }
        return h0 + b(ca, o);
    }
    
    private static int b(final ca ca, final Object o) {
        switch (g6.b[ca.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                if (o instanceof s6) {
                    return v5.C0(((s6)o).zza());
                }
                return v5.C0((int)o);
            }
            case 17: {
                return v5.o0((long)o);
            }
            case 16: {
                return v5.t0((int)o);
            }
            case 15: {
                return v5.w0((long)o);
            }
            case 14: {
                return v5.A0((int)o);
            }
            case 13: {
                return v5.p0((int)o);
            }
            case 12: {
                if (o instanceof f5) {
                    return v5.I((f5)o);
                }
                return v5.M((byte[])o);
            }
            case 11: {
                if (o instanceof f5) {
                    return v5.I((f5)o);
                }
                return v5.K((String)o);
            }
            case 10: {
                if (o instanceof d7) {
                    return v5.d((h7)o);
                }
                return v5.J((z7)o);
            }
            case 9: {
                return v5.W((z7)o);
            }
            case 8: {
                return v5.L((boolean)o);
            }
            case 7: {
                return v5.x0((int)o);
            }
            case 6: {
                return v5.s0((long)o);
            }
            case 5: {
                return v5.l0((int)o);
            }
            case 4: {
                return v5.j0((long)o);
            }
            case 3: {
                return v5.e0((long)o);
            }
            case 2: {
                return v5.A((float)o);
            }
            case 1: {
                return v5.z((double)o);
            }
        }
    }
    
    public static <T extends j6<T>> h6<T> c() {
        return (h6<T>)h6.d;
    }
    
    private static Object e(final Object o) {
        if (o instanceof i8) {
            return ((i8)o).zza();
        }
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            final byte[] array2 = new byte[array.length];
            System.arraycopy(array, 0, array2, 0, array.length);
            return array2;
        }
        return o;
    }
    
    static void f(final v5 v5, final ca ca, final int n, final Object o) throws IOException {
        if (ca == ca.R) {
            final z7 z7 = (z7)o;
            t6.g(z7);
            v5.m(n, 3);
            z7.a(v5);
            v5.m(n, 4);
            return;
        }
        v5.m(n, ca.d());
        switch (g6.b[ca.ordinal()]) {
            case 18: {
                if (o instanceof s6) {
                    v5.j(((s6)o).zza());
                    return;
                }
                v5.j((int)o);
                break;
            }
            case 17: {
                v5.S((long)o);
            }
            case 16: {
                v5.X((int)o);
            }
            case 15: {
                v5.a0((long)o);
            }
            case 14: {
                v5.f0((int)o);
            }
            case 13: {
                v5.O((int)o);
            }
            case 12: {
                if (o instanceof f5) {
                    v5.u((f5)o);
                    return;
                }
                final byte[] array = (byte[])o;
                v5.T(array, 0, array.length);
            }
            case 11: {
                if (o instanceof f5) {
                    v5.u((f5)o);
                    return;
                }
                v5.w((String)o);
            }
            case 10: {
                v5.v((z7)o);
            }
            case 9: {
                ((z7)o).a(v5);
            }
            case 8: {
                v5.y((boolean)o);
            }
            case 7: {
                v5.f0((int)o);
            }
            case 6: {
                v5.a0((long)o);
            }
            case 5: {
                v5.j((int)o);
            }
            case 4: {
                v5.t((long)o);
            }
            case 3: {
                v5.t((long)o);
            }
            case 2: {
                v5.i((float)o);
            }
            case 1: {
                v5.h((double)o);
                break;
            }
        }
    }
    
    private static <T extends j6<T>> boolean i(final Map.Entry<T, Object> entry) {
        final j6<T> j6 = entry.getKey();
        if (j6.a() == fa.P) {
            final boolean c = j6.c();
            final List<z7> value = entry.getValue();
            if (c) {
                final Iterator<z7> iterator = value.iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().i()) {
                        return false;
                    }
                }
            }
            else if (value instanceof z7) {
                if (!((z7)value).i()) {
                    return false;
                }
            }
            else {
                if (value instanceof d7) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }
    
    private final void l(final Map.Entry<T, Object> entry) {
        final j6<T> j6 = entry.getKey();
        Object o;
        final d7 d7 = (d7)(o = entry.getValue());
        if (d7 instanceof d7) {
            final d7 d8 = d7;
            o = com.google.android.gms.internal.vision.d7.e();
        }
        if (j6.c()) {
            Object d9;
            if ((d9 = this.d((T)j6)) == null) {
                d9 = new ArrayList<Object>();
            }
            final Iterator<Object> iterator = ((List<Object>)o).iterator();
            while (iterator.hasNext()) {
                ((List<Object>)d9).add(e(iterator.next()));
            }
            this.a.d((T)j6, d9);
            return;
        }
        if (j6.a() != fa.P) {
            this.a.d((T)j6, e(o));
            return;
        }
        final Object d10 = this.d((T)j6);
        if (d10 == null) {
            this.a.d((T)j6, e(o));
            return;
        }
        z7 z7;
        if (d10 instanceof i8) {
            z7 = j6.s3((i8)d10, (i8)o);
        }
        else {
            z7 = j6.r5(((i8)d10).j(), (z7)o).o();
        }
        this.a.d((T)j6, z7);
    }
    
    public static int m(final j6<?> j6, final Object o) {
        final ca zzb = j6.zzb();
        final int zza = j6.zza();
        if (!j6.c()) {
            return a(zzb, zza, o);
        }
        final boolean e = j6.e();
        final int n = 0;
        int n2 = 0;
        final List list = (List)o;
        if (e) {
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                n2 += b(zzb, iterator.next());
            }
            return v5.h0(zza) + n2 + v5.E0(n2);
        }
        final Iterator<Object> iterator2 = list.iterator();
        int n3 = n;
        while (iterator2.hasNext()) {
            n3 += a(zzb, zza, iterator2.next());
        }
        return n3;
    }
    
    private static int n(final Map.Entry<T, Object> entry) {
        final j6<T> j6 = entry.getKey();
        final d7 value = entry.getValue();
        if (j6.a() != fa.P || j6.c() || j6.e()) {
            return m(j6, value);
        }
        final boolean b = value instanceof d7;
        final int zza = entry.getKey().zza();
        if (b) {
            return v5.D(zza, value);
        }
        return v5.E(zza, (z7)value);
    }
    
    private static void q(final T t, final Object o) {
        final ca zzb = t.zzb();
        t6.d(o);
        boolean b = false;
        Label_0175: {
            Label_0125: {
                switch (g6.a[zzb.b().ordinal()]) {
                    case 9: {
                        if (o instanceof z7) {
                            break Label_0125;
                        }
                        if (o instanceof d7) {
                            break Label_0125;
                        }
                        break;
                    }
                    case 8: {
                        if (o instanceof Integer) {
                            break Label_0125;
                        }
                        if (o instanceof s6) {
                            break Label_0125;
                        }
                        break;
                    }
                    case 7: {
                        if (o instanceof f5 || o instanceof byte[]) {
                            break Label_0125;
                        }
                        break;
                    }
                    case 6: {
                        b = (o instanceof String);
                        break Label_0175;
                    }
                    case 5: {
                        b = (o instanceof Boolean);
                        break Label_0175;
                    }
                    case 4: {
                        b = (o instanceof Double);
                        break Label_0175;
                    }
                    case 3: {
                        b = (o instanceof Float);
                        break Label_0175;
                    }
                    case 2: {
                        b = (o instanceof Long);
                        break Label_0175;
                    }
                    case 1: {
                        b = (o instanceof Integer);
                        break Label_0175;
                    }
                }
                b = false;
                break Label_0175;
            }
            b = true;
        }
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", t.zza(), t.zzb().b(), o.getClass().getName()));
    }
    
    public final Object d(final T t) {
        Object o2;
        final Object o = o2 = this.a.get(t);
        if (o instanceof d7) {
            final d7 d7 = (d7)o;
            o2 = com.google.android.gms.internal.vision.d7.e();
        }
        return o2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof h6 && this.a.equals(((h6)o).a));
    }
    
    public final void g(final h6<T> h6) {
        for (int i = 0; i < h6.a.j(); ++i) {
            this.l(h6.a.h(i));
        }
        final Iterator<Map.Entry<T, Object>> iterator = h6.a.o().iterator();
        while (iterator.hasNext()) {
            this.l((Map.Entry)iterator.next());
        }
    }
    
    public final void h(final T t, Object value) {
        if (t.c()) {
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
                q(t, value);
            }
            value = list;
        }
        else {
            q(t, value);
        }
        if (value instanceof d7) {
            this.c = true;
        }
        this.a.d(t, value);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final void j() {
        if (this.b) {
            return;
        }
        this.a.e();
        this.b = true;
    }
    
    public final void k(final T t, final Object o) {
        if (t.c()) {
            q(t, o);
            final Object d = this.d(t);
            List<Object> list2;
            if (d == null) {
                final ArrayList<Object> list = new ArrayList<Object>();
                this.a.d(t, list);
                list2 = list;
            }
            else {
                list2 = (List<Object>)d;
            }
            list2.add(o);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }
    
    public final boolean o() {
        return this.b;
    }
    
    public final Iterator<Map.Entry<T, Object>> p() {
        if (this.c) {
            return new e7<T>(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }
    
    final Iterator<Map.Entry<T, Object>> r() {
        if (this.c) {
            return new e7<T>(this.a.q().iterator());
        }
        return this.a.q().iterator();
    }
    
    public final boolean s() {
        for (int i = 0; i < this.a.j(); ++i) {
            if (!i(this.a.h(i))) {
                return false;
            }
        }
        final Iterator<Map.Entry<T, Object>> iterator = this.a.o().iterator();
        while (iterator.hasNext()) {
            if (!i((Map.Entry<j6, Object>)(Map.Entry)iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final int t() {
        int i = 0;
        int n = 0;
        while (i < this.a.j()) {
            n += n(this.a.h(i));
            ++i;
        }
        final Iterator<Map.Entry<T, Object>> iterator = this.a.o().iterator();
        while (iterator.hasNext()) {
            n += n((Map.Entry)iterator.next());
        }
        return n;
    }
}
