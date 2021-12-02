// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.IOException;
import m6.g;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u000e\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016" }, d2 = { "Lokio/u;", "Lokio/p0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/j2;", "t3", "flush", "Lokio/t0;", "timeout", "close", "", "toString", "a", "()Lokio/p0;", "G", "Lokio/p0;", "b", "delegate", "<init>", "(Lokio/p0;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public abstract class u implements p0
{
    @e
    private final p0 G;
    
    public u(@e final p0 g) {
        k0.p((Object)g, "delegate");
        this.G = g;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "delegate", imports = {}))
    @g(name = "-deprecated_delegate")
    @e
    public final p0 a() {
        return this.G;
    }
    
    @g(name = "delegate")
    @e
    public final p0 b() {
        return this.G;
    }
    
    @Override
    public void close() throws IOException {
        this.G.close();
    }
    
    @Override
    public void flush() throws IOException {
        this.G.flush();
    }
    
    @Override
    public void t3(@e final m m, final long n) throws IOException {
        k0.p((Object)m, "source");
        this.G.t3(m, n);
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.G.timeout();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('(');
        sb.append(this.G);
        sb.append(')');
        return sb.toString();
    }
}
