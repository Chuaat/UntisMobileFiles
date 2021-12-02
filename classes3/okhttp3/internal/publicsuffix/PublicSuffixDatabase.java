// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.publicsuffix;

import okhttp3.internal.d;
import org.jetbrains.annotations.f;
import n6.l;
import kotlin.sequences.m;
import kotlin.sequences.p;
import java.net.IDN;
import java.io.InterruptedIOException;
import java.io.IOException;
import okio.o;
import java.io.InputStream;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.j2;
import okio.r0;
import okio.y;
import okio.d0;
import java.nio.charset.Charset;
import kotlin.text.s;
import java.util.Objects;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.k0;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014¨\u0006\u001d" }, d2 = { "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "", "i", "domainLabels", "d", "Lkotlin/j2;", "g", "f", "e", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "[B", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "c", "<init>", "()V", "j", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class PublicSuffixDatabase
{
    @e
    public static final String e = "publicsuffixes.gz";
    private static final byte[] f;
    private static final List<String> g;
    private static final char h = '!';
    private static final PublicSuffixDatabase i;
    public static final a j;
    private final AtomicBoolean a;
    private final CountDownLatch b;
    private byte[] c;
    private byte[] d;
    
    static {
        j = new a(null);
        f = new byte[] { 42 };
        g = v.k((Object)"*");
        i = new PublicSuffixDatabase();
    }
    
    public PublicSuffixDatabase() {
        this.a = new AtomicBoolean(false);
        this.b = new CountDownLatch(1);
    }
    
    public static final /* synthetic */ PublicSuffixDatabase a() {
        return PublicSuffixDatabase.i;
    }
    
    private final List<String> d(final List<String> list) {
        if (!this.a.get() && this.a.compareAndSet(false, true)) {
            this.g();
        }
        else {
            try {
                this.b.await();
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        final int size = list.size();
        final byte[][] array = new byte[size][];
        for (int i = 0; i < size; ++i) {
            final String obj = list.get(i);
            final Charset utf_8 = StandardCharsets.UTF_8;
            k0.o((Object)utf_8, "UTF_8");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
            final byte[] bytes = obj.getBytes(utf_8);
            k0.o((Object)bytes, "(this as java.lang.String).getBytes(charset)");
            array[i] = bytes;
        }
        int n = 0;
        String s;
        String a;
        while (true) {
            s = null;
            if (n >= size) {
                a = null;
                break;
            }
            final a j = PublicSuffixDatabase.j;
            final byte[] c = this.c;
            if (c == null) {
                k0.S("publicSuffixListBytes");
            }
            a = j.b(c, array, n);
            if (a != null) {
                break;
            }
            ++n;
        }
        String a2 = null;
        Label_0277: {
            if (size > 1) {
                final byte[][] array2 = array.clone();
                for (int length = array2.length, k = 0; k < length - 1; ++k) {
                    array2[k] = PublicSuffixDatabase.f;
                    final a l = PublicSuffixDatabase.j;
                    final byte[] c2 = this.c;
                    if (c2 == null) {
                        k0.S("publicSuffixListBytes");
                    }
                    a2 = l.b(c2, array2, k);
                    if (a2 != null) {
                        break Label_0277;
                    }
                }
            }
            a2 = null;
        }
        String a3 = s;
        if (a2 != null) {
            int n2 = 0;
            while (true) {
                a3 = s;
                if (n2 >= size - 1) {
                    break;
                }
                final a m = PublicSuffixDatabase.j;
                final byte[] d = this.d;
                if (d == null) {
                    k0.S("publicSuffixExceptionListBytes");
                }
                a3 = m.b(d, array, n2);
                if (a3 != null) {
                    break;
                }
                ++n2;
            }
        }
        if (a3 != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append('!');
            sb.append(a3);
            return (List<String>)kotlin.text.s.R4(sb.toString(), new char[] { '.' }, false, 0, 6, null);
        }
        if (a == null && a2 == null) {
            return PublicSuffixDatabase.g;
        }
        List<String> list2 = null;
        Label_0439: {
            if (a != null) {
                list2 = (List<String>)kotlin.text.s.R4(a, new char[] { '.' }, false, 0, 6, null);
                if (list2 != null) {
                    break Label_0439;
                }
            }
            list2 = (List<String>)v.E();
        }
        List list3 = null;
        Label_0472: {
            if (a2 != null) {
                list3 = kotlin.text.s.R4(a2, new char[] { '.' }, false, 0, 6, null);
                if (list3 != null) {
                    break Label_0472;
                }
            }
            list3 = v.E();
        }
        if (list2.size() <= list3.size()) {
            list2 = (List<String>)list3;
        }
        return list2;
    }
    
    private final void f() throws IOException {
        final InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            final o d = d0.d(new y(d0.s(resourceAsStream)));
            try {
                final byte[] v4 = d.v4(d.readInt());
                final byte[] v5 = d.v4(d.readInt());
                final j2 a = j2.a;
                kotlin.io.c.a((Closeable)d, (Throwable)null);
                synchronized (this) {
                    k0.m((Object)v4);
                    this.c = v4;
                    k0.m((Object)v5);
                    this.d = v5;
                    // monitorexit(this)
                    this.b.countDown();
                }
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    kotlin.io.c.a((Closeable)d, t);
                }
            }
        }
    }
    
    private final void g() {
        final boolean b = false;
        try {
            try {
                this.f();
                if (b) {
                    Thread.currentThread().interrupt();
                }
            }
            finally {
                if (b) {
                    Thread.currentThread().interrupt();
                }
                Thread.currentThread().interrupt();
            }
        }
        catch (IOException ex) {}
        catch (InterruptedIOException ex2) {}
    }
    
    private final List<String> i(final String s) {
        List list2;
        final List list = list2 = s.R4(s, new char[] { 46 }, (boolean)(0 != 0), 0, 6, null);
        if (k0.g((Object)v.c3(list), (Object)"")) {
            list2 = v.Q1(list, 1);
        }
        return (List<String>)list2;
    }
    
    @f
    public final String e(@e final String input) {
        k0.p((Object)input, "domain");
        final String unicode = IDN.toUnicode(input);
        k0.o((Object)unicode, "unicodeDomain");
        final List<String> i = this.i(unicode);
        final List<String> d = this.d(i);
        if (i.size() == d.size() && d.get(0).charAt(0) != '!') {
            return null;
        }
        final char char1 = d.get(0).charAt(0);
        final int size = i.size();
        int size2 = d.size();
        if (char1 != '!') {
            ++size2;
        }
        return p.X0(p.d0((m<?>)v.n1((Iterable)this.i(input)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
    
    public final void h(@e final byte[] c, @e final byte[] d) {
        k0.p((Object)c, "publicSuffixListBytes");
        k0.p((Object)d, "publicSuffixExceptionListBytes");
        this.c = c;
        this.d = d;
        this.a.set(true);
        this.b.countDown();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a" }, d2 = { "okhttp3/internal/publicsuffix/PublicSuffixDatabase$a", "", "", "", "labels", "", "labelIndex", "", "b", "([B[[BI)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        private final String b(final byte[] bytes, final byte[][] array, final int n) {
            int length = bytes.length;
            int i = 0;
            while (i < length) {
                int n2;
                for (n2 = (i + length) / 2; n2 > -1 && bytes[n2] != (byte)10; --n2) {}
                final int offset = n2 + 1;
                int n3 = 1;
                int n4;
                while (true) {
                    n4 = offset + n3;
                    if (bytes[n4] == (byte)10) {
                        break;
                    }
                    ++n3;
                }
                final int length2 = n4 - offset;
                int n5 = n;
                int n6 = 0;
                int n7 = 0;
                int n8 = 0;
                int n9;
                while (true) {
                    int b;
                    if (n6 != 0) {
                        b = 46;
                        n6 = 0;
                    }
                    else {
                        b = okhttp3.internal.d.b(array[n5][n7], 255);
                    }
                    n9 = b - okhttp3.internal.d.b(bytes[offset + n8], 255);
                    if (n9 != 0) {
                        break;
                    }
                    ++n8;
                    ++n7;
                    if (n8 == length2) {
                        break;
                    }
                    if (array[n5].length != n7) {
                        continue;
                    }
                    if (n5 == array.length - 1) {
                        break;
                    }
                    ++n5;
                    n6 = 1;
                    n7 = -1;
                }
                Label_0192: {
                    if (n9 >= 0) {
                        if (n9 <= 0) {
                            final int n10 = length2 - n8;
                            int n11 = array[n5].length - n7;
                            for (int j = n5 + 1; j < array.length; ++j) {
                                n11 += array[j].length;
                            }
                            if (n11 < n10) {
                                break Label_0192;
                            }
                            if (n11 <= n10) {
                                final Charset utf_8 = StandardCharsets.UTF_8;
                                k0.o((Object)utf_8, "UTF_8");
                                return new String(bytes, offset, length2, utf_8);
                            }
                        }
                        i = n4 + 1;
                        continue;
                    }
                }
                length = offset - 1;
            }
            return null;
        }
        
        @e
        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.a();
        }
    }
}
