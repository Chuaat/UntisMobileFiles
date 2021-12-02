// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import kotlin.jvm.internal.k0;
import java.io.IOException;
import okio.o;
import java.util.List;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H&J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0014" }, d2 = { "Lokhttp3/internal/http2/l;", "", "", "streamId", "", "Lokhttp3/internal/http2/c;", "requestHeaders", "", "a", "responseHeaders", "last", "b", "Lokio/o;", "source", "byteCount", "d", "Lokhttp3/internal/http2/b;", "errorCode", "Lkotlin/j2;", "c", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public interface l
{
    @d
    @e
    public static final l a = new a.a();
    public static final a b = new a(null);
    
    boolean a(final int p0, @e final List<c> p1);
    
    boolean b(final int p0, @e final List<c> p1, final boolean p2);
    
    void c(final int p0, @e final b p1);
    
    boolean d(final int p0, @e final o p1, final int p2, final boolean p3) throws IOException;
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b" }, d2 = { "okhttp3/internal/http2/l$a", "", "Lokhttp3/internal/http2/l;", "CANCEL", "Lokhttp3/internal/http2/l;", "<init>", "()V", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0016J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0016" }, d2 = { "okhttp3/internal/http2/l$a$a", "Lokhttp3/internal/http2/l;", "", "streamId", "", "Lokhttp3/internal/http2/c;", "requestHeaders", "", "a", "responseHeaders", "last", "b", "Lokio/o;", "source", "byteCount", "d", "Lokhttp3/internal/http2/b;", "errorCode", "Lkotlin/j2;", "c", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
        private static final class a implements l
        {
            public a() {
            }
            
            @Override
            public boolean a(final int n, @e final List<c> list) {
                k0.p((Object)list, "requestHeaders");
                return true;
            }
            
            @Override
            public boolean b(final int n, @e final List<c> list, final boolean b) {
                k0.p((Object)list, "responseHeaders");
                return true;
            }
            
            @Override
            public void c(final int n, @e final b b) {
                k0.p((Object)b, "errorCode");
            }
            
            @Override
            public boolean d(final int n, @e final o o, final int n2, final boolean b) throws IOException {
                k0.p((Object)o, "source");
                o.skip(n2);
                return true;
            }
        }
    }
}
