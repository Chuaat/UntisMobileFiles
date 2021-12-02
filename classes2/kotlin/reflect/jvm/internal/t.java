// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import org.jetbrains.annotations.f;
import kotlin.g0;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.lang.reflect.Field;
import kotlin.b0;
import kotlin.Metadata;
import kotlin.reflect.r;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001%B\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B!\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b\u001f\u0010$J\u001f\u0010\b\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\tJ \u0010\f\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\tRH\u0010\u0012\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \u000f*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000e0\u000e0\r8\b@\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R(\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006&" }, d2 = { "Lkotlin/reflect/jvm/internal/t;", "D", "E", "V", "Lkotlin/reflect/r;", "Lkotlin/reflect/jvm/internal/u;", "receiver1", "receiver2", "W", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "c0", "invoke", "Lkotlin/reflect/jvm/internal/d0$b;", "Lkotlin/reflect/jvm/internal/t$a;", "kotlin.jvm.PlatformType", "S", "Lkotlin/reflect/jvm/internal/d0$b;", "_getter", "w0", "()Lkotlin/reflect/jvm/internal/t$a;", "getter", "Lkotlin/b0;", "Ljava/lang/reflect/Field;", "T", "Lkotlin/b0;", "delegateField", "Lkotlin/reflect/jvm/internal/k;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/k;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/k;Ljava/lang/String;Ljava/lang/String;)V", "a", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public class t<D, E, V> extends u<V> implements r<D, E, V>
{
    private final d0.b<a<D, E, V>> S;
    private final b0<Field> T;
    
    public t(@e final k k, @e final String s, @e final String s2) {
        k0.p(k, "container");
        k0.p(s, "name");
        k0.p(s2, "signature");
        super(k, s, s2, q.NO_RECEIVER);
        final d0.b<a<D, E, V>> b = d0.b((n6.a<a<D, E, V>>)new n6.a<a<D, E, ? extends V>>() {
            final /* synthetic */ t G;
            
            public final a<D, E, V> a() {
                return (a<D, E, V>)new a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Getter(this) }");
        this.S = b;
        this.T = kotlin.d0.b(g0.H, (n6.a<? extends Field>)new n6.a<Field>() {
            final /* synthetic */ t G;
            
            @org.jetbrains.annotations.f
            public final Field a() {
                return this.G.p0();
            }
        });
    }
    
    public t(@e final k k, @e final q0 q0) {
        k0.p(k, "container");
        k0.p(q0, "descriptor");
        super(k, q0);
        final d0.b<a<D, E, V>> b = d0.b((n6.a<a<D, E, V>>)new n6.a<a<D, E, ? extends V>>() {
            final /* synthetic */ t G;
            
            public final a<D, E, V> a() {
                return (a<D, E, V>)new a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Getter(this) }");
        this.S = b;
        this.T = kotlin.d0.b(g0.H, (n6.a<? extends Field>)new n6.a<Field>() {
            final /* synthetic */ t G;
            
            @org.jetbrains.annotations.f
            public final Field a() {
                return this.G.p0();
            }
        });
    }
    
    @Override
    public V W(final D n, final E e) {
        return (V)this.w0().call(n, e);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c0(final D n, final E e) {
        return this.r0(this.T.getValue(), n);
    }
    
    @Override
    public V invoke(final D n, final E e) {
        return this.W(n, e);
    }
    
    @e
    public a<D, E, V> w0() {
        final a<D, E, V> invoke = this.S.invoke();
        k0.o(invoke, "_getter()");
        return invoke;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00028\u00052\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR.\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "kotlin/reflect/jvm/internal/t$a", "D", "E", "V", "Lkotlin/reflect/jvm/internal/u$c;", "Lkotlin/reflect/r$a;", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/t;", "N", "Lkotlin/reflect/jvm/internal/t;", "r0", "()Lkotlin/reflect/jvm/internal/t;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/t;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class a<D, E, V> extends u.c<V> implements r.a<D, E, V>
    {
        @e
        private final t<D, E, V> N;
        
        public a(@e final t<D, E, ? extends V> n) {
            k0.p(n, "property");
            this.N = (t<D, E, V>)n;
        }
        
        @Override
        public V invoke(final D n, final E e) {
            return this.r0().W(n, e);
        }
        
        @e
        public t<D, E, V> r0() {
            return this.N;
        }
    }
}
