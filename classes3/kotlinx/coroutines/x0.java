// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import kotlinx.coroutines.internal.j;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001a\u0010\b\u001a\u00020\u0001*\u00020\u00038@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t" }, d2 = { "Lkotlin/coroutines/d;", "", "c", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class x0
{
    @e
    public static final String a(@e final Object o) {
        return o.getClass().getSimpleName();
    }
    
    @e
    public static final String b(@e final Object o) {
        return Integer.toHexString(System.identityHashCode(o));
    }
    
    @e
    public static final String c(@e final d<?> obj) {
        String string;
        if (obj instanceof j) {
            string = obj.toString();
        }
        else {
            Object o = null;
            try {
                final b1$a h = b1.H;
                final StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append('@');
                sb.append(b(obj));
                b1.b((Object)sb.toString());
            }
            finally {
                final b1$a h2 = b1.H;
                final Throwable t;
                o = b1.b(c1.a(t));
            }
            if (b1.e(o) != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(obj.getClass().getName());
                sb2.append('@');
                sb2.append(b(obj));
                o = sb2.toString();
            }
            string = (String)o;
        }
        return string;
    }
}
