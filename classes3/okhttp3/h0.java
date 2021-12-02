// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import okio.m;
import java.io.InputStreamReader;
import kotlin.jvm.internal.k0;
import okhttp3.internal.d;
import java.io.InputStream;
import okio.p;
import kotlin.z0;
import kotlin.i;
import m6.g;
import m6.k;
import org.jetbrains.annotations.e;
import java.io.IOException;
import kotlin.io.c;
import okio.o;
import n6.l;
import kotlin.text.f;
import java.nio.charset.Charset;
import kotlin.jvm.internal.w;
import java.io.Reader;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b \u0010!JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0005H&J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%" }, d2 = { "Lokhttp3/h0;", "Ljava/io/Closeable;", "", "T", "Lkotlin/Function1;", "Lokio/o;", "consumer", "", "sizeMapper", "consumeSource", "(Ln6/l;Ln6/l;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "Lokhttp3/y;", "contentType", "", "contentLength", "Ljava/io/InputStream;", "byteStream", "source", "", "bytes", "Lokio/p;", "byteString", "Ljava/io/Reader;", "charStream", "", "string", "Lkotlin/j2;", "close", "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", "a", "b", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public abstract class h0 implements Closeable
{
    public static final b Companion;
    private Reader reader;
    
    static {
        Companion = new b(null);
    }
    
    private final Charset charset() {
        final y contentType = this.contentType();
        if (contentType != null) {
            final Charset charset = contentType.f(f.a);
            if (charset != null) {
                return charset;
            }
        }
        return f.a;
    }
    
    private final <T> T consumeSource(final l<? super o, ? extends T> l, final l<? super T, Integer> i) {
        final long contentLength = this.contentLength();
        if (contentLength <= Integer.MAX_VALUE) {
            final o source = this.source();
            try {
                final Object invoke = l.invoke((Object)source);
                kotlin.jvm.internal.h0.d(1);
                c.a((Closeable)source, (Throwable)null);
                kotlin.jvm.internal.h0.c(1);
                final int intValue = ((Number)i.invoke(invoke)).intValue();
                if (contentLength != -1L && contentLength != intValue) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Content-Length (");
                    sb.append(contentLength);
                    sb.append(") and stream length (");
                    sb.append(intValue);
                    sb.append(") disagree");
                    throw new IOException(sb.toString());
                }
                return (T)invoke;
            }
            finally {
                try {}
                finally {
                    kotlin.jvm.internal.h0.d(1);
                    c.a((Closeable)source, (Throwable)l);
                    kotlin.jvm.internal.h0.c(1);
                }
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot buffer entire body for content length: ");
        sb2.append(contentLength);
        throw new IOException(sb2.toString());
    }
    
    @k
    @g(name = "create")
    @e
    public static final h0 create(@e final String s, @org.jetbrains.annotations.f final y y) {
        return h0.Companion.a(s, y);
    }
    
    @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.asResponseBody(contentType, contentLength)", imports = { "okhttp3.ResponseBody.Companion.asResponseBody" }))
    @k
    @e
    public static final h0 create(@org.jetbrains.annotations.f final y y, final long n, @e final o o) {
        return h0.Companion.b(y, n, o);
    }
    
    @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toResponseBody(contentType)", imports = { "okhttp3.ResponseBody.Companion.toResponseBody" }))
    @k
    @e
    public static final h0 create(@org.jetbrains.annotations.f final y y, @e final String s) {
        return h0.Companion.c(y, s);
    }
    
    @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toResponseBody(contentType)", imports = { "okhttp3.ResponseBody.Companion.toResponseBody" }))
    @k
    @e
    public static final h0 create(@org.jetbrains.annotations.f final y y, @e final p p2) {
        return h0.Companion.d(y, p2);
    }
    
    @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toResponseBody(contentType)", imports = { "okhttp3.ResponseBody.Companion.toResponseBody" }))
    @k
    @e
    public static final h0 create(@org.jetbrains.annotations.f final y y, @e final byte[] array) {
        return h0.Companion.e(y, array);
    }
    
    @k
    @g(name = "create")
    @e
    public static final h0 create(@e final o o, @org.jetbrains.annotations.f final y y, final long n) {
        return h0.Companion.f(o, y, n);
    }
    
    @k
    @g(name = "create")
    @e
    public static final h0 create(@e final p p2, @org.jetbrains.annotations.f final y y) {
        return h0.Companion.g(p2, y);
    }
    
    @k
    @g(name = "create")
    @e
    public static final h0 create(@e final byte[] array, @org.jetbrains.annotations.f final y y) {
        return h0.Companion.h(array, y);
    }
    
    @e
    public final InputStream byteStream() {
        return this.source().N5();
    }
    
    @e
    public final p byteString() throws IOException {
        final long contentLength = this.contentLength();
        if (contentLength <= Integer.MAX_VALUE) {
            Object source = this.source();
            try {
                final p d3 = ((o)source).D3();
                c.a((Closeable)source, (Throwable)null);
                final int size = d3.size();
                if (contentLength != -1L && contentLength != size) {
                    source = new StringBuilder();
                    ((StringBuilder)source).append("Content-Length (");
                    ((StringBuilder)source).append(contentLength);
                    ((StringBuilder)source).append(") and stream length (");
                    ((StringBuilder)source).append(size);
                    ((StringBuilder)source).append(") disagree");
                    throw new IOException(((StringBuilder)source).toString());
                }
                return d3;
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    c.a((Closeable)source, t);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot buffer entire body for content length: ");
        sb.append(contentLength);
        throw new IOException(sb.toString());
    }
    
    @e
    public final byte[] bytes() throws IOException {
        final long contentLength = this.contentLength();
        if (contentLength <= Integer.MAX_VALUE) {
            Object source = this.source();
            try {
                final byte[] s1 = ((o)source).s1();
                c.a((Closeable)source, (Throwable)null);
                final int length = s1.length;
                if (contentLength != -1L && contentLength != length) {
                    source = new StringBuilder();
                    ((StringBuilder)source).append("Content-Length (");
                    ((StringBuilder)source).append(contentLength);
                    ((StringBuilder)source).append(") and stream length (");
                    ((StringBuilder)source).append(length);
                    ((StringBuilder)source).append(") disagree");
                    throw new IOException(((StringBuilder)source).toString());
                }
                return s1;
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    c.a((Closeable)source, t);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot buffer entire body for content length: ");
        sb.append(contentLength);
        throw new IOException(sb.toString());
    }
    
    @e
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            reader = new a(this.source(), this.charset());
            this.reader = reader;
        }
        return reader;
    }
    
    @Override
    public void close() {
        d.l(this.source());
    }
    
    public abstract long contentLength();
    
    @org.jetbrains.annotations.f
    public abstract y contentType();
    
    @e
    public abstract o source();
    
    @e
    public final String string() throws IOException {
        final o source = this.source();
        try {
            final String b3 = source.b3(d.P(source, this.charset()));
            c.a((Closeable)source, (Throwable)null);
            return b3;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                c.a((Closeable)source, t);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b" }, d2 = { "okhttp3/h0$a", "Ljava/io/Reader;", "", "cbuf", "", "off", "len", "read", "Lkotlin/j2;", "close", "Ljava/nio/charset/Charset;", "J", "Ljava/nio/charset/Charset;", "charset", "", "G", "Z", "closed", "Lokio/o;", "I", "Lokio/o;", "source", "H", "Ljava/io/Reader;", "delegate", "<init>", "(Lokio/o;Ljava/nio/charset/Charset;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a extends Reader
    {
        private boolean G;
        private Reader H;
        private final o I;
        private final Charset J;
        
        public a(@e final o i, @e final Charset j) {
            k0.p((Object)i, "source");
            k0.p((Object)j, "charset");
            this.I = i;
            this.J = j;
        }
        
        @Override
        public void close() throws IOException {
            this.G = true;
            final Reader h = this.H;
            if (h != null) {
                h.close();
            }
            else {
                this.I.close();
            }
        }
        
        @Override
        public int read(@e final char[] array, final int n, final int n2) throws IOException {
            k0.p((Object)array, "cbuf");
            if (!this.G) {
                Reader h = this.H;
                if (h == null) {
                    h = new InputStreamReader(this.I.N5(), d.P(this.I, this.J));
                    this.H = h;
                }
                return h.read(array, n, n2);
            }
            throw new IOException("Stream closed");
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0007J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u000bH\u0007J\"\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0007¨\u0006\u001a" }, d2 = { "okhttp3/h0$b", "", "", "Lokhttp3/y;", "contentType", "Lokhttp3/h0;", "a", "(Ljava/lang/String;Lokhttp3/y;)Lokhttp3/h0;", "", "h", "([BLokhttp3/y;)Lokhttp3/h0;", "Lokio/p;", "g", "(Lokio/p;Lokhttp3/y;)Lokhttp3/h0;", "Lokio/o;", "", "contentLength", "f", "(Lokio/o;Lokhttp3/y;J)Lokhttp3/h0;", "content", "c", "e", "d", "b", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        @k
        @g(name = "create")
        @e
        public final h0 a(@e final String s, @org.jetbrains.annotations.f final y obj) {
            k0.p((Object)s, "$this$toResponseBody");
            Charset charset2;
            final Charset charset = charset2 = f.a;
            y d = obj;
            if (obj != null) {
                charset2 = y.g(obj, null, 1, null);
                if (charset2 == null) {
                    final y.a i = y.i;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(obj);
                    sb.append("; charset=utf-8");
                    d = i.d(sb.toString());
                    charset2 = charset;
                }
                else {
                    d = obj;
                }
            }
            final m e1 = new m().e1(s, charset2);
            return this.f(e1, d, e1.h0());
        }
        
        @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.asResponseBody(contentType, contentLength)", imports = { "okhttp3.ResponseBody.Companion.asResponseBody" }))
        @k
        @e
        public final h0 b(@org.jetbrains.annotations.f final y y, final long n, @e final o o) {
            k0.p((Object)o, "content");
            return this.f(o, y, n);
        }
        
        @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toResponseBody(contentType)", imports = { "okhttp3.ResponseBody.Companion.toResponseBody" }))
        @k
        @e
        public final h0 c(@org.jetbrains.annotations.f final y y, @e final String s) {
            k0.p((Object)s, "content");
            return this.a(s, y);
        }
        
        @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toResponseBody(contentType)", imports = { "okhttp3.ResponseBody.Companion.toResponseBody" }))
        @k
        @e
        public final h0 d(@org.jetbrains.annotations.f final y y, @e final p p2) {
            k0.p((Object)p2, "content");
            return this.g(p2, y);
        }
        
        @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toResponseBody(contentType)", imports = { "okhttp3.ResponseBody.Companion.toResponseBody" }))
        @k
        @e
        public final h0 e(@org.jetbrains.annotations.f final y y, @e final byte[] array) {
            k0.p((Object)array, "content");
            return this.h(array, y);
        }
        
        @k
        @g(name = "create")
        @e
        public final h0 f(@e final o o, @org.jetbrains.annotations.f final y y, final long n) {
            k0.p((Object)o, "$this$asResponseBody");
            return new h0() {
                @Override
                public long contentLength() {
                    return n;
                }
                
                @org.jetbrains.annotations.f
                @Override
                public y contentType() {
                    return y;
                }
                
                @e
                @Override
                public o source() {
                    return o;
                }
            };
        }
        
        @k
        @g(name = "create")
        @e
        public final h0 g(@e final p p2, @org.jetbrains.annotations.f final y y) {
            k0.p((Object)p2, "$this$toResponseBody");
            return this.f(new m().p0(p2), y, p2.size());
        }
        
        @k
        @g(name = "create")
        @e
        public final h0 h(@e final byte[] array, @org.jetbrains.annotations.f final y y) {
            k0.p((Object)array, "$this$toResponseBody");
            return this.f(new m().y0(array), y, array.length);
        }
    }
}
