// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http;

import okhttp3.y;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import okio.o;
import kotlin.Metadata;
import okhttp3.h0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "Lokhttp3/internal/http/h;", "Lokhttp3/h0;", "", "contentLength", "Lokhttp3/y;", "contentType", "Lokio/o;", "source", "H", "J", "I", "Lokio/o;", "", "G", "Ljava/lang/String;", "contentTypeString", "<init>", "(Ljava/lang/String;JLokio/o;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class h extends h0
{
    private final String G;
    private final long H;
    private final o I;
    
    public h(@f final String g, final long h, @e final o i) {
        k0.p((Object)i, "source");
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public long contentLength() {
        return this.H;
    }
    
    @f
    @Override
    public y contentType() {
        final String g = this.G;
        y d;
        if (g != null) {
            d = y.i.d(g);
        }
        else {
            d = null;
        }
        return d;
    }
    
    @e
    @Override
    public o source() {
        return this.I;
    }
}
