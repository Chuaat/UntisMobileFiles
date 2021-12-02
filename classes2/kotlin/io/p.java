// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.jvm.internal.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import kotlin.j2;
import java.io.FileOutputStream;
import java.io.Closeable;
import kotlin.jvm.internal.h0;
import java.io.Reader;
import java.io.BufferedReader;
import kotlin.jvm.internal.k0;
import kotlin.sequences.m;
import n6.l;
import org.jetbrains.annotations.e;
import kotlin.internal.f;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a!\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0087\b\u001a\u0017\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a!\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0087\b\u001a\u0017\u0010\u000e\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0000\u001a\u0012\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000f\u001a\u0012\u0010\u0014\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000f\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0018\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0019\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001aB\u0010 \u001a\u00020\u0012*\u00020\u000026\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00120\u001a\u001aJ\u0010\"\u001a\u00020\u0012*\u00020\u00002\u0006\u0010!\u001a\u00020\u000526\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00120\u001a\u001a7\u0010%\u001a\u00020\u0012*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00120#\u001a\r\u0010'\u001a\u00020&*\u00020\u0000H\u0087\b\u001a\r\u0010)\u001a\u00020(*\u00020\u0000H\u0087\b\u001a\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150**\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001aD\u00100\u001a\u00028\u0000\"\u0004\b\u0000\u0010,*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0018\u0010.\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150-\u0012\u0004\u0012\u00028\u00000#H\u0086\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b0\u00101\u0082\u0002\u000f\n\u0006\b\u0011(/0\u0001\n\u0005\b\u009920\u0001¨\u00062" }, d2 = { "Ljava/io/File;", "Ljava/nio/charset/Charset;", "charset", "Ljava/io/InputStreamReader;", "A", "", "bufferSize", "Ljava/io/BufferedReader;", "j", "Ljava/io/OutputStreamWriter;", "H", "Ljava/io/BufferedWriter;", "l", "Ljava/io/PrintWriter;", "t", "", "v", "array", "Lkotlin/j2;", "E", "g", "", "y", "text", "F", "h", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "buffer", "bytesRead", "action", "o", "blockSize", "n", "Lkotlin/Function1;", "line", "p", "Ljava/io/FileInputStream;", "r", "Ljava/io/FileOutputStream;", "s", "", "w", "T", "Lkotlin/sequences/m;", "block", "Requires newer compiler version to be inlined correctly.", "C", "(Ljava/io/File;Ljava/nio/charset/Charset;Ln6/l;)Ljava/lang/Object;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/io/FilesKt")
class p extends o
{
    public p() {
    }
    
    @f
    private static final InputStreamReader A(final File file, final Charset cs) {
        return new InputStreamReader(new FileInputStream(file), cs);
    }
    
    public static final <T> T C(@e File file, @e final Charset cs, @e final l<? super m<String>, ? extends T> l) {
        k0.p(file, "$this$useLines");
        k0.p(cs, "charset");
        k0.p(l, "block");
        final InputStreamReader in = new InputStreamReader(new FileInputStream((File)file), cs);
        if (in instanceof BufferedReader) {
            file = in;
        }
        else {
            file = new BufferedReader(in, 8192);
        }
        try {
            final T invoke = l.invoke(z.h((BufferedReader)file));
            h0.d(1);
            if (kotlin.internal.l.a(1, 1, 0)) {
                c.a((Closeable)file, null);
            }
            else {
                ((Closeable)file).close();
            }
            h0.c(1);
            return invoke;
        }
        finally {
            try {}
            finally {
                h0.d(1);
                Label_0132: {
                    if (kotlin.internal.l.a(1, 1, 0)) {
                        break Label_0132;
                    }
                    try {
                        ((Closeable)file).close();
                        h0.c(1);
                        break Label_0132;
                        c.a((Closeable)file, (Throwable)l);
                    }
                    finally {}
                }
            }
        }
    }
    
    public static final void E(@e File file, @e final byte[] b) {
        k0.p(file, "$this$writeBytes");
        k0.p(b, "array");
        file = (File)new FileOutputStream(file);
        try {
            ((FileOutputStream)file).write(b);
            final j2 a = j2.a;
            c.a((Closeable)file, null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                c.a((Closeable)file, t);
            }
        }
    }
    
    public static final void F(@e final File file, @e final String s, @e final Charset charset) {
        k0.p(file, "$this$writeText");
        k0.p(s, "text");
        k0.p(charset, "charset");
        final byte[] bytes = s.getBytes(charset);
        k0.o(bytes, "(this as java.lang.String).getBytes(charset)");
        E(file, bytes);
    }
    
    @f
    private static final OutputStreamWriter H(final File file, final Charset cs) {
        return new OutputStreamWriter(new FileOutputStream(file), cs);
    }
    
    public static final void g(@e File file, @e final byte[] b) {
        k0.p(file, "$this$appendBytes");
        k0.p(b, "array");
        file = (File)new FileOutputStream(file, true);
        try {
            ((FileOutputStream)file).write(b);
            final j2 a = j2.a;
            c.a((Closeable)file, null);
        }
        finally {
            try {}
            finally {
                c.a((Closeable)file, (Throwable)(Object)b);
            }
        }
    }
    
    public static final void h(@e final File file, @e final String s, @e final Charset charset) {
        k0.p(file, "$this$appendText");
        k0.p(s, "text");
        k0.p(charset, "charset");
        final byte[] bytes = s.getBytes(charset);
        k0.o(bytes, "(this as java.lang.String).getBytes(charset)");
        g(file, bytes);
    }
    
