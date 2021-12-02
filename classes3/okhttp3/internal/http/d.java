// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http;

import okio.p0;
import okhttp3.v;
import org.jetbrains.annotations.f;
import okio.r0;
import okhttp3.g0;
import org.jetbrains.annotations.e;
import okhttp3.e0;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0017\u001a\u00020\bH&R\u0016\u0010\u001b\u001a\u00020\u00188&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c" }, d2 = { "Lokhttp3/internal/http/d;", "", "Lokhttp3/e0;", "request", "", "contentLength", "Lokio/p0;", "i", "Lkotlin/j2;", "b", "f", "a", "", "expectContinue", "Lokhttp3/g0$a;", "d", "Lokhttp3/g0;", "response", "g", "Lokio/r0;", "c", "Lokhttp3/v;", "h", "cancel", "Lokhttp3/internal/connection/f;", "e", "()Lokhttp3/internal/connection/f;", "connection", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public interface d
{
    public static final a a = d.a.b;
    public static final int b = 100;
    
    void a() throws IOException;
    
    void b(@e final e0 p0) throws IOException;
    
    @e
    r0 c(@e final g0 p0) throws IOException;
    
    void cancel();
    
    @f
    g0.a d(final boolean p0) throws IOException;
    
    @e
    okhttp3.internal.connection.f e();
    
    void f() throws IOException;
    
    long g(@e final g0 p0) throws IOException;
    
    @e
    v h() throws IOException;
    
    @e
    p0 i(@e final e0 p0, final long p1) throws IOException;
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "okhttp3/internal/http/d$a", "", "", "a", "I", "DISCARD_STREAM_TIMEOUT_MILLIS", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        public static final int a = 100;
        static final /* synthetic */ a b;
        
        static {
            b = new a();
        }
        
        private a() {
        }
    }
}
