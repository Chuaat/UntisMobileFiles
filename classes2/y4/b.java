// 
// Decompiled by Procyon v0.5.36
// 

package y4;

import io.realm.internal.p;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import io.realm.s4;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0015" }, d2 = { "Ly4/b;", "Lio/realm/p0;", "", "start", "J", "t8", "()J", "w8", "(J)V", "", "state", "I", "u8", "()I", "x8", "(I)V", "end", "s8", "v8", "<init>", "(JJI)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements s4
{
    private long J;
    private long K;
    private int L;
    
    public b() {
        this(0L, 0L, 0, 7, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n, final long n2, final int n3) {
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.h(n);
        this.i(n2);
        this.D0(n3);
    }
    
    @Override
    public void D0(final int l) {
        this.L = l;
    }
    
    @Override
    public int E1() {
        return this.L;
    }
    
    @Override
    public long c() {
        return this.K;
    }
    
    @Override
    public long d() {
        return this.J;
    }
    
    @Override
    public void h(final long j) {
        this.J = j;
    }
    
    @Override
    public void i(final long k) {
        this.K = k;
    }
    
    public final long s8() {
        return this.c();
    }
    
    public final long t8() {
        return this.d();
    }
    
    public final int u8() {
        return this.E1();
    }
    
    public final void v8(final long n) {
        this.i(n);
    }
    
    public final void w8(final long n) {
        this.h(n);
    }
    
    public final void x8(final int n) {
        this.D0(n);
    }
}
