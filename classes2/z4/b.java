// 
// Decompiled by Procyon v0.5.36
// 

package z4;

import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.k5;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b¨\u0006," }, d2 = { "Lz4/b;", "Lio/realm/p0;", "", "absenceCheckRequired", "Z", "s8", "()Z", "A8", "(Z)V", "", "id", "J", "x8", "()J", "F8", "(J)V", "defaultLatenessReasonId", "w8", "E8", "defaultAbsenceReasonId", "v8", "D8", "showAbsenceReason", "y8", "G8", "", "defaultAbsenceEndTimeType", "I", "u8", "()I", "C8", "(I)V", "", "customAbsenceEndTime", "Ljava/lang/String;", "t8", "()Ljava/lang/String;", "B8", "(Ljava/lang/String;)V", "showAbsenceText", "z8", "H8", "<init>", "(JZZZJJILjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements k5
{
    @e
    private long J;
    private boolean K;
    private boolean L;
    private boolean M;
    private long N;
    private long O;
    private int P;
    @f
    private String Q;
    
    public b() {
        this(0L, false, false, false, 0L, 0L, 0, null, 255, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n, final boolean b, final boolean b2, final boolean b3, final long n2, final long n3, final int n4, @f final String s) {
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.k7(b);
        this.M4(b2);
        this.X6(b3);
        this.b5(n2);
        this.n7(n3);
        this.q2(n4);
        this.V1(s);
    }
    
    public final void A8(final boolean b) {
        this.X6(b);
    }
    
    public final void B8(@f final String s) {
        this.V1(s);
    }
    
    public final void C8(final int n) {
        this.q2(n);
    }
    
    @Override
    public boolean D5() {
        return this.M;
    }
    
    public final void D8(final long n) {
        this.b5(n);
    }
    
    public final void E8(final long n) {
        this.n7(n);
    }
    
    public final void F8(final long n) {
        this.b(n);
    }
    
    public final void G8(final boolean b) {
        this.k7(b);
    }
    
    public final void H8(final boolean b) {
        this.M4(b);
    }
    
    @Override
    public void M4(final boolean l) {
        this.L = l;
    }
    
    @Override
    public String P1() {
        return this.Q;
    }
    
    @Override
    public void V1(final String q) {
        this.Q = q;
    }
    
    @Override
    public long W1() {
        return this.O;
    }
    
    @Override
    public void X6(final boolean m) {
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
    public void b5(final long n) {
        this.N = n;
    }
    
    @Override
    public boolean b6() {
        return this.L;
    }
    
    @Override
    public void k7(final boolean k) {
        this.K = k;
    }
    
    @Override
    public long m5() {
        return this.N;
    }
    
    @Override
    public void n7(final long o) {
        this.O = o;
    }
    
    @Override
    public void q2(final int p) {
        this.P = p;
    }
    
    public final boolean s8() {
        return this.D5();
    }
    
    @f
    public final String t8() {
        return this.P1();
    }
    
    public final int u8() {
        return this.z3();
    }
    
    @Override
    public boolean v2() {
        return this.K;
    }
    
    public final long v8() {
        return this.m5();
    }
    
    public final long w8() {
        return this.W1();
    }
    
    public final long x8() {
        return this.a();
    }
    
    public final boolean y8() {
        return this.v2();
    }
    
    @Override
    public int z3() {
        return this.P;
    }
    
    public final boolean z8() {
        return this.b6();
    }
}
