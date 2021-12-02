// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.name;

import kotlin.collections.m;
import java.util.Collections;
import java.util.List;
import n6.l;
import java.util.regex.Pattern;

public final class c
{
    private static final e e;
    private static final Pattern f;
    private static final l<String, e> g;
    @org.jetbrains.annotations.e
    private final String a;
    private transient b b;
    private transient c c;
    private transient e d;
    
    static {
        e = kotlin.reflect.jvm.internal.impl.name.e.l("<root>");
        f = Pattern.compile("\\.");
        g = (l)new l<String, e>() {
            public e a(final String s) {
                return kotlin.reflect.jvm.internal.impl.name.e.h(s);
            }
        };
    }
    
    public c(@org.jetbrains.annotations.e final String a) {
        if (a == null) {
            a(2);
        }
        this.a = a;
    }
    
    c(@org.jetbrains.annotations.e final String a, @org.jetbrains.annotations.e final b b) {
        if (a == null) {
            a(0);
        }
        if (b == null) {
            a(1);
        }
        this.a = a;
        this.b = b;
    }
    
    private c(@org.jetbrains.annotations.e final String a, final c c, final e d) {
        if (a == null) {
            a(3);
        }
        this.a = a;
        this.c = c;
        this.d = d;
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17: {
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17: {
                n2 = 2;
                break;
            }
        }
        final Object[] args = new Object[n2];
        if (n != 1) {
            switch (n) {
                default: {
                    args[0] = "fqName";
                    break;
                }
                case 16: {
                    args[0] = "shortName";
                    break;
                }
                case 15: {
                    args[0] = "segment";
                    break;
                }
                case 9: {
                    args[0] = "name";
                    break;
                }
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17: {
                    args[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                }
            }
        }
        else {
            args[0] = "safe";
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            }
            case 17: {
                args[1] = "toString";
                break;
            }
            case 14: {
                args[1] = "pathSegments";
                break;
            }
            case 12:
            case 13: {
                args[1] = "shortNameOrSpecial";
                break;
            }
            case 10:
            case 11: {
                args[1] = "shortName";
                break;
            }
            case 7:
            case 8: {
                args[1] = "parent";
                break;
            }
            case 5:
            case 6: {
                args[1] = "toSafe";
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
                    args[2] = "<init>";
                }
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17: {
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
                        case 8:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 17: {
                            ex = new IllegalStateException(format2);
                            break;
                        }
                    }
                    throw ex;
                }
                case 16: {
                    args[2] = "topLevel";
                    continue;
                }
                case 15: {
                    args[2] = "startsWith";
                    continue;
                }
                case 9: {
                    args[2] = "child";
                    continue;
                }
            }
            break;
        }
    }
    
    private void d() {
        final int lastIndex = this.a.lastIndexOf(46);
        if (lastIndex >= 0) {
            this.d = kotlin.reflect.jvm.internal.impl.name.e.h(this.a.substring(lastIndex + 1));
            this.c = new c(this.a.substring(0, lastIndex));
        }
        else {
            this.d = kotlin.reflect.jvm.internal.impl.name.e.h(this.a);
            this.c = kotlin.reflect.jvm.internal.impl.name.b.c.j();
        }
    }
    
    @org.jetbrains.annotations.e
    public static c m(@org.jetbrains.annotations.e final e e) {
        if (e == null) {
            a(16);
        }
        return new c(e.d(), b.c.j(), e);
    }
    
    @org.jetbrains.annotations.e
    public String b() {
        final String a = this.a;
        if (a == null) {
            a(4);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    public c c(@org.jetbrains.annotations.e final e e) {
        if (e == null) {
            a(9);
        }
        String s;
        if (this.e()) {
            s = e.d();
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(".");
            sb.append(e.d());
            s = sb.toString();
        }
        return new c(s, this, e);
    }
    
    public boolean e() {
        return this.a.isEmpty();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof c && this.a.equals(((c)o).a));
    }
    
    public boolean f() {
        return this.b != null || this.b().indexOf(60) < 0;
    }
    
    @org.jetbrains.annotations.e
    public c g() {
        final c c = this.c;
        if (c != null) {
            if (c == null) {
                a(7);
            }
            return c;
        }
        if (!this.e()) {
            this.d();
            final c c2 = this.c;
            if (c2 == null) {
                a(8);
            }
            return c2;
        }
        throw new IllegalStateException("root");
    }
    
    @org.jetbrains.annotations.e
    public List<e> h() {
        List<e> list;
        if (this.e()) {
            list = Collections.emptyList();
        }
        else {
            list = (List<e>)m.Kh((Object[])kotlin.reflect.jvm.internal.impl.name.c.f.split(this.a), (l)kotlin.reflect.jvm.internal.impl.name.c.g);
        }
        if (list == null) {
            a(14);
        }
        return list;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @org.jetbrains.annotations.e
    public e i() {
        final e d = this.d;
        if (d != null) {
            if (d == null) {
                a(10);
            }
            return d;
        }
        if (!this.e()) {
            this.d();
            final e d2 = this.d;
            if (d2 == null) {
                a(11);
            }
            return d2;
        }
        throw new IllegalStateException("root");
    }
    
    @org.jetbrains.annotations.e
    public e j() {
        if (this.e()) {
            final e e = kotlin.reflect.jvm.internal.impl.name.c.e;
            if (e == null) {
                a(12);
            }
            return e;
        }
        final e i = this.i();
        if (i == null) {
            a(13);
        }
        return i;
    }
    
    public boolean k(@org.jetbrains.annotations.e final e e) {
        if (e == null) {
            a(15);
        }
        if (this.e()) {
            return false;
        }
        final int index = this.a.indexOf(46);
        final String a = this.a;
        final String d = e.d();
        int length;
        if ((length = index) == -1) {
            length = this.a.length();
        }
        return a.regionMatches(0, d, 0, length);
    }
    
    @org.jetbrains.annotations.e
    public b l() {
        final b b = this.b;
        if (b != null) {
            if (b == null) {
                a(5);
            }
            return b;
        }
        return this.b = new b(this);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        String s;
        if (this.e()) {
            s = kotlin.reflect.jvm.internal.impl.name.c.e.d();
        }
        else {
            s = this.a;
        }
        if (s == null) {
            a(17);
        }
        return s;
    }
}
