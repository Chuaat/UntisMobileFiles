// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.resolve.i;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.j2;
import n6.l;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.h;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.resolve.j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.name.e;

public final class a
{
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 18) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 18) {
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
            case 20: {
                args[0] = "annotationClass";
                break;
            }
            case 18: {
                args[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            }
            case 5:
            case 11:
            case 17: {
                args[0] = "overridingUtil";
                break;
            }
            case 4:
            case 10:
            case 16: {
                args[0] = "errorReporter";
                break;
            }
            case 3:
            case 9:
            case 15: {
                args[0] = "classDescriptor";
                break;
            }
            case 2:
            case 8:
            case 14: {
                args[0] = "membersFromCurrent";
                break;
            }
            case 1:
            case 7:
            case 13: {
                args[0] = "membersFromSupertypes";
                break;
            }
        }
        if (n != 18) {
            args[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        }
        else {
            args[1] = "resolveOverrides";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "resolveOverridesForNonStaticMembers";
                }
                case 18: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 18) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 19:
                case 20: {
                    args[2] = "getAnnotationParameterByName";
                    continue;
                }
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17: {
                    args[2] = "resolveOverrides";
                    continue;
                }
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11: {
                    args[2] = "resolveOverridesForStaticMembers";
                    continue;
                }
            }
            break;
        }
    }
    
    @f
    public static e1 b(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e2) {
        if (e == null) {
            a(19);
        }
        if (e2 == null) {
            a(20);
        }
        final Collection j = e2.j();
        if (j.size() != 1) {
            return null;
        }
        for (final e1 e3 : ((kotlin.reflect.jvm.internal.impl.descriptors.a)j.iterator().next()).m()) {
            if (((f0)e3).getName().equals(e)) {
                return e3;
            }
        }
        return null;
    }
    
    @org.jetbrains.annotations.e
    private static <D extends b> Collection<D> c(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final Collection<D> collection, @org.jetbrains.annotations.e final Collection<D> collection2, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e2, @org.jetbrains.annotations.e final p p7, @org.jetbrains.annotations.e final j j, final boolean b) {
        if (e == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (e2 == null) {
            a(15);
        }
        if (p7 == null) {
            a(16);
        }
        if (j == null) {
            a(17);
        }
        final LinkedHashSet<D> set = new LinkedHashSet<D>();
        j.y(e, collection, collection2, e2, new h() {
            private static /* synthetic */ void f(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                args[0] = "fakeOverride";
                            }
                            else {
                                args[0] = "overridden";
                            }
                        }
                        else {
                            args[0] = "member";
                        }
                    }
                    else {
                        args[0] = "fromCurrent";
                    }
                }
                else {
                    args[0] = "fromSuper";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
                if (n != 1 && n != 2) {
                    if (n != 3 && n != 4) {
                        args[2] = "addFakeOverride";
                    }
                    else {
                        args[2] = "setOverriddenDescriptors";
                    }
                }
                else {
                    args[2] = "conflict";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            @Override
            public void a(@org.jetbrains.annotations.e final b b) {
                if (b == null) {
                    f(0);
                }
                j.N(b, (l<b, j2>)new l<b, j2>() {
                    private static /* synthetic */ void a(final int n) {
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
                    }
                    
                    public j2 b(@org.jetbrains.annotations.e final b b) {
                        if (b == null) {
                            a(0);
                        }
                        p7.a(b);
                        return j2.a;
                    }
                });
                set.add(b);
            }
            
            @Override
            public void d(@org.jetbrains.annotations.e final b b, @org.jetbrains.annotations.e final Collection<? extends b> collection) {
                if (b == null) {
                    f(3);
                }
                if (collection == null) {
                    f(4);
                }
                if (b && b.n() != b$a.H) {
                    return;
                }
                super.d(b, collection);
            }
            
            public void e(@org.jetbrains.annotations.e final b b, @org.jetbrains.annotations.e final b b2) {
                if (b == null) {
                    f(1);
                }
                if (b2 == null) {
                    f(2);
                }
            }
        });
        return set;
    }
    
    @org.jetbrains.annotations.e
    public static <D extends b> Collection<D> d(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final Collection<D> collection, @org.jetbrains.annotations.e final Collection<D> collection2, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e2, @org.jetbrains.annotations.e final p p6, @org.jetbrains.annotations.e final j j) {
        if (e == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (e2 == null) {
            a(3);
        }
        if (p6 == null) {
            a(4);
        }
        if (j == null) {
            a(5);
        }
        return c(e, collection, collection2, e2, p6, j, false);
    }
    
    @org.jetbrains.annotations.e
    public static <D extends b> Collection<D> e(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final Collection<D> collection, @org.jetbrains.annotations.e final Collection<D> collection2, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e2, @org.jetbrains.annotations.e final p p6, @org.jetbrains.annotations.e final j j) {
        if (e == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (e2 == null) {
            a(9);
        }
        if (p6 == null) {
            a(10);
        }
        if (j == null) {
            a(11);
        }
        return c(e, collection, collection2, e2, p6, j, true);
    }
}
