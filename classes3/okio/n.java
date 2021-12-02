// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import kotlin.z0;
import kotlin.k;
import kotlin.i;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.jetbrains.annotations.e;
import java.io.IOException;
import kotlin.Metadata;
import java.nio.channels.WritableByteChannel;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH&J \u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0010H&J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0011H&J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H&J \u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\bH&J\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH&J(\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\bH&J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\bH&J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\bH&J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\bH&J\u0010\u0010'\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\bH&J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0011H&J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0011H&J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0011H&J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0011H&J\b\u0010.\u001a\u00020-H&J\b\u0010/\u001a\u00020\u0000H&J\b\u00100\u001a\u00020\u0000H&J\b\u00102\u001a\u000201H&R\u0016\u00105\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066" }, d2 = { "Lokio/n;", "Lokio/p0;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/m;", "m", "Lokio/p;", "byteString", "L4", "", "offset", "byteCount", "b1", "", "source", "G4", "o3", "Lokio/r0;", "", "z3", "P3", "", "string", "Q2", "beginIndex", "endIndex", "v3", "codePoint", "V0", "Ljava/nio/charset/Charset;", "charset", "E3", "w5", "b", "A", "s", "S0", "B2", "i", "i1", "A1", "v", "A5", "l1", "D5", "A3", "Lkotlin/j2;", "flush", "P0", "a2", "Ljava/io/OutputStream;", "G5", "z", "()Lokio/m;", "buffer", "okio" }, k = 1, mv = { 1, 4, 1 })
public interface n extends p0, WritableByteChannel
{
    @e
    n A(final int p0) throws IOException;
    
    @e
    n A1(final int p0) throws IOException;
    
    @e
    n A3(final long p0) throws IOException;
    
    @e
    n A5(final long p0) throws IOException;
    
    @e
    n B2(final int p0) throws IOException;
    
    @e
    n D5(final long p0) throws IOException;
    
    @e
    n E3(@e final String p0, @e final Charset p1) throws IOException;
    
    @e
    n G4(@e final byte[] p0) throws IOException;
    
    @e
    OutputStream G5();
    
    @e
    n L4(@e final p p0) throws IOException;
    
    @e
    n P0() throws IOException;
    
    @e
    n P3(@e final r0 p0, final long p1) throws IOException;
    
    @e
    n Q2(@e final String p0) throws IOException;
    
    @e
    n S0(final int p0) throws IOException;
    
    @e
    n V0(final int p0) throws IOException;
    
    @e
    n a2() throws IOException;
    
    @e
    n b1(@e final p p0, final int p1, final int p2) throws IOException;
    
    void flush() throws IOException;
    
    @e
    n i1(final int p0) throws IOException;
    
    @e
    n l1(final long p0) throws IOException;
    
    @i(level = k.G, message = "moved to val: use getBuffer() instead", replaceWith = @z0(expression = "buffer", imports = {}))
    @e
    m m();
    
    @e
    n o3(@e final byte[] p0, final int p1, final int p2) throws IOException;
    
    @e
    n v3(@e final String p0, final int p1, final int p2) throws IOException;
    
    @e
    n w5(@e final String p0, final int p1, final int p2, @e final Charset p3) throws IOException;
    
    @e
    m z();
    
    long z3(@e final r0 p0) throws IOException;
}
