// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import org.jetbrains.annotations.f;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.CoderResult;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.nio.CharBuffer;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u001a\u0010\u001d\u001a\u00060\u001aj\u0002`\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010+¨\u0006/" }, d2 = { "Lkotlin/io/t;", "", "", "endOfInput", "", "d", "c", "nBytes", "nChars", "e", "Ljava/nio/charset/Charset;", "charset", "Lkotlin/j2;", "i", "g", "h", "Ljava/io/InputStream;", "inputStream", "", "f", "", "[C", "chars", "Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "byteBuf", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "sb", "a", "I", "BUFFER_SIZE", "Ljava/nio/charset/CharsetDecoder;", "b", "Ljava/nio/charset/CharsetDecoder;", "decoder", "", "[B", "bytes", "Ljava/nio/CharBuffer;", "Ljava/nio/CharBuffer;", "charBuf", "Z", "directEOL", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class t
{
    private static final int a = 32;
    private static CharsetDecoder b;
    private static boolean c;
    private static final byte[] d;
    private static final char[] e;
    private static final ByteBuffer f;
    private static final CharBuffer g;
    private static final StringBuilder h;
    @e
    public static final t i;
    
    static {
        i = new t();
        final byte[] array = d = new byte[32];
        final char[] array2 = e = new char[32];
        final ByteBuffer wrap = ByteBuffer.wrap(array);
        k0.o(wrap, "ByteBuffer.wrap(bytes)");
        f = wrap;
        final CharBuffer wrap2 = CharBuffer.wrap(array2);
        k0.o(wrap2, "CharBuffer.wrap(chars)");
        g = wrap2;
        h = new StringBuilder();
    }
    
    private t() {
    }
    
    private final int c() {
        final ByteBuffer f = t.f;
        f.compact();
        final int position = f.position();
        f.position(0);
        return position;
    }
    
    private final int d(final boolean endOfInput) {
        int position;
        while (true) {
            final CharsetDecoder b = t.b;
            if (b == null) {
                k0.S("decoder");
            }
            final ByteBuffer f = t.f;
            final CharBuffer g = t.g;
            final CoderResult decode = b.decode(f, g, endOfInput);
            k0.o(decode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (decode.isError()) {
                this.g();
                decode.throwException();
            }
            position = g.position();
            if (!decode.isOverflow()) {
                break;
            }
            final StringBuilder h = t.h;
            final char[] e = t.e;
            --position;
            h.append(e, 0, position);
            g.position(0);
            g.limit(32);
            g.put(e[position]);
        }
        return position;
    }
    
    private final int e(int d, final int n) {
        final ByteBuffer f = t.f;
        f.limit(d);
        t.g.position(n);
        d = this.d(true);
        final CharsetDecoder b = t.b;
        if (b == null) {
            k0.S("decoder");
        }
        b.reset();
        f.position(0);
        return d;
    }
    
    private final void g() {
        final CharsetDecoder b = t.b;
        if (b == null) {
            k0.S("decoder");
        }
        b.reset();
        t.f.position(0);
        t.h.setLength(0);
    }
    
    private final void h() {
        final StringBuilder h = t.h;
        h.setLength(32);
        h.trimToSize();
    }
    
    private final void i(final Charset charset) {
        final CharsetDecoder decoder = charset.newDecoder();
        k0.o(decoder, "charset.newDecoder()");
        t.b = decoder;
        final ByteBuffer f = t.f;
        f.clear();
        final CharBuffer g = t.g;
        g.clear();
        f.put((byte)10);
        f.flip();
        final CharsetDecoder b = t.b;
        if (b == null) {
            k0.S("decoder");
        }
        final boolean b2 = false;
        b.decode(f, g, false);
        boolean c = b2;
        if (g.position() == 1) {
            c = b2;
            if (g.get(0) == '\n') {
                c = true;
            }
        }
        t.c = c;
        this.g();
    }
    
    @f
    public final String f(@e final InputStream inputStream, @e final Charset charset) {
        synchronized (this) {
            k0.p(inputStream, "inputStream");
            k0.p(charset, "charset");
            final CharsetDecoder b = t.b;
            final int n = 1;
            Label_0052: {
                if (b != null) {
                    if (b == null) {
                        k0.S("decoder");
                    }
                    if (!(k0.g(b.charset(), charset) ^ true)) {
                        break Label_0052;
                    }
                }
                this.i(charset);
            }
            int c = 0;
            int n2 = 0;
            while (true) {
                final int read = inputStream.read();
                if (read == -1) {
                    if (t.h.length() == 0 && c == 0 && n2 == 0) {
                        return null;
                    }
                    n2 = this.e(c, n2);
                    break;
                }
                else {
                    final byte[] d = t.d;
                    final int n3 = c + 1;
                    d[c] = (byte)read;
                    if (read != 10 && n3 != 32 && t.c) {
                        c = n3;
                    }
                    else {
                        final ByteBuffer f = t.f;
                        f.limit(n3);
                        t.g.position(n2);
                        n2 = this.d(false);
                        if (n2 > 0 && t.e[n2 - 1] == '\n') {
                            f.position(0);
                            break;
                        }
                        c = this.c();
                    }
                }
            }
            int n4 = n2;
            if (n2 > 0) {
                final char[] e = t.e;
                n4 = n2;
                if (e[n2 - 1] == '\n') {
                    n4 = --n2;
                    if (n2 > 0) {
                        n4 = n2;
                        if (e[n2 - 1] == '\r') {
                            n4 = n2 - 1;
                        }
                    }
                }
            }
            final StringBuilder h = t.h;
            int n5;
            if (h.length() == 0) {
                n5 = n;
            }
            else {
                n5 = 0;
            }
            if (n5 != 0) {
                return new String(t.e, 0, n4);
            }
            h.append(t.e, 0, n4);
            final String string = h.toString();
            k0.o(string, "sb.toString()");
            if (h.length() > 32) {
                this.h();
            }
            h.setLength(0);
            return string;
        }
    }
}
