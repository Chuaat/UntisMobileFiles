// 
// Decompiled by Procyon v0.5.36
// 

package l4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.a2;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006," }, d2 = { "Ll4/a;", "Lio/realm/p0;", "", "id", "J", "w8", "()J", "E8", "(J)V", "entityId", "t8", "B8", "eventReasonId", "v8", "D8", "periodId", "x8", "F8", "", "synced", "Z", "y8", "()Z", "G8", "(Z)V", "", "text", "Ljava/lang/String;", "z8", "()Ljava/lang/String;", "H8", "(Ljava/lang/String;)V", "dateTime", "s8", "A8", "", "entityType", "I", "u8", "()I", "C8", "(I)V", "<init>", "(JIJJLjava/lang/String;JJZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements a2
{
    @e
    private long J;
    private int K;
    private long L;
    private long M;
    @org.jetbrains.annotations.e
    private String N;
    private long O;
    private long P;
    private boolean Q;
    
    public a() {
        this(0L, 0, 0L, 0L, null, 0L, 0L, false, 255, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, final int n2, final long n3, final long n4, @org.jetbrains.annotations.e final String s, final long n5, final long n6, final boolean b) {
        k0.p(s, "text");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.k(n2);
        this.p(n3);
        this.Q5(n4);
        this.j(s);
        this.U0(n5);
        this.y(n6);
        this.F(b);
    }
    
    @Override
    public boolean A() {
        return this.Q;
    }
    
    public final void A8(final long n) {
        this.Q5(n);
    }
    
    public final void B8(final long n) {
        this.p(n);
    }
    
    public final void C8(final int n) {
        this.k(n);
    }
    
    @Override
    public long D() {
        return this.P;
    }
    
    public final void D8(final long n) {
        this.U0(n);
    }
    
    public final void E8(final long n) {
        this.b(n);
    }
    
    @Override
    public void F(final boolean q) {
        this.Q = q;
    }
    
    public final void F8(final long n) {
        this.y(n);
    }
    
    public final void G8(final boolean b) {
        this.F(b);
    }
    
    public final void H8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public long Q0() {
        return this.O;
    }
    
    @Override
    public void Q5(final long m) {
        this.M = m;
    }
    
    @Override
    public void U0(final long o) {
        this.O = o;
    }
    
    @Override
    public long a() {
        return this.J;
    }
    
    @Override
    public void b(final long j) {
        this.J = j;
    }
    
    @Override
    public long d1() {
        return this.M;
    }
    
    @Override
    public String f() {
        return this.N;
    }
    
    @Override
    public void j(final String n) {
        this.N = n;
    }
    
    @Override
    public void k(final int k) {
        this.K = k;
    }
    
    @Override
    public int l() {
        return this.K;
    }
    
    @Override
    public long o() {
        return this.L;
    }
    
    @Override
    public void p(final long l) {
        this.L = l;
    }
    
    public final long s8() {
        return this.d1();
    }
    
    public final long t8() {
        return this.o();
    }
    
    public final int u8() {
        return this.l();
    }
    
    public final long v8() {
        return this.Q0();
    }
    
    public final long w8() {
        return this.a();
    }
    
    public final long x8() {
        return this.D();
    }
    
    @Override
    public void y(final long p) {
        this.P = p;
    }
    
    public final boolean y8() {
        return this.A();
    }
    
    @org.jetbrains.annotations.e
    public final String z8() {
        return this.f();
    }
}
