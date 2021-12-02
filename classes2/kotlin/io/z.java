// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.jvm.internal.h0;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.io.StringWriter;
import kotlin.jvm.internal.m0;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;
import java.net.URL;
import kotlin.sequences.p;
import kotlin.sequences.m;
import java.util.Iterator;
import java.io.Closeable;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.io.BufferedWriter;
import java.io.Writer;
import kotlin.internal.f;
import java.io.BufferedReader;
import java.io.Reader;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u001e\u0010\f\u001a\u00020\n*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u001a\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r*\u00020\u0000\u001a:\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u00020\u00002\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0010\u0012\u0004\u0012\u00028\u00000\bH\u0086\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0015*\u00020\tH\u0087\b\u001a\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0010*\u00020\u0003\u001a\n\u0010\u0018\u001a\u00020\t*\u00020\u0000\u001a\u001c\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u0017\u0010\u001f\u001a\u00020\t*\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0087\b\u001a\n\u0010!\u001a\u00020 *\u00020\u001c\u0082\u0002\u000f\n\u0006\b\u0011(\u00120\u0001\n\u0005\b\u009920\u0001¨\u0006\"" }, d2 = { "Ljava/io/Reader;", "", "bufferSize", "Ljava/io/BufferedReader;", "a", "Ljava/io/Writer;", "Ljava/io/BufferedWriter;", "b", "Lkotlin/Function1;", "", "Lkotlin/j2;", "action", "g", "", "j", "T", "Lkotlin/sequences/m;", "block", "Requires newer compiler version to be inlined correctly.", "o", "(Ljava/io/Reader;Ln6/l;)Ljava/lang/Object;", "Ljava/io/StringReader;", "n", "h", "k", "out", "", "e", "Ljava/net/URL;", "Ljava/nio/charset/Charset;", "charset", "l", "", "i", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "TextStreamsKt")
public final class z
{
    @f
    private static final BufferedReader a(final Reader in, final int sz) {
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
    private static final BufferedWriter b(final Writer out, final int sz) {
        BufferedWriter bufferedWriter;
        if (out instanceof BufferedWriter) {
            bufferedWriter = (BufferedWriter)out;
        }
        else {
            bufferedWriter = new BufferedWriter(out, sz);
        }
        return bufferedWriter;
    }
    
    public static final long e(@e final Reader reader, @e final Writer writer, int i) {
        k0.p(reader, "$this$copyTo");
        k0.p(writer, "out");
        final char[] array = new char[i];
        i = reader.read(array);
        long n = 0L;
        while (i >= 0) {
            writer.write(array, 0, i);
            n += i;
            i = reader.read(array);
        }
        return n;
    }
    
    public static /* synthetic */ long f(final Reader reader, final Writer writer, int n, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 8192;
        }
        return e(reader, writer, n);
    }
    
    public static final void g(@e Reader in, @e final l<? super String, j2> l) {
        k0.p(in, "$this$forEachLine");
        k0.p(l, "action");
        if (in instanceof BufferedReader) {
            in = in;
        }
        else {
            in = new BufferedReader(in, 8192);
        }
        try {
            final Iterator iterator = h((BufferedReader)in).iterator();
            while (iterator.hasNext()) {
                l.invoke(iterator.next());
            }
            final j2 a = j2.a;
            c.a(in, null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                c.a(in, t);
            }
        }
    }
    
    @e
    public static final m<String> h(@e final BufferedReader bufferedReader) {
        k0.p(bufferedReader, "$this$lineSequence");
        return (m<String>)p.i((m)new u(bufferedReader));
    }
    
    @e
    public static final byte[] i(@e URL openStream) {
        k0.p(openStream, "$this$readBytes");
        openStream = (URL)openStream.openStream();
        try {
            k0.o(openStream, "it");
            final byte[] p = b.p((InputStream)openStream);
            c.a((Closeable)openStream, null);
            return p;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                c.a((Closeable)openStream, t);
            }
        }
    }
    
    @e
    public static final List<String> j(@e final Reader reader) {
        k0.p(reader, "$this$readLines");
        final ArrayList<String> list = new ArrayList<String>();
        g(reader, new l<String, j2>() {
            public final void invoke(@e final String e) {
                k0.p(e, "it");
                list.add(e);
            }
        });
        return list;
    }
    
    @e
    public static final String k(@e final Reader reader) {
        k0.p(reader, "$this$readText");
        final StringWriter stringWriter = new StringWriter();
        f(reader, stringWriter, 0, 2, null);
        final String string = stringWriter.toString();
        k0.o(string, "buffer.toString()");
        return string;
    }
    
    @f
    private static final String l(final URL url, final Charset charset) {
        return new String(i(url), charset);
    }
    
    @f
    private static final StringReader n(final String s) {
        return new StringReader(s);
    }
    
    public static final <T> T o(@e Reader in, @e final l<? super m<String>, ? extends T> l) {
        k0.p(in, "$this$useLines");
        k0.p(l, "block");
        if (in instanceof BufferedReader) {
            in = in;
        }
        else {
            in = new BufferedReader(in, 8192);
        }
        try {
            final T invoke = l.invoke(h((BufferedReader)in));
            h0.d(1);
            if (kotlin.internal.l.a(1, 1, 0)) {
                c.a(in, null);
            }
            else {
                in.close();
            }
            h0.c(1);
            return invoke;
        }
        finally {
            try {}
            finally {
                h0.d(1);
                Label_0109: {
                    if (kotlin.internal.l.a(1, 1, 0)) {
                        break Label_0109;
                    }
                    try {
                        in.close();
                        h0.c(1);
                        break Label_0109;
                        final Throwable t;
                        c.a(in, t);
                    }
                    finally {}
                }
            }
        }
    }
}
