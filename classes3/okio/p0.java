// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import org.jetbrains.annotations.e;
import java.io.IOException;
import kotlin.Metadata;
import java.io.Flushable;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0007H&¨\u0006\r" }, d2 = { "Lokio/p0;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/j2;", "t3", "flush", "Lokio/t0;", "timeout", "close", "okio" }, k = 1, mv = { 1, 4, 1 })
public interface p0 extends Closeable, Flushable
{
    void close() throws IOException;
    
    void flush() throws IOException;
    
    void t3(@e final m p0, final long p1) throws IOException;
    
    @e
    t0 timeout();
}
