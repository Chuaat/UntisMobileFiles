// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import kotlin.jvm.internal.k0;
import m6.k;
import java.io.IOException;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import kotlin.i;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011" }, d2 = { "Lokhttp3/d0;", "", "", "toString", "G", "Ljava/lang/String;", "protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "O", "a", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public enum d0
{
    H("http/1.0"), 
    I("http/1.1"), 
    @i(message = "OkHttp has dropped support for SPDY. Prefer {@link #HTTP_2}.")
    J("spdy/3.1"), 
    K("h2"), 
    L("h2_prior_knowledge"), 
    M("quic");
    
    public static final a O;
    private final String G;
    
    static {
        O = new a(null);
    }
    
    private d0(final String g) {
        this.G = g;
    }
    
    public static final /* synthetic */ String b(final d0 d0) {
        return d0.G;
    }
    
    @k
    @e
    public static final d0 d(@e final String s) throws IOException {
        return d0.O.a(s);
    }
    
    @e
    @Override
    public String toString() {
        return this.G;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "okhttp3/d0$a", "", "", "protocol", "Lokhttp3/d0;", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final d0 a(@e final String str) throws IOException {
            k0.p((Object)str, "protocol");
            final d0 h = d0.H;
            d0 d0;
            if (k0.g((Object)str, (Object)okhttp3.d0.b(h))) {
                d0 = h;
            }
            else {
                final d0 i = okhttp3.d0.I;
                if (k0.g((Object)str, (Object)okhttp3.d0.b(i))) {
                    d0 = i;
                }
                else {
                    final d0 l = okhttp3.d0.L;
                    if (k0.g((Object)str, (Object)okhttp3.d0.b(l))) {
                        d0 = l;
                    }
                    else {
                        final d0 k = okhttp3.d0.K;
                        if (k0.g((Object)str, (Object)okhttp3.d0.b(k))) {
                            d0 = k;
                        }
                        else {
                            final d0 j = okhttp3.d0.J;
                            if (k0.g((Object)str, (Object)okhttp3.d0.b(j))) {
                                d0 = j;
                            }
                            else {
                                final d0 m = okhttp3.d0.M;
                                if (!k0.g((Object)str, (Object)okhttp3.d0.b(m))) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Unexpected protocol: ");
                                    sb.append(str);
                                    throw new IOException(sb.toString());
                                }
                                d0 = m;
                            }
                        }
                    }
                }
            }
            return d0;
        }
    }
}
