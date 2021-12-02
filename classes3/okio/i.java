// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import kotlin.jvm.internal.h0;
import n6.a;
import kotlin.text.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\u001a/\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\b\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\n*\n\u0010\f\"\u00020\u000b2\u00020\u000b*\n\u0010\u000e\"\u00020\r2\u00020\r*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f*\n\u0010\u0012\"\u00020\u00112\u00020\u0011*\n\u0010\u0014\"\u00020\u00132\u00020\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015" }, d2 = { "", "", "c", "a", "R", "", "lock", "Lkotlin/Function0;", "block", "b", "(Ljava/lang/Object;Ln6/a;)Ljava/lang/Object;", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/Closeable;", "Closeable", "Ljava/io/EOFException;", "EOFException", "Ljava/io/FileNotFoundException;", "FileNotFoundException", "Ljava/io/IOException;", "IOException", "okio" }, k = 2, mv = { 1, 4, 1 })
@g(name = "-Platform")
public final class i
{
    @e
    public static final byte[] a(@e final String s) {
        k0.p((Object)s, "$this$asUtf8ToByteArray");
        final byte[] bytes = s.getBytes(f.a);
        k0.o((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
    
    public static final <R> R b(@e final Object o, @e final a<? extends R> a) {
        k0.p(o, "lock");
        k0.p((Object)a, "block");
        // monitorenter(o)
        try {
            return (R)a.invoke();
        }
        finally {
            h0.d(1);
            // monitorexit(o)
            h0.c(1);
        }
    }
    
    @e
    public static final String c(@e final byte[] bytes) {
        k0.p((Object)bytes, "$this$toUtf8String");
        return new String(bytes, f.a);
    }
}
