// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import java.util.Map;
import n6.a;
import kotlin.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 " }, d2 = { "Lkotlin/text/b;", "", "", "G", "I", "d", "()I", "value", "<init>", "(Ljava/lang/String;II)V", "d0", "b", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public enum b
{
    H(-1), 
    I(0), 
    J(1), 
    K(2), 
    L(3), 
    M(4), 
    N(5), 
    O(6), 
    P(7), 
    Q(8), 
    R(9), 
    S(10), 
    T(11), 
    U(12), 
    V(13), 
    W(14), 
    X(15), 
    Y(16), 
    Z(17), 
    a0(18);
    
    private static final b0 c0;
    @e
    public static final b d0;
    private final int G;
    
    static {
        d0 = new b(null);
        c0 = kotlin.d0.c((a)b$a.G);
    }
    
    private b(final int g) {
        this.G = g;
    }
    
    public static final /* synthetic */ b0 b() {
        return b.c0;
    }
    
    public final int d() {
        return this.G;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R)\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e" }, d2 = { "kotlin/text/b$b", "", "", "directionality", "Lkotlin/text/b;", "b", "", "directionalityMap$delegate", "Lkotlin/b0;", "a", "()Ljava/util/Map;", "directionalityMap", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class b
    {
        private b() {
        }
        
        private final Map<Integer, kotlin.text.b> a() {
            final b0 b = kotlin.text.b.b();
            final b d0 = kotlin.text.b.d0;
            return (Map<Integer, kotlin.text.b>)b.getValue();
        }
        
        @e
        public final kotlin.text.b b(final int n) {
            final kotlin.text.b b = this.a().get(n);
            if (b != null) {
                return b;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Directionality #");
            sb.append(n);
            sb.append(" is not defined.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
