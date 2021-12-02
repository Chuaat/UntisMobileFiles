// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import okio.t0;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0000H&¨\u0006\u0012" }, d2 = { "Lokhttp3/e;", "", "Lokhttp3/e0;", "k", "Lokhttp3/g0;", "p", "Lokhttp3/f;", "responseCallback", "Lkotlin/j2;", "q1", "cancel", "", "G", "K", "Lokio/t0;", "timeout", "M", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public interface e extends Cloneable
{
    boolean G();
    
    boolean K();
    
    @org.jetbrains.annotations.e
    e M();
    
    void cancel();
    
    @org.jetbrains.annotations.e
    e0 k();
    
    @org.jetbrains.annotations.e
    g0 p() throws IOException;
    
    void q1(@org.jetbrains.annotations.e final f p0);
    
    @org.jetbrains.annotations.e
    t0 timeout();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006" }, d2 = { "okhttp3/e$a", "", "Lokhttp3/e0;", "request", "Lokhttp3/e;", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public interface a
    {
        @org.jetbrains.annotations.e
        e a(@org.jetbrains.annotations.e final e0 p0);
    }
}
