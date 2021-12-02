// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;
import java.io.ByteArrayOutputStream;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n" }, d2 = { "Lkotlin/io/g;", "Ljava/io/ByteArrayOutputStream;", "", "a", "()[B", "buffer", "", "size", "<init>", "(I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class g extends ByteArrayOutputStream
{
    public g(final int size) {
        super(size);
    }
    
    @e
    public final byte[] a() {
        final byte[] buf = super.buf;
        k0.o(buf, "buf");
        return buf;
    }
}
