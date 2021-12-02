// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.coroutines.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c0\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010" }, d2 = { "Lkotlin/coroutines/jvm/internal/c;", "Lkotlin/coroutines/d;", "", "Lkotlin/b1;", "result", "Lkotlin/j2;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class c implements d<Object>
{
    @e
    public static final c G;
    
    static {
        G = new c();
    }
    
    private c() {
    }
    
    @e
    @Override
    public g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
    
    @Override
    public void resumeWith(@e final Object o) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
    
    @e
    @Override
    public String toString() {
        return "This continuation is already complete";
    }
}
