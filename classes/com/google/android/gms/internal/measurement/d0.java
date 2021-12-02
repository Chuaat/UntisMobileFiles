// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public final class d0
{
    public static q a(String k, f b, final g5 g5, final List<q> list) {
        int n = 0;
        Label_0496: {
            Label_0493: {
                Label_0444: {
                    switch (k.hashCode()) {
                        case 1943291465: {
                            if (k.equals("indexOf")) {
                                n = 4;
                                break Label_0444;
                            }
                            break;
                        }
                        case 1099846370: {
                            if (k.equals("reverse")) {
                                n = 12;
                                break Label_0444;
                            }
                            break;
                        }
                        case 965561430: {
                            if (k.equals("reduceRight")) {
                                n = 11;
                                break Label_0444;
                            }
                            break;
                        }
                        case 109526418: {
                            if (k.equals("slice")) {
                                n = 14;
                                break Label_0444;
                            }
                            break;
                        }
                        case 109407362: {
                            if (k.equals("shift")) {
                                n = 13;
                                break Label_0444;
                            }
                            break;
                        }
                        case 96891675: {
                            if (k.equals("every")) {
                                n = 1;
                                break Label_0496;
                            }
                            break;
                        }
                        case 3536286: {
                            if (k.equals("sort")) {
                                n = 16;
                                break Label_0444;
                            }
                            break;
                        }
                        case 3536116: {
                            if (k.equals("some")) {
                                n = 15;
                                break Label_0444;
                            }
                            break;
                        }
                        case 3452698: {
                            if (k.equals("push")) {
                                n = 9;
                                break Label_0444;
                            }
                            break;
                        }
                        case 3267882: {
                            if (k.equals("join")) {
                                n = 5;
                                break Label_0444;
                            }
                            break;
                        }
                        case 111185: {
                            if (k.equals("pop")) {
                                n = 8;
                                break Label_0444;
                            }
                            break;
                        }
                        case 107868: {
                            if (k.equals("map")) {
                                n = 7;
                                break Label_0444;
                            }
                            break;
                        }
                        case -277637751: {
                            if (k.equals("unshift")) {
                                n = 19;
                                break Label_0444;
                            }
                            break;
                        }
                        case -467511597: {
                            if (k.equals("lastIndexOf")) {
                                n = 6;
                                break Label_0444;
                            }
                            break;
                        }
                        case -678635926: {
                            if (k.equals("forEach")) {
                                n = 3;
                                break Label_0444;
                            }
                            break;
                        }
                        case -895859076: {
                            if (k.equals("splice")) {
                                n = 17;
                                break Label_0444;
                            }
                            break;
                        }
                        case -934873754: {
                            if (k.equals("reduce")) {
                                n = 10;
                                break Label_0444;
                            }
                            break;
                        }
                        case -1274492040: {
                            if (k.equals("filter")) {
                                n = 2;
                                break Label_0496;
                            }
                            break;
                        }
                        case -1354795244: {
                            if (k.equals("concat")) {
                                n = 0;
                                break Label_0496;
                            }
                            break;
                        }
                        case -1776922004: {
                            if (k.equals("toString")) {
                                n = 18;
                                break Label_0496;
                            }
                            break;
                        }
                    }
                    break Label_0493;
                }
                break Label_0496;
            }
            n = -1;
        }
        double a = 0.0;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
            case 19: {
                if (!list.isEmpty()) {
                    final f f = new f();
                    final Iterator<q> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        final q b2 = g5.b(iterator.next());
                        if (b2 instanceof h) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        f.z(f.n(), b2);
                    }
                    final int n2 = f.n();
                    final Iterator<Integer> r = b.r();
                    while (r.hasNext()) {
                        final Integer n3 = r.next();
                        f.z(n3 + n2, b.o(n3));
                    }
                    b.v();
                    final Iterator<Integer> r2 = f.r();
                    while (r2.hasNext()) {
                        final Integer n4 = r2.next();
                        b.z(n4, f.o(n4));
                    }
                }
                return new i((double)b.n());
            }
            case 18: {
                h6.h("toString", 0, list);
                return new u(b.q(","));
            }
            case 17: {
                f f2;
                if (list.isEmpty()) {
                    f2 = new f();
                }
                else {
                    final int n5 = (int)h6.a(g5.b(list.get(0)).g());
                    int n6;
                    if (n5 < 0) {
                        n6 = Math.max(0, n5 + b.n());
                    }
                    else if ((n6 = n5) > b.n()) {
                        n6 = b.n();
                    }
                    final int n7 = b.n();
                    f2 = new f();
                    int i = n6;
                    if (list.size() > 1) {
                        final int max = Math.max(0, (int)h6.a(g5.b(list.get(1)).g()));
                        if (max > 0) {
                            for (int j = n6; j < Math.min(n7, n6 + max); ++j) {
                                f2.z(f2.n(), b.o(n6));
                                b.x(n6);
                            }
                        }
                        if (list.size() > 2) {
                            for (int l = 2; l < list.size(); ++l) {
                                final q b3 = g5.b(list.get(l));
                                if (b3 instanceof h) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                b.w(n6 + l - 2, b3);
                            }
                        }
                    }
                    else {
                        while (i < n7) {
                            f2.z(f2.n(), b.o(i));
                            b.z(i, null);
                            ++i;
                        }
                    }
                }
                return f2;
            }
            case 16: {
                h6.j("sort", 1, list);
                if (b.n() >= 2) {
                    final List<q> t = b.t();
                    j m;
                    if (!list.isEmpty()) {
                        final q b4 = g5.b(list.get(0));
                        if (!(b4 instanceof j)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        m = (j)b4;
                    }
                    else {
                        m = null;
                    }
                    Collections.sort((List<Object>)t, (Comparator<? super Object>)new c0(m, g5));
                    b.v();
                    final Iterator<q> iterator2 = t.iterator();
                    int n8 = 0;
                    while (iterator2.hasNext()) {
                        b.z(n8, iterator2.next());
                        ++n8;
                    }
                }
                return b;
            }
            case 15: {
                h6.h("some", 1, list);
                final q b5 = g5.b(list.get(0));
                if (b5 instanceof j) {
                    if (b.n() != 0) {
                        final j j2 = (j)b5;
                        final Iterator<Integer> r3 = b.r();
                        while (r3.hasNext()) {
                            final int intValue = r3.next();
                            if (b.A(intValue) && j2.a(g5, Arrays.asList(b.o(intValue), new i((double)intValue), b)).m()) {
                                return q.k;
                            }
                        }
                    }
                    return q.l;
                }
                throw new IllegalArgumentException("Callback should be a method");
            }
            case 14: {
                h6.j("slice", 2, list);
                q c;
                if (list.isEmpty()) {
                    c = b.c();
                }
                else {
                    final double n9 = b.n();
                    final double a2 = h6.a(g5.b(list.get(0)).g());
                    double n10;
                    if (a2 < 0.0) {
                        n10 = Math.max(a2 + n9, 0.0);
                    }
                    else {
                        n10 = Math.min(a2, n9);
                    }
                    double n11 = n9;
                    if (list.size() == 2) {
                        final double a3 = h6.a(g5.b(list.get(1)).g());
                        if (a3 < 0.0) {
                            n11 = Math.max(n9 + a3, 0.0);
                        }
                        else {
                            n11 = Math.min(n9, a3);
                        }
                    }
                    final f f3 = new f();
                    int n12 = (int)n10;
                    while (true) {
                        c = f3;
                        if (n12 >= n11) {
                            break;
                        }
                        f3.z(f3.n(), b.o(n12));
                        ++n12;
                    }
                }
                return c;
            }
            case 13: {
                h6.h("shift", 0, list);
                q q2;
                if (b.n() == 0) {
                    q2 = q.f;
                }
                else {
                    q2 = b.o(0);
                    b.x(0);
                }
                return q2;
            }
            case 12: {
                h6.h("reverse", 0, list);
                final int n13 = b.n();
                if (n13 != 0) {
                    for (int n14 = 0; n14 < n13 / 2; ++n14) {
                        if (b.A(n14)) {
                            final q o = b.o(n14);
                            b.z(n14, null);
                            final int n15 = n13 - 1 - n14;
                            if (b.A(n15)) {
                                b.z(n14, b.o(n15));
                            }
                            b.z(n15, o);
                        }
                    }
                }
                return b;
            }
            case 11: {
                return c(b, g5, list, false);
            }
            case 10: {
                return c(b, g5, list, true);
            }
            case 9: {
                if (!list.isEmpty()) {
                    final Iterator<q> iterator3 = list.iterator();
                    while (iterator3.hasNext()) {
                        b.z(b.n(), g5.b(iterator3.next()));
                    }
                }
                return new i((double)b.n());
            }
            case 8: {
                h6.h("pop", 0, list);
                int n16 = b.n();
                q q3;
                if (n16 == 0) {
                    q3 = q.f;
                }
                else {
                    --n16;
                    q3 = b.o(n16);
                    b.x(n16);
                }
                return q3;
            }
            case 7: {
                h6.h("map", 1, list);
                final q b6 = g5.b(list.get(0));
                if (b6 instanceof p) {
                    f b7;
                    if (b.n() == 0) {
                        b7 = new f();
                    }
                    else {
                        b7 = b(b, g5, (j)b6, null, null);
                    }
                    return b7;
                }
                throw new IllegalArgumentException("Callback should be a method");
            }
            case 6: {
                h6.j("lastIndexOf", 2, list);
                q q4 = q.f;
                if (!list.isEmpty()) {
                    q4 = g5.b(list.get(0));
                }
                double b8 = b.n() - 1;
                if (list.size() > 1) {
                    final q b9 = g5.b(list.get(1));
                    double a4;
                    if (Double.isNaN(b9.g())) {
                        a4 = b.n() - 1;
                    }
                    else {
                        a4 = h6.a(b9.g());
                    }
                    b8 = a4;
                    if (a4 < 0.0) {
                        b8 = a4 + b.n();
                    }
                }
                i i2;
                if (b8 < 0.0) {
                    i2 = new i(-1.0);
                }
                else {
                    for (int n17 = (int)Math.min(b.n(), b8); n17 >= 0; --n17) {
                        if (b.A(n17) && h6.l(b.o(n17), q4)) {
                            i2 = new i((double)n17);
                            return i2;
                        }
                    }
                    i2 = new i(-1.0);
                }
                return i2;
            }
            case 5: {
                h6.j("join", 1, list);
                q m2;
                if (b.n() == 0) {
                    m2 = q.m;
                }
                else {
                    if (list.size() > 0) {
                        final q b10 = g5.b(list.get(0));
                        if (!(b10 instanceof o) && !(b10 instanceof v)) {
                            k = b10.k();
                        }
                        else {
                            k = "";
                        }
                    }
                    else {
                        k = ",";
                    }
                    m2 = new u(b.q(k));
                }
                return m2;
            }
            case 4: {
                h6.j("indexOf", 2, list);
                q q5 = q.f;
                if (!list.isEmpty()) {
                    q5 = g5.b(list.get(0));
                }
                if (list.size() > 1) {
                    a = h6.a(g5.b(list.get(1)).g());
                    if (a >= b.n()) {
                        return new i(-1.0);
                    }
                    if (a < 0.0) {
                        a += b.n();
                    }
                }
                final Iterator<Integer> r4 = b.r();
                while (r4.hasNext()) {
                    final int intValue2 = r4.next();
                    final double d = intValue2;
                    if (d >= a && h6.l(b.o(intValue2), q5)) {
                        return new i(d);
                    }
                }
                return new i(-1.0);
            }
            case 3: {
                h6.h("forEach", 1, list);
                final q b11 = g5.b(list.get(0));
                if (b11 instanceof p) {
                    if (b.l() != 0) {
                        b(b, g5, (j)b11, null, null);
                    }
                    return q.f;
                }
                throw new IllegalArgumentException("Callback should be a method");
            }
            case 2: {
                h6.h("filter", 1, list);
                final q b12 = g5.b(list.get(0));
                if (b12 instanceof p) {
                    f f4;
                    if (b.l() == 0) {
                        f4 = new f();
                    }
                    else {
                        final q c2 = b.c();
                        b = b(b, g5, (j)b12, null, Boolean.TRUE);
                        f4 = new f();
                        final Iterator<Integer> r5 = b.r();
                        while (r5.hasNext()) {
                            f4.z(f4.n(), ((f)c2).o(r5.next()));
                        }
                    }
                    return f4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            }
            case 1: {
                h6.h("every", 1, list);
                final q b13 = g5.b(list.get(0));
                if (b13 instanceof p) {
                    q q6;
                    if (b.n() != 0 && b(b, g5, (j)b13, Boolean.FALSE, Boolean.TRUE).n() != b.n()) {
                        q6 = q.l;
                    }
                    else {
                        q6 = q.k;
                    }
                    return q6;
                }
                throw new IllegalArgumentException("Callback should be a method");
            }
            case 0: {
                final q c3 = b.c();
                if (!list.isEmpty()) {
                    final Iterator<q> iterator4 = list.iterator();
                    while (iterator4.hasNext()) {
                        final q b14 = g5.b(iterator4.next());
                        if (b14 instanceof h) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        final f f5 = (f)c3;
                        final int n18 = f5.n();
                        if (b14 instanceof f) {
                            final f f6 = (f)b14;
                            final Iterator<Integer> r6 = f6.r();
                            while (r6.hasNext()) {
                                final Integer n19 = r6.next();
                                f5.z(n19 + n18, f6.o(n19));
                            }
                        }
                        else {
                            f5.z(n18, b14);
                        }
                    }
                }
                return c3;
            }
        }
    }
    
    private static f b(final f f, final g5 g5, final j j, final Boolean obj, final Boolean obj2) {
        final f f2 = new f();
        final Iterator<Integer> r = f.r();
        while (r.hasNext()) {
            final int intValue = r.next();
            if (f.A(intValue)) {
                final q a = j.a(g5, Arrays.asList(f.o(intValue), new i((double)intValue), f));
                if (a.m().equals(obj)) {
                    return f2;
                }
                if (obj2 != null && !a.m().equals(obj2)) {
                    continue;
                }
                f2.z(intValue, a);
            }
        }
        return f2;
    }
    
    private static q c(final f f, final g5 g5, final List<q> list, final boolean b) {
        h6.i("reduce", 1, list);
        h6.j("reduce", 2, list);
        final q b2 = g5.b(list.get(0));
        if (b2 instanceof j) {
            q b3;
            if (list.size() == 2) {
                b3 = g5.b(list.get(1));
                if (b3 instanceof h) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            }
            else {
                if (f.n() == 0) {
                    throw new IllegalStateException("Empty array with no initial value error");
                }
                b3 = null;
            }
            final j j = (j)b2;
            int n = f.n();
            int n2;
            if (b) {
                n2 = 0;
            }
            else {
                n2 = n - 1;
            }
            int n3 = -1;
            if (b) {
                --n;
            }
            else {
                n = 0;
            }
            if (b) {
                n3 = 1;
            }
            int n4 = n;
            int n5 = n2;
            int n6 = n3;
            q q = b3;
            while (true) {
                q q2 = null;
                Label_0294: {
                    if (b3 == null) {
                        q2 = f.o(n2);
                        break Label_0294;
                    }
                    if ((n4 - n5) * n6 < 0) {
                        return q;
                    }
                    n = n4;
                    n2 = n5;
                    n3 = n6;
                    q2 = q;
                    if (f.A(n5)) {
                        q2 = j.a(g5, Arrays.asList(q, f.o(n5), new i((double)n5), f));
                        if (q2 instanceof h) {
                            throw new IllegalStateException("Reduce operation failed");
                        }
                        n = n4;
                        n2 = n5;
                        n3 = n6;
                    }
                }
                n5 = n2 + n3;
                n4 = n;
                n6 = n3;
                q = q2;
                continue;
            }
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
