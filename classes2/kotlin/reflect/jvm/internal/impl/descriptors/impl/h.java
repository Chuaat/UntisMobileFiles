// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h$c;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.j;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;

public class h extends g
{
    private final b0 P;
    private final f Q;
    private final w0 R;
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.h S;
    private Set<d> T;
    private d U;
    
    public h(@org.jetbrains.annotations.e final m m, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final b0 p8, @org.jetbrains.annotations.e final f q, @org.jetbrains.annotations.e final Collection<c0> collection, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.w0 w0, final boolean b, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n n) {
        if (m == null) {
            O(0);
        }
        if (e == null) {
            O(1);
        }
        if (p8 == null) {
            O(2);
        }
        if (q == null) {
            O(3);
        }
        if (collection == null) {
            O(4);
        }
        if (w0 == null) {
            O(5);
        }
        if (n == null) {
            O(6);
        }
        super(n, m, e, w0, b);
        this.P = p8;
        this.Q = q;
        this.R = (w0)new j((e)this, (List)Collections.emptyList(), (Collection)collection, n);
    }
    
    private static /* synthetic */ void O(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
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
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
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
            case 12: {
                args[0] = "kotlinTypeRefiner";
                break;
            }
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            }
            case 8: {
                args[0] = "constructors";
                break;
            }
            case 7: {
                args[0] = "unsubstitutedMemberScope";
                break;
            }
            case 6: {
                args[0] = "storageManager";
                break;
            }
            case 5: {
                args[0] = "source";
                break;
            }
            case 4: {
                args[0] = "supertypes";
                break;
            }
            case 3: {
                args[0] = "kind";
                break;
            }
            case 2: {
                args[0] = "modality";
                break;
            }
            case 1: {
                args[0] = "name";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            }
            case 19: {
                args[1] = "getSealedSubclasses";
                break;
            }
            case 18: {
                args[1] = "getDeclaredTypeParameters";
                break;
            }
            case 17: {
                args[1] = "getVisibility";
                break;
            }
            case 16: {
                args[1] = "getModality";
                break;
            }
            case 15: {
                args[1] = "getKind";
                break;
            }
            case 14: {
                args[1] = "getStaticScope";
                break;
            }
            case 13: {
                args[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 11: {
                args[1] = "getConstructors";
                break;
            }
            case 10: {
                args[1] = "getTypeConstructor";
                break;
            }
            case 9: {
                args[1] = "getAnnotations";
                break;
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 9:
                case 10:
                case 11:
                case 13:
                case 14:
                case 15:
                case 16:
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
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19: {
                            ex = new IllegalStateException(format2);
                            break;
                        }
                    }
                    throw ex;
                }
                case 12: {
                    args[2] = "getUnsubstitutedMemberScope";
                    continue;
                }
                case 7:
                case 8: {
                    args[2] = "initialize";
                    continue;
                }
            }
            break;
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<b1> C() {
        final List<b1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            O(18);
        }
        return emptyList;
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
    
    public final void L0(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.scopes.h s, @org.jetbrains.annotations.e final Set<d> t, @org.jetbrains.annotations.f final d u) {
        if (s == null) {
            O(7);
        }
        if (t == null) {
            O(8);
        }
        this.S = s;
        this.T = t;
        this.U = u;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h M(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        if (g == null) {
            O(12);
        }
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h s = this.S;
        if (s == null) {
            O(13);
        }
        return s;
    }
    
    @Override
    public boolean Q() {
        return false;
    }
    
    @Override
    public d U() {
        return this.U;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h V() {
        final h$c b = h$c.b;
        if (b == null) {
            O(14);
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
            O(9);
        }
        return b;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public u getVisibility() {
        final u e = kotlin.reflect.jvm.internal.impl.descriptors.t.e;
        if (e == null) {
            O(17);
        }
        return e;
    }
    
    @Override
    public boolean isInline() {
        return false;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<d> j() {
        final Set<d> t = this.T;
        if (t == null) {
            O(11);
        }
        return t;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public w0 l() {
        final w0 r = this.R;
        if (r == null) {
            O(10);
        }
        return r;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public f n() {
        final f q = this.Q;
        if (q == null) {
            O(15);
        }
        return q;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public b0 o() {
        final b0 p = this.P;
        if (p == null) {
            O(16);
        }
        return p;
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
        final StringBuilder sb = new StringBuilder();
        sb.append("class ");
        sb.append(this.getName());
        return sb.toString();
    }
    
    @Override
    public boolean u() {
        return false;
    }
}
