// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a" }, d2 = { "Lokhttp3/internal/http2/b;", "", "", "G", "I", "b", "()I", "httpCode", "<init>", "(Ljava/lang/String;II)V", "W", "a", "NO_ERROR", "PROTOCOL_ERROR", "INTERNAL_ERROR", "FLOW_CONTROL_ERROR", "SETTINGS_TIMEOUT", "STREAM_CLOSED", "FRAME_SIZE_ERROR", "REFUSED_STREAM", "CANCEL", "COMPRESSION_ERROR", "CONNECT_ERROR", "ENHANCE_YOUR_CALM", "INADEQUATE_SECURITY", "HTTP_1_1_REQUIRED", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public enum b
{
    H(0), 
    I(1), 
    J(2), 
    K(3), 
    L(4), 
    M(5), 
    N(6), 
    O(7), 
    P(8), 
    Q(9), 
    R(10), 
    S(11), 
    T(12), 
    U(13);
    
    public static final a W;
    private final int G;
    
    static {
        W = new a(null);
    }
    
    private b(final int g) {
        this.G = g;
    }
    
    public final int b() {
        return this.G;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "okhttp3/internal/http2/b$a", "", "", "code", "Lokhttp3/internal/http2/b;", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @f
        public final b a(final int n) {
            for (final b b : b.values()) {
                if (b.b() == n) {
                    return b;
                }
            }
            return null;
        }
    }
}
