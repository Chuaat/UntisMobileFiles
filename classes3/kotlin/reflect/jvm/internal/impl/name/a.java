// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.f;
import kotlin.text.s;
import org.jetbrains.annotations.e;

public final class a
{
    private final b a;
    private final b b;
    private final boolean c;
    
    public a(@e final b a, @e final b b, final boolean c) {
        if (a == null) {
            a(1);
        }
        if (b == null) {
            a(2);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public a(@e final b b, @e final kotlin.reflect.jvm.internal.impl.name.e e) {
        if (b == null) {
            a(3);
        }
        if (e == null) {
            a(4);
        }
        this(b, kotlin.reflect.jvm.internal.impl.name.b.k(e), false);
    }
    
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 5 && n != 6 && n != 7 && n != 9 && n != 13 && n != 14) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 5 && n != 6 && n != 7 && n != 9 && n != 13 && n != 14) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "topLevelFqName";
                break;
            }
            case 11:
            case 12: {
                args[0] = "string";
                break;
            }
            case 10: {
                args[0] = "segment";
                break;
            }
            case 8: {
                args[0] = "name";
                break;
            }
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14: {
                args[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            }
            case 4: {
                args[0] = "topLevelName";
                break;
            }
            case 2: {
                args[0] = "relativeClassName";
                break;
            }
            case 1:
            case 3: {
                args[0] = "packageFqName";
                break;
            }
        }
        if (n != 5) {
            if (n != 6) {
                if (n != 7) {
                    if (n != 9) {
                        if (n != 13 && n != 14) {
                            args[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                        }
                        else {
                            args[1] = "asString";
                        }
                    }
                    else {
                        args[1] = "asSingleFqName";
                    }
                }
                else {
                    args[1] = "getShortClassName";
                }
            }
            else {
                args[1] = "getRelativeClassName";
            }
        }
        else {
            args[1] = "getPackageFqName";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "topLevel";
                }
                case 5:
                case 6:
                case 7:
                case 9:
                case 13:
                case 14: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 5 && n != 6 && n != 7 && n != 9 && n != 13 && n != 14) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 11:
                case 12: {
                    args[2] = "fromString";
                    continue;
                }
                case 10: {
                    args[2] = "startsWith";
                    continue;
                }
                case 8: {
                    args[2] = "createNestedClassId";
                    continue;
                }
                case 1:
                case 2:
                case 3:
                case 4: {
                    args[2] = "<init>";
                    continue;
                }
            }
            break;
        }
    }
    
    @e
    public static a e(@e final String s) {
        if (s == null) {
            a(11);
        }
        return f(s, false);
    }
    
    @e
    public static a f(@e String n5, final boolean b) {
        if (n5 == null) {
            a(12);
        }
        final String replace = s.v5(n5, '/', "").replace('/', '.');
        n5 = s.n5(n5, '/', n5);
        return new a(new b(replace), new b(n5), b);
    }
    
    @e
    public static a m(@e final b b) {
        if (b == null) {
            a(0);
        }
        return new a(b.e(), b.g());
    }
    
    @e
    public b b() {
        if (this.a.d()) {
            final b b = this.b;
            if (b == null) {
                a(9);
            }
            return b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a.b());
        sb.append(".");
        sb.append(this.b.b());
        return new b(sb.toString());
    }
    
    @e
    public String c() {
        if (this.a.d()) {
            final String b = this.b.b();
            if (b == null) {
                a(13);
            }
            return b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a.b().replace('.', '/'));
        sb.append("/");
        sb.append(this.b.b());
        final String string = sb.toString();
        if (string == null) {
            a(14);
        }
        return string;
    }
    
    @e
    public a d(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        if (e == null) {
            a(8);
        }
        return new a(this.h(), this.b.c(e), this.c);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && a.class == o.getClass()) {
            final a a = (a)o;
            if (!this.a.equals(a.a) || !this.b.equals(a.b) || this.c != a.c) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @f
    public a g() {
        final b e = this.b.e();
        a a;
        if (e.d()) {
            a = null;
        }
        else {
            a = new a(this.h(), e, this.c);
        }
        return a;
    }
    
    @e
    public b h() {
        final b a = this.a;
        if (a == null) {
            a(5);
        }
        return a;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + Boolean.valueOf(this.c).hashCode();
    }
    
    @e
    public b i() {
        final b b = this.b;
        if (b == null) {
            a(6);
        }
        return b;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.name.e j() {
        final kotlin.reflect.jvm.internal.impl.name.e g = this.b.g();
        if (g == null) {
            a(7);
        }
        return g;
    }
    
    public boolean k() {
        return this.c;
    }
    
    public boolean l() {
        return this.b.e().d() ^ true;
    }
    
    @Override
    public String toString() {
        String s;
        if (this.a.d()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("/");
            sb.append(this.c());
            s = sb.toString();
        }
        else {
            s = this.c();
        }
        return s;
    }
}
