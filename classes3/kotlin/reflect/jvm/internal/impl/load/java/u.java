// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.java.a$b;
import kotlin.reflect.jvm.internal.impl.descriptors.java.a$c;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.q;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.java.a$a;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import java.util.Map;
import org.jetbrains.annotations.e;

public class u
{
    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u a;
    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u b;
    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u c;
    @e
    private static final Map<j1, kotlin.reflect.jvm.internal.impl.descriptors.u> d;
    
    static {
        final kotlin.reflect.jvm.internal.impl.descriptors.u u = a = (kotlin.reflect.jvm.internal.impl.descriptors.u)new r((j1)a$a.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    args[0] = "what";
                }
                else {
                    args[0] = "from";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
                args[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
                if (q == null) {
                    g(0);
                }
                if (m == null) {
                    g(1);
                }
                return d((m)q, m);
            }
        };
        final kotlin.reflect.jvm.internal.impl.descriptors.u u2 = b = (kotlin.reflect.jvm.internal.impl.descriptors.u)new r((j1)a$c.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    args[0] = "what";
                }
                else {
                    args[0] = "from";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
                args[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
                if (q == null) {
                    g(0);
                }
                if (m == null) {
                    g(1);
                }
                return e(e, q, m);
            }
        };
        final kotlin.reflect.jvm.internal.impl.descriptors.u u3 = c = (kotlin.reflect.jvm.internal.impl.descriptors.u)new r((j1)a$b.c) {
            private static /* synthetic */ void g(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    args[0] = "what";
                }
                else {
                    args[0] = "from";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
                args[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            public boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
                if (q == null) {
                    g(0);
                }
                if (m == null) {
                    g(1);
                }
                return e(e, q, m);
            }
        };
        d = new HashMap<j1, kotlin.reflect.jvm.internal.impl.descriptors.u>();
        f(u);
        f(u2);
        f(u3);
    }
    
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 5 && n != 6) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 5 && n != 6) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "what";
                break;
            }
            case 5:
            case 6: {
                args[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            }
            case 4: {
                args[0] = "visibility";
                break;
            }
            case 3: {
                args[0] = "second";
                break;
            }
            case 2: {
                args[0] = "first";
                break;
            }
            case 1: {
                args[0] = "from";
                break;
            }
        }
        if (n != 5 && n != 6) {
            args[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        else {
            args[1] = "toDescriptorVisibility";
        }
        if (n != 2 && n != 3) {
            if (n != 4) {
                if (n != 5 && n != 6) {
                    args[2] = "isVisibleForProtectedAndPackage";
                }
            }
            else {
                args[2] = "toDescriptorVisibility";
            }
        }
        else {
            args[2] = "areInSamePackage";
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 5 && n != 6) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    private static boolean d(@e final m m, @e final m i) {
        if (m == null) {
            a(2);
        }
        if (i == null) {
            a(3);
        }
        final boolean b = false;
        final h0 h0 = kotlin.reflect.jvm.internal.impl.resolve.d.r(m, h0.class, false);
        final h0 h2 = kotlin.reflect.jvm.internal.impl.resolve.d.r(i, h0.class, false);
        boolean b2 = b;
        if (h2 != null) {
            b2 = b;
            if (h0 != null) {
                b2 = b;
                if (h0.f().equals(h2.f())) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    private static boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e e, @e final q q, @e final m m) {
        if (q == null) {
            a(0);
        }
        if (m == null) {
            a(1);
        }
        return d(kotlin.reflect.jvm.internal.impl.resolve.d.M((m)q), m) || t.c.e(e, q, m);
    }
    
    private static void f(final kotlin.reflect.jvm.internal.impl.descriptors.u u) {
        u.d.put(u.b(), u);
    }
    
    @e
    public static kotlin.reflect.jvm.internal.impl.descriptors.u g(@e final j1 j1) {
        if (j1 == null) {
            a(4);
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.u u = kotlin.reflect.jvm.internal.impl.load.java.u.d.get(j1);
        if (u == null) {
            final kotlin.reflect.jvm.internal.impl.descriptors.u i = t.j(j1);
            if (i == null) {
                a(5);
            }
            return i;
        }
        return u;
    }
}
