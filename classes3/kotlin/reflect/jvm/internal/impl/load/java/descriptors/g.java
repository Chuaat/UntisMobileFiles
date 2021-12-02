// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.k;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.t;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.storage.j;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.a$a;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b0;

public class g extends b0 implements b
{
    private final boolean i0;
    @f
    private final s0<a$a<?>, ?> j0;
    
    protected g(@e final m m, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0, @e final u u, final boolean b2, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final w0 w0, @f final q0 q0, @e final b$a b$a, final boolean i0, @f final s0<a$a<?>, ?> j0) {
        if (m == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (b0 == null) {
            L(2);
        }
        if (u == null) {
            L(3);
        }
        if (e == null) {
            L(4);
        }
        if (w0 == null) {
            L(5);
        }
        if (b$a == null) {
            L(6);
        }
        super(m, q0, g, b0, u, b2, e, b$a, w0, false, false, false, false, false, false);
        this.i0 = i0;
        this.j0 = j0;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 21) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 21) {
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
            case 21: {
                args[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            }
            case 20: {
                args[0] = "enhancedReturnType";
                break;
            }
            case 19: {
                args[0] = "enhancedValueParametersData";
                break;
            }
            case 17: {
                args[0] = "newName";
                break;
            }
            case 15: {
                args[0] = "newVisibility";
                break;
            }
            case 14: {
                args[0] = "newModality";
                break;
            }
            case 13: {
                args[0] = "newOwner";
                break;
            }
            case 6:
            case 16: {
                args[0] = "kind";
                break;
            }
            case 5:
            case 12:
            case 18: {
                args[0] = "source";
                break;
            }
            case 4:
            case 11: {
                args[0] = "name";
                break;
            }
            case 3:
            case 10: {
                args[0] = "visibility";
                break;
            }
            case 2:
            case 9: {
                args[0] = "modality";
                break;
            }
            case 1:
            case 8: {
                args[0] = "annotations";
                break;
            }
        }
        if (n != 21) {
            args[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        }
        else {
            args[1] = "enhance";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 21: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 21) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 19:
                case 20: {
                    args[2] = "enhance";
                    continue;
                }
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18: {
                    args[2] = "createSubstitutedCopy";
                    continue;
                }
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12: {
                    args[2] = "create";
                    continue;
                }
            }
            break;
        }
    }
    
    @e
    public static g d1(@e final m m, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0, @e final u u, final boolean b2, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final w0 w0, final boolean b3) {
        if (m == null) {
            L(7);
        }
        if (g == null) {
            L(8);
        }
        if (b0 == null) {
            L(9);
        }
        if (u == null) {
            L(10);
        }
        if (e == null) {
            L(11);
        }
        if (w0 == null) {
            L(12);
        }
        return new g(m, g, b0, u, b2, e, w0, null, b$a.G, b3, null);
    }
    
    @e
    public b F(@f final c0 c0, @e final List<l> list, @e final c0 c2, @f final s0<a$a<?>, ?> s0) {
        if (list == null) {
            L(19);
        }
        if (c2 == null) {
            L(20);
        }
        q0 b;
        if (this.b() == this) {
            b = null;
        }
        else {
            b = this.b();
        }
        final g g = new g(((k)this).c(), ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.b)this).getAnnotations(), this.o(), this.getVisibility(), ((m0)this).n0(), ((kotlin.reflect.jvm.internal.impl.descriptors.impl.j)this).getName(), ((k)this).k(), b, this.n(), this.i0, s0);
        final kotlin.reflect.jvm.internal.impl.descriptors.impl.c0 s2 = this.S0();
        kotlin.reflect.jvm.internal.impl.descriptors.impl.c0 c3;
        if (s2 != null) {
            final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.b)s2).getAnnotations();
            final kotlin.reflect.jvm.internal.impl.descriptors.b0 o = ((a0)s2).o();
            final u visibility = ((a0)s2).getVisibility();
            final boolean y = ((a0)s2).Y();
            final boolean external = ((a0)s2).isExternal();
            final boolean inline = ((a0)s2).isInline();
            final b$a n = this.n();
            r0 e;
            if (b == null) {
                e = null;
            }
            else {
                e = b.e();
            }
            c3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.c0((q0)g, annotations, o, visibility, y, external, inline, n, e, ((k)s2).k());
            ((a0)c3).O0(((a0)s2).h0());
            c3.R0(c2);
        }
        else {
            c3 = null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.s0 h = this.h();
        d0 d0;
        if (h != null) {
            final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations2 = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)h).getAnnotations();
            final kotlin.reflect.jvm.internal.impl.descriptors.b0 o2 = ((kotlin.reflect.jvm.internal.impl.descriptors.a0)h).o();
            final u visibility2 = ((kotlin.reflect.jvm.internal.impl.descriptors.a0)h).getVisibility();
            final boolean y2 = ((p0)h).Y();
            final boolean external2 = ((kotlin.reflect.jvm.internal.impl.descriptors.a0)h).isExternal();
            final boolean inline2 = ((y)h).isInline();
            final b$a n2 = this.n();
            kotlin.reflect.jvm.internal.impl.descriptors.s0 h2;
            if (b == null) {
                h2 = null;
            }
            else {
                h2 = b.h();
            }
            d0 = new d0((q0)g, annotations2, o2, visibility2, y2, external2, inline2, n2, h2, ((p)h).k());
            ((a0)d0).O0(((a0)d0).h0());
            d0.S0((e1)((a)h).m().get(0));
        }
        else {
            d0 = null;
        }
        g.W0(c3, (kotlin.reflect.jvm.internal.impl.descriptors.s0)d0, this.u0(), this.r0());
        g.a1(this.X0());
        final j n3 = ((m0)this).N;
        if (n3 != null) {
            ((m0)g).M0(n3);
        }
        g.A0(this.g());
        t0 f;
        if (c0 == null) {
            f = null;
        }
        else {
            f = c.f((a)this, c0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b());
        }
        g.b1(c2, this.getTypeParameters(), this.j0(), f);
        return g;
    }
    
    public boolean K() {
        return false;
    }
    
    @e
    protected b0 Q0(@e final m m, @e final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0, @e final u u, @f final q0 q0, @e final b$a b$a, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final w0 w0) {
        if (m == null) {
            L(13);
        }
        if (b0 == null) {
            L(14);
        }
        if (u == null) {
            L(15);
        }
        if (b$a == null) {
            L(16);
        }
        if (e == null) {
            L(17);
        }
        if (w0 == null) {
            L(18);
        }
        return new g(m, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.b)this).getAnnotations(), b0, u, ((m0)this).n0(), e, w0, q0, b$a, this.i0, this.j0);
    }
    
    @f
    public <V> V m0(final a$a<V> obj) {
        final s0<a$a<?>, ?> j0 = this.j0;
        if (j0 != null && ((a$a)j0.e()).equals(obj)) {
            return (V)this.j0.f();
        }
        return null;
    }
    
    public boolean p() {
        final c0 a = ((l0)this).a();
        return this.i0 && kotlin.reflect.jvm.internal.impl.descriptors.j.a(a) && (!t.i(a) || KotlinBuiltIns.isString(a));
    }
}
