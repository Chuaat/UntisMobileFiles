// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.sequences.m;
import java.util.ArrayList;
import n6.l;
import java.util.List;
import kotlin.text.s;
import kotlin.i;
import org.jetbrains.annotations.f;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import kotlin.jvm.internal.k0;
import java.io.IOException;
import n6.p;
import org.jetbrains.annotations.e;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\u001a*\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007\u001a*\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0012\u0010\b\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0012\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r\u001a&\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u001a8\u0010\u0018\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0003\u001a\u0012\u0010\u001b\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003\u001a\u0012\u0010\u001c\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0000\u001a\u0012\u0010\u001d\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003\u001a\u0012\u0010\u001e\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0000\u001a\n\u0010\u001f\u001a\u00020\u0003*\u00020\u0003\u001a\u0013\u0010!\u001a\u00020 *\u00020 H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030#*\b\u0012\u0004\u0012\u00020\u00030#H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0012\u0010'\u001a\u00020\u0003*\u00020\u00032\u0006\u0010&\u001a\u00020\u0003\u001a\u0012\u0010(\u001a\u00020\u0003*\u00020\u00032\u0006\u0010&\u001a\u00020\u0000\u001a\u0012\u0010)\u001a\u00020\u0003*\u00020\u00032\u0006\u0010&\u001a\u00020\u0003\u001a\u0012\u0010*\u001a\u00020\u0003*\u00020\u00032\u0006\u0010&\u001a\u00020\u0000\"\u0017\u0010-\u001a\u00020\u0000*\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0017\u0010/\u001a\u00020\u0000*\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b.\u0010,\"\u0017\u00101\u001a\u00020\u0000*\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b0\u0010,¨\u00062" }, d2 = { "", "prefix", "suffix", "Ljava/io/File;", "directory", "R", "T", "base", "n0", "e0", "g0", "f0", "o0", "(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;", "target", "", "overwrite", "", "bufferSize", "P", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/w;", "onError", "N", "V", "other", "l0", "m0", "W", "X", "b0", "Lkotlin/io/i;", "d0", "(Lkotlin/io/i;)Lkotlin/io/i;", "", "c0", "(Ljava/util/List;)Ljava/util/List;", "relative", "h0", "i0", "j0", "k0", "Z", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "a0", "nameWithoutExtension", "Y", "extension", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/io/FilesKt")
class r extends q
{
    public r() {
    }
    
    public static final boolean N(@e final File file, @e final File parent, final boolean b, @e final n6.p<? super File, ? super IOException, ? extends w> p4) {
        k0.p(file, "$this$copyRecursively");
        k0.p(parent, "target");
        k0.p(p4, "onError");
        final boolean exists = file.exists();
        final boolean b2 = true;
        if (!exists) {
            return (w)p4.invoke(file, new v(file, null, "The source file doesn't exist.", 2, null)) != w.H && b2;
        }
        try {
            for (final File file2 : q.M(file).k(new n6.p<File, IOException, j2>() {
                public final void a(@e final File file, @e final IOException ex) {
                    k0.p(file, "f");
                    k0.p(ex, "e");
                    if (p4.invoke(file, ex) != w.H) {
                        return;
                    }
                    throw new y(file);
                }
            })) {
                if (!file2.exists()) {
                    if ((w)p4.invoke(file2, new v(file2, null, "The source file doesn't exist.", 2, null)) == w.H) {
                        return false;
                    }
                    continue;
                }
                else {
                    final File file3 = new File(parent, n0(file2, file));
                    if (file3.exists() && (!file2.isDirectory() || !file3.isDirectory()) && (!b || !(file3.isDirectory() ? V(file3) : file3.delete()))) {
                        if ((w)p4.invoke(file3, new h(file2, file3, "The destination file already exists.")) == w.H) {
                            return false;
                        }
                        continue;
                    }
                    else if (file2.isDirectory()) {
                        file3.mkdirs();
                    }
                    else {
                        if (Q(file2, file3, b, 0, 4, null).length() != file2.length() && (w)p4.invoke(file2, new IOException("Source file wasn't copied completely, length of destination file differs.")) == w.H) {
                            return false;
                        }
                        continue;
                    }
                }
            }
            return true;
        }
        catch (y y) {
            return false;
        }
    }
    
