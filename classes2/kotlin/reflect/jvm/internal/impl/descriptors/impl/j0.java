// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.c0;
import n6.l;

public class j0 extends e
{
    @f
    private final l<c0, Void> Q;
    private final List<c0> R;
    private boolean S;
    
    private j0(@org.jetbrains.annotations.e final m m, @org.jetbrains.annotations.e final g g, final boolean b, @org.jetbrains.annotations.e final k1 k1, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, final int n, @org.jetbrains.annotations.e final w0 w0, @f final l<c0, Void> q, @org.jetbrains.annotations.e final z0 z0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n n2) {
        if (m == null) {
            L(19);
        }
        if (g == null) {
            L(20);
        }
        if (k1 == null) {
            L(21);
        }
        if (e == null) {
            L(22);
        }
        if (w0 == null) {
            L(23);
        }
        if (z0 == null) {
            L(24);
        }
        if (n2 == null) {
            L(25);
        }
        super(n2, m, g, e, k1, b, n, w0, z0);
        this.R = new ArrayList<c0>(1);
        this.S = false;
        this.Q = q;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 5 && n != 28) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 5 && n != 28) {
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
            case 27: {
                args[0] = "type";
                break;
            }
            case 26: {
                args[0] = "bound";
                break;
            }
            case 24: {
                args[0] = "supertypeLoopsChecker";
                break;
            }
            case 17: {
                args[0] = "supertypeLoopsResolver";
                break;
            }
            case 10:
            case 16:
            case 23: {
                args[0] = "source";
                break;
            }
            case 5:
            case 28: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            }
            case 4:
            case 11:
            case 18:
            case 25: {
                args[0] = "storageManager";
                break;
            }
            case 3:
            case 9:
            case 15:
            case 22: {
                args[0] = "name";
                break;
            }
            case 2:
            case 8:
            case 14:
            case 21: {
                args[0] = "variance";
                break;
            }
            case 1:
            case 7:
            case 13:
            case 20: {
                args[0] = "annotations";
                break;
            }
        }
        if (n != 5) {
            if (n != 28) {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
            }
            else {
                args[1] = "resolveUpperBounds";
            }
        }
        else {
            args[1] = "createWithDefaultBound";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "createWithDefaultBound";
                }
                case 5:
                case 28: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 5 && n != 28) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 27: {
                    args[2] = "reportSupertypeLoopError";
                    continue;
                }
                case 26: {
                    args[2] = "addUpperBound";
                    continue;
                }
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25: {
                    args[2] = "<init>";
                    continue;
                }
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18: {
                    args[2] = "createForFurtherModification";
                    continue;
                }
            }
            break;
        }
    }
    
    private void O0() {
        if (this.S) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Type parameter descriptor is not initialized: ");
        sb.append(this.U0());
        throw new IllegalStateException(sb.toString());
    }
    
    private void P0() {
        if (!this.S) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Type parameter descriptor is already initialized: ");
        sb.append(this.U0());
        throw new IllegalStateException(sb.toString());
    }
    
    public static j0 Q0(@org.jetbrains.annotations.e final m m, @org.jetbrains.annotations.e final g g, final boolean b, @org.jetbrains.annotations.e final k1 k1, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, final int n, @org.jetbrains.annotations.e final w0 w0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n n2) {
        if (m == null) {
            L(6);
        }
        if (g == null) {
            L(7);
        }
        if (k1 == null) {
            L(8);
        }
        if (e == null) {
            L(9);
        }
        if (w0 == null) {
            L(10);
        }
        if (n2 == null) {
            L(11);
        }
        return R0(m, g, b, k1, e, n, w0, null, z0.a.a, n2);
    }
    
    public static j0 R0(@org.jetbrains.annotations.e final m m, @org.jetbrains.annotations.e final g g, final boolean b, @org.jetbrains.annotations.e final k1 k1, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, final int n, @org.jetbrains.annotations.e final w0 w0, @f final l<c0, Void> l, @org.jetbrains.annotations.e final z0 z0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n n2) {
        if (m == null) {
            L(12);
        }
        if (g == null) {
            L(13);
        }
        if (k1 == null) {
            L(14);
        }
        if (e == null) {
            L(15);
        }
        if (w0 == null) {
            L(16);
        }
        if (z0 == null) {
            L(17);
        }
        if (n2 == null) {
            L(18);
        }
        return new j0(m, g, b, k1, e, n, w0, l, z0, n2);
    }
    
    @org.jetbrains.annotations.e
    public static b1 S0(@org.jetbrains.annotations.e final m m, @org.jetbrains.annotations.e final g g, final boolean b, @org.jetbrains.annotations.e final k1 k1, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, final int n, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n n2) {
        if (m == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (k1 == null) {
            L(2);
        }
        if (e == null) {
            L(3);
        }
        if (n2 == null) {
            L(4);
        }
        final j0 q0 = Q0(m, g, b, k1, e, n, w0.a, n2);
        q0.N0((c0)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g(m).getDefaultBound());
        q0.V0();
        return q0;
    }
    
    private void T0(final c0 c0) {
        if (e0.a(c0)) {
            return;
        }
        this.R.add(c0);
    }
    
    private String U0() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getName());
        sb.append(" declared in ");
        sb.append(d.m(this.c()));
        return sb.toString();
    }
    
    @Override
    protected void L0(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            L(27);
        }
        final l<c0, Void> q = this.Q;
        if (q == null) {
            return;
        }
        q.invoke(c0);
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected List<c0> M0() {
        this.O0();
        final List<c0> r = this.R;
        if (r == null) {
            L(28);
        }
        return r;
    }
    
    public void N0(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            L(26);
        }
        this.P0();
        this.T0(c0);
    }
    
    public void V0() {
        this.P0();
        this.S = true;
    }
}
