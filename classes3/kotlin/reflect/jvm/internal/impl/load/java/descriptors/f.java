// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.j;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.util.i;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.s0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.a$a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f0;

public class f extends f0 implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.b
{
    public static final a$a<e1> l0;
    private b j0;
    private final boolean k0;
    
    static {
        l0 = (a$a)new a$a<e1>() {};
    }
    
    protected f(@e final m m, @org.jetbrains.annotations.f final v0 v0, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final b$a b$a, @e final w0 w0, final boolean k0) {
        if (m == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (e == null) {
            L(2);
        }
        if (b$a == null) {
            L(3);
        }
        if (w0 == null) {
            L(4);
        }
        super(m, v0, g, e, b$a, w0);
        this.j0 = null;
        this.k0 = k0;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 12 && n != 17 && n != 20) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 12 && n != 17 && n != 20) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "containingDeclaration";
                break;
            }
            case 19: {
                args[0] = "enhancedReturnType";
                break;
            }
            case 18: {
                args[0] = "enhancedValueParametersData";
                break;
            }
            case 13: {
                args[0] = "newOwner";
                break;
            }
            case 12:
            case 17:
            case 20: {
                args[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            }
            case 11: {
                args[0] = "visibility";
                break;
            }
            case 10: {
                args[0] = "unsubstitutedValueParameters";
                break;
            }
            case 9: {
                args[0] = "typeParameters";
                break;
            }
            case 4:
            case 8:
            case 16: {
                args[0] = "source";
                break;
            }
            case 3:
            case 14: {
                args[0] = "kind";
                break;
            }
            case 2:
            case 7: {
                args[0] = "name";
                break;
            }
            case 1:
            case 6:
            case 15: {
                args[0] = "annotations";
                break;
            }
        }
        if (n != 12) {
            if (n != 17) {
                if (n != 20) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                }
                else {
                    args[1] = "enhance";
                }
            }
            else {
                args[1] = "createSubstitutedCopy";
            }
        }
        else {
            args[1] = "initialize";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 12:
                case 17:
                case 20: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 12 && n != 17 && n != 20) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 18:
                case 19: {
                    args[2] = "enhance";
                    continue;
                }
                case 13:
                case 14:
                case 15:
                case 16: {
                    args[2] = "createSubstitutedCopy";
                    continue;
                }
                case 9:
                case 10:
                case 11: {
                    args[2] = "initialize";
                    continue;
                }
                case 5:
                case 6:
                case 7:
                case 8: {
                    args[2] = "createJavaMethod";
                    continue;
                }
            }
            break;
        }
    }
    
    @e
    public static f q1(@e final m m, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final w0 w0, final boolean b) {
        if (m == null) {
            L(5);
        }
        if (g == null) {
            L(6);
        }
        if (e == null) {
            L(7);
        }
        if (w0 == null) {
            L(8);
        }
        return new f(m, null, g, e, b$a.G, w0, b);
    }
    
    public boolean K() {
        return this.j0.H;
    }
    
    public boolean R0() {
        return this.j0.G;
    }
    
    @e
    public f0 p1(@org.jetbrains.annotations.f final t0 t0, @org.jetbrains.annotations.f final t0 t2, @e final List<? extends b1> list, @e final List<e1> list2, @org.jetbrains.annotations.f final c0 c0, @org.jetbrains.annotations.f final b0 b0, @e final u u, @org.jetbrains.annotations.f final Map<? extends a$a<?>, ?> map) {
        if (list == null) {
            L(9);
        }
        if (list2 == null) {
            L(10);
        }
        if (u == null) {
            L(11);
        }
        final f0 p8 = super.p1(t0, t2, (List)list, (List)list2, c0, b0, u, (Map)map);
        ((p)this).g1(i.a.a((y)p8).a());
        if (p8 == null) {
            L(12);
        }
        return p8;
    }
    
    @e
    protected f r1(@e final m m, @org.jetbrains.annotations.f final y y, @e final b$a b$a, @org.jetbrains.annotations.f kotlin.reflect.jvm.internal.impl.name.e name, @e final g g, @e final w0 w0) {
        if (m == null) {
            L(13);
        }
        if (b$a == null) {
            L(14);
        }
        if (g == null) {
            L(15);
        }
        if (w0 == null) {
            L(16);
        }
        final v0 v0 = (v0)y;
        if (name == null) {
            name = ((j)this).getName();
        }
        final f f = new f(m, v0, g, name, b$a, w0, this.k0);
        f.t1(this.R0(), this.K());
        return f;
    }
    
    @e
    public f s1(@org.jetbrains.annotations.f final c0 c0, @e final List<l> list, @e final c0 c2, @org.jetbrains.annotations.f final s0<a$a<?>, ?> s0) {
        if (list == null) {
            L(18);
        }
        if (c2 == null) {
            L(19);
        }
        final List<e1> a = k.a(list, ((p)this).m(), (a)this);
        t0 f;
        if (c0 == null) {
            f = null;
        }
        else {
            f = c.f((a)this, c0, g.r.b());
        }
        final f f2 = (f)this.B().b((List)a).f(c2).k(f).a().e().h();
        if (s0 != null) {
            ((p)f2).V0((a$a)s0.e(), s0.f());
        }
        if (f2 == null) {
            L(20);
        }
        return f2;
    }
    
    public void t1(final boolean b, final boolean b2) {
        this.j0 = f.b.d(b, b2);
    }
    
    private enum b
    {
        I(false, false), 
        J(true, false), 
        K(false, true), 
        L(true, true);
        
        public final boolean G;
        public final boolean H;
        
        private b(final boolean g, final boolean h) {
            this.G = g;
            this.H = h;
        }
        
        private static /* synthetic */ void b(final int n) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }
        
        @e
        public static b d(final boolean b, final boolean b2) {
            b b3;
            if (b) {
                if (b2) {
                    b3 = f.b.L;
                }
                else {
                    b3 = f.b.J;
                }
            }
            else if (b2) {
                b3 = f.b.K;
            }
            else {
                b3 = f.b.I;
            }
            if (b3 == null) {
                b(0);
            }
            return b3;
        }
    }
}
