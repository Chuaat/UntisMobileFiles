// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import org.jetbrains.annotations.f;
import kotlin.reflect.w;
import kotlin.h0;
import kotlin.collections.v;
import n6.l;
import m6.a;
import kotlin.reflect.d;
import kotlin.reflect.u;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.reflect.g;
import kotlin.e1;
import kotlin.Metadata;
import kotlin.reflect.s;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011\u0012\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016R\u001e\u0010\u0010\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\r8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010$\u001a\u00020\u001f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'" }, d2 = { "Lkotlin/jvm/internal/u1;", "Lkotlin/reflect/s;", "", "r", "Lkotlin/reflect/u;", "v", "", "other", "", "equals", "", "hashCode", "toString", "Ljava/lang/Class;", "z", "(Ljava/lang/Class;)Ljava/lang/String;", "arrayClassName", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "I", "Z", "c", "()Z", "isMarkedNullable", "H", "Ljava/util/List;", "getArguments", "arguments", "Lkotlin/reflect/g;", "G", "Lkotlin/reflect/g;", "b", "()Lkotlin/reflect/g;", "classifier", "<init>", "(Lkotlin/reflect/g;Ljava/util/List;Z)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.4")
public final class u1 implements s
{
    @e
    private final g G;
    @e
    private final List<u> H;
    private final boolean I;
    
    public u1(@e final g g, @e final List<u> h, final boolean i) {
        k0.p(g, "classifier");
        k0.p(h, "arguments");
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    private final String r() {
        g b = this.b();
        final boolean b2 = b instanceof d;
        final Class<?> clazz = null;
        if (!b2) {
            b = null;
        }
        final d<Object> d = (d<Object>)b;
        Class<?> c = clazz;
        if (d != null) {
            c = m6.a.c(d);
        }
        String str;
        if (c == null) {
            str = this.b().toString();
        }
        else if (c.isArray()) {
            str = this.z(c);
        }
        else {
            str = c.getName();
        }
        final boolean empty = this.getArguments().isEmpty();
        String str2 = "";
        String z2;
        if (empty) {
            z2 = "";
        }
        else {
            z2 = v.Z2(this.getArguments(), ", ", "<", ">", 0, null, new l<u, CharSequence>() {
                @e
                public final CharSequence a(@e final u u) {
                    k0.p(u, "it");
                    return u1.this.v(u);
                }
            }, 24, null);
        }
        if (this.c()) {
            str2 = "?";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
        return sb.toString();
    }
    
    private final String v(final u u) {
        if (u.h() == null) {
            return "*";
        }
        s g;
        if (!((g = u.g()) instanceof u1)) {
            g = null;
        }
        final u1 u2 = (u1)g;
        String str = null;
        Label_0055: {
            if (u2 != null) {
                str = u2.r();
                if (str != null) {
                    break Label_0055;
                }
            }
            str = String.valueOf(u.g());
        }
        final w h = u.h();
        if (h != null) {
            final int n = t1.a[h.ordinal()];
            String string = str;
            if (n != 1) {
                StringBuilder sb;
                String str2;
                if (n != 2) {
                    if (n != 3) {
                        throw new h0();
                    }
                    sb = new StringBuilder();
                    str2 = "out ";
                }
                else {
                    sb = new StringBuilder();
                    str2 = "in ";
                }
                sb.append(str2);
                sb.append(str);
                string = sb.toString();
            }
            return string;
        }
        throw new h0();
    }
    
    private final String z(final Class<?> clazz) {
        String s;
        if (k0.g(clazz, boolean[].class)) {
            s = "kotlin.BooleanArray";
        }
        else if (k0.g(clazz, char[].class)) {
            s = "kotlin.CharArray";
        }
        else if (k0.g(clazz, byte[].class)) {
            s = "kotlin.ByteArray";
        }
        else if (k0.g(clazz, short[].class)) {
            s = "kotlin.ShortArray";
        }
        else if (k0.g(clazz, int[].class)) {
            s = "kotlin.IntArray";
        }
        else if (k0.g(clazz, float[].class)) {
            s = "kotlin.FloatArray";
        }
        else if (k0.g(clazz, long[].class)) {
            s = "kotlin.LongArray";
        }
        else if (k0.g(clazz, double[].class)) {
            s = "kotlin.DoubleArray";
        }
        else {
            s = "kotlin.Array";
        }
        return s;
    }
    
    @e
    @Override
    public g b() {
        return this.G;
    }
    
    @Override
    public boolean c() {
        return this.I;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof u1) {
            final g b = this.b();
            final u1 u1 = (u1)o;
            if (k0.g(b, u1.b()) && k0.g(this.getArguments(), u1.getArguments()) && this.c() == u1.c()) {
                return true;
            }
        }
        return false;
    }
    
    @e
    @Override
    public List<Annotation> getAnnotations() {
        return v.E();
    }
    
    @e
    @Override
    public List<u> getArguments() {
        return this.H;
    }
    
    @Override
    public int hashCode() {
        return (this.b().hashCode() * 31 + this.getArguments().hashCode()) * 31 + Boolean.valueOf(this.c()).hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.r());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
