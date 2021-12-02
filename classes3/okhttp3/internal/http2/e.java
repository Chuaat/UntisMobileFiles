// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import kotlin.text.s;
import kotlin.jvm.internal.k0;
import m6.d;
import okio.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b#\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0016\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0016\u0010\u001f\u001a\u00020\u001d8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000fR\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u000fR\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u000fR\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u000fR\u0016\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u000fR\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0015R\u0016\u0010.\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u000fR\u0016\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u000fR\u0016\u00102\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u000fR\u0016\u00104\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u000fR\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0015R\u0016\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u000fR\u0016\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u000fR\u0016\u0010;\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010=\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u000f¨\u0006@" }, d2 = { "Lokhttp3/internal/http2/e;", "", "", "inbound", "", "streamId", "length", "type", "flags", "", "c", "b", "(I)Ljava/lang/String;", "a", "k", "I", "TYPE_WINDOW_UPDATE", "f", "TYPE_RST_STREAM", "", "w", "[Ljava/lang/String;", "BINARY", "l", "TYPE_CONTINUATION", "o", "FLAG_END_STREAM", "n", "FLAG_ACK", "Lokio/p;", "Lokio/p;", "CONNECTION_PREFACE", "e", "TYPE_PRIORITY", "h", "TYPE_PUSH_PROMISE", "j", "TYPE_GOAWAY", "TYPE_DATA", "m", "FLAG_NONE", "q", "FLAG_END_PUSH_PROMISE", "v", "FLAGS", "p", "FLAG_END_HEADERS", "g", "TYPE_SETTINGS", "t", "FLAG_COMPRESSED", "s", "FLAG_PRIORITY", "u", "FRAME_NAMES", "d", "TYPE_HEADERS", "i", "TYPE_PING", "INITIAL_MAX_FRAME_SIZE", "r", "FLAG_PADDED", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class e
{
    @d
    @org.jetbrains.annotations.e
    public static final p a;
    public static final int b = 16384;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 9;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 1;
    public static final int p = 4;
    public static final int q = 4;
    public static final int r = 8;
    public static final int s = 32;
    public static final int t = 32;
    private static final String[] u;
    private static final String[] v;
    private static final String[] w;
    public static final e x;
    
    static {
        x = new e();
        a = okio.p.L.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        u = new String[] { "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION" };
        v = new String[64];
        final String[] w2 = new String[256];
        final int n = 0;
        for (int i = 0; i < 256; ++i) {
            final String binaryString = Integer.toBinaryString(i);
            k0.o((Object)binaryString, "Integer.toBinaryString(it)");
            w2[i] = kotlin.text.s.j2(okhttp3.internal.d.v("%8s", binaryString), ' ', '0', false, 4, null);
        }
        w = w2;
        final String[] v2 = okhttp3.internal.http2.e.v;
        v2[0] = "";
        v2[1] = "END_STREAM";
        final int[] array = { 1 };
        v2[8] = "PADDED";
        for (int j = 0; j < 1; ++j) {
            final int n2 = array[j];
            final String[] v3 = okhttp3.internal.http2.e.v;
            v3[n2 | 0x8] = k0.C(v3[n2], (Object)"|PADDED");
        }
        final String[] v4 = okhttp3.internal.http2.e.v;
        v4[4] = "END_HEADERS";
        v4[32] = "PRIORITY";
        v4[36] = "END_HEADERS|PRIORITY";
        for (int k = 0; k < 3; ++k) {
            final int n3 = (new int[] { 4, 32, 36 })[k];
            for (int l = 0; l < 1; ++l) {
                final int n4 = array[l];
                final String[] v5 = okhttp3.internal.http2.e.v;
                final int n5 = n4 | n3;
                final StringBuilder sb = new StringBuilder();
                sb.append(v5[n4]);
                sb.append("|");
                sb.append(v5[n3]);
                v5[n5] = sb.toString();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(v5[n4]);
                sb2.append("|");
                sb2.append(v5[n3]);
                sb2.append("|PADDED");
                v5[n5 | 0x8] = sb2.toString();
            }
        }
        for (int length = okhttp3.internal.http2.e.v.length, n6 = n; n6 < length; ++n6) {
            final String[] v6 = okhttp3.internal.http2.e.v;
            if (v6[n6] == null) {
                v6[n6] = okhttp3.internal.http2.e.w[n6];
            }
        }
    }
    
    private e() {
    }
    
    @org.jetbrains.annotations.e
    public final String a(final int n, final int n2) {
        if (n2 == 0) {
            return "";
        }
        if (n != 2 && n != 3) {
            if (n == 4 || n == 6) {
                String s;
                if (n2 == 1) {
                    s = "ACK";
                }
                else {
                    s = okhttp3.internal.http2.e.w[n2];
                }
                return s;
            }
            if (n != 7 && n != 8) {
                final String[] v = okhttp3.internal.http2.e.v;
                String s2;
                if (n2 < v.length) {
                    s2 = v[n2];
                    k0.m((Object)s2);
                }
                else {
                    s2 = okhttp3.internal.http2.e.w[n2];
                }
                String s3;
                String s4;
                if (n == 5 && (n2 & 0x4) != 0x0) {
                    s3 = "HEADERS";
                    s4 = "PUSH_PROMISE";
                }
                else {
                    String k2 = s2;
                    if (n != 0) {
                        return k2;
                    }
                    k2 = s2;
                    if ((n2 & 0x20) == 0x0) {
                        return k2;
                    }
                    s3 = "PRIORITY";
                    s4 = "COMPRESSED";
                }
                return kotlin.text.s.k2(s2, s3, s4, false, 4, null);
            }
        }
        return okhttp3.internal.http2.e.w[n2];
    }
    
    @org.jetbrains.annotations.e
    public final String b(final int i) {
        final String[] u = okhttp3.internal.http2.e.u;
        String v;
        if (i < u.length) {
            v = u[i];
        }
        else {
            v = okhttp3.internal.d.v("0x%02x", i);
        }
        return v;
    }
    
    @org.jetbrains.annotations.e
    public final String c(final boolean b, final int i, final int j, final int n, final int n2) {
        final String b2 = this.b(n);
        final String a = this.a(n, n2);
        String s;
        if (b) {
            s = "<<";
        }
        else {
            s = ">>";
        }
        return okhttp3.internal.d.v("%s 0x%08x %5d %-13s %s", s, i, j, b2, a);
    }
}
