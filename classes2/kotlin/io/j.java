// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.io.File;
import kotlin.Metadata;
import java.io.IOException;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0013" }, d2 = { "Lkotlin/io/j;", "Ljava/io/IOException;", "Ljava/io/File;", "G", "Ljava/io/File;", "a", "()Ljava/io/File;", "file", "", "I", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "reason", "H", "b", "other", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public class j extends IOException
{
    @e
    private final File G;
    @f
    private final File H;
    @f
    private final String I;
    
    public j(@e final File g, @f final File h, @f final String i) {
        k0.p(g, "file");
        super(kotlin.io.f.a(g, h, i));
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @e
    public final File a() {
        return this.G;
    }
    
    @f
    public final File b() {
        return this.H;
    }
    
    @f
    public final String c() {
        return this.I;
    }
}
