// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001a\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00020\u0005\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0003\u001a\u00028\u0000H\u00c6\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\b\u001a\u00028\u00002\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003R\u0019\u0010\b\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001f\u0010\t\u001a\u00020\u00058\u0006@\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019" }, d2 = { "Lkotlin/time/r;", "T", "", "a", "()Ljava/lang/Object;", "Lkotlin/time/d;", "b", "()J", "value", "duration", "c", "(Ljava/lang/Object;J)Lkotlin/time/r;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "f", "J", "e", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/w;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
@j
public final class r<T>
{
    private final T a;
    private final long b;
    
    private r(final T a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final T a() {
        return this.a;
    }
    
    public final long b() {
        return this.b;
    }
    
    @e
    public final r<T> c(final T t, final long n) {
        return new r<T>(t, n);
    }
    
    public final long e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof r) {
                final r r = (r)o;
                if (k0.g((Object)this.a, (Object)r.a) && this.b == r.b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final T f() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        final T a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        final long b = this.b;
        return hashCode * 31 + (int)(b ^ b >>> 32);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TimedValue(value=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(d.l1(this.b));
        sb.append(")");
        return sb.toString();
    }
}
