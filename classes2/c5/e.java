// 
// Decompiled by Procyon v0.5.36
// 

package c5;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import kotlin.Metadata;
import io.realm.e6;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b5\u00106R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR(\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067" }, d2 = { "Lc5/e;", "Lio/realm/p0;", "", "date", "J", "s8", "()J", "C8", "(J)V", "lastRequestTimestamp", "x8", "H8", "", "preLoadedPeriodData", "Z", "A8", "()Z", "K8", "(Z)V", "entityId", "t8", "D8", "Lio/realm/l0;", "Lc5/c;", "periods", "Lio/realm/l0;", "y8", "()Lio/realm/l0;", "I8", "(Lio/realm/l0;)V", "", "id", "Ljava/lang/String;", "w8", "()Ljava/lang/String;", "G8", "(Ljava/lang/String;)V", "holiday", "v8", "F8", "timestamp", "B8", "L8", "periodsWithOutCancelled", "z8", "J8", "", "entityType", "I", "u8", "()I", "E8", "(I)V", "<init>", "(IJJJLio/realm/l0;Lio/realm/l0;JZJLjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class e extends p0 implements e6
{
    private int J;
    private long K;
    private long L;
    private long M;
    @org.jetbrains.annotations.e
    private l0<c> N;
    @org.jetbrains.annotations.e
    private l0<c> O;
    private long P;
    private boolean Q;
    private long R;
    @io.realm.annotations.e
    @org.jetbrains.annotations.e
    private String S;
    
    public e() {
        this(0, 0L, 0L, 0L, null, null, 0L, false, 0L, null, 1023, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public e(final int n, final long n2, final long n3, final long n4, @org.jetbrains.annotations.e final l0<c> l0, @org.jetbrains.annotations.e final l0<c> l2, final long n5, final boolean b, final long n6, @org.jetbrains.annotations.e final String s) {
        k0.p(l0, "periods");
        k0.p(l2, "periodsWithOutCancelled");
        k0.p(s, "id");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.k(n);
        this.p(n2);
        this.W(n3);
        this.s0(n4);
        this.c1(l0);
        this.M5(l2);
        this.A2(n5);
        this.d4(b);
        this.W3(n6);
        this.D1(s);
    }
    
    @Override
    public void A2(final long p) {
        this.P = p;
    }
    
    public final boolean A8() {
        return this.T2();
    }
    
    public final long B8() {
        return this.b0();
    }
    
    public final void C8(final long n) {
        this.W(n);
    }
    
    @Override
    public void D1(final String s) {
        this.S = s;
    }
    
    public final void D8(final long n) {
        this.p(n);
    }
    
    public final void E8(final int n) {
        this.k(n);
    }
    
    public final void F8(final long n) {
        this.A2(n);
    }
    
    public final void G8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.D1(s);
    }
    
    @Override
    public long H() {
        return this.L;
    }
    
    public final void H8(final long n) {
        this.W3(n);
    }
    
    public final void I8(@org.jetbrains.annotations.e final l0<c> l0) {
        k0.p(l0, "<set-?>");
        this.c1(l0);
    }
    
    @Override
    public l0 J0() {
        return this.N;
    }
    
    public final void J8(@org.jetbrains.annotations.e final l0<c> l0) {
        k0.p(l0, "<set-?>");
        this.M5(l0);
    }
    
    public final void K8(final boolean b) {
        this.d4(b);
    }
    
    public final void L8(final long n) {
        this.s0(n);
    }
    
    @Override
    public void M5(final l0 o) {
        this.O = (l0<c>)o;
    }
    
    @Override
    public boolean T2() {
        return this.Q;
    }
    
    @Override
    public void W(final long l) {
        this.L = l;
    }
    
    @Override
    public void W3(final long r) {
        this.R = r;
    }
    
    @Override
    public String a() {
        return this.S;
    }
    
    @Override
    public long b0() {
        return this.M;
    }
    
    @Override
    public void c1(final l0 n) {
        this.N = (l0<c>)n;
    }
    
    @Override
    public void d4(final boolean q) {
        this.Q = q;
    }
    
    @Override
    public l0 d5() {
        return this.O;
    }
    
    @Override
    public long f7() {
        return this.R;
    }
    
    @Override
    public long j7() {
        return this.P;
    }
    
    @Override
    public void k(final int j) {
        this.J = j;
    }
    
    @Override
    public int l() {
        return this.J;
    }
    
    @Override
    public long o() {
        return this.K;
    }
    
    @Override
    public void p(final long k) {
        this.K = k;
    }
    
    @Override
    public void s0(final long m) {
        this.M = m;
    }
    
    public final long s8() {
        return this.H();
    }
    
    public final long t8() {
        return this.o();
    }
    
    public final int u8() {
        return this.l();
    }
    
    public final long v8() {
        return this.j7();
    }
    
    @org.jetbrains.annotations.e
    public final String w8() {
        return this.a();
    }
    
    public final long x8() {
        return this.f7();
    }
    
    @org.jetbrains.annotations.e
    public final l0<c> y8() {
        return (l0<c>)this.J0();
    }
    
    @org.jetbrains.annotations.e
    public final l0<c> z8() {
        return (l0<c>)this.d5();
    }
}
