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
import kotlin.b0;
import kotlin.Metadata;
import kotlin.reflect.p;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001!B\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB+\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010 J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\u0005R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR0\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u000f*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e0\u000e0\r8\b@\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\"" }, d2 = { "Lkotlin/reflect/jvm/internal/r;", "V", "Lkotlin/reflect/p;", "Lkotlin/reflect/jvm/internal/u;", "get", "()Ljava/lang/Object;", "", "f", "invoke", "Lkotlin/b0;", "T", "Lkotlin/b0;", "delegateFieldValue", "Lkotlin/reflect/jvm/internal/d0$b;", "Lkotlin/reflect/jvm/internal/r$a;", "kotlin.jvm.PlatformType", "S", "Lkotlin/reflect/jvm/internal/d0$b;", "_getter", "w0", "()Lkotlin/reflect/jvm/internal/r$a;", "getter", "Lkotlin/reflect/jvm/internal/k;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/k;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public class r<V> extends u<V> implements p<V>
{
    private final d0.b<a<V>> S;
    private final b0<Object> T;
    
    public r(@e final k k, @e final String s, @e final String s2, @org.jetbrains.annotations.f final Object o) {
        k0.p(k, "container");
        k0.p(s, "name");
        k0.p(s2, "signature");
        super(k, s, s2, o);
        final d0.b<a<V>> b = d0.b((n6.a<a<V>>)new n6.a<a<? extends V>>() {
            final /* synthetic */ r G;
            
            public final r.a<V> a() {
                return (r.a<V>)new r.a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Getter(this) }");
        this.S = b;
        this.T = kotlin.d0.b(g0.H, (n6.a<?>)new n6.a<Object>() {
            final /* synthetic */ r G;
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke() {
                final r g = this.G;
                return g.r0(g.p0(), this.G.q0());
            }
        });
    }
    
    public r(@e final k k, @e final q0 q0) {
        k0.p(k, "container");
        k0.p(q0, "descriptor");
        super(k, q0);
        final d0.b<a<V>> b = d0.b((n6.a<a<V>>)new n6.a<a<? extends V>>() {
            final /* synthetic */ r G;
            
            public final r.a<V> a() {
                return (r.a<V>)new r.a(this.G);
            }
        });
        k0.o(b, "ReflectProperties.lazy { Getter(this) }");
        this.S = b;
        this.T = kotlin.d0.b(g0.H, (n6.a<?>)new n6.a<Object>() {
            final /* synthetic */ r G;
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke() {
                final r g = this.G;
                return g.r0(g.p0(), this.G.q0());
            }
        });
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object f() {
        return this.T.getValue();
    }
    
    @Override
    public V get() {
        return (V)this.w0().call(new Object[0]);
    }
    
    @Override
    public V invoke() {
        return this.get();
    }
    
    @e
    public a<V> w0() {
        final a<V> invoke = this.S.invoke();
        k0.o(invoke, "_getter()");
        return invoke;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e" }, d2 = { "kotlin/reflect/jvm/internal/r$a", "R", "Lkotlin/reflect/jvm/internal/u$c;", "Lkotlin/reflect/p$a;", "invoke", "()Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/r;", "N", "Lkotlin/reflect/jvm/internal/r;", "r0", "()Lkotlin/reflect/jvm/internal/r;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/r;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class a<R> extends u.c<R> implements p.a<R>
    {
        @e
        private final r<R> N;
        
        public a(@e final r<? extends R> n) {
            k0.p(n, "property");
            this.N = (r<R>)n;
        }
        
        @Override
        public R invoke() {
            return this.r0().get();
        }
        
        @e
        public r<R> r0() {
            return this.N;
        }
    }
}
