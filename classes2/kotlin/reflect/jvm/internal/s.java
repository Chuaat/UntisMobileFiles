// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.g0;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.lang.reflect.Field;
import kotlin.b0;
import kotlin.Metadata;
import kotlin.reflect.q;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001#B\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB+\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\"J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0018\u0010\n\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u0007R<\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \r*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f0\f0\u000b8\b@\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0016¨\u0006$" }, d2 = { "Lkotlin/reflect/jvm/internal/s;", "T", "V", "Lkotlin/reflect/q;", "Lkotlin/reflect/jvm/internal/u;", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "o", "invoke", "Lkotlin/reflect/jvm/internal/d0$b;", "Lkotlin/reflect/jvm/internal/s$a;", "kotlin.jvm.PlatformType", "S", "Lkotlin/reflect/jvm/internal/d0$b;", "_getter", "w0", "()Lkotlin/reflect/jvm/internal/s$a;", "getter", "Lkotlin/b0;", "Ljava/lang/reflect/Field;", "Lkotlin/b0;", "delegateField", "Lkotlin/reflect/jvm/internal/k;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/k;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public class s<T, V> extends u<V> implements q<T, V>
{
    private final d0.b<a<T, V>> S;
    private final b0<Field> T;
    
    public s(@e final k k, @e final String s, @e final String s2, @org.jetbrains.annotations.f final Object o) {
        k0.p(k, "container");
        k0.p(s, "name");
        k0.p(s2, "signature");
        super(k, s, s2, o);
        final d0.b<a<T, V>> b = d0.b((n6.a<a<T, V>>)new n6.a<a<T, ? extends V>>() {
            final /* synthetic */ s G;
            
            public final s.a<T, V> a() {
                return (s.a<T, V>)new s.a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Getter(this) }");
        this.S = b;
        this.T = kotlin.d0.b(g0.H, (n6.a<? extends Field>)new n6.a<Field>() {
            final /* synthetic */ s G;
            
            @org.jetbrains.annotations.f
            public final Field a() {
                return this.G.p0();
            }
        });
    }
    
    public s(@e final k k, @e final q0 q0) {
        k0.p(k, "container");
        k0.p(q0, "descriptor");
        super(k, q0);
        final d0.b<a<T, V>> b = d0.b((n6.a<a<T, V>>)new n6.a<a<T, ? extends V>>() {
            final /* synthetic */ s G;
            
            public final s.a<T, V> a() {
                return (s.a<T, V>)new s.a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Getter(this) }");
        this.S = b;
        this.T = kotlin.d0.b(g0.H, (n6.a<? extends Field>)new n6.a<Field>() {
            final /* synthetic */ s G;
            
            @org.jetbrains.annotations.f
            public final Field a() {
                return this.G.p0();
            }
        });
    }
    
    @Override
    public V get(final T t) {
        return (V)this.w0().call(t);
    }
    
    @Override
    public V invoke(final T t) {
        return this.get(t);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object o(final T t) {
        return this.r0(this.T.getValue(), t);
    }
    
    @e
    public a<T, V> w0() {
        final a<T, V> invoke = this.S.invoke();
        k0.o(invoke, "_getter()");
        return invoke;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010" }, d2 = { "kotlin/reflect/jvm/internal/s$a", "T", "V", "Lkotlin/reflect/jvm/internal/u$c;", "Lkotlin/reflect/q$a;", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/s;", "N", "Lkotlin/reflect/jvm/internal/s;", "r0", "()Lkotlin/reflect/jvm/internal/s;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/s;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class a<T, V> extends u.c<V> implements q.a<T, V>
    {
        @e
        private final s<T, V> N;
        
        public a(@e final s<T, ? extends V> n) {
            k0.p(n, "property");
            this.N = (s<T, V>)n;
        }
        
        @Override
        public V invoke(final T t) {
            return this.r0().get(t);
        }
        
        @e
        public s<T, V> r0() {
            return this.N;
        }
    }
}
