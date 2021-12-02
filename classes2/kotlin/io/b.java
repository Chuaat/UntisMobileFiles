// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.j;
import kotlin.z0;
import kotlin.i;
import kotlin.e1;
import java.io.ByteArrayOutputStream;
import java.util.NoSuchElementException;
import kotlin.collections.t;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import java.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import kotlin.internal.f;
import java.io.BufferedInputStream;
import java.io.InputStream;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\u0002\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\t\u001a\u00020\u0006*\u00020\bH\u0087\b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u0010\u001a\u00020\u0000*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0017\u001a\u00020\u0016*\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u0019\u001a\u00020\u0018*\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u001b\u001a\u00020\u001a*\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087\b\u001a\u001c\u0010\u001e\u001a\u00020\u001d*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\n\u001a\u0016\u0010 \u001a\u00020\b*\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\nH\u0007\u001a\f\u0010!\u001a\u00020\b*\u00020\u000eH\u0007¨\u0006\"" }, d2 = { "Ljava/io/BufferedInputStream;", "Lkotlin/collections/t;", "o", "", "Ljava/nio/charset/Charset;", "charset", "Ljava/io/ByteArrayInputStream;", "i", "", "m", "", "offset", "length", "n", "Ljava/io/InputStream;", "bufferSize", "a", "Ljava/io/InputStreamReader;", "s", "Ljava/io/BufferedReader;", "e", "Ljava/io/OutputStream;", "Ljava/io/BufferedOutputStream;", "b", "Ljava/io/OutputStreamWriter;", "u", "Ljava/io/BufferedWriter;", "g", "out", "", "k", "estimatedSize", "q", "p", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "ByteStreamsKt")
public final class b
{
    @f
    private static final BufferedInputStream a(final InputStream in, final int size) {
        BufferedInputStream bufferedInputStream;
        if (in instanceof BufferedInputStream) {
            bufferedInputStream = (BufferedInputStream)in;
        }
        else {
            bufferedInputStream = new BufferedInputStream(in, size);
        }
        return bufferedInputStream;
    }
    
    @f
    private static final BufferedOutputStream b(final OutputStream out, final int size) {
        BufferedOutputStream bufferedOutputStream;
        if (out instanceof BufferedOutputStream) {
            bufferedOutputStream = (BufferedOutputStream)out;
        }
        else {
            bufferedOutputStream = new BufferedOutputStream(out, size);
        }
        return bufferedOutputStream;
    }
    
    @f
    private static final BufferedReader e(final InputStream in, final Charset cs) {
        final InputStreamReader in2 = new InputStreamReader(in, cs);
        BufferedReader bufferedReader;
        if (in2 instanceof BufferedReader) {
            bufferedReader = (BufferedReader)in2;
        }
        else {
            bufferedReader = new BufferedReader(in2, 8192);
        }
        return bufferedReader;
    }
    
    @f
    private static final BufferedWriter g(final OutputStream out, final Charset cs) {
        final OutputStreamWriter out2 = new OutputStreamWriter(out, cs);
        BufferedWriter bufferedWriter;
        if (out2 instanceof BufferedWriter) {
            bufferedWriter = (BufferedWriter)out2;
        }
        else {
            bufferedWriter = new BufferedWriter(out2, 8192);
        }
        return bufferedWriter;
    }
    
    @f
    private static final ByteArrayInputStream i(final String obj, final Charset charset) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        final byte[] bytes = obj.getBytes(charset);
        k0.o(bytes, "(this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }
    
    public static final long k(@e final InputStream inputStream, @e final OutputStream outputStream, int i) {
        k0.p(inputStream, "$this$copyTo");
        k0.p(outputStream, "out");
        final byte[] b = new byte[i];
        i = inputStream.read(b);
        long n = 0L;
        while (i >= 0) {
            outputStream.write(b, 0, i);
            n += i;
            i = inputStream.read(b);
        }
        return n;
    }
    
    public static /* synthetic */ long l(final InputStream inputStream, final OutputStream outputStream, int n, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 8192;
        }
        return k(inputStream, outputStream, n);
    }
    
    @f
    private static final ByteArrayInputStream m(final byte[] buf) {
        return new ByteArrayInputStream(buf);
    }
    
    @f
    private static final ByteArrayInputStream n(final byte[] buf, final int offset, final int length) {
        return new ByteArrayInputStream(buf, offset, length);
    }
    
    @e
    public static final t o(@e final BufferedInputStream bufferedInputStream) {
        k0.p(bufferedInputStream, "$this$iterator");
        return new t() {
            private int G = -1;
            private boolean H;
            private boolean I;
            
            private final void e() {
                if (!this.H && !this.I) {
                    final int read = bufferedInputStream.read();
                    this.G = read;
                    boolean i = true;
                    this.H = true;
                    if (read != -1) {
                        i = false;
                    }
                    this.I = i;
                }
            }
            
            public final boolean b() {
                return this.I;
            }
            
            public final int c() {
                return this.G;
            }
            
            public final boolean d() {
                return this.H;
            }
            
            public final void f(final boolean i) {
                this.I = i;
            }
            
            public final void g(final int g) {
                this.G = g;
            }
            
            public final void h(final boolean h) {
                this.H = h;
            }
            
            @Override
            public boolean hasNext() {
                this.e();
                return this.I ^ true;
            }
            
            @Override
            public byte n() {
                this.e();
                if (!this.I) {
                    final byte b = (byte)this.G;
                    this.H = false;
                    return b;
                }
                throw new NoSuchElementException("Input stream is over.");
            }
        };
    }
    
    @e1(version = "1.3")
    @e
    public static final byte[] p(@e final InputStream inputStream) {
        k0.p(inputStream, "$this$readBytes");
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        k0.o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
    
    @i(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @z0(expression = "readBytes()", imports = {}))
    @j(errorSince = "1.5", warningSince = "1.3")
    @e
    public static final byte[] q(@e final InputStream inputStream, final int a) {
        k0.p(inputStream, "$this$readBytes");
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(a, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        k0.o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
    
    @f
    private static final InputStreamReader s(final InputStream in, final Charset cs) {
        return new InputStreamReader(in, cs);
    }
    
    @f
    private static final OutputStreamWriter u(final OutputStream out, final Charset cs) {
        return new OutputStreamWriter(out, cs);
    }
}
