// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.properties;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.o;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0007\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0010" }, d2 = { "Lkotlin/properties/b;", "", "T", "Lkotlin/properties/f;", "thisRef", "Lkotlin/reflect/o;", "property", "a", "(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;", "value", "Lkotlin/j2;", "b", "(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V", "Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class b<T> implements f<Object, T>
{
    private T a;
    
    public b() {
    }
    
    @org.jetbrains.annotations.e
    @Override
    public T a(@org.jetbrains.annotations.f Object a, @org.jetbrains.annotations.e final o<?> o) {
        k0.p(o, "property");
        a = this.a;
        if (a != null) {
            return (T)a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Property ");
        sb.append(o.getName());
        sb.append(" should be initialized before get.");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public void b(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final o<?> o2, @org.jetbrains.annotations.e final T a) {
        k0.p(o2, "property");
        k0.p(a, "value");
        this.a = a;
    }
}
