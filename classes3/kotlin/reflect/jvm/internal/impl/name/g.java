// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.f;

public class g
{
    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    
    static {
        a = kotlin.reflect.jvm.internal.impl.name.e.l("<no name provided>");
        b = kotlin.reflect.jvm.internal.impl.name.e.l("<root package>");
        c = kotlin.reflect.jvm.internal.impl.name.e.i("Companion");
        d = kotlin.reflect.jvm.internal.impl.name.e.i("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        e = kotlin.reflect.jvm.internal.impl.name.e.l("<anonymous>");
    }
    
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 1) {
            format = "@NotNull method %s.%s must not return null";
        }
        else {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        int n2;
        if (n != 1) {
            n2 = 2;
        }
        else {
            n2 = 3;
        }
        final Object[] args = new Object[n2];
        if (n != 1) {
            args[0] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        }
        else {
            args[0] = "name";
        }
        if (n != 1) {
            args[1] = "safeIdentifier";
        }
        else {
            args[1] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        }
        if (n == 1) {
            args[2] = "isSafeIdentifier";
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 1) {
            ex = new IllegalStateException(format2);
        }
        else {
            ex = new IllegalArgumentException(format2);
        }
        throw ex;
    }
    
    public static boolean b(@org.jetbrains.annotations.e final e e) {
        boolean b = true;
        if (e == null) {
            a(1);
        }
        if (e.d().isEmpty() || e.j()) {
            b = false;
        }
        return b;
    }
    
    @org.jetbrains.annotations.e
    public static e c(@f e d) {
        if (d == null || d.j()) {
            d = g.d;
        }
        if (d == null) {
            a(0);
        }
        return d;
    }
}
