// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import org.jetbrains.annotations.e;

public final class b
{
    public static final b c;
    @e
    private final c a;
    private transient b b;
    
    static {
        c = new b("");
    }
    
    public b(@e final String s) {
        if (s == null) {
            a(1);
        }
        this.a = new c(s, this);
    }
    
    public b(@e final c a) {
        if (a == null) {
            a(2);
        }
        this.a = a;
    }
    
    private b(@e final c a, final b b) {
        if (a == null) {
            a(3);
        }
        this.a = a;
        this.b = b;
    }
    
    private static /* synthetic */ void a(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11: {
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
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11: {
                n2 = 2;
                break;
            }
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "names";
                break;
            }
            case 13: {
                args[0] = "shortName";
                break;
            }
            case 12: {
                args[0] = "segment";
                break;
            }
            case 8: {
                args[0] = "name";
                break;
            }
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11: {
                args[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            }
            case 1:
            case 2:
            case 3: {
                args[0] = "fqName";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            }
            case 11: {
                args[1] = "pathSegments";
                break;
            }
            case 10: {
                args[1] = "shortNameOrSpecial";
                break;
            }
            case 9: {
                args[1] = "shortName";
                break;
            }
            case 6:
            case 7: {
                args[1] = "parent";
                break;
            }
            case 5: {
                args[1] = "toUnsafe";
                break;
            }
            case 4: {
                args[1] = "asString";
                break;
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "fromSegments";
                }
                case 4:
                case 5:
                case 6:
                case 7:
                case 9:
                case 10:
                case 11: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex = null;
                    switch (n) {
                        default: {
                            ex = new IllegalArgumentException(format2);
                            break;
                        }
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 9:
                        case 10:
                        case 11: {
                            ex = new IllegalStateException(format2);
                            break;
                        }
                    }
                    throw ex;
                }
                case 13: {
                    args[2] = "topLevel";
                    continue;
                }
                case 12: {
                    args[2] = "startsWith";
                    continue;
                }
                case 8: {
                    args[2] = "child";
                    continue;
                }
                case 1:
                case 2:
                case 3: {
                    args[2] = "<init>";
                    continue;
                }
            }
            break;
        }
    }
    
    @e
    public static b k(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        if (e == null) {
            a(13);
        }
        return new b(kotlin.reflect.jvm.internal.impl.name.c.m(e));
    }
    
    @e
    public String b() {
        final String b = this.a.b();
        if (b == null) {
            a(4);
        }
        return b;
    }
    
    @e
    public b c(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        if (e == null) {
            a(8);
        }
        return new b(this.a.c(e), this);
    }
    
    public boolean d() {
        return this.a.e();
    }
    
    @e
    public b e() {
        final b b = this.b;
        if (b != null) {
            if (b == null) {
                a(6);
            }
            return b;
        }
        if (!this.d()) {
            return this.b = new b(this.a.g());
        }
        throw new IllegalStateException("root");
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof b && this.a.equals(((b)o).a));
    }
    
    @e
    public List<kotlin.reflect.jvm.internal.impl.name.e> f() {
        final List<kotlin.reflect.jvm.internal.impl.name.e> h = this.a.h();
        if (h == null) {
            a(11);
        }
        return h;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.name.e g() {
        final kotlin.reflect.jvm.internal.impl.name.e i = this.a.i();
        if (i == null) {
            a(9);
        }
        return i;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.name.e h() {
        final kotlin.reflect.jvm.internal.impl.name.e j = this.a.j();
        if (j == null) {
            a(10);
        }
        return j;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public boolean i(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        if (e == null) {
            a(12);
        }
        return this.a.k(e);
    }
    
    @e
    public c j() {
        final c a = this.a;
        if (a == null) {
            a(5);
        }
        return a;
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
}
