// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.LinkedHashSet;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import java.util.HashSet;
import n6.a;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h$c;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.j;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.name.e;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.w0;

public class n extends g
{
    private final w0 P;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h Q;
    private final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.e>> R;
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g S;
    
    private n(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n n, @org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final c0 o, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e2, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.e>> r, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g s, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.w0 w0) {
        if (n == null) {
            O(6);
        }
        if (e == null) {
            O(7);
        }
        if (o == null) {
            O(8);
        }
        if (e2 == null) {
            O(9);
        }
        if (r == null) {
            O(10);
        }
        if (s == null) {
            O(11);
        }
        if (w0 == null) {
            O(12);
        }
        super(n, e, e2, w0, false);
        this.S = s;
        this.P = (w0)new j((e)this, (List)Collections.emptyList(), (Collection)Collections.singleton(o), n);
        this.Q = (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)new a(n);
        this.R = r;
    }
    
    @org.jetbrains.annotations.e
    public static n M0(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n n, @org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e2, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.e>> i, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.w0 w0) {
        if (n == null) {
            O(0);
        }
        if (e == null) {
            O(1);
        }
        if (e2 == null) {
            O(2);
        }
        if (i == null) {
            O(3);
        }
        if (g == null) {
            O(4);
        }
        if (w0 == null) {
            O(5);
        }
        return new n(n, e, (c0)e.A(), e2, i, g, w0);
    }
    