    @f
    private static final BufferedReader j(final File file, final Charset cs, final int sz) {
        final InputStreamReader in = new InputStreamReader(new FileInputStream(file), cs);
        BufferedReader bufferedReader;
        if (in instanceof BufferedReader) {
            bufferedReader = (BufferedReader)in;
        }
        else {
            bufferedReader = new BufferedReader(in, sz);
        }
        return bufferedReader;
    }
    
    @f
    private static final BufferedWriter l(final File file, final Charset cs, final int sz) {
        final OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(file), cs);
        BufferedWriter bufferedWriter;
        if (out instanceof BufferedWriter) {
            bufferedWriter = (BufferedWriter)out;
        }
        else {
            bufferedWriter = new BufferedWriter(out, sz);
        }
        return bufferedWriter;
    }
    
    public static final void n(@e File file, int read, @e final n6.p<? super byte[], ? super Integer, j2> p2) {
        k0.p(file, "$this$forEachBlock");
        k0.p(p2, "action");
        final byte[] b = new byte[kotlin.ranges.o.n(read, 512)];
        file = (File)new FileInputStream(file);
        try {
            while (true) {
                read = ((FileInputStream)file).read(b);
                if (read <= 0) {
                    break;
                }
                p2.invoke(b, read);
            }
            final j2 a = j2.a;
            c.a((Closeable)file, null);
        }
        finally {
            try {}
            finally {
                c.a((Closeable)file, (Throwable)p2);
            }
        }
    }
    
    public static final void o(@e final File file, @e final n6.p<? super byte[], ? super Integer, j2> p2) {
        k0.p(file, "$this$forEachBlock");
        k0.p(p2, "action");
        n(file, 4096, p2);
    }
    
    public static final void p(@e final File file, @e final Charset cs, @e final l<? super String, j2> l) {
        k0.p(file, "$this$forEachLine");
        k0.p(cs, "charset");
        k0.p(l, "action");
        z.g(new BufferedReader(new InputStreamReader(new FileInputStream(file), cs)), l);
    }
    
    @f
    private static final FileInputStream r(final File file) {
        return new FileInputStream(file);
    }
    
    @f
    private static final FileOutputStream s(final File file) {
        return new FileOutputStream(file);
    }
    
    @f
    private static final PrintWriter t(final File file, final Charset cs) {
        final OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(file), cs);
        BufferedWriter out2;
        if (out instanceof BufferedWriter) {
            out2 = (BufferedWriter)out;
        }
        else {
            out2 = new BufferedWriter(out, 8192);
        }
        return new PrintWriter(out2);
    }
    
    @e
    public static final byte[] v(@e final File obj) {
        k0.p(obj, "$this$readBytes");
        final FileInputStream fileInputStream = new FileInputStream(obj);
        try {
            final long length = obj.length();
            if (length <= Integer.MAX_VALUE) {
                final int n = (int)length;
                final byte[] original = new byte[n];
                int i;
                int n2;
                int read;
                for (i = n, n2 = 0; i > 0; i -= read, n2 += read) {
                    read = fileInputStream.read(original, n2, i);
                    if (read < 0) {
                        break;
                    }
                }
                byte[] array;
                if (i > 0) {
                    array = Arrays.copyOf(original, n2);
                    k0.o(array, "java.util.Arrays.copyOf(this, newSize)");
                }
                else {
                    final int read2 = fileInputStream.read();
                    if (read2 == -1) {
                        array = original;
                    }
                    else {
                        final g g = new g(8193);
                        g.write(read2);
                        b.l(fileInputStream, g, 0, 2, null);
                        final int newLength = g.size() + n;
                        if (newLength < 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("File ");
                            sb.append(obj);
                            sb.append(" is too big to fit in memory.");
                            throw new OutOfMemoryError(sb.toString());
                        }
                        final byte[] a = g.a();
                        final byte[] copy = Arrays.copyOf(original, newLength);
                        k0.o(copy, "java.util.Arrays.copyOf(this, newSize)");
                        array = kotlin.collections.m.W0(a, copy, n, 0, g.size());
                    }
                }
                c.a(fileInputStream, null);
                return array;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("File ");
            sb2.append(obj);
            sb2.append(" is too big (");
            sb2.append(length);
            sb2.append(" bytes) to fit in memory.");
            throw new OutOfMemoryError(sb2.toString());
        }
        finally {
            try {}
            finally {
                final Throwable t;
                c.a(fileInputStream, t);
            }
        }
    }
    
    @e
    public static final List<String> w(@e final File file, @e final Charset charset) {
        k0.p(file, "$this$readLines");
        k0.p(charset, "charset");
        final ArrayList<String> list = new ArrayList<String>();
        p(file, charset, new l<String, j2>() {
            public final void invoke(@e final String e) {
                k0.p(e, "it");
                list.add(e);
            }
        });
        return list;
    }
    
    @e
    public static final String y(@e File file, @e final Charset cs) {
        k0.p(file, "$this$readText");
        k0.p(cs, "charset");
        file = (File)new InputStreamReader(new FileInputStream(file), cs);
        try {
            final String k = z.k((Reader)file);
            c.a((Closeable)file, null);
            return k;
        }
        finally {
            try {}
            finally {
                c.a((Closeable)file, (Throwable)cs);
            }
        }
    }
}
