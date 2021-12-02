// 
// Decompiled by Procyon v0.5.36
// 

package k4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import io.realm.w1;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001e" }, d2 = { "Lk4/a;", "Lio/realm/p0;", "", "text", "Ljava/lang/String;", "x8", "()Ljava/lang/String;", "D8", "(Ljava/lang/String;)V", "", "klasseId", "J", "u8", "()J", "A8", "(J)V", "dutyId", "s8", "y8", "start", "v8", "B8", "end", "t8", "z8", "studentId", "w8", "C8", "<init>", "(JJJJJLjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements w1
{
    private long J;
    private long K;
    private long L;
    private long M;
    private long N;
    @e
    private String O;
    
    public a() {
        this(0L, 0L, 0L, 0L, 0L, null, 63, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, final long n2, final long n3, final long n4, final long n5, @e final String s) {
        k0.p(s, "text");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.P(n);
        this.M0(n2);
        this.n3(n3);
        this.h(n4);
        this.i(n5);
        this.j(s);
    }
    
    public final void A8(final long n) {
        this.M0(n);
    }
    
    public final void B8(final long n) {
        this.h(n);
    }
    
    public final void C8(final long n) {
        this.P(n);
    }
    
    public final void D8(@e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public long F1() {
        return this.K;
    }
    
    @Override
    public long J() {
        return this.J;
    }
    
    @Override
    public void M0(final long k) {
        this.K = k;
    }
    
    @Override
    public long N6() {
        return this.L;
    }
    
    @Override
    public void P(final long j) {
        this.J = j;
    }
    
    @Override
    public long c() {
        return this.N;
    }
    
    @Override
    public long d() {
        return this.M;
    }
    
    @Override
    public String f() {
        return this.O;
    }
    
    @Override
    public void h(final long m) {
        this.M = m;
    }
    
    @Override
    public void i(final long n) {
        this.N = n;
    }
    
    @Override
    public void j(final String o) {
        this.O = o;
    }
    
    @Override
    public void n3(final long l) {
        this.L = l;
    }
    
    public final long s8() {
        return this.N6();
    }
    
    public final long t8() {
        return this.c();
    }
    
    public final long u8() {
        return this.F1();
    }
    
    public final long v8() {
        return this.d();
    }
    
    public final long w8() {
        return this.J();
    }
    
    @e
    public final String x8() {
        return this.f();
    }
    
    public final void y8(final long n) {
        this.n3(n);
    }
    
    public final void z8(final long n) {
        this.i(n);
    }
}
