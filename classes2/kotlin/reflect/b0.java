// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect;

import kotlin.i0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import kotlin.collections.v;
import java.lang.reflect.Type;
import org.jetbrains.annotations.f;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.q;
import kotlin.Metadata;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J'\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\u0004\b\u001b\u0010\u001aJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\u0004\b\u001c\u0010\u001aR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#" }, d2 = { "Lkotlin/reflect/b0;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/z;", "", "getName", "getGenericDeclaration", "", "Ljava/lang/reflect/Type;", "getBounds", "()[Ljava/lang/reflect/Type;", "getTypeName", "", "other", "", "equals", "", "hashCode", "toString", "", "T", "Ljava/lang/Class;", "annotationClass", "b", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "c", "()[Ljava/lang/annotation/Annotation;", "d", "a", "Lkotlin/reflect/t;", "G", "Lkotlin/reflect/t;", "typeParameter", "<init>", "(Lkotlin/reflect/t;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@q
final class b0 implements TypeVariable<GenericDeclaration>, z
{
    private final t G;
    
    public b0(@e final t g) {
        k0.p(g, "typeParameter");
        this.G = g;
    }
    
    @e
    public final Annotation[] a() {
        return new Annotation[0];
    }
    
    @f
    public final <T extends Annotation> T b(@e final Class<T> clazz) {
        k0.p(clazz, "annotationClass");
        return null;
    }
    
    @e
    public final Annotation[] c() {
        return new Annotation[0];
    }
    
    @e
    public final Annotation[] d() {
        return new Annotation[0];
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof TypeVariable) {
            final String name = this.getName();
            final TypeVariable typeVariable = (TypeVariable)o;
            if (k0.g(name, typeVariable.getName()) && k0.g(this.getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }
    
    @e
    @Override
    public Type[] getBounds() {
        final List<s> upperBounds = this.G.getUpperBounds();
        final ArrayList list = new ArrayList<Type>(v.Y((Iterable<?>)upperBounds, 10));
        final Iterator<Object> iterator = upperBounds.iterator();
        while (iterator.hasNext()) {
            list.add(d0.a(iterator.next(), true));
        }
        final Type[] array = list.toArray(new Type[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return array;
    }
    
    @e
    @Override
    public GenericDeclaration getGenericDeclaration() {
        final StringBuilder sb = new StringBuilder();
        sb.append("getGenericDeclaration() is not yet supported for type variables created from KType: ");
        sb.append(this.G);
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("An operation is not implemented: ");
        sb2.append(string);
        throw new i0(sb2.toString());
    }
    
    @e
    @Override
    public String getName() {
        return this.G.getName();
    }
    
    @e
    @Override
    public String getTypeName() {
        return this.getName();
    }
    
    @Override
    public int hashCode() {
        return this.getName().hashCode() ^ this.getGenericDeclaration().hashCode();
    }
    
    @e
    @Override
    public String toString() {
        return this.getTypeName();
    }
}
