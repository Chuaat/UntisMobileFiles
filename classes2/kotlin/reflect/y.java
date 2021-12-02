// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect;

import n6.l;
import kotlin.collections.m;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.lang.reflect.Type;
import kotlin.q;
import kotlin.Metadata;
import java.lang.reflect.ParameterizedType;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016R\u001a\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f" }, d2 = { "Lkotlin/reflect/y;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/z;", "Ljava/lang/reflect/Type;", "getRawType", "getOwnerType", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "", "getTypeName", "", "other", "", "equals", "", "hashCode", "toString", "Ljava/lang/Class;", "H", "Ljava/lang/Class;", "rawType", "G", "[Ljava/lang/reflect/Type;", "typeArguments", "I", "Ljava/lang/reflect/Type;", "ownerType", "", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@q
final class y implements ParameterizedType, z
{
    private final Type[] G;
    private final Class<?> H;
    private final Type I;
    
    public y(@e final Class<?> h, @f final Type i, @e final List<? extends Type> list) {
        k0.p(h, "rawType");
        k0.p(list, "typeArguments");
        this.H = h;
        this.I = i;
        final Object[] array = list.toArray((Object[])new Type[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.G = (Type[])array;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof ParameterizedType) {
            final Class<?> h = this.H;
            final ParameterizedType parameterizedType = (ParameterizedType)o;
            if (k0.g(h, parameterizedType.getRawType()) && k0.g(this.I, parameterizedType.getOwnerType()) && Arrays.equals(this.getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }
    
    @e
    @Override
    public Type[] getActualTypeArguments() {
        return this.G;
    }
    
    @f
    @Override
    public Type getOwnerType() {
        return this.I;
    }
    
    @e
    @Override
    public Type getRawType() {
        return this.H;
    }
    
    @e
    @Override
    public String getTypeName() {
        final StringBuilder sb = new StringBuilder();
        final Type i = this.I;
        String str;
        if (i != null) {
            sb.append(d0.b(i));
            sb.append("$");
            str = this.H.getSimpleName();
        }
        else {
            str = d0.b(this.H);
        }
        sb.append(str);
        final Type[] g = this.G;
        if (g.length == 0 ^ true) {
            m.qg(g, sb, null, "<", ">", 0, null, y$a.G, 50, null);
        }
        final String string = sb.toString();
        k0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.H.hashCode();
        final Type i = this.I;
        int hashCode2;
        if (i != null) {
            hashCode2 = i.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode ^ hashCode2 ^ Arrays.hashCode(this.getActualTypeArguments());
    }
    
    @e
    @Override
    public String toString() {
        return this.getTypeName();
    }
}
