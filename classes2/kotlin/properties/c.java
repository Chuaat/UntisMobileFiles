// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.properties;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.o;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0011\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0018" }, d2 = { "Lkotlin/properties/c;", "V", "Lkotlin/properties/f;", "", "Lkotlin/reflect/o;", "property", "oldValue", "newValue", "", "d", "(Lkotlin/reflect/o;Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlin/j2;", "c", "(Lkotlin/reflect/o;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "a", "(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V", "Ljava/lang/Object;", "initialValue", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public abstract class c<V> implements f<Object, V>
{
    private V a;
    
    public c(final V a) {
        this.a = a;
    }
    
    @Override
    public V a(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final o<?> o2) {
        k0.p(o2, "property");
        return this.a;
    }
    
    @Override
    public void b(@org.jetbrains.annotations.f Object a, @org.jetbrains.annotations.e final o<?> o, final V a2) {
        k0.p(o, "property");
        a = this.a;
        if (!this.d(o, a, a2)) {
            return;
        }
        this.c(o, a, this.a = a2);
    }
    
    protected void c(@org.jetbrains.annotations.e final o<?> o, final V v, final V v2) {
        k0.p(o, "property");
    }
    
    protected boolean d(@org.jetbrains.annotations.e final o<?> o, final V v, final V v2) {
        k0.p(o, "property");
        return true;
    }
}
