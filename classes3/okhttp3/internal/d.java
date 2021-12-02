// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal;

import java.util.Locale;
import kotlin.jvm.internal.p1;
import kotlin.jvm.internal.q1;
import n6.l;
import java.util.Arrays;
import java.net.ServerSocket;
import java.io.Closeable;
import okio.n;
import java.util.LinkedHashMap;
import kotlin.collections.y0;
import java.util.Map;
import java.util.Collections;
import java.util.Collection;
import okhttp3.w;
import java.util.Iterator;
import kotlin.ranges.k;
import okhttp3.internal.http2.c;
import java.util.List;
import kotlin.j2;
import java.util.concurrent.ThreadFactory;
import okio.t0;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import okio.r0;
import okio.m;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import kotlin.text.f;
import java.nio.charset.Charset;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.SocketTimeoutException;
import java.io.IOException;
import java.net.Socket;
import java.io.File;
import okhttp3.internal.io.a;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.text.s;
import okhttp3.c0;
import kotlin.jvm.internal.k0;
import okio.p;
import okhttp3.y;
import kotlin.text.o;
import java.util.TimeZone;
import okio.g0;
import okhttp3.f0;
import okhttp3.h0;
import okhttp3.v;
import org.jetbrains.annotations.e;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¼\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010&\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010'\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010(\u001a\u00020\b*\u00020\u0006\u001a)\u0010,\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0\f\"\u00020*¢\u0006\u0004\b,\u0010-\u001a\u0012\u00101\u001a\u00020/*\u00020.2\u0006\u00100\u001a\u00020/\u001a \u00105\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u000103\u001a\n\u00106\u001a\u00020\u0018*\u00020$\u001a\u0010\u0010:\u001a\u000209*\b\u0012\u0004\u0012\u00020807\u001a\u0010\u0010;\u001a\b\u0012\u0004\u0012\u00020807*\u000209\u001a\u0012\u0010<\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010?\u001a\u00020>*\u00020=\u001a\u0015\u0010B\u001a\u00020\u0018*\u00020@2\u0006\u0010A\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010D\u001a\u00020\u0018*\u00020C2\u0006\u0010A\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010E\u001a\u00020\u0000*\u00020\u00182\u0006\u0010A\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010H\u001a\u00020\u0004*\u00020F2\u0006\u0010G\u001a\u00020\u0018\u001a\n\u0010I\u001a\u00020\u0018*\u00020.\u001a\u001a\u0010L\u001a\u00020\b*\u00020J2\u0006\u00102\u001a\u00020\u00182\u0006\u0010K\u001a\u000203\u001a\u001a\u0010N\u001a\u00020\b*\u00020J2\u0006\u0010M\u001a\u00020\u00182\u0006\u0010K\u001a\u000203\u001a\n\u0010P\u001a\u00020\u0006*\u00020O\u001a\u0012\u0010R\u001a\u00020\b*\u00020O2\u0006\u0010Q\u001a\u00020.\u001a\u001a\u0010U\u001a\u00020\u00042\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00040SH\u0086\b\u00f8\u0001\u0000\u001a\"\u0010V\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00040SH\u0086\b\u00f8\u0001\u0000\u001a\u0012\u0010X\u001a\u00020\u0018*\u00020W2\u0006\u0010B\u001a\u00020@\u001a\u0014\u0010Y\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010[\u001a\u00020\u0000*\u00020Z\u001a\u0012\u0010]\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\\\u001a\u00020\u0000\u001a\u0014\u0010^\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010\\\u001a\u00020\u0018\u001a\u001c\u0010_\u001a\b\u0012\u0004\u0012\u00028\u000007\"\u0004\b\u0000\u0010L*\b\u0012\u0004\u0012\u00028\u000007\u001a/\u0010a\u001a\b\u0012\u0004\u0012\u00028\u000007\"\u0004\b\u0000\u0010L2\u0012\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\ba\u0010b\u001a.\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\"\u0004\b\u0000\u0010R\"\u0004\b\u0001\u0010V*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\u001a\n\u0010f\u001a\u00020\u0004*\u00020e\u001a\n\u0010g\u001a\u00020\u0004*\u00020O\u001a\n\u0010i\u001a\u00020\u0004*\u00020h\u001a\u0012\u0010m\u001a\u00020\b*\u00020j2\u0006\u0010l\u001a\u00020k\u001a\n\u0010n\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010o\u001a\u00020\u0006*\u00020\u0018\u001a\r\u0010p\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010q\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010r\u001a\u00020\u0004*\u00020*H\u0086\b\u001a3\u0010w\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010L2\u0006\u0010s\u001a\u00020*2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t2\u0006\u0010v\u001a\u00020\u0006¢\u0006\u0004\bw\u0010x\u001a'\u0010{\u001a\u00020\u0004\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000y2\u0006\u0010z\u001a\u00028\u0000H\u0000¢\u0006\u0004\b{\u0010|\u001a\r\u0010}\u001a\u00020\u0004*\u00020*H\u0080\b\u001a\r\u0010~\u001a\u00020\u0004*\u00020*H\u0080\b\u001a%\u0010\u0083\u0001\u001a\u00030\u0082\u0001*\u00070\u007fj\u0003`\u0080\u00012\u0012\u0010\u0081\u0001\u001a\r\u0012\t\u0012\u00070\u007fj\u0003`\u0080\u000107\u001a@\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00028\u000007\"\u0004\b\u0000\u0010L*\t\u0012\u0004\u0012\u00028\u00000\u0084\u00012\u001a\u0010\u0087\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0085\u0001¢\u0006\u0003\b\u0086\u0001H\u0086\b\u00f8\u0001\u0000\"\u0019\u0010\u008b\u0001\u001a\u00030\u0089\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b{\u0010\u008a\u0001\"\u0017\u0010\u008c\u0001\u001a\u00020\b8\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b(\u0010n\"\u0019\u0010\u008f\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b}\u0010\u008e\u0001\"\u0019\u0010\u0092\u0001\u001a\u00030\u0090\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\bD\u0010\u0091\u0001\"\u0019\u0010\u0095\u0001\u001a\u00030\u0093\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\bE\u0010\u0094\u0001\"\u0019\u0010\u0098\u0001\u001a\u00030\u0096\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b~\u0010\u0097\u0001\"\u0018\u0010\u009a\u0001\u001a\u00020\u00068\u0000@\u0001X\u0081\u0004¢\u0006\u0007\n\u0005\b<\u0010\u0099\u0001\"\u0019\u0010\u009d\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010\u009c\u0001\"\u0018\u0010\u009e\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b5\u0010\u0099\u0001\"\u0018\u0010 \u0001\u001a\u0002098\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\bB\u0010\u009f\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006¡\u0001" }, d2 = { "", "arrayLength", "offset", "count", "Lkotlin/j2;", "k", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "U", "", "other", "Ljava/util/Comparator;", "comparator", "I", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "w", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/w;", "includeDefaultPort", "a0", "value", "", "A", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "o", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "C", "E", "g0", "delimiters", "q", "", "delimiter", "p", "B", "h", "format", "", "args", "v", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/o;", "Ljava/nio/charset/Charset;", "default", "P", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "j", "N", "", "Lokhttp3/internal/http2/c;", "Lokhttp3/v;", "X", "W", "i", "Lokhttp3/s;", "Lokhttp3/s$c;", "e", "", "mask", "b", "", "c", "d", "Lokio/n;", "medium", "k0", "R", "Lokio/r0;", "timeUnit", "T", "timeout", "t", "Ljava/net/Socket;", "O", "source", "K", "Lkotlin/Function0;", "block", "y", "V", "Lokio/m;", "S", "G", "Lokhttp3/g0;", "x", "defaultValue", "e0", "f0", "c0", "elements", "z", "([Ljava/lang/Object;)Ljava/util/List;", "", "d0", "Ljava/io/Closeable;", "l", "n", "Ljava/net/ServerSocket;", "m", "Lokhttp3/internal/io/a;", "Ljava/io/File;", "file", "J", "Z", "Y", "i0", "L", "M", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "Q", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "", "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "g", "f", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "j0", "", "Lkotlin/Function1;", "Lkotlin/s;", "predicate", "u", "", "[B", "EMPTY_BYTE_ARRAY", "assertionsEnabled", "Lkotlin/text/o;", "Lkotlin/text/o;", "VERIFY_AS_IP_ADDRESS", "Lokhttp3/h0;", "Lokhttp3/h0;", "EMPTY_RESPONSE", "Lokhttp3/f0;", "Lokhttp3/f0;", "EMPTY_REQUEST", "Ljava/util/TimeZone;", "Ljava/util/TimeZone;", "UTC", "Ljava/lang/String;", "okHttpName", "Lokio/g0;", "Lokio/g0;", "UNICODE_BOMS", "userAgent", "Lokhttp3/v;", "EMPTY_HEADERS", "okhttp" }, k = 2, mv = { 1, 4, 0 })
@g(name = "Util")
public final class d
{
    @m6.d
    @e
    public static final byte[] a;
    @m6.d
    @e
    public static final v b;
    @m6.d
    @e
    public static final h0 c;
    @m6.d
    @e
    public static final f0 d;
    private static final g0 e;
    @m6.d
    @e
    public static final TimeZone f;
    private static final o g;
    @m6.d
    public static final boolean h;
    @m6.d
    @e
    public static final String i;
    @e
    public static final String j = "okhttp/4.9.0";
    
    static {
        final byte[] array = a = new byte[0];
        b = v.H.j(new String[0]);
        c = h0.b.l(h0.Companion, array, null, 1, null);
        d = f0.a.r(f0.a, array, null, 0, 0, 7, null);
        final g0.a j = g0.J;
        final p.a l = p.L;
        e = j.d(l.i("efbbbf"), l.i("feff"), l.i("fffe"), l.i("0000ffff"), l.i("ffff0000"));
        final TimeZone timeZone = TimeZone.getTimeZone("GMT");
        k0.m((Object)timeZone);
        f = timeZone;
        g = new o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        h = false;
        final String name = c0.class.getName();
        k0.o((Object)name, "OkHttpClient::class.java.name");
        i = s.i4(s.c4(name, "okhttp3."), "Client");
    }
    
    public static final int A(@e final String[] array, @e final String s, @e final Comparator<String> comparator) {
        k0.p((Object)array, "$this$indexOf");
        k0.p((Object)s, "value");
        k0.p((Object)comparator, "comparator");
        for (int length = array.length, i = 0; i < length; ++i) {
            if (comparator.compare(array[i], s) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static final int B(@e final String s) {
        k0.p((Object)s, "$this$indexOfControlOrNonAscii");
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (k0.t((int)char1, 31) <= 0 || k0.t((int)char1, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static final int C(@e final String s, int i, final int n) {
        k0.p((Object)s, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < n) {
            final char char1 = s.charAt(i);
            if (char1 != '\t' && char1 != '\n' && char1 != '\f' && char1 != '\r' && char1 != ' ') {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static final int E(@e final String s, final int n, int index) {
        k0.p((Object)s, "$this$indexOfLastNonAsciiWhitespace");
        if (--index >= n) {
            while (true) {
                final char char1 = s.charAt(index);
                if (char1 != '\t' && char1 != '\n' && char1 != '\f' && char1 != '\r' && char1 != ' ') {
                    return index + 1;
                }
                if (index == n) {
                    break;
                }
                --index;
            }
        }
        return n;
    }
    
    public static final int G(@e final String s, int i) {
        k0.p((Object)s, "$this$indexOfNonWhitespace");
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (char1 != ' ' && char1 != '\t') {
                return i;
            }
            ++i;
        }
        return s.length();
    }
    
    @e
    public static final String[] I(@e final String[] array, @e final String[] array2, @e final Comparator<? super String> comparator) {
        k0.p((Object)array, "$this$intersect");
        k0.p((Object)array2, "other");
        k0.p((Object)comparator, "comparator");
        final ArrayList<String> list = new ArrayList<String>();
        for (final String s : array) {
            for (int length2 = array2.length, j = 0; j < length2; ++j) {
                if (comparator.compare(s, array2[j]) == 0) {
                    list.add(s);
                    break;
                }
            }
        }
        final String[] array3 = list.toArray(new String[0]);
        Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
        return array3;
    }
    
    public static final boolean J(@e final a p0, @e final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$isCivilized"
        //     4: invokestatic    kotlin/jvm/internal/k0.p:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1        
        //     8: ldc_w           "file"
        //    11: invokestatic    kotlin/jvm/internal/k0.p:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0        
        //    15: aload_1        
        //    16: invokeinterface okhttp3/internal/io/a.b:(Ljava/io/File;)Lokio/p0;
        //    21: astore_2       
        //    22: aload_0        
        //    23: aload_1        
        //    24: invokeinterface okhttp3/internal/io/a.f:(Ljava/io/File;)V
        //    29: aload_2        
        //    30: aconst_null    
        //    31: invokestatic    kotlin/io/c.a:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //    34: iconst_1       
        //    35: ireturn        
        //    36: astore_1       
        //    37: goto            59
        //    40: astore_3       
        //    41: getstatic       kotlin/j2.a:Lkotlin/j2;
        //    44: astore_3       
        //    45: aload_2        
        //    46: aconst_null    
        //    47: invokestatic    kotlin/io/c.a:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //    50: aload_0        
        //    51: aload_1        
        //    52: invokeinterface okhttp3/internal/io/a.f:(Ljava/io/File;)V
        //    57: iconst_0       
        //    58: ireturn        
        //    59: aload_1        
        //    60: athrow         
        //    61: astore_0       
        //    62: aload_2        
        //    63: aload_1        
        //    64: invokestatic    kotlin/io/c.a:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //    67: aload_0        
        //    68: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  22     29     40     59     Ljava/io/IOException;
        //  22     29     36     69     Any
        //  41     45     36     69     Any
        //  59     61     61     69     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
    
    public static final boolean K(@e final Socket socket, @e final okio.o o) {
        k0.p((Object)socket, "$this$isHealthy");
        k0.p((Object)o, "source");
        try {
            final int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                o.D1();
                socket.setSoTimeout(soTimeout);
            }
            finally {
                socket.setSoTimeout(soTimeout);
            }
        }
        catch (IOException ex) {}
        catch (SocketTimeoutException ex2) {
            goto Label_0058;
        }
    }
    
    public static final void L(@e final Object o) {
        k0.p(o, "$this$notify");
        o.notify();
    }
    
    public static final void M(@e final Object o) {
        k0.p(o, "$this$notifyAll");
        o.notifyAll();
    }
    
    public static final int N(char c) {
        if ('0' <= c) {
            if ('9' >= c) {
                c -= 48;
                return c;
            }
        }
        char c2 = 'a';
        Label_0049: {
            if ('a' > c) {
                break Label_0049;
            }
            if ('f' < c) {
                break Label_0049;
            }
            c = (char)(c - c2 + 10);
            return c;
        }
        c2 = 'A';
        if ('A' <= c) {
            if ('F' >= c) {
                return c - c2 + 10;
            }
        }
        c = (char)(-1);
        return c;
    }
    
    @e
    public static final String O(@e final Socket socket) {
        k0.p((Object)socket, "$this$peerName");
        final SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        String s;
        if (remoteSocketAddress instanceof InetSocketAddress) {
            s = ((InetSocketAddress)remoteSocketAddress).getHostName();
            k0.o((Object)s, "address.hostName");
        }
        else {
            s = remoteSocketAddress.toString();
        }
        return s;
    }
    
    @e
    public static final Charset P(@e final okio.o o, @e final Charset charset) throws IOException {
        k0.p((Object)o, "$this$readBomAsCharset");
        k0.p((Object)charset, "default");
        final int p2 = o.P5(okhttp3.internal.d.e);
        Charset charset2 = charset;
        if (p2 != -1) {
            String s;
            if (p2 != 0) {
                if (p2 != 1) {
                    if (p2 != 2) {
                        if (p2 == 3) {
                            charset2 = kotlin.text.f.j.b();
                            return charset2;
                        }
                        if (p2 == 4) {
                            charset2 = kotlin.text.f.j.c();
                            return charset2;
                        }
                        throw new AssertionError();
                    }
                    else {
                        charset2 = StandardCharsets.UTF_16LE;
                        s = "UTF_16LE";
                    }
                }
                else {
                    charset2 = StandardCharsets.UTF_16BE;
                    s = "UTF_16BE";
                }
            }
            else {
                charset2 = StandardCharsets.UTF_8;
                s = "UTF_8";
            }
            k0.o((Object)charset2, s);
        }
        return charset2;
    }
    
    @org.jetbrains.annotations.f
    public static final <T> T Q(@e Object obj, @e final Class<T> clazz, @e final String name) {
        k0.p(obj, "instance");
        k0.p((Object)clazz, "fieldType");
        k0.p((Object)name, "fieldName");
        Class<?> clazz2 = obj.getClass();
        while (true) {
            final boolean g = k0.g((Object)clazz2, (Object)Object.class);
            final Object o = null;
            if (g ^ true) {
                try {
                    final Field declaredField = clazz2.getDeclaredField(name);
                    k0.o((Object)declaredField, "field");
                    declaredField.setAccessible(true);
                    final Object value = declaredField.get(obj);
                    if (!clazz.isInstance(value)) {
                        obj = o;
                    }
                    else {
                        obj = clazz.cast(value);
                    }
                    return (T)obj;
                }
                catch (NoSuchFieldException ex) {
                    clazz2 = clazz2.getSuperclass();
                    k0.o((Object)clazz2, "c.superclass");
                    continue;
                }
                break;
            }
            break;
        }
        if (k0.g((Object)name, (Object)"delegate") ^ true) {
            obj = Q(obj, Object.class, "delegate");
            if (obj != null) {
                return (T)Q(obj, (Class<Object>)clazz, name);
            }
        }
        return null;
    }
    
    public static final int R(@e final okio.o o) throws IOException {
        k0.p((Object)o, "$this$readMedium");
        return b(o.readByte(), 255) | (b(o.readByte(), 255) << 16 | b(o.readByte(), 255) << 8);
    }
    
    public static final int S(@e final m m, final byte b) {
        k0.p((Object)m, "$this$skipAll");
        int n = 0;
        while (!m.D1() && m.F(0L) == b) {
            ++n;
            m.readByte();
        }
        return n;
    }
    
    public static final boolean T(@e final r0 r0, final int n, @e final TimeUnit timeUnit) throws IOException {
        k0.p((Object)r0, "$this$skipAll");
        k0.p((Object)timeUnit, "timeUnit");
        final long nanoTime = System.nanoTime();
        long a;
        if (r0.timeout().f()) {
            a = r0.timeout().d() - nanoTime;
        }
        else {
            a = Long.MAX_VALUE;
        }
        r0.timeout().e(Math.min(a, timeUnit.toNanos(n)) + nanoTime);
        boolean b = false;
    Label_0138_Outer:
        while (true) {
            while (true) {
                try {
                    final m m = new m();
                    while (r0.read(m, 8192L) != -1L) {
                        m.c();
                    }
                    b = true;
                    final boolean b2 = true;
                    if (a == Long.MAX_VALUE) {
                        b = b2;
                        r0.timeout().a();
                    }
                    else {
                        r0.timeout().e(nanoTime + a);
                    }
                }
                catch (InterruptedIOException ex) {
                    b = false;
                    final boolean b3 = false;
                    if (a == Long.MAX_VALUE) {
                        b = b3;
                        continue Label_0138_Outer;
                    }
                    continue;
                }
                finally {
                    final t0 timeout = r0.timeout();
                    if (a == Long.MAX_VALUE) {
                        timeout.a();
                    }
                    else {
                        timeout.e(nanoTime + a);
                    }
                }
                break;
            }
            break;
        }
        return b;
    }
    
    @e
    public static final ThreadFactory U(@e final String s, final boolean b) {
        k0.p((Object)s, "name");
        return new ThreadFactory() {
            @Override
            public final Thread newThread(final Runnable target) {
                final Thread thread = new Thread(target, s);
                thread.setDaemon(b);
                return thread;
            }
        };
    }
    
    public static final void V(@e final String name, @e final n6.a<j2> a) {
        k0.p((Object)name, "name");
        k0.p((Object)a, "block");
        final Thread currentThread = Thread.currentThread();
        k0.o((Object)currentThread, "currentThread");
        final String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            a.invoke();
        }
        finally {
            kotlin.jvm.internal.h0.d(1);
            currentThread.setName(name2);
            kotlin.jvm.internal.h0.c(1);
        }
    }
    
    @e
    public static final List<c> W(@e final v v) {
        k0.p((Object)v, "$this$toHeaderList");
        final k n1 = kotlin.ranges.o.n1(0, v.size());
        final ArrayList list = new ArrayList<c>(kotlin.collections.v.Y((Iterable)n1, 10));
        final Iterator iterator = ((Iterable)n1).iterator();
        while (iterator.hasNext()) {
            final int b = ((kotlin.collections.t0)iterator).b();
            list.add(new c(v.n(b), v.v(b)));
        }
        return (List<c>)list;
    }
    
    @e
    public static final v X(@e final List<c> list) {
        k0.p((Object)list, "$this$toHeaders");
        final v.a a = new v.a();
        for (final c c : list) {
            a.g(c.a().U0(), c.b().U0());
        }
        return a.i();
    }
    
    @e
    public static final String Y(final int i) {
        final String hexString = Integer.toHexString(i);
        k0.o((Object)hexString, "Integer.toHexString(this)");
        return hexString;
    }
    
    @e
    public static final String Z(final long i) {
        final String hexString = Long.toHexString(i);
        k0.o((Object)hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }
    
    public static final <E> void a(@e final List<E> list, final E e) {
        k0.p((Object)list, "$this$addIfAbsent");
        if (!list.contains(e)) {
            list.add(e);
        }
    }
    
    @e
    public static final String a0(@e final w w, final boolean b) {
        k0.p((Object)w, "$this$toHostHeader");
        String str;
        if (s.V2(w.F(), ":", false, 2, null)) {
            final StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(w.F());
            sb.append(']');
            str = sb.toString();
        }
        else {
            str = w.F();
        }
        if (!b) {
            final String string = str;
            if (w.N() == w.w.g(w.X())) {
                return string;
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(':');
        sb2.append(w.N());
        return sb2.toString();
    }
    
    public static final int b(final byte b, final int n) {
        return b & n;
    }
    
    public static final int c(final short n, final int n2) {
        return n & n2;
    }
    
    @e
    public static final <T> List<T> c0(@e final List<? extends T> list) {
        k0.p((Object)list, "$this$toImmutableList");
        final List<T> unmodifiableList = Collections.unmodifiableList((List<? extends T>)kotlin.collections.v.L5((Collection)list));
        k0.o((Object)unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }
    
    public static final long d(final int n, final long n2) {
        return (long)n & n2;
    }
    
    @e
    public static final <K, V> Map<K, V> d0(@e final Map<K, ? extends V> m) {
        k0.p((Object)m, "$this$toImmutableMap");
        Map<K, V> map;
        if (m.isEmpty()) {
            map = (Map<K, V>)y0.z();
        }
        else {
            map = Collections.unmodifiableMap((Map<? extends K, ? extends V>)new LinkedHashMap<K, V>((Map<? extends K, ? extends V>)m));
            k0.o((Object)map, "Collections.unmodifiableMap(LinkedHashMap(this))");
        }
        return map;
    }
    
    @e
    public static final okhttp3.s.c e(@e final okhttp3.s s) {
        k0.p((Object)s, "$this$asFactory");
        return new okhttp3.s.c() {
            @e
            @Override
            public final s a(@e final okhttp3.e e) {
                k0.p((Object)e, "it");
                return s;
            }
        };
    }
    
    public static final long e0(@e final String s, long long1) {
        k0.p((Object)s, "$this$toLongOrDefault");
        try {
            long1 = Long.parseLong(s);
            return long1;
        }
        catch (NumberFormatException ex) {
            return long1;
        }
    }
    
    public static final void f(@e final Object obj) {
        k0.p(obj, "$this$assertThreadDoesntHoldLock");
        if (okhttp3.internal.d.h && Thread.holdsLock(obj)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(obj);
            throw new AssertionError((Object)sb.toString());
        }
    }
    
    public static final int f0(@org.jetbrains.annotations.f final String s, int n) {
        if (s == null) {
            return n;
        }
        try {
            final long long1 = Long.parseLong(s);
            n = Integer.MAX_VALUE;
            if (long1 <= Integer.MAX_VALUE) {
                if (long1 < 0L) {
                    n = 0;
                }
                else {
                    n = (int)long1;
                }
            }
            return n;
        }
        catch (NumberFormatException ex) {
            return n;
        }
    }
    
    public static final void g(@e final Object obj) {
        k0.p(obj, "$this$assertThreadHoldsLock");
        if (okhttp3.internal.d.h && !Thread.holdsLock(obj)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(obj);
            throw new AssertionError((Object)sb.toString());
        }
    }
    
    @e
    public static final String g0(@e String substring, int c, final int n) {
        k0.p((Object)substring, "$this$trimSubstring");
        c = C(substring, c, n);
        substring = substring.substring(c, E(substring, c, n));
        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    public static final boolean h(@e final String s) {
        k0.p((Object)s, "$this$canParseAsIpAddress");
        return okhttp3.internal.d.g.i(s);
    }
    
    public static final boolean i(@e final w w, @e final w w2) {
        k0.p((Object)w, "$this$canReuseConnectionFor");
        k0.p((Object)w2, "other");
        return k0.g((Object)w.F(), (Object)w2.F()) && w.N() == w2.N() && k0.g((Object)w.X(), (Object)w2.X());
    }
    
    public static final void i0(@e final Object o) {
        k0.p(o, "$this$wait");
        o.wait();
    }
    
    public static final int j(@e final String str, long millis, @org.jetbrains.annotations.f final TimeUnit timeUnit) {
        k0.p((Object)str, "name");
        final boolean b = true;
        final long n = lcmp(millis, 0L);
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" < 0");
            throw new IllegalStateException(sb.toString().toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        millis = timeUnit.toMillis(millis);
        if (millis > Integer.MAX_VALUE) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" too large.");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        int n2 = b ? 1 : 0;
        if (millis == 0L) {
            if (n <= 0) {
                n2 = (b ? 1 : 0);
            }
            else {
                n2 = 0;
            }
        }
        if (n2 != 0) {
            return (int)millis;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" too small.");
        throw new IllegalArgumentException(sb3.toString().toString());
    }
    
    @e
    public static final Throwable j0(@e final Exception ex, @e final List<? extends Exception> x) {
        k0.p((Object)ex, "$this$withSuppressed");
        k0.p((Object)x, "suppressed");
        if (x.size() > 1) {
            System.out.println(x);
        }
        final Iterator<? extends Exception> iterator = x.iterator();
        while (iterator.hasNext()) {
            kotlin.m.a((Throwable)ex, (Throwable)iterator.next());
        }
        return ex;
    }
    
    public static final void k(final long n, final long n2, final long n3) {
        if ((n2 | n3) >= 0L && n2 <= n && n - n2 >= n3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public static final void k0(@e final n n, final int n2) throws IOException {
        k0.p((Object)n, "$this$writeMedium");
        n.A(n2 >>> 16 & 0xFF);
        n.A(n2 >>> 8 & 0xFF);
        n.A(n2 & 0xFF);
    }
    
    public static final void l(@e final Closeable closeable) {
        k0.p((Object)closeable, "$this$closeQuietly");
        try {
            closeable.close();
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {}
    }
    
    public static final void m(@e final ServerSocket serverSocket) {
        k0.p((Object)serverSocket, "$this$closeQuietly");
        try {
            serverSocket.close();
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {}
    }
    
    public static final void n(@e final Socket socket) {
        k0.p((Object)socket, "$this$closeQuietly");
        try {
            socket.close();
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (AssertionError assertionError) {
            throw assertionError;
        }
        catch (Exception ex2) {}
    }
    
    @e
    public static final String[] o(@e String[] original, @e final String s) {
        k0.p((Object)original, "$this$concat");
        k0.p((Object)s, "value");
        final String[] copy = Arrays.copyOf(original, original.length + 1);
        k0.o((Object)copy, "java.util.Arrays.copyOf(this, newSize)");
        original = copy;
        original[kotlin.collections.m.Td((Object[])original)] = s;
        return original;
    }
    
    public static final int p(@e final String s, final char c, int i, final int n) {
        k0.p((Object)s, "$this$delimiterOffset");
        while (i < n) {
            if (s.charAt(i) == c) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static final int q(@e final String s, @e final String s2, int i, final int n) {
        k0.p((Object)s, "$this$delimiterOffset");
        k0.p((Object)s2, "delimiters");
        while (i < n) {
            if (s.U2(s2, s.charAt(i), false, 2, null)) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static final boolean t(@e final r0 r0, final int n, @e final TimeUnit timeUnit) {
        k0.p((Object)r0, "$this$discard");
        k0.p((Object)timeUnit, "timeUnit");
        boolean t;
        try {
            t = T(r0, n, timeUnit);
        }
        catch (IOException ex) {
            t = false;
        }
        return t;
    }
    
    @e
    public static final <T> List<T> u(@e final Iterable<? extends T> iterable, @e final l<? super T, Boolean> l) {
        k0.p((Object)iterable, "$this$filterList");
        k0.p((Object)l, "predicate");
        final List e = kotlin.collections.v.E();
        final Iterator<? extends T> iterator = iterable.iterator();
        List<T> list = (List<T>)e;
        while (iterator.hasNext()) {
            final T next = (T)iterator.next();
            if (l.invoke((Object)next)) {
                List<T> list2 = list;
                if (list.isEmpty()) {
                    list2 = new ArrayList<T>();
                }
                q1.g((Object)list2).add(next);
                list = list2;
            }
        }
        return list;
    }
    
    @e
    public static final String v(@e String format, @e Object... copy) {
        k0.p((Object)format, "format");
        k0.p((Object)copy, "args");
        final p1 a = p1.a;
        final Locale us = Locale.US;
        copy = Arrays.copyOf(copy, copy.length);
        format = String.format(us, format, Arrays.copyOf(copy, copy.length));
        k0.o((Object)format, "java.lang.String.format(locale, format, *args)");
        return format;
    }
    
    public static final boolean w(@e final String[] array, @org.jetbrains.annotations.f final String[] array2, @e final Comparator<? super String> comparator) {
        k0.p((Object)array, "$this$hasIntersection");
        k0.p((Object)comparator, "comparator");
        if (array.length != 0 && array2 != null) {
            if (array2.length != 0) {
                for (final String s : array) {
                    for (int length2 = array2.length, j = 0; j < length2; ++j) {
                        if (comparator.compare(s, array2[j]) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static final long x(@e final okhttp3.g0 g0) {
        k0.p((Object)g0, "$this$headersContentLength");
        final String h = g0.J().h("Content-Length");
        long e0 = -1L;
        if (h != null) {
            e0 = e0(h, -1L);
        }
        return e0;
    }
    
    public static final void y(@e final n6.a<j2> a) {
        k0.p((Object)a, "block");
        try {
            a.invoke();
        }
        catch (IOException ex) {}
    }
    
    @SafeVarargs
    @e
    public static final <T> List<T> z(@e final T... array) {
        k0.p((Object)array, "elements");
        final T[] original = array.clone();
        final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)kotlin.collections.v.L((Object[])Arrays.copyOf(original, original.length)));
        k0.o((Object)unmodifiableList, "Collections.unmodifiable\u2026istOf(*elements.clone()))");
        return (List<T>)unmodifiableList;
    }
}