    private static /* synthetic */ void O(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23: {
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
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23: {
                n2 = 2;
                break;
            }
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "storageManager";
                break;
            }
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            }
            case 13: {
                args[0] = "kotlinTypeRefiner";
                break;
            }
            case 8: {
                args[0] = "supertype";
                break;
            }
            case 7: {
                args[0] = "containingClass";
                break;
            }
            case 5:
            case 12: {
                args[0] = "source";
                break;
            }
            case 4:
            case 11: {
                args[0] = "annotations";
                break;
            }
            case 3:
            case 10: {
                args[0] = "enumMemberNames";
                break;
            }
            case 2:
            case 9: {
                args[0] = "name";
                break;
            }
            case 1: {
                args[0] = "enumClass";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            }
            case 23: {
                args[1] = "getSealedSubclasses";
                break;
            }
            case 22: {
                args[1] = "getDeclaredTypeParameters";
                break;
            }
            case 21: {
                args[1] = "getAnnotations";
                break;
            }
            case 20: {
                args[1] = "getVisibility";
                break;
            }
            case 19: {
                args[1] = "getModality";
                break;
            }
            case 18: {
                args[1] = "getKind";
                break;
            }
            case 17: {
                args[1] = "getTypeConstructor";
                break;
            }
            case 16: {
                args[1] = "getConstructors";
                break;
            }
            case 15: {
                args[1] = "getStaticScope";
                break;
            }
            case 14: {
                args[1] = "getUnsubstitutedMemberScope";
                break;
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "create";
                }
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex = null;
                    switch (n) {
                        default: {
                            ex = new IllegalArgumentException(format2);
                            break;
                        }
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23: {
                            ex = new IllegalStateException(format2);
                            break;
                        }
                    }
                    throw ex;
                }
                case 13: {
                    args[2] = "getUnsubstitutedMemberScope";
                    continue;
                }
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12: {
                    args[2] = "<init>";
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
            O(22);
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
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h M(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        if (g == null) {
            O(13);
        }
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h q = this.Q;
        if (q == null) {
            O(14);
        }
        return q;
    }
    
    @Override
    public boolean Q() {
        return false;
    }
    
    @f
    @Override
    public d U() {
        return null;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h V() {
        final h$c b = h$c.b;
        if (b == null) {
            O(15);
        }
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)b;
    }
    
    @f
    @Override
    public e X() {
        return null;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g s = this.S;
        if (s == null) {
            O(21);
        }
        return s;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public u getVisibility() {
        final u e = kotlin.reflect.jvm.internal.impl.descriptors.t.e;
        if (e == null) {
            O(20);
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
        final List<d> emptyList = Collections.emptyList();
        if (emptyList == null) {
            O(16);
        }
        return emptyList;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public w0 l() {
        final w0 p = this.P;
        if (p == null) {
            O(17);
        }
        return p;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.f n() {
        final kotlin.reflect.jvm.internal.impl.descriptors.f j = kotlin.reflect.jvm.internal.impl.descriptors.f.J;
        if (j == null) {
            O(18);
        }
        return j;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public b0 o() {
        final b0 h = b0.H;
        if (h == null) {
            O(19);
        }
        return h;
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
            O(23);
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
        sb.append("enum entry ");
        sb.append(this.getName());
        return sb.toString();
    }
    
    @Override
    public boolean u() {
        return false;
    }
    
    private class a extends kotlin.reflect.jvm.internal.impl.resolve.scopes.i
    {
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>> b;
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends q0>> c;
        private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<m>> d;
        
        public a(final kotlin.reflect.jvm.internal.impl.storage.n n) {
            if (n == null) {
                i(0);
            }
            this.b = (kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>>)n.b((l)new l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>>() {
                public Collection<? extends v0> a(final kotlin.reflect.jvm.internal.impl.name.e e) {
                    return a.this.n(e);
                }
            });
            this.c = (kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends q0>>)n.b((l)new l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends q0>>() {
                public Collection<? extends q0> a(final kotlin.reflect.jvm.internal.impl.name.e e) {
                    return a.this.o(e);
                }
            });
            this.d = (kotlin.reflect.jvm.internal.impl.storage.i<Collection<m>>)n.g((n6.a)new n6.a<Collection<m>>() {
                public Collection<m> a() {
                    return n.a.this.m();
                }
            });
        }
        
        private static /* synthetic */ void i(final int n) {
            String format = null;
            Label_0069: {
                if (n != 3 && n != 7 && n != 9 && n != 12) {
                    switch (n) {
                        default: {
                            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break Label_0069;
                        }
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19: {
                            break;
                        }
                    }
                }
                format = "@NotNull method %s.%s must not return null";
            }
            int n2 = 0;
            Label_0135: {
                if (n != 3 && n != 7 && n != 9 && n != 12) {
                    switch (n) {
                        default: {
                            n2 = 3;
                            break Label_0135;
                        }
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19: {
                            break;
                        }
                    }
                }
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            switch (n) {
                default: {
                    args[0] = "storageManager";
                    break;
                }
                case 20: {
                    args[0] = "p";
                    break;
                }
                case 14: {
                    args[0] = "nameFilter";
                    break;
                }
                case 13: {
                    args[0] = "kindFilter";
                    break;
                }
                case 11: {
                    args[0] = "fromSupertypes";
                    break;
                }
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19: {
                    args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                }
                case 2:
                case 6: {
                    args[0] = "location";
                    break;
                }
                case 1:
                case 4:
                case 5:
                case 8:
                case 10: {
                    args[0] = "name";
                    break;
                }
            }
            if (n != 3) {
                if (n != 7) {
                    if (n != 9) {
                        if (n != 12) {
                            switch (n) {
                                default: {
                                    args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                    break;
                                }
                                case 19: {
                                    args[1] = "getVariableNames";
                                    break;
                                }
                                case 18: {
                                    args[1] = "getClassifierNames";
                                    break;
                                }
                                case 17: {
                                    args[1] = "getFunctionNames";
                                    break;
                                }
                                case 16: {
                                    args[1] = "computeAllDeclarations";
                                    break;
                                }
                                case 15: {
                                    args[1] = "getContributedDescriptors";
                                    break;
                                }
                            }
                        }
                        else {
                            args[1] = "resolveFakeOverrides";
                        }
                    }
                    else {
                        args[1] = "getSupertypeScope";
                    }
                }
                else {
                    args[1] = "getContributedFunctions";
                }
            }
            else {
                args[1] = "getContributedVariables";
            }
            while (true) {
                switch (n) {
                    default: {
                        args[2] = "<init>";
                    }
                    case 3:
                    case 7:
                    case 9:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19: {
                        final String format2 = String.format(format, args);
                        if (n != 3 && n != 7 && n != 9 && n != 12) {
                            switch (n) {
                                default: {
                                    throw new IllegalArgumentException(format2);
                                }
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19: {
                                    break;
                                }
                            }
                        }
                        throw new IllegalStateException(format2);
                    }
                    case 20: {
                        args[2] = "printScopeStructure";
                        continue;
                    }
                    case 13:
                    case 14: {
                        args[2] = "getContributedDescriptors";
                        continue;
                    }
                    case 10:
                    case 11: {
                        args[2] = "resolveFakeOverrides";
                        continue;
                    }
                    case 8: {
                        args[2] = "computeFunctions";
                        continue;
                    }
                    case 5:
                    case 6: {
                        args[2] = "getContributedFunctions";
                        continue;
                    }
                    case 4: {
                        args[2] = "computeProperties";
                        continue;
                    }
                    case 1:
                    case 2: {
                        args[2] = "getContributedVariables";
                        continue;
                    }
                }
                break;
            }
        }
        
        @org.jetbrains.annotations.e
        private Collection<m> m() {
            final HashSet<Object> set = (HashSet<Object>)new HashSet<m>();
            for (final kotlin.reflect.jvm.internal.impl.name.e e : ((n6.a<Set<kotlin.reflect.jvm.internal.impl.name.e>>)n.this.R).invoke()) {
                final kotlin.reflect.jvm.internal.impl.incremental.components.d v = kotlin.reflect.jvm.internal.impl.incremental.components.d.V;
                set.addAll(this.a(e, (b)v));
                set.addAll(this.c(e, (b)v));
            }
            return (Collection<m>)set;
        }
        
        @org.jetbrains.annotations.e
        private Collection<? extends v0> n(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
            if (e == null) {
                i(8);
            }
            return (Collection<? extends v0>)this.q(e, (Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)this.p().a(e, (b)kotlin.reflect.jvm.internal.impl.incremental.components.d.V));
        }
        
        @org.jetbrains.annotations.e
        private Collection<? extends q0> o(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
            if (e == null) {
                i(4);
            }
            return (Collection<? extends q0>)this.q(e, (Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>)this.p().c(e, (b)kotlin.reflect.jvm.internal.impl.incremental.components.d.V));
        }
        
        @org.jetbrains.annotations.e
        private kotlin.reflect.jvm.internal.impl.resolve.scopes.h p() {
            final kotlin.reflect.jvm.internal.impl.resolve.scopes.h x = n.this.l().k().iterator().next().x();
            if (x == null) {
                i(9);
            }
            return x;
        }
        
        @org.jetbrains.annotations.e
        private <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<? extends D> q(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final Collection<? extends D> collection) {
            if (e == null) {
                i(10);
            }
            if (collection == null) {
                i(11);
            }
            final LinkedHashSet<D> set = new LinkedHashSet<D>();
            kotlin.reflect.jvm.internal.impl.resolve.j.d.y(e, (Collection)collection, (Collection)Collections.emptySet(), (e)n.this, (kotlin.reflect.jvm.internal.impl.resolve.i)new kotlin.reflect.jvm.internal.impl.resolve.h() {
                private static /* synthetic */ void f(final int n) {
                    final Object[] args = new Object[3];
                    if (n != 1) {
                        if (n != 2) {
                            args[0] = "fakeOverride";
                        }
                        else {
                            args[0] = "fromCurrent";
                        }
                    }
                    else {
                        args[0] = "fromSuper";
                    }
                    args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                    if (n != 1 && n != 2) {
                        args[2] = "addFakeOverride";
                    }
                    else {
                        args[2] = "conflict";
                    }
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
                }
                
                public void a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
                    if (b == null) {
                        f(0);
                    }
                    kotlin.reflect.jvm.internal.impl.resolve.j.N(b, (l)null);
                    set.add(b);
                }
                
                protected void e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b b, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b b2) {
                    if (b == null) {
                        f(1);
                    }
                    if (b2 == null) {
                        f(2);
                    }
                }
            });
            return (Collection<? extends D>)set;
        }
        
        @org.jetbrains.annotations.e
        public Collection<? extends v0> a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final b b) {
            if (e == null) {
                i(5);
            }
            if (b == null) {
                i(6);
            }
            final Collection<? extends v0> collection = ((l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends v0>>)this.b).invoke(e);
            if (collection == null) {
                i(7);
            }
            return collection;
        }
        
        @org.jetbrains.annotations.e
        public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
            final Set<kotlin.reflect.jvm.internal.impl.name.e> set = ((n6.a<Set<kotlin.reflect.jvm.internal.impl.name.e>>)n.this.R).invoke();
            if (set == null) {
                i(17);
            }
            return set;
        }
        
        @org.jetbrains.annotations.e
        public Collection<? extends q0> c(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final b b) {
            if (e == null) {
                i(1);
            }
            if (b == null) {
                i(2);
            }
            final Collection<? extends q0> collection = ((l<kotlin.reflect.jvm.internal.impl.name.e, Collection<? extends q0>>)this.c).invoke(e);
            if (collection == null) {
                i(3);
            }
            return collection;
        }
        
        @org.jetbrains.annotations.e
        public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
            final Set<kotlin.reflect.jvm.internal.impl.name.e> set = ((n6.a<Set<kotlin.reflect.jvm.internal.impl.name.e>>)n.this.R).invoke();
            if (set == null) {
                i(19);
            }
            return set;
        }
        
        @org.jetbrains.annotations.e
        public Collection<m> e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @org.jetbrains.annotations.e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
            if (d == null) {
                i(13);
            }
            if (l == null) {
                i(14);
            }
            final Collection<m> collection = ((n6.a<Collection<m>>)this.d).invoke();
            if (collection == null) {
                i(15);
            }
            return collection;
        }
        
        @org.jetbrains.annotations.e
        public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
            final Set<kotlin.reflect.jvm.internal.impl.name.e> emptySet = Collections.emptySet();
            if (emptySet == null) {
                i(18);
            }
            return emptySet;
        }
    }
}
