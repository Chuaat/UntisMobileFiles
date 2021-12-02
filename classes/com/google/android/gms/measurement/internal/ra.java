// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.f9;
import com.google.android.gms.internal.measurement.td;
import androidx.annotation.j0;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.r4;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.p4;
import com.google.android.gms.internal.measurement.m5;
import java.util.Collections;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.q4;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.collection.a;
import java.util.List;
import java.util.Map;
import java.util.BitSet;
import com.google.android.gms.internal.measurement.k5;

final class ra
{
    private String a = a;
    private boolean b = true;
    private k5 c;
    private BitSet d = new BitSet();
    private BitSet e = new BitSet();
    private Map<Integer, Long> f = new a<Integer, Long>();
    private Map<Integer, List<Long>> g = new a<Integer, List<Long>>();
    final /* synthetic */ xa h;
    
    @j0
    final q4 a(int intValue) {
        final p4 w = q4.w();
        w.v(intValue);
        w.x(this.b);
        final k5 c = this.c;
        if (c != null) {
            w.z(c);
        }
        final j5 b = k5.B();
        b.w(ba.H(this.d));
        b.z(ba.H(this.e));
        final Map<Integer, Long> f = this.f;
        ArrayList<s4> list;
        if (f == null) {
            list = null;
        }
        else {
            list = new ArrayList<s4>(f.size());
            final Iterator<Integer> iterator = this.f.keySet().iterator();
            while (iterator.hasNext()) {
                intValue = iterator.next();
                final Long n = this.f.get(intValue);
                if (n != null) {
                    final r4 x = s4.x();
                    x.w(intValue);
                    x.v(n);
                    list.add(((f9<s4, BuilderType>)x).n());
                }
            }
        }
        if (list != null) {
            b.v(list);
        }
        final Map<Integer, List<Long>> g = this.g;
        List<m5> emptyList;
        if (g == null) {
            emptyList = Collections.emptyList();
        }
        else {
            emptyList = new ArrayList<m5>(g.size());
            for (final Integer n2 : this.g.keySet()) {
                final l5 z = m5.z();
                z.w(n2);
                final List<Long> list2 = this.g.get(n2);
                if (list2 != null) {
                    Collections.sort((List<Comparable>)list2);
                    z.v(list2);
                }
                ((ArrayList<m5>)emptyList).add(((f9<m5, BuilderType>)z).n());
            }
        }
        b.x(emptyList);
        w.w(b);
        return ((f9<q4, BuilderType>)w).n();
    }
    
    final void c(@j0 final va va) {
        final int a = va.a();
        final Boolean c = va.c;
        if (c != null) {
            this.e.set(a, c);
        }
        final Boolean d = va.d;
        if (d != null) {
            this.d.set(a, d);
        }
        if (va.e != null) {
            final Map<Integer, Long> f = this.f;
            final Integer value = a;
            final Long n = f.get(value);
            final long l = va.e / 1000L;
            if (n == null || l > n) {
                this.f.put(value, l);
            }
        }
        if (va.f != null) {
            final Map<Integer, List<Long>> g = this.g;
            final Integer value2 = a;
            List<Long> list;
            if ((list = g.get(value2)) == null) {
                list = new ArrayList<Long>();
                this.g.put(value2, list);
            }
            if (va.c()) {
                list.clear();
            }
            td.b();
            final g w = this.h.a.w();
            final String a2 = this.a;
            final z2<Boolean> a3 = com.google.android.gms.measurement.internal.a3.a0;
            if (w.y(a2, a3) && va.b()) {
                list.clear();
            }
            td.b();
            final boolean y = this.h.a.w().y(this.a, a3);
            final Long value3 = va.f / 1000L;
            if (y) {
                if (!list.contains(value3)) {
                    list.add(value3);
                }
            }
            else {
                list.add(value3);
            }
        }
    }
}
