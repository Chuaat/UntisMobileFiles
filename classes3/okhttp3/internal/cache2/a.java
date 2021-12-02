// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import okio.m;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.nio.channels.FileChannel;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010" }, d2 = { "Lokhttp3/internal/cache2/a;", "", "", "pos", "Lokio/m;", "source", "byteCount", "Lkotlin/j2;", "b", "sink", "a", "Ljava/nio/channels/FileChannel;", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class a
{
    private final FileChannel a;
    
    public a(@e final FileChannel a) {
        k0.p((Object)a, "fileChannel");
        this.a = a;
    }
    
    public final void a(long n, @e final m m, long n2) {
        k0.p((Object)m, "sink");
        if (n2 >= 0L) {
            while (n2 > 0L) {
                final long transferTo = this.a.transferTo(n, n2, m);
                n += transferTo;
                n2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
    
    public final void b(long n, @e final m m, long n2) throws IOException {
        k0.p((Object)m, "source");
        if (n2 >= 0L && n2 <= m.h0()) {
            final long n3 = n;
            n = n2;
            n2 = n3;
            while (n > 0L) {
                final long transfer = this.a.transferFrom(m, n2, n);
                n2 += transfer;
                n -= transfer;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
