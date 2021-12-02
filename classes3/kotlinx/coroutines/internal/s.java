// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.y0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0001\"\u001c\u0010\t\u001a\u00020\u00048\u0000@\u0001X\u0081T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\"\"\u0010\u000e\u001a\u00020\u00008\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\r\u0010\b\u001a\u0004\b\u0005\u0010\f\"\u001c\u0010\u0011\u001a\u00020\u00048\u0000@\u0001X\u0081T¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\b\"\"\u0010\u0014\u001a\u00020\u00008\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u0012\u0004\b\u0013\u0010\b\u001a\u0004\b\n\u0010\f\"\u001c\u0010\u0017\u001a\u00020\u00048\u0000@\u0001X\u0081T¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u0012\u0004\b\u0016\u0010\b*\n\u0010\u0019\"\u00020\u00182\u00020\u0018*\u001c\u0010\u001c\u001a\u0004\b\u0000\u0010\u001a\"\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\u0012\u0004\u0012\u00028\u00000\u001b*\f\b\u0002\u0010\u001d\"\u00020\u00012\u00020\u0001*\n\u0010\u001f\"\u00020\u001e2\u00020\u001e*\u001c\u0010!\u001a\u0004\b\u0000\u0010\u001a\"\b\u0012\u0004\u0012\u00028\u00000 2\b\u0012\u0004\u0012\u00028\u00000 ¨\u0006\"" }, d2 = { "", "Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/internal/Node;", "h", "", "a", "I", "getUNDECIDED$annotations", "()V", "UNDECIDED", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "getCONDITION_FALSE$annotations", "CONDITION_FALSE", "c", "getFAILURE$annotations", "FAILURE", "e", "getLIST_EMPTY$annotations", "LIST_EMPTY", "b", "getSUCCESS$annotations", "SUCCESS", "Lkotlinx/coroutines/internal/t$a;", "AbstractAtomicDesc", "T", "Lkotlinx/coroutines/internal/t$b;", "AddLastDesc", "Node", "Lkotlinx/coroutines/internal/t$d;", "PrepareOp", "Lkotlinx/coroutines/internal/t$e;", "RemoveFirstDesc", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class s
{
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    @e
    private static final Object d;
    @e
    private static final Object e;
    
    static {
        d = new k0("CONDITION_FALSE");
        e = new k0("LIST_EMPTY");
    }
    
    @e
    public static final Object a() {
        return s.d;
    }
    
    @e
    public static final Object d() {
        return s.e;
    }
    
    @y0
    @e
    public static final t h(@e final Object obj) {
        Object o;
        if (!(obj instanceof f0)) {
            o = null;
        }
        else {
            o = obj;
        }
        final f0 f0 = (f0)o;
        if (f0 != null) {
            final t a = f0.a;
            if (a != null) {
                return a;
            }
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        return (t)obj;
    }
}
