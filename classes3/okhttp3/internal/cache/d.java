// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.cache;

import okio.v;
import okio.r0;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Collection;
import org.jetbrains.annotations.f;
import m6.h;
import java.util.List;
import java.util.Objects;
import kotlin.text.s;
import java.io.EOFException;
import java.util.Iterator;
import java.io.FileNotFoundException;
import okio.p0;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import okio.d0;
import java.io.IOException;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import okhttp3.internal.io.a;
import okhttp3.internal.concurrent.c;
import java.util.LinkedHashMap;
import okio.n;
import java.io.File;
import kotlin.text.o;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.io.Flushable;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t*\u0001>\u0018\u0000 f2\u00020\u00012\u00020\u0002:\u0004ghijB9\b\u0000\u0012\u0006\u0010^\u001a\u00020[\u0012\u0006\u0010D\u001a\u000203\u0012\u0006\u0010E\u001a\u000209\u0012\u0006\u0010G\u001a\u000209\u0012\u0006\u00102\u001a\u00020\u0016\u0012\u0006\u0010c\u001a\u00020b¢\u0006\u0004\bd\u0010eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002J \u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007J\u0006\u0010\u001a\u001a\u00020\u0016J#\u0010\u001d\u001a\u00020\u00032\n\u0010\u001b\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010\"\u001a\u00020\u000b2\n\u0010!\u001a\u00060 R\u00020\u0000H\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\u0003H\u0016J\u0006\u0010%\u001a\u00020\u000bJ\b\u0010&\u001a\u00020\u0003H\u0016J\u0006\u0010'\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u0003J\u0006\u0010)\u001a\u00020\u0003J\u0010\u0010+\u001a\f\u0012\b\u0012\u00060\u0014R\u00020\u00000*R*\u00102\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00107R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010\"R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0016\u0010B\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010-R\u0019\u0010D\u001a\u0002038\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u00105\u001a\u0004\b-\u0010CR\u0016\u0010E\u001a\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00107R\u001c\u0010G\u001a\u0002098\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b:\u0010FR\u0016\u0010I\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010-R,\u0010N\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060 R\u00020\u00000J8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010K\u001a\u0004\bL\u0010MR\u0016\u0010O\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00105R\u0016\u0010R\u001a\u00020P8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010QR\u0016\u0010S\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0016\u0010T\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0018\u0010V\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010UR\"\u0010Z\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\"\u001a\u0004\b4\u0010W\"\u0004\bX\u0010YR\u001c\u0010^\u001a\u00020[8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\\\u001a\u0004\bH\u0010]R\u0016\u0010`\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\"R\u0016\u0010a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"¨\u0006k" }, d2 = { "Lokhttp3/internal/cache/d;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lkotlin/j2;", "V", "Lokio/n;", "S", "", "line", "W", "T", "", "R", "t", "a0", "key", "i0", "Q", "X", "()V", "Lokhttp3/internal/cache/d$d;", "G", "", "expectedSequenceNumber", "Lokhttp3/internal/cache/d$b;", "C", "f0", "editor", "success", "w", "(Lokhttp3/internal/cache/d$b;Z)V", "Y", "Lokhttp3/internal/cache/d$c;", "entry", "Z", "(Lokhttp3/internal/cache/d$c;)Z", "flush", "isClosed", "close", "h0", "x", "F", "", "g0", "value", "J", "M", "()J", "e0", "(J)V", "maxSize", "Ljava/io/File;", "H", "Ljava/io/File;", "journalFile", "I", "journalFileTmp", "", "N", "redundantOpCount", "O", "hasJournalErrors", "okhttp3/internal/cache/d$e", "Lokhttp3/internal/cache/d$e;", "cleanupTask", "U", "nextSequenceNumber", "()Ljava/io/File;", "directory", "appVersion", "()I", "valueCount", "K", "size", "Ljava/util/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "L", "()Ljava/util/LinkedHashMap;", "lruEntries", "journalFileBackup", "Lokhttp3/internal/concurrent/c;", "Lokhttp3/internal/concurrent/c;", "cleanupQueue", "mostRecentTrimFailed", "mostRecentRebuildFailed", "Lokio/n;", "journalWriter", "()Z", "d0", "(Z)V", "closed", "Lokhttp3/internal/io/a;", "Lokhttp3/internal/io/a;", "()Lokhttp3/internal/io/a;", "fileSystem", "P", "civilizedFileSystem", "initialized", "Lokhttp3/internal/concurrent/d;", "taskRunner", "<init>", "(Lokhttp3/internal/io/a;Ljava/io/File;IIJLokhttp3/internal/concurrent/d;)V", "m0", "a", "b", "c", "d", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class d implements Closeable, Flushable
{
    @d
    @e
    public static final String b0;
    @d
    @e
    public static final String c0;
    @d
    @e
    public static final String d0;
    @d
    @e
    public static final String e0;
    @d
    @e
    public static final String f0;
    @d
    public static final long g0;
    @d
    @e
    public static final o h0;
    @d
    @e
    public static final String i0;
    @d
    @e
    public static final String j0;
    @d
    @e
    public static final String k0;
    @d
    @e
    public static final String l0;
    public static final a m0;
    private long G;
    private final File H;
    private final File I;
    private final File J;
    private long K;
    private n L;
    @e
    private final LinkedHashMap<String, c> M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private long U;
    private final okhttp3.internal.concurrent.c V;
    private final d$e W;
    @e
    private final okhttp3.internal.io.a X;
    @e
    private final File Y;
    private final int Z;
    private final int a0;
    
    static {
        m0 = new a(null);
        b0 = "journal";
        c0 = "journal.tmp";
        d0 = "journal.bkp";
        e0 = "libcore.io.DiskLruCache";
        f0 = "1";
        g0 = -1L;
        h0 = new o("[a-z0-9_-]{1,120}");
        i0 = "CLEAN";
        j0 = "DIRTY";
        k0 = "REMOVE";
        l0 = "READ";
    }
    
    public d(@e final okhttp3.internal.io.a x, @e final File file, int z, final int a0, final long g, @e final okhttp3.internal.concurrent.d d) {
        kotlin.jvm.internal.k0.p((Object)x, "fileSystem");
        kotlin.jvm.internal.k0.p((Object)file, "directory");
        kotlin.jvm.internal.k0.p((Object)d, "taskRunner");
        this.X = x;
        this.Y = file;
        this.Z = z;
        this.a0 = a0;
        this.G = g;
        final int n = 0;
        this.M = new LinkedHashMap<String, c>(0, 0.75f, true);
        this.V = d.j();
        final StringBuilder sb = new StringBuilder();
        sb.append(okhttp3.internal.d.i);
        sb.append(" Cache");
        this.W = new okhttp3.internal.concurrent.a(sb.toString()) {
            final /* synthetic */ d e;
            
            @Override
            public long f() {
                synchronized (this.e) {
                    if (d.c(this.e) && !this.e.H()) {
                        try {
                            this.e.h0();
                        }
                        catch (IOException ex) {
                            d.r(this.e, true);
                        }
                        try {
                            if (d.this.R()) {
                                this.e.X();
                                d.s(this.e, 0);
                            }
                        }
                        catch (IOException ex2) {
                            d.q(this.e, true);
                            d.o(this.e, okio.d0.c(okio.d0.b()));
                        }
                        return -1L;
                    }
                    return -1L;
                }
            }
        };
        if (g > 0L) {
            z = 1;
        }
        else {
            z = 0;
        }
        if (z == 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        z = n;
        if (a0 > 0) {
            z = 1;
        }
        if (z != 0) {
            this.H = new File(file, d.b0);
            this.I = new File(file, d.c0);
            this.J = new File(file, d.d0);
            return;
        }
        throw new IllegalArgumentException("valueCount <= 0".toString());
    }
    
    public static /* synthetic */ b D(final d d, final String s, long g0, final int n, final Object o) throws IOException {
        if ((n & 0x2) != 0x0) {
            g0 = d.g0;
        }
        return d.C(s, g0);
    }
    
    private final boolean R() {
        final int n = this.N;
        return n >= 2000 && n >= this.M.size();
    }
    
    private final n S() throws FileNotFoundException {
        return okio.d0.c(new okhttp3.internal.cache.e(this.X.g(this.H), (l<? super IOException, j2>)new l<IOException, j2>() {
            final /* synthetic */ d G;
            
            public final void a(@e final IOException ex) {
                kotlin.jvm.internal.k0.p((Object)ex, "it");
                final d g = this.G;
                if (okhttp3.internal.d.h && !Thread.holdsLock(g)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Thread ");
                    final Thread currentThread = Thread.currentThread();
                    kotlin.jvm.internal.k0.o((Object)currentThread, "Thread.currentThread()");
                    sb.append(currentThread.getName());
                    sb.append(" MUST hold lock on ");
                    sb.append(g);
                    throw new AssertionError((Object)sb.toString());
                }
                d.k(this.G, true);
            }
        }));
    }
    
    private final void T() throws IOException {
        this.X.f(this.I);
        final Iterator<c> iterator = this.M.values().iterator();
        while (iterator.hasNext()) {
            final c next = iterator.next();
            kotlin.jvm.internal.k0.o((Object)next, "i.next()");
            final c c = next;
            final b b = c.b();
            final int n = 0;
            int i = 0;
            if (b == null) {
                while (i < this.a0) {
                    this.K += c.e()[i];
                    ++i;
                }
            }
            else {
                c.l(null);
                for (int a0 = this.a0, j = n; j < a0; ++j) {
                    this.X.f(c.a().get(j));
                    this.X.f(c.c().get(j));
                }
                iterator.remove();
            }
        }
    }
    
    private final void V() throws IOException {
        final okio.o d = okio.d0.d(this.X.a(this.H));
        try {
            final String e4 = d.e4();
            final String e5 = d.e4();
            final String e6 = d.e4();
            final String e7 = d.e4();
            final String e8 = d.e4();
            final boolean g = kotlin.jvm.internal.k0.g((Object)okhttp3.internal.cache.d.e0, (Object)e4);
            boolean b = true;
            if (!(g ^ true) && !(kotlin.jvm.internal.k0.g((Object)okhttp3.internal.cache.d.f0, (Object)e5) ^ true) && !(kotlin.jvm.internal.k0.g((Object)String.valueOf(this.Z), (Object)e6) ^ true) && !(kotlin.jvm.internal.k0.g((Object)String.valueOf(this.a0), (Object)e7) ^ true)) {
                final int length = e8.length();
                final int n = 0;
                if (length <= 0) {
                    b = false;
                }
                if (!b) {
                    int n2 = n;
                    try {
                        while (true) {
                            this.W(d.e4());
                            ++n2;
                        }
                    }
                    catch (EOFException ex) {
                        this.N = n2 - this.M.size();
                        if (!d.D1()) {
                            this.X();
                        }
                        else {
                            this.L = this.S();
                        }
                        final j2 a = j2.a;
                        kotlin.io.c.a((Closeable)d, (Throwable)null);
                        return;
                    }
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal header: [");
            sb.append(e4);
            sb.append(", ");
            sb.append(e5);
            sb.append(", ");
            sb.append(e7);
            sb.append(", ");
            sb.append(e8);
            sb.append(']');
            throw new IOException(sb.toString());
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a((Closeable)d, t);
            }
        }
    }
    
    private final void W(String substring) throws IOException {
        final int q3 = s.q3(substring, ' ', 0, false, 6, null);
        if (q3 != -1) {
            final int n = q3 + 1;
            final int q4 = s.q3(substring, ' ', n, false, 4, null);
            Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
            String substring3;
            if (q4 == -1) {
                final String substring2 = substring.substring(n);
                kotlin.jvm.internal.k0.o((Object)substring2, "(this as java.lang.String).substring(startIndex)");
                final String k0 = d.k0;
                substring3 = substring2;
                if (q3 == k0.length()) {
                    substring3 = substring2;
                    if (s.u2(substring, k0, false, 2, null)) {
                        this.M.remove(substring2);
                        return;
                    }
                }
            }
            else {
                substring3 = substring.substring(n, q4);
                kotlin.jvm.internal.k0.o((Object)substring3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            }
            c c;
            if ((c = this.M.get(substring3)) == null) {
                c = new c(substring3);
                this.M.put(substring3, c);
            }
            if (q4 != -1) {
                final String i0 = d.i0;
                if (q3 == i0.length() && s.u2(substring, i0, false, 2, null)) {
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    substring = substring.substring(q4 + 1);
                    kotlin.jvm.internal.k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                    final List r4 = s.R4(substring, new char[] { ' ' }, false, 0, 6, null);
                    c.o(true);
                    c.l(null);
                    c.m(r4);
                    return;
                }
            }
            if (q4 == -1) {
                final String j0 = d.j0;
                if (q3 == j0.length() && s.u2(substring, j0, false, 2, null)) {
                    c.l(new b(c));
                    return;
                }
            }
            if (q4 == -1) {
                final String l0 = d.l0;
                if (q3 == l0.length() && s.u2(substring, l0, false, 2, null)) {
                    return;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(substring);
            throw new IOException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("unexpected journal line: ");
        sb2.append(substring);
        throw new IOException(sb2.toString());
    }
    
    public static final /* synthetic */ boolean a(final d d) {
        return d.P;
    }
    
    private final boolean a0() {
        for (final c c : this.M.values()) {
            if (!c.i()) {
                kotlin.jvm.internal.k0.o((Object)c, "toEvict");
                this.Z(c);
                return true;
            }
        }
        return false;
    }
    
    public static final /* synthetic */ boolean c(final d d) {
        return d.Q;
    }
    
    private final void i0(final String str) {
        if (d.h0.i(str)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
        sb.append(str);
        sb.append('\"');
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final /* synthetic */ void k(final d d, final boolean o) {
        d.O = o;
    }
    
    public static final /* synthetic */ void o(final d d, final n l) {
        d.L = l;
    }
    
    public static final /* synthetic */ void q(final d d, final boolean t) {
        d.T = t;
    }
    
    public static final /* synthetic */ void r(final d d, final boolean s) {
        d.S = s;
    }
    
    public static final /* synthetic */ void s(final d d, final int n) {
        d.N = n;
    }
    
    private final void t() {
        synchronized (this) {
            if (this.R ^ true) {
                return;
            }
            throw new IllegalStateException("cache is closed".toString());
        }
    }
    
    @h
    @f
    public final b C(@e final String key, final long n) throws IOException {
        synchronized (this) {
            kotlin.jvm.internal.k0.p((Object)key, "key");
            this.Q();
            this.t();
            this.i0(key);
            final c c = this.M.get(key);
            if (n != d.g0 && (c == null || c.h() != n)) {
                return null;
            }
            Object b;
            if (c != null) {
                b = c.b();
            }
            else {
                b = null;
            }
            if (b != null) {
                return null;
            }
            if (c != null && c.f() != 0) {
                return null;
            }
            if (this.S || this.T) {
                okhttp3.internal.concurrent.c.p(this.V, this.W, 0L, 2, null);
                return null;
            }
            final n l = this.L;
            kotlin.jvm.internal.k0.m((Object)l);
            l.Q2(d.j0).A(32).Q2(key).A(10);
            l.flush();
            if (this.O) {
                return null;
            }
            c c2;
            if ((c2 = c) == null) {
                c2 = new c(key);
                this.M.put(key, c2);
            }
            final b b2 = new b(c2);
            c2.l(b2);
            return b2;
        }
    }
    
    public final void F() throws IOException {
        synchronized (this) {
            this.Q();
            final Collection<c> values = this.M.values();
            kotlin.jvm.internal.k0.o((Object)values, "lruEntries.values");
            final c[] array = values.toArray(new c[0]);
            if (array != null) {
                for (final c c : array) {
                    kotlin.jvm.internal.k0.o((Object)c, "entry");
                    this.Z(c);
                }
                this.S = false;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
    
    @f
    public final d G(@e final String key) throws IOException {
        synchronized (this) {
            kotlin.jvm.internal.k0.p((Object)key, "key");
            this.Q();
            this.t();
            this.i0(key);
            final c c = this.M.get(key);
            if (c == null) {
                return null;
            }
            kotlin.jvm.internal.k0.o((Object)c, "lruEntries[key] ?: return null");
            final d r = c.r();
            if (r != null) {
                ++this.N;
                final n l = this.L;
                kotlin.jvm.internal.k0.m((Object)l);
                l.Q2(d.l0).A(32).Q2(key).A(10);
                if (this.R()) {
                    okhttp3.internal.concurrent.c.p(this.V, this.W, 0L, 2, null);
                }
                return r;
            }
            return null;
        }
    }
    
    public final boolean H() {
        return this.R;
    }
    
    @e
    public final File J() {
        return this.Y;
    }
    
    @e
    public final okhttp3.internal.io.a K() {
        return this.X;
    }
    
    @e
    public final LinkedHashMap<String, c> L() {
        return this.M;
    }
    
    public final long M() {
        synchronized (this) {
            return this.G;
        }
    }
    
    public final int N() {
        return this.a0;
    }
    
    public final void Q() throws IOException {
        synchronized (this) {
            if (okhttp3.internal.d.h && !Thread.holdsLock(this)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                final Thread currentThread = Thread.currentThread();
                kotlin.jvm.internal.k0.o((Object)currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError((Object)sb.toString());
            }
            if (this.Q) {
                return;
            }
            if (this.X.d(this.J)) {
                if (this.X.d(this.H)) {
                    this.X.f(this.J);
                }
                else {
                    this.X.e(this.J, this.H);
                }
            }
            this.P = okhttp3.internal.d.J(this.X, this.J);
            if (this.X.d(this.H)) {
                try {
                    this.V();
                    this.T();
                    this.Q = true;
                    return;
                }
                catch (IOException ex) {
                    final okhttp3.internal.platform.h g = okhttp3.internal.platform.h.e.g();
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("DiskLruCache ");
                    sb2.append(this.Y);
                    sb2.append(" is corrupt: ");
                    sb2.append(ex.getMessage());
                    sb2.append(", removing");
                    g.m(sb2.toString(), 5, ex);
                    try {
                        this.x();
                    }
                    finally {
                        this.R = false;
                    }
                }
            }
            this.X();
            this.Q = true;
        }
    }
    
    public final void X() throws IOException {
        synchronized (this) {
            final n l = this.L;
            if (l != null) {
                l.close();
            }
            final n c = okio.d0.c(this.X.b(this.I));
            try {
                c.Q2(d.e0).A(10);
                c.Q2(d.f0).A(10);
                c.D5(this.Z).A(10);
                c.D5(this.a0).A(10);
                c.A(10);
                for (final c c2 : this.M.values()) {
                    if (c2.b() != null) {
                        c.Q2(d.j0).A(32);
                        c.Q2(c2.d());
                    }
                    else {
                        c.Q2(d.i0).A(32);
                        c.Q2(c2.d());
                        c2.s(c);
                    }
                    c.A(10);
                }
                final j2 a = j2.a;
                kotlin.io.c.a((Closeable)c, (Throwable)null);
                if (this.X.d(this.H)) {
                    this.X.e(this.H, this.J);
                }
                this.X.e(this.I, this.H);
                this.X.f(this.J);
                this.L = this.S();
                this.O = false;
                this.T = false;
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    kotlin.io.c.a((Closeable)c, t);
                }
            }
        }
    }
    
    public final boolean Y(@e final String key) throws IOException {
        synchronized (this) {
            kotlin.jvm.internal.k0.p((Object)key, "key");
            this.Q();
            this.t();
            this.i0(key);
            final c c = this.M.get(key);
            if (c != null) {
                kotlin.jvm.internal.k0.o((Object)c, "lruEntries[key] ?: return false");
                final boolean z = this.Z(c);
                if (z && this.K <= this.G) {
                    this.S = false;
                }
                return z;
            }
            return false;
        }
    }
    
    public final boolean Z(@e final c c) throws IOException {
        kotlin.jvm.internal.k0.p((Object)c, "entry");
        if (!this.P) {
            if (c.f() > 0) {
                final n l = this.L;
                if (l != null) {
                    l.Q2(d.j0);
                    l.A(32);
                    l.Q2(c.d());
                    l.A(10);
                    l.flush();
                }
            }
            if (c.f() > 0 || c.b() != null) {
                c.q(true);
                return true;
            }
        }
        final b b = c.b();
        if (b != null) {
            b.c();
        }
        for (int i = 0; i < this.a0; ++i) {
            this.X.f(c.a().get(i));
            this.K -= c.e()[i];
            c.e()[i] = 0L;
        }
        ++this.N;
        final n j = this.L;
        if (j != null) {
            j.Q2(d.k0);
            j.A(32);
            j.Q2(c.d());
            j.A(10);
        }
        this.M.remove(c.d());
        if (this.R()) {
            c.p(this.V, this.W, 0L, 2, null);
        }
        return true;
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this) {
            if (!this.Q || this.R) {
                this.R = true;
                return;
            }
            final Collection<c> values = this.M.values();
            kotlin.jvm.internal.k0.o((Object)values, "lruEntries.values");
            int i = 0;
            final c[] array = values.toArray(new c[0]);
            if (array != null) {
                for (c[] array2 = array; i < array2.length; ++i) {
                    final c c = array2[i];
                    if (c.b() != null) {
                        final b b = c.b();
                        if (b != null) {
                            b.c();
                        }
                    }
                }
                this.h0();
                final n l = this.L;
                kotlin.jvm.internal.k0.m((Object)l);
                l.close();
                this.L = null;
                this.R = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
    
    public final void d0(final boolean r) {
        this.R = r;
    }
    
    public final void e0(final long g) {
        synchronized (this) {
            this.G = g;
            if (this.Q) {
                okhttp3.internal.concurrent.c.p(this.V, this.W, 0L, 2, null);
            }
        }
    }
    
    public final long f0() throws IOException {
        synchronized (this) {
            this.Q();
            return this.K;
        }
    }
    
    @Override
    public void flush() throws IOException {
        synchronized (this) {
            if (!this.Q) {
                return;
            }
            this.t();
            this.h0();
            final n l = this.L;
            kotlin.jvm.internal.k0.m((Object)l);
            l.flush();
        }
    }
    
    @e
    public final Iterator<d> g0() throws IOException {
        synchronized (this) {
            this.Q();
            return new Iterator<d>() {
                private final Iterator<c> G;
                private d H;
                private d I;
                final /* synthetic */ d J;
                
                {
                    final Iterator<c> iterator = new ArrayList<c>((Collection<? extends c>)d.this.L().values()).iterator();
                    kotlin.jvm.internal.k0.o((Object)iterator, "ArrayList(lruEntries.values).iterator()");
                    this.G = iterator;
                }
                
                @e
                public d a() {
                    if (this.hasNext()) {
                        final d h = this.H;
                        this.I = h;
                        this.H = null;
                        kotlin.jvm.internal.k0.m((Object)h);
                        return h;
                    }
                    throw new NoSuchElementException();
                }
                
                @Override
                public boolean hasNext() {
                    if (this.H != null) {
                        return true;
                    }
                    synchronized (this.J) {
                        if (this.J.H()) {
                            return false;
                        }
                        while (this.G.hasNext()) {
                            final c c = this.G.next();
                            if (c != null) {
                                final d r = c.r();
                                if (r != null) {
                                    this.H = r;
                                    return true;
                                }
                                continue;
                            }
                        }
                        final j2 a = j2.a;
                        return false;
                    }
                }
                
                @Override
                public void remove() {
                    final d i = this.I;
                    if (i == null) {
                        goto Label_0038;
                    }
                    try {
                        this.J.Y(i.d());
                        goto Label_0032;
                    }
                    catch (IOException ex) {
                        goto Label_0032;
                    }
                    finally {
                        this.I = null;
                    }
                }
            };
        }
    }
    
    public final void h0() throws IOException {
        while (this.K > this.G) {
            if (!this.a0()) {
                return;
            }
        }
        this.S = false;
    }
    
    public final boolean isClosed() {
        synchronized (this) {
            return this.R;
        }
    }
    
    public final void w(@e final b b, final boolean b2) throws IOException {
        synchronized (this) {
            kotlin.jvm.internal.k0.p((Object)b, "editor");
            final c d = b.d();
            if (!kotlin.jvm.internal.k0.g((Object)d.b(), (Object)b)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            final int n = 0;
            if (b2 && !d.g()) {
                for (int a0 = this.a0, i = 0; i < a0; ++i) {
                    final boolean[] e = b.e();
                    kotlin.jvm.internal.k0.m((Object)e);
                    if (!e[i]) {
                        b.a();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }
                    if (!this.X.d(d.c().get(i))) {
                        b.a();
                        return;
                    }
                }
            }
            for (int a2 = this.a0, j = n; j < a2; ++j) {
                final File file = d.c().get(j);
                if (b2 && !d.i()) {
                    if (this.X.d(file)) {
                        final File file2 = d.a().get(j);
                        this.X.e(file, file2);
                        final long n2 = d.e()[j];
                        final long h = this.X.h(file2);
                        d.e()[j] = h;
                        this.K = this.K - n2 + h;
                    }
                }
                else {
                    this.X.f(file);
                }
            }
            d.l(null);
            if (d.i()) {
                this.Z(d);
                return;
            }
            ++this.N;
            final n l = this.L;
            kotlin.jvm.internal.k0.m((Object)l);
            if (!d.g() && !b2) {
                this.M.remove(d.d());
                l.Q2(okhttp3.internal.cache.d.k0).A(32);
                l.Q2(d.d());
                l.A(10);
            }
            else {
                d.o(true);
                l.Q2(okhttp3.internal.cache.d.i0).A(32);
                l.Q2(d.d());
                d.s(l);
                l.A(10);
                if (b2) {
                    final long u = this.U;
                    this.U = 1L + u;
                    d.p(u);
                }
            }
            l.flush();
            if (this.K > this.G || this.R()) {
                okhttp3.internal.concurrent.c.p(this.V, this.W, 0L, 2, null);
            }
        }
    }
    
    public final void x() throws IOException {
        this.close();
        this.X.c(this.Y);
    }
    
    @h
    @f
    public final b y(@e final String s) throws IOException {
        return D(this, s, 0L, 2, null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\r\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0010\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0011\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0016\u0010\u0012\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0015" }, d2 = { "okhttp3/internal/cache/d$a", "", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lkotlin/text/o;", "LEGAL_KEY_PATTERN", "Lkotlin/text/o;", "MAGIC", "READ", "REMOVE", "VERSION_1", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0017\u001a\u00060\u0012R\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\u00060\u0012R\u00020\u00138\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001d" }, d2 = { "okhttp3/internal/cache/d$b", "", "Lkotlin/j2;", "c", "()V", "", "index", "Lokio/r0;", "g", "Lokio/p0;", "f", "b", "a", "", "[Z", "e", "()[Z", "written", "Lokhttp3/internal/cache/d$c;", "Lokhttp3/internal/cache/d;", "Lokhttp3/internal/cache/d$c;", "d", "()Lokhttp3/internal/cache/d$c;", "entry", "", "Z", "done", "<init>", "(Lokhttp3/internal/cache/d;Lokhttp3/internal/cache/d$c;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public final class b
    {
        @f
        private final boolean[] a;
        private boolean b;
        @e
        private final c c;
        final /* synthetic */ d d;
        
        public b(final c c) {
            kotlin.jvm.internal.k0.p((Object)c, "entry");
            this.c = c;
            boolean[] a;
            if (c.g()) {
                a = null;
            }
            else {
                a = new boolean[okhttp3.internal.cache.d.this.N()];
            }
            this.a = a;
        }
        
        public final void a() throws IOException {
            synchronized (okhttp3.internal.cache.d.this) {
                if (this.b ^ true) {
                    if (kotlin.jvm.internal.k0.g((Object)this.c.b(), (Object)this)) {
                        okhttp3.internal.cache.d.this.w(this, false);
                    }
                    this.b = true;
                    final j2 a = j2.a;
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        
        public final void b() throws IOException {
            synchronized (okhttp3.internal.cache.d.this) {
                if (this.b ^ true) {
                    if (kotlin.jvm.internal.k0.g((Object)this.c.b(), (Object)this)) {
                        okhttp3.internal.cache.d.this.w(this, true);
                    }
                    this.b = true;
                    final j2 a = j2.a;
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        
        public final void c() {
            if (kotlin.jvm.internal.k0.g((Object)this.c.b(), (Object)this)) {
                if (okhttp3.internal.cache.d.a(okhttp3.internal.cache.d.this)) {
                    okhttp3.internal.cache.d.this.w(this, false);
                }
                else {
                    this.c.q(true);
                }
            }
        }
        
        @e
        public final c d() {
            return this.c;
        }
        
        @f
        public final boolean[] e() {
            return this.a;
        }
        
        @e
        public final p0 f(final int n) {
            synchronized (okhttp3.internal.cache.d.this) {
                if (this.b ^ true) {
                    if (kotlin.jvm.internal.k0.g((Object)this.c.b(), (Object)this) ^ true) {
                        return okio.d0.b();
                    }
                    if (!this.c.g()) {
                        final boolean[] a = this.a;
                        kotlin.jvm.internal.k0.m((Object)a);
                        a[n] = true;
                    }
                    final File file = this.c.c().get(n);
                    try {
                        return new okhttp3.internal.cache.e(okhttp3.internal.cache.d.this.K().b(file), (l<? super IOException, j2>)new l<IOException, j2>() {
                            final /* synthetic */ b G;
                            
                            public final void a(@e final IOException ex) {
                                kotlin.jvm.internal.k0.p((Object)ex, "it");
                                synchronized (this.G.d) {
                                    this.G.c();
                                    final j2 a = j2.a;
                                }
                            }
                        });
                    }
                    catch (FileNotFoundException ex) {
                        return okio.d0.b();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        
        @f
        public final r0 g(final int p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        okhttp3/internal/cache/d$b.d:Lokhttp3/internal/cache/d;
            //     4: astore_2       
            //     5: aload_2        
            //     6: monitorenter   
            //     7: aload_0        
            //     8: getfield        okhttp3/internal/cache/d$b.b:Z
            //    11: iconst_1       
            //    12: ixor           
            //    13: ifeq            105
            //    16: aload_0        
            //    17: getfield        okhttp3/internal/cache/d$b.c:Lokhttp3/internal/cache/d$c;
            //    20: invokevirtual   okhttp3/internal/cache/d$c.g:()Z
            //    23: istore_3       
            //    24: aconst_null    
            //    25: astore          4
            //    27: iload_3        
            //    28: ifeq            101
            //    31: aload_0        
            //    32: getfield        okhttp3/internal/cache/d$b.c:Lokhttp3/internal/cache/d$c;
            //    35: invokevirtual   okhttp3/internal/cache/d$c.b:()Lokhttp3/internal/cache/d$b;
            //    38: aload_0        
            //    39: invokestatic    kotlin/jvm/internal/k0.g:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //    42: iconst_1       
            //    43: ixor           
            //    44: ifne            101
            //    47: aload_0        
            //    48: getfield        okhttp3/internal/cache/d$b.c:Lokhttp3/internal/cache/d$c;
            //    51: invokevirtual   okhttp3/internal/cache/d$c.i:()Z
            //    54: istore_3       
            //    55: iload_3        
            //    56: ifeq            62
            //    59: goto            101
            //    62: aload_0        
            //    63: getfield        okhttp3/internal/cache/d$b.d:Lokhttp3/internal/cache/d;
            //    66: invokevirtual   okhttp3/internal/cache/d.K:()Lokhttp3/internal/io/a;
            //    69: aload_0        
            //    70: getfield        okhttp3/internal/cache/d$b.c:Lokhttp3/internal/cache/d$c;
            //    73: invokevirtual   okhttp3/internal/cache/d$c.a:()Ljava/util/List;
            //    76: iload_1        
            //    77: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
            //    82: checkcast       Ljava/io/File;
            //    85: invokeinterface okhttp3/internal/io/a.a:(Ljava/io/File;)Lokio/r0;
            //    90: astore          5
            //    92: aload           5
            //    94: astore          4
            //    96: aload_2        
            //    97: monitorexit    
            //    98: aload           4
            //   100: areturn        
            //   101: aload_2        
            //   102: monitorexit    
            //   103: aconst_null    
            //   104: areturn        
            //   105: new             Ljava/lang/IllegalStateException;
            //   108: astore          4
            //   110: aload           4
            //   112: ldc             "Check failed."
            //   114: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
            //   117: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
            //   120: aload           4
            //   122: athrow         
            //   123: astore          4
            //   125: aload_2        
            //   126: monitorexit    
            //   127: aload           4
            //   129: athrow         
            //   130: astore          5
            //   132: goto            96
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                           
            //  -----  -----  -----  -----  -------------------------------
            //  7      24     123    130    Any
            //  31     55     123    130    Any
            //  62     92     130    135    Ljava/io/FileNotFoundException;
            //  62     92     123    130    Any
            //  105    123    123    130    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0062:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0018\u00010\u0012R\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\u00020\u00038\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u00020\u001b8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u0016\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\b\u0012\u0004\u0012\u00020(0'8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001c\u0010+R\"\u0010/\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R(\u00106\u001a\b\u0018\u000100R\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b)\u00103\"\u0004\b4\u00105R\"\u0010;\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\b1\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?\"\u0004\b@\u0010AR\"\u0010D\u001a\b\u0012\u0004\u0012\u00020(0'8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010*\u001a\u0004\bC\u0010+¨\u0006G" }, d2 = { "okhttp3/internal/cache/d$c", "", "", "", "strings", "", "j", "", "index", "Lokio/r0;", "k", "Lkotlin/j2;", "m", "(Ljava/util/List;)V", "Lokio/n;", "writer", "s", "(Lokio/n;)V", "Lokhttp3/internal/cache/d$d;", "Lokhttp3/internal/cache/d;", "r", "()Lokhttp3/internal/cache/d$d;", "i", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "key", "", "a", "[J", "e", "()[J", "lengths", "", "Z", "()Z", "q", "(Z)V", "zombie", "", "Ljava/io/File;", "b", "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "g", "o", "readable", "Lokhttp3/internal/cache/d$b;", "f", "Lokhttp3/internal/cache/d$b;", "()Lokhttp3/internal/cache/d$b;", "l", "(Lokhttp3/internal/cache/d$b;)V", "currentEditor", "I", "()I", "n", "(I)V", "lockingSourceCount", "", "h", "J", "()J", "p", "(J)V", "sequenceNumber", "c", "dirtyFiles", "<init>", "(Lokhttp3/internal/cache/d;Ljava/lang/String;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public final class c
    {
        @e
        private final long[] a;
        @e
        private final List<File> b;
        @e
        private final List<File> c;
        private boolean d;
        private boolean e;
        @f
        private b f;
        private int g;
        private long h;
        @e
        private final String i;
        final /* synthetic */ d j;
        
        public c(final String s) {
            kotlin.jvm.internal.k0.p((Object)s, "key");
            this.i = s;
            this.a = new long[okhttp3.internal.cache.d.this.N()];
            this.b = new ArrayList<File>();
            this.c = new ArrayList<File>();
            final StringBuilder sb = new StringBuilder(s);
            sb.append('.');
            final int length = sb.length();
            for (int n = okhttp3.internal.cache.d.this.N(), i = 0; i < n; ++i) {
                sb.append(i);
                this.b.add(new File(okhttp3.internal.cache.d.this.J(), sb.toString()));
                sb.append(".tmp");
                this.c.add(new File(okhttp3.internal.cache.d.this.J(), sb.toString()));
                sb.setLength(length);
            }
        }
        
        private final Void j(final List<String> obj) throws IOException {
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(obj);
            throw new IOException(sb.toString());
        }
        
        private final r0 k(final int n) {
            final r0 a = okhttp3.internal.cache.d.this.K().a(this.b.get(n));
            if (okhttp3.internal.cache.d.a(okhttp3.internal.cache.d.this)) {
                return a;
            }
            ++this.g;
            return new v(a) {
                private boolean G;
                final /* synthetic */ c H;
                
                @Override
                public void close() {
                    super.close();
                    if (!this.G) {
                        this.G = true;
                        synchronized (this.H.j) {
                            final c h = this.H;
                            h.n(h.f() - 1);
                            if (this.H.f() == 0 && this.H.i()) {
                                final c h2 = this.H;
                                h2.j.Z(h2);
                            }
                            final j2 a = j2.a;
                        }
                    }
                }
            };
        }
        
        @e
        public final List<File> a() {
            return this.b;
        }
        
        @f
        public final b b() {
            return this.f;
        }
        
        @e
        public final List<File> c() {
            return this.c;
        }
        
        @e
        public final String d() {
            return this.i;
        }
        
        @e
        public final long[] e() {
            return this.a;
        }
        
        public final int f() {
            return this.g;
        }
        
        public final boolean g() {
            return this.d;
        }
        
        public final long h() {
            return this.h;
        }
        
        public final boolean i() {
            return this.e;
        }
        
        public final void l(@f final b f) {
            this.f = f;
        }
        
        public final void m(@e final List<String> list) throws IOException {
            kotlin.jvm.internal.k0.p((Object)list, "strings");
            if (list.size() == okhttp3.internal.cache.d.this.N()) {
                int i = 0;
                try {
                    while (i < list.size()) {
                        this.a[i] = Long.parseLong(list.get(i));
                        ++i;
                    }
                    return;
                }
                catch (NumberFormatException ex) {
                    this.j(list);
                    throw new kotlin.w();
                }
            }
            this.j(list);
            throw new kotlin.w();
        }
        
        public final void n(final int g) {
            this.g = g;
        }
        
        public final void o(final boolean d) {
            this.d = d;
        }
        
        public final void p(final long h) {
            this.h = h;
        }
        
        public final void q(final boolean e) {
            this.e = e;
        }
        
        @f
        public final d r() {
            final d j = okhttp3.internal.cache.d.this;
            if (okhttp3.internal.d.h && !Thread.holdsLock(j)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                final Thread currentThread = Thread.currentThread();
                kotlin.jvm.internal.k0.o((Object)currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(j);
                throw new AssertionError((Object)sb.toString());
            }
            if (!this.d) {
                return null;
            }
            if (!okhttp3.internal.cache.d.a(okhttp3.internal.cache.d.this) && (this.f != null || this.e)) {
                return null;
            }
            final ArrayList<r0> list = new ArrayList<r0>();
            final long[] array = this.a.clone();
            int i = 0;
            try {
                while (i < okhttp3.internal.cache.d.this.N()) {
                    list.add(this.k(i));
                    ++i;
                }
                return new d(this.i, this.h, list, array);
            }
            catch (FileNotFoundException ex) {
                final Iterator<Object> iterator = list.iterator();
                while (iterator.hasNext()) {
                    okhttp3.internal.d.l(iterator.next());
                }
                try {
                    okhttp3.internal.cache.d.this.Z(this);
                    return null;
                }
                catch (IOException ex2) {}
            }
        }
        
        public final void s(@e final n n) throws IOException {
            kotlin.jvm.internal.k0.p((Object)n, "writer");
            final long[] a = this.a;
            for (int length = a.length, i = 0; i < length; ++i) {
                n.A(32).D5(a[i]);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010¨\u0006\u001e" }, d2 = { "okhttp3/internal/cache/d$d", "Ljava/io/Closeable;", "", "d", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "a", "", "index", "Lokio/r0;", "c", "", "b", "Lkotlin/j2;", "close", "", "J", "[J", "lengths", "G", "Ljava/lang/String;", "key", "", "I", "Ljava/util/List;", "sources", "H", "sequenceNumber", "<init>", "(Lokhttp3/internal/cache/d;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public final class d implements Closeable
    {
        private final String G;
        private final long H;
        private final List<r0> I;
        private final long[] J;
        
        public d(final String g, @e final long h, @e final List<? extends r0> i, final long[] j) {
            kotlin.jvm.internal.k0.p((Object)g, "key");
            kotlin.jvm.internal.k0.p((Object)i, "sources");
            kotlin.jvm.internal.k0.p((Object)j, "lengths");
            this.G = g;
            this.H = h;
            this.I = (List<r0>)i;
            this.J = j;
        }
        
        @f
        public final b a() throws IOException {
            return okhttp3.internal.cache.d.this.C(this.G, this.H);
        }
        
        public final long b(final int n) {
            return this.J[n];
        }
        
        @e
        public final r0 c(final int n) {
            return this.I.get(n);
        }
        
        @Override
        public void close() {
            final Iterator<r0> iterator = this.I.iterator();
            while (iterator.hasNext()) {
                okhttp3.internal.d.l(iterator.next());
            }
        }
        
        @e
        public final String d() {
            return this.G;
        }
    }
}
