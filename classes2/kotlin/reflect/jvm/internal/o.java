// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.j2;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.reflect.m;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001eJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bRH\u0010\u0011\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \u000e*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r0\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R(\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006 " }, d2 = { "Lkotlin/reflect/jvm/internal/o;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/t;", "Lkotlin/reflect/m;", "receiver1", "receiver2", "value", "Lkotlin/j2;", "y", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/d0$b;", "Lkotlin/reflect/jvm/internal/o$a;", "kotlin.jvm.PlatformType", "U", "Lkotlin/reflect/jvm/internal/d0$b;", "_setter", "x0", "()Lkotlin/reflect/jvm/internal/o$a;", "setter", "Lkotlin/reflect/jvm/internal/k;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/k;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/k;Ljava/lang/String;Ljava/lang/String;)V", "a", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class o<D, E, V> extends t<D, E, V> implements m<D, E, V>
{
    private final d0.b<a<D, E, V>> U;
    
    public o(@e final k k, @e final String s, @e final String s2) {
        k0.p(k, "container");
        k0.p(s, "name");
        k0.p(s2, "signature");
        super(k, s, s2);
        final d0.b<a<D, E, V>> b = d0.b((n6.a<a<D, E, V>>)new n6.a<a<D, E, V>>() {
            final /* synthetic */ o G;
            
            public final o.a<D, E, V> a() {
                return (o.a<D, E, V>)new o.a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Setter(this) }");
        this.U = b;
    }
    
    public o(@e final k k, @e final q0 q0) {
        k0.p(k, "container");
        k0.p(q0, "descriptor");
        super(k, q0);
        final d0.b<a<D, E, V>> b = d0.b((n6.a<a<D, E, V>>)new n6.a<a<D, E, V>>() {
            final /* synthetic */ o G;
            
            public final o.a<D, E, V> a() {
                return (o.a<D, E, V>)new o.a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Setter(this) }");
        this.U = b;
    }
    
    @e
    public a<D, E, V> x0() {
        final a<D, E, V> invoke = this.U.invoke();
        k0.o(invoke, "_setter()");
        return invoke;
    }
    
    @Override
    public void y(final D n, final E e, final V v) {
        this.x0().call(n, e, v);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u00042\u0006\u0010\b\u001a\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014" }, d2 = { "kotlin/reflect/jvm/internal/o$a", "D", "E", "V", "Lkotlin/reflect/jvm/internal/u$d;", "Lkotlin/reflect/m$a;", "receiver1", "receiver2", "value", "Lkotlin/j2;", "s0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/o;", "N", "Lkotlin/reflect/jvm/internal/o;", "r0", "()Lkotlin/reflect/jvm/internal/o;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/o;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class a<D, E, V> extends d<V> implements m.a<D, E, V>
    {
        @e
        private final o<D, E, V> N;
        
        public a(@e final o<D, E, V> n) {
            k0.p(n, "property");
            this.N = n;
        }
        
        @e
        public o<D, E, V> r0() {
            return this.N;
        }
        
        public void s0(final D n, final E e, final V v) {
            this.r0().y(n, e, v);
        }
    }
}
