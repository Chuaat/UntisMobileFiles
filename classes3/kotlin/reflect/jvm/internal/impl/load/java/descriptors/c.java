// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.a$a;
import kotlin.s0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f;

public class c extends f implements b
{
    private Boolean m0;
    private Boolean n0;
    
    protected c(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.f final c c, @org.jetbrains.annotations.e final g g, final boolean b, @org.jetbrains.annotations.e final b$a b$a, @org.jetbrains.annotations.e final w0 w0) {
        if (e == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (b$a == null) {
            L(2);
        }
        if (w0 == null) {
            L(3);
        }
        super(e, (l)c, g, b, b$a, w0);
        this.m0 = null;
        this.n0 = null;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 11 && n != 18) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 11 && n != 18) {
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
            case 17: {
                args[0] = "enhancedReturnType";
                break;
            }
            case 16: {
                args[0] = "enhancedValueParametersData";
                break;
            }
            case 14: {
                args[0] = "sourceElement";
                break;
            }
            case 11:
            case 18: {
                args[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            }
            case 7:
            case 12: {
                args[0] = "newOwner";
                break;
            }
            case 3:
            case 6:
            case 10: {
                args[0] = "source";
                break;
            }
            case 2:
            case 8:
            case 13: {
                args[0] = "kind";
                break;
            }
            case 1:
            case 5:
            case 9:
            case 15: {
                args[0] = "annotations";
                break;
            }
        }
        if (n != 11) {
            if (n != 18) {
                args[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
            }
            else {
                args[1] = "enhance";
            }
        }
        else {
            args[1] = "createSubstitutedCopy";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 11:
                case 18: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 11 && n != 18) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 16:
                case 17: {
                    args[2] = "enhance";
                    continue;
                }
                case 12:
                case 13:
                case 14:
                case 15: {
                    args[2] = "createDescriptor";
                    continue;
                }
                case 7:
                case 8:
                case 9:
                case 10: {
                    args[2] = "createSubstitutedCopy";
                    continue;
                }
                case 4:
                case 5:
                case 6: {
                    args[2] = "createJavaConstructor";
                    continue;
                }
            }
            break;
        }
    }
    
    @org.jetbrains.annotations.e
    public static c t1(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final g g, final boolean b, @org.jetbrains.annotations.e final w0 w0) {
        if (e == null) {
            L(4);
        }
        if (g == null) {
            L(5);
        }
        if (w0 == null) {
            L(6);
        }
        return new c(e, null, g, b, b$a.G, w0);
    }
    
    public boolean K() {
        return this.n0;
    }
    
    public boolean R0() {
        return this.m0;
    }
    
    public void Z0(final boolean b) {
        this.m0 = b;
    }
    
    public void a1(final boolean b) {
        this.n0 = b;
    }
    
    @org.jetbrains.annotations.e
    protected c s1(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.f final c c, @org.jetbrains.annotations.e final b$a b$a, @org.jetbrains.annotations.e final w0 w0, @org.jetbrains.annotations.e final g g) {
        if (e == null) {
            L(12);
        }
        if (b$a == null) {
            L(13);
        }
        if (w0 == null) {
            L(14);
        }
        if (g == null) {
            L(15);
        }
        return new c(e, c, g, super.j0, b$a, w0);
    }
    
    @org.jetbrains.annotations.e
    protected c u1(@org.jetbrains.annotations.e final m obj, @org.jetbrains.annotations.f final y y, @org.jetbrains.annotations.e final b$a obj2, @org.jetbrains.annotations.f final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final w0 w0) {
        if (obj == null) {
            L(7);
        }
        if (obj2 == null) {
            L(8);
        }
        if (g == null) {
            L(9);
        }
        if (w0 == null) {
            L(10);
        }
        if (obj2 != b$a.G && obj2 != b$a.J) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\n");
            sb.append("newOwner: ");
            sb.append(obj);
            sb.append("\n");
            sb.append("kind: ");
            sb.append(obj2);
            throw new IllegalStateException(sb.toString());
        }
        final c s1 = this.s1((e)obj, (c)y, obj2, w0, g);
        s1.Z0(this.R0());
        s1.a1(this.K());
        return s1;
    }
    
    @org.jetbrains.annotations.e
    public c v1(@org.jetbrains.annotations.f final c0 c0, @org.jetbrains.annotations.e final List<kotlin.reflect.jvm.internal.impl.load.java.descriptors.l> list, @org.jetbrains.annotations.e final c0 c2, @org.jetbrains.annotations.f final s0<a$a<?>, ?> s0) {
        if (list == null) {
            L(16);
        }
        if (c2 == null) {
            L(17);
        }
        final c u1 = this.u1((m)this.p1(), null, ((p)this).n(), null, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.b)this).getAnnotations(), ((kotlin.reflect.jvm.internal.impl.descriptors.impl.k)this).k());
        t0 f;
        if (c0 == null) {
            f = null;
        }
        else {
            f = kotlin.reflect.jvm.internal.impl.resolve.c.f((a)u1, c0, g.r.b());
        }
        ((p)u1).S0(f, ((p)this).j0(), ((p)this).getTypeParameters(), (List)k.a(list, ((p)this).m(), (a)u1), c2, ((p)this).o(), ((p)this).getVisibility());
        if (s0 != null) {
            ((p)u1).V0((a$a)s0.e(), s0.f());
        }
        return u1;
    }
}
