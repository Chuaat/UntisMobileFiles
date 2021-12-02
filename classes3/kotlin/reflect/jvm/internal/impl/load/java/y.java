// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.c;
import kotlin.reflect.jvm.internal.impl.name.e;
import kotlin.reflect.jvm.internal.impl.name.b;

public final class y
{
    public static final b a;
    public static final String b;
    public static final e c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final b p;
    public static final b q;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    
    static {
        final b b2 = a = new b("kotlin.Metadata");
        final StringBuilder sb = new StringBuilder();
        sb.append("L");
        sb.append(kotlin.reflect.jvm.internal.impl.resolve.jvm.c.c(b2).f());
        sb.append(";");
        b = sb.toString();
        c = kotlin.reflect.jvm.internal.impl.name.e.i("value");
        d = new b(Target.class.getCanonicalName());
        e = new b(Retention.class.getCanonicalName());
        f = new b(Deprecated.class.getCanonicalName());
        g = new b(Documented.class.getCanonicalName());
        h = new b("java.lang.annotation.Repeatable");
        i = new b("org.jetbrains.annotations.NotNull");
        j = new b("org.jetbrains.annotations.Nullable");
        k = new b("org.jetbrains.annotations.Mutable");
        l = new b("org.jetbrains.annotations.ReadOnly");
        m = new b("kotlin.annotations.jvm.ReadOnly");
        n = new b("kotlin.annotations.jvm.Mutable");
        o = new b("kotlin.jvm.PurelyImplements");
        p = new b("kotlin.jvm.internal");
        q = new b("kotlin.jvm.internal.EnhancedNullability");
        r = new b("kotlin.jvm.internal.EnhancedMutability");
        s = new b("kotlin.annotations.jvm.internal.ParameterName");
        t = new b("kotlin.annotations.jvm.internal.DefaultValue");
        u = new b("kotlin.annotations.jvm.internal.DefaultNull");
    }
}
