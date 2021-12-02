// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.k0;
import java.util.Collection;
import org.jetbrains.annotations.f;
import java.util.List;
import org.jetbrains.annotations.e;

public interface r extends u
{
    @e
    w A(@e final p p0);
    
    @e
    i B(@e final List<? extends i> p0);
    
    boolean C(@e final k p0);
    
    @e
    i D(@e final i p0);
    
    int E(@e final m p0);
    
    @e
    k F(@e final i p0);
    
    @f
    i G(@e final d p0);
    
    boolean H(@e final o p0);
    
    boolean I(@e final k p0);
    
    boolean J(@e final i p0);
    
    boolean K(@e final o p0);
    
    @e
    n N(@e final i p0);
    
    @f
    d O(@e final k p0);
    
    @e
    n P(@e final i p0, final int p1);
    
    @e
    k Q(@e final i p0);
    
    @e
    w S(@e final n p0);
    
    boolean T(@e final o p0);
    
    boolean V(@e final k p0);
    
    boolean W(@e final i p0);
    
    boolean X(@e final i p0);
    
    boolean Y(@e final o p0);
    
    @f
    k Z(@e final k p0, @e final b p1);
    
    @f
    k a(@e final i p0);
    
    @f
    kotlin.reflect.jvm.internal.impl.types.model.e a0(@e final k p0);
    
    @e
    o b(@e final k p0);
    
    @e
    k c(@e final k p0, final boolean p1);
    
    boolean c0(@e final o p0);
    
    @e
    k d(@e final g p0);
    
    @e
    i d0(@e final n p0);
    
    @e
    k e(@e final g p0);
    
    @f
    kotlin.reflect.jvm.internal.impl.types.model.f e0(@e final g p0);
    
    int f(@e final o p0);
    
    boolean f0(@e final o p0, @e final o p1);
    
    int h(@e final i p0);
    
    boolean h0(@e final k p0);
    
    boolean i(@e final d p0);
    
    boolean l(@e final o p0);
    
    @e
    m m(@e final k p0);
    
    @e
    Collection<i> n(@e final o p0);
    
    @e
    n o(@e final m p0, final int p1);
    
    @e
    Collection<i> p(@e final k p0);
    
    @e
    o q(@e final i p0);
    
    boolean r(@e final o p0);
    
    @e
    p s(@e final o p0, final int p1);
    
    @e
    i v(@e final i p0, final boolean p1);
    
    @e
    k w(@e final kotlin.reflect.jvm.internal.impl.types.model.e p0);
    
    boolean y(@e final n p0);
    
    @f
    g z(@e final i p0);
    
    public static final class a
    {
        @f
        public static List<k> a(@e final r r, @e final k k, @e final o o) {
            k0.p((Object)r, "this");
            k0.p((Object)k, "receiver");
            k0.p((Object)o, "constructor");
            return null;
        }
        
        @e
        public static n b(@e final r r, @e final m obj, final int index) {
            k0.p((Object)r, "this");
            k0.p((Object)obj, "receiver");
            n p3;
            if (obj instanceof k) {
                p3 = r.P((i)obj, index);
            }
            else {
                if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.model.a)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unknown type argument list type: ");
                    sb.append(obj);
                    sb.append(", ");
                    sb.append(k1.d((Class)obj.getClass()));
                    throw new IllegalStateException(sb.toString().toString());
                }
                final n value = ((kotlin.reflect.jvm.internal.impl.types.model.a)obj).get(index);
                k0.o((Object)value, "get(index)");
                p3 = value;
            }
            return p3;
        }
        
        @f
        public static n c(@e final r r, @e final k k, final int n) {
            k0.p((Object)r, "this");
            k0.p((Object)k, "receiver");
            int n2 = 0;
            if (n >= 0) {
                n2 = n2;
                if (n < r.h(k)) {
                    n2 = 1;
                }
            }
            if (n2 != 0) {
                return r.P(k, n);
            }
            return null;
        }
        
        public static boolean d(@e final r r, @e final i i) {
            k0.p((Object)r, "this");
            k0.p((Object)i, "receiver");
            return r.I(r.Q(i)) != r.I(r.F(i));
        }
        
        public static boolean e(@e final r r, @e final k k, @e final k i) {
            return u.a.a(r, k, i);
        }
        
        public static boolean f(@e final r r, @e final k k) {
            k0.p((Object)r, "this");
            k0.p((Object)k, "receiver");
            return r.H(r.b(k));
        }
        
        public static boolean g(@e final r r, @e final i i) {
            k0.p((Object)r, "this");
            k0.p((Object)i, "receiver");
            final k a = r.a(i);
            kotlin.reflect.jvm.internal.impl.types.model.e a2;
            if (a == null) {
                a2 = null;
            }
            else {
                a2 = r.a0(a);
            }
            return a2 != null;
        }
        
        public static boolean h(@e final r r, @e final i i) {
            k0.p((Object)r, "this");
            k0.p((Object)i, "receiver");
            final g z = r.z(i);
            kotlin.reflect.jvm.internal.impl.types.model.f e0;
            if (z == null) {
                e0 = null;
            }
            else {
                e0 = r.e0(z);
            }
            return e0 != null;
        }
        
        public static boolean i(@e final r r, @e final k k) {
            k0.p((Object)r, "this");
            k0.p((Object)k, "receiver");
            return r.Y(r.b(k));
        }
        
        public static boolean j(@e final r r, @e final i i) {
            k0.p((Object)r, "this");
            k0.p((Object)i, "receiver");
            return i instanceof k && r.I((k)i);
        }
        
        public static boolean k(@e final r r, @e final i i) {
            k0.p((Object)r, "this");
            k0.p((Object)i, "receiver");
            return r.l(r.q(i)) && !r.X(i);
        }
        
        @e
        public static k l(@e final r r, @e final i i) {
            k0.p((Object)r, "this");
            k0.p((Object)i, "receiver");
            final g z = r.z(i);
            k k;
            if (z == null) {
                k = r.a(i);
                k0.m((Object)k);
            }
            else {
                k = r.e(z);
            }
            return k;
        }
        
        public static int m(@e final r r, @e final m obj) {
            k0.p((Object)r, "this");
            k0.p((Object)obj, "receiver");
            int n;
            if (obj instanceof k) {
                n = r.h((i)obj);
            }
            else {
                if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.model.a)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unknown type argument list type: ");
                    sb.append(obj);
                    sb.append(", ");
                    sb.append(k1.d((Class)obj.getClass()));
                    throw new IllegalStateException(sb.toString().toString());
                }
                n = ((kotlin.reflect.jvm.internal.impl.types.model.a)obj).size();
            }
            return n;
        }
        
        @e
        public static o n(@e final r r, @e final i i) {
            k0.p((Object)r, "this");
            k0.p((Object)i, "receiver");
            k k;
            if ((k = r.a(i)) == null) {
                k = r.Q(i);
            }
            return r.b(k);
        }
        
        @e
        public static k o(@e final r r, @e final i i) {
            k0.p((Object)r, "this");
            k0.p((Object)i, "receiver");
            final g z = r.z(i);
            k k;
            if (z == null) {
                k = r.a(i);
                k0.m((Object)k);
            }
            else {
                k = r.d(z);
            }
            return k;
        }
    }
}
