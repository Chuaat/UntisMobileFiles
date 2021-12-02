// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import m6.g;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import m6.d;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0013\u0010\u000f\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u0013\u0010\u0011\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0013\u0010\u0018\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u001c" }, d2 = { "Lkotlin/text/f;", "", "Ljava/nio/charset/Charset;", "g", "Ljava/nio/charset/Charset;", "utf_32", "c", "UTF_16BE", "i", "utf_32be", "b", "UTF_16", "e", "US_ASCII", "()Ljava/nio/charset/Charset;", "UTF_32BE", "a", "UTF_32", "f", "ISO_8859_1", "h", "utf_32le", "d", "UTF_16LE", "UTF_32LE", "UTF_8", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class f
{
    @d
    @e
    public static final Charset a;
    @d
    @e
    public static final Charset b;
    @d
    @e
    public static final Charset c;
    @d
    @e
    public static final Charset d;
    @d
    @e
    public static final Charset e;
    @d
    @e
    public static final Charset f;
    private static Charset g;
    private static Charset h;
    private static Charset i;
    @e
    public static final f j;
    
    static {
        j = new f();
        final Charset forName = Charset.forName("UTF-8");
        k0.o((Object)forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        final Charset forName2 = Charset.forName("UTF-16");
        k0.o((Object)forName2, "Charset.forName(\"UTF-16\")");
        b = forName2;
        final Charset forName3 = Charset.forName("UTF-16BE");
        k0.o((Object)forName3, "Charset.forName(\"UTF-16BE\")");
        c = forName3;
        final Charset forName4 = Charset.forName("UTF-16LE");
        k0.o((Object)forName4, "Charset.forName(\"UTF-16LE\")");
        d = forName4;
        final Charset forName5 = Charset.forName("US-ASCII");
        k0.o((Object)forName5, "Charset.forName(\"US-ASCII\")");
        e = forName5;
        final Charset forName6 = Charset.forName("ISO-8859-1");
        k0.o((Object)forName6, "Charset.forName(\"ISO-8859-1\")");
        f = forName6;
    }
    
    private f() {
    }
    
    @g(name = "UTF32")
    @e
    public final Charset a() {
        Charset g = kotlin.text.f.g;
        if (g == null) {
            g = Charset.forName("UTF-32");
            k0.o((Object)g, "Charset.forName(\"UTF-32\")");
            kotlin.text.f.g = g;
        }
        return g;
    }
    
    @g(name = "UTF32_BE")
    @e
    public final Charset b() {
        Charset i = kotlin.text.f.i;
        if (i == null) {
            i = Charset.forName("UTF-32BE");
            k0.o((Object)i, "Charset.forName(\"UTF-32BE\")");
            kotlin.text.f.i = i;
        }
        return i;
    }
    
    @g(name = "UTF32_LE")
    @e
    public final Charset c() {
        Charset h = kotlin.text.f.h;
        if (h == null) {
            h = Charset.forName("UTF-32LE");
            k0.o((Object)h, "Charset.forName(\"UTF-32LE\")");
            kotlin.text.f.h = h;
        }
        return h;
    }
}
