// 
// Decompiled by Procyon v0.5.36
// 

package i4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.b;
import io.realm.l0;
import kotlin.Metadata;
import io.realm.k1;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u0006)" }, d2 = { "Li4/c;", "Lio/realm/p0;", "", "parallelPeriodId", "J", "t8", "()J", "B8", "(J)V", "", "type", "I", "z8", "()I", "H8", "(I)V", "Lio/realm/l0;", "Lcom/untis/mobile/persistence/realm/b;", "teachers", "Lio/realm/l0;", "y8", "()Lio/realm/l0;", "G8", "(Lio/realm/l0;)V", "subject", "x8", "F8", "student", "w8", "E8", "klassen", "s8", "A8", "rooms", "v8", "D8", "periodId", "u8", "C8", "<init>", "(JJJIJLio/realm/l0;Lio/realm/l0;Lio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class c extends p0 implements k1
{
    private long J;
    private long K;
    private long L;
    private int M;
    private long N;
    @e
    private l0<b> O;
    @e
    private l0<b> P;
    @e
    private l0<b> Q;
    
    public c() {
        this(0L, 0L, 0L, 0, 0L, null, null, null, 255, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public c(final long n, final long n2, final long n3, final int n4, final long n5, @e final l0<b> l0, @e final l0<b> l2, @e final l0<b> l3) {
        k0.p(l0, "teachers");
        k0.p(l2, "klassen");
        k0.p(l3, "rooms");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.W0(n);
        this.y(n2);
        this.O6(n3);
        this.q0(n4);
        this.R0(n5);
        this.t0(l0);
        this.n1(l2);
        this.U(l3);
    }
    
    public final void A8(@e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.n1(l0);
    }
    
    public final void B8(final long n) {
        this.O6(n);
    }
    
    public final void C8(final long n) {
        this.y(n);
    }
    
    @Override
    public long D() {
        return this.K;
    }
    
    public final void D8(@e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.U(l0);
    }
    
    public final void E8(final long n) {
        this.W0(n);
    }
    
    public final void F8(final long n) {
        this.R0(n);
    }
    
    public final void G8(@e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.t0(l0);
    }
    
    public final void H8(final int n) {
        this.q0(n);
    }
    
    @Override
    public long K() {
        return this.N;
    }
    
    @Override
    public void O6(final long l) {
        this.L = l;
    }
    
    @Override
    public long Q2() {
        return this.L;
    }
    
    @Override
    public void R0(final long n) {
        this.N = n;
    }
    
    @Override
    public void U(final l0 q) {
        this.Q = (l0<b>)q;
    }
    
    @Override
    public void W0(final long j) {
        this.J = j;
    }
    
    @Override
    public l0 Z() {
        return this.Q;
    }
    
    @Override
    public l0 a1() {
        return this.P;
    }
    
    @Override
    public long d0() {
        return this.J;
    }
    
    @Override
    public l0 h0() {
        return this.O;
    }
    
    @Override
    public int m0() {
        return this.M;
    }
    
    @Override
    public void n1(final l0 p) {
        this.P = (l0<b>)p;
    }
    
    @Override
    public void q0(final int m) {
        this.M = m;
    }
    
    @e
    public final l0<b> s8() {
        return (l0<b>)this.a1();
    }
    
    @Override
    public void t0(final l0 o) {
        this.O = (l0<b>)o;
    }
    
    public final long t8() {
        return this.Q2();
    }
    
    public final long u8() {
        return this.D();
    }
    
    @e
    public final l0<b> v8() {
        return (l0<b>)this.Z();
    }
    
    public final long w8() {
        return this.d0();
    }
    
    public final long x8() {
        return this.K();
    }
    
    @Override
    public void y(final long k) {
        this.K = k;
    }
    
    @e
    public final l0<b> y8() {
        return (l0<b>)this.h0();
    }
    
    public final int z8() {
        return this.m0();
    }
}
