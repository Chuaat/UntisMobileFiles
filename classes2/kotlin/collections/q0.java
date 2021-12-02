// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0005\u001a\u00028\u0000H\u00c6\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00028\u0000H\u00c6\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003R\u0019\u0010\u0007\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0018" }, d2 = { "Lkotlin/collections/q0;", "T", "", "", "a", "b", "()Ljava/lang/Object;", "index", "value", "c", "(ILjava/lang/Object;)Lkotlin/collections/q0;", "", "toString", "hashCode", "other", "", "equals", "I", "e", "()I", "Ljava/lang/Object;", "f", "<init>", "(ILjava/lang/Object;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class q0<T>
{
    private final int a;
    private final T b;
    
    public q0(final int a, final T b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final T b() {
        return this.b;
    }
    
    @e
    public final q0<T> c(final int n, final T t) {
        return new q0<T>(n, t);
    }
    
    public final int e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof q0) {
                final q0 q0 = (q0)o;
                if (this.a == q0.a && k0.g(this.b, q0.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final T f() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final int a = this.a;
        final T b = this.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return a * 31 + hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("IndexedValue(index=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
