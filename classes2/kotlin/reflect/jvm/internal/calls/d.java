// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.calls;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import java.lang.reflect.Member;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0003J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00028\u00008&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016" }, d2 = { "Lkotlin/reflect/jvm/internal/calls/d;", "Ljava/lang/reflect/Member;", "M", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/j2;", "checkArguments", "([Ljava/lang/Object;)V", "b", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "a", "()Ljava/util/List;", "parameterTypes", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public interface d<M extends Member>
{
    @e
    List<Type> a();
    
    M b();
    
    @f
    Object call(@e final Object[] p0);
    
    @e
    Type getReturnType();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 1 })
    public static final class a
    {
        public static <M extends Member> void a(@e final d<? extends M> d, @e final Object[] array) {
            k0.p(array, "args");
            if (kotlin.reflect.jvm.internal.calls.f.a(d) == array.length) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Callable expects ");
            sb.append(kotlin.reflect.jvm.internal.calls.f.a(d));
            sb.append(" arguments, but ");
            sb.append(array.length);
            sb.append(" were provided.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
