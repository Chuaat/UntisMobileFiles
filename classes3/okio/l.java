// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\u000e" }, d2 = { "Lokio/l;", "Lokio/p0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/j2;", "t3", "flush", "Lokio/t0;", "timeout", "close", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
final class l implements p0
{
    public l() {
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void t3(@e final m m, final long n) {
        k0.p((Object)m, "source");
        m.skip(n);
    }
    
    @e
    @Override
    public t0 timeout() {
        return t0.d;
    }
}
