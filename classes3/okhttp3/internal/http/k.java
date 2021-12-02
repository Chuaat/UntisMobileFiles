// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.text.s;
import okhttp3.g0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import okhttp3.d0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012" }, d2 = { "Lokhttp3/internal/http/k;", "", "", "toString", "Lokhttp3/d0;", "a", "Lokhttp3/d0;", "protocol", "", "b", "I", "code", "c", "Ljava/lang/String;", "message", "<init>", "(Lokhttp3/d0;ILjava/lang/String;)V", "h", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class k
{
    public static final int d = 307;
    public static final int e = 308;
    public static final int f = 421;
    public static final int g = 100;
    public static final a h;
    @d
    @e
    public final d0 a;
    @d
    public final int b;
    @d
    @e
    public final String c;
    
    static {
        h = new a(null);
    }
    
    public k(@e final d0 a, final int b, @e final String c) {
        k0.p((Object)a, "protocol");
        k0.p((Object)c, "message");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        String str;
        if (this.a == d0.H) {
            str = "HTTP/1.0";
        }
        else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011" }, d2 = { "okhttp3/internal/http/k$a", "", "Lokhttp3/g0;", "response", "Lokhttp3/internal/http/k;", "a", "", "statusLine", "b", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final k a(@e final g0 g0) {
            k0.p((Object)g0, "response");
            return new k(g0.T(), g0.x(), g0.M());
        }
        
        @e
        public final k b(@e String substring) throws IOException {
            k0.p((Object)substring, "statusLine");
            final boolean u2 = s.u2(substring, "HTTP/1.", false, 2, null);
            int beginIndex = 9;
            d0 d0;
            if (u2) {
                if (substring.length() < 9 || substring.charAt(8) != ' ') {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected status line: ");
                    sb.append(substring);
                    throw new ProtocolException(sb.toString());
                }
                final int n = substring.charAt(7) - '0';
                if (n == 0) {
                    d0 = okhttp3.d0.H;
                }
                else {
                    if (n != 1) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected status line: ");
                        sb2.append(substring);
                        throw new ProtocolException(sb2.toString());
                    }
                    d0 = okhttp3.d0.I;
                }
            }
            else {
                if (!s.u2(substring, "ICY ", false, 2, null)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unexpected status line: ");
                    sb3.append(substring);
                    throw new ProtocolException(sb3.toString());
                }
                d0 = okhttp3.d0.H;
                beginIndex = 4;
            }
            final int length = substring.length();
            final int n2 = beginIndex + 3;
            if (length >= n2) {
                try {
                    final String substring2 = substring.substring(beginIndex, n2);
                    k0.o((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    final int int1 = Integer.parseInt(substring2);
                    if (substring.length() > n2) {
                        if (substring.charAt(n2) != ' ') {
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("Unexpected status line: ");
                            sb4.append(substring);
                            throw new ProtocolException(sb4.toString());
                        }
                        substring = substring.substring(beginIndex + 4);
                        k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                    }
                    else {
                        substring = "";
                    }
                    return new k(d0, int1, substring);
                }
                catch (NumberFormatException ex) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("Unexpected status line: ");
                    sb5.append(substring);
                    throw new ProtocolException(sb5.toString());
                }
            }
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("Unexpected status line: ");
            sb6.append(substring);
            throw new ProtocolException(sb6.toString());
        }
    }
}
