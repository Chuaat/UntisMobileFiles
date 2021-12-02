// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.c;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import java.util.Collection;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00158V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b" }, d2 = { "Lkotlin/reflect/jvm/internal/b;", "Lkotlin/reflect/jvm/internal/k;", "", "f0", "Lkotlin/reflect/jvm/internal/impl/name/e;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "U", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "P", "", "index", "Q", "Lkotlin/reflect/c;", "x", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "O", "constructorDescriptors", "Ljava/lang/Class;", "m", "()Ljava/lang/Class;", "jClass", "<init>", "()V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class b extends k
{
    @e
    public static final b J;
    
    static {
        J = new b();
    }
    
    private b() {
    }
    
    private final Void f0() {
        throw new b0("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }
    
    @e
    @Override
    public Collection<l> O() {
        this.f0();
        throw null;
    }
    
    @e
    @Override
    public Collection<y> P(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p(e, "name");
        this.f0();
        throw null;
    }
    
    @f
    @Override
    public q0 Q(final int n) {
        return null;
    }
    
    @e
    @Override
    public Collection<q0> U(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p(e, "name");
        this.f0();
        throw null;
    }
    
    @e
    @Override
    public Class<?> m() {
        this.f0();
        throw null;
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.c<?>> x() {
        this.f0();
        throw null;
    }
}
