// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.InputStream;
import java.util.Arrays;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.net.Socket;
import java.io.OutputStream;
import kotlin.z0;
import kotlin.k;
import kotlin.jvm.internal.k0;
import java.io.File;
import org.jetbrains.annotations.e;
import kotlin.i;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J+\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007J+\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\b\u0010\"\u001a\u00020\u0004H\u0007¨\u0006%" }, d2 = { "Lokio/c;", "", "Ljava/io/File;", "file", "Lokio/p0;", "a", "sink", "Lokio/n;", "c", "Lokio/r0;", "source", "Lokio/o;", "d", "e", "Ljava/io/OutputStream;", "outputStream", "f", "Ljava/nio/file/Path;", "path", "", "Ljava/nio/file/OpenOption;", "options", "h", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/p0;", "Ljava/net/Socket;", "socket", "g", "i", "Ljava/io/InputStream;", "inputStream", "j", "l", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/r0;", "k", "b", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
@i(message = "changed in Okio 2.x")
public final class c
{
    @e
    public static final c a;
    
    static {
        a = new c();
    }
    
    private c() {
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "file.appendingSink()", imports = { "okio.appendingSink" }))
    @e
    public final p0 a(@e final File file) {
        k0.p((Object)file, "file");
        return d0.a(file);
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "blackholeSink()", imports = { "okio.blackholeSink" }))
    @e
    public final p0 b() {
        return d0.b();
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "sink.buffer()", imports = { "okio.buffer" }))
    @e
    public final n c(@e final p0 p) {
        k0.p((Object)p, "sink");
        return d0.c(p);
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "source.buffer()", imports = { "okio.buffer" }))
    @e
    public final o d(@e final r0 r0) {
        k0.p((Object)r0, "source");
        return d0.d(r0);
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "file.sink()", imports = { "okio.sink" }))
    @e
    public final p0 e(@e final File file) {
        k0.p((Object)file, "file");
        return d0.q(file, false, 1, null);
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "outputStream.sink()", imports = { "okio.sink" }))
    @e
    public final p0 f(@e final OutputStream outputStream) {
        k0.p((Object)outputStream, "outputStream");
        return d0.n(outputStream);
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "socket.sink()", imports = { "okio.sink" }))
    @e
    public final p0 g(@e final Socket socket) {
        k0.p((Object)socket, "socket");
        return d0.o(socket);
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "path.sink(*options)", imports = { "okio.sink" }))
    @e
    public final p0 h(@e final Path path, @e final OpenOption... original) {
        k0.p((Object)path, "path");
        k0.p((Object)original, "options");
        return d0.p(path, (OpenOption[])Arrays.copyOf(original, original.length));
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "file.source()", imports = { "okio.source" }))
    @e
    public final r0 i(@e final File file) {
        k0.p((Object)file, "file");
        return d0.r(file);
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "inputStream.source()", imports = { "okio.source" }))
    @e
    public final r0 j(@e final InputStream inputStream) {
        k0.p((Object)inputStream, "inputStream");
        return d0.s(inputStream);
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "socket.source()", imports = { "okio.source" }))
    @e
    public final r0 k(@e final Socket socket) {
        k0.p((Object)socket, "socket");
        return d0.t(socket);
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "path.source(*options)", imports = { "okio.source" }))
    @e
    public final r0 l(@e final Path path, @e final OpenOption... original) {
        k0.p((Object)path, "path");
        k0.p((Object)original, "options");
        return d0.u(path, (OpenOption[])Arrays.copyOf(original, original.length));
    }
}
