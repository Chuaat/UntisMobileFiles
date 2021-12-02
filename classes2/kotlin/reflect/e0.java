// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect;

import kotlin.jvm.internal.k0;
import java.util.Arrays;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import java.lang.reflect.Type;
import org.jetbrains.annotations.e;
import kotlin.q;
import kotlin.Metadata;
import java.lang.reflect.WildcardType;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0019B\u001b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u001a" }, d2 = { "Lkotlin/reflect/e0;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/z;", "", "Ljava/lang/reflect/Type;", "getUpperBounds", "()[Ljava/lang/reflect/Type;", "getLowerBounds", "", "getTypeName", "", "other", "", "equals", "", "hashCode", "toString", "H", "Ljava/lang/reflect/Type;", "lowerBound", "G", "upperBound", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "J", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@q
final class e0 implements WildcardType, z
{
    @e
    private static final e0 I;
    @e
    public static final a J;
    private final Type G;
    private final Type H;
    
    static {
        J = new a(null);
        I = new e0(null, null);
    }
    
    public e0(@f final Type g, @f final Type h) {
        this.G = g;
        this.H = h;
    }
    
    public static final /* synthetic */ e0 a() {
        return e0.I;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof WildcardType) {
            final Type[] upperBounds = this.getUpperBounds();
            final WildcardType wildcardType = (WildcardType)o;
            if (Arrays.equals(upperBounds, wildcardType.getUpperBounds()) && Arrays.equals(this.getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }
    
    @e
    @Override
    public Type[] getLowerBounds() {
        final Type h = this.H;
        Type[] array;
        if (h == null) {
            array = new Type[0];
        }
        else {
            array = new Type[] { h };
        }
        return array;
    }
    
    @e
    @Override
    public String getTypeName() {
        StringBuilder sb;
        Type type;
        if (this.H != null) {
            sb = new StringBuilder();
            sb.append("? super ");
            type = this.H;
        }
        else {
            final Type g = this.G;
            if (g == null || !(k0.g(g, Object.class) ^ true)) {
                return "?";
            }
            sb = new StringBuilder();
            sb.append("? extends ");
            type = this.G;
        }
        sb.append(d0.b(type));
        return sb.toString();
    }
    
    @e
    @Override
    public Type[] getUpperBounds() {
        Type g = this.G;
        if (g == null) {
            g = Object.class;
        }
        return new Type[] { g };
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.getUpperBounds()) ^ Arrays.hashCode(this.getLowerBounds());
    }
    
    @e
    @Override
    public String toString() {
        return this.getTypeName();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "kotlin/reflect/e0$a", "", "Lkotlin/reflect/e0;", "STAR", "Lkotlin/reflect/e0;", "a", "()Lkotlin/reflect/e0;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final e0 a() {
            return e0.a();
        }
    }
}