    @e
    public static final File P(@e File file, @e final File file2, final boolean b, final int n) {
        k0.p(file, "$this$copyTo");
        k0.p(file2, "target");
        if (file.exists()) {
            if (file2.exists()) {
                if (!b) {
                    throw new h(file, file2, "The destination file already exists.");
                }
                if (!file2.delete()) {
                    throw new h(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                }
            }
            if (file.isDirectory()) {
                if (file2.mkdirs()) {
                    return file2;
                }
                throw new j(file, file2, "Failed to create target directory.");
            }
            else {
                final File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            file = (File)new FileInputStream(file);
            try {
                final FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    b.k((InputStream)file, fileOutputStream, n);
                    c.a(fileOutputStream, null);
                    c.a((Closeable)file, null);
                    return file2;
                }
                finally {
                    try {}
                    finally {
                        final Throwable t;
                        c.a(fileOutputStream, t);
                    }
                }
            }
            finally {
                try {}
                finally {
                    c.a((Closeable)file, (Throwable)file2);
                }
            }
        }
        throw new v(file, null, "The source file doesn't exist.", 2, null);
    }
    
    public static /* synthetic */ File Q(final File file, final File file2, boolean b, int n, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            b = false;
        }
        if ((n2 & 0x4) != 0x0) {
            n = 8192;
        }
        return P(file, file2, b, n);
    }
    
