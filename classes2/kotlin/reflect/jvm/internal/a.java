// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.j2;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "Lkotlin/reflect/jvm/internal/a;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/l;", "Lkotlin/reflect/jvm/internal/f;", "Lkotlin/j2;", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/j2;)Lkotlin/reflect/jvm/internal/f;", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/j2;)Lkotlin/reflect/jvm/internal/f;", "Lkotlin/reflect/jvm/internal/k;", "a", "Lkotlin/reflect/jvm/internal/k;", "container", "<init>", "(Lkotlin/reflect/jvm/internal/k;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public class a extends l<f<?>, j2>
{
    private final k a;
    
    public a(@e final k a) {
        k0.p(a, "container");
        this.a = a;
    }
    
    @e
    public f<?> p(@e final y y, @e final j2 j2) {
        k0.p(y, "descriptor");
        k0.p(j2, "data");
        return new kotlin.reflect.jvm.internal.l(this.a, y);
    }
    
    @e
    public f<?> q(@e final q0 obj, @e final j2 j2) {
        k0.p(obj, "descriptor");
        k0.p(j2, "data");
        final t0 j3 = obj.j0();
        int n = 0;
        int n2;
        if (j3 != null) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (obj.q0() != null) {
            n = 1;
        }
        final int n3 = n2 + n;
        if (obj.n0()) {
            if (n3 == 0) {
                return new m<Object>(this.a, obj);
            }
            if (n3 == 1) {
                return new n<Object, Object>(this.a, obj);
            }
            if (n3 == 2) {
                return new kotlin.reflect.jvm.internal.o<Object, Object, Object>(this.a, obj);
            }
        }
        else {
            if (n3 == 0) {
                return new r<Object>(this.a, obj);
            }
            if (n3 == 1) {
                return new s<Object, Object>(this.a, obj);
            }
            if (n3 == 2) {
                return new t<Object, Object, Object>(this.a, obj);
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unsupported property: ");
        sb.append(obj);
        throw new b0(sb.toString());
    }
}
