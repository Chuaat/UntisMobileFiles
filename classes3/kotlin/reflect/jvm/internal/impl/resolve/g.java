// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.renderer.e;
import kotlin.reflect.jvm.internal.impl.renderer.a;
import kotlin.j2;
import kotlin.reflect.jvm.internal.impl.renderer.f;
import n6.l;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.Comparator;

public class g implements Comparator<m>
{
    public static final g G;
    private static final c H;
    
    static {
        G = new g();
        H = c.a.b((l<? super f, j2>)new l<f, j2>() {
            public j2 a(final f f) {
                f.e(false);
                f.f(true);
                f.n(a.J);
                f.c(e.J);
                return j2.a;
            }
        });
    }
    
    private g() {
    }
    
    public int a(final m m, final m i) {
        final Integer a = c(m, i);
        if (a != null) {
            return a;
        }
        if (m instanceof a1 && i instanceof a1) {
            final a1 a2 = (a1)m;
            final a1 a3 = (a1)i;
            final c h = g.H;
            final int compareTo = h.y(a2.k0()).compareTo(h.y(a3.k0()));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        else if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.a && i instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
            final kotlin.reflect.jvm.internal.impl.descriptors.a a4 = (kotlin.reflect.jvm.internal.impl.descriptors.a)m;
            final kotlin.reflect.jvm.internal.impl.descriptors.a a5 = (kotlin.reflect.jvm.internal.impl.descriptors.a)i;
            final t0 q0 = a4.q0();
            final t0 q2 = a5.q0();
            if (q0 != null) {
                final c h2 = g.H;
                final int compareTo2 = h2.y(((d1)q0).a()).compareTo(h2.y(((d1)q2).a()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            final List j = a4.m();
            final List k = a5.m();
            for (int l = 0; l < Math.min(j.size(), k.size()); ++l) {
                final c h3 = g.H;
                final int compareTo3 = h3.y(((d1)j.get(l)).a()).compareTo(h3.y(((d1)k.get(l)).a()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
            }
            final int n = j.size() - k.size();
            if (n != 0) {
                return n;
            }
            final List typeParameters = a4.getTypeParameters();
            final List typeParameters2 = a5.getTypeParameters();
            for (int n2 = 0; n2 < Math.min(typeParameters.size(), typeParameters2.size()); ++n2) {
                final List upperBounds = typeParameters.get(n2).getUpperBounds();
                final List upperBounds2 = typeParameters2.get(n2).getUpperBounds();
                final int n3 = upperBounds.size() - upperBounds2.size();
                if (n3 != 0) {
                    return n3;
                }
                for (int n4 = 0; n4 < upperBounds.size(); ++n4) {
                    final c h4 = g.H;
                    final int compareTo4 = h4.y(upperBounds.get(n4)).compareTo(h4.y(upperBounds2.get(n4)));
                    if (compareTo4 != 0) {
                        return compareTo4;
                    }
                }
            }
            final int n5 = typeParameters.size() - typeParameters2.size();
            if (n5 != 0) {
                return n5;
            }
            if (a4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b && a5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                final int n6 = ((Enum)((kotlin.reflect.jvm.internal.impl.descriptors.b)a4).n()).ordinal() - ((Enum)((kotlin.reflect.jvm.internal.impl.descriptors.b)a5).n()).ordinal();
                if (n6 != 0) {
                    return n6;
                }
            }
        }
        else {
            final boolean b = m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
            int n7 = 1;
            if (!b || !(i instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                throw new AssertionError((Object)String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", m, m.getClass(), i, i.getClass()));
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.e e = (kotlin.reflect.jvm.internal.impl.descriptors.e)m;
            final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = (kotlin.reflect.jvm.internal.impl.descriptors.e)i;
            if (((Enum)e.n()).ordinal() != ((Enum)e2.n()).ordinal()) {
                return ((Enum)e.n()).ordinal() - ((Enum)e2.n()).ordinal();
            }
            if (e.G() != e2.G()) {
                if (!e.G()) {
                    n7 = -1;
                }
                return n7;
            }
        }
        final c h5 = g.H;
        final int compareTo5 = h5.s(m).compareTo(h5.s(i));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        return ((f0)d.g(m)).getName().f(((f0)d.g(i)).getName());
    }
    
    public static class b implements Comparator<m>
    {
        public static final b G;
        
        static {
            G = new b();
        }
        
        private b() {
        }
        
        @org.jetbrains.annotations.f
        private static Integer c(final m m, final m i) {
            final int j = d(i) - d(m);
            if (j != 0) {
                return j;
            }
            if (d.B(m) && d.B(i)) {
                return 0;
            }
            final int f = ((f0)m).getName().f(((f0)i).getName());
            if (f != 0) {
                return f;
            }
            return null;
        }
        
        private static int d(final m m) {
            if (d.B(m)) {
                return 8;
            }
            if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.l) {
                return 7;
            }
            if (m instanceof q0) {
                if (((kotlin.reflect.jvm.internal.impl.descriptors.a)m).q0() == null) {
                    return 6;
                }
                return 5;
            }
            else if (m instanceof y) {
                if (((kotlin.reflect.jvm.internal.impl.descriptors.a)m).q0() == null) {
                    return 4;
                }
                return 3;
            }
            else {
                if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    return 2;
                }
                if (m instanceof a1) {
                    return 1;
                }
                return 0;
            }
        }
        
        public int b(final m m, final m i) {
            final Integer c = c(m, i);
            int intValue;
            if (c != null) {
                intValue = c;
            }
            else {
                intValue = 0;
            }
            return intValue;
        }
    }
}
