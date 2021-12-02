// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.j1;
import java.util.LinkedHashSet;
import kotlin.collections.v;
import java.util.Set;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;

public final class z
{
    @e
    private static final b a;
    @e
    private static final b b;
    @e
    private static final b c;
    @e
    private static final List<b> d;
    @e
    private static final b e;
    @e
    private static final b f;
    @e
    private static final List<b> g;
    @e
    private static final b h;
    @e
    private static final b i;
    @e
    private static final b j;
    @e
    private static final b k;
    @e
    private static final Set<b> l;
    @e
    private static final List<b> m;
    @e
    private static final List<b> n;
    
    static {
        final b b2 = a = new b("org.jspecify.annotations.Nullable");
        final b b3 = b = new b("org.jspecify.annotations.NullnessUnspecified");
        final b b4 = c = new b("org.jspecify.annotations.DefaultNonNull");
        final List<b> list = (List<b>)(d = v.L((Object[])new b[] { y.j, new b("androidx.annotation.Nullable"), new b("androidx.annotation.Nullable"), new b("android.annotation.Nullable"), new b("com.android.annotations.Nullable"), new b("org.eclipse.jdt.annotation.Nullable"), new b("org.checkerframework.checker.nullness.qual.Nullable"), new b("javax.annotation.Nullable"), new b("javax.annotation.CheckForNull"), new b("edu.umd.cs.findbugs.annotations.CheckForNull"), new b("edu.umd.cs.findbugs.annotations.Nullable"), new b("edu.umd.cs.findbugs.annotations.PossiblyNull"), new b("io.reactivex.annotations.Nullable") }));
        final b b5 = e = new b("javax.annotation.Nonnull");
        f = new b("javax.annotation.CheckForNull");
        l = j1.D(j1.D(j1.D(j1.D(j1.D(j1.D(j1.D(j1.C(j1.D(j1.C((Set)new LinkedHashSet(), (Iterable)list), (Object)b5), (Iterable)(g = v.L((Object[])new b[] { y.i, new b("edu.umd.cs.findbugs.annotations.NonNull"), new b("androidx.annotation.NonNull"), new b("androidx.annotation.NonNull"), new b("android.annotation.NonNull"), new b("com.android.annotations.NonNull"), new b("org.eclipse.jdt.annotation.NonNull"), new b("org.checkerframework.checker.nullness.qual.NonNull"), new b("lombok.NonNull"), new b("io.reactivex.annotations.NonNull") }))), (Object)(h = new b("org.checkerframework.checker.nullness.compatqual.NullableDecl"))), (Object)(i = new b("org.checkerframework.checker.nullness.compatqual.NonNullDecl"))), (Object)(j = new b("androidx.annotation.RecentlyNullable"))), (Object)(k = new b("androidx.annotation.RecentlyNonNull"))), (Object)b2), (Object)b3), (Object)b4);
        m = v.L((Object[])new b[] { y.l, y.m });
        n = v.L((Object[])new b[] { y.k, y.n });
    }
    
    @e
    public static final b a() {
        return z.k;
    }
    
    @e
    public static final b b() {
        return z.j;
    }
    
    @e
    public static final b c() {
        return z.i;
    }
    
    @e
    public static final b d() {
        return z.h;
    }
    
    @e
    public static final b e() {
        return z.f;
    }
    
    @e
    public static final b f() {
        return z.e;
    }
    
    @e
    public static final b g() {
        return z.c;
    }
    
    @e
    public static final b h() {
        return z.a;
    }
    
    @e
    public static final b i() {
        return z.b;
    }
    
    @e
    public static final List<b> j() {
        return z.n;
    }
    
    @e
    public static final List<b> k() {
        return z.g;
    }
    
    @e
    public static final List<b> l() {
        return z.d;
    }
    
    @e
    public static final List<b> m() {
        return z.m;
    }
}
