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
import kotlin.reflect.k;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B+\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0015\u0010\u001cJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR0\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \r*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\b0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u001e" }, d2 = { "Lkotlin/reflect/jvm/internal/m;", "V", "Lkotlin/reflect/jvm/internal/r;", "Lkotlin/reflect/k;", "value", "Lkotlin/j2;", "set", "(Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/m$a;", "x0", "()Lkotlin/reflect/jvm/internal/m$a;", "setter", "Lkotlin/reflect/jvm/internal/d0$b;", "kotlin.jvm.PlatformType", "U", "Lkotlin/reflect/jvm/internal/d0$b;", "_setter", "Lkotlin/reflect/jvm/internal/k;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/k;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class m<V> extends r<V> implements k<V>
{
    private final d0.b<a<V>> U;
    
    public m(@e final kotlin.reflect.jvm.internal.k k, @e final String s, @e final String s2, @org.jetbrains.annotations.f final Object o) {
        k0.p(k, "container");
        k0.p(s, "name");
        k0.p(s2, "signature");
        super(k, s, s2, o);
        final d0.b<a<V>> b = d0.b((n6.a<a<V>>)new n6.a<a<V>>() {
            final /* synthetic */ m G;
            
            public final m.a<V> a() {
                return (m.a<V>)new m.a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Setter(this) }");
        this.U = b;
    }
    
    public m(@e final kotlin.reflect.jvm.internal.k k, @e final q0 q0) {
        k0.p(k, "container");
        k0.p(q0, "descriptor");
        super(k, q0);
        final d0.b<a<V>> b = d0.b((n6.a<a<V>>)new n6.a<a<V>>() {
            final /* synthetic */ m G;
            
            public final m.a<V> a() {
                return (m.a<V>)new m.a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Setter(this) }");
        this.U = b;
    }
    
    @Override
    public void set(final V v) {
        this.x0().call(v);
    }
    
    @e
    public a<V> x0() {
        final a<V> invoke = this.U.invoke();
        k0.o(invoke, "_setter()");
        return invoke;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010" }, d2 = { "kotlin/reflect/jvm/internal/m$a", "R", "Lkotlin/reflect/jvm/internal/u$d;", "Lkotlin/reflect/k$a;", "value", "Lkotlin/j2;", "s0", "(Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/m;", "N", "Lkotlin/reflect/jvm/internal/m;", "r0", "()Lkotlin/reflect/jvm/internal/m;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/m;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class a<R> extends d<R> implements k.a<R>
    {
        @e
        private final m<R> N;
        
        public a(@e final m<R> n) {
            k0.p(n, "property");
            this.N = n;
        }
        
        @e
        public m<R> r0() {
            return this.N;
        }
        
        public void s0(final R r) {
            this.r0().set(r);
        }
    }
}
