// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import java.lang.reflect.Type;
import kotlin.reflect.s;
import kotlin.jvm.internal.m0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import n6.a;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.e;
import kotlin.reflect.o;
import kotlin.Metadata;
import kotlin.reflect.n;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\n\u0010%\u001a\u0006\u0012\u0002\b\u00030 \u0012\u0006\u00101\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001702¢\u0006\u0004\b4\u00105J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\u0006\u0012\u0002\b\u00030 8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u000fR#\u0010-\u001a\b\u0012\u0004\u0012\u00020)0(8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010,R\u001c\u00101\u001a\u00020\u00068\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u00100¨\u00066" }, d2 = { "Lkotlin/reflect/jvm/internal/q;", "Lkotlin/reflect/n;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/s;", "a", "()Lkotlin/reflect/s;", "type", "l", "()Z", "isVararg", "Lkotlin/reflect/n$b;", "K", "Lkotlin/reflect/n$b;", "n", "()Lkotlin/reflect/n$b;", "kind", "Lkotlin/reflect/jvm/internal/impl/descriptors/n0;", "G", "Lkotlin/reflect/jvm/internal/d0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/jvm/internal/f;", "I", "Lkotlin/reflect/jvm/internal/f;", "r", "()Lkotlin/reflect/jvm/internal/f;", "callable", "Z", "isOptional", "", "", "H", "getAnnotations", "()Ljava/util/List;", "annotations", "J", "i", "()I", "index", "Lkotlin/Function0;", "computeDescriptor", "<init>", "(Lkotlin/reflect/jvm/internal/f;ILkotlin/reflect/n$b;Ln6/a;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class q implements n
{
    static final /* synthetic */ o[] L;
    private final d0.a G;
    @e
    private final d0.a H;
    @e
    private final f<?> I;
    private final int J;
    @e
    private final b K;
    
    static {
        L = new o[] { k1.r(new f1(k1.d(q.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), k1.r(new f1(k1.d(q.class), "annotations", "getAnnotations()Ljava/util/List;")) };
    }
    
    public q(@e final f<?> i, final int j, @e final b k, @e final n6.a<? extends n0> a) {
        k0.p(i, "callable");
        k0.p(k, "kind");
        k0.p(a, "computeDescriptor");
        this.I = i;
        this.J = j;
        this.K = k;
        this.G = (d0.a)d0.d((n6.a<Object>)a);
        this.H = (d0.a)d0.d((n6.a<Object>)new n6.a<List<? extends Annotation>>() {
            public final List<Annotation> a() {
                return kotlin.reflect.jvm.internal.k0.d(q.this.v());
            }
        });
    }
    
    private final n0 v() {
        return (n0)((d0.c)this.G).b(this, q.L[0]);
    }
    
    @Override
    public boolean Z() {
        n0 v;
        if (!((v = this.v()) instanceof kotlin.reflect.jvm.internal.impl.descriptors.e1)) {
            v = null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e1 e1 = (kotlin.reflect.jvm.internal.impl.descriptors.e1)v;
        return e1 != null && kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.a(e1);
    }
    
    @e
    @Override
    public s a() {
        final c0 a = this.v().a();
        k0.o(a, "descriptor.type");
        return new x(a, new n6.a<Type>() {
            final /* synthetic */ q G;
            
            @e
            public final Type a() {
                final n0 m = q.this.v();
                Type n;
                if (m instanceof t0 && k0.g(kotlin.reflect.jvm.internal.k0.g(this.G.r().l0()), m) && this.G.r().l0().n() == kotlin.reflect.jvm.internal.impl.descriptors.b.a.H) {
                    final m c = this.G.r().l0().c();
                    Objects.requireNonNull(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    n = kotlin.reflect.jvm.internal.k0.n((kotlin.reflect.jvm.internal.impl.descriptors.e)c);
                    if (n == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Cannot determine receiver Java type of inherited declaration: ");
                        sb.append(m);
                        throw new b0(sb.toString());
                    }
                }
                else {
                    n = this.G.r().i0().a().get(this.G.i());
                }
                return n;
            }
        });
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        if (o instanceof q) {
            final f<?> i = this.I;
            final q q = (q)o;
            if (k0.g(i, q.I) && this.i() == q.i()) {
                return true;
            }
        }
        return false;
    }
    
    @e
    @Override
    public List<Annotation> getAnnotations() {
        return (List<Annotation>)((d0.c)this.H).b(this, q.L[1]);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public String getName() {
        n0 v = this.v();
        final boolean b = v instanceof kotlin.reflect.jvm.internal.impl.descriptors.e1;
        final String s = null;
        if (!b) {
            v = null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e1 e1 = (kotlin.reflect.jvm.internal.impl.descriptors.e1)v;
        String d = s;
        if (e1 != null) {
            if (e1.c().K()) {
                return null;
            }
            final kotlin.reflect.jvm.internal.impl.name.e name = e1.getName();
            k0.o(name, "valueParameter.name");
            if (name.j()) {
                d = s;
            }
            else {
                d = name.d();
            }
        }
        return d;
    }
    
    @Override
    public int hashCode() {
        return this.I.hashCode() * 31 + Integer.valueOf(this.i()).hashCode();
    }
    
    @Override
    public int i() {
        return this.J;
    }
    
    @Override
    public boolean l() {
        final n0 v = this.v();
        return v instanceof kotlin.reflect.jvm.internal.impl.descriptors.e1 && ((kotlin.reflect.jvm.internal.impl.descriptors.e1)v).p0() != null;
    }
    
    @e
    @Override
    public b n() {
        return this.K;
    }
    
    @e
    public final f<?> r() {
        return this.I;
    }
    
    @e
    @Override
    public String toString() {
        return g0.b.f(this);
    }
}
