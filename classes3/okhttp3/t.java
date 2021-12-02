// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.util.ArrayList;
import org.jetbrains.annotations.f;
import m6.h;
import java.nio.charset.Charset;
import m6.g;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import java.io.IOException;
import okio.m;
import okio.n;
import okhttp3.internal.d;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0013\u0012B%\b\u0000\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001c\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\u001b\u0010\n¨\u0006 " }, d2 = { "Lokhttp3/t;", "Lokhttp3/f0;", "Lokio/n;", "sink", "", "countBytes", "", "y", "", "s", "()I", "index", "", "t", "v", "u", "x", "Lokhttp3/y;", "b", "a", "Lkotlin/j2;", "r", "", "Ljava/util/List;", "encodedNames", "c", "encodedValues", "w", "size", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "e", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class t extends f0
{
    private static final y d;
    public static final b e;
    private final List<String> b;
    private final List<String> c;
    
    static {
        e = new b(null);
        d = y.i.c("application/x-www-form-urlencoded");
    }
    
    public t(@e final List<String> list, @e final List<String> list2) {
        k0.p((Object)list, "encodedNames");
        k0.p((Object)list2, "encodedValues");
        this.b = okhttp3.internal.d.c0((List<? extends String>)list);
        this.c = okhttp3.internal.d.c0((List<? extends String>)list2);
    }
    
    private final long y(final n n, final boolean b) {
        m z;
        if (b) {
            z = new m();
        }
        else {
            k0.m((Object)n);
            z = n.z();
        }
        for (int i = 0; i < this.b.size(); ++i) {
            if (i > 0) {
                z.G0(38);
            }
            z.p1(this.b.get(i));
            z.G0(61);
            z.p1(this.c.get(i));
        }
        long h0;
        if (b) {
            h0 = z.h0();
            z.c();
        }
        else {
            h0 = 0L;
        }
        return h0;
    }
    
    @Override
    public long a() {
        return this.y(null, true);
    }
    
    @e
    @Override
    public y b() {
        return t.d;
    }
    
    @Override
    public void r(@e final n n) throws IOException {
        k0.p((Object)n, "sink");
        this.y(n, false);
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "size", imports = {}))
    @g(name = "-deprecated_size")
    public final int s() {
        return this.w();
    }
    
    @e
    public final String t(final int n) {
        return this.b.get(n);
    }
    
    @e
    public final String u(final int n) {
        return this.c.get(n);
    }
    
    @e
    public final String v(final int n) {
        return okhttp3.w.b.n(okhttp3.w.w, this.t(n), 0, 0, true, 3, null);
    }
    
    @g(name = "size")
    public final int w() {
        return this.b.size();
    }
    
    @e
    public final String x(final int n) {
        return okhttp3.w.b.n(okhttp3.w.w, this.u(n), 0, 0, true, 3, null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0013" }, d2 = { "okhttp3/t$a", "", "", "name", "value", "Lokhttp3/t$a;", "a", "b", "Lokhttp3/t;", "c", "", "Ljava/util/List;", "names", "values", "Ljava/nio/charset/Charset;", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private final List<String> a;
        private final List<String> b;
        private final Charset c;
        
        @h
        public a() {
            this(null, 1, null);
        }
        
        @h
        public a(@f final Charset c) {
            this.c = c;
            this.a = new ArrayList<String>();
            this.b = new ArrayList<String>();
        }
        
        @e
        public final a a(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "value");
            final List<String> a = this.a;
            final okhttp3.w.b w = okhttp3.w.w;
            a.add(okhttp3.w.b.f(w, s, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.c, 91, null));
            this.b.add(okhttp3.w.b.f(w, s2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.c, 91, null));
            return this;
        }
        
        @e
        public final a b(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "value");
            final List<String> a = this.a;
            final okhttp3.w.b w = okhttp3.w.w;
            a.add(okhttp3.w.b.f(w, s, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.c, 83, null));
            this.b.add(okhttp3.w.b.f(w, s2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.c, 83, null));
            return this;
        }
        
        @e
        public final t c() {
            return new t(this.a, this.b);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "okhttp3/t$b", "", "Lokhttp3/y;", "CONTENT_TYPE", "Lokhttp3/y;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
    }
}