    @i(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @e
    public static final File R(@e final String prefix, @f final String suffix, @f final File directory) {
        k0.p(prefix, "prefix");
        final File tempFile = File.createTempFile(prefix, suffix, directory);
        tempFile.delete();
        if (tempFile.mkdir()) {
            k0.o(tempFile, "dir");
            return tempFile;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to create temporary directory ");
        sb.append(tempFile);
        sb.append('.');
        throw new IOException(sb.toString());
    }
    
    @i(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @e
    public static final File T(@e final String prefix, @f final String suffix, @f final File directory) {
        k0.p(prefix, "prefix");
        final File tempFile = File.createTempFile(prefix, suffix, directory);
        k0.o(tempFile, "File.createTempFile(prefix, suffix, directory)");
        return tempFile;
    }
    
    public static final boolean V(@e File file) {
        k0.p(file, "$this$deleteRecursively");
        final Iterator iterator = ((m)q.L(file)).iterator();
        boolean b = false;
    Label_0017:
        while (true) {
            b = true;
            while (iterator.hasNext()) {
                file = iterator.next();
                if ((file.delete() || !file.exists()) && b) {
                    continue Label_0017;
                }
                b = false;
            }
            break;
        }
        return b;
    }
    
    public static final boolean W(@e final File file, @e final File file2) {
        k0.p(file, "$this$endsWith");
        k0.p(file2, "other");
        final kotlin.io.i f = o.f(file);
        final kotlin.io.i f2 = o.f(file2);
        if (f2.i()) {
            return k0.g(file, file2);
        }
        final int n = f.h() - f2.h();
        return n >= 0 && f.g().subList(n, f.h()).equals(f2.g());
    }
    
    public static final boolean X(@e final File file, @e final String pathname) {
        k0.p(file, "$this$endsWith");
        k0.p(pathname, "other");
        return W(file, new File(pathname));
    }
    
    @e
    public static String Y(@e final File file) {
        k0.p(file, "$this$extension");
        final String name = file.getName();
        k0.o(name, "name");
        return s.n5(name, '.', "");
    }
    
    @e
    public static final String Z(@e final File file) {
        k0.p(file, "$this$invariantSeparatorsPath");
        String s;
        if (File.separatorChar != '/') {
            final String path = file.getPath();
            k0.o(path, "path");
            s = kotlin.text.s.j2(path, File.separatorChar, '/', false, 4, (Object)null);
        }
        else {
            s = file.getPath();
            k0.o(s, "path");
        }
        return s;
    }
    
    @e
    public static final String a0(@e final File file) {
        k0.p(file, "$this$nameWithoutExtension");
        final String name = file.getName();
        k0.o(name, "name");
        return s.y5(name, ".", (String)null, 2, (Object)null);
    }
    
    @e
    public static final File b0(@e File e) {
        k0.p(e, "$this$normalize");
        final kotlin.io.i f = o.f(e);
        e = f.e();
        final List<File> c0 = c0(f.g());
        final String separator = File.separator;
        k0.o(separator, "File.separator");
        return i0(e, kotlin.collections.v.Z2(c0, separator, null, null, 0, null, null, 62, null));
    }
    
    private static final List<File> c0(final List<? extends File> list) {
        final ArrayList list2 = new ArrayList<File>(list.size());
        for (final File file : list) {
            final String name = file.getName();
            if (name != null) {
                final int hashCode = name.hashCode();
                if (hashCode != 46) {
                    if (hashCode == 1472) {
                        if (name.equals("..") && !list2.isEmpty() && (k0.g(kotlin.collections.v.c3((List<? extends File>)list2).getName(), "..") ^ true)) {
                            list2.remove(list2.size() - 1);
                            continue;
                        }
                    }
                }
                else if (name.equals(".")) {
                    continue;
                }
            }
            list2.add(file);
        }
        return (List<File>)list2;
    }
    
    private static final kotlin.io.i d0(final kotlin.io.i i) {
        return new kotlin.io.i(i.e(), c0(i.g()));
    }
    
    @e
    public static final File e0(@e final File file, @e final File file2) {
        k0.p(file, "$this$relativeTo");
        k0.p(file2, "base");
        return new File(n0(file, file2));
    }
    
    @f
    public static final File f0(@e File file, @e final File file2) {
        k0.p(file, "$this$relativeToOrNull");
        k0.p(file2, "base");
        final String o0 = o0(file, file2);
        if (o0 != null) {
            file = new File(o0);
        }
        else {
            file = null;
        }
        return file;
    }
    
    @e
    public static final File g0(@e File file, @e final File file2) {
        k0.p(file, "$this$relativeToOrSelf");
        k0.p(file2, "base");
        final String o0 = o0(file, file2);
        if (o0 != null) {
            file = new File(o0);
        }
        return file;
    }
    
    @e
    public static final File h0(@e final File file, @e final File file2) {
        k0.p(file, "$this$resolve");
        k0.p(file2, "relative");
        if (o.d(file2)) {
            return file2;
        }
        final String string = file.toString();
        k0.o(string, "this.toString()");
        File file3;
        if (string.length() != 0 && !s.a3((CharSequence)string, File.separatorChar, false, 2, (Object)null)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(File.separatorChar);
            sb.append(file2);
            file3 = new File(sb.toString());
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(file2);
            file3 = new File(sb2.toString());
        }
        return file3;
    }
    
    @e
    public static final File i0(@e final File file, @e final String pathname) {
        k0.p(file, "$this$resolve");
        k0.p(pathname, "relative");
        return h0(file, new File(pathname));
    }
    
    @e
    public static final File j0(@e File j, @e final File file) {
        k0.p(j, "$this$resolveSibling");
        k0.p(file, "relative");
        final kotlin.io.i f = o.f(j);
        if (f.h() == 0) {
            j = new File("..");
        }
        else {
            j = f.j(0, f.h() - 1);
        }
        return h0(h0(f.e(), j), file);
    }
    
    @e
    public static final File k0(@e final File file, @e final String pathname) {
        k0.p(file, "$this$resolveSibling");
        k0.p(pathname, "relative");
        return j0(file, new File(pathname));
    }
    
    public static final boolean l0(@e final File file, @e final File file2) {
        k0.p(file, "$this$startsWith");
        k0.p(file2, "other");
        final kotlin.io.i f = o.f(file);
        final kotlin.io.i f2 = o.f(file2);
        final boolean g = k0.g(f.e(), f2.e());
        boolean equals = false;
        if (g ^ true) {
            return false;
        }
        if (f.h() >= f2.h()) {
            equals = f.g().subList(0, f2.h()).equals(f2.g());
        }
        return equals;
    }
    
    public static final boolean m0(@e final File file, @e final String pathname) {
        k0.p(file, "$this$startsWith");
        k0.p(pathname, "other");
        return l0(file, new File(pathname));
    }
    
    @e
    public static final String n0(@e final File obj, @e final File obj2) {
        k0.p(obj, "$this$toRelativeString");
        k0.p(obj2, "base");
        final String o0 = o0(obj, obj2);
        if (o0 != null) {
            return o0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("this and base files have different roots: ");
        sb.append(obj);
        sb.append(" and ");
        sb.append(obj2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static final String o0(final File file, final File file2) {
        final kotlin.io.i d0 = d0(o.f(file));
        final kotlin.io.i d2 = d0(o.f(file2));
        if (k0.g(d0.e(), d2.e()) ^ true) {
            return null;
        }
        int h;
        int h2;
        int n;
        for (h = d2.h(), h2 = d0.h(), n = 0; n < Math.min(h2, h) && k0.g(d0.g().get(n), d2.g().get(n)); ++n) {}
        final StringBuilder sb = new StringBuilder();
        int n2 = h - 1;
        Label_0187: {
            if (n2 >= n) {
                while (!k0.g(d2.g().get(n2).getName(), "..")) {
                    sb.append("..");
                    if (n2 != n) {
                        sb.append(File.separatorChar);
                    }
                    if (n2 == n) {
                        break Label_0187;
                    }
                    --n2;
                }
                return null;
            }
        }
        if (n < h2) {
            if (n < h) {
                sb.append(File.separatorChar);
            }
            final List<Object> p2 = kotlin.collections.v.P1((Iterable<?>)d0.g(), n);
            final String separator = File.separator;
            k0.o(separator, "File.separator");
            kotlin.collections.v.X2(p2, sb, separator, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }
}
