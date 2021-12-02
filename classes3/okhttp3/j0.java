// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import kotlin.jvm.internal.k0;
import m6.g;
import kotlin.z0;
import kotlin.i;
import m6.k;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\b\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012" }, d2 = { "Lokhttp3/j0;", "", "", "b", "()Ljava/lang/String;", "G", "Ljava/lang/String;", "f", "javaName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "N", "a", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public enum j0
{
    H("TLSv1.3"), 
    I("TLSv1.2"), 
    J("TLSv1.1"), 
    K("TLSv1"), 
    L("SSLv3");
    
    public static final a N;
    @e
    private final String G;
    
    static {
        N = new a(null);
    }
    
    private j0(final String g) {
        this.G = g;
    }
    
    @k
    @e
    public static final j0 d(@e final String s) {
        return j0.N.a(s);
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "javaName", imports = {}))
    @g(name = "-deprecated_javaName")
    @e
    public final String b() {
        return this.G;
    }
    
    @g(name = "javaName")
    @e
    public final String f() {
        return this.G;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "okhttp3/j0$a", "", "", "javaName", "Lokhttp3/j0;", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final j0 a(@e final String str) {
            k0.p((Object)str, "javaName");
            final int hashCode = str.hashCode();
            Label_0134: {
                j0 j0 = null;
                if (hashCode != 79201641) {
                    if (hashCode != 79923350) {
                        switch (hashCode) {
                            default: {
                                break Label_0134;
                            }
                            case -503070501: {
                                if (str.equals("TLSv1.3")) {
                                    j0 = okhttp3.j0.H;
                                    break;
                                }
                                break Label_0134;
                            }
                            case -503070502: {
                                if (str.equals("TLSv1.2")) {
                                    j0 = okhttp3.j0.I;
                                    break;
                                }
                                break Label_0134;
                            }
                            case -503070503: {
                                if (str.equals("TLSv1.1")) {
                                    j0 = okhttp3.j0.J;
                                    break;
                                }
                                break Label_0134;
                            }
                        }
                    }
                    else {
                        if (!str.equals("TLSv1")) {
                            break Label_0134;
                        }
                        j0 = okhttp3.j0.K;
                    }
                }
                else {
                    if (!str.equals("SSLv3")) {
                        break Label_0134;
                    }
                    j0 = okhttp3.j0.L;
                }
                return j0;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected TLS version: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
