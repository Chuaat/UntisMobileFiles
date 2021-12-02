// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h$c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.types.j;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.f;

public class y extends g
{
    private final f P;
    private final boolean Q;
    private b0 R;
    private u S;
    private w0 T;
    private List<b1> U;
    private final Collection<c0> V;
    private final kotlin.reflect.jvm.internal.impl.storage.n W;
    
    public y(@org.jetbrains.annotations.e final m m, @org.jetbrains.annotations.e final f p7, final boolean q, final boolean b, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.w0 w0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n w2) {
        if (m == null) {
            O(0);
        }
        if (p7 == null) {
            O(1);
        }
        if (e == null) {
            O(2);
        }
        if (w0 == null) {
            O(3);
        }
        if (w2 == null) {
            O(4);
        }
        super(w2, m, e, w0, b);
        this.V = new ArrayList<c0>();
        this.W = w2;
        this.P = p7;
        this.Q = q;
    }
    
    private static /* synthetic */ void O(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19: {
                format = "@NotNull method %s.%s must not return null";
                break;
            }
        }
        int n2 = 0;
        switch (n) {
            default: {
                n2 = 3;
                break;
            }
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19: {
                n2 = 2;
                break;
            }
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "containingDeclaration";
                break;
            }
            case 16: {
                args[0] = "kotlinTypeRefiner";
                break;
            }
            case 14: {
                args[0] = "typeParameters";
                break;
            }
            case 12: {
                args[0] = "supertype";
                break;
            }
            case 9: {
                args[0] = "visibility";
                break;
            }
            case 6: {
                args[0] = "modality";
                break;
            }
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            }
            case 4: {
                args[0] = "storageManager";
                break;
            }
            case 3: {
                args[0] = "source";
                break;
            }
            case 2: {
                args[0] = "name";
                break;
            }
            case 1: {
                args[0] = "kind";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            }
            case 19: {
                args[1] = "getSealedSubclasses";
                break;
            }
            case 18: {
                args[1] = "getStaticScope";
                break;
            }
            case 17: {
                args[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 15: {
                args[1] = "getDeclaredTypeParameters";
                break;
            }
            case 13: {
                args[1] = "getConstructors";
                break;
            }
            case 11: {
                args[1] = "getTypeConstructor";
                break;
            }
            case 10: {
                args[1] = "getVisibility";
                break;
            }
            case 8: {
                args[1] = "getKind";
                break;
            }
            case 7: {
                args[1] = "getModality";
                break;
            }
            case 5: {
                args[1] = "getAnnotations";
                break;
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 5:
                case 7:
                case 8:
                case 10:
                case 11:
                case 13:
                case 15:
                case 17:
                case 18:
                case 19: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex = null;
                    switch (n) {
                        default: {
                            ex = new IllegalArgumentException(format2);
                            break;
                        }
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                        case 13:
                        case 15:
                        case 17:
                        case 18:
                        case 19: {
                            ex = new IllegalStateException(format2);
                            break;
                        }
                    }
                    throw ex;
                }
                case 16: {
                    args[2] = "getUnsubstitutedMemberScope";
                    continue;
                }
                case 14: {
                    args[2] = "setTypeParameterDescriptors";
                    continue;
                }
                case 12: {
                    args[2] = "addSupertype";
                    continue;
                }
                case 9: {
                    args[2] = "setVisibility";
                    continue;
                }
                case 6: {
                    args[2] = "setModality";
                    continue;
                }
            }
            break;
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<b1> C() {
        final List<b1> u = this.U;
        if (u == null) {
            O(15);
        }
        return u;
    }
    
    @Override
    public boolean D() {
        return false;
    }
    
    @Override
    public boolean F0() {
        return false;
    }
    
    @Override
    public boolean G() {
        return false;
    }
    
    public void L0() {
        this.T = (w0)new j((e)this, (List)this.U, (Collection)this.V, this.W);
        final Iterator<d> iterator = this.M0().iterator();
        while (iterator.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.f)iterator.next()).h1((c0)this.A());
        }
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h M(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        if (g == null) {
            O(16);
        }
        final h$c b = h$c.b;
        if (b == null) {
            O(17);
        }
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)b;
    }
    
    @org.jetbrains.annotations.e
    public Set<d> M0() {
        final Set<d> emptySet = Collections.emptySet();
        if (emptySet == null) {
            O(13);
        }
        return emptySet;
    }
    
    public void N0(@org.jetbrains.annotations.e final b0 r) {
        if (r == null) {
            O(6);
        }
        this.R = r;
    }
    
    public void O0(@org.jetbrains.annotations.e final List<b1> c) {
        if (c == null) {
            O(14);
        }
        if (this.U == null) {
            this.U = new ArrayList<b1>(c);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Type parameters are already set for ");
        sb.append(this.getName());
        throw new IllegalStateException(sb.toString());
    }
    
    public void P0(@org.jetbrains.annotations.e final u s) {
        if (s == null) {
            O(9);
        }
        this.S = s;
    }
    
    @Override
    public boolean Q() {
        return false;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public d U() {
        return null;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h V() {
        final h$c b = h$c.b;
        if (b == null) {
            O(18);
        }
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)b;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public e X() {
        return null;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
        if (b == null) {
            O(5);
        }
        return b;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public u getVisibility() {
        final u s = this.S;
        if (s == null) {
            O(10);
        }
        return s;
    }
    
    @Override
    public boolean isInline() {
        return false;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public w0 l() {
        final w0 t = this.T;
        if (t == null) {
            O(11);
        }
        return t;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public f n() {
        final f p = this.P;
        if (p == null) {
            O(8);
        }
        return p;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public b0 o() {
        final b0 r = this.R;
        if (r == null) {
            O(7);
        }
        return r;
    }
    
    @Override
    public boolean q() {
        return false;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<e> s() {
        final List<e> emptyList = Collections.emptyList();
        if (emptyList == null) {
            O(19);
        }
        return emptyList;
    }
    
    @Override
    public boolean t() {
        return false;
    }
    
    @Override
    public String toString() {
        return kotlin.reflect.jvm.internal.impl.descriptors.impl.j.M(this);
    }
    
    @Override
    public boolean u() {
        return this.Q;
    }
}
