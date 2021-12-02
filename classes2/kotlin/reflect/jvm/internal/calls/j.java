// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.calls;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import java.lang.reflect.Member;
import kotlin.collections.v;
import java.lang.reflect.Type;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u00c0\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\t8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "Lkotlin/reflect/jvm/internal/calls/j;", "Lkotlin/reflect/jvm/internal/calls/d;", "", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;", "parameterTypes", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "c", "()Ljava/lang/Void;", "member", "<init>", "()V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class j implements d
{
    @e
    public static final j a;
    
    static {
        a = new j();
    }
    
    private j() {
    }
    
    @e
    @Override
    public List<Type> a() {
        return v.E();
    }
    
    @f
    public Void c() {
        return null;
    }
    
    @f
    @Override
    public Object call(@e final Object[] array) {
        k0.p(array, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }
    
    @e
    @Override
    public Type getReturnType() {
        final Class<Void> type = Void.TYPE;
        k0.o(type, "Void.TYPE");
        return type;
    }
}
