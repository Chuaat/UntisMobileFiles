// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import okhttp3.internal.d;
import java.nio.charset.Charset;
import okio.r0;
import java.io.Closeable;
import kotlin.io.c;
import okio.d0;
import kotlin.jvm.internal.k0;
import okio.n;
import java.io.IOException;
import m6.h;
import okio.p;
import kotlin.z0;
import kotlin.i;
import m6.g;
import m6.k;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.io.File;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016¨\u0006\u000f" }, d2 = { "Lokhttp3/f0;", "", "Lokhttp3/y;", "b", "", "a", "Lokio/n;", "sink", "Lkotlin/j2;", "r", "", "p", "q", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public abstract class f0
{
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    @k
    @g(name = "create")
    @e
    public static final f0 c(@e final File file, @f final y y) {
        return f0.a.a(file, y);
    }
    
    @k
    @g(name = "create")
    @e
    public static final f0 d(@e final String s, @f final y y) {
        return f0.a.b(s, y);
    }
    
    @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @z0(expression = "file.asRequestBody(contentType)", imports = { "okhttp3.RequestBody.Companion.asRequestBody" }))
    @k
    @e
    public static final f0 e(@f final y y, @e final File file) {
        return f0.a.c(y, file);
    }
    
    @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toRequestBody(contentType)", imports = { "okhttp3.RequestBody.Companion.toRequestBody" }))
    @k
    @e
    public static final f0 f(@f final y y, @e final String s) {
        return f0.a.d(y, s);
    }
    
    @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toRequestBody(contentType)", imports = { "okhttp3.RequestBody.Companion.toRequestBody" }))
    @k
    @e
    public static final f0 g(@f final y y, @e final p p2) {
        return f0.a.e(y, p2);
    }
    
    @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = { "okhttp3.RequestBody.Companion.toRequestBody" }))
    @k
    @h
    @e
    public static final f0 h(@f final y y, @e final byte[] array) {
        return f0.a.p(f0.a, y, array, 0, 0, 12, null);
    }
    
    @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = { "okhttp3.RequestBody.Companion.toRequestBody" }))
    @k
    @h
    @e
    public static final f0 i(@f final y y, @e final byte[] array, final int n) {
        return f0.a.p(f0.a, y, array, n, 0, 8, null);
    }
    
    @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = { "okhttp3.RequestBody.Companion.toRequestBody" }))
    @k
    @h
    @e
    public static final f0 j(@f final y y, @e final byte[] array, final int n, final int n2) {
        return f0.a.h(y, array, n, n2);
    }
    
    @k
    @g(name = "create")
    @e
    public static final f0 k(@e final p p2, @f final y y) {
        return f0.a.i(p2, y);
    }
    
    @k
    @g(name = "create")
    @h
    @e
    public static final f0 l(@e final byte[] array) {
        return f0.a.r(f0.a, array, null, 0, 0, 7, null);
    }
    
    @k
    @g(name = "create")
    @h
    @e
    public static final f0 m(@e final byte[] array, @f final y y) {
        return f0.a.r(f0.a, array, y, 0, 0, 6, null);
    }
    
    @k
    @g(name = "create")
    @h
    @e
    public static final f0 n(@e final byte[] array, @f final y y, final int n) {
        return f0.a.r(f0.a, array, y, n, 0, 4, null);
    }
    
    @k
    @g(name = "create")
    @h
    @e
    public static final f0 o(@e final byte[] array, @f final y y, final int n, final int n2) {
        return f0.a.m(array, y, n, n2);
    }
    
    public long a() throws IOException {
        return -1L;
    }
    
    @f
    public abstract y b();
    
    public boolean p() {
        return false;
    }
    
    public boolean q() {
        return false;
    }
    
    public abstract void r(@e final n p0) throws IOException;
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u0005*\u00020\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0007J.\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0011H\u0007¨\u0006\u001c" }, d2 = { "okhttp3/f0$a", "", "", "Lokhttp3/y;", "contentType", "Lokhttp3/f0;", "b", "(Ljava/lang/String;Lokhttp3/y;)Lokhttp3/f0;", "Lokio/p;", "i", "(Lokio/p;Lokhttp3/y;)Lokhttp3/f0;", "", "", "offset", "byteCount", "m", "([BLokhttp3/y;II)Lokhttp3/f0;", "Ljava/io/File;", "a", "(Ljava/io/File;Lokhttp3/y;)Lokhttp3/f0;", "content", "d", "e", "h", "file", "c", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        public static /* synthetic */ f0 p(final a a, final y y, final byte[] array, int n, int length, final int n2, final Object o) {
            if ((n2 & 0x4) != 0x0) {
                n = 0;
            }
            if ((n2 & 0x8) != 0x0) {
                length = array.length;
            }
            return a.h(y, array, n, length);
        }
        
        public static /* synthetic */ f0 r(final a a, final byte[] array, y y, int n, int length, final int n2, final Object o) {
            if ((n2 & 0x1) != 0x0) {
                y = null;
            }
            if ((n2 & 0x2) != 0x0) {
                n = 0;
            }
            if ((n2 & 0x4) != 0x0) {
                length = array.length;
            }
            return a.m(array, y, n, length);
        }
        
        @k
        @g(name = "create")
        @e
        public final f0 a(@e final File file, @f final y y) {
            k0.p((Object)file, "$this$asRequestBody");
            return new f0() {
                @Override
                public long a() {
                    return file.length();
                }
                
                @f
                @Override
                public y b() {
                    return y;
                }
                
                @Override
                public void r(@e final n n) {
                    k0.p((Object)n, "sink");
                    final r0 r = d0.r(file);
                    try {
                        n.z3(r);
                        kotlin.io.c.a((Closeable)r, (Throwable)null);
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t;
                            kotlin.io.c.a((Closeable)r, t);
                        }
                    }
                }
            };
        }
        
        @k
        @g(name = "create")
        @e
        public final f0 b(@e final String s, @f final y obj) {
            k0.p((Object)s, "$this$toRequestBody");
            Charset charset2;
            final Charset charset = charset2 = kotlin.text.f.a;
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
            final byte[] bytes = s.getBytes(charset2);
            k0.o((Object)bytes, "(this as java.lang.String).getBytes(charset)");
            return this.m(bytes, d, 0, bytes.length);
        }
        
        @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @z0(expression = "file.asRequestBody(contentType)", imports = { "okhttp3.RequestBody.Companion.asRequestBody" }))
        @k
        @e
        public final f0 c(@f final y y, @e final File file) {
            k0.p((Object)file, "file");
            return this.a(file, y);
        }
        
        @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toRequestBody(contentType)", imports = { "okhttp3.RequestBody.Companion.toRequestBody" }))
        @k
        @e
        public final f0 d(@f final y y, @e final String s) {
            k0.p((Object)s, "content");
            return this.b(s, y);
        }
        
        @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toRequestBody(contentType)", imports = { "okhttp3.RequestBody.Companion.toRequestBody" }))
        @k
        @e
        public final f0 e(@f final y y, @e final p p2) {
            k0.p((Object)p2, "content");
            return this.i(p2, y);
        }
        
        @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = { "okhttp3.RequestBody.Companion.toRequestBody" }))
        @k
        @h
        @e
        public final f0 f(@f final y y, @e final byte[] array) {
            return p(this, y, array, 0, 0, 12, null);
        }
        
        @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = { "okhttp3.RequestBody.Companion.toRequestBody" }))
        @k
        @h
        @e
        public final f0 g(@f final y y, @e final byte[] array, final int n) {
            return p(this, y, array, n, 0, 8, null);
        }
        
        @i(level = kotlin.k.G, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @z0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = { "okhttp3.RequestBody.Companion.toRequestBody" }))
        @k
        @h
        @e
        public final f0 h(@f final y y, @e final byte[] array, final int n, final int n2) {
            k0.p((Object)array, "content");
            return this.m(array, y, n, n2);
        }
        
        @k
        @g(name = "create")
        @e
        public final f0 i(@e final p p2, @f final y y) {
            k0.p((Object)p2, "$this$toRequestBody");
            return new f0() {
                @Override
                public long a() {
                    return p2.size();
                }
                
                @f
                @Override
                public y b() {
                    return y;
                }
                
                @Override
                public void r(@e final n n) {
                    k0.p((Object)n, "sink");
                    n.L4(p2);
                }
            };
        }
        
        @k
        @g(name = "create")
        @h
        @e
        public final f0 j(@e final byte[] array) {
            return r(this, array, null, 0, 0, 7, null);
        }
        
        @k
        @g(name = "create")
        @h
        @e
        public final f0 k(@e final byte[] array, @f final y y) {
            return r(this, array, y, 0, 0, 6, null);
        }
        
        @k
        @g(name = "create")
        @h
        @e
        public final f0 l(@e final byte[] array, @f final y y, final int n) {
            return r(this, array, y, n, 0, 4, null);
        }
        
        @k
        @g(name = "create")
        @h
        @e
        public final f0 m(@e final byte[] array, @f final y y, final int n, final int n2) {
            k0.p((Object)array, "$this$toRequestBody");
            d.k(array.length, n, n2);
            return new f0() {
                @Override
                public long a() {
                    return n2;
                }
                
                @f
                @Override
                public y b() {
                    return y;
                }
                
                @Override
                public void r(@e final n n) {
                    k0.p((Object)n, "sink");
                    n.o3(array, n, n2);
                }
            };
        }
    }
}
