// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.j2;
import kotlin.reflect.o;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.reflect.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B+\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR<\u0010\u000f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \f*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b0\u000b0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006 " }, d2 = { "Lkotlin/reflect/jvm/internal/n;", "T", "V", "Lkotlin/reflect/jvm/internal/s;", "Lkotlin/reflect/l;", "receiver", "value", "Lkotlin/j2;", "d", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/d0$b;", "Lkotlin/reflect/jvm/internal/n$a;", "kotlin.jvm.PlatformType", "U", "Lkotlin/reflect/jvm/internal/d0$b;", "_setter", "x0", "()Lkotlin/reflect/jvm/internal/n$a;", "setter", "Lkotlin/reflect/jvm/internal/k;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/k;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class n<T, V> extends s<T, V> implements l<T, V>
{
    private final d0.b<a<T, V>> U;
    
    public n(@e final k k, @e final String s, @e final String s2, @org.jetbrains.annotations.f final Object o) {
        k0.p(k, "container");
        k0.p(s, "name");
        k0.p(s2, "signature");
        super(k, s, s2, o);
        final d0.b<a<T, V>> b = d0.b((n6.a<a<T, V>>)new n6.a<a<T, V>>() {
            final /* synthetic */ n G;
            
            public final n.a<T, V> a() {
                return (n.a<T, V>)new n.a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Setter(this) }");
        this.U = b;
    }
    
    public n(@e final k k, @e final q0 q0) {
        k0.p(k, "container");
        k0.p(q0, "descriptor");
        super(k, q0);
        final d0.b<a<T, V>> b = d0.b((n6.a<a<T, V>>)new n6.a<a<T, V>>() {
            final /* synthetic */ n G;
            
            public final n.a<T, V> a() {
                return (n.a<T, V>)new n.a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Setter(this) }");
        this.U = b;
    }
    
    @Override
    public void d(final T t, final V v) {
        this.x0().call(t, v);
    }
    
    @e
    public a<T, V> x0() {
        final a<T, V> invoke = this.U.invoke();
        k0.o(invoke, "_setter()");
        return invoke;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "kotlin/reflect/jvm/internal/n$a", "T", "V", "Lkotlin/reflect/jvm/internal/u$d;", "Lkotlin/reflect/l$a;", "receiver", "value", "Lkotlin/j2;", "s0", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/n;", "N", "Lkotlin/reflect/jvm/internal/n;", "r0", "()Lkotlin/reflect/jvm/internal/n;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/n;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class a<T, V> extends d<V> implements kotlin.reflect.l.a<T, V>
    {
        @e
        private final n<T, V> N;
        
        public a(@e final n<T, V> n) {
            k0.p(n, "property");
            this.N = n;
        }
        
        @e
        public n<T, V> r0() {
            return this.N;
        }
        
        public void s0(final T t, final V v) {
            this.r0().d(t, v);
        }
    }
}
