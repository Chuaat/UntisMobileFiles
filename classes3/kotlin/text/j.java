// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.ranges.k;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "Lkotlin/text/j;", "", "", "a", "Lkotlin/ranges/k;", "b", "value", "range", "c", "toString", "", "hashCode", "other", "", "equals", "Lkotlin/ranges/k;", "e", "()Lkotlin/ranges/k;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;Lkotlin/ranges/k;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class j
{
    @e
    private final String a;
    @e
    private final k b;
    
    public j(@e final String a, @e final k b) {
        k0.p((Object)a, "value");
        k0.p((Object)b, "range");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final String a() {
        return this.a;
    }
    
    @e
    public final k b() {
        return this.b;
    }
    
    @e
    public final j c(@e final String s, @e final k k) {
        k0.p((Object)s, "value");
        k0.p((Object)k, "range");
        return new j(s, k);
    }
    
    @e
    public final k e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof j) {
                final j j = (j)o;
                if (k0.g((Object)this.a, (Object)j.a) && k0.g((Object)this.b, (Object)j.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    public final String f() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final k b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MatchGroup(value=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
