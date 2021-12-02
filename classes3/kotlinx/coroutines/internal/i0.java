// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import m6.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u0004H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u00d6\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0010\u001a\u00020\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0015\u001a\u00028\u00008F@\u0006¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b" }, d2 = { "Lkotlinx/coroutines/internal/i0;", "Lkotlinx/coroutines/internal/h0;", "S", "", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "h", "(Ljava/lang/Object;)Z", "isClosed", "f", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/h0;", "getSegment$annotations", "()V", "segment", "a", "Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@e
public final class i0<S extends h0<S>>
{
    private final Object a = a;
    
    @org.jetbrains.annotations.e
    public static Object b(@f final Object o) {
        return o;
    }
    
    public static boolean c(final Object o, final Object o2) {
        return o2 instanceof i0 && k0.g(o, ((i0)o2).j());
    }
    
    public static final boolean d(final Object o, final Object o2) {
        return k0.g(o, o2);
    }
    
    @org.jetbrains.annotations.e
    public static final S f(final Object obj) {
        if (obj != kotlinx.coroutines.internal.f.b()) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type S");
            return (S)obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }
    
    public static int g(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    public static final boolean h(final Object o) {
        return o == kotlinx.coroutines.internal.f.b();
    }
    
    public static String i(final Object obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("SegmentOrClosed(value=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public boolean equals(final Object o) {
        return c(this.a, o);
    }
    
    @Override
    public int hashCode() {
        return g(this.a);
    }
    
    public final /* synthetic */ Object j() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return i(this.a);
    }
}
