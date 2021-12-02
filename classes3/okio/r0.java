// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import org.jetbrains.annotations.e;
import java.io.IOException;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\f" }, d2 = { "Lokio/r0;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lokio/m;", "sink", "", "byteCount", "read", "Lokio/t0;", "timeout", "Lkotlin/j2;", "close", "okio" }, k = 1, mv = { 1, 4, 1 })
public interface r0 extends Closeable
{
    void close() throws IOException;
    
    long read(@e final m p0, final long p1) throws IOException;
    
    @e
    t0 timeout();
}
