// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.model.s;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.model.p;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.model.b;
import kotlin.reflect.jvm.internal.impl.types.r;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.j1;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.types.l;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.types.model.d;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.n;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.c0;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.model.g;
import kotlin.reflect.jvm.internal.impl.types.model.o;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.model.k;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import kotlin.reflect.jvm.internal.impl.types.model.t;
import kotlin.reflect.jvm.internal.impl.types.e1;

public interface c extends e1, t
{
    @f
    k a(@e final i p0);
    
    @e
    o b(@e final k p0);
    
    @e
    k c(@e final k p0, final boolean p1);
    
    @e
    k d(@e final g p0);
    
    @e
    k e(@e final g p0);
    
    @e
    i t(@e final k p0, @e final k p1);
    
    public static final class a
    {
        public static boolean A(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((w0)obj, StandardNames$FqNames.any);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean B(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                return ((w0)obj).c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean C(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (!(obj instanceof w0)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ClassicTypeSystemContext couldn't handle: ");
                sb.append(obj);
                sb.append(", ");
                sb.append(k1.d((Class)obj.getClass()));
                throw new IllegalArgumentException(sb.toString().toString());
            }
            final h c2 = ((w0)obj).c();
            kotlin.reflect.jvm.internal.impl.descriptors.e e;
            if (c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c2;
            }
            else {
                e = null;
            }
            final boolean b = false;
            if (e == null) {
                return false;
            }
            boolean b2 = b;
            if (c0.a(e)) {
                b2 = b;
                if (e.n() != kotlin.reflect.jvm.internal.impl.descriptors.f.J) {
                    b2 = b;
                    if (e.n() != kotlin.reflect.jvm.internal.impl.descriptors.f.K) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
        
        public static boolean D(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                return ((w0)obj).d();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean E(@e final c c, @e final i obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.c0) {
                return e0.a((kotlin.reflect.jvm.internal.impl.types.c0)obj);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean F(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                final h c2 = ((w0)obj).c();
                final boolean b = c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
                final Object o = null;
                Object o2;
                if (b) {
                    o2 = c2;
                }
                else {
                    o2 = null;
                }
                Object value;
                if (o2 == null) {
                    value = o;
                }
                else {
                    value = kotlin.reflect.jvm.internal.impl.resolve.f.b((m)o2);
                }
                return k0.g(value, (Object)Boolean.TRUE);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean G(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                return obj instanceof n;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean H(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                return obj instanceof b0;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean I(@e final c c, @e final i i) {
            return t.a.b(c, i);
        }
        
        public static boolean J(@e final c c, @e final k obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                return ((kotlin.reflect.jvm.internal.impl.types.k0)obj).O0();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean K(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((w0)obj, StandardNames$FqNames.nothing);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean L(@e final c c, @e final i obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.c0) {
                return f1.l((kotlin.reflect.jvm.internal.impl.types.c0)obj);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean M(@e final c c, @e final k obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.c0) {
                return KotlinBuiltIns.isPrimitiveType((kotlin.reflect.jvm.internal.impl.types.c0)obj);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean N(@e final c c, @e final d obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.checker.i) {
                return ((kotlin.reflect.jvm.internal.impl.types.checker.i)obj).Z0();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean O(@e final c c, @e final k obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                if (!e0.a((kotlin.reflect.jvm.internal.impl.types.c0)obj)) {
                    final kotlin.reflect.jvm.internal.impl.types.k0 k0 = (kotlin.reflect.jvm.internal.impl.types.k0)obj;
                    if (!(k0.N0().c() instanceof a1) && (k0.N0().c() != null || obj instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a || obj instanceof kotlin.reflect.jvm.internal.impl.types.checker.i || obj instanceof l || k0.N0() instanceof n)) {
                        return true;
                    }
                }
                return false;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean P(@e final c c, @e final kotlin.reflect.jvm.internal.impl.types.model.n obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof y0) {
                return ((y0)obj).d();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean Q(@e final c c, @e final k obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                return obj instanceof kotlin.reflect.jvm.internal.impl.types.e;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean R(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                final h c2 = ((w0)obj).c();
                Object value;
                if (c2 == null) {
                    value = null;
                }
                else {
                    value = KotlinBuiltIns.isUnderKotlinPackage((m)c2);
                }
                return k0.g(value, (Object)Boolean.TRUE);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static k S(@e final c c, @e final g obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w) {
                return ((w)obj).V0();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static k T(@e final c c, @e final i i) {
            return t.a.c(c, i);
        }
        
        @f
        public static i U(@e final c c, @e final d obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.checker.i) {
                return ((kotlin.reflect.jvm.internal.impl.types.checker.i)obj).Y0();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static i V(@e final c c, @e final i obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof j1) {
                return kotlin.reflect.jvm.internal.impl.types.checker.d.a((j1)obj);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static i W(@e final c c, @e final i i) {
            return e1.a.a(c, i);
        }
        
        @e
        public static kotlin.reflect.jvm.internal.impl.types.g X(@e final c c, final boolean b, final boolean b2) {
            k0.p((Object)c, "this");
            return new kotlin.reflect.jvm.internal.impl.types.checker.a(b, b2, false, null, 12, null);
        }
        
        @e
        public static k Y(@e final c c, @e final kotlin.reflect.jvm.internal.impl.types.model.e obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof l) {
                return ((l)obj).Z0();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static int Z(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                return ((w0)obj).getParameters().size();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean a(@e final c c, @e final o obj, @e final o obj2) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "c1");
            k0.p((Object)obj2, "c2");
            if (!(obj instanceof w0)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ClassicTypeSystemContext couldn't handle: ");
                sb.append(obj);
                sb.append(", ");
                sb.append(k1.d((Class)obj.getClass()));
                throw new IllegalArgumentException(sb.toString().toString());
            }
            if (obj2 instanceof w0) {
                return k0.g((Object)obj, (Object)obj2);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(obj2);
            sb2.append(", ");
            sb2.append(k1.d((Class)obj2.getClass()));
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        
        @e
        public static Collection<i> a0(@e final c c, @e final k obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            final o b = c.b(obj);
            if (b instanceof n) {
                return (Collection<i>)((n)b).j();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static int b(@e final c c, @e final i obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.c0) {
                return ((kotlin.reflect.jvm.internal.impl.types.c0)obj).M0().size();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static int b0(@e final c c, @e final kotlin.reflect.jvm.internal.impl.types.model.m m) {
            return t.a.d(c, m);
        }
        
        @e
        public static kotlin.reflect.jvm.internal.impl.types.model.m c(@e final c c, @e final k obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                return (kotlin.reflect.jvm.internal.impl.types.model.m)obj;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static Collection<i> c0(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                final Collection<kotlin.reflect.jvm.internal.impl.types.c0> k = ((w0)obj).k();
                k0.o((Object)k, "this.supertypes");
                return (Collection<i>)k;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @f
        public static d d(@e final c c, @e final k obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                kotlin.reflect.jvm.internal.impl.types.checker.i i;
                if (obj instanceof kotlin.reflect.jvm.internal.impl.types.checker.i) {
                    i = (kotlin.reflect.jvm.internal.impl.types.checker.i)obj;
                }
                else {
                    i = null;
                }
                return i;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static o d0(@e final c c, @e final i i) {
            return t.a.e(c, i);
        }
        
        @f
        public static kotlin.reflect.jvm.internal.impl.types.model.e e(@e final c c, @e final k obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                l l;
                if (obj instanceof l) {
                    l = (l)obj;
                }
                else {
                    l = null;
                }
                return l;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static o e0(@e final c c, @e final k obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                return ((kotlin.reflect.jvm.internal.impl.types.k0)obj).N0();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @f
        public static kotlin.reflect.jvm.internal.impl.types.model.f f(@e final c c, @e final g obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w) {
                kotlin.reflect.jvm.internal.impl.types.r r;
                if (obj instanceof kotlin.reflect.jvm.internal.impl.types.r) {
                    r = (kotlin.reflect.jvm.internal.impl.types.r)obj;
                }
                else {
                    r = null;
                }
                return r;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static k f0(@e final c c, @e final g obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w) {
                return ((w)obj).W0();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @f
        public static g g(@e final c c, @e final i obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.c0) {
                final j1 q0 = ((kotlin.reflect.jvm.internal.impl.types.c0)obj).Q0();
                w w;
                if (q0 instanceof w) {
                    w = (w)q0;
                }
                else {
                    w = null;
                }
                return w;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static k g0(@e final c c, @e final i i) {
            return t.a.f(c, i);
        }
        
        @f
        public static k h(@e final c c, @e final i obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.c0) {
                final j1 q0 = ((kotlin.reflect.jvm.internal.impl.types.c0)obj).Q0();
                kotlin.reflect.jvm.internal.impl.types.k0 k0;
                if (q0 instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                    k0 = (kotlin.reflect.jvm.internal.impl.types.k0)q0;
                }
                else {
                    k0 = null;
                }
                return k0;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static i h0(@e final c c, @e final i i, final boolean b) {
            k0.p((Object)c, "this");
            k0.p((Object)i, "receiver");
            i j;
            if (i instanceof k) {
                j = c.c((k)i, b);
            }
            else {
                if (!(i instanceof g)) {
                    throw new IllegalStateException("sealed".toString());
                }
                final g g = (g)i;
                j = c.t(c.c(c.e(g), b), c.c(c.d(g), b));
            }
            return j;
        }
        
        @e
        public static kotlin.reflect.jvm.internal.impl.types.model.n i(@e final c c, @e final i obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.c0) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a((kotlin.reflect.jvm.internal.impl.types.c0)obj);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static k i0(@e final c c, @e final k obj, final boolean b) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                return ((kotlin.reflect.jvm.internal.impl.types.k0)obj).U0(b);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @f
        public static k j(@e final c c, @e final k obj, @e final b b) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "type");
            k0.p((Object)b, "status");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                return kotlin.reflect.jvm.internal.impl.types.checker.k.b((kotlin.reflect.jvm.internal.impl.types.k0)obj, b);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static i k(@e final c c, @e final k k, @e final k i) {
            k0.p((Object)c, "this");
            k0.p((Object)k, "lowerBound");
            k0.p((Object)i, "upperBound");
            if (!(k instanceof kotlin.reflect.jvm.internal.impl.types.k0)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ClassicTypeSystemContext couldn't handle: ");
                sb.append(c);
                sb.append(", ");
                sb.append(k1.d((Class)c.getClass()));
                throw new IllegalArgumentException(sb.toString().toString());
            }
            if (i instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                final d0 a = d0.a;
                return d0.d((kotlin.reflect.jvm.internal.impl.types.k0)k, (kotlin.reflect.jvm.internal.impl.types.k0)i);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(c);
            sb2.append(", ");
            sb2.append(k1.d((Class)c.getClass()));
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        
        @e
        public static kotlin.reflect.jvm.internal.impl.types.model.n l(@e final c c, @e final kotlin.reflect.jvm.internal.impl.types.model.m m, final int n) {
            return t.a.a(c, m, n);
        }
        
        @e
        public static kotlin.reflect.jvm.internal.impl.types.model.n m(@e final c c, @e final i obj, final int n) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.c0) {
                return ((kotlin.reflect.jvm.internal.impl.types.c0)obj).M0().get(n);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static kotlin.reflect.jvm.internal.impl.name.c n(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                final h c2 = ((w0)obj).c();
                Objects.requireNonNull(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.j((m)c2);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static p o(@e final c c, @e final o obj, final int n) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                final b1 value = ((w0)obj).getParameters().get(n);
                k0.o((Object)value, "this.parameters[index]");
                return (p)value;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @f
        public static PrimitiveType p(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                final h c2 = ((w0)obj).c();
                Objects.requireNonNull(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveArrayType((m)c2);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @f
        public static PrimitiveType q(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                final h c2 = ((w0)obj).c();
                Objects.requireNonNull(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveType((m)c2);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static i r(@e final c c, @e final p obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof b1) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.f((b1)obj);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @f
        public static i s(@e final c c, @e final i obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.c0) {
                return kotlin.reflect.jvm.internal.impl.resolve.f.e((kotlin.reflect.jvm.internal.impl.types.c0)obj);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static i t(@e final c c, @e final kotlin.reflect.jvm.internal.impl.types.model.n obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof y0) {
                return ((y0)obj).a().Q0();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @f
        public static p u(@e final c c, @e final o obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof w0) {
                final h c2 = ((w0)obj).c();
                Object o;
                if (c2 instanceof b1) {
                    o = c2;
                }
                else {
                    o = null;
                }
                return (p)o;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static kotlin.reflect.jvm.internal.impl.types.model.w v(@e final c c, @e final kotlin.reflect.jvm.internal.impl.types.model.n obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof y0) {
                final kotlin.reflect.jvm.internal.impl.types.k1 c2 = ((y0)obj).c();
                k0.o((Object)c2, "this.projectionKind");
                return s.a(c2);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public static kotlin.reflect.jvm.internal.impl.types.model.w w(@e final c c, @e final p obj) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            if (obj instanceof b1) {
                final kotlin.reflect.jvm.internal.impl.types.k1 v = ((b1)obj).v();
                k0.o((Object)v, "this.variance");
                return s.a(v);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean x(@e final c c, @e final i obj, @e final kotlin.reflect.jvm.internal.impl.name.b b) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "receiver");
            k0.p((Object)b, "fqName");
            if (obj instanceof kotlin.reflect.jvm.internal.impl.types.c0) {
                return ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)obj).getAnnotations().B4(b);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassicTypeSystemContext couldn't handle: ");
            sb.append(obj);
            sb.append(", ");
            sb.append(k1.d((Class)obj.getClass()));
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public static boolean y(@e final c c, @e final k obj, @e final k obj2) {
            k0.p((Object)c, "this");
            k0.p((Object)obj, "a");
            k0.p((Object)obj2, "b");
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.k0)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ClassicTypeSystemContext couldn't handle: ");
                sb.append(obj);
                sb.append(", ");
                sb.append(k1.d((Class)obj.getClass()));
                throw new IllegalArgumentException(sb.toString().toString());
            }
            if (obj2 instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                return ((kotlin.reflect.jvm.internal.impl.types.k0)obj).M0() == ((kotlin.reflect.jvm.internal.impl.types.k0)obj2).M0();
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(obj2);
            sb2.append(", ");
            sb2.append(k1.d((Class)obj2.getClass()));
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        
        @e
        public static i z(@e final c c, @e final List<? extends i> list) {
            k0.p((Object)c, "this");
            k0.p((Object)list, "types");
            return kotlin.reflect.jvm.internal.impl.types.checker.e.a((List<? extends j1>)list);
        }
    }
}
