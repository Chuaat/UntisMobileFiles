// 
// Decompiled by Procyon v0.5.36
// 

package p4;

import io.realm.internal.p;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import io.realm.q2;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0011" }, d2 = { "Lp4/b;", "Lio/realm/p0;", "", "end", "J", "s8", "()J", "v8", "(J)V", "start", "t8", "w8", "teacherId", "u8", "x8", "<init>", "(JJJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements q2
{
    private long J;
    private long K;
    private long L;
    
    public b() {
        this(0L, 0L, 0L, 7, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n, final long n2, final long n3) {
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.Y(n);
        this.h(n2);
        this.i(n3);
    }
    
    @Override
    public void Y(final long j) {
        this.J = j;
    }
    
    @Override
    public long c() {
        return this.L;
    }
    
    @Override
    public long d() {
        return this.K;
    }
    
    @Override
    public void h(final long k) {
        this.K = k;
    }
    
    @Override
    public void i(final long l) {
        this.L = l;
    }
    
    public final long s8() {
        return this.c();
    }
    
    public final long t8() {
        return this.d();
    }
    
    public final long u8() {
        return this.y0();
    }
    
    public final void v8(final long n) {
        this.i(n);
    }
    
    public final void w8(final long n) {
        this.h(n);
    }
    
    public final void x8(final long n) {
        this.Y(n);
    }
    
    @Override
    public long y0() {
        return this.J;
    }
}
