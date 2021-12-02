// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import kotlin.z0;
import kotlin.k;
import kotlin.i;
import org.jetbrains.annotations.f;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.jetbrains.annotations.e;
import java.io.IOException;
import kotlin.Metadata;
import java.nio.channels.ReadableByteChannel;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH&J\b\u0010 \u001a\u00020\u001fH&J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001fH&J\u0010\u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001fH&J \u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0011H&J\u0018\u0010&\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020'H&J\b\u0010*\u001a\u00020)H&J\u0010\u0010+\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u0007H&J\n\u0010,\u001a\u0004\u0018\u00010)H&J\b\u0010-\u001a\u00020)H&J\u0010\u0010/\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0007H&J\b\u00100\u001a\u00020\u0011H&J\u0010\u00103\u001a\u00020)2\u0006\u00102\u001a\u000201H&J\u0018\u00104\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00102\u001a\u000201H&J\u0010\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u00020\fH&J\u0018\u00108\u001a\u00020\u00072\u0006\u00105\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0007H&J \u0010:\u001a\u00020\u00072\u0006\u00105\u001a\u00020\f2\u0006\u00107\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H&J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0019H&J\u0018\u0010=\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0007H&J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0019H&J\u0018\u0010@\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0007H&J\u0018\u0010A\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0019H&J(\u0010C\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0011H&J\b\u0010D\u001a\u00020\u0000H&J\b\u0010F\u001a\u00020EH&R\u0016\u0010I\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J" }, d2 = { "Lokio/o;", "Lokio/r0;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/m;", "m", "", "D1", "", "byteCount", "Lkotlin/j2;", "B5", "v", "", "readByte", "", "readShort", "P4", "", "readInt", "i4", "readLong", "Z4", "b2", "L5", "skip", "Lokio/p;", "D3", "E0", "Lokio/g0;", "options", "P5", "", "s1", "v4", "sink", "read", "readFully", "offset", "S1", "Lokio/p0;", "e5", "", "y4", "t0", "Z1", "e4", "limit", "g2", "q3", "Ljava/nio/charset/Charset;", "charset", "b3", "I4", "b", "H5", "fromIndex", "R1", "toIndex", "V1", "bytes", "y1", "v0", "targetBytes", "Y1", "y5", "Y2", "bytesOffset", "j4", "peek", "Ljava/io/InputStream;", "N5", "z", "()Lokio/m;", "buffer", "okio" }, k = 1, mv = { 1, 4, 1 })
public interface o extends r0, ReadableByteChannel
{
    void B5(final long p0) throws IOException;
    
    boolean D1() throws IOException;
    
    @e
    p D3() throws IOException;
    
    @e
    p E0(final long p0) throws IOException;
    
    long H5(final byte p0) throws IOException;
    
    @e
    String I4(final long p0, @e final Charset p1) throws IOException;
    
    long L5() throws IOException;
    
    @e
    InputStream N5();
    
    short P4() throws IOException;
    
    int P5(@e final g0 p0) throws IOException;
    
    long R1(final byte p0, final long p1) throws IOException;
    
    void S1(@e final m p0, final long p1) throws IOException;
    
    long V1(final byte p0, final long p1, final long p2) throws IOException;
    
    long Y1(@e final p p0) throws IOException;
    
    boolean Y2(final long p0, @e final p p1) throws IOException;
    
    @f
    String Z1() throws IOException;
    
    long Z4() throws IOException;
    
    long b2() throws IOException;
    
    @e
    String b3(@e final Charset p0) throws IOException;
    
    @e
    String e4() throws IOException;
    
    long e5(@e final p0 p0) throws IOException;
    
    @e
    String g2(final long p0) throws IOException;
    
    int i4() throws IOException;
    
    boolean j4(final long p0, @e final p p1, final int p2, final int p3) throws IOException;
    
    @i(level = k.G, message = "moved to val: use getBuffer() instead", replaceWith = @z0(expression = "buffer", imports = {}))
    @e
    m m();
    
    @e
    o peek();
    
    int q3() throws IOException;
    
    int read(@e final byte[] p0) throws IOException;
    
    int read(@e final byte[] p0, final int p1, final int p2) throws IOException;
    
    byte readByte() throws IOException;
    
    void readFully(@e final byte[] p0) throws IOException;
    
    int readInt() throws IOException;
    
    long readLong() throws IOException;
    
    short readShort() throws IOException;
    
    @e
    byte[] s1() throws IOException;
    
    void skip(final long p0) throws IOException;
    
    @e
    String t0(final long p0) throws IOException;
    
    boolean v(final long p0) throws IOException;
    
    long v0(@e final p p0, final long p1) throws IOException;
    
    @e
    byte[] v4(final long p0) throws IOException;
    
    long y1(@e final p p0) throws IOException;
    
    @e
    String y4() throws IOException;
    
    long y5(@e final p p0, final long p1) throws IOException;
    
    @e
    m z();
}
