// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.ws;

import okio.m;
import org.jetbrains.annotations.f;
import okio.p;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\"\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010;J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nR\u0016\u0010\u000f\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0016\u0010\u001d\u001a\u00020\u001a8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010!\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u000eR\u0016\u0010#\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0016\u0010$\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010&\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u000eR\u0016\u0010(\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u000eR\u0016\u0010*\u001a\u00020\n8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010)R\u0016\u0010,\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\u000eR\u0016\u0010.\u001a\u00020\u001a8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010\u001cR\u0016\u00100\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010\u000eR\u0016\u00102\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010\u000eR\u0016\u00104\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010\u000eR\u0016\u00106\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010\u000eR\u0016\u00108\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010\u000eR\u0016\u00109\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006<" }, d2 = { "Lokhttp3/internal/ws/g;", "", "Lokio/m$a;", "cursor", "", "key", "Lkotlin/j2;", "c", "", "code", "", "b", "d", "a", "I", "B0_FLAG_FIN", "v", "CLOSE_NO_STATUS_CODE", "g", "OPCODE_FLAG_CONTROL", "n", "OPCODE_CONTROL_PING", "o", "OPCODE_CONTROL_PONG", "m", "OPCODE_CONTROL_CLOSE", "", "s", "J", "PAYLOAD_SHORT_MAX", "p", "PAYLOAD_BYTE_MAX", "t", "PAYLOAD_LONG", "l", "OPCODE_BINARY", "B0_FLAG_RSV1", "r", "PAYLOAD_SHORT", "e", "B0_FLAG_RSV3", "Ljava/lang/String;", "ACCEPT_MAGIC", "i", "B1_MASK_LENGTH", "q", "CLOSE_MESSAGE_MAX", "j", "OPCODE_CONTINUATION", "u", "CLOSE_CLIENT_GOING_AWAY", "h", "B1_FLAG_MASK", "f", "B0_MASK_OPCODE", "k", "OPCODE_TEXT", "B0_FLAG_RSV2", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class g
{
    @e
    public static final String a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int b = 128;
    public static final int c = 64;
    public static final int d = 32;
    public static final int e = 16;
    public static final int f = 15;
    public static final int g = 8;
    public static final int h = 128;
    public static final int i = 127;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 8;
    public static final int n = 9;
    public static final int o = 10;
    public static final long p = 125L;
    public static final long q = 123L;
    public static final int r = 126;
    public static final long s = 65535L;
    public static final int t = 127;
    public static final int u = 1001;
    public static final int v = 1005;
    public static final g w;
    
    static {
        w = new g();
    }
    
    private g() {
    }
    
    @e
    public final String a(@e final String str) {
        k0.p((Object)str, "key");
        final p.a l = okio.p.L;
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        return l.l(sb.toString()).C0().g();
    }
    
    @f
    public final String b(final int n) {
        StringBuilder sb;
        if (n >= 1000 && n < 5000) {
            Label_0048: {
                if (1004 > n || 1006 < n) {
                    if (1015 <= n) {
                        if (2999 >= n) {
                            break Label_0048;
                        }
                    }
                    return null;
                }
            }
            sb = new StringBuilder();
            sb.append("Code ");
            sb.append(n);
            sb.append(" is reserved and may not be used.");
        }
        else {
            sb = new StringBuilder();
            sb.append("Code must be in range [1000,5000): ");
            sb.append(n);
        }
        return sb.toString();
    }
    
    public final void c(@e final m.a a, @e final byte[] array) {
        k0.p((Object)a, "cursor");
        k0.p((Object)array, "key");
        final int length = array.length;
        int n = 0;
        do {
            final byte[] k = a.K;
            int l = a.L;
            final int m = a.M;
            int n2 = n;
            if (k != null) {
                while (true) {
                    n2 = n;
                    if (l >= m) {
                        break;
                    }
                    n %= length;
                    k[l] ^= array[n];
                    ++l;
                    ++n;
                }
            }
            n = n2;
        } while (a.c() != -1);
    }
    
    public final void d(int n) {
        final String b = this.b(n);
        if (b == null) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            return;
        }
        k0.m((Object)b);
        throw new IllegalArgumentException(b.toString());
    }
}
