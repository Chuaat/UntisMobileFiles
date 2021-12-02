// 
// Decompiled by Procyon v0.5.36
// 

package p4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.realm.b;
import io.realm.l0;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.o2;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010>\u001a\u00020\n\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010\u001f\u001a\u00020\n\u0012\b\b\u0002\u00108\u001a\u00020\n\u0012\b\b\u0002\u0010,\u001a\u00020\n\u0012\b\b\u0002\u0010)\u001a\u00020\"\u0012\b\b\u0002\u00102\u001a\u00020\"\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010/\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002\u0012\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\bA\u0010BR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\"\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010,\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\f\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0010R\"\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\f\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010R\"\u00102\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R(\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0005\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR\"\u00108\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\f\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010\u0010R(\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0005\u001a\u0004\b<\u0010\u0007\"\u0004\b=\u0010\tR\"\u0010>\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\f\u001a\u0004\b?\u0010\u000e\"\u0004\b@\u0010\u0010¨\u0006C" }, d2 = { "Lp4/a;", "Lio/realm/p0;", "Lio/realm/l0;", "Lp4/b;", "invigilator", "Lio/realm/l0;", "z8", "()Lio/realm/l0;", "O8", "(Lio/realm/l0;)V", "", "key", "J", "A8", "()J", "P8", "(J)V", "", "entityType", "I", "w8", "()I", "L8", "(I)V", "subjectId", "E8", "T8", "Lcom/untis/mobile/persistence/realm/b;", "rooms", "C8", "R8", "start", "D8", "S8", "", "examType", "Ljava/lang/String;", "x8", "()Ljava/lang/String;", "M8", "(Ljava/lang/String;)V", "name", "B8", "Q8", "departmentId", "t8", "I8", "entityId", "v8", "K8", "text", "G8", "V8", "classes", "s8", "H8", "end", "u8", "J8", "teachers", "F8", "U8", "id", "y8", "N8", "<init>", "(JJLjava/lang/String;JJJLjava/lang/String;Ljava/lang/String;IJJLio/realm/l0;Lio/realm/l0;Lio/realm/l0;Lio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements o2
{
    @e
    private long J;
    private long K;
    @org.jetbrains.annotations.e
    private String L;
    private long M;
    private long N;
    private long O;
    @org.jetbrains.annotations.e
    private String P;
    @org.jetbrains.annotations.e
    private String Q;
    private int R;
    private long S;
    private long T;
    @org.jetbrains.annotations.e
    private l0<b> U;
    @org.jetbrains.annotations.e
    private l0<b> V;
    @org.jetbrains.annotations.e
    private l0<b> W;
    @org.jetbrains.annotations.e
    private l0<p4.b> X;
    
    public a() {
        this(0L, 0L, null, 0L, 0L, 0L, null, null, 0, 0L, 0L, null, null, null, null, 32767, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, final long n2, @org.jetbrains.annotations.e final String s, final long n3, final long n4, final long n5, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.e final String s3, final int n6, final long n7, final long n8, @org.jetbrains.annotations.e final l0<b> l0, @org.jetbrains.annotations.e final l0<b> l2, @org.jetbrains.annotations.e final l0<b> l3, @org.jetbrains.annotations.e final l0<p4.b> l4) {
        k0.p(s, "examType");
        k0.p(s2, "name");
        k0.p(s3, "text");
        k0.p(l0, "classes");
        k0.p(l2, "rooms");
        k0.p(l3, "teachers");
        k0.p(l4, "invigilator");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.f0(n);
        this.b(n2);
        this.D7(s);
        this.h(n3);
        this.i(n4);
        this.z5(n5);
        this.e(s2);
        this.j(s3);
        this.k(n6);
        this.p(n7);
        this.u0(n8);
        this.T4(l0);
        this.U(l2);
        this.t0(l3);
        this.s6(l4);
    }
    
    public final long A8() {
        return this.z();
    }
    
    @org.jetbrains.annotations.e
    public final String B8() {
        return this.g();
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> C8() {
        return (l0<b>)this.Z();
    }
    
    @Override
    public void D7(final String l) {
        this.L = l;
    }
    
    public final long D8() {
        return this.d();
    }
    
    public final long E8() {
        return this.a0();
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> F8() {
        return (l0<b>)this.h0();
    }
    
    @Override
    public long G2() {
        return this.O;
    }
    
    @Override
    public l0 G6() {
        return this.U;
    }
    
    @org.jetbrains.annotations.e
    public final String G8() {
        return this.f();
    }
    
    public final void H8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.T4(l0);
    }
    
    public final void I8(final long n) {
        this.z5(n);
    }
    
    public final void J8(final long n) {
        this.i(n);
    }
    
    public final void K8(final long n) {
        this.p(n);
    }
    
    public final void L8(final int n) {
        this.k(n);
    }
    
    @Override
    public String M3() {
        return this.L;
    }
    
    @Override
    public l0 M6() {
        return this.X;
    }
    
    public final void M8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.D7(s);
    }
    
    public final void N8(final long n) {
        this.b(n);
    }
    
    public final void O8(@org.jetbrains.annotations.e final l0<p4.b> l0) {
        k0.p(l0, "<set-?>");
        this.s6(l0);
    }
    
    public final void P8(final long n) {
        this.f0(n);
    }
    
    public final void Q8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e(s);
    }
    
    public final void R8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.U(l0);
    }
    
    public final void S8(final long n) {
        this.h(n);
    }
    
    @Override
    public void T4(final l0 u) {
        this.U = (l0<b>)u;
    }
    
    public final void T8(final long n) {
        this.u0(n);
    }
    
    @Override
    public void U(final l0 v) {
        this.V = (l0<b>)v;
    }
    
    public final void U8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.t0(l0);
    }
    
    public final void V8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public l0 Z() {
        return this.V;
    }
    
    @Override
    public long a() {
        return this.K;
    }
    
    @Override
    public long a0() {
        return this.T;
    }
    
    @Override
    public void b(final long k) {
        this.K = k;
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
    public void e(final String p) {
        this.P = p;
    }
    
    @Override
    public String f() {
        return this.Q;
    }
    
    @Override
    public void f0(final long j) {
        this.J = j;
    }
    
    @Override
    public String g() {
        return this.P;
    }
    
    @Override
    public void h(final long m) {
        this.M = m;
    }
    
    @Override
    public l0 h0() {
        return this.W;
    }
    
    @Override
    public void i(final long n) {
        this.N = n;
    }
    
    @Override
    public void j(final String q) {
        this.Q = q;
    }
    
    @Override
    public void k(final int r) {
        this.R = r;
    }
    
    @Override
    public int l() {
        return this.R;
    }
    
    @Override
    public long o() {
        return this.S;
    }
    
    @Override
    public void p(final long s) {
        this.S = s;
    }
    
    @Override
    public void s6(final l0 x) {
        this.X = (l0<p4.b>)x;
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> s8() {
        return (l0<b>)this.G6();
    }
    
    @Override
    public void t0(final l0 w) {
        this.W = (l0<b>)w;
    }
    
    public final long t8() {
        return this.G2();
    }
    
    @Override
    public void u0(final long t) {
        this.T = t;
    }
    
    public final long u8() {
        return this.c();
    }
    
    public final long v8() {
        return this.o();
    }
    
    public final int w8() {
        return this.l();
    }
    
    @org.jetbrains.annotations.e
    public final String x8() {
        return this.M3();
    }
    
    public final long y8() {
        return this.a();
    }
    
    @Override
    public long z() {
        return this.J;
    }
    
    @Override
    public void z5(final long o) {
        this.O = o;
    }
    
    @org.jetbrains.annotations.e
    public final l0<p4.b> z8() {
        return (l0<p4.b>)this.M6();
    }
}
