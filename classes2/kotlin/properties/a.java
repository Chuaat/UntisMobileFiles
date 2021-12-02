// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.properties;

import kotlin.jvm.internal.k0;
import kotlin.j2;
import kotlin.reflect.o;
import n6.q;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0001J\u0082\u0001\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0005\u001a\u00028\u00002Q\b\u0004\u0010\u000e\u001aK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006H\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0082\u0001\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0005\u001a\u00028\u00002Q\b\u0004\u0010\u000e\u001aK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00110\u0006H\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015" }, d2 = { "Lkotlin/properties/a;", "", "T", "Lkotlin/properties/f;", "a", "initialValue", "Lkotlin/Function3;", "Lkotlin/reflect/o;", "Lkotlin/t0;", "name", "property", "oldValue", "newValue", "Lkotlin/j2;", "onChange", "b", "(Ljava/lang/Object;Ln6/q;)Lkotlin/properties/f;", "", "c", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @e
    public static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    @e
    public final <T> f<Object, T> a() {
        return new b<T>();
    }
    
    @e
    public final <T> f<Object, T> b(final T t, @e final q<? super o<?>, ? super T, ? super T, j2> q) {
        k0.p(q, "onChange");
        return new c<T>() {
            @Override
            protected void c(@org.jetbrains.annotations.e final o<?> o, final T t, final T t2) {
                k0.p(o, "property");
                q.invoke(o, t, t2);
            }
        };
    }
    
    @e
    public final <T> f<Object, T> c(final T t, @e final q<? super o<?>, ? super T, ? super T, Boolean> q) {
        k0.p(q, "onChange");
        return new c<T>() {
            @Override
            protected boolean d(@org.jetbrains.annotations.e final o<?> o, final T t, final T t2) {
                k0.p(o, "property");
                return q.invoke(o, t, t2);
            }
        };
    }
}
