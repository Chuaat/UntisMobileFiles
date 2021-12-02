// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import org.jetbrains.annotations.e;
import m6.d;
import kotlinx.coroutines.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00010\u0001H\u0082\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u0005H\u0082\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0016\u0010\u000b\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u001c\u0010\u0010\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u0012\u0004\b\u000e\u0010\u000f\"\u001c\u0010\u0013\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u0012\u0004\b\u0012\u0010\u000f\"\u0016\u0010\u0015\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\n\"\u001c\u0010\u0018\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u0012\u0004\b\u0017\u0010\u000f\"\u001c\u0010\u001b\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u0012\u0004\b\u001a\u0010\u000f\"\u001c\u0010\u001e\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\r\u0012\u0004\b\u001d\u0010\u000f\"\u0016\u0010 \u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\n\"\u001c\u0010#\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\r\u0012\u0004\b\"\u0010\u000f*(\b\u0000\u0010'\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&0$2\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&0$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006(" }, d2 = { "E", "", "Lkotlinx/coroutines/channels/r0;", "i", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/v;", "j", "(Lkotlinx/coroutines/channels/v;)Ljava/lang/Object;", "", "c", "I", "RECEIVE_RESULT", "Lkotlinx/coroutines/internal/k0;", "Lkotlinx/coroutines/internal/k0;", "getHANDLER_INVOKED$annotations", "()V", "HANDLER_INVOKED", "g", "getPOLL_FAILED$annotations", "POLL_FAILED", "b", "RECEIVE_NULL_ON_CLOSE", "d", "getEMPTY$annotations", "EMPTY", "e", "getOFFER_SUCCESS$annotations", "OFFER_SUCCESS", "h", "getENQUEUE_FAILED$annotations", "ENQUEUE_FAILED", "a", "RECEIVE_THROWS_ON_CLOSE", "f", "getOFFER_FAILED$annotations", "OFFER_FAILED", "Lkotlin/Function1;", "", "Lkotlin/j2;", "Handler", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class b
{
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    @d
    @e
    public static final k0 d;
    @d
    @e
    public static final k0 e;
    @d
    @e
    public static final k0 f;
    @d
    @e
    public static final k0 g;
    @d
    @e
    public static final k0 h;
    @d
    @e
    public static final k0 i;
    
    static {
        d = new k0("EMPTY");
        e = new k0("OFFER_SUCCESS");
        f = new k0("OFFER_FAILED");
        g = new k0("POLL_FAILED");
        h = new k0("ENQUEUE_FAILED");
        i = new k0("ON_CLOSE_HANDLER_INVOKED");
    }
    
    private static final <E> Object i(Object o) {
        if (o instanceof v) {
            final r0.b b = r0.b;
            o = r0.b(new r0.a(((v)o).J));
        }
        else {
            final r0.b b2 = r0.b;
            o = r0.b(o);
        }
        return o;
    }
    
    private static final <E> Object j(final v<?> v) {
        final r0.b b = r0.b;
        return r0.b(new r0.a(v.J));
    }
}
