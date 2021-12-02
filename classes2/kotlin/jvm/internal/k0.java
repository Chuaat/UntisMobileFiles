// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.i2;
import kotlin.x;
import kotlin.e1;
import java.util.Arrays;

public class k0
{
    private k0() {
    }
    
    private static <T extends Throwable> T A(final T t) {
        return B(t, k0.class.getName());
    }
    
    static <T extends Throwable> T B(final T t, final String s) {
        final StackTraceElement[] stackTrace = t.getStackTrace();
        final int length = stackTrace.length;
        int n = -1;
        for (int i = 0; i < length; ++i) {
            if (s.equals(stackTrace[i].getClassName())) {
                n = i;
            }
        }
        t.setStackTrace(Arrays.copyOfRange(stackTrace, n + 1, length));
        return t;
    }
    
    public static String C(final String str, final Object obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }
    
    public static void D() {
        throw A(new AssertionError());
    }
    
    public static void E(final String detailMessage) {
        throw A(new AssertionError((Object)detailMessage));
    }
    
    public static void F() {
        throw A(new IllegalArgumentException());
    }
    
    public static void G(final String s) {
        throw A(new IllegalArgumentException(s));
    }
    
    public static void H() {
        throw A(new IllegalStateException());
    }
    
    public static void I(final String s) {
        throw A(new IllegalStateException(s));
    }
    
    @e1(version = "1.4")
    public static void J() {
        throw A(new NullPointerException());
    }
    
    @e1(version = "1.4")
    public static void K(final String s) {
        throw A(new NullPointerException(s));
    }
    
    public static void L() {
        throw A(new x());
    }
    
    public static void M(final String s) {
        throw A(new x(s));
    }
    
    private static void N(final String s) {
        throw A(new IllegalArgumentException(v(s)));
    }
    
    private static void O(final String s) {
        throw A(new NullPointerException(v(s)));
    }
    
    public static void P() {
        Q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
    
    public static void Q(final String message) {
        throw new UnsupportedOperationException(message);
    }
    
    public static void R(final String s) {
        throw A(new i2(s));
    }
    
    public static void S(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        R(sb.toString());
    }
    
    @e1(version = "1.1")
    public static boolean a(final double n, final Double n2) {
        return n2 != null && n == n2;
    }
    
    @e1(version = "1.1")
    public static boolean b(final float n, final Float n2) {
        return n2 != null && n == n2;
    }
    
    @e1(version = "1.1")
    public static boolean c(final Double n, final double n2) {
        return n != null && n == n2;
    }
    
    @e1(version = "1.1")
    public static boolean d(final Double n, final Double n2) {
        boolean b = true;
        if (n == null) {
            if (n2 == null) {
                return b;
            }
        }
        else if (n2 != null && n == (double)n2) {
            return b;
        }
        b = false;
        return b;
    }
    
    @e1(version = "1.1")
    public static boolean e(final Float n, final float n2) {
        return n != null && n == n2;
    }
    
    @e1(version = "1.1")
    public static boolean f(final Float n, final Float n2) {
        boolean b = true;
        if (n == null) {
            if (n2 == null) {
                return b;
            }
        }
        else if (n2 != null && n == (float)n2) {
            return b;
        }
        b = false;
        return b;
    }
    
    public static boolean g(final Object o, final Object obj) {
        boolean equals;
        if (o == null) {
            equals = (obj == null);
        }
        else {
            equals = o.equals(obj);
        }
        return equals;
    }
    
    public static void h(final Object o, final String str) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw A(new IllegalStateException(sb.toString()));
    }
    
    public static void i(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw A(new IllegalStateException(s));
    }
    
    public static void j(final Object o, final String str, final String str2) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field specified as non-null is null: ");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        throw A(new IllegalStateException(sb.toString()));
    }
    
    public static void k(final String s) throws ClassNotFoundException {
        final String replace = s.replace('/', '.');
        try {
            Class.forName(replace);
        }
        catch (ClassNotFoundException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Class ");
            sb.append(replace);
            sb.append(" is not found. Please update the Kotlin runtime to the latest version");
            throw A(new ClassNotFoundException(sb.toString(), ex));
        }
    }
    
    public static void l(final String s, final String str) throws ClassNotFoundException {
        final String replace = s.replace('/', '.');
        try {
            Class.forName(replace);
        }
        catch (ClassNotFoundException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Class ");
            sb.append(replace);
            sb.append(" is not found: this code requires the Kotlin runtime of version at least ");
            sb.append(str);
            throw A(new ClassNotFoundException(sb.toString(), ex));
        }
    }
    
    public static void m(final Object o) {
        if (o == null) {
            J();
        }
    }
    
    public static void n(final Object o, final String s) {
        if (o == null) {
            K(s);
        }
    }
    
    public static void o(final Object o, final String str) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw A(new NullPointerException(sb.toString()));
    }
    
    public static void p(final Object o, final String s) {
        if (o == null) {
            O(s);
        }
    }
    
    public static void q(final Object o, final String s) {
        if (o == null) {
            N(s);
        }
    }
    
    public static void r(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw A(new IllegalStateException(s));
    }
    
    public static void s(final Object o, final String str, final String str2) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Method specified as non-null returned null: ");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        throw A(new IllegalStateException(sb.toString()));
    }
    
    public static int t(int n, final int n2) {
        if (n < n2) {
            n = -1;
        }
        else if (n == n2) {
            n = 0;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    public static int u(final long n, final long n2) {
        final long n3 = lcmp(n, n2);
        int n4;
        if (n3 < 0) {
            n4 = -1;
        }
        else if (n3 == 0) {
            n4 = 0;
        }
        else {
            n4 = 1;
        }
        return n4;
    }
    
    private static String v(final String str) {
        final StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        final String className = stackTraceElement.getClassName();
        final String methodName = stackTraceElement.getMethodName();
        final StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        return sb.toString();
    }
    
    public static void w() {
        P();
    }
    
    public static void x(final String s) {
        Q(s);
    }
    
    public static void y(final int n, final String s) {
        P();
    }
    
    public static void z(final int n, final String s, final String s2) {
        Q(s2);
    }
    
    @e1(version = "1.4")
    public static class a
    {
        private a() {
        }
    }
}
