// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io.path;

import java.nio.file.FileSystem;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import java.nio.file.Paths;
import org.jetbrains.annotations.e;
import java.nio.file.Path;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u001e\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\r" }, d2 = { "Lkotlin/io/path/b;", "", "Ljava/nio/file/Path;", "path", "base", "a", "kotlin.jvm.PlatformType", "b", "Ljava/nio/file/Path;", "parentPath", "emptyPath", "<init>", "()V", "kotlin-stdlib-jdk7" }, k = 1, mv = { 1, 5, 1 })
final class b
{
    private static final Path a;
    private static final Path b;
    @e
    public static final b c;
    
    static {
        c = new b();
        a = Paths.get("", new String[0]);
        b = Paths.get("..", new String[0]);
    }
    
    private b() {
    }
    
    @e
    public final Path a(@e Path path, @e Path normalize) {
        k0.p(path, "path");
        k0.p(normalize, "base");
        final Path normalize2 = normalize.normalize();
        normalize = path.normalize();
        path = normalize2.relativize(normalize);
        k0.o(normalize2, "bn");
        final int nameCount = normalize2.getNameCount();
        k0.o(normalize, "pn");
        for (int min = Math.min(nameCount, normalize.getNameCount()), i = 0; i < min; ++i) {
            final Path name = normalize2.getName(i);
            final Path b = kotlin.io.path.b.b;
            if (k0.g(name, b) ^ true) {
                break;
            }
            if (k0.g(normalize.getName(i), b) ^ true) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if ((k0.g(normalize, normalize2) ^ true) && k0.g(normalize2, kotlin.io.path.b.a)) {
            path = normalize;
        }
        else {
            final String string = path.toString();
            k0.o(path, "rn");
            final FileSystem fileSystem = path.getFileSystem();
            k0.o(fileSystem, "rn.fileSystem");
            final String separator = fileSystem.getSeparator();
            k0.o(separator, "rn.fileSystem.separator");
            if (s.J1(string, separator, false, 2, (Object)null)) {
                final FileSystem fileSystem2 = path.getFileSystem();
                final FileSystem fileSystem3 = path.getFileSystem();
                k0.o(fileSystem3, "rn.fileSystem");
                path = fileSystem2.getPath(s.t6(string, fileSystem3.getSeparator().length()), new String[0]);
            }
        }
        k0.o(path, "r");
        return path;
    }
}
