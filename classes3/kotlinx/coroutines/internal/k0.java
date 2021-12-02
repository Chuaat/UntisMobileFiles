// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e" }, d2 = { "Lkotlinx/coroutines/internal/k0;", "", "", "toString", "T", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "symbol", "<init>", "(Ljava/lang/String;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class k0
{
    @e
    private final String a;
    
    public k0(@e final String a) {
        this.a = a;
    }
    
    @e
    public final String a() {
        return this.a;
    }
    
    public final <T> T b(@f final Object o) {
        Object o2 = o;
        if (o == this) {
            o2 = null;
        }
        return (T)o2;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('<');
        sb.append(this.a);
        sb.append('>');
        return sb.toString();
    }
}
