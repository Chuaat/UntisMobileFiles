// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import java.util.Set;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import kotlin.reflect.jvm.internal.impl.name.e;
import kotlin.reflect.jvm.internal.impl.descriptors.d;

public class f extends p implements d
{
    private static final e k0;
    protected final boolean j0;
    
    static {
        k0 = e.l("<init>");
    }
    
    protected f(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @org.jetbrains.annotations.f final l l, @org.jetbrains.annotations.e final g g, final boolean j0, @org.jetbrains.annotations.e final b.a a, @org.jetbrains.annotations.e final w0 w0) {
        if (e == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (a == null) {
            L(2);
        }
        if (w0 == null) {
            L(3);
        }
        super(e, l, g, f.k0, a, w0);
        this.j0 = j0;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format = null;
        Label_0049: {
            if (n != 19 && n != 25) {
                switch (n) {
                    default: {
                        format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break Label_0049;
                    }
                    case 15:
                    case 16:
                    case 17: {
                        break;
                    }
                }
            }
            format = "@NotNull method %s.%s must not return null";
        }
        int n2 = 0;
        Label_0095: {
            if (n != 19 && n != 25) {
                switch (n) {
                    default: {
                        n2 = 3;
                        break Label_0095;
                    }
                    case 15:
                    case 16:
                    case 17: {
                        break;
                    }
                }
            }
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "containingDeclaration";
                break;
            }
            case 21: {
                args[0] = "newOwner";
                break;
            }
            case 20: {
                args[0] = "overriddenDescriptors";
                break;
            }
            case 18: {
                args[0] = "originalSubstitutor";
                break;
            }
            case 15:
            case 16:
            case 17:
            case 19:
            case 25: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            }
            case 12: {
                args[0] = "typeParameterDescriptors";
                break;
            }
            case 11:
            case 14: {
                args[0] = "visibility";
                break;
            }
            case 10:
            case 13: {
                args[0] = "unsubstitutedValueParameters";
                break;
            }
            case 3:
            case 6:
            case 9:
            case 24: {
                args[0] = "source";
                break;
            }
            case 2:
            case 22: {
                args[0] = "kind";
                break;
            }
            case 1:
            case 5:
            case 8:
            case 23: {
                args[0] = "annotations";
                break;
            }
        }
        if (n != 19) {
            if (n != 25) {
                switch (n) {
                    default: {
                        args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    }
                    case 17: {
                        args[1] = "getOriginal";
                        break;
                    }
                    case 16: {
                        args[1] = "getConstructedClass";
                        break;
                    }
                    case 15: {
                        args[1] = "getContainingDeclaration";
                        break;
                    }
                }
            }
            else {
                args[1] = "copy";
            }
        }
        else {
            args[1] = "getOverriddenDescriptors";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 15:
                case 16:
                case 17:
                case 19:
                case 25: {
                    final String format2 = String.format(format, args);
                    if (n != 19 && n != 25) {
                        switch (n) {
                            default: {
                                throw new IllegalArgumentException(format2);
                            }
                            case 15:
                            case 16:
                            case 17: {
                                break;
                            }
                        }
                    }
                    throw new IllegalStateException(format2);
                }
                case 21:
                case 22:
                case 23:
                case 24: {
                    args[2] = "createSubstitutedCopy";
                    continue;
                }
                case 20: {
                    args[2] = "setOverriddenDescriptors";
                    continue;
                }
                case 18: {
                    args[2] = "substitute";
                    continue;
                }
                case 10:
                case 11:
                case 12:
                case 13:
                case 14: {
                    args[2] = "initialize";
                    continue;
                }
                case 7:
                case 8:
                case 9: {
                    args[2] = "createSynthesized";
                    continue;
                }
                case 4:
                case 5:
                case 6: {
                    args[2] = "create";
                    continue;
                }
            }
            break;
        }
    }
    
    @org.jetbrains.annotations.e
    public static f n1(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @org.jetbrains.annotations.e final g g, final boolean b, @org.jetbrains.annotations.e final w0 w0) {
        if (e == null) {
            L(4);
        }
        if (g == null) {
            L(5);
        }
        if (w0 == null) {
            L(6);
        }
        return new f(e, null, g, b, b.a.G, w0);
    }
    
    @Override
    public void A0(@org.jetbrains.annotations.e final Collection<? extends b> collection) {
        if (collection == null) {
            L(20);
        }
    }
    
    @Override
    public boolean H() {
        return this.j0;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.e I() {
        final kotlin.reflect.jvm.internal.impl.descriptors.e p1 = this.p1();
        if (p1 == null) {
            L(16);
        }
        return p1;
    }
    
    @Override
    public <R, D> R P(final o<R, D> o, final D n) {
        return o.h(this, n);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public d b() {
        final d d = (d)super.b();
        if (d == null) {
            L(17);
        }
        return d;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public d d(@org.jetbrains.annotations.e final d1 d1) {
        if (d1 == null) {
            L(18);
        }
        return (d)super.d(d1);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<? extends y> g() {
        final Set<? extends y> emptySet = Collections.emptySet();
        if (emptySet == null) {
            L(19);
        }
        return emptySet;
    }
    
    @org.jetbrains.annotations.f
    public t0 l1() {
        final kotlin.reflect.jvm.internal.impl.descriptors.e p1 = this.p1();
        if (p1.u()) {
            final m c = p1.c();
            if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return ((kotlin.reflect.jvm.internal.impl.descriptors.e)c).K0();
            }
        }
        return null;
    }
    
    @org.jetbrains.annotations.e
    public d m1(final m m, final b0 b0, final u u, final b.a a, final boolean b2) {
        final d d = (d)super.L0(m, b0, u, a, b2);
        if (d == null) {
            L(25);
        }
        return d;
    }
    
    @org.jetbrains.annotations.e
    protected f o1(@org.jetbrains.annotations.e final m obj, @org.jetbrains.annotations.f final y y, @org.jetbrains.annotations.e final b.a obj2, @org.jetbrains.annotations.f final e e, @org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final w0 w0) {
        if (obj == null) {
            L(21);
        }
        if (obj2 == null) {
            L(22);
        }
        if (g == null) {
            L(23);
        }
        if (w0 == null) {
            L(24);
        }
        final b.a g2 = b.a.G;
        if (obj2 != g2 && obj2 != b.a.J) {
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
        return new f((kotlin.reflect.jvm.internal.impl.descriptors.e)obj, this, g, this.j0, g2, w0);
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e p1() {
        final kotlin.reflect.jvm.internal.impl.descriptors.e e = (kotlin.reflect.jvm.internal.impl.descriptors.e)super.c();
        if (e == null) {
            L(15);
        }
        return e;
    }
    
    public f q1(@org.jetbrains.annotations.e final List<e1> list, @org.jetbrains.annotations.e final u u) {
        if (list == null) {
            L(13);
        }
        if (u == null) {
            L(14);
        }
        this.r1(list, u, this.p1().C());
        return this;
    }
    
    public f r1(@org.jetbrains.annotations.e final List<e1> list, @org.jetbrains.annotations.e final u u, @org.jetbrains.annotations.e final List<b1> list2) {
        if (list == null) {
            L(10);
        }
        if (u == null) {
            L(11);
        }
        if (list2 == null) {
            L(12);
        }
        super.S0(null, this.l1(), list2, list, null, kotlin.reflect.jvm.internal.impl.descriptors.b0.H, u);
        return this;
    }
}
