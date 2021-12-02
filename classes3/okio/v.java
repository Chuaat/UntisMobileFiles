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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000f\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0013" }, d2 = { "Lokio/v;", "Lokio/r0;", "Lokio/m;", "sink", "", "byteCount", "read", "Lokio/t0;", "timeout", "Lkotlin/j2;", "close", "", "toString", "-deprecated_delegate", "()Lokio/r0;", "delegate", "Lokio/r0;", "<init>", "(Lokio/r0;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public abstract class v implements r0
{
    @e
    private final r0 delegate;
    
    public v(@e final r0 delegate) {
        k0.p((Object)delegate, "delegate");
        this.delegate = delegate;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "delegate", imports = {}))
    @g(name = "-deprecated_delegate")
    @e
    public final r0 -deprecated_delegate() {
        return this.delegate;
    }
    
    @Override
    public void close() throws IOException {
        this.delegate.close();
    }
    
    @g(name = "delegate")
    @e
    public final r0 delegate() {
        return this.delegate;
    }
    
    @Override
    public long read(@e final m m, final long n) throws IOException {
        k0.p((Object)m, "sink");
        return this.delegate.read(m, n);
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.delegate.timeout();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('(');
        sb.append(this.delegate);
        sb.append(')');
        return sb.toString();
    }
}
