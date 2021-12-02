// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.types.error.a;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import java.util.Collections;
import java.util.Collection;
import n6.l;
import kotlin.collections.v;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public class u
{
    private static final e0 a;
    private static final c b;
    public static final k0 c;
    private static final c0 d;
    private static final q0 e;
    private static final Set<q0> f;
    
    static {
        a = (e0)new e0() {
            private static /* synthetic */ void L(final int n) {
                String format = null;
                Label_0069: {
                    if (n != 1 && n != 4 && n != 5 && n != 6 && n != 13 && n != 14) {
                        switch (n) {
                            default: {
                                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                break Label_0069;
                            }
                            case 8:
                            case 9:
                            case 10: {
                                break;
                            }
                        }
                    }
                    format = "@NotNull method %s.%s must not return null";
                }
                int n2 = 0;
                Label_0135: {
                    if (n != 1 && n != 4 && n != 5 && n != 6 && n != 13 && n != 14) {
                        switch (n) {
                            default: {
                                n2 = 3;
                                break Label_0135;
                            }
                            case 8:
                            case 9:
                            case 10: {
                                break;
                            }
                        }
                    }
                    n2 = 2;
                }
                final Object[] args = new Object[n2];
                switch (n) {
                    default: {
                        args[0] = "capability";
                        break;
                    }
                    case 12: {
                        args[0] = "targetModule";
                        break;
                    }
                    case 11: {
                        args[0] = "visitor";
                        break;
                    }
                    case 3: {
                        args[0] = "nameFilter";
                        break;
                    }
                    case 2:
                    case 7: {
                        args[0] = "fqName";
                        break;
                    }
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 13:
                    case 14: {
                        args[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                        break;
                    }
                }
                if (n != 1) {
                    if (n != 4) {
                        if (n != 5) {
                            if (n != 6) {
                                if (n != 13) {
                                    if (n != 14) {
                                        switch (n) {
                                            default: {
                                                args[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                                                break;
                                            }
                                            case 10: {
                                                args[1] = "getAllExpectedByModules";
                                                break;
                                            }
                                            case 9: {
                                                args[1] = "getExpectedByModules";
                                                break;
                                            }
                                            case 8: {
                                                args[1] = "getAllDependencyModules";
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        args[1] = "getBuiltIns";
                                    }
                                }
                                else {
                                    args[1] = "getOriginal";
                                }
                            }
                            else {
                                args[1] = "getStableName";
                            }
                        }
                        else {
                            args[1] = "getName";
                        }
                    }
                    else {
                        args[1] = "getSubPackagesOf";
                    }
                }
                else {
                    args[1] = "getAnnotations";
                }
                while (true) {
                    switch (n) {
                        default: {
                            args[2] = "getCapability";
                        }
                        case 1:
                        case 4:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 13:
                        case 14: {
                            final String format2 = String.format(format, args);
                            if (n != 1 && n != 4 && n != 5 && n != 6 && n != 13 && n != 14) {
                                switch (n) {
                                    default: {
                                        throw new IllegalArgumentException(format2);
                                    }
                                    case 8:
                                    case 9:
                                    case 10: {
                                        break;
                                    }
                                }
                            }
                            throw new IllegalStateException(format2);
                        }
                        case 12: {
                            args[2] = "shouldSeeInternalsOf";
                            continue;
                        }
                        case 11: {
                            args[2] = "accept";
                            continue;
                        }
                        case 7: {
                            args[2] = "getPackage";
                            continue;
                        }
                        case 2:
                        case 3: {
                            args[2] = "getSubPackagesOf";
                            continue;
                        }
                    }
                    break;
                }
            }
            
            @org.jetbrains.annotations.f
            public <T> T I0(@org.jetbrains.annotations.e final d0<T> d0) {
                if (d0 == null) {
                    L(0);
                }
                return null;
            }
            
            public <R, D> R P(@org.jetbrains.annotations.e final o<R, D> o, final D n) {
                if (o == null) {
                    L(11);
                }
                return null;
            }
            
            @org.jetbrains.annotations.e
            public m0 R(@org.jetbrains.annotations.e final b b) {
                if (b == null) {
                    L(7);
                }
                throw new IllegalStateException("Should not be called!");
            }
            
            @org.jetbrains.annotations.e
            public m b() {
                return (m)this;
            }
            
            @org.jetbrains.annotations.f
            public m c() {
                return null;
            }
            
            @org.jetbrains.annotations.e
            public g getAnnotations() {
                final g b = g.r.b();
                if (b == null) {
                    L(1);
                }
                return b;
            }
            
            @org.jetbrains.annotations.e
            public kotlin.reflect.jvm.internal.impl.name.e getName() {
                final kotlin.reflect.jvm.internal.impl.name.e l = kotlin.reflect.jvm.internal.impl.name.e.l("<ERROR MODULE>");
                if (l == null) {
                    L(5);
                }
                return l;
            }
            
            public boolean i0(@org.jetbrains.annotations.e final e0 e0) {
                if (e0 == null) {
                    L(12);
                }
                return false;
            }
            
            @org.jetbrains.annotations.e
            public KotlinBuiltIns w() {
                final DefaultBuiltIns instance = DefaultBuiltIns.getInstance();
                if (instance == null) {
                    L(14);
                }
                return (KotlinBuiltIns)instance;
            }
            
            @org.jetbrains.annotations.e
            public List<e0> w0() {
                final List e = v.E();
                if (e == null) {
                    L(9);
                }
                return (List<e0>)e;
            }
            
            @org.jetbrains.annotations.e
            public Collection<b> z(@org.jetbrains.annotations.e final b b, @org.jetbrains.annotations.e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
                if (b == null) {
                    L(2);
                }
                if (l == null) {
                    L(3);
                }
                final List e = v.E();
                if (e == null) {
                    L(4);
                }
                return (Collection<b>)e;
            }
        };
        b = new c(kotlin.reflect.jvm.internal.impl.name.e.l("<ERROR CLASS>"));
        c = j("<LOOP IN SUPERTYPES>");
        d = j("<ERROR PROPERTY TYPE>");
        f = Collections.singleton(e = (q0)g());
    }
    
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 4 && n != 6 && n != 19) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 4 && n != 6 && n != 19) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "function";
                break;
            }
            case 20: {
                args[0] = "typeParameterDescriptor";
                break;
            }
            case 18: {
                args[0] = "errorClass";
                break;
            }
            case 13: {
                args[0] = "presentableName";
                break;
            }
            case 12:
            case 14: {
                args[0] = "arguments";
                break;
            }
            case 10: {
                args[0] = "typeConstructor";
                break;
            }
            case 8:
            case 9:
            case 16:
            case 17: {
                args[0] = "debugName";
                break;
            }
            case 5: {
                args[0] = "ownerScope";
                break;
            }
            case 4:
            case 6:
            case 19: {
                args[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
                break;
            }
            case 1:
            case 2:
            case 3:
            case 7:
            case 11:
            case 15: {
                args[0] = "debugMessage";
                break;
            }
        }
        if (n != 4) {
            if (n != 6) {
                if (n != 19) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
                }
                else {
                    args[1] = "getErrorModule";
                }
            }
            else {
                args[1] = "createErrorFunction";
            }
        }
        else {
            args[1] = "createErrorProperty";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "containsErrorTypeInParameters";
                }
                case 4:
                case 6:
                case 19: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 4 && n != 6 && n != 19) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 20: {
                    args[2] = "createUninferredParameterType";
                    continue;
                }
                case 16:
                case 17:
                case 18: {
                    args[2] = "createErrorTypeConstructorWithCustomDebugName";
                    continue;
                }
                case 15: {
                    args[2] = "createErrorTypeConstructor";
                    continue;
                }
                case 13:
                case 14: {
                    args[2] = "createUnresolvedType";
                    continue;
                }
                case 11:
                case 12: {
                    args[2] = "createErrorTypeWithArguments";
                    continue;
                }
                case 9:
                case 10: {
                    args[2] = "createErrorTypeWithCustomConstructor";
                    continue;
                }
                case 8: {
                    args[2] = "createErrorTypeWithCustomDebugName";
                    continue;
                }
                case 7: {
                    args[2] = "createErrorType";
                    continue;
                }
                case 5: {
                    args[2] = "createErrorFunction";
                    continue;
                }
                case 2:
                case 3: {
                    args[2] = "createErrorScope";
                    continue;
                }
                case 1: {
                    args[2] = "createErrorClass";
                    continue;
                }
            }
            break;
        }
    }
    
    @org.jetbrains.annotations.e
    public static kotlin.reflect.jvm.internal.impl.descriptors.e e(@org.jetbrains.annotations.e final String str) {
        if (str == null) {
            a(1);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("<ERROR CLASS: ");
        sb.append(str);
        sb.append(">");
        return (kotlin.reflect.jvm.internal.impl.descriptors.e)new c(kotlin.reflect.jvm.internal.impl.name.e.l(sb.toString()));
    }
    
    @org.jetbrains.annotations.e
    private static v0 f(@org.jetbrains.annotations.e final d d) {
        if (d == null) {
            a(5);
        }
        final a a = new a((kotlin.reflect.jvm.internal.impl.descriptors.e)u.b, d);
        a.o1((t0)null, (t0)null, (List)Collections.emptyList(), (List)Collections.emptyList(), (c0)j("<ERROR FUNCTION RETURN TYPE>"), b0.J, t.e);
        return (v0)a;
    }
    
    @org.jetbrains.annotations.e
    private static kotlin.reflect.jvm.internal.impl.descriptors.impl.b0 g() {
        final kotlin.reflect.jvm.internal.impl.descriptors.impl.b0 p0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.b0.P0((m)u.b, g.r.b(), b0.J, t.e, true, kotlin.reflect.jvm.internal.impl.name.e.l("<ERROR PROPERTY>"), b$a.G, kotlin.reflect.jvm.internal.impl.descriptors.w0.a, false, false, false, false, false, false);
        p0.b1(u.d, (List)Collections.emptyList(), (t0)null, (t0)null);
        return p0;
    }
    
    @org.jetbrains.annotations.e
    public static h h(@org.jetbrains.annotations.e final String s) {
        if (s == null) {
            a(2);
        }
        return i(s, false);
    }
    
    @org.jetbrains.annotations.e
    public static h i(@org.jetbrains.annotations.e final String s, final boolean b) {
        if (s == null) {
            a(3);
        }
        if (b) {
            return new e(s);
        }
        return new d(s);
    }
    
    @org.jetbrains.annotations.e
    public static k0 j(@org.jetbrains.annotations.e final String s) {
        if (s == null) {
            a(7);
        }
        return n(s, Collections.emptyList());
    }
    
    @org.jetbrains.annotations.e
    public static w0 k(@org.jetbrains.annotations.e final String str) {
        if (str == null) {
            a(15);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("[ERROR : ");
        sb.append(str);
        sb.append("]");
        return m(sb.toString(), u.b);
    }
    
    @org.jetbrains.annotations.e
    public static w0 l(@org.jetbrains.annotations.e final String s) {
        if (s == null) {
            a(16);
        }
        return m(s, u.b);
    }
    
    @org.jetbrains.annotations.e
    private static w0 m(@org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final c c) {
        if (s == null) {
            a(17);
        }
        if (c == null) {
            a(18);
        }
        return new w0() {
            private static /* synthetic */ void e(final int n) {
                String format;
                if (n != 3) {
                    format = "@NotNull method %s.%s must not return null";
                }
                else {
                    format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                }
                int n2;
                if (n != 3) {
                    n2 = 2;
                }
                else {
                    n2 = 3;
                }
                final Object[] args = new Object[n2];
                if (n != 3) {
                    args[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
                }
                else {
                    args[0] = "kotlinTypeRefiner";
                }
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                args[1] = "getParameters";
                            }
                            else {
                                args[1] = "refine";
                            }
                        }
                        else {
                            args[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
                        }
                    }
                    else {
                        args[1] = "getBuiltIns";
                    }
                }
                else {
                    args[1] = "getSupertypes";
                }
                if (n == 3) {
                    args[2] = "refine";
                }
                final String format2 = String.format(format, args);
                RuntimeException ex;
                if (n != 3) {
                    ex = new IllegalStateException(format2);
                }
                else {
                    ex = new IllegalArgumentException(format2);
                }
                throw ex;
            }
            
            @org.jetbrains.annotations.e
            @Override
            public w0 b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
                if (g == null) {
                    e(3);
                }
                return this;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
                return (kotlin.reflect.jvm.internal.impl.descriptors.h)c;
            }
            
            @Override
            public boolean d() {
                return false;
            }
            
            @org.jetbrains.annotations.e
            @Override
            public List<b1> getParameters() {
                final List e = v.E();
                if (e == null) {
                    e(0);
                }
                return (List<b1>)e;
            }
            
            @org.jetbrains.annotations.e
            @Override
            public Collection<c0> k() {
                final List e = v.E();
                if (e == null) {
                    e(1);
                }
                return (Collection<c0>)e;
            }
            
            @Override
            public String toString() {
                return s;
            }
            
            @org.jetbrains.annotations.e
            @Override
            public KotlinBuiltIns w() {
                final DefaultBuiltIns instance = DefaultBuiltIns.getInstance();
                if (instance == null) {
                    e(2);
                }
                return (KotlinBuiltIns)instance;
            }
        };
    }
    
    @org.jetbrains.annotations.e
    public static k0 n(@org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final List<y0> list) {
        if (s == null) {
            a(11);
        }
        if (list == null) {
            a(12);
        }
        return new kotlin.reflect.jvm.internal.impl.types.t(k(s), h(s), list, false);
    }
    
    @org.jetbrains.annotations.e
    public static k0 o(@org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final w0 w0) {
        if (s == null) {
            a(9);
        }
        if (w0 == null) {
            a(10);
        }
        return new kotlin.reflect.jvm.internal.impl.types.t(w0, h(s));
    }
    
    @org.jetbrains.annotations.e
    public static k0 p(@org.jetbrains.annotations.e final String s) {
        if (s == null) {
            a(8);
        }
        return o(s, l(s));
    }
    
    @org.jetbrains.annotations.e
    public static e0 q() {
        final e0 a = u.a;
        if (a == null) {
            a(19);
        }
        return a;
    }
    
    public static boolean r(@org.jetbrains.annotations.f final m m) {
        boolean b = false;
        if (m == null) {
            return false;
        }
        if (s(m) || s(m.c()) || m == u.a) {
            b = true;
        }
        return b;
    }
    
    private static boolean s(@org.jetbrains.annotations.f final m m) {
        return m instanceof c;
    }
    
    public static boolean t(@org.jetbrains.annotations.f final c0 c0) {
        return c0 != null && c0.N0() instanceof f;
    }
    
    private static class c extends kotlin.reflect.jvm.internal.impl.descriptors.impl.h
    {
        public c(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
            if (e == null) {
                O(0);
            }
            final e0 q = u.q();
            final b0 j = b0.J;
            final kotlin.reflect.jvm.internal.impl.descriptors.f g = kotlin.reflect.jvm.internal.impl.descriptors.f.G;
            final List<Object> emptyList = Collections.emptyList();
            final kotlin.reflect.jvm.internal.impl.descriptors.w0 a = kotlin.reflect.jvm.internal.impl.descriptors.w0.a;
            super((m)q, e, j, g, (Collection)emptyList, a, false, kotlin.reflect.jvm.internal.impl.storage.f.e);
            final kotlin.reflect.jvm.internal.impl.descriptors.impl.f n1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.f.n1((kotlin.reflect.jvm.internal.impl.descriptors.e)this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), true, a);
            n1.q1((List)Collections.emptyList(), t.d);
            final h h = u.h(((kotlin.reflect.jvm.internal.impl.descriptors.impl.a)this).getName().d());
            ((p)n1).h1((c0)new kotlin.reflect.jvm.internal.impl.types.t(m("<ERROR>", this), h));
            this.L0(h, (Set)Collections.singleton(n1), (kotlin.reflect.jvm.internal.impl.descriptors.d)n1);
        }
        
        private static /* synthetic */ void O(final int n) {
            String format;
            if (n != 2 && n != 5 && n != 8) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 2 && n != 5 && n != 8) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            switch (n) {
                default: {
                    args[0] = "name";
                    break;
                }
                case 6: {
                    args[0] = "typeSubstitution";
                    break;
                }
                case 4:
                case 7: {
                    args[0] = "kotlinTypeRefiner";
                    break;
                }
                case 3: {
                    args[0] = "typeArguments";
                    break;
                }
                case 2:
                case 5:
                case 8: {
                    args[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
                    break;
                }
                case 1: {
                    args[0] = "substitutor";
                    break;
                }
            }
            if (n != 2) {
                if (n != 5 && n != 8) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
                }
                else {
                    args[1] = "getMemberScope";
                }
            }
            else {
                args[1] = "substitute";
            }
            while (true) {
                switch (n) {
                    default: {
                        args[2] = "<init>";
                    }
                    case 2:
                    case 5:
                    case 8: {
                        final String format2 = String.format(format, args);
                        RuntimeException ex;
                        if (n != 2 && n != 5 && n != 8) {
                            ex = new IllegalArgumentException(format2);
                        }
                        else {
                            ex = new IllegalStateException(format2);
                        }
                        throw ex;
                    }
                    case 3:
                    case 4:
                    case 6:
                    case 7: {
                        args[2] = "getMemberScope";
                        continue;
                    }
                    case 1: {
                        args[2] = "substitute";
                        continue;
                    }
                }
                break;
            }
        }
        
        @org.jetbrains.annotations.e
        public kotlin.reflect.jvm.internal.impl.descriptors.e G0(@org.jetbrains.annotations.e final d1 d1) {
            if (d1 == null) {
                O(1);
            }
            return (kotlin.reflect.jvm.internal.impl.descriptors.e)this;
        }
        
        @org.jetbrains.annotations.e
        public h L(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.b1 obj, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
            if (obj == null) {
                O(6);
            }
            if (g == null) {
                O(7);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Error scope for class ");
            sb.append(((kotlin.reflect.jvm.internal.impl.descriptors.impl.a)this).getName());
            sb.append(" with arguments: ");
            sb.append(obj);
            final h h = u.h(sb.toString());
            if (h == null) {
                O(8);
            }
            return h;
        }
        
        public String toString() {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.impl.a)this).getName().d();
        }
    }
    
    public static class d implements h
    {
        private final String b;
        
        private d(@org.jetbrains.annotations.e final String b) {
            if (b == null) {
                i(0);
            }
            this.b = b;
        }
        
        private static /* synthetic */ void i(final int n) {
            String format = null;
            Label_0053: {
                if (n != 7 && n != 18) {
                    switch (n) {
                        default: {
                            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break Label_0053;
                        }
                        case 10:
                        case 11:
                        case 12:
                        case 13: {
                            break;
                        }
                    }
                }
                format = "@NotNull method %s.%s must not return null";
            }
            int n2 = 0;
            Label_0103: {
                if (n != 7 && n != 18) {
                    switch (n) {
                        default: {
                            n2 = 3;
                            break Label_0103;
                        }
                        case 10:
                        case 11:
                        case 12:
                        case 13: {
                            break;
                        }
                    }
                }
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            switch (n) {
                default: {
                    args[0] = "debugMessage";
                    break;
                }
                case 20: {
                    args[0] = "p";
                    break;
                }
                case 17: {
                    args[0] = "nameFilter";
                    break;
                }
                case 16: {
                    args[0] = "kindFilter";
                    break;
                }
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18: {
                    args[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                    break;
                }
                case 2:
                case 4:
                case 6:
                case 9:
                case 15: {
                    args[0] = "location";
                    break;
                }
                case 1:
                case 3:
                case 5:
                case 8:
                case 14:
                case 19: {
                    args[0] = "name";
                    break;
                }
            }
            if (n != 7) {
                if (n != 18) {
                    switch (n) {
                        default: {
                            args[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                            break;
                        }
                        case 13: {
                            args[1] = "getClassifierNames";
                            break;
                        }
                        case 12: {
                            args[1] = "getVariableNames";
                            break;
                        }
                        case 11: {
                            args[1] = "getFunctionNames";
                            break;
                        }
                        case 10: {
                            args[1] = "getContributedFunctions";
                            break;
                        }
                    }
                }
                else {
                    args[1] = "getContributedDescriptors";
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
                    case 7:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 18: {
                        final String format2 = String.format(format, args);
                        if (n != 7 && n != 18) {
                            switch (n) {
                                default: {
                                    throw new IllegalArgumentException(format2);
                                }
                                case 10:
                                case 11:
                                case 12:
                                case 13: {
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
                    case 19: {
                        args[2] = "definitelyDoesNotContainName";
                        continue;
                    }
                    case 16:
                    case 17: {
                        args[2] = "getContributedDescriptors";
                        continue;
                    }
                    case 14:
                    case 15: {
                        args[2] = "recordLookup";
                        continue;
                    }
                    case 8:
                    case 9: {
                        args[2] = "getContributedFunctions";
                        continue;
                    }
                    case 5:
                    case 6: {
                        args[2] = "getContributedVariables";
                        continue;
                    }
                    case 3:
                    case 4: {
                        args[2] = "getContributedClassifierIncludeDeprecated";
                        continue;
                    }
                    case 1:
                    case 2: {
                        args[2] = "getContributedClassifier";
                        continue;
                    }
                }
                break;
            }
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
            final Set<kotlin.reflect.jvm.internal.impl.name.e> emptySet = Collections.emptySet();
            if (emptySet == null) {
                i(11);
            }
            return emptySet;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
            final Set<kotlin.reflect.jvm.internal.impl.name.e> emptySet = Collections.emptySet();
            if (emptySet == null) {
                i(12);
            }
            return emptySet;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Collection<m> e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @org.jetbrains.annotations.e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
            if (d == null) {
                i(16);
            }
            if (l == null) {
                i(17);
            }
            final List<m> emptyList = Collections.emptyList();
            if (emptyList == null) {
                i(18);
            }
            return emptyList;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
            final Set<kotlin.reflect.jvm.internal.impl.name.e> emptySet = Collections.emptySet();
            if (emptySet == null) {
                i(13);
            }
            return emptySet;
        }
        
        @org.jetbrains.annotations.f
        @Override
        public kotlin.reflect.jvm.internal.impl.descriptors.h g(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            if (e == null) {
                i(1);
            }
            if (b == null) {
                i(2);
            }
            return (kotlin.reflect.jvm.internal.impl.descriptors.h)u.e(e.d());
        }
        
        @Override
        public void h(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            if (e == null) {
                i(14);
            }
            if (b == null) {
                i(15);
            }
        }
        
        @org.jetbrains.annotations.e
        public Set<? extends v0> j(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            if (e == null) {
                i(8);
            }
            if (b == null) {
                i(9);
            }
            final Set<v0> singleton = Collections.singleton(f(this));
            if (singleton == null) {
                i(10);
            }
            return singleton;
        }
        
        @org.jetbrains.annotations.e
        public Set<? extends q0> k(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            if (e == null) {
                i(5);
            }
            if (b == null) {
                i(6);
            }
            final Set b2 = u.f;
            if (b2 == null) {
                i(7);
            }
            return (Set<? extends q0>)b2;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ErrorScope{");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }
    
    private static class e implements h
    {
        private final String b;
        
        private e(@org.jetbrains.annotations.e final String b) {
            if (b == null) {
                i(0);
            }
            this.b = b;
        }
        
        private static /* synthetic */ void i(final int n) {
            final Object[] args = new Object[3];
            switch (n) {
                default: {
                    args[0] = "message";
                    break;
                }
                case 14: {
                    args[0] = "p";
                    break;
                }
                case 10: {
                    args[0] = "nameFilter";
                    break;
                }
                case 9: {
                    args[0] = "kindFilter";
                    break;
                }
                case 2:
                case 4:
                case 6:
                case 8:
                case 12: {
                    args[0] = "location";
                    break;
                }
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13: {
                    args[0] = "name";
                    break;
                }
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (n) {
                default: {
                    args[2] = "<init>";
                    break;
                }
                case 14: {
                    args[2] = "printScopeStructure";
                    break;
                }
                case 13: {
                    args[2] = "definitelyDoesNotContainName";
                    break;
                }
                case 11:
                case 12: {
                    args[2] = "recordLookup";
                    break;
                }
                case 9:
                case 10: {
                    args[2] = "getContributedDescriptors";
                    break;
                }
                case 7:
                case 8: {
                    args[2] = "getContributedFunctions";
                    break;
                }
                case 5:
                case 6: {
                    args[2] = "getContributedVariables";
                    break;
                }
                case 3:
                case 4: {
                    args[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                }
                case 1:
                case 2: {
                    args[2] = "getContributedClassifier";
                    break;
                }
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Collection<? extends v0> a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e obj, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            if (obj == null) {
                i(7);
            }
            if (b == null) {
                i(8);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append(", required name: ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString());
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
            throw new IllegalStateException();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Collection<? extends q0> c(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e obj, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            if (obj == null) {
                i(5);
            }
            if (b == null) {
                i(6);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append(", required name: ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString());
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
            throw new IllegalStateException();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Collection<m> e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @org.jetbrains.annotations.e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
            if (d == null) {
                i(9);
            }
            if (l == null) {
                i(10);
            }
            throw new IllegalStateException(this.b);
        }
        
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
            throw new IllegalStateException();
        }
        
        @org.jetbrains.annotations.f
        @Override
        public kotlin.reflect.jvm.internal.impl.descriptors.h g(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e obj, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            if (obj == null) {
                i(1);
            }
            if (b == null) {
                i(2);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append(", required name: ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString());
        }
        
        @Override
        public void h(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            if (e == null) {
                i(11);
            }
            if (b == null) {
                i(12);
            }
            throw new IllegalStateException();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ThrowingScope{");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }
    
    public static class f implements w0
    {
        private final b1 a;
        private final w0 b;
        
        private static /* synthetic */ void e(final int n) {
            String format;
            if (n != 1 && n != 2 && n != 3 && n != 4 && n != 6) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 1 && n != 2 && n != 3 && n != 4 && n != 6) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            switch (n) {
                default: {
                    args[0] = "descriptor";
                    break;
                }
                case 5: {
                    args[0] = "kotlinTypeRefiner";
                    break;
                }
                case 1:
                case 2:
                case 3:
                case 4:
                case 6: {
                    args[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
                    break;
                }
            }
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 6) {
                                args[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
                            }
                            else {
                                args[1] = "refine";
                            }
                        }
                        else {
                            args[1] = "getBuiltIns";
                        }
                    }
                    else {
                        args[1] = "getSupertypes";
                    }
                }
                else {
                    args[1] = "getParameters";
                }
            }
            else {
                args[1] = "getTypeParameterDescriptor";
            }
            switch (n) {
                case 5: {
                    args[2] = "refine";
                }
                default: {
                    args[2] = "<init>";
                }
                case 1:
                case 2:
                case 3:
                case 4:
                case 6: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 1 && n != 2 && n != 3 && n != 4 && n != 6) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
            }
        }
        
        @org.jetbrains.annotations.e
        @Override
        public w0 b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
            if (g == null) {
                e(5);
            }
            return this;
        }
        
        @org.jetbrains.annotations.f
        @Override
        public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
            return this.b.c();
        }
        
        @Override
        public boolean d() {
            return this.b.d();
        }
        
        @org.jetbrains.annotations.e
        public b1 f() {
            final b1 a = this.a;
            if (a == null) {
                e(1);
            }
            return a;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public List<b1> getParameters() {
            final List<b1> parameters = this.b.getParameters();
            if (parameters == null) {
                e(2);
            }
            return parameters;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Collection<c0> k() {
            final Collection<c0> k = this.b.k();
            if (k == null) {
                e(3);
            }
            return k;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public KotlinBuiltIns w() {
            final KotlinBuiltIns g = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)this.a);
            if (g == null) {
                e(4);
            }
            return g;
        }
    }
}
