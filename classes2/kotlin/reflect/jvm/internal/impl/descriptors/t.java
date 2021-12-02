// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Iterator;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.util.g$a;
import java.util.ServiceLoader;
import kotlin.reflect.jvm.internal.impl.utils.a;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.s;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.util.g;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.e;

public class t
{
    @e
    public static final u a;
    @e
    public static final u b;
    @e
    public static final u c;
    @e
    public static final u d;
    @e
    public static final u e;
    @e
    public static final u f;
    @e
    public static final u g;
    @e
    public static final u h;
    @e
    public static final u i;
    public static final Set<u> j;
    private static final Map<u, Integer> k;
    public static final u l;
    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e m;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e n;
    @Deprecated
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e o;
    @e
    private static final g p;
    @e
    private static final Map<j1, u> q;
    
    static {
        final u u = a = new r(i1.e.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    if (n != 2) {
                        args[0] = "descriptor";
                    }
                    else {
                        args[0] = "from";
                    }
                }
                else {
                    args[0] = "what";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
                if (n != 1 && n != 2) {
                    args[2] = "hasContainingSourceFile";
                }
                else {
                    args[2] = "isVisible";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            private boolean h(@e final m m) {
                boolean b = false;
                if (m == null) {
                    g(0);
                }
                if (kotlin.reflect.jvm.internal.impl.resolve.d.j(m) != x0.a) {
                    b = true;
                }
                return b;
            }
            
            @Override
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e m c) {
                boolean b = true;
                if (q == null) {
                    g(1);
                }
                if (c == null) {
                    g(2);
                }
                if (kotlin.reflect.jvm.internal.impl.resolve.d.J((m)q) && this.h(c)) {
                    return t.f(q, c);
                }
                m m = q;
                if (q instanceof l) {
                    final i c2 = ((l)q).c();
                    m = q;
                    if (kotlin.reflect.jvm.internal.impl.resolve.d.G((m)c2)) {
                        m = q;
                        if (kotlin.reflect.jvm.internal.impl.resolve.d.J((m)c2)) {
                            m = q;
                            if (c instanceof l) {
                                m = q;
                                if (kotlin.reflect.jvm.internal.impl.resolve.d.J(c.c())) {
                                    m = q;
                                    if (t.f(q, c)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
                m i;
                while ((i = m) != null) {
                    final m c3 = m.c();
                    if (c3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                        i = c3;
                        if (!kotlin.reflect.jvm.internal.impl.resolve.d.x(c3)) {
                            break;
                        }
                    }
                    m = c3;
                    if (c3 instanceof h0) {
                        i = c3;
                        break;
                    }
                }
                if (i == null) {
                    return false;
                }
                while (c != null) {
                    if (i == c) {
                        return true;
                    }
                    if (c instanceof h0) {
                        if (!(i instanceof h0) || !((h0)i).f().equals((Object)((h0)c).f()) || !kotlin.reflect.jvm.internal.impl.resolve.d.b(c, i)) {
                            b = false;
                        }
                        return b;
                    }
                    c = c.c();
                }
                return false;
            }
        };
        final u u2 = b = new r(i1.f.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    args[0] = "what";
                }
                else {
                    args[0] = "from";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
                args[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            @Override
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
                if (q == null) {
                    g(0);
                }
                if (m == null) {
                    g(1);
                }
                if (t.a.e(e, q, m)) {
                    if (e == t.n) {
                        return true;
                    }
                    if (e == t.m) {
                        return false;
                    }
                    final m q2 = kotlin.reflect.jvm.internal.impl.resolve.d.q((m)q, (Class)kotlin.reflect.jvm.internal.impl.descriptors.e.class);
                    if (q2 != null && e instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.g) {
                        return ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.g)e).y().b().equals(q2.b());
                    }
                }
                return false;
            }
        };
        final u u3 = c = new r(i1.g.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            args[0] = "what";
                        }
                        else {
                            args[0] = "fromClass";
                        }
                    }
                    else {
                        args[0] = "whatDeclaration";
                    }
                }
                else {
                    args[0] = "from";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
                if (n != 2 && n != 3) {
                    args[2] = "isVisible";
                }
                else {
                    args[2] = "doesReceiverFitForProtectedVisibility";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            private boolean h(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final kotlin.reflect.jvm.internal.impl.descriptors.e e2) {
                if (q == null) {
                    g(2);
                }
                if (e2 == null) {
                    g(3);
                }
                final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e o = t.o;
                final boolean b = false;
                if (e == o) {
                    return false;
                }
                if (!(q instanceof b)) {
                    return true;
                }
                if (q instanceof l) {
                    return true;
                }
                if (e == t.n) {
                    return true;
                }
                boolean b2 = b;
                if (e != t.m) {
                    if (e == null) {
                        b2 = b;
                    }
                    else {
                        c0 c0;
                        if (e instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) {
                            c0 = ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f)e).b();
                        }
                        else {
                            c0 = e.a();
                        }
                        if (!kotlin.reflect.jvm.internal.impl.resolve.d.I(c0, (m)e2)) {
                            b2 = b;
                            if (!s.a(c0)) {
                                return b2;
                            }
                        }
                        b2 = true;
                    }
                }
                return b2;
            }
            
            @Override
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
                if (q == null) {
                    g(0);
                }
                if (m == null) {
                    g(1);
                }
                final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = (kotlin.reflect.jvm.internal.impl.descriptors.e)kotlin.reflect.jvm.internal.impl.resolve.d.q((m)q, (Class)kotlin.reflect.jvm.internal.impl.descriptors.e.class);
                final kotlin.reflect.jvm.internal.impl.descriptors.e e3 = (kotlin.reflect.jvm.internal.impl.descriptors.e)kotlin.reflect.jvm.internal.impl.resolve.d.r(m, (Class)kotlin.reflect.jvm.internal.impl.descriptors.e.class, false);
                if (e3 == null) {
                    return false;
                }
                if (e2 != null && kotlin.reflect.jvm.internal.impl.resolve.d.x((m)e2)) {
                    final kotlin.reflect.jvm.internal.impl.descriptors.e e4 = (kotlin.reflect.jvm.internal.impl.descriptors.e)kotlin.reflect.jvm.internal.impl.resolve.d.q((m)e2, (Class)kotlin.reflect.jvm.internal.impl.descriptors.e.class);
                    if (e4 != null && kotlin.reflect.jvm.internal.impl.resolve.d.H(e3, e4)) {
                        return true;
                    }
                }
                final q i = kotlin.reflect.jvm.internal.impl.resolve.d.M(q);
                final kotlin.reflect.jvm.internal.impl.descriptors.e e5 = (kotlin.reflect.jvm.internal.impl.descriptors.e)kotlin.reflect.jvm.internal.impl.resolve.d.q((m)i, (Class)kotlin.reflect.jvm.internal.impl.descriptors.e.class);
                return e5 != null && ((kotlin.reflect.jvm.internal.impl.resolve.d.H(e3, e5) && this.h(e, i, e3)) || this.e(e, q, e3.c()));
            }
        };
        final u u4 = d = new r(i1.b.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    args[0] = "what";
                }
                else {
                    args[0] = "from";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
                args[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            @Override
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
                if (q == null) {
                    g(0);
                }
                if (m == null) {
                    g(1);
                }
                return kotlin.reflect.jvm.internal.impl.resolve.d.g(m).i0(kotlin.reflect.jvm.internal.impl.resolve.d.g((m)q)) && t.p.a((m)q, m);
            }
        };
        final u l2 = e = new r(i1.h.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    args[0] = "what";
                }
                else {
                    args[0] = "from";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
                args[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            @Override
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
                if (q == null) {
                    g(0);
                }
                if (m == null) {
                    g(1);
                }
                return true;
            }
        };
        final u u5 = f = new r(i1.d.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    args[0] = "what";
                }
                else {
                    args[0] = "from";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
                args[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            @Override
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
                if (q == null) {
                    g(0);
                }
                if (m == null) {
                    g(1);
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        };
        final u u6 = g = new r(i1.a.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    args[0] = "what";
                }
                else {
                    args[0] = "from";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
                args[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            @Override
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
                if (q == null) {
                    g(0);
                }
                if (m == null) {
                    g(1);
                }
                throw new IllegalStateException("Visibility is unknown yet");
            }
        };
        final u u7 = h = new r(i1.c.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    args[0] = "what";
                }
                else {
                    args[0] = "from";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
                args[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            @Override
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
                if (q == null) {
                    g(0);
                }
                if (m == null) {
                    g(1);
                }
                return false;
            }
        };
        final u u8 = i = new r(i1.i.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    args[0] = "what";
                }
                else {
                    args[0] = "from";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
                args[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            @Override
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
                if (q == null) {
                    g(0);
                }
                if (m == null) {
                    g(1);
                }
                return false;
            }
        };
        final Integer value = 0;
        final Integer value2 = 1;
        j = Collections.unmodifiableSet((Set<?>)kotlin.collections.j1.u(u, u2, u4, u5));
        final HashMap e2 = kotlin.reflect.jvm.internal.impl.utils.a.e(4);
        e2.put(u2, value);
        e2.put(u, value);
        e2.put(u4, value2);
        e2.put(u3, value2);
        e2.put(l2, 2);
        k = Collections.unmodifiableMap((Map<? extends u, ? extends Integer>)e2);
        l = l2;
        m = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e)new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e() {
            @e
            public c0 a() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        n = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e)new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e() {
            @e
            public c0 a() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        o = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e)new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e() {
            @e
            public c0 a() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        final Iterator<g> iterator = ServiceLoader.load(g.class, g.class.getClassLoader()).iterator();
        Object a2;
        if (iterator.hasNext()) {
            a2 = iterator.next();
        }
        else {
            a2 = g$a.a;
        }
        p = (g)a2;
        q = new HashMap<j1, u>();
        i(u);
        i(u2);
        i(u3);
        i(u4);
        i(l2);
        i(u5);
        i(u6);
        i(u7);
        i(u8);
    }
    
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 16) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 16) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        Label_0145: {
            if (n != 1 && n != 3 && n != 5 && n != 7) {
                switch (n) {
                    default: {
                        args[0] = "what";
                        break Label_0145;
                    }
                    case 16: {
                        args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                        break Label_0145;
                    }
                    case 14:
                    case 15: {
                        args[0] = "visibility";
                        break Label_0145;
                    }
                    case 11:
                    case 13: {
                        args[0] = "second";
                        break Label_0145;
                    }
                    case 10:
                    case 12: {
                        args[0] = "first";
                        break Label_0145;
                    }
                    case 9: {
                        break;
                    }
                }
            }
            args[0] = "from";
        }
        if (n != 16) {
            args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        }
        else {
            args[1] = "toDescriptorVisibility";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "isVisible";
                }
                case 16: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 16) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 15: {
                    args[2] = "toDescriptorVisibility";
                    continue;
                }
                case 14: {
                    args[2] = "isPrivate";
                    continue;
                }
                case 12:
                case 13: {
                    args[2] = "compare";
                    continue;
                }
                case 10:
                case 11: {
                    args[2] = "compareLocal";
                    continue;
                }
                case 8:
                case 9: {
                    args[2] = "findInvisibleMember";
                    continue;
                }
                case 6:
                case 7: {
                    args[2] = "inSameFile";
                    continue;
                }
                case 4:
                case 5: {
                    args[2] = "isVisibleWithAnyReceiver";
                    continue;
                }
                case 2:
                case 3: {
                    args[2] = "isVisibleIgnoringReceiver";
                    continue;
                }
            }
            break;
        }
    }
    
    @f
    public static Integer d(@e final u u, @e final u u2) {
        if (u == null) {
            a(12);
        }
        if (u2 == null) {
            a(13);
        }
        final Integer a = u.a(u2);
        if (a != null) {
            return a;
        }
        final Integer a2 = u2.a(u);
        if (a2 != null) {
            return -a2;
        }
        return null;
    }
    
    @f
    public static q e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
        if (q == null) {
            a(8);
        }
        if (m == null) {
            a(9);
        }
        m i = q.b();
        while (true) {
            final q q2 = (q)i;
            if (q2 == null || q2.getVisibility() == t.f) {
                if (q instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.h0) {
                    final q e2 = e(e, ((kotlin.reflect.jvm.internal.impl.descriptors.impl.h0)q).t0(), m);
                    if (e2 != null) {
                        return e2;
                    }
                }
                return null;
            }
            if (!q2.getVisibility().e(e, q2, m)) {
                return q2;
            }
            i = kotlin.reflect.jvm.internal.impl.resolve.d.q((m)q2, (Class)q.class);
        }
    }
    
    public static boolean f(@e final m m, @e final m i) {
        if (m == null) {
            a(6);
        }
        if (i == null) {
            a(7);
        }
        final x0 j = kotlin.reflect.jvm.internal.impl.resolve.d.j(i);
        return j != x0.a && j.equals(kotlin.reflect.jvm.internal.impl.resolve.d.j(m));
    }
    
    public static boolean g(@e final u u) {
        if (u == null) {
            a(14);
        }
        return u == t.a || u == t.b;
    }
    
    public static boolean h(@e final q q, @e final m m) {
        if (q == null) {
            a(2);
        }
        if (m == null) {
            a(3);
        }
        return e(t.n, q, m) == null;
    }
    
    private static void i(final u u) {
        t.q.put(u.b(), u);
    }
    
    @e
    public static u j(@e final j1 obj) {
        if (obj == null) {
            a(15);
        }
        final u u = t.q.get(obj);
        if (u != null) {
            return u;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Inapplicable visibility: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
}
