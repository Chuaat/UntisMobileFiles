// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.lang.reflect.Type;
import kotlin.q;
import kotlin.Metadata;
import java.lang.reflect.GenericArrayType;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013" }, d2 = { "Lkotlin/reflect/a;", "Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/z;", "Ljava/lang/reflect/Type;", "getGenericComponentType", "", "getTypeName", "", "other", "", "equals", "", "hashCode", "toString", "G", "Ljava/lang/reflect/Type;", "elementType", "<init>", "(Ljava/lang/reflect/Type;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@q
final class a implements GenericArrayType, z
{
    private final Type G;
    
    public a(@e final Type g) {
        k0.p(g, "elementType");
        this.G = g;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof GenericArrayType && k0.g(this.getGenericComponentType(), ((GenericArrayType)o).getGenericComponentType());
    }
    
    @e
    @Override
    public Type getGenericComponentType() {
        return this.G;
    }
    
    @e
    @Override
    public String getTypeName() {
        final StringBuilder sb = new StringBuilder();
        sb.append(d0.b(this.G));
        sb.append("[]");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        return this.getGenericComponentType().hashCode();
    }
    
    @e
    @Override
    public String toString() {
        return this.getTypeName();
    }
}
