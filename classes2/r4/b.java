// 
// Decompiled by Procyon v0.5.36
// 

package r4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.w2;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f¨\u0006\"" }, d2 = { "Lr4/b;", "Lio/realm/p0;", "", "dateTime", "Ljava/lang/String;", "s8", "()Ljava/lang/String;", "y8", "(Ljava/lang/String;)V", "", "entityId", "J", "t8", "()J", "z8", "(J)V", "text", "x8", "D8", "eventReasonId", "v8", "B8", "", "entityType", "I", "u8", "()I", "A8", "(I)V", "id", "w8", "C8", "<init>", "(JIJLjava/lang/String;Ljava/lang/String;J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements w2
{
    @e
    private long J;
    private int K;
    private long L;
    @org.jetbrains.annotations.e
    private String M;
    @org.jetbrains.annotations.e
    private String N;
    private long O;
    
    public b() {
        this(0L, 0, 0L, null, null, 0L, 63, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n, final int n2, final long n3, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, final long n4) {
        k0.p(s, "dateTime");
        k0.p(s2, "text");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.k(n2);
        this.p(n3);
        this.W6(s);
        this.j(s2);
        this.U0(n4);
    }
    
    public final void A8(final int n) {
        this.k(n);
    }
    
    public final void B8(final long n) {
        this.U0(n);
    }
    
    public final void C8(final long n) {
        this.b(n);
    }
    
    public final void D8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public long Q0() {
        return this.O;
    }
    
    @Override
    public void U0(final long o) {
        this.O = o;
    }
    
    @Override
    public void W6(final String m) {
        this.M = m;
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
    public String d1() {
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
    
    @org.jetbrains.annotations.e
    public final String s8() {
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
    
    @org.jetbrains.annotations.e
    public final String x8() {
        return this.f();
    }
    
    public final void y8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.W6(s);
    }
    
    public final void z8(final long n) {
        this.p(n);
    }
}
