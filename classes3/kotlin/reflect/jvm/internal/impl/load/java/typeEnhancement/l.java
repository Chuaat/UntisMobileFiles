// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.a0;
import kotlin.reflect.jvm.internal.impl.types.y0;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.jvm.internal.w;
import java.util.Collection;
import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.load.java.d0;
import java.util.Iterator;
import kotlin.s0;
import kotlin.n1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import java.util.List;
import kotlin.jvm.internal.m0;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.load.kotlin.v;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.a$a;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import kotlin.reflect.jvm.internal.impl.load.java.z;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.c;

public final class l
{
    @e
    private final kotlin.reflect.jvm.internal.impl.load.java.c a;
    @e
    private final kotlin.reflect.jvm.internal.impl.utils.e b;
    @e
    private final d c;
    
    public l(@e final kotlin.reflect.jvm.internal.impl.load.java.c a, @e final kotlin.reflect.jvm.internal.impl.utils.e b, @e final d c) {
        k0.p((Object)a, "annotationTypeQualifierResolver");
        k0.p((Object)b, "javaTypeEnhancementState");
        k0.p((Object)c, "typeEnhancement");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.c a(final l l) {
        return l.a;
    }
    
    public static final /* synthetic */ d b(final l l) {
        return l.c;
    }
    
    private final i c(final kotlin.reflect.jvm.internal.impl.name.b b, final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c, final boolean b2) {
        i j;
        if (z.l().contains(b)) {
            j = new i(h.G, b2);
        }
        else if (z.k().contains(b)) {
            j = new i(h.H, b2);
        }
        else if (k0.g((Object)b, (Object)z.f())) {
            j = this.j(c, b2);
        }
        else if (k0.g((Object)b, (Object)z.d()) && this.b.c()) {
            j = new i(h.G, b2);
        }
        else if (k0.g((Object)b, (Object)z.c()) && this.b.c()) {
            j = new i(h.H, b2);
        }
        else if (k0.g((Object)b, (Object)z.a())) {
            j = new i(h.H, true);
        }
        else if (k0.g((Object)b, (Object)z.b())) {
            j = new i(h.G, true);
        }
        else {
            j = null;
        }
        return j;
    }
    
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> D d(final D n, final g g) {
        if (!(n instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.b)) {
            return n;
        }
        final kotlin.reflect.jvm.internal.impl.load.java.descriptors.b b = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.b)n;
        if (((kotlin.reflect.jvm.internal.impl.descriptors.b)b).n() == b$a.H && ((kotlin.reflect.jvm.internal.impl.descriptors.b)b).b().g().size() == 1) {
            return n;
        }
        final g h = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.h(g, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)n).getAnnotations());
        Object s2 = null;
        Label_0118: {
            if (n instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.g) {
                final kotlin.reflect.jvm.internal.impl.load.java.descriptors.g g2 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.g)n;
                final kotlin.reflect.jvm.internal.impl.descriptors.impl.c0 s0 = g2.S0();
                Object value;
                if (s0 == null) {
                    value = null;
                }
                else {
                    value = ((a0)s0).Y();
                }
                if (k0.g(value, (Object)Boolean.FALSE)) {
                    s2 = g2.S0();
                    k0.m(s2);
                    break Label_0118;
                }
            }
            s2 = n;
        }
        final kotlin.reflect.jvm.internal.impl.load.java.descriptors.b b2 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.b)n;
        Object f;
        if (((kotlin.reflect.jvm.internal.impl.descriptors.a)b2).q0() != null) {
            Object o;
            if (!(s2 instanceof y)) {
                o = null;
            }
            else {
                o = s2;
            }
            final y y = (y)o;
            e1 e1;
            if (y == null) {
                e1 = null;
            }
            else {
                e1 = (e1)((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m0((a$a)kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.l0);
            }
            f = l.b.f(this.n(n, e1, h, (n6.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends c0>)l$d.G), null, 1, null);
        }
        else {
            f = null;
        }
        Object o2;
        if (n instanceof f) {
            o2 = n;
        }
        else {
            o2 = null;
        }
        k k = null;
        Label_0276: {
            if (o2 != null) {
                final String a = kotlin.reflect.jvm.internal.impl.load.kotlin.s.a(v.a, (kotlin.reflect.jvm.internal.impl.descriptors.e)((kotlin.reflect.jvm.internal.impl.descriptors.impl.k)o2).c(), t.c((y)o2, false, false, 3, null));
                if (a != null) {
                    k = j.d().get(a);
                    break Label_0276;
                }
            }
            k = null;
        }
        if (k != null) {
            k.a().size();
            ((kotlin.reflect.jvm.internal.impl.descriptors.a)b2).m().size();
        }
        final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)s2).m();
        k0.o((Object)m, "annotationOwnerForMember.valueParameters");
        final ArrayList list = new ArrayList<c>(kotlin.collections.v.Y((Iterable)m, 10));
        for (final e1 e2 : m) {
            final b n2 = this.n(n, e2, h, (n6.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends c0>)new n6.l<kotlin.reflect.jvm.internal.impl.descriptors.b, c0>() {
                @e
                public final c0 a(@e final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
                    k0.p((Object)b, "it");
                    final c0 a = ((d1)((kotlin.reflect.jvm.internal.impl.descriptors.a)b).m().get(e2.i())).a();
                    k0.o((Object)a, "it.valueParameters[p.index].type");
                    return a;
                }
            });
            s s3 = null;
            Label_0433: {
                if (k != null) {
                    final List<s> a2 = k.a();
                    if (a2 != null) {
                        s3 = (s)kotlin.collections.v.J2((List)a2, e2.i());
                        break Label_0433;
                    }
                }
                s3 = null;
            }
            final a e3 = n2.e(s3);
            c0 c0;
            if (e3.c()) {
                c0 = e3.b();
            }
            else {
                c0 = ((d1)e2).a();
                k0.o((Object)c0, "p.type");
            }
            k0.o((Object)e2, "p");
            final boolean i = this.k(e2, c0);
            list.add(new c(e3.b(), i, e3.c() || i != e2.x0(), e3.a()));
        }
        Object o3;
        if (!(n instanceof q0)) {
            o3 = null;
        }
        else {
            o3 = n;
        }
        final q0 q0 = (q0)o3;
        Object value2;
        if (q0 == null) {
            value2 = null;
        }
        else {
            value2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(q0);
        }
        final Boolean true = Boolean.TRUE;
        kotlin.reflect.jvm.internal.impl.load.java.a a3;
        if (k0.g(value2, (Object)true)) {
            a3 = kotlin.reflect.jvm.internal.impl.load.java.a.J;
        }
        else {
            a3 = kotlin.reflect.jvm.internal.impl.load.java.a.H;
        }
        final b j = this.m(n, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)s2, true, h, a3, (n6.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends c0>)l$e.G);
        s b3;
        if (k == null) {
            b3 = null;
        }
        else {
            b3 = k.b();
        }
        final a e4 = j.e(b3);
        Object value3;
        if (f == null) {
            value3 = null;
        }
        else {
            value3 = ((a)f).a();
        }
        boolean b5 = false;
        Label_0773: {
            if (!k0.g(value3, (Object)true) && !e4.a()) {
                boolean b4 = false;
                Label_0756: {
                    if (!list.isEmpty()) {
                        final Iterator<c> iterator2 = (Iterator<c>)list.iterator();
                        while (iterator2.hasNext()) {
                            if (((a)iterator2.next()).a()) {
                                b4 = true;
                                break Label_0756;
                            }
                        }
                    }
                    b4 = false;
                }
                if (!b4) {
                    b5 = false;
                    break Label_0773;
                }
            }
            b5 = true;
        }
        Object value4;
        if (f == null) {
            value4 = null;
        }
        else {
            value4 = ((a)f).c();
        }
        if (!k0.g(value4, (Object)Boolean.TRUE) && !e4.c()) {
            boolean b6 = false;
            Label_0859: {
                if (!list.isEmpty()) {
                    final Iterator<c> iterator3 = (Iterator<c>)list.iterator();
                    while (iterator3.hasNext()) {
                        if (((a)iterator3.next()).c()) {
                            b6 = true;
                            break Label_0859;
                        }
                    }
                }
                b6 = false;
            }
            if (!b6) {
                if (!b5) {
                    return n;
                }
            }
        }
        s0 a4;
        if (b5) {
            a4 = n1.a((Object)kotlin.reflect.jvm.internal.impl.resolve.deprecation.a.a(), (Object)new kotlin.reflect.jvm.internal.impl.load.java.k((m)n));
        }
        else {
            a4 = null;
        }
        c0 b7;
        if (f == null) {
            b7 = null;
        }
        else {
            b7 = ((a)f).b();
        }
        final ArrayList list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.load.java.descriptors.l>(kotlin.collections.v.Y((Iterable)list, 10));
        for (final c c2 : list) {
            list2.add(new kotlin.reflect.jvm.internal.impl.load.java.descriptors.l(((a)c2).b(), c2.d()));
        }
        return (D)b2.F(b7, (List<kotlin.reflect.jvm.internal.impl.load.java.descriptors.l>)list2, e4.b(), (s0<a$a<?>, ?>)a4);
    }
    
    private final i i(final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c, final boolean b, final boolean b2) {
        final kotlin.reflect.jvm.internal.impl.name.b f = c.f();
        if (f == null) {
            return null;
        }
        final boolean b3 = c instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e && (((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e)c).m() || b2) && !b;
        i i;
        if ((i = this.l(f)) == null && (i = this.c(f, c, b3)) == null) {
            return null;
        }
        i b4 = i;
        if (!i.d()) {
            b4 = i;
            if (c instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.i) {
                b4 = i;
                if (((kotlin.reflect.jvm.internal.impl.load.java.descriptors.i)c).d()) {
                    b4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i.b(i, null, true, 1, null);
                }
            }
        }
        return b4;
    }
    
    private final i j(final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c, final boolean b) {
        final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> b2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.b(c);
        final boolean b3 = b2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.j;
        final i i = null;
        kotlin.reflect.jvm.internal.impl.resolve.constants.j j;
        if (b3) {
            j = (kotlin.reflect.jvm.internal.impl.resolve.constants.j)b2;
        }
        else {
            j = null;
        }
        if (j == null) {
            return new i(h.H, b);
        }
        final String d = j.c().d();
        switch (d.hashCode()) {
            default: {
                return i;
            }
            case 1933739535: {
                if (!d.equals("ALWAYS")) {
                    return i;
                }
                return new i(h.H, b);
            }
            case 433141802: {
                if (!d.equals("UNKNOWN")) {
                    return i;
                }
                return new i(h.I, b);
            }
            case 74175084: {
                if (!d.equals("NEVER")) {
                    return i;
                }
                break;
            }
            case 73135176: {
                if (!d.equals("MAYBE")) {
                    return i;
                }
                break;
            }
        }
        return new i(h.G, b);
    }
    
    private final boolean k(final e1 e1, final c0 c0) {
        final kotlin.reflect.jvm.internal.impl.load.java.descriptors.a b = kotlin.reflect.jvm.internal.impl.load.java.descriptors.k.b(e1);
        final boolean b2 = b instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.j;
        final boolean b3 = true;
        boolean b4;
        if (b2) {
            b4 = (d0.a(c0, ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.j)b).a()) != null);
        }
        else if (k0.g((Object)b, (Object)kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.a)) {
            b4 = f1.b(c0);
        }
        else {
            if (b != null) {
                throw new h0();
            }
            b4 = e1.x0();
        }
        return b4 && e1.g().isEmpty() && b3;
    }
    
    private final i l(final kotlin.reflect.jvm.internal.impl.name.b b) {
        final kotlin.reflect.jvm.internal.impl.utils.h e = this.b.e();
        final kotlin.reflect.jvm.internal.impl.utils.h i = kotlin.reflect.jvm.internal.impl.utils.h.I;
        i j = null;
        if (e == i) {
            return null;
        }
        final boolean b2 = this.b.e() == kotlin.reflect.jvm.internal.impl.utils.h.J;
        if (k0.g((Object)b, (Object)z.h())) {
            j = new i(h.G, b2);
        }
        else if (k0.g((Object)b, (Object)z.i())) {
            j = new i(h.I, b2);
        }
        return j;
    }
    
    private final b m(final kotlin.reflect.jvm.internal.impl.descriptors.b b, final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a a, final boolean b2, final g g, final kotlin.reflect.jvm.internal.impl.load.java.a a2, final n6.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends c0> l) {
        final c0 c0 = (c0)l.invoke((Object)b);
        final Collection g2 = b.g();
        k0.o((Object)g2, "this.overriddenDescriptors");
        final ArrayList list = new ArrayList<c0>(kotlin.collections.v.Y((Iterable)g2, 10));
        for (final kotlin.reflect.jvm.internal.impl.descriptors.b b3 : g2) {
            k0.o((Object)b3, "it");
            list.add((c0)l.invoke((Object)b3));
        }
        return new b(a, c0, list, b2, a.h(g, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)l.invoke((Object)b)).getAnnotations()), a2, false, 64, null);
    }
    
    private final b n(final kotlin.reflect.jvm.internal.impl.descriptors.b b, final e1 e1, g g, final n6.l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, ? extends c0> l) {
        if (e1 != null) {
            final g h = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.h(g, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e1).getAnnotations());
            if (h != null) {
                g = h;
            }
        }
        return this.m(b, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e1, false, g, kotlin.reflect.jvm.internal.impl.load.java.a.I, l);
    }
    
    @e
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<D> e(@e final g g, @e final Collection<? extends D> collection) {
        k0.p((Object)g, "c");
        k0.p((Object)collection, "platformSignatures");
        final ArrayList<D> list = new ArrayList<D>(kotlin.collections.v.Y((Iterable)collection, 10));
        final Iterator<D> iterator = collection.iterator();
        while (iterator.hasNext()) {
            list.add(this.d((D)iterator.next(), g));
        }
        return list;
    }
    
    @e
    public final c0 f(@e final c0 c0, @e final g g) {
        k0.p((Object)c0, "type");
        k0.p((Object)g, "context");
        return l.b.f(new b(null, c0, kotlin.collections.v.E(), false, g, kotlin.reflect.jvm.internal.impl.load.java.a.K, false, 64, null), null, 1, null).b();
    }
    
    @e
    public final List<c0> g(@e final b1 b1, @e final List<? extends c0> list, @e final g g) {
        k0.p((Object)b1, "typeParameter");
        k0.p((Object)list, "bounds");
        k0.p((Object)g, "context");
        final ArrayList<c0> list2 = new ArrayList<c0>(kotlin.collections.v.Y((Iterable)list, 10));
        for (c0 b2 : list) {
            if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.b(b2, (n6.l<? super j1, Boolean>)l$g.G)) {
                b2 = l.b.f(new b((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)b1, b2, kotlin.collections.v.E(), false, g, kotlin.reflect.jvm.internal.impl.load.java.a.L, true), null, 1, null).b();
            }
            list2.add(b2);
        }
        return list2;
    }
    
    @org.jetbrains.annotations.f
    public final i h(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c, final boolean b, final boolean b2) {
        k0.p((Object)c, "annotationDescriptor");
        final i i = this.i(c, b, b2);
        if (i != null) {
            return i;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c m = this.a.m(c);
        final i j = null;
        if (m == null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.utils.h k = this.a.j(c);
        if (k.d()) {
            return null;
        }
        final i l = this.i(m, b, b2);
        i b3;
        if (l == null) {
            b3 = j;
        }
        else {
            b3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i.b(l, null, k.f(), 1, null);
        }
        return b3;
    }
    
    private static class a
    {
        @e
        private final c0 a;
        private final boolean b;
        private final boolean c;
        
        public a(@e final c0 a, final boolean b, final boolean c) {
            k0.p((Object)a, "type");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public final boolean a() {
            return this.c;
        }
        
        @e
        public final c0 b() {
            return this.a;
        }
        
        public final boolean c() {
            return this.b;
        }
    }
    
    private final class b
    {
        @org.jetbrains.annotations.f
        private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a a;
        @e
        private final c0 b;
        @e
        private final Collection<c0> c;
        private final boolean d;
        @e
        private final g e;
        @e
        private final kotlin.reflect.jvm.internal.impl.load.java.a f;
        private final boolean g;
        
        public b(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a a, @e final c0 b, final Collection<? extends c0> c, @e final boolean d, @e final g e, final kotlin.reflect.jvm.internal.impl.load.java.a f, final boolean g) {
            k0.p((Object)l.this, "this$0");
            k0.p((Object)b, "fromOverride");
            k0.p((Object)c, "fromOverridden");
            k0.p((Object)e, "containerContext");
            k0.p((Object)f, "containerApplicabilityType");
            this.a = a;
            this.b = b;
            this.c = (Collection<c0>)c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        private final h a(final b1 b1) {
            final boolean b2 = b1 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m;
            final h h = null;
            if (!b2) {
                return null;
            }
            final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m m = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m)b1;
            final List upperBounds = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.e)m).getUpperBounds();
            k0.o((Object)upperBounds, "upperBounds");
            final boolean b3 = upperBounds instanceof Collection;
            final boolean b4 = false;
            boolean b5 = false;
            Label_0098: {
                if (!b3 || !upperBounds.isEmpty()) {
                    final Iterator<c0> iterator = (Iterator<c0>)upperBounds.iterator();
                    while (iterator.hasNext()) {
                        if (!e0.a(iterator.next())) {
                            b5 = false;
                            break Label_0098;
                        }
                    }
                }
                b5 = true;
            }
            h h2;
            if (b5) {
                h2 = h;
            }
            else {
                final List upperBounds2 = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.e)m).getUpperBounds();
                k0.o((Object)upperBounds2, "upperBounds");
                boolean b6 = false;
                Label_0183: {
                    if (!(upperBounds2 instanceof Collection) || !upperBounds2.isEmpty()) {
                        final Iterator<c0> iterator2 = (Iterator<c0>)upperBounds2.iterator();
                        while (iterator2.hasNext()) {
                            if (!n.a(iterator2.next())) {
                                b6 = false;
                                break Label_0183;
                            }
                        }
                    }
                    b6 = true;
                }
                if (b6) {
                    h2 = h;
                }
                else {
                    final List upperBounds3 = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.e)m).getUpperBounds();
                    k0.o((Object)upperBounds3, "upperBounds");
                    int n = 0;
                    Label_0275: {
                        if (upperBounds3 instanceof Collection && upperBounds3.isEmpty()) {
                            n = (b4 ? 1 : 0);
                        }
                        else {
                            final Iterator<c0> iterator3 = upperBounds3.iterator();
                            c0 c0;
                            do {
                                n = (b4 ? 1 : 0);
                                if (!iterator3.hasNext()) {
                                    break Label_0275;
                                }
                                c0 = iterator3.next();
                                k0.o((Object)c0, "it");
                            } while (!(e0.b(c0) ^ true));
                            n = 1;
                        }
                    }
                    if (n != 0) {
                        h2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.H;
                    }
                    else {
                        h2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.G;
                    }
                }
            }
            return h2;
        }
        
        private final n6.l<Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> b() {
            final Collection<c0> c = this.c;
            final ArrayList list = new ArrayList<List>(kotlin.collections.v.Y((Iterable)c, 10));
            final Iterator<Object> iterator = c.iterator();
            while (iterator.hasNext()) {
                list.add(this.o(iterator.next()));
            }
            final List<o> o = this.o(this.b);
            boolean b2 = false;
            Label_0165: {
                if (this.d) {
                    final Collection<c0> c2 = this.c;
                    boolean b = false;
                    Label_0151: {
                        if (!(c2 instanceof Collection) || !c2.isEmpty()) {
                            final Iterator<Object> iterator2 = c2.iterator();
                            while (iterator2.hasNext()) {
                                if (kotlin.reflect.jvm.internal.impl.types.checker.f.a.b(iterator2.next(), this.b) ^ true) {
                                    b = true;
                                    break Label_0151;
                                }
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        b2 = true;
                        break Label_0165;
                    }
                }
                b2 = false;
            }
            int size;
            if (b2) {
                size = 1;
            }
            else {
                size = o.size();
            }
            final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e[] array = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e[size];
            for (int i = 0; i < size; ++i) {
                final boolean b3 = i == 0;
                final o o2 = o.get(i);
                final c0 a = o2.a();
                final kotlin.reflect.jvm.internal.impl.load.java.s b4 = o2.b();
                final b1 c3 = o2.c();
                final boolean d = o2.d();
                final ArrayList<c0> list2 = new ArrayList<c0>();
                final Iterator<List> iterator3 = list.iterator();
                while (iterator3.hasNext()) {
                    final o o3 = (o)kotlin.collections.v.J2((List)iterator3.next(), i);
                    c0 e;
                    if (o3 == null) {
                        e = null;
                    }
                    else {
                        e = o3.e();
                    }
                    if (e != null) {
                        list2.add(e);
                    }
                }
                array[i] = this.d(a, list2, b4, b3, c3, d);
            }
            return (n6.l<Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e>)new n6.l<Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e>() {
                @e
                public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e a(final int n) {
                    final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e[] g = array;
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e a;
                    if (n >= 0 && n <= kotlin.collections.m.Td((Object[])g)) {
                        a = g[n];
                    }
                    else {
                        a = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e.e.a();
                    }
                    return a;
                }
            };
        }
        
        private final i c(i e, final kotlin.reflect.jvm.internal.impl.load.java.s s, final b1 b1) {
            i i = e;
            Label_0046: {
                if (e == null) {
                    if (s != null) {
                        e = s.e();
                        if (e != null) {
                            i = new i(e.c(), e.d());
                            break Label_0046;
                        }
                    }
                    i = null;
                }
            }
            h a;
            if (b1 == null) {
                a = null;
            }
            else {
                a = this.a(b1);
            }
            if (a == null) {
                return i;
            }
            if (i == null) {
                return new i(a, false, 2, null);
            }
            return new i(this.m(a, i.c()), false, 2, null);
        }
        
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e d(final c0 c0, final Collection<? extends c0> collection, final kotlin.reflect.jvm.internal.impl.load.java.s s, final boolean b, final b1 b2, final boolean b3) {
            final ArrayList<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> list = (ArrayList<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e>)new ArrayList<Object>(kotlin.collections.v.Y((Iterable)collection, 10));
            final Iterator<c0> iterator = collection.iterator();
            while (iterator.hasNext()) {
                list.add(this.h(iterator.next()));
            }
            final ArrayList<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f> list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f>();
            final Iterator<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f b4 = iterator2.next().b();
                if (b4 != null) {
                    list2.add(b4);
                }
            }
            final Set n5 = kotlin.collections.v.N5((Iterable)list2);
            final ArrayList<h> list3 = new ArrayList<h>();
            final Iterator<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> iterator3 = list.iterator();
            while (iterator3.hasNext()) {
                final h c2 = iterator3.next().c();
                if (c2 != null) {
                    list3.add(c2);
                }
            }
            final Set n6 = kotlin.collections.v.N5((Iterable)list3);
            final ArrayList<h> list4 = new ArrayList<h>();
            final Iterator<c0> iterator4 = collection.iterator();
            while (iterator4.hasNext()) {
                final h c3 = this.h(h1.c(iterator4.next())).c();
                if (c3 != null) {
                    list4.add(c3);
                }
            }
            final Set n7 = kotlin.collections.v.N5((Iterable)list4);
            final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e i = this.i(c0, b, s, b2, b3);
            final boolean e = i.e();
            final boolean b5 = true;
            h h = null;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e e2;
            if (e ^ true) {
                e2 = i;
            }
            else {
                e2 = null;
            }
            h c4;
            if (e2 == null) {
                c4 = null;
            }
            else {
                c4 = e2.c();
            }
            final h c5 = i.c();
            final boolean b6 = this.d && b;
            final h d = r.d(n6, c4, b6);
            if (d != null) {
                if (!this.l() || !b || d != kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.G) {
                    h = d;
                }
            }
            final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f f = r.c(n5, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.H, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.G, i.b(), b6);
            final boolean b7 = c5 != c4 || !k0.g((Object)n7, (Object)n6);
            boolean b9 = false;
            Label_0524: {
                if (!i.d()) {
                    boolean b8 = false;
                    Label_0507: {
                        if (!list.isEmpty()) {
                            final Iterator<Object> iterator5 = list.iterator();
                            while (iterator5.hasNext()) {
                                if (iterator5.next().d()) {
                                    b8 = true;
                                    break Label_0507;
                                }
                            }
                        }
                        b8 = false;
                    }
                    if (!b8) {
                        b9 = false;
                        break Label_0524;
                    }
                }
                b9 = true;
            }
            if (h == null && b7) {
                return r.a(r.d(n7, c5, b6), f, true, b9);
            }
            return r.a(h, f, h == null && b5, b9);
        }
        
        public static /* synthetic */ a f(final b b, s s, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                s = null;
            }
            return b.e(s);
        }
        
        private final i g(final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, final boolean b, final boolean b2) {
            final l h = l.this;
            final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator = ((Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)g).iterator();
            while (iterator.hasNext()) {
                final i h2 = h.h(iterator.next(), b, b2);
                if (h2 != null) {
                    return h2;
                }
            }
            return null;
        }
        
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e h(final c0 c0) {
            s0 s0;
            if (kotlin.reflect.jvm.internal.impl.types.z.b(c0)) {
                final kotlin.reflect.jvm.internal.impl.types.w a = kotlin.reflect.jvm.internal.impl.types.z.a(c0);
                s0 = new s0((Object)a.V0(), (Object)a.W0());
            }
            else {
                s0 = new s0((Object)c0, (Object)c0);
            }
            final c0 c2 = (c0)s0.a();
            final c0 c3 = (c0)s0.b();
            final kotlin.reflect.jvm.internal.impl.builtins.jvm.d a2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.a;
            h h2 = null;
            Label_0098: {
                h h;
                if (c2.O0()) {
                    h = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.G;
                }
                else {
                    if (c3.O0()) {
                        h2 = null;
                        break Label_0098;
                    }
                    h = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.H;
                }
                h2 = h;
            }
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f f;
            if (a2.f(c2)) {
                f = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.G;
            }
            else if (a2.d(c3)) {
                f = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.H;
            }
            else {
                f = null;
            }
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e(h2, f, c0.Q0() instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g, false, 8, null);
        }
        
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e i(final c0 c0, final boolean b, kotlin.reflect.jvm.internal.impl.load.java.s a, final b1 b2, final boolean b3) {
            final boolean b4 = this.e.a().p().b();
            final boolean b5 = true;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g2 = null;
            Label_0228: {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g = null;
                Label_0204: {
                    if (b) {
                        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a a2 = this.a;
                        if (a2 != null && !(a2 instanceof b1) && b4) {
                            final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = a2.getAnnotations();
                            final l h = l.this;
                            final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>();
                            for (final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c next : annotations) {
                                final kotlin.reflect.jvm.internal.impl.load.java.c.a h2 = l.a(h).h(next);
                                if (h2 != null && !h2.b().contains(kotlin.reflect.jvm.internal.impl.load.java.a.K)) {
                                    list.add(next);
                                }
                            }
                            g = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.a((List)list);
                            break Label_0204;
                        }
                    }
                    if (b) {
                        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a a3 = this.a;
                        if (a3 != null) {
                            g = a3.getAnnotations();
                            break Label_0204;
                        }
                    }
                    g2 = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations();
                    break Label_0228;
                }
                g2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.i.a(g, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations());
            }
            final Object o = null;
            if (b) {
                final kotlin.reflect.jvm.internal.impl.load.java.w b6 = this.e.b();
                if (b6 == null) {
                    a = null;
                }
                else {
                    a = b6.a(this.f);
                }
            }
            kotlin.reflect.jvm.internal.impl.load.java.s s;
            if (a != null && (a.c() || !kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(c0))) {
                s = a;
            }
            else {
                s = null;
            }
            final s0<i, Boolean> n = this.n(c0);
            final i i = (i)n.a();
            final boolean booleanValue = (boolean)n.b();
            i g3 = this.g(g2, b4, this.g);
            if (g3 == null || b3) {
                g3 = null;
            }
            i c2;
            if (g3 == null) {
                c2 = this.c(i, s, b2);
            }
            else {
                c2 = g3;
            }
            boolean b7 = false;
            Label_0439: {
                Label_0436: {
                    if (g3 != null) {
                        if (g3.c() == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.H) {
                            break Label_0436;
                        }
                    }
                    else {
                        if (booleanValue) {
                            break Label_0436;
                        }
                        Object value;
                        if (s == null) {
                            value = null;
                        }
                        else {
                            value = s.d();
                        }
                        if (k0.g(value, (Object)Boolean.TRUE)) {
                            break Label_0436;
                        }
                    }
                    b7 = false;
                    break Label_0439;
                }
                b7 = true;
            }
            h c3;
            if (c2 == null) {
                c3 = null;
            }
            else {
                c3 = c2.c();
            }
            final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f f = k((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f)j(z.m(), g2, (T)kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.G), (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f)j(z.j(), g2, (T)kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f.H));
            final boolean b8 = b7 && kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(c0) && b5;
            Object value2;
            if (c2 == null) {
                value2 = o;
            }
            else {
                value2 = c2.d();
            }
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e(c3, f, b8, k0.g(value2, (Object)Boolean.TRUE));
        }
        
        private static final <T> T j(final List<kotlin.reflect.jvm.internal.impl.name.b> list, final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, T t) {
            final boolean b = list instanceof Collection;
            final int n = 1;
            int n2 = 0;
            Label_0079: {
                if (!b || !list.isEmpty()) {
                    final Iterator<kotlin.reflect.jvm.internal.impl.name.b> iterator = (Iterator<kotlin.reflect.jvm.internal.impl.name.b>)list.iterator();
                    while (iterator.hasNext()) {
                        if (g.a0((kotlin.reflect.jvm.internal.impl.name.b)iterator.next()) != null) {
                            n2 = n;
                            break Label_0079;
                        }
                    }
                }
                n2 = 0;
            }
            if (n2 == 0) {
                t = null;
            }
            return t;
        }
        
        private static final <T> T k(final T t, final T t2) {
            T t3;
            if (t != null && t2 != null && !k0.g((Object)t, (Object)t2)) {
                t3 = null;
            }
            else if ((t3 = t) == null) {
                t3 = t2;
            }
            return t3;
        }
        
        private final boolean l() {
            Object a = this.a;
            final boolean b = a instanceof e1;
            final c0 c0 = null;
            if (!b) {
                a = null;
            }
            final e1 e1 = (e1)a;
            c0 p0;
            if (e1 == null) {
                p0 = c0;
            }
            else {
                p0 = e1.p0();
            }
            return p0 != null;
        }
        
        private final h m(h h, final h h2) {
            final h i = h.I;
            if (h == i) {
                return h2;
            }
            if (h2 == i) {
                return h;
            }
            final h g = h.G;
            if (h == g) {
                return h2;
            }
            if (h2 == g) {
                return h;
            }
            if (h == h2) {
                h = h.H;
            }
            return h.H;
        }
        
        private final s0<i, Boolean> n(final c0 c0) {
            final kotlin.reflect.jvm.internal.impl.descriptors.h c2 = c0.N0().c();
            b1 b1;
            if (c2 instanceof b1) {
                b1 = (b1)c2;
            }
            else {
                b1 = null;
            }
            h a;
            if (b1 == null) {
                a = null;
            }
            else {
                a = this.a(b1);
            }
            if (a == null) {
                return (s0<i, Boolean>)new s0((Object)null, (Object)Boolean.FALSE);
            }
            final h h = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.H;
            boolean b2 = false;
            final i i = new i(h, false, 2, null);
            if (a == h) {
                b2 = true;
            }
            return (s0<i, Boolean>)new s0((Object)i, (Object)b2);
        }
        
        private final List<o> o(final c0 c0) {
            final ArrayList<o> list = new ArrayList<o>(1);
            p(this, list, c0, this.e, null);
            return list;
        }
        
        private static final void p(final b b, final ArrayList<o> list, final c0 c0, final g g, b1 b2) {
            final g h = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.h(g, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations());
            final kotlin.reflect.jvm.internal.impl.load.java.w b3 = h.b();
            kotlin.reflect.jvm.internal.impl.load.java.s a;
            if (b3 == null) {
                a = null;
            }
            else {
                kotlin.reflect.jvm.internal.impl.load.java.a a2;
                if (b.g) {
                    a2 = kotlin.reflect.jvm.internal.impl.load.java.a.L;
                }
                else {
                    a2 = kotlin.reflect.jvm.internal.impl.load.java.a.K;
                }
                a = b3.a(a2);
            }
            list.add(new o(c0, a, b2, false));
            final List<y0> m0 = c0.M0();
            final List<b1> parameters = c0.N0().getParameters();
            k0.o((Object)parameters, "type.constructor.parameters");
            for (final s0 s0 : kotlin.collections.v.V5((Iterable)m0, (Iterable)parameters)) {
                final y0 y0 = (y0)s0.a();
                b2 = (b1)s0.b();
                if (y0.d()) {
                    final c0 a3 = y0.a();
                    k0.o((Object)a3, "arg.type");
                    list.add(new o(a3, a, b2, true));
                }
                else {
                    final c0 a4 = y0.a();
                    k0.o((Object)a4, "arg.type");
                    p(b, list, a4, h, b2);
                }
            }
        }
        
        @e
        public final a e(@org.jetbrains.annotations.f final s s) {
            final n6.l<Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> b = this.b();
            final a a = null;
            Object o;
            if (s == null) {
                o = null;
            }
            else {
                o = new n6.l<Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e>() {
                    @e
                    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e a(final int n) {
                        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e e;
                        if ((e = s.a().get(n)) == null) {
                            e = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e)b.invoke((Object)n);
                        }
                        return e;
                    }
                };
            }
            final boolean c = f1.c(this.b, (n6.l<j1, Boolean>)l$b$b.G);
            final d b2 = l.b(l.this);
            final c0 b3 = this.b;
            if (o == null) {
                o = b;
            }
            final c0 b4 = b2.b(b3, (n6.l<? super Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e>)o);
            a a2;
            if (b4 == null) {
                a2 = a;
            }
            else {
                a2 = new a(b4, true, c);
            }
            Object o2 = a2;
            if (a2 == null) {
                o2 = new a(this.b, false, c);
            }
            return (a)o2;
        }
    }
    
    private static final class c extends a
    {
        private final boolean d;
        
        public c(@e final c0 c0, final boolean d, final boolean b, final boolean b2) {
            k0.p((Object)c0, "type");
            super(c0, b, b2);
            this.d = d;
        }
        
        public final boolean d() {
            return this.d;
        }
    }
}
