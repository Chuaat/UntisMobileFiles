// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.cache;

import okio.m;
import kotlin.jvm.internal.k0;
import okio.p0;
import kotlin.j2;
import java.io.IOException;
import n6.l;
import kotlin.Metadata;
import okio.u;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R%\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018" }, d2 = { "Lokhttp3/internal/cache/e;", "Lokio/u;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/j2;", "t3", "flush", "close", "Lkotlin/Function1;", "Ljava/io/IOException;", "onException", "Ln6/l;", "c", "()Ln6/l;", "", "H", "Z", "hasErrors", "Lokio/p0;", "delegate", "<init>", "(Lokio/p0;Ln6/l;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public class e extends u
{
    private boolean H;
    @org.jetbrains.annotations.e
    private final l<IOException, j2> I;
    
    public e(@org.jetbrains.annotations.e final p0 p2, @org.jetbrains.annotations.e final l<? super IOException, j2> i) {
        k0.p((Object)p2, "delegate");
        k0.p((Object)i, "onException");
        super(p2);
        this.I = (l<IOException, j2>)i;
    }
    
    @org.jetbrains.annotations.e
    public final l<IOException, j2> c() {
        return this.I;
    }
    
    @Override
    public void close() {
        if (this.H) {
            return;
        }
        try {
            super.close();
        }
        catch (IOException ex) {
            this.H = true;
            this.I.invoke((Object)ex);
        }
    }
    
    @Override
    public void flush() {
        if (this.H) {
            return;
        }
        try {
            super.flush();
        }
        catch (IOException ex) {
            this.H = true;
            this.I.invoke((Object)ex);
        }
    }
    
    @Override
    public void t3(@org.jetbrains.annotations.e final m m, final long n) {
        k0.p((Object)m, "source");
        if (this.H) {
            m.skip(n);
            return;
        }
        try {
            super.t3(m, n);
        }
        catch (IOException ex) {
            this.H = true;
            this.I.invoke((Object)ex);
        }
    }
}
