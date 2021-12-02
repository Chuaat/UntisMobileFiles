// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.reflect.jvm.internal.impl.descriptors.a$a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.types.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.y$a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f0;

public class a extends f0
{
    private final u.d j0;
    
    public a(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final u.d j0) {
        if (e == null) {
            L(0);
        }
        if (j0 == null) {
            L(1);
        }
        super((m)e, (v0)null, g.r.b(), kotlin.reflect.jvm.internal.impl.name.e.l("<ERROR FUNCTION>"), b$a.G, w0.a);
        this.j0 = j0;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 6 && n != 7) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 6 && n != 7) {
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
            case 8: {
                args[0] = "overriddenDescriptors";
                break;
            }
            case 6:
            case 7: {
                args[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
                break;
            }
            case 5: {
                args[0] = "source";
                break;
            }
            case 4: {
                args[0] = "annotations";
                break;
            }
            case 3: {
                args[0] = "kind";
                break;
            }
            case 2: {
                args[0] = "newOwner";
                break;
            }
            case 1: {
                args[0] = "ownerScope";
                break;
            }
        }
        if (n != 6) {
            if (n != 7) {
                args[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
            }
            else {
                args[1] = "copy";
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
                case 6:
                case 7: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 6 && n != 7) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 8: {
                    args[2] = "setOverriddenDescriptors";
                    continue;
                }
                case 2:
                case 3:
                case 4:
                case 5: {
                    args[2] = "createSubstitutedCopy";
                    continue;
                }
            }
            break;
        }
    }
    
    public void A0(@org.jetbrains.annotations.e final Collection<? extends b> collection) {
        if (collection == null) {
            L(8);
        }
    }
    
    @org.jetbrains.annotations.e
    public y$a<? extends v0> B() {
        return (y$a<? extends v0>)new y$a<v0>() {
            private static /* synthetic */ void u(final int n) {
                String format = null;
                Label_0125: {
                    if (n != 1 && n != 3 && n != 5 && n != 10 && n != 12 && n != 14 && n != 16 && n != 18 && n != 30 && n != 7 && n != 8) {
                        switch (n) {
                            default: {
                                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                break Label_0125;
                            }
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28: {
                                break;
                            }
                        }
                    }
                    format = "@NotNull method %s.%s must not return null";
                }
                int n2 = 0;
                Label_0247: {
                    if (n != 1 && n != 3 && n != 5 && n != 10 && n != 12 && n != 14 && n != 16 && n != 18 && n != 30 && n != 7 && n != 8) {
                        switch (n) {
                            default: {
                                n2 = 3;
                                break Label_0247;
                            }
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28: {
                                break;
                            }
                        }
                    }
                    n2 = 2;
                }
                final Object[] args = new Object[n2];
                switch (n) {
                    default: {
                        args[0] = "owner";
                        break;
                    }
                    case 29: {
                        args[0] = "additionalAnnotations";
                        break;
                    }
                    case 19: {
                        args[0] = "type";
                        break;
                    }
                    case 15: {
                        args[0] = "userDataKey";
                        break;
                    }
                    case 13: {
                        args[0] = "substitution";
                        break;
                    }
                    case 11:
                    case 17: {
                        args[0] = "parameters";
                        break;
                    }
                    case 9: {
                        args[0] = "name";
                        break;
                    }
                    case 6: {
                        args[0] = "kind";
                        break;
                    }
                    case 4: {
                        args[0] = "visibility";
                        break;
                    }
                    case 2: {
                        args[0] = "modality";
                        break;
                    }
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    case 14:
                    case 16:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 30: {
                        args[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                        break;
                    }
                }
                if (n != 1) {
                    if (n != 3) {
                        if (n != 5) {
                            if (n != 10) {
                                if (n != 12) {
                                    if (n != 14) {
                                        if (n != 16) {
                                            if (n != 18) {
                                                if (n != 30) {
                                                    if (n != 7) {
                                                        if (n != 8) {
                                                            switch (n) {
                                                                default: {
                                                                    args[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                                                                    break;
                                                                }
                                                                case 28: {
                                                                    args[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                                                                    break;
                                                                }
                                                                case 27: {
                                                                    args[1] = "setHiddenToOvercomeSignatureClash";
                                                                    break;
                                                                }
                                                                case 26: {
                                                                    args[1] = "setDropOriginalInContainingParts";
                                                                    break;
                                                                }
                                                                case 25: {
                                                                    args[1] = "setPreserveSourceElement";
                                                                    break;
                                                                }
                                                                case 24: {
                                                                    args[1] = "setSignatureChange";
                                                                    break;
                                                                }
                                                                case 23: {
                                                                    args[1] = "setOriginal";
                                                                    break;
                                                                }
                                                                case 22: {
                                                                    args[1] = "setDispatchReceiverParameter";
                                                                    break;
                                                                }
                                                                case 21: {
                                                                    args[1] = "setExtensionReceiverParameter";
                                                                    break;
                                                                }
                                                                case 20: {
                                                                    args[1] = "setReturnType";
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            args[1] = "setCopyOverrides";
                                                        }
                                                    }
                                                    else {
                                                        args[1] = "setKind";
                                                    }
                                                }
                                                else {
                                                    args[1] = "setAdditionalAnnotations";
                                                }
                                            }
                                            else {
                                                args[1] = "setTypeParameters";
                                            }
                                        }
                                        else {
                                            args[1] = "putUserData";
                                        }
                                    }
                                    else {
                                        args[1] = "setSubstitution";
                                    }
                                }
                                else {
                                    args[1] = "setValueParameters";
                                }
                            }
                            else {
                                args[1] = "setName";
                            }
                        }
                        else {
                            args[1] = "setVisibility";
                        }
                    }
                    else {
                        args[1] = "setModality";
                    }
                }
                else {
                    args[1] = "setOwner";
                }
                while (true) {
                    switch (n) {
                        default: {
                            args[2] = "setOwner";
                        }
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        case 14:
                        case 16:
                        case 18:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 30: {
                            final String format2 = String.format(format, args);
                            if (n != 1 && n != 3 && n != 5 && n != 10 && n != 12 && n != 14 && n != 16 && n != 18 && n != 30 && n != 7 && n != 8) {
                                switch (n) {
                                    default: {
                                        throw new IllegalArgumentException(format2);
                                    }
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28: {
                                        break;
                                    }
                                }
                            }
                            throw new IllegalStateException(format2);
                        }
                        case 29: {
                            args[2] = "setAdditionalAnnotations";
                            continue;
                        }
                        case 19: {
                            args[2] = "setReturnType";
                            continue;
                        }
                        case 17: {
                            args[2] = "setTypeParameters";
                            continue;
                        }
                        case 15: {
                            args[2] = "putUserData";
                            continue;
                        }
                        case 13: {
                            args[2] = "setSubstitution";
                            continue;
                        }
                        case 11: {
                            args[2] = "setValueParameters";
                            continue;
                        }
                        case 9: {
                            args[2] = "setName";
                            continue;
                        }
                        case 6: {
                            args[2] = "setKind";
                            continue;
                        }
                        case 4: {
                            args[2] = "setVisibility";
                            continue;
                        }
                        case 2: {
                            args[2] = "setModality";
                            continue;
                        }
                    }
                    break;
                }
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> a() {
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> b(@org.jetbrains.annotations.e final List<e1> list) {
                if (list == null) {
                    u(11);
                }
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> c(@org.jetbrains.annotations.e final b0 b0) {
                if (b0 == null) {
                    u(2);
                }
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> d(@f final t0 t0) {
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> e() {
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> f(@org.jetbrains.annotations.e final c0 c0) {
                if (c0 == null) {
                    u(19);
                }
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> g(@f final b b) {
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> i() {
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> j(final boolean b) {
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> k(@f final t0 t0) {
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> l(@org.jetbrains.annotations.e final b1 b1) {
                if (b1 == null) {
                    u(13);
                }
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> m(@org.jetbrains.annotations.e final List<kotlin.reflect.jvm.internal.impl.descriptors.b1> list) {
                if (list == null) {
                    u(17);
                }
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> n(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.u u) {
                if (u == null) {
                    u(4);
                }
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> o(@org.jetbrains.annotations.e final m m) {
                if (m == null) {
                    u(0);
                }
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> p() {
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> q(@org.jetbrains.annotations.e final b$a b$a) {
                if (b$a == null) {
                    u(6);
                }
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> r(@org.jetbrains.annotations.e final g g) {
                if (g == null) {
                    u(29);
                }
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> s(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
                if (e == null) {
                    u(9);
                }
                return (y$a<v0>)this;
            }
            
            @org.jetbrains.annotations.e
            public y$a<v0> t() {
                return (y$a<v0>)this;
            }
            
            @f
            public v0 v() {
                return (v0)kotlin.reflect.jvm.internal.impl.types.error.a.this;
            }
        };
    }
    
    @org.jetbrains.annotations.e
    protected p M0(@org.jetbrains.annotations.e final m m, @f final y y, @org.jetbrains.annotations.e final b$a b$a, @f final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final w0 w0) {
        if (m == null) {
            L(2);
        }
        if (b$a == null) {
            L(3);
        }
        if (g == null) {
            L(4);
        }
        if (w0 == null) {
            L(5);
        }
        return (p)this;
    }
    
    public boolean isSuspend() {
        return false;
    }
    
    @org.jetbrains.annotations.e
    public v0 l1(final m m, final b0 b0, final kotlin.reflect.jvm.internal.impl.descriptors.u u, final b$a b$a, final boolean b2) {
        return (v0)this;
    }
    
    public <V> V m0(final kotlin.reflect.jvm.internal.impl.descriptors.a$a<V> a$a) {
        return null;
    }
}
