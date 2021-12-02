// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public final class i7
{
    public static q a(final a6 a6) {
        if (a6 == null) {
            return q.f;
        }
        final int n = a6.F() - 1;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        final List<a6> a7 = a6.A();
                        final ArrayList<q> list = new ArrayList<q>();
                        final Iterator<a6> iterator = a7.iterator();
                        while (iterator.hasNext()) {
                            list.add(a(iterator.next()));
                        }
                        return new r(a6.x(), list);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                }
                else {
                    if (a6.C()) {
                        return new g(a6.B());
                    }
                    return new g(null);
                }
            }
            else {
                if (a6.D()) {
                    return new i(a6.v());
                }
                return new i(null);
            }
        }
        else {
            if (a6.E()) {
                return new u(a6.z());
            }
            return q.m;
        }
    }
    
    public static q b(Object string) {
        if (string == null) {
            return q.g;
        }
        if (string instanceof String) {
            return new u((String)string);
        }
        if (string instanceof Double) {
            return new i((Double)string);
        }
        if (string instanceof Long) {
            return new i((double)string);
        }
        if (string instanceof Integer) {
            return new i((double)string);
        }
        if (string instanceof Boolean) {
            return new g((Boolean)string);
        }
        if (string instanceof Map) {
            final n n = new n();
            final Map map = (Map)string;
            for (final Object next : map.keySet()) {
                final q b = b(map.get(next));
                if (next != null) {
                    string = next;
                    if (!(next instanceof String)) {
                        string = next.toString();
                    }
                    n.f((String)string, b);
                }
            }
            return n;
        }
        if (string instanceof List) {
            final f f = new f();
            final Iterator<Object> iterator2 = (Iterator<Object>)((List)string).iterator();
            while (iterator2.hasNext()) {
                f.z(f.n(), b(iterator2.next()));
            }
            return f;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
