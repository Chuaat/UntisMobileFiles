// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

final class a9<T extends z8<T>>
{
    private static final a9 d;
    final rb<T, Object> a;
    private boolean b;
    private boolean c;
    
    static {
        d = new a9(true);
    }
    
    private a9() {
        this.a = (rb<T, Object>)new gb(16);
    }
    
    private a9(final boolean b) {
        final gb a = new gb(0);
        this.a = (rb<T, Object>)a;
        this.b();
        this.b();
    }
    
    public static <T extends z8<T>> a9<T> a() {
        throw null;
    }
    
    private static final void d(final T t, final Object o) {
        final lc zzb = t.zzb();
        s9.e(o);
        final lc h = lc.H;
        final mc h2 = mc.H;
        boolean b = false;
        switch (zzb.b().ordinal()) {
            default: {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", t.zza(), t.zzb().b(), o.getClass().getName()));
            }
            case 8: {
                if (o instanceof sa) {
                    return;
                }
                if (o instanceof w9) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", t.zza(), t.zzb().b(), o.getClass().getName()));
            }
            case 7: {
                if (o instanceof Integer) {
                    return;
                }
                if (o instanceof m9) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", t.zza(), t.zzb().b(), o.getClass().getName()));
            }
            case 6: {
                if (o instanceof h8) {
                    return;
                }
                if (o instanceof byte[]) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", t.zza(), t.zzb().b(), o.getClass().getName()));
            }
            case 5: {
                b = (o instanceof String);
                break;
            }
            case 4: {
                b = (o instanceof Boolean);
                break;
            }
            case 3: {
                b = (o instanceof Double);
                break;
            }
            case 2: {
                b = (o instanceof Float);
                break;
            }
            case 1: {
                b = (o instanceof Long);
                break;
            }
            case 0: {
                b = (o instanceof Integer);
                break;
            }
        }
        if (!b) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", t.zza(), t.zzb().b(), o.getClass().getName()));
        }
    }
    
    public final void b() {
        if (this.b) {
            return;
        }
        this.a.a();
        this.b = true;
    }
    
    public final void c(final T t, Object o) {
        if (t.a()) {
            if (!(o instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            final ArrayList<Object> list = new ArrayList<Object>();
            list.addAll((Collection<?>)o);
            for (int size = list.size(), i = 0; i < size; ++i) {
                d(t, list.get(i));
            }
            o = list;
        }
        else {
            d(t, o);
        }
        if (o instanceof w9) {
            this.c = true;
        }
        this.a.e(t, o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a9 && this.a.equals(((a9)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
