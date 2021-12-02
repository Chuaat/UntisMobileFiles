// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io.path;

import java.util.List;
import java.io.InputStream;
import java.util.Iterator;
import kotlin.jvm.internal.h0;
import kotlin.io.z;
import kotlin.j2;
import n6.l;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.nio.file.StandardOpenOption;
import java.io.OutputStream;
import java.io.Closeable;
import kotlin.io.c;
import java.io.OutputStreamWriter;
import org.jetbrains.annotations.e;
import kotlin.o2;
import kotlin.internal.f;
import kotlin.e1;
import java.io.IOException;
import kotlin.jvm.internal.k0;
import java.nio.file.Files;
import java.util.Arrays;
import kotlin.sequences.p;
import java.nio.file.OpenOption;
import java.nio.charset.Charset;
import kotlin.sequences.m;
import java.nio.file.Path;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\b\u001a2\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a<\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a<\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0087\b\u001a0\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00142\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0014H\u0087\b\u001a\u0016\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a9\u0010\u001f\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a=\u0010'\u001a\u00020\u0017*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00170\"H\u0087\b\u00f8\u0001\u0000\u001a(\u0010)\u001a\u00020(*\u00020\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b)\u0010*\u001a(\u0010,\u001a\u00020+*\u00020\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b,\u0010-\u001a\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b0.*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001aA\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u00100*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b01\u0012\u0004\u0012\u00028\u00000\"H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b3\u00104\u001a@\u00107\u001a\u00020\u0000*\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d052\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b7\u00108\u001a@\u00109\u001a\u00020\u0000*\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b9\u0010:\u001a%\u0010;\u001a\u00020\u0000*\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d052\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a%\u0010<\u001a\u00020\u0000*\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006=" }, d2 = { "Ljava/nio/file/Path;", "Ljava/nio/charset/Charset;", "charset", "", "Ljava/nio/file/OpenOption;", "options", "Ljava/io/InputStreamReader;", "u", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "", "bufferSize", "Ljava/io/BufferedReader;", "h", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "Ljava/io/OutputStreamWriter;", "F", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "Ljava/io/BufferedWriter;", "j", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "", "p", "array", "Lkotlin/j2;", "y", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "a", "", "s", "", "text", "D", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "f", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "line", "action", "l", "Ljava/io/InputStream;", "n", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "Ljava/io/OutputStream;", "o", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "", "q", "T", "Lkotlin/sequences/m;", "block", "w", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Ln6/l;)Ljava/lang/Object;", "", "lines", "z", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "A", "(Ljava/nio/file/Path;Lkotlin/sequences/m;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "b", "c", "kotlin-stdlib-jdk7" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/io/path/PathsKt")
class d
{
    public d() {
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path A(Path write, final m<? extends CharSequence> m, final Charset cs, final OpenOption... original) throws IOException {
        write = Files.write(write, p.G((m)m), cs, (OpenOption[])Arrays.copyOf(original, original.length));
        k0.o(write, "Files.write(this, lines.\u2026ble(), charset, *options)");
        return write;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { a.class })
    public static final void D(@e Path path, @e final CharSequence csq, @e final Charset cs, @e final OpenOption... original) throws IOException {
        k0.p(path, "$this$writeText");
        k0.p(csq, "text");
        k0.p(cs, "charset");
        k0.p(original, "options");
        final OutputStream outputStream = Files.newOutputStream(path, (OpenOption[])Arrays.copyOf(original, original.length));
        k0.o(outputStream, "Files.newOutputStream(this, *options)");
        path = (Path)new OutputStreamWriter(outputStream, cs);
        try {
            ((OutputStreamWriter)path).append(csq);
            c.a((Closeable)path, null);
        }
        finally {
            try {}
            finally {
                c.a((Closeable)path, (Throwable)csq);
            }
        }
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final OutputStreamWriter F(final Path path, final Charset cs, final OpenOption... original) throws IOException {
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[])Arrays.copyOf(original, original.length)), cs);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final void a(final Path path, final byte[] bytes) throws IOException {
        Files.write(path, bytes, StandardOpenOption.APPEND);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path b(Path write, final Iterable<? extends CharSequence> lines, final Charset cs) throws IOException {
        write = Files.write(write, lines, cs, StandardOpenOption.APPEND);
        k0.o(write, "Files.write(this, lines,\u2026tandardOpenOption.APPEND)");
        return write;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path c(Path write, final m<? extends CharSequence> m, final Charset cs) throws IOException {
        write = Files.write(write, p.G((m)m), cs, StandardOpenOption.APPEND);
        k0.o(write, "Files.write(this, lines.\u2026tandardOpenOption.APPEND)");
        return write;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { a.class })
    public static final void f(@e Path path, @e final CharSequence csq, @e final Charset cs) throws IOException {
        k0.p(path, "$this$appendText");
        k0.p(csq, "text");
        k0.p(cs, "charset");
        final OutputStream outputStream = Files.newOutputStream(path, StandardOpenOption.APPEND);
        k0.o(outputStream, "Files.newOutputStream(th\u2026tandardOpenOption.APPEND)");
        path = (Path)new OutputStreamWriter(outputStream, cs);
        try {
            ((OutputStreamWriter)path).append(csq);
            c.a((Closeable)path, null);
        }
        finally {
            try {}
            finally {
                c.a((Closeable)path, (Throwable)csq);
            }
        }
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final BufferedReader h(final Path path, final Charset cs, final int sz, final OpenOption... original) throws IOException {
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[])Arrays.copyOf(original, original.length)), cs), sz);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final BufferedWriter j(final Path path, final Charset cs, final int sz, final OpenOption... original) throws IOException {
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[])Arrays.copyOf(original, original.length)), cs), sz);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final void l(Path bufferedReader, final Charset cs, final l<? super String, j2> l) throws IOException {
        bufferedReader = Files.newBufferedReader((Path)bufferedReader, cs);
        k0.o(bufferedReader, "Files.newBufferedReader(this, charset)");
        if (!(bufferedReader instanceof BufferedReader)) {
            bufferedReader = new BufferedReader((Reader)bufferedReader, 8192);
        }
        try {
            final Iterator iterator = z.h((BufferedReader)bufferedReader).iterator();
            while (iterator.hasNext()) {
                l.invoke(iterator.next());
            }
            final j2 a = j2.a;
            h0.d(1);
            if (kotlin.internal.l.a(1, 1, 0)) {
                c.a((Closeable)bufferedReader, null);
            }
            else {
                ((Closeable)bufferedReader).close();
            }
            h0.c(1);
        }
        finally {
            try {}
            finally {
                h0.d(1);
                Label_0131: {
                    if (kotlin.internal.l.a(1, 1, 0)) {
                        break Label_0131;
                    }
                    try {
                        ((Closeable)bufferedReader).close();
                        h0.c(1);
                        break Label_0131;
                        c.a((Closeable)bufferedReader, (Throwable)l);
                    }
                    finally {}
                }
            }
        }
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final InputStream n(final Path path, final OpenOption... original) throws IOException {
        final InputStream inputStream = Files.newInputStream(path, (OpenOption[])Arrays.copyOf(original, original.length));
        k0.o(inputStream, "Files.newInputStream(this, *options)");
        return inputStream;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final OutputStream o(final Path path, final OpenOption... original) throws IOException {
        final OutputStream outputStream = Files.newOutputStream(path, (OpenOption[])Arrays.copyOf(original, original.length));
        k0.o(outputStream, "Files.newOutputStream(this, *options)");
        return outputStream;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final byte[] p(final Path path) throws IOException {
        final byte[] allBytes = Files.readAllBytes(path);
        k0.o(allBytes, "Files.readAllBytes(this)");
        return allBytes;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final List<String> q(final Path path, final Charset cs) throws IOException {
        final List<String> allLines = Files.readAllLines(path, cs);
        k0.o(allLines, "Files.readAllLines(this, charset)");
        return allLines;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { a.class })
    @e
    public static final String s(@e Path path, @e final Charset cs) throws IOException {
        k0.p(path, "$this$readText");
        k0.p(cs, "charset");
        path = (Path)new InputStreamReader(Files.newInputStream(path, (OpenOption[])Arrays.copyOf(new OpenOption[0], 0)), cs);
        try {
            final String k = z.k((Reader)path);
            c.a((Closeable)path, null);
            return k;
        }
        finally {
            try {}
            finally {
                c.a((Closeable)path, (Throwable)cs);
            }
        }
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final InputStreamReader u(final Path path, final Charset cs, final OpenOption... original) throws IOException {
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[])Arrays.copyOf(original, original.length)), cs);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final <T> T w(Path bufferedReader, final Charset cs, final l<? super m<String>, ? extends T> l) throws IOException {
        bufferedReader = (Path)Files.newBufferedReader(bufferedReader, cs);
        try {
            k0.o(bufferedReader, "it");
            final T invoke = l.invoke(z.h((BufferedReader)bufferedReader));
            h0.d(1);
            if (kotlin.internal.l.a(1, 1, 0)) {
                c.a((Closeable)bufferedReader, null);
            }
            else if (bufferedReader != null) {
                ((Closeable)bufferedReader).close();
            }
            h0.c(1);
            return invoke;
        }
        finally {
            try {}
            finally {
                h0.d(1);
                Label_0094: {
                    if (kotlin.internal.l.a(1, 1, 0)) {
                        break Label_0094;
                    }
                    Label_0099: {
                        if (bufferedReader == null) {
                            break Label_0099;
                        }
                        try {
                            ((Closeable)bufferedReader).close();
                            h0.c(1);
                            break Label_0094;
                            c.a((Closeable)bufferedReader, (Throwable)l);
                        }
                        finally {}
                    }
                }
            }
        }
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final void y(final Path path, final byte[] bytes, final OpenOption... original) throws IOException {
        Files.write(path, bytes, (OpenOption[])Arrays.copyOf(original, original.length));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path z(Path write, final Iterable<? extends CharSequence> lines, final Charset cs, final OpenOption... original) throws IOException {
        write = Files.write(write, lines, cs, (OpenOption[])Arrays.copyOf(original, original.length));
        k0.o(write, "Files.write(this, lines, charset, *options)");
        return write;
    }
}
