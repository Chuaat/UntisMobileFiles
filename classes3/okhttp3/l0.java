// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import okio.p;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0017" }, d2 = { "Lokhttp3/l0;", "", "Lokhttp3/k0;", "webSocket", "Lokhttp3/g0;", "response", "Lkotlin/j2;", "onOpen", "", "text", "onMessage", "Lokio/p;", "bytes", "", "code", "reason", "onClosing", "onClosed", "", "t", "onFailure", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public abstract class l0
{
    public void onClosed(@e final k0 k0, final int n, @e final String s) {
        kotlin.jvm.internal.k0.p((Object)k0, "webSocket");
        kotlin.jvm.internal.k0.p((Object)s, "reason");
    }
    
    public void onClosing(@e final k0 k0, final int n, @e final String s) {
        kotlin.jvm.internal.k0.p((Object)k0, "webSocket");
        kotlin.jvm.internal.k0.p((Object)s, "reason");
    }
    
    public void onFailure(@e final k0 k0, @e final Throwable t, @f final g0 g0) {
        kotlin.jvm.internal.k0.p((Object)k0, "webSocket");
        kotlin.jvm.internal.k0.p((Object)t, "t");
    }
    
    public void onMessage(@e final k0 k0, @e final String s) {
        kotlin.jvm.internal.k0.p((Object)k0, "webSocket");
        kotlin.jvm.internal.k0.p((Object)s, "text");
    }
    
    public void onMessage(@e final k0 k0, @e final p p2) {
        kotlin.jvm.internal.k0.p((Object)k0, "webSocket");
        kotlin.jvm.internal.k0.p((Object)p2, "bytes");
    }
    
    public void onOpen(@e final k0 k0, @e final g0 g0) {
        kotlin.jvm.internal.k0.p((Object)k0, "webSocket");
        kotlin.jvm.internal.k0.p((Object)g0, "response");
    }
}
