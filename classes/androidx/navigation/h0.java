// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import kotlin.jvm.internal.k0;
import androidx.annotation.y;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0017\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n¨\u0006\r" }, d2 = { "Landroidx/navigation/e0;", "", "id", "Landroidx/navigation/a0;", "b", "", "a", "node", "Lkotlin/j2;", "d", "other", "e", "c", "navigation-common-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class h0
{
    public static final boolean a(@e final e0 e0, @y final int n) {
        k0.q((Object)e0, "$this$contains");
        return e0.N(n) != null;
    }
    
    @e
    public static final a0 b(@e final e0 obj, @y final int i) {
        k0.q((Object)obj, "$this$get");
        final a0 n = obj.N(i);
        if (n != null) {
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No destination for ");
        sb.append(i);
        sb.append(" was found in ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final void c(@e final e0 e0, @e final a0 a0) {
        k0.q((Object)e0, "$this$minusAssign");
        k0.q((Object)a0, "node");
        e0.S(a0);
    }
    
    public static final void d(@e final e0 e0, @e final a0 a0) {
        k0.q((Object)e0, "$this$plusAssign");
        k0.q((Object)a0, "node");
        e0.K(a0);
    }
    
    public static final void e(@e final e0 e0, @e final e0 e2) {
        k0.q((Object)e0, "$this$plusAssign");
        k0.q((Object)e2, "other");
        e0.J(e2);
    }
}
