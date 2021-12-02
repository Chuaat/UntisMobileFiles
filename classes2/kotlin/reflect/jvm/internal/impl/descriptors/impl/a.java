// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.types.b1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.f;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import n6.l;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.name.e;

public abstract class a extends t
{
    private final kotlin.reflect.jvm.internal.impl.name.e H;
    protected final kotlin.reflect.jvm.internal.impl.storage.i<k0> I;
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> J;
    private final kotlin.reflect.jvm.internal.impl.storage.i<t0> K;
    
    public a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n n, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e h) {
        if (n == null) {
            O(0);
        }
        if (h == null) {
            O(1);
        }
        this.H = h;
        this.I = (kotlin.reflect.jvm.internal.impl.storage.i<k0>)n.g((n6.a)new n6.a<k0>() {
            public k0 a() {
                final a g = a.this;
                return f1.t((h)g, g.E0(), (l)new l<kotlin.reflect.jvm.internal.impl.types.checker.g, k0>() {
                    public k0 a(final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
                        final h e = g.e((m)a.this);
                        if (e == null) {
                            return ((a<k0>)a.this.I).invoke();
                        }
                        if (e instanceof a1) {
                            return d0.b((a1)e, f1.g(e.l().getParameters()));
                        }
                        if (e instanceof t) {
                            return f1.u(e.l().b(g), ((t)e).M(g), (l)this);
                        }
                        return e.A();
                    }
                });
            }
        });
        this.J = (kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.scopes.h>)n.g((n6.a)new n6.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h>() {
            public kotlin.reflect.jvm.internal.impl.resolve.scopes.h a() {
                return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)new f(a.this.E0());
            }
        });
        this.K = (kotlin.reflect.jvm.internal.impl.storage.i<t0>)n.g((n6.a)new n6.a<t0>() {
            public t0 a() {
                return new kotlin.reflect.jvm.internal.impl.descriptors.impl.q(a.this);
            }
        });
    }
    
    private static /* synthetic */ void O(final int n) {
        String format;
        if (n != 2 && n != 3 && n != 4 && n != 5 && n != 8 && n != 11 && n != 13 && n != 15 && n != 16 && n != 18 && n != 19) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 2 && n != 3 && n != 4 && n != 5 && n != 8 && n != 11 && n != 13 && n != 15 && n != 16 && n != 18 && n != 19) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "storageManager";
                break;
            }
            case 17: {
                args[0] = "substitutor";
                break;
            }
            case 9:
            case 14: {
                args[0] = "typeSubstitution";
                break;
            }
            case 7:
            case 10: {
                args[0] = "kotlinTypeRefiner";
                break;
            }
            case 6:
            case 12: {
                args[0] = "typeArguments";
                break;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            }
            case 1: {
                args[0] = "name";
                break;
            }
        }
        if (n != 2) {
            if (n != 3) {
                if (n != 4) {
                    if (n != 5) {
                        if (n != 8 && n != 11 && n != 13 && n != 15) {
                            if (n != 16) {
                                if (n != 18) {
                                    if (n != 19) {
                                        args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                                    }
                                    else {
                                        args[1] = "getDefaultType";
                                    }
                                }
                                else {
                                    args[1] = "substitute";
                                }
                            }
                            else {
                                args[1] = "getUnsubstitutedMemberScope";
                            }
                        }
                        else {
                            args[1] = "getMemberScope";
                        }
                    }
                    else {
                        args[1] = "getThisAsReceiverParameter";
                    }
                }
                else {
                    args[1] = "getUnsubstitutedInnerClassesScope";
                }
            }
            else {
                args[1] = "getOriginal";
            }
        }
        else {
            args[1] = "getName";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 19: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 2 && n != 3 && n != 4 && n != 5 && n != 8 && n != 11 && n != 13 && n != 15 && n != 16 && n != 18 && n != 19) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 17: {
                    args[2] = "substitute";
                    continue;
                }
                case 6:
                case 7:
                case 9:
                case 10:
                case 12:
                case 14: {
                    args[2] = "getMemberScope";
                    continue;
                }
            }
            break;
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public k0 A() {
        final k0 k0 = ((n6.a<k0>)this.I).invoke();
        if (k0 == null) {
            O(19);
        }
        return k0;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h B0() {
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h h = ((n6.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h>)this.J).invoke();
        if (h == null) {
            O(4);
        }
        return h;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h E0() {
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h m = this.M(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.k(d.g((m)this)));
        if (m == null) {
            O(16);
        }
        return m;
    }
    
    @org.jetbrains.annotations.e
    public e G0(@org.jetbrains.annotations.e final d1 d1) {
        if (d1 == null) {
            O(17);
        }
        if (d1.k()) {
            return this;
        }
        return new s(this, d1);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public t0 K0() {
        final t0 t0 = ((n6.a<t0>)this.K).invoke();
        if (t0 == null) {
            O(5);
        }
        return t0;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h L(@org.jetbrains.annotations.e final b1 b1, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        if (b1 == null) {
            O(9);
        }
        if (g == null) {
            O(10);
        }
        if (b1.f()) {
            final kotlin.reflect.jvm.internal.impl.resolve.scopes.h m = this.M(g);
            if (m == null) {
                O(11);
            }
            return m;
        }
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)new kotlin.reflect.jvm.internal.impl.resolve.scopes.m(this.M(g), d1.g(b1));
    }
    
    @Override
    public <R, D> R P(final o<R, D> o, final D n) {
        return o.a(this, n);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e b() {
        return this;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h e0(@org.jetbrains.annotations.e final b1 b1) {
        if (b1 == null) {
            O(14);
        }
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h l = this.L(b1, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.k(d.g((m)this)));
        if (l == null) {
            O(15);
        }
        return l;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.name.e getName() {
        final kotlin.reflect.jvm.internal.impl.name.e h = this.H;
        if (h == null) {
            O(2);
        }
        return h;
    }
}
