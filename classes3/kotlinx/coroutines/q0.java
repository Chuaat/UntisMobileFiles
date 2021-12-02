// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g$c;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.coroutines.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00042\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u00d6\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014" }, d2 = { "Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/a;", "", "toString", "H", "name", "J", "", "hashCode", "", "other", "", "equals", "G", "Ljava/lang/String;", "L", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "a", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class q0 extends kotlin.coroutines.a
{
    @e
    public static final a H;
    @e
    private final String G;
    
    static {
        H = new a(null);
    }
    
    public q0(@e final String g) {
        super((g$c)q0.H);
        this.G = g;
    }
    
    @e
    public final String H() {
        return this.G;
    }
    
    @e
    public final q0 J(@e final String s) {
        return new q0(s);
    }
    
    @e
    public final String L() {
        return this.G;
    }
    
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof q0 && k0.g((Object)this.G, (Object)((q0)o).G));
    }
    
    public int hashCode() {
        final String g = this.G;
        int hashCode;
        if (g != null) {
            hashCode = g.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @e
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CoroutineName(");
        sb.append(this.G);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "kotlinx/coroutines/q0$a", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/q0;", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class a implements g$c<q0>
    {
        private a() {
        }
    }
}
