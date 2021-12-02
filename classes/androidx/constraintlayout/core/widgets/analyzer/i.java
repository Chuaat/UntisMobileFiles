// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.util.Iterator;
import androidx.constraintlayout.core.widgets.a;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.core.widgets.j;
import java.util.ArrayList;
import androidx.constraintlayout.core.widgets.e;

public class i
{
    private static final boolean a = false;
    private static final boolean b = false;
    
    public static o a(final e e, final int n, final ArrayList<o> list, o o) {
        int n2;
        if (n == 0) {
            n2 = e.R0;
        }
        else {
            n2 = e.S0;
        }
        final int n3 = 0;
        o o2;
        if (n2 != -1 && (o == null || n2 != o.b)) {
            int index = 0;
            while (true) {
                o2 = o;
                if (index >= list.size()) {
                    break;
                }
                o2 = list.get(index);
                if (o2.f() == n2) {
                    if (o != null) {
                        o.m(n, o2);
                        list.remove(o);
                    }
                    break;
                }
                ++index;
            }
        }
        else {
            o2 = o;
            if (n2 != -1) {
                return o;
            }
        }
        if ((o = o2) == null) {
            o = o2;
            if (e instanceof j) {
                final int f2 = ((j)e).f2(n);
                o = o2;
                if (f2 != -1) {
                    int index2 = 0;
                    while (true) {
                        o = o2;
                        if (index2 >= list.size()) {
                            break;
                        }
                        o = list.get(index2);
                        if (o.f() == f2) {
                            break;
                        }
                        ++index2;
                    }
                }
            }
            o e2;
            if ((e2 = o) == null) {
                e2 = new o(n);
            }
            list.add(e2);
            o = e2;
        }
        if (o.a(e)) {
            if (e instanceof h) {
                final h h = (h)e;
                final d f3 = h.f2();
                int n4 = n3;
                if (h.g2() == 0) {
                    n4 = 1;
                }
                f3.d(n4, list, o);
            }
            final int f4 = o.f();
            d d;
            if (n == 0) {
                e.R0 = f4;
                e.Q.d(n, list, o);
                d = e.S;
            }
            else {
                e.S0 = f4;
                e.R.d(n, list, o);
                e.U.d(n, list, o);
                d = e.T;
            }
            d.d(n, list, o);
            e.X.d(n, list, o);
        }
        return o;
    }
    
