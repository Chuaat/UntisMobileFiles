// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import n6.l;
import kotlin.collections.v;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.e;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00c6\u0003J#\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0013\u0010\u0015\u001a\u00020\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001b\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010!\u001a\u00020\r8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$" }, d2 = { "Lkotlin/io/i;", "", "", "beginIndex", "endIndex", "Ljava/io/File;", "j", "a", "", "b", "root", "segments", "c", "", "toString", "hashCode", "other", "", "equals", "i", "()Z", "isRooted", "Ljava/util/List;", "g", "()Ljava/util/List;", "h", "()I", "size", "Ljava/io/File;", "e", "()Ljava/io/File;", "f", "()Ljava/lang/String;", "rootName", "<init>", "(Ljava/io/File;Ljava/util/List;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class i
{
    @e
    private final File a;
    @e
    private final List<File> b;
    
    public i(@e final File a, @e final List<? extends File> b) {
        k0.p(a, "root");
        k0.p(b, "segments");
        this.a = a;
        this.b = (List<File>)b;
    }
    
    @e
    public final File a() {
        return this.a;
    }
    
    @e
    public final List<File> b() {
        return this.b;
    }
    
    @e
    public final i c(@e final File file, @e final List<? extends File> list) {
        k0.p(file, "root");
        k0.p(list, "segments");
        return new i(file, list);
    }
    
    @e
    public final File e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof i) {
                final i i = (i)o;
                if (k0.g(this.a, i.a) && k0.g(this.b, i.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    public final String f() {
        final String path = this.a.getPath();
        k0.o(path, "root.path");
        return path;
    }
    
    @e
    public final List<File> g() {
        return this.b;
    }
    
    public final int h() {
        return this.b.size();
    }
    
    @Override
    public int hashCode() {
        final File a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final List<File> b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public final boolean i() {
        final String path = this.a.getPath();
        k0.o(path, "root.path");
        return path.length() > 0;
    }
    
    @e
    public final File j(final int n, final int n2) {
        if (n >= 0 && n <= n2 && n2 <= this.h()) {
            final List<File> subList = this.b.subList(n, n2);
            final String separator = File.separator;
            k0.o(separator, "File.separator");
            return new File(v.Z2(subList, separator, null, null, 0, null, null, 62, null));
        }
        throw new IllegalArgumentException();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FilePathComponents(root=");
        sb.append(this.a);
        sb.append(", segments=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
