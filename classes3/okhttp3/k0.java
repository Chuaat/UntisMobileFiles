// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import okio.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u001a\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0012\u001a\u00020\u0011H&¨\u0006\u0013" }, d2 = { "Lokhttp3/k0;", "", "Lokhttp3/e0;", "k", "", "f", "", "text", "", "b", "Lokio/p;", "bytes", "a", "", "code", "reason", "close", "Lkotlin/j2;", "cancel", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public interface k0
{
    boolean a(@e final p p0);
    
    boolean b(@e final String p0);
    
    void cancel();
    
    boolean close(final int p0, @f final String p1);
    
    long f();
    
    @e
    e0 k();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b" }, d2 = { "okhttp3/k0$a", "", "Lokhttp3/e0;", "request", "Lokhttp3/l0;", "listener", "Lokhttp3/k0;", "b", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public interface a
    {
        @e
        k0 b(@e final e0 p0, @e final l0 p1);
    }
}