    private static o b(final ArrayList<o> list, final int n) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final o o = list.get(i);
            if (n == o.b) {
                return o;
            }
        }
        return null;
    }
    
    public static boolean c(final f f, final b.b b) {
        final ArrayList<e> f2 = f.f2();
        final int size = f2.size();
        for (int i = 0; i < size; ++i) {
            final e e = f2.get(i);
            if (!d(f.H(), f.g0(), e.H(), e.g0())) {
                return false;
            }
            if (e instanceof g) {
                return false;
            }
        }
        final androidx.constraintlayout.core.f f3 = f.F1;
        if (f3 != null) {
            ++f3.Q;
        }
        int j = 0;
        ArrayList<h> list = null;
        ArrayList<a> list2 = null;
        ArrayList<h> list3 = null;
        ArrayList<a> list4 = null;
        ArrayList<a> list5 = null;
        ArrayList<a> list6 = null;
        while (j < size) {
            final e e2 = f2.get(j);
            if (!d(f.H(), f.g0(), e2.H(), e2.g0())) {
                f.L2(0, e2, b, f.e2, androidx.constraintlayout.core.widgets.analyzer.b.a.k);
            }
            final boolean b2 = e2 instanceof h;
            ArrayList<h> list7 = list;
            ArrayList<h> list8 = list3;
            if (b2) {
                final h h = (h)e2;
                ArrayList<h> list9 = list3;
                if (h.g2() == 0) {
                    if ((list9 = list3) == null) {
                        list9 = new ArrayList<h>();
                    }
                    list9.add(h);
                }
                list7 = list;
                list8 = list9;
                if (h.g2() == 1) {
                    ArrayList<h> list10;
                    if ((list10 = list) == null) {
                        list10 = new ArrayList<h>();
                    }
                    list10.add(h);
                    list8 = list9;
                    list7 = list10;
                }
            }
            ArrayList<a> list11 = list2;
            ArrayList<a> list12 = list4;
            Label_0493: {
                if (e2 instanceof j) {
                    a e4;
                    ArrayList<a> list14;
                    if (e2 instanceof a) {
                        final a e3 = (a)e2;
                        ArrayList<a> list13 = list2;
                        if (e3.l2() == 0) {
                            if ((list13 = list2) == null) {
                                list13 = new ArrayList<a>();
                            }
                            list13.add(e3);
                        }
                        list11 = list13;
                        list12 = list4;
                        if (e3.l2() != 1) {
                            break Label_0493;
                        }
                        e4 = e3;
                        list11 = list13;
                        if ((list14 = list4) == null) {
                            list14 = new ArrayList<a>();
                            e4 = e3;
                            list11 = list13;
                        }
                    }
                    else {
                        final a e5 = (a)e2;
                        ArrayList<a> list15;
                        if ((list15 = list2) == null) {
                            list15 = new ArrayList<a>();
                        }
                        list15.add(e5);
                        e4 = e5;
                        list11 = list15;
                        if ((list14 = list4) == null) {
                            list14 = new ArrayList<a>();
                            list11 = list15;
                            e4 = e5;
                        }
                    }
                    list14.add(e4);
                    list12 = list14;
                }
            }
            ArrayList<a> list16 = list5;
            if (e2.Q.f == null) {
                list16 = list5;
                if (e2.S.f == null) {
                    list16 = list5;
                    if (!b2) {
                        list16 = list5;
                        if (!(e2 instanceof a)) {
                            ArrayList<a> list17;
                            if ((list17 = list5) == null) {
                                list17 = new ArrayList<a>();
                            }
                            list17.add((a)e2);
                            list16 = list17;
                        }
                    }
                }
            }
            ArrayList<a> list18 = list6;
            if (e2.R.f == null) {
                list18 = list6;
                if (e2.T.f == null) {
                    list18 = list6;
                    if (e2.U.f == null) {
                        list18 = list6;
                        if (!b2) {
                            list18 = list6;
                            if (!(e2 instanceof a)) {
                                ArrayList<a> list19;
                                if ((list19 = list6) == null) {
                                    list19 = new ArrayList<a>();
                                }
                                list19.add((a)e2);
                                list18 = list19;
                            }
                        }
                    }
                }
            }
            ++j;
            list = list7;
            list2 = list11;
            list3 = list8;
            list4 = list12;
            list5 = list16;
            list6 = list18;
        }
        final ArrayList list20 = new ArrayList<o>();
        if (list != null) {
            final Iterator<h> iterator = list.iterator();
            while (iterator.hasNext()) {
                a(iterator.next(), 0, list20, null);
            }
        }
        if (list2 != null) {
            for (final a a : list2) {
                final o a2 = a(a, 0, list20, null);
                a.e2(list20, 0, a2);
                a2.c(list20);
            }
        }
        final d r = f.r(d.b.H);
        if (r.e() != null) {
            final Iterator<d> iterator3 = r.e().iterator();
            while (iterator3.hasNext()) {
                a(iterator3.next().d, 0, list20, null);
            }
        }
        final d r2 = f.r(d.b.J);
        if (r2.e() != null) {
            final Iterator<d> iterator4 = r2.e().iterator();
            while (iterator4.hasNext()) {
                a(iterator4.next().d, 0, list20, null);
            }
        }
        final d r3 = f.r(d.b.M);
        if (r3.e() != null) {
            final Iterator<d> iterator5 = r3.e().iterator();
            while (iterator5.hasNext()) {
                a(iterator5.next().d, 0, list20, null);
            }
        }
        if (list5 != null) {
            final Iterator<a> iterator6 = list5.iterator();
            while (iterator6.hasNext()) {
                a(iterator6.next(), 0, list20, null);
            }
        }
        if (list3 != null) {
            final Iterator<h> iterator7 = list3.iterator();
            while (iterator7.hasNext()) {
                a(iterator7.next(), 1, list20, null);
            }
        }
        if (list4 != null) {
            for (final a a3 : list4) {
                final o a4 = a(a3, 1, list20, null);
                a3.e2(list20, 1, a4);
                a4.c(list20);
            }
        }
        final d r4 = f.r(d.b.I);
        if (r4.e() != null) {
            final Iterator<d> iterator9 = r4.e().iterator();
            while (iterator9.hasNext()) {
                a(iterator9.next().d, 1, list20, null);
            }
        }
        final d r5 = f.r(d.b.L);
        if (r5.e() != null) {
            final Iterator<d> iterator10 = r5.e().iterator();
            while (iterator10.hasNext()) {
                a(iterator10.next().d, 1, list20, null);
            }
        }
        final d r6 = f.r(d.b.K);
        if (r6.e() != null) {
            final Iterator<d> iterator11 = r6.e().iterator();
            while (iterator11.hasNext()) {
                a(iterator11.next().d, 1, list20, null);
            }
        }
        final d r7 = f.r(d.b.M);
        if (r7.e() != null) {
            final Iterator<d> iterator12 = r7.e().iterator();
            while (iterator12.hasNext()) {
                a(iterator12.next().d, 1, list20, null);
            }
        }
        if (list6 != null) {
            final Iterator<a> iterator13 = list6.iterator();
            while (iterator13.hasNext()) {
                a(iterator13.next(), 1, list20, null);
            }
        }
        for (int k = 0; k < size; ++k) {
            final e e6 = f2.get(k);
            if (e6.M0()) {
                final o b3 = b(list20, e6.R0);
                final o b4 = b(list20, e6.S0);
                if (b3 != null && b4 != null) {
                    b3.m(0, b4);
                    b4.o(2);
                    list20.remove(b3);
                }
            }
        }
        if (list20.size() <= 1) {
            return false;
        }
        o o3 = null;
        Label_1594: {
            if (f.H() == e.b.H) {
                final Iterator<o> iterator14 = list20.iterator();
                o o = null;
                int n = 0;
                while (iterator14.hasNext()) {
                    final o o2 = iterator14.next();
                    if (o2.g() == 1) {
                        continue;
                    }
                    o2.n(false);
                    final int l = o2.l(f.C2(), 0);
                    if (l <= n) {
                        continue;
                    }
                    o = o2;
                    n = l;
                }
                if (o != null) {
                    f.x1(e.b.G);
                    f.W1(n);
                    o.n(true);
                    o3 = o;
                    break Label_1594;
                }
            }
            o3 = null;
        }
        if (f.g0() == e.b.H) {
            final Iterator<o> iterator15 = list20.iterator();
            o o4 = null;
            int n2 = 0;
            while (iterator15.hasNext()) {
                final o o5 = iterator15.next();
                if (o5.g() == 0) {
                    continue;
                }
                o5.n(false);
                final int m = o5.l(f.C2(), 1);
                if (m <= n2) {
                    continue;
                }
                o4 = o5;
                n2 = m;
            }
            if (o4 != null) {
                f.S1(e.b.G);
                f.s1(n2);
                o4.n(true);
                final o o6 = o4;
                return o3 != null || o6 != null;
            }
        }
        final o o6 = null;
        return o3 != null || o6 != null;
    }
    
    public static boolean d(e.b h, final e.b b, final e.b b2, final e.b b3) {
        final e.b g = e.b.G;
        boolean b4 = false;
        Label_0047: {
            if (b2 != g) {
                final e.b h2 = e.b.H;
                if (b2 != h2) {
                    if (b2 != e.b.J || h == h2) {
                        b4 = false;
                        break Label_0047;
                    }
                }
            }
            b4 = true;
        }
        if (b3 != g) {
            h = e.b.H;
            if (b3 != h) {
                if (b3 != e.b.J || b == h) {
                    final boolean b5 = false;
                    return b4 || b5;
                }
            }
        }
        final boolean b5 = true;
        return b4 || b5;
    }
}
