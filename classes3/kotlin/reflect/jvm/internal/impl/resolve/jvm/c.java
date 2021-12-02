// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.reflect.jvm.internal.impl.name.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;

public class c
{
    private final String a;
    private b b;
    
    private c(@e final String a) {
        if (a == null) {
            a(5);
        }
        this.a = a;
    }
    
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 3 && n != 6 && n != 7 && n != 8) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 3 && n != 6 && n != 7 && n != 8) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "internalName";
                break;
            }
            case 3:
            case 6:
            case 7:
            case 8: {
                args[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            }
            case 2:
            case 4: {
                args[0] = "fqName";
                break;
            }
            case 1: {
                args[0] = "classId";
                break;
            }
        }
        if (n != 3) {
            if (n != 6) {
                if (n != 7) {
                    if (n != 8) {
                        args[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    }
                    else {
                        args[1] = "getInternalName";
                    }
                }
                else {
                    args[1] = "getPackageFqName";
                }
            }
            else {
                args[1] = "getFqNameForClassNameWithoutDollars";
            }
        }
        else {
            args[1] = "byFqNameWithoutInnerClasses";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "byInternalName";
                }
                case 3:
                case 6:
                case 7:
                case 8: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 3 && n != 6 && n != 7 && n != 8) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 5: {
                    args[2] = "<init>";
                    continue;
                }
                case 2:
                case 4: {
                    args[2] = "byFqNameWithoutInnerClasses";
                    continue;
                }
                case 1: {
                    args[2] = "byClassId";
                    continue;
                }
            }
            break;
        }
    }
    
    @e
    public static c b(@e final a a) {
        if (a == null) {
            a(1);
        }
        final b h = a.h();
        final String replace = a.i().b().replace('.', '$');
        c c;
        if (h.d()) {
            c = new c(replace);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(h.b().replace('.', '/'));
            sb.append("/");
            sb.append(replace);
            c = new c(sb.toString());
        }
        return c;
    }
    
    @e
    public static c c(@e final b b) {
        if (b == null) {
            a(2);
        }
        final c c = new c(b.b().replace('.', '/'));
        c.b = b;
        return c;
    }
    
    @e
    public static c d(@e final String s) {
        if (s == null) {
            a(0);
        }
        return new c(s);
    }
    
    @e
    public b e() {
        return new b(this.a.replace('/', '.'));
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((c)o).a));
    }
    
    @e
    public String f() {
        final String a = this.a;
        if (a == null) {
            a(8);
        }
        return a;
    }
    
    @e
    public b g() {
        final int lastIndex = this.a.lastIndexOf("/");
        if (lastIndex == -1) {
            final b c = kotlin.reflect.jvm.internal.impl.name.b.c;
            if (c == null) {
                a(7);
            }
            return c;
        }
        return new b(this.a.substring(0, lastIndex).replace('/', '.'));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        return this.a;
    }
}
