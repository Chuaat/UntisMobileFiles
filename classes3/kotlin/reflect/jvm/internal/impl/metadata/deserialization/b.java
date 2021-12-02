// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.a;

public class b
{
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;
    public static final b J;
    public static final b K;
    public static final b L;
    public static final b M;
    public static final b N;
    public static final b a;
    public static final b b;
    public static final d<a.x> c;
    public static final d<a.k> d;
    public static final d<a.c.c> e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final d<a.j> n;
    public static final b o;
    public static final b p;
    public static final b q;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final b v;
    public static final b w;
    public static final b x;
    public static final b y;
    public static final b z;
    
    static {
        a = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.c();
        final b b2 = b = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.c();
        final d<a.x> d2 = (d<a.x>)(c = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.a((d<?>)b2, kotlin.reflect.jvm.internal.impl.metadata.a.x.values()));
        final d<a.k> d3 = (d<a.k>)(d = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.a(d2, kotlin.reflect.jvm.internal.impl.metadata.a.k.values()));
        k = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(j = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(i = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(h = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(f = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b(e = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.a(d3, kotlin.reflect.jvm.internal.impl.metadata.a.c.c.values()))))))))))));
        m = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(l = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b(d2)));
        final d<a.j> d4 = (d<a.j>)(n = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.a(d3, kotlin.reflect.jvm.internal.impl.metadata.a.j.values()));
        v = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(u = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(t = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(s = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(r = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(q = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(p = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(o = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b(d4)))))))))))))));
        E = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(D = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(C = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(B = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(A = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(z = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(y = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(x = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(w = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b(d4)))))))))))))))));
        H = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(G = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(F = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)b2)))));
        K = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(J = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(I = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b(d3)))));
        M = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.b((d<?>)(L = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.c()));
        N = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d.c();
    }
    
    private static /* synthetic */ void a(final int n) {
        final Object[] args = new Object[3];
        Label_0073: {
            Label_0068: {
                if (n != 1) {
                    if (n == 2) {
                        args[0] = "kind";
                        break Label_0073;
                    }
                    if (n != 5) {
                        if (n != 6) {
                            if (n == 8) {
                                break Label_0068;
                            }
                            if (n != 9) {
                                if (n != 11) {
                                    args[0] = "visibility";
                                    break Label_0073;
                                }
                                break Label_0068;
                            }
                        }
                        args[0] = "memberKind";
                        break Label_0073;
                    }
                }
            }
            args[0] = "modality";
        }
        args[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (n) {
            default: {
                args[2] = "getClassFlags";
                break;
            }
            case 10:
            case 11: {
                args[2] = "getAccessorFlags";
                break;
            }
            case 7:
            case 8:
            case 9: {
                args[2] = "getPropertyFlags";
                break;
            }
            case 4:
            case 5:
            case 6: {
                args[2] = "getFunctionFlags";
                break;
            }
            case 3: {
                args[2] = "getConstructorFlags";
                break;
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
    }
    
    public static int b(final boolean b, @e final a.x x, @e final a.k k, final boolean b2, final boolean b3, final boolean b4) {
        if (x == null) {
            a(10);
        }
        if (k == null) {
            a(11);
        }
        return b.b.h(b) | b.d.e(k) | b.c.e(x) | b.I.h(b2) | b.J.h(b3) | b.K.h(b4);
    }
    
    public static class b extends d<Boolean>
    {
        public b(final int n) {
            super(n, 1);
        }
        
        private static /* synthetic */ void f(final int n) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }
        
        @e
        public Boolean g(final int n) {
            final int a = super.a;
            boolean b = true;
            if ((n & 1 << a) == 0x0) {
                b = false;
            }
            final Boolean value = b;
            if (value == null) {
                f(0);
            }
            return value;
        }
        
        public int h(final Boolean b) {
            int n;
            if (b) {
                n = 1 << super.a;
            }
            else {
                n = 0;
            }
            return n;
        }
    }
    
    private static class c<E extends j.a> extends d<E>
    {
        private final E[] c;
        
        public c(final int n, final E[] c) {
            super(n, g(c));
            this.c = c;
        }
        
        private static /* synthetic */ void f(final int n) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }
        
        private static <E> int g(@e final E[] array) {
            if (array == null) {
                f(0);
            }
            final int n = array.length - 1;
            if (n == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; --i) {
                if ((1 << i & n) != 0x0) {
                    return i + 1;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Empty enum: ");
            sb.append(array.getClass());
            throw new IllegalStateException(sb.toString());
        }
        
        @f
        public E h(final int n) {
            final int b = super.b;
            final int a = super.a;
            for (final j.a a2 : this.c) {
                if (a2.q() == (n & (1 << b) - 1 << a) >> a) {
                    return (E)a2;
                }
            }
            return null;
        }
        
        public int i(final E e) {
            return ((j.a)e).q() << super.a;
        }
    }
    
    public abstract static class d<E>
    {
        public final int a;
        public final int b;
        
        private d(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public static <E extends j.a> d<E> a(final d<?> d, final E[] array) {
            return (d<E>)new c(d.a + d.b, array);
        }
        
        public static b b(final d<?> d) {
            return new b(d.a + d.b);
        }
        
        public static b c() {
            return new b(0);
        }
        
        public abstract E d(final int p0);
        
        public abstract int e(final E p0);
    }
}
