// 
// Decompiled by Procyon v0.5.36
// 

package i4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.i1;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010&\u001a\u00020\u0010\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b/\u00100R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\"\u0010&\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\"\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\b¨\u00061" }, d2 = { "Li4/b;", "Lio/realm/p0;", "", "subject", "J", "z8", "()J", "K8", "(J)V", "", "weekDay", "I", "C8", "()I", "N8", "(I)V", "", "text", "Ljava/lang/String;", "B8", "()Ljava/lang/String;", "M8", "(Ljava/lang/String;)V", "subjectGroup", "A8", "L8", "endTime", "t8", "E8", "endDate", "s8", "D8", "student", "y8", "J8", "startDate", "w8", "H8", "exemptionReason", "u8", "F8", "id", "v8", "G8", "startTime", "x8", "I8", "<init>", "(JJJLjava/lang/String;Ljava/lang/String;JJJJILjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements i1
{
    @e
    private long J;
    private long K;
    private long L;
    @org.jetbrains.annotations.e
    private String M;
    @org.jetbrains.annotations.e
    private String N;
    private long O;
    private long P;
    private long Q;
    private long R;
    private int S;
    @org.jetbrains.annotations.e
    private String T;
    
    public b() {
        this(0L, 0L, 0L, null, null, 0L, 0L, 0L, 0L, 0, null, 2047, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n, final long n2, final long n3, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, final long n4, final long n5, final long n6, final long n7, final int n8, @org.jetbrains.annotations.e final String s3) {
        k0.p(s, "subjectGroup");
        k0.p(s2, "exemptionReason");
        k0.p(s3, "text");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.W0(n2);
        this.R0(n3);
        this.w5(s);
        this.U5(s2);
        this.k6(n4);
        this.D4(n5);
        this.Z4(n6);
        this.T6(n7);
        this.L7(n8);
        this.j(s3);
    }
    
    @org.jetbrains.annotations.e
    public final String A8() {
        return this.a2();
    }
    
    @org.jetbrains.annotations.e
    public final String B8() {
        return this.f();
    }
    
    public final int C8() {
        return this.b3();
    }
    
    @Override
    public void D4(final long p) {
        this.P = p;
    }
    
    public final void D8(final long n) {
        this.D4(n);
    }
    
    @Override
    public long E2() {
        return this.Q;
    }
    
    public final void E8(final long n) {
        this.T6(n);
    }
    
    public final void F8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.U5(s);
    }
    
    public final void G8(final long n) {
        this.b(n);
    }
    
    public final void H8(final long n) {
        this.k6(n);
    }
    
    public final void I8(final long n) {
        this.Z4(n);
    }
    
    @Override
    public long J6() {
        return this.R;
    }
    
    public final void J8(final long n) {
        this.W0(n);
    }
    
    @Override
    public long K() {
        return this.L;
    }
    
    public final void K8(final long n) {
        this.R0(n);
    }
    
    @Override
    public void L7(final int s) {
        this.S = s;
    }
    
    public final void L8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.w5(s);
    }
    
    public final void M8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    public final void N8(final int n) {
        this.L7(n);
    }
    
    @Override
    public void R0(final long l) {
        this.L = l;
    }
    
    @Override
    public void T6(final long r) {
        this.R = r;
    }
    
    @Override
    public void U5(final String n) {
        this.N = n;
    }
    
    @Override
    public void W0(final long k) {
        this.K = k;
    }
    
    @Override
    public void Z4(final long q) {
        this.Q = q;
    }
    
    @Override
    public long a() {
        return this.J;
    }
    
    @Override
    public String a2() {
        return this.M;
    }
    
    @Override
    public void b(final long j) {
        this.J = j;
    }
    
    @Override
    public int b3() {
        return this.S;
    }
    
    @Override
    public long d0() {
        return this.K;
    }
    
    @Override
    public long d6() {
        return this.P;
    }
    
    @Override
    public String f() {
        return this.T;
    }
    
    @Override
    public long f3() {
        return this.O;
    }
    
    @Override
    public String g6() {
        return this.N;
    }
    
    @Override
    public void j(final String t) {
        this.T = t;
    }
    
    @Override
    public void k6(final long o) {
        this.O = o;
    }
    
    public final long s8() {
        return this.d6();
    }
    
    public final long t8() {
        return this.J6();
    }
    
    @org.jetbrains.annotations.e
    public final String u8() {
        return this.g6();
    }
    
    public final long v8() {
        return this.a();
    }
    
    @Override
    public void w5(final String m) {
        this.M = m;
    }
    
    public final long w8() {
        return this.f3();
    }
    
    public final long x8() {
        return this.E2();
    }
    
    public final long y8() {
        return this.d0();
    }
    
    public final long z8() {
        return this.K();
    }
}
