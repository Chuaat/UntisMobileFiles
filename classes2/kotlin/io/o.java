// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.Objects;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000\u001a\u001c\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000\"\u001a\u0010\f\u001a\u00020\u0000*\u00020\u00048@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\u000f\u001a\u00020\u0004*\u00020\u00048@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0017\u0010\u0013\u001a\u00020\u0010*\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014" }, d2 = { "", "", "b", "(Ljava/lang/String;)I", "Ljava/io/File;", "Lkotlin/io/i;", "f", "beginIndex", "endIndex", "e", "c", "(Ljava/io/File;)Ljava/lang/String;", "rootName", "a", "(Ljava/io/File;)Ljava/io/File;", "root", "", "d", "(Ljava/io/File;)Z", "isRooted", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/io/FilesKt")
class o
{
    public o() {
    }
    
    @e
    public static final File a(@e final File file) {
        k0.p(file, "$this$root");
        return new File(c(file));
    }
    
    private static final int b(final String s) {
        final int q3 = s.q3((CharSequence)s, File.separatorChar, 0, false, 4, (Object)null);
        if (q3 == 0) {
            if (s.length() > 1) {
                final char char1 = s.charAt(1);
                final char separatorChar = File.separatorChar;
                if (char1 == separatorChar) {
                    final int q4 = s.q3((CharSequence)s, separatorChar, 2, false, 4, (Object)null);
                    if (q4 >= 0) {
                        final int q5 = s.q3((CharSequence)s, File.separatorChar, q4 + 1, false, 4, (Object)null);
                        if (q5 >= 0) {
                            return q5 + 1;
                        }
                        return s.length();
                    }
                }
            }
            return 1;
        }
        if (q3 > 0 && s.charAt(q3 - 1) == ':') {
            return q3 + 1;
        }
        if (q3 == -1 && s.a3((CharSequence)s, ':', false, 2, (Object)null)) {
            return s.length();
        }
        return 0;
    }
    
    @e
    public static final String c(@e final File file) {
        k0.p(file, "$this$rootName");
        final String path = file.getPath();
        k0.o(path, "path");
        final String path2 = file.getPath();
        k0.o(path2, "path");
        final int b = b(path2);
        Objects.requireNonNull(path, "null cannot be cast to non-null type java.lang.String");
        final String substring = path.substring(0, b);
        k0.o(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    public static final boolean d(@e final File file) {
        k0.p(file, "$this$isRooted");
        final String path = file.getPath();
        k0.o(path, "path");
        return b(path) > 0;
    }
    
    @e
    public static final File e(@e final File file, final int n, final int n2) {
        k0.p(file, "$this$subPath");
        return f(file).j(n, n2);
    }
    
    @e
    public static final i f(@e final File file) {
        k0.p(file, "$this$toComponents");
        final String path = file.getPath();
        k0.o(path, "path");
        final int b = b(path);
        final String substring = path.substring(0, b);
        k0.o(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        final String substring2 = path.substring(b);
        k0.o(substring2, "(this as java.lang.String).substring(startIndex)");
        List<File> e;
        if (substring2.length() == 0) {
            e = v.E();
        }
        else {
            final List r4 = s.R4((CharSequence)substring2, new char[] { File.separatorChar }, false, 0, 6, (Object)null);
            e = new ArrayList<File>(v.Y((Iterable<?>)r4, 10));
            final Iterator<String> iterator = r4.iterator();
            while (iterator.hasNext()) {
                e.add(new File(iterator.next()));
            }
        }
        return new i(new File(substring), e);
    }
}
