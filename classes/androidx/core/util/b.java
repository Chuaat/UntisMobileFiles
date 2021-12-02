// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import kotlin.jvm.internal.h0;
import kotlin.j2;
import java.io.FileOutputStream;
import n6.l;
import kotlin.text.f;
import java.nio.charset.Charset;
import androidx.annotation.p0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.util.AtomicFile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0087\b\u00f8\u0001\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007\u001a\u001e\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u001a\r\u0010\u0011\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a\u0016\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013" }, d2 = { "Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/t0;", "name", "out", "Lkotlin/j2;", "block", "d", "", "array", "e", "", "text", "Ljava/nio/charset/Charset;", "charset", "f", "a", "b", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class b
{
    @p0(17)
    @e
    public static final byte[] a(@e final AtomicFile atomicFile) {
        k0.p((Object)atomicFile, "<this>");
        final byte[] fully = atomicFile.readFully();
        k0.o((Object)fully, "readFully()");
        return fully;
    }
    
    @p0(17)
    @e
    public static final String b(@e final AtomicFile atomicFile, @e final Charset charset) {
        k0.p((Object)atomicFile, "<this>");
        k0.p((Object)charset, "charset");
        final byte[] fully = atomicFile.readFully();
        k0.o((Object)fully, "readFully()");
        return new String(fully, charset);
    }
    
    @p0(17)
    public static final void d(@e final AtomicFile atomicFile, @e final l<? super FileOutputStream, j2> l) {
        k0.p((Object)atomicFile, "<this>");
        k0.p((Object)l, "block");
        final FileOutputStream startWrite = atomicFile.startWrite();
        try {
            k0.o((Object)startWrite, "stream");
            l.invoke((Object)startWrite);
            h0.d(1);
            atomicFile.finishWrite(startWrite);
            h0.c(1);
        }
        finally {
            h0.d(1);
            atomicFile.failWrite(startWrite);
            h0.c(1);
        }
    }
    
    @p0(17)
    public static final void e(@e final AtomicFile atomicFile, @e final byte[] b) {
        k0.p((Object)atomicFile, "<this>");
        k0.p((Object)b, "array");
        final FileOutputStream startWrite = atomicFile.startWrite();
        try {
            k0.o((Object)startWrite, "stream");
            startWrite.write(b);
            atomicFile.finishWrite(startWrite);
        }
        finally {
            atomicFile.failWrite(startWrite);
        }
    }
    
    @p0(17)
    public static final void f(@e final AtomicFile atomicFile, @e final String s, @e final Charset charset) {
        k0.p((Object)atomicFile, "<this>");
        k0.p((Object)s, "text");
        k0.p((Object)charset, "charset");
        final byte[] bytes = s.getBytes(charset);
        k0.o((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        e(atomicFile, bytes);
    }
}
