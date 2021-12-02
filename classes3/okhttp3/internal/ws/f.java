// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.ws;

import java.io.IOException;
import kotlin.text.s;
import okhttp3.v;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0005BG\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0002H\u00c6\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\n\u0010\bJ\t\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0002H\u00c6\u0003JP\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u00c6\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001f" }, d2 = { "Lokhttp3/internal/ws/f;", "", "", "clientOriginated", "i", "a", "", "b", "()Ljava/lang/Integer;", "c", "d", "e", "f", "perMessageDeflate", "clientMaxWindowBits", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "g", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/f;", "", "toString", "hashCode", "other", "equals", "Z", "Ljava/lang/Integer;", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "h", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class f
{
    private static final String g = "Sec-WebSocket-Extensions";
    public static final a h;
    @d
    public final boolean a;
    @d
    @org.jetbrains.annotations.f
    public final Integer b;
    @d
    public final boolean c;
    @d
    @org.jetbrains.annotations.f
    public final Integer d;
    @d
    public final boolean e;
    @d
    public final boolean f;
    
    static {
        h = new a(null);
    }
    
    public f() {
        this(false, null, false, null, false, false, 63, null);
    }
    
    public f(final boolean a, @org.jetbrains.annotations.f final Integer b, final boolean c, @org.jetbrains.annotations.f final Integer d, final boolean e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final boolean a() {
        return this.a;
    }
    
    @org.jetbrains.annotations.f
    public final Integer b() {
        return this.b;
    }
    
    public final boolean c() {
        return this.c;
    }
    
    @org.jetbrains.annotations.f
    public final Integer d() {
        return this.d;
    }
    
    public final boolean e() {
        return this.e;
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        if (this != o) {
            if (o instanceof f) {
                final f f = (f)o;
                if (this.a == f.a && k0.g((Object)this.b, (Object)f.b) && this.c == f.c && k0.g((Object)this.d, (Object)f.d) && this.e == f.e && this.f == f.f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final boolean f() {
        return this.f;
    }
    
    @e
    public final f g(final boolean b, @org.jetbrains.annotations.f final Integer n, final boolean b2, @org.jetbrains.annotations.f final Integer n2, final boolean b3, final boolean b4) {
        return new f(b, n, b2, n2, b3, b4);
    }
    
    @Override
    public int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final Integer b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        final Integer d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        final int f = this.f ? 1 : 0;
        if (f == 0) {
            n = f;
        }
        return ((((n2 * 31 + hashCode2) * 31 + c) * 31 + hashCode) * 31 + e) * 31 + n;
    }
    
    public final boolean i(final boolean b) {
        boolean b2;
        if (b) {
            b2 = this.c;
        }
        else {
            b2 = this.e;
        }
        return b2;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.e);
        sb.append(", unknownValues=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "okhttp3/internal/ws/f$a", "", "Lokhttp3/v;", "responseHeaders", "Lokhttp3/internal/ws/f;", "a", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final f a(@e final v v) throws IOException {
            k0.p((Object)v, "responseHeaders");
            final int size = v.size();
            int i = 0;
            int n = 0;
            Integer n2 = null;
            int n3 = 0;
            Integer n4 = null;
            int n5 = 0;
            int n6 = 0;
            while (i < size) {
                int n7;
                Integer n8;
                int n9;
                Integer n10;
                int n11;
                int n12;
                if (!s.K1(v.n(i), "Sec-WebSocket-Extensions", true)) {
                    n7 = n;
                    n8 = n2;
                    n9 = n3;
                    n10 = n4;
                    n11 = n5;
                    n12 = n6;
                }
                else {
                    final String v2 = v.v(i);
                    int j = 0;
                    while (true) {
                        n7 = n;
                        n8 = n2;
                        n9 = n3;
                        n10 = n4;
                        n11 = n5;
                        n12 = n6;
                        if (j >= v2.length()) {
                            break;
                        }
                        final int r = okhttp3.internal.d.r(v2, ',', j, 0, 4, null);
                        int p = okhttp3.internal.d.p(v2, ';', j, r);
                        final String g0 = okhttp3.internal.d.g0(v2, j, p);
                        ++p;
                        if (s.K1(g0, "permessage-deflate", true)) {
                            j = p;
                            Integer n13 = n2;
                            int n14 = n3;
                            Integer n15 = n4;
                            int n16 = n5;
                            if (n != 0) {
                                n6 = 1;
                                n16 = n5;
                                n15 = n4;
                                n14 = n3;
                                n13 = n2;
                                j = p;
                            }
                            while (j < r) {
                                final int p2 = okhttp3.internal.d.p(v2, ';', j, r);
                                final int p3 = okhttp3.internal.d.p(v2, '=', j, p2);
                                final String g2 = okhttp3.internal.d.g0(v2, j, p3);
                                String l4;
                                if (p3 < p2) {
                                    l4 = s.l4(okhttp3.internal.d.g0(v2, p3 + 1, p2), "\"");
                                }
                                else {
                                    l4 = null;
                                }
                                Integer n17 = null;
                                int n18 = 0;
                                Integer n19 = null;
                                int n20 = 0;
                                Label_0543: {
                                    Integer x2;
                                    if (s.K1(g2, "client_max_window_bits", true)) {
                                        if (n13 != null) {
                                            n6 = 1;
                                        }
                                        Integer x0;
                                        if (l4 != null) {
                                            x0 = s.X0(l4);
                                        }
                                        else {
                                            x0 = null;
                                        }
                                        n17 = x0;
                                        n18 = n14;
                                        n19 = n15;
                                        n20 = n16;
                                        if (x0 != null) {
                                            break Label_0543;
                                        }
                                        n17 = x0;
                                        x2 = n15;
                                    }
                                    else {
                                        if (s.K1(g2, "client_no_context_takeover", true)) {
                                            if (n14 != 0) {
                                                n6 = 1;
                                            }
                                            if (l4 != null) {
                                                n6 = 1;
                                            }
                                            n18 = 1;
                                            n17 = n13;
                                            n19 = n15;
                                            n20 = n16;
                                            break Label_0543;
                                        }
                                        if (s.K1(g2, "server_max_window_bits", true)) {
                                            if (n15 != null) {
                                                n6 = 1;
                                            }
                                            if (l4 != null) {
                                                x2 = s.X0(l4);
                                            }
                                            else {
                                                x2 = null;
                                            }
                                            n17 = n13;
                                            n18 = n14;
                                            n19 = x2;
                                            n20 = n16;
                                            if (x2 != null) {
                                                break Label_0543;
                                            }
                                            n17 = n13;
                                        }
                                        else {
                                            n17 = n13;
                                            x2 = n15;
                                            if (s.K1(g2, "server_no_context_takeover", true)) {
                                                if (n16 != 0) {
                                                    n6 = 1;
                                                }
                                                if (l4 != null) {
                                                    n6 = 1;
                                                }
                                                n20 = 1;
                                                n17 = n13;
                                                n18 = n14;
                                                n19 = n15;
                                                break Label_0543;
                                            }
                                        }
                                    }
                                    n6 = 1;
                                    n20 = n16;
                                    n19 = x2;
                                    n18 = n14;
                                }
                                j = p2 + 1;
                                n13 = n17;
                                n14 = n18;
                                n15 = n19;
                                n16 = n20;
                            }
                            n = 1;
                            n2 = n13;
                            n3 = n14;
                            n4 = n15;
                            n5 = n16;
                        }
                        else {
                            j = p;
                            n6 = 1;
                        }
                    }
                }
                ++i;
                n = n7;
                n2 = n8;
                n3 = n9;
                n4 = n10;
                n5 = n11;
                n6 = n12;
            }
            return new f((boolean)(n != 0), n2, (boolean)(n3 != 0), n4, (boolean)(n5 != 0), (boolean)(n6 != 0));
        }
    }
}
