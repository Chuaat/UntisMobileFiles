// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.io;

import okio.d0;
import kotlin.jvm.internal.k0;
import java.io.IOException;
import okio.p0;
import java.io.FileNotFoundException;
import okio.r0;
import java.io.File;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0014" }, d2 = { "Lokhttp3/internal/io/a;", "", "Ljava/io/File;", "file", "Lokio/r0;", "a", "Lokio/p0;", "b", "g", "Lkotlin/j2;", "f", "", "d", "", "h", "from", "to", "e", "directory", "c", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public interface a
{
    @d
    @e
    public static final a a = new a();
    public static final a b = new a(null);
    
    @e
    r0 a(@e final File p0) throws FileNotFoundException;
    
    @e
    p0 b(@e final File p0) throws FileNotFoundException;
    
    void c(@e final File p0) throws IOException;
    
    boolean d(@e final File p0);
    
    void e(@e final File p0, @e final File p1) throws IOException;
    
    void f(@e final File p0) throws IOException;
    
    @e
    p0 g(@e final File p0) throws FileNotFoundException;
    
    long h(@e final File p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b" }, d2 = { "okhttp3/internal/io/a$a", "", "Lokhttp3/internal/io/a;", "SYSTEM", "Lokhttp3/internal/io/a;", "<init>", "()V", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018" }, d2 = { "okhttp3/internal/io/a$a$a", "Lokhttp3/internal/io/a;", "Ljava/io/File;", "file", "Lokio/r0;", "a", "Lokio/p0;", "b", "g", "Lkotlin/j2;", "f", "", "d", "", "h", "from", "to", "e", "directory", "c", "", "toString", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
        private static final class a implements okhttp3.internal.io.a
        {
            public a() {
            }
            
            @e
            @Override
            public r0 a(@e final File file) throws FileNotFoundException {
                k0.p((Object)file, "file");
                return d0.r(file);
            }
            
            @e
            @Override
            public p0 b(@e File file) throws FileNotFoundException {
                k0.p((Object)file, "file");
                try {
                    file = (File)d0.q(file, false, 1, null);
                }
                catch (FileNotFoundException ex) {
                    file.getParentFile().mkdirs();
                    file = (File)d0.q(file, false, 1, null);
                }
                return (p0)file;
            }
            
            @Override
            public void c(@e File file) throws IOException {
                k0.p((Object)file, "directory");
                final File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (int length = listFiles.length, i = 0; i < length; ++i) {
                        file = listFiles[i];
                        k0.o((Object)file, "file");
                        if (file.isDirectory()) {
                            this.c(file);
                        }
                        if (!file.delete()) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("failed to delete ");
                            sb.append(file);
                            throw new IOException(sb.toString());
                        }
                    }
                    return;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("not a readable directory: ");
                sb2.append(file);
                throw new IOException(sb2.toString());
            }
            
            @Override
            public boolean d(@e final File file) {
                k0.p((Object)file, "file");
                return file.exists();
            }
            
            @Override
            public void e(@e final File obj, @e final File file) throws IOException {
                k0.p((Object)obj, "from");
                k0.p((Object)file, "to");
                this.f(file);
                if (obj.renameTo(file)) {
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("failed to rename ");
                sb.append(obj);
                sb.append(" to ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
            
            @Override
            public void f(@e final File obj) throws IOException {
                k0.p((Object)obj, "file");
                if (!obj.delete() && obj.exists()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("failed to delete ");
                    sb.append(obj);
                    throw new IOException(sb.toString());
                }
            }
            
            @e
            @Override
            public p0 g(@e File file) throws FileNotFoundException {
                k0.p((Object)file, "file");
                try {
                    file = (File)d0.a(file);
                }
                catch (FileNotFoundException ex) {
                    file.getParentFile().mkdirs();
                    file = (File)d0.a(file);
                }
                return (p0)file;
            }
            
            @Override
            public long h(@e final File file) {
                k0.p((Object)file, "file");
                return file.length();
            }
            
            @e
            @Override
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }
    }
}
